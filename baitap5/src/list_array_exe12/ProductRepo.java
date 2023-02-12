package list_array_exe12;

import java.util.ArrayList;

public class ProductRepo {
    private ArrayList<Product> listPro;
    public ProductRepo(){
        this.listPro = new ArrayList<>();
    }
    public ProductRepo(ArrayList<Product> listPro){
        this.listPro = listPro;
    }
    public void addPro(Product pro){
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
            if (element.getIdPro() == id) {
                element.setPricePro(price);
            }
        }
    }
    public void removeProById  (String id){
        for(Product element:listPro){
            if(element.getIdPro() == id){
                listPro.remove(element);
            }
        }
    }
}
