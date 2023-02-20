package list_array_exe12;

import java.util.Scanner;

public class Test {
    static ProductRepo listPro = new ProductRepo();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Bạn đang muốn:");
            System.out.println("1. Thêm sản phẩm:");
            System.out.println("2. Sửa giá theo ID:");
            System.out.println("3. Sửa tên theo ID:");
            System.out.println("4. Xóa sản phẩm theo ID:");
            System.out.println("5. Hiển thị danh sách hiện tại");
            System.out.println("6. Tìm sản phẩm theo tên:");
            System.out.println("7. Sắp xếp Giá tăng dần:");
            System.out.println("8. Sắp xếp Giá giảm dần:");
            System.out.println("otherNumber. Thoát chương trình");
            int select = Integer.parseInt(scanner.nextLine());
            switch (select) {
                case 1:
                    System.out.println("Nhập ID");
                    String idAdd = scanner.nextLine();
                    System.out.println("Nhập tên:");
                    String name = scanner.nextLine();
                    System.out.println("Nhập giá:");
                    int price = Integer.parseInt(scanner.nextLine());
                    listPro.addPro(new Product(idAdd, name, price));
                    break;
                case 2:
                    System.out.println("Nhập ID sản phẩm:");
                    String idEditPrice = scanner.nextLine();
                    System.out.println("Nhập giá");
                    int priceEdit = Integer.parseInt(scanner.nextLine());
                    listPro.editPriceProById(idEditPrice, priceEdit);
                    break;
                case 3:
                    System.out.println("Nhập ID sản phẩm:");
                    String idEditName = scanner.nextLine();
                    System.out.println("Nhập Tên");
                    String nameEdit = scanner.nextLine();
                    listPro.editNameProById(idEditName, nameEdit);
                    break;
                case 4:
                    System.out.println("Nhập ID sản phẩm:");
                    String idRemove = scanner.nextLine();
                    listPro.removeProById(idRemove);
                    break;
                case 5:
                    listPro.display();
                    break;
                case 6:
                    System.out.println("Nhập tên sản phẩm:");
                    String nameFind = scanner.nextLine();
                    listPro.findProByName(nameFind);
                    break;
                case 7:
                    listPro.sortIncreaseByPrice();
                    break;
                case 8:
                    listPro.sortDecreaseByPrice();
                    break;
                default:
                    System.exit(0);

            }
        } while (true);
    }
}
