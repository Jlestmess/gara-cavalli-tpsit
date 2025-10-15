import java.util.Scanner;

public class Main {
    /**punto di inizio dell'applicazione
     *thread padre
     * */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Cavallo fulmine = new Cavallo("Fulmine");
        Cavallo lampo = new Cavallo("Lampo");
        Cavallo bucigno = new Cavallo("Bucigno");
        Cavallo casereccio = new Cavallo("Casereccio");
        Cavallo marcello = new Cavallo("Marcello");

//        casereccio.setPriority(Thread.MAX_PRIORITY);
//        marcello.setPriority(Thread.MIN_PRIORITY);

        int input;
        System.out.printf("Inserisci la lentezza per fulmine: ");
        input = scanner.nextInt();
        fulmine.setLentezza(input);

        System.out.printf("Inserisci la lentezza per lampo: ");
        input = scanner.nextInt();
        lampo.setLentezza(input);

        System.out.printf("Inserisci la lentezza per bucigno: ");
        input = scanner.nextInt();
        bucigno.setLentezza(input);

        System.out.printf("Inserisci la lentezza per casereccio: ");
        input = scanner.nextInt();
        casereccio.setLentezza(input);

        System.out.printf("Inserisci la lentezza per marcello: ");
        input = scanner.nextInt();
        marcello.setLentezza(input);

        fulmine.start();
        lampo.start();
        bucigno.start();
        casereccio.start();
        marcello.start();
    }
}
