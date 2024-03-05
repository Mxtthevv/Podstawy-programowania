import java.util.Scanner;

public class Cwiczenie3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj swój wzrost w centymetrach:" + " ");
        double wzrost = scan.nextDouble();

        System.out.println("Podaj swoją wagę w kg:" + " ");
        double waga = scan.nextDouble();

        scan.close();

        // KALKULATOR BMI //

        double BMI = waga / (wzrost * wzrost / 10000);

        if (BMI < 18.5) {
            System.out.println("Niedowaga, masz: " + BMI + " punktów BMI.");
        } else if (BMI >= 18.5 && BMI <= 24.9) {
            System.out.println("Prawidłowa masa ciała, masz: " + BMI + " punktów BMI.");
        } else if (BMI >= 25 && BMI <= 29.9) {
            System.out.println("Nadwaga, masz: " + BMI + " punktów BMI.");
        } else if (BMI > 30) {
            System.out.println("Otyłość, masz: " + BMI + " punktów BMI.");
        }
    }
}

// Ćwiczenie 4) z czatu 03.03.24 //