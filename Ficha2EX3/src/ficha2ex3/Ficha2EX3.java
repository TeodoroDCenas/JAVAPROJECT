/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficha2ex3;

/**
 *
 * @author Vitor Eduardo
 */
public class Ficha2EX3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] lista = {12, 5, -21, 10, -345, 22, 50, -125, 80, -1};
        int multi=1, nega=0, maior=lista[0];
        
        for(int i=0;i<lista.length;i++){
            if (lista[i]>0){
               multi = multi * lista[i];
            }
            if(lista[i]<0){
                nega++;
            }
            if(lista[i] > maior)
                maior =lista[i];
        }
       
        System.out.println(multi);
        System.out.println(nega);
        System.out.println(maior);
    }
    
}
