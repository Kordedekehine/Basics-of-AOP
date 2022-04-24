package Aop.AopDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class AopDemoApplication {

//	public static void main(String[] args) {
//		SpringApplication.run(AopDemoApplication.class, args);
//
//		ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
//
//		ShoppingCart shoppingCart = context.getBean(ShoppingCart.class);
//		shoppingCart.checkOut();
//	}

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);

		ShoppingCart shoppingCart = context.getBean(ShoppingCart.class);
		shoppingCart.checkOut("Cancelled");
	}

}
