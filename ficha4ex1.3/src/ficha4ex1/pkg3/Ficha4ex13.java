/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficha4ex1.pkg3;

/**
 *
 * @author Vitor Eduardo
 */
public class Ficha4ex13 {

    /**
     * @param args the command line arguments
     */
    static User user1, user2;
    public static void main(String[] args) {
        
        user1.id[0] = 'a';
        user1.id[1] = 'b';
        user1.id[2] = 'c';
        user1.name = new char[] {'z','e'};
        user1.email = new char[]{'z','e','@','g','m','a','i','l','.','c','o'
                ,'m'};
        user2.id[0] = '1';
        user2.id[1] = '2';
        user2.id[2] = '3';
        user2.name = new char[] {'v','i','t','o','r'};
        user2.email = new char[] {'v','i','t','o','r','@','g','m','a','i','l'
               ,'.','c','o','m'};
    System.out.println("USER1");
    System.out.println(user1.id);
    System.out.println(user1.name);
    System.out.println(user1.email);
    System.out.println("USER2");
    System.out.println(user2.id);
    System.out.println(user2.name);
    System.out.println(user2.email);
    }
    
}
