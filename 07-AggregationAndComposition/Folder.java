import java.util.ArrayList;

public class Folder {
    private String folderName;
    private double folderSize;
    private int numberOfFiles;
    private ArrayList<File> files = new ArrayList<>();

    Folder(String folderName) {
        this.folderName = folderName;
    }

    public String getFolderName() {
        return folderName;
    }

    public void setFolderName(String folderName) {
        this.folderName = folderName;
    }

    public double getFolderSize() {
        return folderSize;
    }

    public void setFolderSize(double folderSize) {
        this.folderSize = folderSize;
    }

    public int getNumberOfFiles() {
        return numberOfFiles;
    }

    public void setNumberOfFiles(int numberOfFiles) {
        this.numberOfFiles = numberOfFiles;
    }

    public void addFile(File file) {
        this.files.add(file);
    }

    // public void createFile(String fileName, String type) {
    // File file = new File(fileName, type);
    // this.files.add(file);
    // }

    public void removeFile(File file) {
        this.files.remove(file);
    }

    public String toString() {
        String toString = "";
        if (files.size() == 0) {
            return toString + "There is no files in this folder named: " + getFolderName();
        } else {
            toString = "The folder named \"" + getFolderName() + "\" contains: \n";
            for (File file : this.files) {
                toString += file.getfileName() + "." + file.getType() + "\n";
            }
        }
        return toString;
    }

    public static void main(String[] args) {
        Folder folder1 = new Folder("Folder Amelii");
        File file1 = new File("text1", "txt");
        File file2 = new File("text2", "txt");

        folder1.addFile(file1);
        folder1.addFile(file2);

        System.out.println(folder1.toString());

        // folder1.createFile("text3", "txt");
        File file3 = new File("text3", "txt");
        folder1.addFile(file3);

        System.out.println(folder1.toString());

        folder1.removeFile(file3);

        System.out.println(folder1.toString());
    }

}