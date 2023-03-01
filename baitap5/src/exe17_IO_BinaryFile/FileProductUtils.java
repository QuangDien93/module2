package exe17_IO_BinaryFile;

import java.io.*;
import java.util.Collections;
import java.util.List;

public class FileProductUtils {
    public static void writeProductFile (String path, ProductList listProduct){
        try{
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path));
                oos.writeObject(listProduct);
            oos.flush();
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static ProductList readProductFile(String path){
        try{
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path));
            return  (ProductList) ois.readObject();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}

