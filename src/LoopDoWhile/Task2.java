package LoopDoWhile;

public class Task2 {
    public static void main(String[] args) {
        int x = 25;

        do {
            System.out.print(x % 2);
            x /= 2;
        } while (x > 0);
    }
}
