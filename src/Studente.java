public class Studente {
    public String nome;
    public String cognome;
    public Number[] listaVoti;

    // Costruttore
    public Studente(String nome, String cognome) {
        this.nome = nome;
        this.cognome = cognome;
        this.listaVoti = new Number[5];
    }

    // Metodo per calcolare la media dei voti
    public void media() {
        double sum = 0;
        int nrvoti = 0;
        // Calcolo quanti voti sono diversi dal null e somma i voti
        for (Number voto : listaVoti) {
            if (voto != null) {
                sum += voto.doubleValue(); // Utilizza i numeri decimali per la media
                nrvoti++;
            }
        }
        if (nrvoti > 0) {
            double media = sum / nrvoti;  // Usa double per la media
            System.out.println("La media è: " + media);
        } else {
            System.out.println("Non ci sono voti.");
        }
    }

    // Metodo per stampare i dettagli dello studente
    public void printStudentDetails() {
        System.out.println("Nome studente: " + nome);
        System.out.println("Cognome studente: " + cognome);
        System.out.print("Voti: ");

        // Stampa i voti
        for (Number voto : listaVoti) {
            if (voto != null) {
                System.out.print(voto + " ");
            } else {
                System.out.print("N/A ");
            }
        }
        System.out.println();
    }

    // Metodo per assegnare i voti
    public void assegnaVoti(Number[] voti) {
        if (voti.length == 5) {
            this.listaVoti = voti;  // Usa l'operatore di assegnazione
        } else {
            System.out.println("Errore: l'array dei voti deve contenere esattamente 5 voti.");
        }
    }}