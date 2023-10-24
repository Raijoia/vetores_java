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
        if(estaCheio())
            aumentarCapacidade();
        elementos[quantidade] = e;
        quantidade++;
    }
    
    public void exibir() {
        System.out.printf("Quantidade; %d\nCap: %d\n", quantidade, capacidade);
        // for (int elemento : elementos) {
        //     System.out.printf("%d ", elemento);
        // }
        for (int i = 0; i < quantidade; i++) {
            System.out.printf("%d ", elementos[i]);
        }
    }

    private void aumentarCapacidade() {
        // 1. alocar novo vetor com o dobro da capacidade atual
        int [] auxiliar = new int[capacidade * 2];

        // 2. copiar todo mundo
        for (int i = 0; i < elementos.length; i++) {
            auxiliar[i] = elementos[i];
        }

        // 3. Fazer com que elementos referencie o vetor referenciado por aux
        elementos = auxiliar;

        // 4. Dobrar o valor de cap
        capacidade *= 2;
    }

    private boolean estaCheio() {
        return capacidade == quantidade;
    } 

    private boolean estaVazio() {
        return quantidade == 0;
    }

    public void remover() {
        if(!estaVazio()) {
            quantidade--;
        }
    }

    private void reduzirCapacidade(){}
}
