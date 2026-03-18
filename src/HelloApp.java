public class HelloApp {

    public static void main(String[] args) {

        // Case 1: No arguments → default "World"
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } 
        // Case 2: One or more arguments
        else {
            // Join all names with comma and space
            String names = String.join(", ", args);

            // Print greeting
            System.out.println("Hello, " + names + "!");
        }
    }
}