/*3) Implemente uma função recursiva que,
dados dois números inteiros x e n, calcula o
valor de xn.
*/
/**
 *
 * @author Débora
 */
import javax.swing.JOptionPane;
public class Recursiva1 {
    public static void main(String[] args) {
        int n1,n2;
        n1=Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
        n2=Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
        JOptionPane.showMessageDialog(null,Pot(n1,n2));
    }
    static int Pot(int x, int n){
        if(n==0){
            return 1;
        }
        return x*Pot(x,n-1);
    }    
}
