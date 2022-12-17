import java.util.Scanner;

public class XoaPhanTuKhoiMang {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,2};
        System.out.println("What element do you want to delete");
        Scanner scanner = new Scanner(System.in);
        int elementX = scanner.nextInt();
        if(findIndex(array,elementX) == -1){
            System.out.println("Don't find the element in array");
        } else {
        while (findIndex(array,elementX)!= -1){
            int index = findIndex(array,elementX);
            array  = deleteElement(array,index);
        }
            System.out.println("the new Array is:");
        for (int j : array){
                System.out.print(j+ " ");
            }
        }

    }
    public static int findIndex(int[] arr, int element){
        int index = -1;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i] == element){
                index = i;
            }
        }
        return index;
    }
    public static int[] deleteElement(int[] array, int index){
        int[] newArray = new int[array.length-1];
        for (int i = 0; i <index; i++) {
            newArray[i]= array[i];
        }
        for (int j = index; j <newArray.length ; j++) {
            newArray[j] = array[j+1];
        }
        return newArray;
    }
}
