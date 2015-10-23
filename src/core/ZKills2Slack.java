/**
 * Created by Ampt on 10/22/2015.
 */

package core;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class ZKills2Slack {

    static String MB_NKE = "30001182/";
    static String WLAR_J = "30001173/";
    static String JBY6_F = "30001185/";
    static String Six_MM99 = "30001184/";
    static String FZ_6A5 = "30001186/";
    static String RNF_YH = "30001187/";

    static String newestFirst = "orderDirection/desc/";
    static String URLBase = "https://zkillboard.com/api/";
    static String solarSystem = "solarSystemID/";



    public static void main(String[] args) {

        try {
            URL url = new URL(URLBase + newestFirst + solarSystem + MB_NKE);
            URLConnection yc = url.openConnection();
            BufferedReader in = new BufferedReader(new InputStreamReader(
                    yc.getInputStream()));
            String inputLine;
            while ((inputLine = in.readLine()) != null)
                System.out.println(inputLine);
            in.close();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

}
