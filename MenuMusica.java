import java.util.*;
import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showMessageDialog;
import static javax.swing.JOptionPane.showInputDialog;

public class MenuMusica {
    public static void main(String[] args) {
        List <Musica> playlist = new ArrayList<>(0);
        int op;
        String menu = "1-Adicionar\n2-Ver a playlist\n3-Remover Musica\n0-Sair";
        do {
            op = parseInt(showInputDialog(menu));
            switch(op){
                case 1: {
                    var musica = new Musica(showInputDialog("Digite o titulo da musica"));
                    playlist.add(musica);
                    break;
                }
                case 2: {
                    StringBuilder sb = new StringBuilder("");
                    Collections.sort(playlist);
                    for (Musica musica : playlist) {
                        sb.append(musica.getTitulo());
                        sb.append("\n");
                    }
                    showMessageDialog(null, sb.toString());
                    break;
                }
                case 3: {
                    int indice = parseInt(showInputDialog(null, "Digite o Indice da musica que deseja remover"));
                    playlist.remove(indice - 1);
                    showMessageDialog(null, "Musica removida");
                }
            }
        } while (op != 0);
    }
}
