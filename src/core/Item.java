package core;

/**
 * Created by Matthew on 10/23/2015.
 */
public class Item {
    private int typeID;
    private int flag;
    private int qtyDropped;
    private int qtyDestroyed;
    private int singleton;

    public Item(int typeID, int flag, int qtyDropped, int qtyDestroyed, int singleton) {
        this.typeID = typeID;
        this.flag = flag;
        this.qtyDropped = qtyDropped;
        this.qtyDestroyed = qtyDestroyed;
        this.singleton = singleton;
    }
}
