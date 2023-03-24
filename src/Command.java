import java.util.ArrayList;

public class Command {
    private ArrayList<PhysicalDrive> drives;
    private ArrayList<PhysicalVolume> pVs;

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


    public String createPV(String name, PhysicalDrive d) {
        boolean isInstalled = false;
        for (int i = 0; i < pVs.size(); i++) {
            if (drives.get(0).getName().equals(name)) {
                isInstalled = true;
            }
        }
        if (isInstalled) return "Error, that physical volume already exists!";
        else {
            PhysicalVolume newPV = new PhysicalVolume(name, d);
            pVs.add(newPV);
            return name + "installed";
        }
    }

    public void listPVs() {
        for (int i = 0; i < pVs.size(); i++) System.out.println(pVs.get(i).getName() + ": " + "[" + pVs.get(i).getSize() + "] " + "[" + pVs.get(i).getUuid() + "]");
    }


}
