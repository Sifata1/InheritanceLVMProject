import java.util.ArrayList;

public class Command {
    private ArrayList<PhysicalDrive> drives;

    public String installDrive(String name, int size) {
        boolean isInstalled = false;
        for (int i = 0; i < drives.size(); i++) {
            if (drives.get(0).getName().equals(name)) {
                isInstalled = true;
            }
        }
        if (isInstalled) {
            return "Error, that hard drive already exists!";
        } else {
            PhysicalDrive newPD = new PhysicalDrive(name, size);
            drives.add(newPD);
            return "Drive " + name + "installed";
        }
    }

    public void listDrives() {
        for (int i = 0; i < drives.size(); i++) {
            System.out.println(drives.get(i).getName() + "[" + drives.get(i).getSize() + "]" + "[" + drives.get(i).getUuid() + "]");
        }
    }


}
