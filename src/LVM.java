import java.util.UUID;

public class LVM {
    private String name;
    private String uuid;

    public String getName() {
        return name;
    }

    public LVM(String name) {
        UUID u = UUID.randomUUID();
        this.name = name;
        uuid = String.valueOf(u.randomUUID());
    }

    public String getUuid() {
        return uuid;
    }
}
