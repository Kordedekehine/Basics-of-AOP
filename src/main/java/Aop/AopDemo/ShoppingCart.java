package Aop.AopDemo;

import org.springframework.stereotype.Component;

@Component
public class ShoppingCart {

    public void checkOut(String input) {
        //The cross-cutting concerns are
        //Logging
        //Authentication and Authorization
        //Sanitize the data
        //They are different aspects..make sense of the name
        System.out.println("Shopping Cart method is called");
    }

        public int quantity(){
            return 2;
        }


}
