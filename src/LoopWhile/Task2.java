package LoopWhile;

public class Task2 {
    public static void main(String[] args) {

        int beginningOfRange = 427;
        int rangeEnd = 529;

        while (beginningOfRange <= rangeEnd){
            if(beginningOfRange %3 == 0 && beginningOfRange % 5 == 0){
                System.out.println(beginningOfRange + ") TikTak");
            }else if(beginningOfRange % 3 ==0){
                System.out.println(beginningOfRange + ") Tik");
            }else if( beginningOfRange % 5 == 0){
                System.out.println(beginningOfRange + ") Tak");
            }

            beginningOfRange++;

        }
    }
}
