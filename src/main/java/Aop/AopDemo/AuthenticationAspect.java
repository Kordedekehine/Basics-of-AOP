package Aop.AopDemo;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AuthenticationAspect {

    @Pointcut("within(Aop.AopDemo..*)") //this basically defines inside the class that we will be performing the operation
    public void authenticatingPointCut(){

    }

    //we may be even authenticating a package sometimes
    @Pointcut("within(Aop.AopDemo.ShoppingCart*)") //Is either you use the dot or define the class
    public void authorizationPointCut(){

    }

    @Before("authenticatingPointCut() && authorizationPointCut()")
    public void authenticate(){
        System.out.println("Authenticating the request...");
    }
}
