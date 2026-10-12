import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Ange din bils info:");

            System.out.print("Ange registreringsnummer: ");
            String regnr = scanner.nextLine();

            System.out.print("Ange märke: ");
            String märke = scanner.nextLine();

            System.out.print("Ange modell: ");
            String modell = scanner.nextLine();

            System.out.print("Ange årsmodell: ");
            int årsmodell = Integer.parseInt(scanner.nextLine());

            bil bil1 = new bil(regnr, märke, modell, årsmodell);

            System.out.println("\nDin bil har skapats!");
            System.out.println(bil1);

            System.out.print("\nHur mycket vill du öka hastigheten? ");
            int ökning = Integer.parseInt(scanner.nextLine());

            bil1.ökaHastighet(ökning);

            System.out.println("Nuvarande hastighet: " + bil1.getHastighet());

            System.out.print("Hur mycket vill du bromsa? ");
            int minskning = Integer.parseInt(scanner.nextLine());

            bil1.bromsa(minskning);

            System.out.println("Hastighet efter bromsning: "+ bil1.getHastighet());

        } catch (IllegalArgumentException e) {
            System.out.println("Fel: " + e.getMessage());
        }

        scanner.close();
    }
}