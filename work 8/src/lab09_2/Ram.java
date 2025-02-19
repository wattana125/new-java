package lab09_2;

public class Ram {
    private int sizeInKB;

    public Ram(int sizeInKB) {
        this.sizeInKB = sizeInKB;
    }

    public int getSizeInKB() {
        return sizeInKB;
    }

    public void setSizeInKB(int newsizeInKB) {
        this.sizeInKB = newsizeInKB;
    }

    public int getSizeInGB() {
        return sizeInKB / 1024;
    }

    public String toString() {
        return "ram: " + sizeInKB + "KB(" + getSizeInGB() + "GB)";
    }
}
