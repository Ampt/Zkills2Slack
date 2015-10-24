/**
 * Created by Ampt on 10/22/2015.
 */

package core;

import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.http.UrlEncodedContent;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.util.Maps;
import com.google.gson.*;
import com.sun.deploy.util.StringUtils;
import jdk.nashorn.internal.parser.JSONParser;
import com.google.api.client.http.HttpRequestFactory;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.*;

public class ZKills2Slack {

    static String MB_NKE = "30001182";
    static String WLAR_J = "30001173";
    static String JBY6_F = "30001185";
    static String Six_MM99 = "30001184";
    static String FZ_6A5 = "30001186";
    static String RNF_YH = "30001187";

    static String THE_POCKET;

    static String newestFirst = "orderDirection/desc/";
    static String URLBase = "https://zkillboard.com/api/";
    static String solarSystem = "solarSystemID/";

    private static final HttpTransport HTTP_TRANSPORT = new NetHttpTransport();
    private static final HttpRequestFactory requestFactory = HTTP_TRANSPORT.createRequestFactory();

    private static void setup() {
        ArrayList<String> ALL_SYSTEMS = new ArrayList<>(Arrays.asList(MB_NKE, WLAR_J, JBY6_F, Six_MM99, FZ_6A5, RNF_YH));

        StringJoiner joiner = new StringJoiner(",");
        ALL_SYSTEMS.forEach((system) -> joiner.add(system));
        THE_POCKET = joiner.toString() + "/";

    }


    public static void main(String[] args) {
        setup();
        Gson g = new Gson();

        try {
            URL url = new URL(URLBase + newestFirst + "/limit/50/"+ solarSystem + THE_POCKET);
            URLConnection yc = url.openConnection();
            BufferedReader in = new BufferedReader(new InputStreamReader(yc.getInputStream()));
            String inputLine;
            ArrayList<KillReport> killList = new ArrayList<>();
            while ((inputLine = in.readLine()) != null) {
                KillReport[] kills = g.fromJson(inputLine, KillReport[].class);
                killList = new ArrayList<>(Arrays.asList(kills));
                for(KillReport k: killList) {
                    Map<String, Object> payload = new HashMap<String, Object>();
                    String value = Util.format((long)k.getZkb().getTotalValue());
                    payload.put("text", "<https://zkillboard.com/kill/" + k.getKillID() + "/|" + k.getAttacker().getCharacterName() + " (" + k.getAttacker().getAllianceName() + ") killed " + k.getVictim().getCharacterName() + " (" + k.getVictim().getAllianceName() + ") for " + value + " isk.>");
                    String jsonEncodedMessage = new Gson().toJson(payload);
                    HashMap<Object, Object> payloadToSend = Maps.newHashMap();
                    payloadToSend.put("payload", jsonEncodedMessage);
                    requestFactory.buildPostRequest(new GenericUrl("https://hooks.slack.com/services/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"), new UrlEncodedContent(payloadToSend)).execute();
                }
                Gson gson = new GsonBuilder().setPrettyPrinting().create();
                JsonParser jp = new JsonParser();
                JsonElement je = jp.parse(inputLine);
                String prettyJsonString = gson.toJson(je);
                System.out.println(prettyJsonString);

            }
            in.close();


        } catch (Exception e) {
            e.printStackTrace();
        }


    }

}
