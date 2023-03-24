import java.util.ArrayList;

public class Command {
    private ArrayList<PhysicalDrive> drives;
    private ArrayList<PhysicalVolume> pVs;
    private ArrayList<VolumeGroup> vGs;

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
            if (pVs.get(0).getName().equals(name)) {
                isInstalled = true;
            }
        }
        if (isInstalled) return "Error, that physical volume already exists!";
        else {
            PhysicalVolume newPV = new PhysicalVolume(name, d);
            pVs.add(newPV);
            return name + " installed";
        }
    }

    public void listPVs() {
        for (int i = 0; i < pVs.size(); i++)
            System.out.println(pVs.get(i).getName() + ": " + "[" + pVs.get(i).getSize() + "] " + "[" + pVs.get(i).getUuid() + "]");
    }

    public String createVG(String name, PhysicalVolume v) {
        boolean isInstalled = false;
        for (int i = 0; i < vGs.size(); i++) {
            if (vGs.get(0).getName().equals(name)) {
                isInstalled = true;
            }
        }
        if (isInstalled) return "Error, that volume group already exists!";
        else {
            VolumeGroup newVG = new VolumeGroup(name, v);
            vGs.add(newVG);
            return name + " installed";
        }
    }

    public void listVGs() {
        for (int i = 0; i < vGs.size(); i++)
            System.out.println(vGs.get(i).getName() + ": " + "[" + vGs.get(i).getSize() + "] " + "[" + vGs.get(i).getUuid() + "]");
    }

    public String extendVG(VolumeGroup vg, PhysicalVolume pv) {
        boolean isExtended = false;
        if (vg.getpVs().contains(pv)) {
            return "Error, that volume group already contains " + pv.getName();
        } else {
            vg.getpVs().add()
        }
    }
}