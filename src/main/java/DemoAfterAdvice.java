import java.lang.reflect.Method;
import org.springframework.aop.AfterReturningAdvice;

public class DemoAfterAdvice implements AfterReturningAdvice{

  public void afterReturning(Object o, Method method, Object[] objects, Object o1)
      throws Throwable {
    System.out.println("after method" + method.getName());
  }
}
