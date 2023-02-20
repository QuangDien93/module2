package exe17_IO_BinaryFile;

import java.io.Serializable;
import java.util.ArrayList;

public class ProductList implements Serializable {
    private static ArrayList<Product> listProduct = new ArrayList<>();
    private static final long serialVersionUID = 1L;

    public ProductList() {
    }

    ;

    public ProductList(ArrayList<Product> listProduct) {
        this.listProduct = listProduct;
    }

    public void addProduct(Product product) {
        listProduct.add(product);
    }

    public void display() {
        listProduct.forEach(System.out::println);
    }

    public void searchProByName(String nameProduct) {
        boolean found = false;
        for (Product pro : listProduct) {
            if (pro.getName().equals(nameProduct)) {
                System.out.println(pro);
                break;
            }
        }
        if (found == false) {
            System.out.println("khong tim thay");        }
    }
}
