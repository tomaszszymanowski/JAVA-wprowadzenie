package JumpInstruction;

public class Task1 {
    public static void main(String[] args) {
        int[] numbers = new int[31];

        for(int i = 0; i< numbers.length; i++){
            numbers[i] = i;
        }

        for(int everySecondNumb : numbers){
            if(everySecondNumb % 11 == 0){
                System.out.println("");
            }
            if(everySecondNumb % 2 == 0){
                System.out.print(everySecondNumb + ",");
            }
        }

    }
}
