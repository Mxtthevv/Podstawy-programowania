import java.util.Scanner;

public class Cwiczenie3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Wprowadź dowolną liczbę:");
        int liczba = scan.nextInt();

        scan.close();

        if (liczba%2==0) {
            System.out.println("Twoja liczba " + liczba + " jest parzysta.");
        } else {
            System.out.println("Twoja liczba " + liczba + " nie jest parzysta.");
        }
    }
}

// Ćwiczenie 3) z czatu 03.03.24 //