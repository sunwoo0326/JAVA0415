import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("정수 a :");
        int a = sc.nextInt();
        System.out.print("정수 b :");
        int b = sc.nextInt();
        System.out.print("정수 c :");
        int c = sc.nextInt();
    
        System.out.print("정수 c :");("a<=b<=c 가 되도록 정렬했습니다.");
        if ( a> b) {
            int t = a; a = b; b = t;
        
        if (b > c) {
            int t = b; b = c; c = t;
        if (a > b) {
            int t = a; a = b;  b = t;

        }
        } 
        }
        System.out.print("변수 a 는" + a + "입니다.");
        System.out.print("변수 b 는" + b + "입니다.");
        System.out.print("변수 c 는" +  + "입니다.");
    }        