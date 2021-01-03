package JumpInstruction;

public class Task2 {
    public static void main(String[] args) {

        char[] word = {'z', 'a', 'b', 'a', 'w','a'};

        for (int i = word.length - 1; i > 0; i--) {
            if (word[i] == 'a') {
                System.out.println("indeks ostatniej litery 'a' to " + i);
                break;
            }
        }
    }
}
