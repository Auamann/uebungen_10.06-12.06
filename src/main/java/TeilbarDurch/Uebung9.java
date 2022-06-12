package TeilbarDurch;
//Wird aktuell noch dran gebastelt. Mir ist die Lösung leider noch nicht ganz klar.
public class Uebung9 {

    int arrayGroeße = 2;
    int[] teiler = new int[arrayGroeße];
    int arrayNummer;


    static Uebung9 instanz = new Uebung9();

    public static void main(String[] args) {

        instanz.mathe();

    }

    public void mathe() {

        teiler[0] = 3;
        teiler[1] = 5;


        for (int zuTeilendeZahl = 1; zuTeilendeZahl < 101; zuTeilendeZahl++) {

            for (arrayNummer = 0; arrayNummer < 2; arrayNummer++) {


                if (zuTeilendeZahl % teiler[arrayNummer] == 0) {
                    System.out.println("Zahl " + zuTeilendeZahl + " ist teilbar durch = " + teiler[arrayNummer]);
                }

            }

            arrayNummer = 0;

        }


    }


}