/* Usando recursividade, calcule a soma de
todos os valores de um array de reais.
 */

/**
 *
 * @author Débora
 */
import javax.swing.JOptionPane;
public class Recursiva2 {
    public static void main(String[] args) {
        int vt[] = new int[5];
        int i;
       int soma;
        for(i=0;i<5;i++){
            vt[i]=Integer.parseInt(JOptionPane.showInputDialog("Digite um valor"));
        }
           soma=Recurs(vt,i);
           JOptionPane.showMessageDialog(null, soma);
    }
    static int Recurs(int v[], int x){
        if(x==0){
            return 0;
        }else{
            return v[x-1]+Recurs(v,x-1);
        }
    }
}