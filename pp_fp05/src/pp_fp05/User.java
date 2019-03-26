package pp_fp05;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Date;

/**
 *
 * @author Vitor Eduardo
 */
public class User {
    private static final int ID_SIZE = 3;
    protected char[] id;
    protected String name;
    protected String email;
    protected Date birthDate;
    protected Expenses[] expenses;
    
    public User(char[] tempId, String tempName, String tempEmail, 
            Date tempBirthDate, Expenses[] tempExpenses){
        id = tempId;
        name = tempName;
        email = tempEmail;
        birthDate = tempBirthDate;
        expenses = tempExpenses;        
    }

    User() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
