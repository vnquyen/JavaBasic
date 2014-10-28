package edu.java.basic;

public class Test {

    public static void main(String[] args) {
        int a = 3;
        int b = 17;
        
        while(a++ <= b) {
            System.out.println(a + " - " + --b);
        }
        
        System.out.println("----");
        
        int c = 3;
        int d = 17;
        
        while(++c <= d) {
            System.out.println(c + " - " + d--);
        }
        
        System.out.println("==============");
        
        int e = 3;
        int f = 2;
        
        if((e++ > 3) && (f-- == 2)) {
            System.out.println("true: " + e + " - " + f);
        } else {
            System.out.println("false: " + e + " - " + f);
        }
        
        System.out.println("----");
        
        int g = 3;
        int h = 2;
        
        if((g++ > 3) & (h-- == 2)) {
            System.out.println("true: " + g + " - " + h);
        } else {
            System.out.println("false " + g + " - " + h);
        }
        
        System.out.println("==============");
        
        int l = 3;
        int k = 2;
        
        if((l++ == 3) || (k-- > 2)) {
            System.out.println("true: " + l + " - " + k);
        } else {
            System.out.println("false: " + l + " - " + k);
        }
        
        System.out.println("----");
        
        int m = 3;
        int n = 2;
        
        if((m++ == 3) | (n-- > 2)) {
            System.out.println("true: " + m + " - " + n);
        } else {
            System.out.println("false " + m + " - " + n);
        }
    }

}
