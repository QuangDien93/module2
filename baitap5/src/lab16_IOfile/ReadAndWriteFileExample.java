package lab16_IOfile;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadAndWriteFileExample {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("nhập đường dẫn file tính tổng số");
//        String path = scanner.nextLine();
//        ReadAndWriteFileExample readFileExample = new ReadAndWriteFileExample();
//        readFileExample.readFileTextToSum(path);
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập đường dẫn file số");
        String path = scanner.nextLine();
          ReadAndWriteFileExample readWriteFile = new ReadAndWriteFileExample();
           List<Integer> listNumbers =  readWriteFile.readFileToListNum(path);
          int maxvalue = findMax(listNumbers);
          readWriteFile.writeFileMaxNum(maxvalue,"E:\\Code\\module2\\baitapmodule2\\baitap5\\src\\lab15_IOfile\\max_num.txt");
    }
    public void readFileTextToSum(String path) {
        try{
            BufferedReader br = new BufferedReader(new FileReader(path));
            String line = "";
            int sum = 0;
            while ((line = br.readLine()) != null){
                sum = sum + Integer.parseInt(line);
            }
            br.close();
            System.out.println("Tổng là " + sum);
        }
        catch (FileNotFoundException e){
            System.out.println("file không tồn tại");
        }
        catch (Exception e){
            System.err.println("Nội dung có lỗi!");
        }
    }
    public static int findMax(List<Integer> numbers){
        int max = numbers.get(0);
        for (int i = 1; i < numbers.size() ; i++) {
            if(max< numbers.get(i)){
                max = numbers.get(i);
            }
        }
        return max;
    }
    public List<Integer> readFileToListNum(String path){
        List<Integer> numbers = new ArrayList<>();
        try{
            BufferedReader br = new BufferedReader(new FileReader(path));
            String line = "";
            while ((line = br.readLine()) != null){
                numbers.add(Integer.parseInt(line));
            }
        }
        catch (FileNotFoundException e){
            System.out.println("file không tồn tại");
        }
        catch (Exception e){
            System.err.println("Nội dung có lỗi!");
        }
        return numbers;
    }
    public void writeFileMaxNum(int max, String path){
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(path));
            bw.write("Giá trị lớn nhất là: "+ max);
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
