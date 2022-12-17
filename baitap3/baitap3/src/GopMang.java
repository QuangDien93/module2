public class GopMang {
    public static void main(String[] args) {
        int[] array1 = {1,2,3,4,5};
        int[] array2 = {6,7,8,9};
        int[] arrayMerge = new int[array1.length+array2.length];
        for (int i = 0; i < array1.length; i++) {
            arrayMerge[i] = array1[i];
        }
        for (int i = array1.length; i <arrayMerge.length ; i++) {
            arrayMerge[i] = array2[i-array1.length];
        }
        for (int i = 0; i < arrayMerge.length; i++) {
            System.out.print(arrayMerge[i]+" ");
        }
    }
}
