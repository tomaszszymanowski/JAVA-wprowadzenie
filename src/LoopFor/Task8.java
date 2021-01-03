package LoopFor;

public class Task8 {
    public static void main(String[] args) {

        int[] numbers = {44,1,4,6,222,67,567};
        int temp = 0;
        int sum = 0;
        int multiply = 1;
        int mediana = 0;

        // suma oraz iloczyn tablicy
        for (int j = 0; j < numbers.length; j++) {
            sum += numbers[j];
            multiply *= numbers[j];
        }

        System.out.println("suma: " + sum);
        System.out.println("iloczyn: " + multiply);


        // sukanie wartości min i max
        System.out.println("\ntablica posortowana");
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }

        for (int k = 0; k < numbers.length; k++) {
            System.out.print(numbers[k] + ", ");
        }
        System.out.println("\nnajmniejsza liczba to:" + numbers[0]);
        System.out.println("najmniejsza liczba to:" + numbers[numbers.length - 1]);

        //mediana

        if (numbers.length % 2 == 0) {
            mediana =(numbers[(numbers.length/2) -1] + numbers[numbers.length/2]) /2;
            System.out.println("mediana to: " + mediana);
        } else if (numbers.length % 2 != 0){
            mediana = ((numbers.length + 1) / 2) - 1;
            System.out.println("mediana to: " + numbers[mediana]);
        }




        //sorotwanie malejące
        for (int i = 0, j = numbers.length - 1; i <= (numbers.length)/2; i++, j--) {

            temp = numbers[i];
            numbers[i] = numbers[j];
            numbers[j] = temp;
        }

        System.out.println("\nTablica posortowana malejąco");
        for (int j = 0; j < numbers.length; j++) {
            System.out.print(numbers[j] + ", ");
        }


    }

}

