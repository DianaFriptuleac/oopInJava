public class Main {
    public static void main(String[] args) {

        //----------------------------EX1- Libri ----------------------------------
        Libro first = new Libro("Il nome della rosa", "Umberto Eco", 512);
        Libro second = new Libro("Cent'anni di solitudine", "Gabriel Garcia Marquez", 448);
        Libro third = new Libro("1984", "George Orwell", 328);

        first.print();
        second.print();
        third.print();


        //----------------------------EX2- ContoBancario ----------------------------------
        ContoBancario Mario = new ContoBancario();
        ContoBancario Anna = new ContoBancario();
        ContoBancario Maria = new ContoBancario();

        Mario.printContoBancario();
        Anna.deposit(300);
        Anna.printContoBancario();
        Maria.deposit(250);
        Maria.preleva(150);
        Maria.printContoBancario();


        //----------------------------EX3-Studente ----------------------------------
        Studente firstStudent = new Studente("Mario", "Rossi");
        Number[] votiMario = {25, 30, 28, 28, 30};

        // Assegna i voti allo studente
        setFirstStudent(firstStudent, votiMario);

        // Stampa i dettagli dello studente
        firstStudent.printStudentDetails();

        // Calcola e stampa la media
        firstStudent.media();
    }

// Metodo per assegnare voti e impostare lo studente
public static void setFirstStudent(Studente firstStudent, Number[] voti) {
    // Assegna i voti utilizzando il metodo 'assegnaVoti'
    firstStudent.assegnaVoti(voti);

    Studente secondStudent = new Studente("Anna", "Neri");
    Number[] votiAnna = {25, 30, 30, 28, 24};

    // Assegna i voti allo studente con il metodo statico setSecondStudent.
    setSecondStudent(secondStudent, votiAnna);

    // Stampa i dettagli dello studente
        secondStudent.printStudentDetails();

    // Calcola e stampa la media
        secondStudent.media();
}

// Metodo per assegnare voti e impostare lo studente.
    //Accetta due parametri: un oggetto Studente e un array di voti.
    //Utilizza il metodo assegnaVoti (della classe Studente).
public static void setSecondStudent(Studente firstStudent, Number[] voti) {
    // Assegna i voti utilizzando il metodo 'assegnaVoti'
    firstStudent.assegnaVoti(voti);
}

}

