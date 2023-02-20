package exe16_IOTextFile;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteCSV {
    public static void main(String[] args) {
        List<Country> listCountry = new ArrayList<>();
       listCountry.add(new Country(1, "AU", "Australia"));
        listCountry.add(new Country(2, "CN", "China"));
        listCountry.add(new Country(3,"AU","Australia"));
        listCountry.add(new Country(4,"CN","China"));
        listCountry.add(new Country(5,"JP","Japan"));
//        writeCSVFile("E:/Code/module2/baitapmodule2/baitap5/src/exe15_IOFile/listCountry.csv",listCountry );
        readCSVFile9("E:/Code/module2/baitapmodule2/baitap5/src/exe15_IOFile/listCountry.csv");
    }

    public static final String FILE_HEADER = "id,code,name";
    public static final String NEW_LINE = "\n";
    public static final String COMMA_DELIMITER = ",";

    public static void writeCSVFile(String path, List<Country> list) {
        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(new FileWriter(path));
            bw.append(FILE_HEADER);
            bw.append(NEW_LINE);
            for (Country country : list) {
                bw.append(String.valueOf(country.getId()));
                bw.append(COMMA_DELIMITER);
                bw.append(country.getCode());
                bw.append(COMMA_DELIMITER);
                bw.append(country.getName());
                bw.append(NEW_LINE);
            }
            System.out.println("The CSV file was creat successfully");

        } catch (IOException e) {
            System.out.println("Error in CsvFileWriter !!!");
            e.printStackTrace();
        } finally {
            try {
                bw.flush();
                bw.close();
            } catch (IOException e) {
                System.out.println("Error while flushing/closing fileWriter !!!");
                e.printStackTrace();
            }
        }
    }
    public static void readCSVFile9(String path){
        BufferedReader br = null;
        try{
            br = new BufferedReader(new FileReader(path));
            String line = "";
            while ((line = br.readLine()) != null){
           printCountry(parseCSVLine(line));
            }

        } catch (IOException e) {
            System.out.println("File CSV không tồn tại");
        } finally {
            try {
                if (br != null)
                    br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public static List<String> parseCSVLine(String csvLine){
        List<String> result = new ArrayList<>();
        if(csvLine != null){
            String[] slitData = csvLine.split(COMMA_DELIMITER);
            for (int i = 0; i < slitData.length; i++) {
                result.add(slitData[i]);
            }
        }
        return result;
    }
    public static void printCountry(List<String> country){
        System.out.println("Country : [id = "
                                    + country.get(0)
                                    + ", code = "+ country.get(1)
                                    + ", name = "+ country.get(2)
                                    + "]");
    }
}