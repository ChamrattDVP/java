package com.chamratt.oop;

public class PrimeNumbers {
    public static void main(String[] args) {
        int num = 0;

        String primeNumebr = "";

        for(int i = 1; i <= 100; i++){
            int counter = 0;
            for (num = i; num>=1;num--)
            {
                if(i%num==0)
                {
                    counter = counter + 1;
                }
            }
            if(counter == 2)
            {
                primeNumebr = primeNumebr + i +" ";
            }

        }
        System.out.println(primeNumebr);
    }
}
