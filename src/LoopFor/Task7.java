package LoopFor;

public class Task7 {
    public static void main(String[] args) {

        char[] charTable= {'a','f','g','h','A', 't','a'};
        int countLower= 0;
        int countUpper= 0;

        for(int i = 0; i< charTable.length; i++){
            if(charTable[i] == 'a' ){
                countLower++;
            }
            if(charTable[i] == 'A'){
                countUpper++;
            }
        }
        System.out.println("jest w tablicy " +countLower + " znak(ów) \"a\" oraz "+ countUpper+ " znak(ów)  \"A\"");
    }
}
