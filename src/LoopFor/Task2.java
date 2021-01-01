package LoopFor;

public class Task2 {
    public static void main(String[] args) {

        for(int i = 62349; i < 62392; i++){
            if(i % 10 == 0){
                System.out.println();
            }
            if(i % 2 == 0){
                System.out.print(i + ", ");
            }
        }
    }
}
