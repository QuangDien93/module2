package list_array_exe12;

public class Product {
    private String idPro;
    private String namePro;
    private int pricePro;

    public Product() {
    }

    public Product(String idPro, String namePro, int pricePro) {
        this.idPro = idPro;
        this.namePro = namePro;
        this.pricePro = pricePro;
    }

    public String getIdPro() {
        return idPro;
    }

    public void setIdPro(String idPro) {
        this.idPro = idPro;
    }

    public String getNamePro() {
        return namePro;
    }

    public void setNamePro(String namePro) {
        this.namePro = namePro;
    }

    public int getPricePro() {
        return pricePro;
    }

    public void setPricePro(int pricePro) {
        this.pricePro = pricePro;
    }

    @Override
    public String toString() {
        return "Product{" +
                "idPro=" + idPro +
                ", namePro='" + namePro + '\'' +
                ", pricePro=" + pricePro +
                '}';
    }

}
