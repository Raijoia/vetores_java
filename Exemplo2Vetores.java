public class Exemplo2Vetores {
    public static void main(String[] args) {
        // notas de alunos
        int [] notas = new int[]{4, 10, 6, 7};

        // exibir as notas
        for (int i = 0; i < notas.length; i++) {
            System.out.println(notas[i]);
        }
        
        // enhanced for (java 5 em diante)
        // foreach
        for(int nota : notas) {
            System.out.println(nota);
        }

        int soma = 0;
        // for (int i = 0; i < notas.length; i++) {
        //     soma += notas[i];
        // }

        // no foreach
        for (int nota : notas) {
            soma += nota;
        }

        System.out.println(soma);
    }
}
