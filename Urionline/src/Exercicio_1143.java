/**
 * @author Débora
 */
import javax.swing.JOptionPane;
public class Exercicio_1143 {
    public static void main(String[] args) {
        int n,b=1,cta,base,expoente=3,potencia=1;
        n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro"));
        while(b<=n){
            for (cta=1;cta<=expoente;cta++){
                base=b;
                potencia=base*potencia;
                System.out.print(potencia+" ");
            }
            potencia=1;
            System.out.println();
            b++;
        }
    }
}    
