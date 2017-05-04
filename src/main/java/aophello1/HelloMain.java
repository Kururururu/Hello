package aophello1;

import org.springframework.aop.framework.ProxyFactory;

/**
 * Created by user on 2017-05-04.
 */
public class HelloMain {
    public static void main(String args[]){
        lprintMsg target = new printMsg();

        ProxyFactory pf = new ProxyFactory();
        pf.addAdvice(new MyAroundAdvice());
        pf.setTarget(target);
        printMsg proxy = (printMsg)pf.getProxy();
        proxy.sayHello();
    }
}
