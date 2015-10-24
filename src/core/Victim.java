package core;

/**
 * Created by Matthew on 10/23/2015.
 */
public class Victim {
    private int characterID;
    private String characterName;
    private int corporationID;
    private String corporationName;
    private int allianceID;
    private String allianceName;
    private int factionID;
    private String factionName;
    private int damageTaken;
    private int shipTypeID;

    public Victim(int characterID, String characterName, int corporationID, String corporationName, int allianceID, String allianceName, int factionID, String factionName, int damageTaken, int shipTypeID) {
        this.characterID = characterID;
        this.characterName = characterName;
        this.corporationID = corporationID;
        this.corporationName = corporationName;
        this.allianceID = allianceID;
        this.allianceName = allianceName;
        this.factionID = factionID;
        this.factionName = factionName;
        this.damageTaken = damageTaken;
        this.shipTypeID = shipTypeID;
    }

    public String getCharacterName() {
        return characterName;
    }

    public int getShipTypeID() {
        return shipTypeID;
    }

    public String getAllianceName() {
        return allianceName;
    }
}