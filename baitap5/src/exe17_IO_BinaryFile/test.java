package exe17_IO_BinaryFile;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProductList listProduct = new ProductList();
        String path = "E:/Code/module2/baitapmodule2/baitap5/src/exe17_IO_BinaryFile/listPro.dat";
        do {
            System.out.println("Bạn đang muốn:");
            System.out.println("1. Thêm sản phẩm:");
            System.out.println("2. Hiển thị danh sách hiện tại");
            System.out.println("3. Tìm sản phẩm theo tên:");
            System.out.println("otherNumber. Thoát chương trình");
            int select = Integer.parseInt(scanner.nextLine());
            switch (select) {
                case 1:
                    System.out.println("Nhập ID");
                    String id = scanner.nextLine();
                    System.out.println("Nhập tên:");
                    String name = scanner.nextLine();
                    System.out.println("Nhập giá:");
                    double price = Double.parseDouble(scanner.nextLine());
                    System.out.println("Nhà máy");
                    String factory = scanner.nextLine();
                    System.out.println("Note gì không?");
                    String note = scanner.nextLine();
                    listProduct.addProduct(new Product(id, name, factory, price, note));
                    FileProductUtils.writeProductFile(path, listProduct);
                    break;
                case 2:
                    FileProductUtils.readProductFile(path).display();

                    break;
                case 3:
                    System.out.println("bạn muốn tìm thông tin sản phẩm nào");
                    String nameSearch = scanner.nextLine();

                    listProduct.searchProByName(nameSearch);
                    break;
                default:
                    System.exit(0);
            }

        } while (true);
    }
}

