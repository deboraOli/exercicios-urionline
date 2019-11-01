package SomaFatoriais;

import javax.swing.JOptionPane;

/**08/02/2019
 * @author Débora
 */
public class SF1161 {
    public static void main(String[] args) {
        int m,n,f1=1,f2=1;
        JOptionPane.showMessageDialog(null,"Soma de dois fatoriais");
        m=Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
        n=Integer.parseInt(JOptionPane.showInputDialog("Digite outro número"));
        for(int i=m;i>=1;i--){
            f1=f1*i;
        }
        for(int i=n;i>=1;i--){
            f2=f2*i;
        }
        int soma=f1+f2;
        JOptionPane.showMessageDialog(null,"Fatorial de "+m+" é "+f1+" e Fatorial de "+n+" é "+f2+" A "
                + "soma desses fatoriais é "+soma);
    }
}
