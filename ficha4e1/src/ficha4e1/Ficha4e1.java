/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficha4e1;

/**
 *
 * @author Vitor Eduardo
 */
public class Ficha4e1 {

    /**
     * @param args the command line arguments
     */
    static User user1;
    public static void main(String[] args) {
        //User user1 = null;
        user1.id[0] = 'a';
        user1.id[1] = 'b';
        user1.id[2] = 'c';
        user1.name = new char[] {'z','e'};
        user1.email = new char[]{'z','e','@','g','m','a','i','l','.','c','o'
                ,'m'};
    System.out.println("USER1");
    System.out.println(user1.id);
    System.out.println(user1.name);
    System.out.println(user1.email); 
    }
    
}
