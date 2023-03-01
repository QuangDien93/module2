package controller;

import modles.Card;
import services.BankAccountService;

import java.util.Scanner;

public class BankAccountManagement {
    public static void main(String[] args) {
        displayMainMenu();
    }

    public static void displayMainMenu() {
        do {


            System.out.println("-------Menu chính: Vui lòng chọn------- \n" +
                    "1. Đăng ký thẻ:\n" +
                    "2. Xuất tất cả các thẻ đang có ra file card.txt \n" +
                    "3. Đọc các thẻ card.txt \n" +
                    "4. Thanh Toán = thẻ \n" +
                    "5. Nộp tiền vào \n" +
                    "6. Tìm thẻ theo CMND/CCCD \n" +
                    "7. Xóa Thẻ \n" +
                    "8. Chuyển khoản \n" +
                    "9. Thoát chương trình"
            );
            Scanner scanner = new Scanner(System.in);
            String select = scanner.nextLine();
            switch (select) {
                case "1":
                    BankAccountService.dangKyThe();
                    break;
                case "2":
                    BankAccountService.ghiFile(BankAccountService.listCard);
                    break;
                case "3":
                    BankAccountService.listCard = BankAccountService.docFile();
                    for (int i = 0; i < BankAccountService.listCard.size(); i++) {
                        System.out.println(BankAccountService.listCard.get(i).toString());
                    }
                    break;
                case "4":
                    break;
                case "5":
                    break;
                case "6":
                    do {
                        System.out.println("1. Tìm theo tên \n"+
                                "2. Tìm theo CCCD \n" +
                                "3. Quay về menu chính");
                        String choose = scanner.nextLine();
                        switch (choose){
                            case "1":
                                System.out.println("nhấp tên");
                                BankAccountService.searchByName(scanner.nextLine());
                                displayMainMenu();
                                break;
                            case "2":
                                System.out.println("nhập CCCD");
                                BankAccountService.searchByCCCD(scanner.nextLine());
                                displayMainMenu();
                                break;
                            case "3":
                                displayMainMenu();
                                break;
                            default:
                                System.out.println("nhập lại đi nào");
                        }
                    } while (true);
                case "7":
                    System.out.println("nhập số thẻ cần hủy");
                    String soTheHuy = scanner.nextLine();
                    BankAccountService.remove(soTheHuy);
                    BankAccountService.ghiFile(BankAccountService.listCard);
                    break;
                case "8":
                    break;
                case "9":
                    System.exit(0);
                default:
                    displayMainMenu();
            }
        } while (true);
    }
}
