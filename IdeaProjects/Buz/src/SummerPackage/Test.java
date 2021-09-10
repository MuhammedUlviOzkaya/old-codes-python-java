package SummerPackage;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        primeDivisors(10);


    }
    public static void primeDivisors(int number){
        int controller = number;
        ArrayList<String> primes = new ArrayList<String>();
        for(int i = 2; i <= number / 2; i++){
            int counter = 0;
            while(controller % i == 0){
                controller /= i;
                counter++;
            }
            if(counter != 0){
                String element = i + "^" + counter + " ";
                primes.add(element);
            }
        }
        if(primes.size() == 0){
            String element = number + "^" + 1;
            primes.add(element);
        }
        System.out.println(primes);
    }
    }

