package core;

import java.util.List;

/**
 * Created by Matthew on 10/23/2015.
 */
public class KillReport {

    private int killID;
    private int solarSystemID;
    private String killTime;
    private int moonID;
    private Victim victim;
    private List<Attacker> attackers;
    private List<Item> items;
    private ZKB zkb;

    public KillReport(int killID, int solarSystemID, String killTime, int moonID, Victim victim, List<Attacker> attackers, List<Item> items, ZKB zkb) {
        this.killID = killID;
        this.solarSystemID = solarSystemID;
        this.killTime = killTime;
        this.moonID = moonID;
        this.victim = victim;
        this.attackers = attackers;
        this.items = items;
        this.zkb = zkb;
    }

    public int getKillID() {
        return killID;
    }

    public Victim getVictim() {
        return victim;
    }

    public Attacker getAttacker() {
        return attackers.get(0);
    }

    public ZKB getZkb() {
        return zkb;
    }
}
