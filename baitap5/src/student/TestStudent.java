package student;

public class TestStudent {
    public static void main(String[] args) {
        Student stu1 = new Student();
        stu1.setName("Diên");
        stu1.setClasses("A09");
        System.out.print(stu1.getName());
        System.out.println(stu1.getClasses());
    }
}
