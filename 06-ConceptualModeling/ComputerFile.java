public class ComputerFile {
    private String name;
    private int size;

    public ComputerFile(String name, int size, boolean isHidden) {
        this.name = name;
        this.size = size;
        this.isHidden = isHidden;
    }

    private boolean isHidden;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean isHidden() {
        return isHidden;
    }

    public void setHidden(boolean isHidden) {
        this.isHidden = isHidden;
    }
}
