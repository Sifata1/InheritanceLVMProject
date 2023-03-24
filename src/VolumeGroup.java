import java.util.ArrayList;

public class VolumeGroup extends LVM {
    private ArrayList<PhysicalVolume> pVs;
    private ArrayList<LogicalVolume> lVs;
    private int size;
    private String id;
    private PhysicalVolume pv;

    public int getSize() {
        return size;
    }

    public String getId() {
        return id;
    }

    public ArrayList<PhysicalVolume> getpVs() {
        return pVs;
    }

    public VolumeGroup(String name, PhysicalVolume v) {
        super(name);
        this.size = v.getSize();
        id = getUuid();
        this.pv = v;
        pVs.add(v);
    }
}
