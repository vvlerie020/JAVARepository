package algorithm;

public class algorithmsample {
   
    public static void main(String[] args) {

        int correctPIN = 1234; 
        boolean found = false;

        for (int i = 0; i <= 9999; i++) {

            int attempt = i;

            // Show every PIN the program tries
            System.out.println("Trying PIN: " + attempt);

            if (attempt == correctPIN) {
                System.out.println("\nPIN Found: " + attempt);
                found = true;
                break;
            }
        }
    }
}
