
package ficha4ex2;

import ficha4ex2.exchange.CurrencyRates;

public class FICHA4EX2 {
    
    
    static CurrencyRates cambio;
    static double dolar, euro, iene, gbg;
    private static user user1;
    private static double total1=0, media1=0, total2=0, media2=0;
    
    
    public static void main(String[] args){
        user1.car.car_value= new double[]{1,2,3,4,5,6};
        user1.food.food_value= new double[]{4,5,6,7,8,9};
   
        System.out.println(user1.car.car_description);
        System.out.println(user1.car.car_value[2]);
        System.out.println(user1.food.food_description);
        System.out.println(user1.food.food_value[1]);
    
        for(int i=0;i<user1.car.car_value.length;i++){
            total1 = total1 + user1.car.car_value[i];
            media1 = total1 / user1.car.car_value.length;
        }
        for(int i=0;i<user1.food.food_value.length;i++){
            total2 = total2 + user1.food.food_value[i];
            media2 = total2 / user1.food.food_value.length;
        }     
        System.out.print("Total car:");
        System.out.println(total1);
        System.out.print("Total food:");
        System.out.println(total2);
        System.out.print("Media car:");
        System.out.println(media1);
        System.out.print("Media food:");
        System.out.println(media2);
        System.out.print("Total:");
        System.out.println(total1 + total2);
        System.out.print("Media:");
        System.out.println(media1 + media2);
        user1.total = total1 + total2;
        user1.media = media1 + media2;
        
        //dolar
        System.out.println("Dolar:" + user1.total * CurrencyRates.cambio[0][1]);
        System.out.println("Dolar:" + user1.media * CurrencyRates.cambio[0][1]);
        
        //Ienes
        System.out.println("Ienes:" + user1.total * CurrencyRates.cambio[2][1]);
        System.out.println("Ienes:" + user1.media * CurrencyRates.cambio[2][1]);
        
        //GBP
        System.out.println("GBP:" + user1.total * CurrencyRates.cambio[1][3]);
        System.out.println("GBP:" + user1.media * CurrencyRates.cambio[1][3]);
    }
    
    
    
}
