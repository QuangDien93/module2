package exe16_IOTextFile;

import java.io.*;
import java.util.Scanner;

public class CopyFileText {
    public static void main(String[] args) {
        CopyFileText copyFileText = new CopyFileText();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập link file muốn copy");
        String copyPath = scanner.nextLine();
        System.out.println("Nhập link file target");
        String targetPath = scanner.nextLine();
        File file = new File(targetPath);
        if(!file.exists()) {
            copyFileText.readAndWriteFile(copyPath, targetPath);
        } else {
            System.out.println("File target đã tồn tại");
        }
    }
    public void readAndWriteFile (String copyPath, String targetPath) {
        try {
            BufferedReader brRead = new BufferedReader(new FileReader(copyPath));
            BufferedWriter brWrite = new BufferedWriter(new FileWriter(targetPath));
            int c;
            int sum = 0;
            while((c = brRead.read()) != -1){
                brWrite.write(c);
                sum++;
            }
            System.out.println("Tổng số ký tự của file đích là " + sum);
            brWrite.close();
            brWrite.close();
        } catch (FileNotFoundException e) {
            System.out.println("File bạn muốn copy không tồn tại");;
        } catch (IOException e) {
            e.getMessage();
        }
    }
}