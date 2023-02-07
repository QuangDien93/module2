package list_array;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> listInteger = new MyList<Integer>();
        listInteger.add(1);
        listInteger.add(2);
        listInteger.add(3);
        listInteger.add(4);
        System.out.println(listInteger);
        listInteger.add(1,5);
        System.out.println(listInteger);
        listInteger.remove(2);
        System.out.println(listInteger);
        System.out.println(listInteger.getSize());
    }
}