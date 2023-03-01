package model;

import java.time.LocalDate;
import java.util.Date;

public abstract class Person {
    private String name;
    private String birthday;
    private String idCode;
    private String phoneNumber;
    private String email;

    public Person(String name, String birthday, String IDCode, String phoneNumber, String email) {
        this.name = name;
        this.birthday = birthday;
        this.idCode = IDCode;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public Person() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getIdCode() {
        return this.idCode;
    }

    public void setIdCode(String IDCode) {
        this.idCode = IDCode;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public boolean setEmail(String email) {
        if (email.contains("@")) {
            this.email = email;
            return true;
        } else {
            System.out.println("Sai Format, phai co @");
        }
        return false;
    }

    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                ", IDCode='" + +'\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
