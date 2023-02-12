package queue;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.Queue;

public class SortPerson {
    public static void main(String[] args) {
        ArrayList<Person> inputList = new ArrayList<>();
        ArrayList<Person> outputList = new ArrayList<>();
        inputList.add(new Person("A", "Male", LocalDate.parse("1993-07-21")));
        inputList.add(new Person("B", "Female", LocalDate.parse("1992-06-15")));
        inputList.add(new Person("C", "Male", LocalDate.parse("1991-02-18")));
        inputList.add(new Person("D", "Female", LocalDate.parse("1990-12-24")));
        inputList.add(new Person("E", "Female", LocalDate.parse("1989-10-28")));

        Queue<Person> na = new LinkedList<>();
        Queue<Person> nu = new LinkedList<>();
        for (Person element : inputList) {
            if (element.getGender().equals("Male")) {
                na.add(element);
            } else {
                nu.add(element);
            }
        }
        while (!nu.isEmpty()){
            outputList.add(nu.poll());
        }
        while (!na.isEmpty()){
            outputList.add(na.poll());
        }
        outputList.forEach(System.out::println);
    }
}
