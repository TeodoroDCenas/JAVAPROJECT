/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp_fp05;

/**
 *
 * @author Vitor Eduardo
 */
public class ExpensesDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Expenses[] Exp = new Expenses[45];
       Expenses[] Exp2 = new Expenses[45];
       
       
       User user1,user2;
      
       user2 = new User();
       
       Exp[0] = new Expenses(1,"coelhos",1256,"12/01/2019");
       Exp[1] = new Expenses(2,"sexshop",126,"12/01/2019");
       Exp2[0] = new Expenses(1,"coelhos",1256,"12/01/2019");
       Exp2[1] = new Expenses(2,"sexshop",126,"12/01/2019");
       
       user1 = new User(,"jaquim","zedasasturias@gmail.com","24/11/1981",
               Exp);
        
       System.out.println(user1.expenses[0]);
       System.out.println(user1.expenses[1]);
       System.out.println(user2.expenses[0]);
       System.out.println(user2.expenses[1]);
    }

    
}   
