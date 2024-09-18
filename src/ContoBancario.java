import java.util.Random;

public class ContoBancario {
    public int numeroConto;
    public int saldo;

    //Costruttore per il numero del conto e il saldo

    public ContoBancario(){
        Random myrandom = new Random();
        this.numeroConto = myrandom.nextInt(1000000);  //avro un numero random fino a 999999
        this.saldo = 0; //il saldo parte da zero
    }
    //Metodo per depositare
    public void deposit (int numeroSoldi){
        if(numeroSoldi > 0){
            saldo += numeroSoldi;
            System.out.println("Il tuo deposito e di: " + numeroSoldi + "€. Il saldo e di  " + saldo + " €");
        } else{
            System.out.println("Importo non valido");
        }
    }

    //Metodo per il prelievo (solo se il saldo non e zero)

    public void preleva (int numeroSoldi) {
        if(saldo > 0 && numeroSoldi > 0 && numeroSoldi <= saldo){
            saldo -= numeroSoldi;
            System.out.println("Hai appena prelevato " + numeroSoldi + "€. Il tuo saldo e "+ saldo + "€.");
        }else if(saldo ==0){
            System.out.println("Il saldo e pari a zero. Non puo prelevare!");
        } else if(numeroSoldi > saldo){
            System.out.println("Il tuo saldo e inferiore alla tua richiesta");
        } else{
            System.out.println("Importo non valido. Il tuo saldo e: " + saldo + "€.");
        }
    }
    public void printContoBancario(){
        System.out.println("Il numero del conto e "+ numeroConto + " e il saldo e di " + saldo + "€.");
    }

}
