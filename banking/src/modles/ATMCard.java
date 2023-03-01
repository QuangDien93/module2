package modles;

import services.BankAccountService;

import java.util.Scanner;

public class ATMCard extends Card {
    private double soDu = 0;

    public ATMCard() {
    }

    public ATMCard(String soThe, String chuThe, String cCCD, String diaChi, double soDu) {
        super(soThe, chuThe, cCCD, diaChi);
        this.soDu = soDu;
    }

    public ATMCard(String[] data) {
        super(data[0], data[1], data[2], data[3]);
        this.soDu = Double.parseDouble(data[4]);
    }

    public double getSoDu() {
        return soDu;
    }

    public void setSoDu(double soDu) {
        this.soDu = soDu;
    }

    @Override
    public void inputCard() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số thẻ");
        while (true) {
            String soThe = scanner.nextLine();
            int count = 0;
            for (Card card : BankAccountService.listCard) {
                if (soThe.equals(card.getSoThe())) {
                    count++;
                    break;
                }
            }
            if(count==0){
                if(this.setSoThe(soThe)){
                    break;
                } else {
                    System.out.println("Vui lòng nhập lại");
                }
            } else {
                System.out.println("Số thẻ đã tồn tại, vui lòng nhập số khác");
            }
        }

        System.out.println("nhập Tên chủ thẻ");
        this.setChuThe(scanner.nextLine());

        System.out.println("Nhập số CCCD");
        this.setcCCD(scanner.nextLine());

        System.out.println("Nhap Địa chỉ");
        this.setDiaChi(scanner.nextLine());
    }

    @Override
    public String getInfor() {
        return String.format("%s,%s,%s,%s,%s", getSoThe(), getChuThe(), getcCCD(), getDiaChi(), getSoDu());
    }


    @Override
    public String toString() {
        return super.toString() +
                ", soDu=" + soDu +
                '}';
    }
}
