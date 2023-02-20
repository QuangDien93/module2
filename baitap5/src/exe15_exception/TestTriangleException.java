package exe15_exception;

import java.util.Scanner;

public class TestTriangleException {
    public static void checkTriangle(int a, int b, int c) throws IllegalTriangleException{
        if(a <=0 || b <=0 || c <=0){
            throw new IllegalTriangleException("phai nhập số dương");
        } else {
            if(a+b <=c || b+c <= a || c+a <=b){
                throw new IllegalTriangleException("Lỗi tổng 2 cạnh không lớn hơn cạnh còn lại");
            } else {
                System.out.println("Hợp lệ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Nhập cạnh a");
            int a = scanner.nextInt();
            System.out.println("Nhập cạnh b");
            int b = scanner.nextInt();
            System.out.println("Nhập cạnh c");
            int c = scanner.nextInt();
        try {
                checkTriangle(a,b,c);
            }
        catch (IllegalTriangleException e){
            System.out.println(e.getMessage());
        }
        }
        catch (Exception e){
            System.out.println("Phải nhập dạng số");
        }
    }
}
