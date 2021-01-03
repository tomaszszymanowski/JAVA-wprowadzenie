package LoopForEach;

public class Task2 {
    public static void main(String[] args) {
        int[] numbers = new int[51];
        for(int i = 0; i< numbers.length; i++){
            numbers[i] = i;
        }

        for(int divider : numbers){
            if(divider % 5 == 0 && divider != 0){
                System.out.println("liczby podzielne przez 5 to " + divider );
            }
        }
    }
}
