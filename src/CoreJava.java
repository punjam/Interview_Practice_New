import java.util.*;

public class CoreJava {
    public static void main(String[] args) {

        /*int[] first = {1, 2, 3, 4, 5, 6};
        int[] second = {0, 2, 3, 6, 7};
        printIndex();*/
        //printArray(second);
        /*int sum = add(5, 5);
        System.out.println(sum);*/

        // numbers();
        //fizzBuzz();
        //treeMap();
        //printOddNum();
        //printEvenNum();
       // printPrimeNum();
        //printreverseEvenNum();


    }

    /*public static int add(int num1, int num2) {

        int total = num1 + num2;

        return total;
    }*/

   /* public static void printArray(int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            System.out.printf("%d%n", arr[i]);
        }

    }*/



/*
    public static void printIndex() {
        int[] numbers = new int[10];

        int k = -113;

        for(int i = 0; i< numbers.length; i++){
            numbers[i] = k;
        }

        for(int j = 0; j< numbers.length; j++){
            System.out.print(numbers[j] + " ");
        }

    }*/

    /*public static void numbers(){
        //int num;
        for(int i = 1; i<=100; i++){
            //num = i+1;
            System.out.print(i + " ");
        }

    }*/


    public static void fizzBuzz() {
        for (int i = 50; i >= 1; i--) {

            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FIZZBUZZ");
            } else if (i % 3 == 0) {
                System.out.println("FIZZ");
            } else if (i % 5 == 0) {
                System.out.println("BUZZ");
            } else {
                System.out.println(i);

            }
        }
    }


    public static void treeMap() {
        Map<String, String> names = new HashMap<>();
        names.put("key1", "cherry");
        names.put("key2", "banana");
        names.put("key3", "apple");
        names.put("key4", "kiwi");
        names.put("key2", "orange");
        System.out.println(names);
        for(Map.Entry<String, String> element : names.entrySet()){

            String key = element.getKey();
            String value = element.getValue();

            System.out.println("key:" + key + "    value:" +value);

        }

    }


    public static void printOddNum(){

        for(int i = 1; i <=10; i++){

            if(i%2 != 0){
                System.out.println(i + " ");
            }
        }

    }

    public static void printEvenNum(){

        for(int i = 1; i <=10; i++){

            if(i%2 == 0){
                System.out.println(i + " ");
            }
        }

    }

    public static void printreverseEvenNum(){

        for(int i = 10; i >=1; i--){

            if(i%2 == 0){
                System.out.println(i + " ");
            }
        }

    }

    public static void printPrimeNum(){

        for(int i = 2; i < 10; i++){
            boolean primeNumber = isPrimeNumber(i);
            if(primeNumber){
                System.out.println(i + " ");

            }
        }

    }

    public static boolean isPrimeNumber(int number){
        boolean test = true;
        if(number <= 1){
            test = false;
        }
        for(int i = 2; i < number; i++){
            if(number % i == 0) {
                test = false;
                break;
            }
        }
        return test;
    }


}
//Garbage collections, Threads, arrays, Try Catch, Springboot annotations.
// SQL query using joins
