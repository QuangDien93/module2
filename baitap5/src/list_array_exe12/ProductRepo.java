package list_array_exe12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ProductRepo {
    private ArrayList<Product> listPro = new ArrayList<>();

    public ProductRepo() {
        this.listPro = new ArrayList<>();
    }

    public ProductRepo(ArrayList<Product> listPro) {
        this.listPro = listPro;
    }

    public void addPro(Product pro) {
        listPro.add(pro);
    }

    public void editNameProById(String id, String name) {
        for (Product element : listPro) {
            if (element.getIdPro() == id) {
                element.setNamePro(name);
            }
        }
    }

    public void editPriceProById(String id, int price) {
        for (Product element : listPro) {
            if (element.getIdPro().equals(id)) {
                element.setPricePro(price);
            }
        }
    }

    public void removeProById(String id) {
        for (Product element : listPro) {
            if (element.getIdPro().equals(id)) {
                listPro.remove(element);
            }
        }
    }

    public void display() {
        listPro.forEach(System.out::println);
    }

    public void findProByName(String namePro) {
        boolean found = false;
        for (Product pro : listPro) {
            if (pro.getNamePro().equals(namePro)) {
                System.out.println(pro.toString());
                found = true;
            }
        }
        if (found == false){
            System.out.println("KHONG TIM THAY");
        }
    }
    public void sortIncreaseByPrice(){
        Collections.sort(listPro, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getPricePro()- o2.getPricePro();
            }
        });
    }
    public void sortDecreaseByPrice(){
        Collections.sort(listPro, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o2.getPricePro()- o1.getPricePro();
            }
        });
    }
}
