package student;

public class Student {
    private String name = "John";
    private String classes = "C02";
    public Student(){
    }

    public String getName() {
        return name;
    }

    public String getClasses() {
        return classes;
    }

    public void setName(String value){
        this.name = value;
    }
    protected void setClasses(String value){
        this.classes = value;
    }


}
