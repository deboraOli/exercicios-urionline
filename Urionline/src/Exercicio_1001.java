/**
 *Leia 2 valores inteiros e armazene-os nas variáveis A e B. 
 * Efetue a soma de A e B atribuindo o seu resultado na variável X. 
 * Imprima X conforme exemplo apresentado abaixo. 
 * Não apresente mensagem alguma além daquilo que está sendo especificado e 
 * não esqueça de imprimir o fim de linha após o resultado, caso contrário, 
 * você receberá "Presentation Error".
 * @author Débora
 */
import javax.swing.JOptionPane;
public class Exercicio_1001 {
    public static void main(String[] args) {
      int a,b,x;
      a = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro"));
      b = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro"));
      x=a+b;
        System.out.print(" x= " + x);
    }
}
