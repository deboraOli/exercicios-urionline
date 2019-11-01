import javax.swing.JOptionPane;
public class TreinarDiagonalPrincipal {
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
        System.out.println("-------------------------------------");
        System.out.println("Diagonal principal da matriz:");
        for(int x=0;x<3;x++){
            for(int y=0;y<3;y++){
                if(y==x){
                    System.out.print(mat[x][y]+" ");
                }
            }
        }
        System.out.println();
        System.out.println("-------------------------------------");
        System.out.println("Diagonal principal Invertida da matriz:");
        int cta=2;
        for(int x=0;x<3;x++){
            for(int y=0;y<3;y++){
                if(cta==y){
                    System.out.print(mat[x][y]+"  ");
                }
            }
            cta--;
        }
    }
}
