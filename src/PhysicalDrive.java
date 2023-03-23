public class PhysicalDrive extends LVM {
    public String getId() {
        return id;
    }

    private int size;
    private String id;

    public int getSize() {
        return size;
    }

    public PhysicalDrive(String name, int size) {
        super(name);
        this.size = size;
        id = getUuid();
    }




}
