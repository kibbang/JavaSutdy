package oop;

public class MaxNumber {
    public static void main(String[] args) {
        CompareNumber t1 = new CompareNumber();
        System.out.println("두 수 중 더 큰 수는 " +t1.compare(4,3)+"입니다.");
    }
}
class CompareNumber {

    public int compare(int num1, int num2) {
       return num1 > num2 ? num1 : num2;
    }
}
