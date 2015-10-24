package core;

/**
 * Created by Matthew on 10/23/2015.
 */
public class Attacker {
    private int characterID;
    private String characterName;
    private int corporationID;
    private String corporationName;
    private int allianceID;
    private String allianceName;
    private int factionID;
    private String factionName;
    private double securityStatus;
    private int damageDone;
    private int finalBlow;
    private int weaponTypeID;
    private int shipTypeID;

    public Attacker(int characterID, String characterName, int corporationID, String corporationName, int allianceID, String allianceName, int factionID, String factionName, double securityStatus, int damageDone, int finalBlow, int weaponTypeID, int shipTypeID) {
        this.characterID = characterID;
        this.characterName = characterName;
        this.corporationID = corporationID;
        this.corporationName = corporationName;
        this.allianceID = allianceID;
        this.allianceName = allianceName;
        this.factionID = factionID;
        this.factionName = factionName;
        this.securityStatus = securityStatus;
        this.damageDone = damageDone;
        this.finalBlow = finalBlow;
        this.weaponTypeID = weaponTypeID;
        this.shipTypeID = shipTypeID;
    }

    public String getCharacterName() {
        return characterName;
    }

    public String getAllianceName() {
        return allianceName;
    }
}
