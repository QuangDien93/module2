import java.util.Scanner;

public class ThemPhanTuVaoMang {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("What element do you want to add?");
        Scanner scanner = new Scanner(System.in);
        int elementX = scanner.nextInt();
        System.out.println("Which index do you want to add?"+"form 0 to "+ array.length);
        int index= scanner.nextInt();
        int[] newArray =  new int[array.length+1];
        if(index == 0){
            newArray[0]= elementX;
            for (int i = 1; i <newArray.length ; i++) {
                newArray[i] = array[i-1];
            }
        } else {
            for (int i = 0; i < index; i++) {
                newArray[i]=array[i];
            }
            newArray[index]= elementX;
            for (int i = index+1; i <newArray.length ; i++) {
                newArray[i] = array[i-1];
            }
        }
        System.out.println("The new Array is:");
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i]+ " ");
        }
    }
}
