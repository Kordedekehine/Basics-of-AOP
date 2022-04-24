package Aop.AopDemo;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
  //  We dealing with what to call and how we want to call it
//Now the goal is whenever we want to check out, we want the logger to be called.Hence

    @Before("execution(* Aop.AopDemo.ShoppingCart.checkOut(..))") //in execution we define the particular
    // method we want to invoke
    public void beforeLogger(JoinPoint joinPoint){ //Sometimes we want the loggers to do something before
        //login
       // System.out.println(joinPoint.getSignature());
       String args = joinPoint.getArgs()[0].toString(); //get the first argument
        System.out.println("Before Loggers then get " + args);
    }

    @After("execution(* Aop.AopDemo.ShoppingCart.checkOut(..))") //the input of the method must equal
    //the aspect
    public void afterLogger(){
        System.out.println("After Loggers");
    }

    @Pointcut("execution(* Aop.AopDemo.ShoppingCart.quantity(..))")
    public void afterReturningPointCut(){

    }

    @AfterReturning(pointcut = "afterReturningPointCut()",returning = "retval")
    public void afterReturning(String retval){
        System.out.println("After Returning: " +retval
        );
    }
}
