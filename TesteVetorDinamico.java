import java.util.Random;

public class TesteVetorDinamico {
    public static void main(String[] args) throws Exception{
        var gerador = new Random();
        var v = new VetorDinamico();
        while(true) {
            // lançar dados
            int dado = gerador.nextInt(6) + 1;
            
            // guardar o valor resultante no vetor
            v.adicionar(dado);

            // exibir o estado dele
            v.exibir();
            System.out.println("\n***************************");

            // dormir 5 segundos
            Thread.sleep(1000);
        }
    }
}
