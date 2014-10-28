package edu.java.basic;

public class ForDemo {

    public static void main(String[] args) {
        int [] numbers = {1,2,3,4,5,6,7,8,9,10};
        for (int item : numbers) {
            System.out.println("Count is: " + item);
        }
        
        System.out.print("\n");
        int [] numbers2 = {10, 20, 30, 40, 50};

        for(int x : numbers2) {
           if(x == 30) {
            continue;
           }
           System.out.print(x);
           System.out.print("\n");
        }
        
        System.out.print("\n");
        String [] names = {"James", "Larry", "Tom", "Lacy"};
        for(String name : names) {
           System.out.print(name);
           System.out.print(", ");
        }
    }

}
