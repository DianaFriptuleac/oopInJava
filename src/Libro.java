public class Libro {
    public String titolo;
    public String autore;
    public int numeroPagine;

    //Costruttore
    public Libro (String titolo, String autore, int numeroPagine){
        this.titolo = titolo;
        this.autore = autore;
        this.numeroPagine = numeroPagine;

    }
    //metodo per stampare i dettagli
    public void print() {
        System.out.println("Titolo libro: "+ this.titolo);
        System.out.println("Autore: "+ this.autore);
        System.out.println("Le pagine del libro sono: " + this.numeroPagine);
    }
}
