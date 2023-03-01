package modles;

import services.BankAccountService;

import java.util.Scanner;

public class CreditCard extends Card{
    private double duNo = 0;
    private double hanMuc;

    public CreditCard() {

    }

    public CreditCard(String soThe, String chuThe, String cCCD, String diaChi, double duNo, double hanMuc) {
        super(soThe, chuThe, cCCD, diaChi);
        this.duNo = duNo;
        this.hanMuc = hanMuc;
    }

    public CreditCard(String[] data) {
        super(data[0], data[1], data[2], data[3]);
        this.duNo =Double.parseDouble(data[4]);
        this.hanMuc = Double.parseDouble(data[5]);
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
        System.out.println("nhập số hạn mức");
        this.setHanMuc(Double.parseDouble(scanner.nextLine()));
    }

    @Override
    public String getInfor() {
        return String.format("%s,%s,%s,%s,%s,%s",getSoThe(),getChuThe(),getcCCD(),getDiaChi(),getDuNo(), getHanMuc());
    }

    public double getDuNo() {
        return duNo;
    }

    public void setDuNo(double duNo) {
        this.duNo = duNo;
    }

    public double getHanMuc() {
        return hanMuc;
    }

    public void setHanMuc(double hanMuc) {
        this.hanMuc = hanMuc;
    }

    @Override
    public String toString() {
        return super.toString() +
                "duNo=" + duNo +
                ", hanMuc=" + hanMuc +
                '}';
    }
}
