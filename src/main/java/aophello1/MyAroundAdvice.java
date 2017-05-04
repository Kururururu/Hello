package aophello1;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
/**
 * Created by user on 2017-05-04.
 */
public class MyAroundAdvice implements MethodInterceptor {//어드바이스 구현
    public Object invoke(MethodInvocation invocation)
        throws Throwable{
        System.out.println("메소드 실행전 안녕....");
        Object ref = invocation.proceed();
        System.out.println("메소드 실행후 안녕...");

        return ref;
    }
}
