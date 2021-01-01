package LoopWhile;

public class Task1 {
    public static void main(String[] args) {
        int n = 5;
        int count = 1;
        int sum = 0;
        while (count <= n){
            sum = n * count;
            System.out.println(n + " x "+ count + " = " + sum);
            count++;
        }
    }
}
