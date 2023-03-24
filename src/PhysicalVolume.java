public class PhysicalVolume extends LVM{
    private int size;
    private String id;
    private PhysicalDrive drive;

    public int getSize() {
        return size;
    }

    public String getId() {
        return id;
    }

    public PhysicalVolume(String name, PhysicalDrive drive) {
        super(name);
        this.size = drive.getSize();
        id = getUuid();
        this.drive = drive;
    }
}
