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
public class Expenses {
    protected int number; //nº de identificaçao da despesa
    protected String type; //tipo de despesa
    protected float value; //valor da despesa
    protected String data; //data da despesa
    
    Expenses(int tempNumber, String tempType, float tempValue, String tempDate){
        number = tempNumber;
        type = tempType;
        value = tempValue;
        data = tempDate;
    }
}
