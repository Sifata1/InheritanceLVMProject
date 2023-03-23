import java.util.ArrayList;

public class VolumeGroup extends LVM {
    private ArrayList<PhysicalVolume> pVs;
    private ArrayList<LogicalVolume> lVs;

    public VolumeGroup(String name) {
        super(name);
    }
}
