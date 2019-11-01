/**
 *nao funciona na linha 10
 * @author Débora
 */
import javax.swing.JOptionPane;
public class Exercicio_1180 {
    public static void main(String[] args) { 
        int n,i,cta=0,menor=0;
        n=Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro"));
        int vetor[] = new int[n];
        for(i=0;i<n;i++){
            vetor[i]=Integer.parseInt(JOptionPane.showInputDialog("Digite valor para o vetor"));
            menor=vetor[0];
        }
        do{
            if(vetor[i]<menor){
                menor=vetor[i];
            }
            cta++;
        }while(cta<n);
        JOptionPane.showMessageDialog(null, "Menor valor: " + menor);
        JOptionPane.showMessageDialog(null, "Posição: " + i);
    }
    
}
