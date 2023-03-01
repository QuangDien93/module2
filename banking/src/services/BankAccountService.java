package services;

import controller.BankAccountManagement;
import jdk.nashorn.internal.runtime.regexp.joni.ast.StringNode;
import modles.ATMCard;
import modles.Card;
import modles.CreditCard;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BankAccountService {
    public static final char DAU_PHAY = ',';
    public static final String XUONG_DONG = "\n";
    public static final String PATH = "E:\\Code\\module2\\baitapmodule2\\banking\\src\\data\\card.txt";
    public static List<Card> listCard = docFile();

    public static void dangKyThe() {
        System.out.println("Vui Lòng chọn:\n" +
                "1. Đăng ký ATM \n" +
                "2. Đăng ký Credit\n" +
                "3. Quay lại Menu Chính\n" +
                "4. Thoát");
        Scanner scanner = new Scanner(System.in);
        String select = scanner.nextLine();
        switch (select) {
            case "1":
                ATMCard atmCard = new ATMCard();
                atmCard.inputCard();
                listCard.add(atmCard);
                ghiFile(listCard);
                break;
            case "2":
                CreditCard creditCard = new CreditCard();
                creditCard.inputCard();
                listCard.add(creditCard);
                ghiFile(listCard);
                break;
            case "3":
                BankAccountManagement.displayMainMenu();
                break;
            case "4":
                System.exit(0);
                break;
            default:
                dangKyThe();
        }

    }
    public static void ghiFile(List<Card> list) {
        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(new FileWriter(PATH));
            for (Card card : list) {
                bw.write(card.getInfor());
                bw.append(XUONG_DONG);
            }
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public static List<Card> docFile() {
        List<Card> list = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(PATH))) {
            String line = null;
            while ((line = br.readLine()) != null) {
                String[] result = line.split(",");
                if (result.length == 5) {
                    list.add(new ATMCard(result));
                } else {
                    list.add(new CreditCard(result));
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return list;
    }
    public static void remove(String soThe) {
        for (Card card : listCard) {
            if (card.getSoThe().equals(soThe)) {
                if (card instanceof CreditCard) {
                    if (((CreditCard) card).getDuNo() <= 0) {
                        listCard.remove(card);
                        System.out.println("Xóa thành công");
                        break;
                    } else {
                        System.out.println("Khong the xoa the vi du no >=0");
                        break;
                    }
                } else {
                    listCard.remove(card);
                    System.out.println("Xóa thành công");
                    break;
                }
            } else {
                System.out.println("Thẻ không tồn tại");
                break;
            }
        }


    }
    public static void searchByCCCD(String cccd){
        int count = 0;
        for (Card card: listCard){
            if(card.getcCCD().equals(cccd)){
                System.out.println(card.toString());
                count++;
            }
        }
        if(count == 0){
            System.out.println("Không có thẻ nào theo cccd bạn yêu cầu");
        }
    }
    public static void searchByName(String name){
        int count = 0;
        for (Card card: listCard){
            if(card.getChuThe().equals(name)){
                System.out.println(card.toString());
                count++;
            }
        }
        if(count == 0){
            System.out.println("Không có thẻ nào theo Tên bạn yêu cầu");
        }
    }
}

