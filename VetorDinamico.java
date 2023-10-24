public class VetorDinamico {
    private int quantidade;
    private int capacidade;
    private int [] elementos;
    
    public VetorDinamico() {
        quantidade = 0;
        capacidade = 4;
        elementos = new int [capacidade];
    }

    public void adicionar(int e) {
        elementos[quantidade] = e;
        quantidade++;
    }
    
    public void exibir() {
        System.out.printf("Quantidade; %d\nCap: %d\n", quantidade, capacidade);
        for (int elemento : elementos) {
            System.out.printf("%d ", elemento);
        }
    }
}
