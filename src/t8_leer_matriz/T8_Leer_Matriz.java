/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t8_leer_matriz;

import javax.swing.JOptionPane;

/**
 *
 * @author JeanR Pico
 */
public class T8_Leer_Matriz 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // Declaracion de variables
        int [][] M ;
        int [] A;
        int [] B;
        int m, n, a=0,b=0,na=0,nb=0;
        String rta ="";
        String rtab="";
        String rtam="";
        
        //Input
        m = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de filas de la matriz:"));
        n = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de columnas de la matriz:"));
        
        //Processing
        M = new int [m][n];
        
        for (int i=0; i<M.length;i++)
        {
            for (int j=0; j<M.length; j++)
            {
                M[i][j] = (int)(Math.random()*9+1);
            }
        }
        for (int i=0; i<M.length;i++)
        {
            for (int j=0; j<M.length;j++)
            {
                if(M[i][j]%2==0)
                {
                    a++;
                }
                else 
                {
                    b++;
                }
            }
        }
        A = new int [a];
        B = new int [b];
        
        for (int i=0; i<M.length;i++)
        {
            for (int j=0; j<M.length;j++)
            {
                if (M[i][j]%2==0)
                {
                    A[na]=M[i][j];
                    na++;
                }
                else 
                {
                    B[nb]=M[i][j];
                    nb++;
                }
            }
                    
        }
        //Output
        rtam = rtam ;
        for (int i=0;i<M.length;i++)
        {
            for (int j=0;j<M.length;j++)
            {
                rtam = rtam + M[i][j] + " ";
            }
            rtam = rtam + "\n";
        }
 
        rta = rta + "A =[";
        for (int i=0;i<A.length;i++)
        {
            if (i<A.length)
            {
                rta = rta + A[i]+", ";
            }
            else 
            {
                rta = rta + A[i];
            }
        }
        rta = rta + "]";
        
        
        rtab = rtab + "B =[";
        for (int i=0;i<B.length;i++)
        {
            if (i<B.length)
            {
                rtab = rtab + B[i]+", ";
            }
            else 
            {
                rtab = rtab + B[i];
            }
        }
         rtab = rtab + "]";
         
         JOptionPane.showMessageDialog(null,(rtam+"\n"+rta + "\n" + rtab));
         
         //Fin del programa
         System.exit(0);
    }
    
}
