/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficha2ex2;

/**
 *
 * @author Vitor Eduardo
 */
public class Ficha2EX2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int matriz[][];
      matriz = new int[3][3];
      matriz[0][0] = 11;
      matriz[0][1] = 7;
      matriz[0][2] = 333;
      matriz[1][0] = -20;
      matriz[1][1] = -23;
      matriz[1][2] = 63;
      matriz[2][0] = -22;
      matriz[2][1] = 501;
      matriz[2][2] = 10000;
      for(int i=0;i<matriz.length;i++){
           for(int j=0;j<matriz.length;j++){
               System.out.println(matriz[i][j]);
           }
        }
     int media = 0, soma = 0;
     for(int i=0;i<matriz.length;i++){
           for(int j=0;j<matriz.length;j++){
               soma = soma + matriz[i][j];
               
           }
        }
     media = soma / 9;
     System.out.println(soma);
     System.out.println(media);
    }
    
}
