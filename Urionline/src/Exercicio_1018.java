/*Leia um valor inteiro. A seguir, calcule o menor número de notas possíveis 
(cédulas) no qual o valor pode ser decomposto. As notas consideradas são de 100, 
50, 20, 10, 5, 2 e 1. 
A seguir mostre o valor lido e a relação de notas necessárias.

Entrada
O arquivo de entrada contém um valor inteiro N (0 < N < 1000000).

Saída
Imprima o valor lido e, em seguida, a quantidade mínima de notas de cada tipo
necessárias, conforme o exemplo fornecido. Não esqueça de imprimir o fim de 
linha após cada linha, caso contrário seu programa apresentará a mensagem:
“Presentation Error”.
 */

/**
 *
 * @author Débora
 */
import javax.swing.JOptionPane;
public class Exercicio_1018 {
    public static void main(String[] args) {
        int valor;
        int cn100 = 0, cn50=0, cn20 = 0, cn10 = 0, cn5=0, cn2=0, cn1=0;
        valor = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
        if (valor>0 && valor<1000000){
            while(valor>=100){
                cn100=cn100+1;
                valor= valor-100;
            }
            while(valor>=50){
                cn50=cn50+1;
                valor=valor-50;
            }
            while (valor>=20){
                cn20=cn20+1;
                valor=valor-20;
            }
            while (valor>=10){
                cn10=cn10+1;
                valor=valor-10;
            }
            while(valor>=5){
                cn5=cn5+1;
                valor=valor-5;
            }
            while(valor>=2){
                cn2=cn2+1;
                valor=valor-2;
            }
            while(valor>=1){
                cn1=cn1+1;
                valor=valor-1;
            }
        }
        System.out.println("a quantidade de notas de 100 é "+cn100);
        System.out.println("a quantidade de notas de 50 é "+cn50);
        System.out.println("a quantidade de notas de 20 é "+cn20);
        System.out.println("a quantidade de notas de 10 é "+cn10);
        System.out.println("a quantidade de notas de 5 é "+cn5);
        System.out.println("a quantidade de notas de 2 é "+cn2);
        System.out.println("a quantidade de notas de 1 é "+cn1);
    }
    
}
