package LoopFor;

public class Task6 {
    public static void main(String[] args) {

        double[] studentAssessment1 = {1,3,5,4,5};
        double sum = 0;
        double average = 0;

        for(int i = 0; i < studentAssessment1.length; i++){
            sum += studentAssessment1[i];
        }
        average = sum / studentAssessment1.length;

        System.out.println(average);

        double[] studentAssessment2 = {3, 4, 4, 4, 4, 3, 3, 5};
        sum = 0;

        for(int i = 0; i < studentAssessment2.length; i++){
            sum += studentAssessment2[i];
        }
        average = sum / studentAssessment2.length;

        System.out.println(average);



    }
}
