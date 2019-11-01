/**
 * @author Débora
 */
import javax.swing.JOptionPane;
public class Exercicio_1177 {
    public static void main(String[] args) {
        int i=0, cta,n;
        int vetor[] = new int[10];
        n=Integer.parseInt(JOptionPane.showInputDialog("Digite num número inteiro"));
        while(i<10){
            for(cta=0;cta<=(n-1);cta++){
                vetor[cta]=cta;
                System.out.println(vetor[cta]);
            }
            i++;
        }
    }
}
