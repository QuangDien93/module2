package exe17_IO_BinaryFile;

import java.io.Serializable;

public class Product implements Comparable<Product>, Serializable {
    private static final long serialVersionUID = 1L;

    private String code;
    private String name;
    private String factory;
    private double price;
    private String note;
    public Product(){};

    public Product(String code, String name, String factory, double price, String note) {
        this.code = code;
        this.name = name;
        this.factory = factory;
        this.price = price;
        this.note = note;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFactory() {
        return factory;
    }

    public void setFactory(String factory) {
        this.factory = factory;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "Product{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", factory='" + factory + '\'' +
                ", price=" + price +
                ", note='" + note + '\'' +
                '}';
    }

    @Override
    public int compareTo(Product o) {
        return  (int) this.price - (int)o.getPrice();
    }
}
