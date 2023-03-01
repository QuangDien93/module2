package modles;

public abstract class Card {
    private String soThe;
    private String chuThe;
    private String cCCD;
    private String diaChi;

    public Card() {
    }

    public Card(String soThe, String chuThe, String cCCD, String diaChi) {
        this.soThe = soThe;
        this.chuThe = chuThe;
        this.cCCD = cCCD;
        this.diaChi = diaChi;
    }
     public abstract  void inputCard();
    public abstract String getInfor();
    @Override
    public String toString() {
        return "Card{" +
                "soThe='" + soThe + '\'' +
                ", chuThe='" + chuThe + '\'' +
                ", cCCD='" + cCCD + '\'' +
                ", diaChi='" + diaChi + '\'' ;
    }

    public String getSoThe() {
        return soThe;
    }

    public boolean setSoThe(String soThe) {
        if(soThe.matches("\\d{12}")){
                this.soThe = soThe;
            return true;
        } else {
            System.out.println("Số thẻ phai bao gom 12 chu so");
            return false;
        }
    }

    public String getChuThe() {
        return chuThe;
    }

    public void setChuThe(String chuThe) {
        this.chuThe = chuThe;
    }

    public String getcCCD() {
        return cCCD;
    }

    public boolean setcCCD(String cCCD) {
        if(cCCD.matches("\\d{12}")){
            this.cCCD = cCCD;
            return true;
        } else {
            System.out.println("CCCD phai bao gom 12 chu so");
            return false;
        }
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
}
