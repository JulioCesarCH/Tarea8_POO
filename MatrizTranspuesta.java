package Tarea8;
import javax.swing.*;
public class MatrizTranspuesta {
    private int A[][];
    private int T[][];
    private int f;
    private int c;
    private int val;

    public MatrizTranspuesta()
    {
        f = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad de Filas para la Matriz A"));

        c = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad de Columnas para la Matriz A"));

        this.A = new int[f][c];
        this.T = new int[c][f];
    }

    public void agregarMatrizA()
    {
        for (int f=0; f< this.A.length; f++)
        {
            for (int c=0; c < this.A[f].length; c++)
            {
                this.val = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Valor para A["+f+","+c+"]"));

                this.A[f][c] = this.val;
            }
        }
    }

    public void transponerMatriz(int X[][])
    {
        int valt;
        for (int f=0; f< X.length; f++)
        {
            for (int c=0; c < X[f].length; c++)
            {
                valt = X[f][c];
                this.T[c][f] = valt;
            }
        }
    }


    public void mostrarMatrizTranspuesta()
    {   
        this.transponerMatriz(A);

        for(int f=0; f < this.T.length; f++)
        {    
            // MATRIZ A
            for(int c=0; c < this.A[f].length; c++)
            {   
                System.out.printf("%5d ", this.A[f][c]);
            }
          System.out.print(" | ");
            //MATRIz TRANSPUESTA
            for(int c=0; c < this.T[f].length; c++)
            {   
                System.out.printf("%5d ", this.T[f][c]);
            }
          System.out.print(" | ");
          System.out.println();
        }
    }

    public static void main(String args[])
    {
        MatrizTranspuesta matriztranspuesta = new MatrizTranspuesta();
        matriztranspuesta.agregarMatrizA();
        System.out.println("\t\tA\t\ttranspuesta");
        for (int x = 0; x < 62; x++) {
            System.out.print("_");
        }
        matriztranspuesta.mostrarMatrizTranspuesta();
    }
}
