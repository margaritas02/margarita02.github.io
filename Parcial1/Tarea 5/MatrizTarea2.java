import java.util.Scanner;

public class MatrizTarea2 {
    public static void main(String[] args) {

        try (Scanner num = new Scanner(System.in)) {
            System.out.print("Ingresar el valor: ");
            int n=num.nextInt();

            int[][] a = {
                {2, 0, 1}, 
                {3, 0, 0}, 
                {5, 1, 1}
            };
            System.out.println("Matriz 3x3:");
     
            for (int i = 0; i < a.length; ++i) {
                for(int j = 0; j < a[i].length; ++j) {
                    System.out.print( "|"+a[i][j]+ "|");
                }
            System.out.println("");;
            }
      
            int[][] b = {
                {0, 0, 0}, 
                {0, 0, 0}, 
                {0, 0, 0}
                };
             System.out.println("Matriz multiplicada por " + n +  ":");

            for (int i = 0; i < a.length; ++i) {
                for(int j = 0; j < a[i].length; ++j) {
                 b[i][j] = n * a[i][j];
                }
            }

            for (int i = 0; i < a.length; ++i) {
                for(int j = 0; j < a[i].length; ++j) {
                    System.out.print( "|"+b[i][j]+ "|");
                }
             System.out.println(" ");;
            }
        }
    }
}