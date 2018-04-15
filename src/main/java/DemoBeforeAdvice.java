import java.lang.reflect.Method;
import org.springframework.aop.MethodBeforeAdvice;

public class DemoBeforeAdvice implements MethodBeforeAdvice{

  public void before(Method method, Object[] objects, Object o) throws Throwable {
    System.out.println("before method : " + method.getName());
  }
}
