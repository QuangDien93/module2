package queue;

import java.time.LocalDate;
import java.util.Date;

public class Person implements Comparable<Person>{
    private String name, gender;
    private LocalDate birthday;

    public Person(String name, String gender, LocalDate birthday) {
        this.name = name;
        this.gender = gender;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "SortPerson{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", birthday=" + birthday +
                '}';
    }

    @Override
    public int compareTo(Person o) {
        return this.birthday.compareTo(o.birthday);
    }
}
