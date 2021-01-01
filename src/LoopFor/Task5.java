package LoopFor;

public class Task5 {
    public static void main(String[] args) {
        int[] tab = {60, 40, 81, 25, 56, 12, 10, 3, 9, 7};
        int temp;
        System.out.println("Zawartosc tablicy: ");

        for(int i = 0; i < tab.length; i++) System.out.print(tab[i] + " ");

        System.out.println();
        for (int i = 0; i < tab.length - 1; i++){
            for (int j = 0; j < tab.length - 1; j++){
                if(tab[j] > tab[j + 1]){
                    temp = tab[j];
                    tab[j] = tab[j + 1];
                    tab[j + 1] = temp;
                }
            }
        }
        System.out.println();
        System.out.println("Posortowana tablica: ");
        for(int i = 0; i < tab.length; i++) System.out.print(tab[i] + " ");


    }
}
