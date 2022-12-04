public class File {
    private String fileName;
    private double size;
    private String type;

    public String getfileName() {
        return fileName;
    }

    public void setfileName(String fileName) {
        this.fileName = fileName;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public File(String fileName, String type) {
        this.fileName = fileName;
        this.type = type;
    }

}