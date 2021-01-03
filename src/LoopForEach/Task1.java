package LoopForEach;

public class Task1 {
    public static void main(String[] args) {
        double[] basePrices = {5,12.99,20.99,30,40,45};

        System.out.println("ceny bazowe");
        for (double price: basePrices) {
            System.out.printf("%.2f", + price);
            System.out.print(", ");
        }

        System.out.println("\n\nceny zwiękoszone o 10%");
        for(double newPrices : basePrices){
            System.out.printf("%.2f",newPrices+(newPrices*0.1));
            System.out.print(", ");

        }

    }
}
