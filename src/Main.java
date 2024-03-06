import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PDSearch searcher = new PDSearch();

        while (true) {
            System.out.println("Choose an action:");
            System.out.println("1. Find something in the PDF");
            System.out.println("2. Exit");
            System.out.print("Enter your choice (1/2): ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter the path to the PDF: ");
                    String filePath = scanner.nextLine();
                    searcher.findTextInPDF(filePath);
                    break;
                case 2:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please enter 1, 2");
                    break;
            }
        }
    }
}
