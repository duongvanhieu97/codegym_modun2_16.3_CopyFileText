import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        copyFile("/home/duonghieu/codegym/modun2/codegym_modun2_16.3_CopyFileText/file/inputFile.txt", "/home/duonghieu/codegym/modun2/codegym_modun2_16.3_CopyFileText/file/outputFile.txt");
    }

    public static void copyFile(String sourcePath, String destPath) throws FileNotFoundException, IOException {
        FileReader fileReader = new FileReader(sourcePath);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        FileWriter fileWriter = new FileWriter(destPath);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
            bufferedWriter.write(line);
            bufferedWriter.write("\n");
        }
        bufferedWriter.close();
        bufferedReader.close();
    }
}
