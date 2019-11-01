import javax.swing.JOptionPane;
public class AbaixodaDiagonalPrincipal {
    public static void main(String[] args) {
                 int mat[][]= new int[3][3];
        for(int x=0;x<3;x++){
            for(int y=0;y<3;y++){
                mat[x][y]=Integer.parseInt(JOptionPane.showInputDialog(
                                                   "Digite um número inteiro"));
            }
        }
        System.out.println("Matriz completa:");
        for(int x=0;x<3;x++){
            for(int y=0;y<3;y++){
                System.out.print(mat[x][y]+"  ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("______________________________________");
        System.out.println("Abaixo da Diagonal Principal");
        for(int x=0;x<3;x++){
            for(int y=0;y<3;y++){
                if(y<x){
                    System.out.print(mat[x][y]+"  ");
                }
            }
            System.out.println();
        }
    }
}
