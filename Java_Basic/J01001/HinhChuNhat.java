package Java_Basic.J01001;

import java.util.Scanner;

public class HinhChuNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        if (a <= 0 || b <= 0) System.out.println(0);
        else System.out.println(2*(a+b) + " " + a*b);
    }
}
