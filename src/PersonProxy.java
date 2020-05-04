//import java.lang.reflect.InvocationHandler;
//import java.lang.reflect.Proxy;
//import java.util.logging.Logger;
//
//public class PersonProxy implements InvocationHandler {
//    private Object delegate;
//    private final Logger logger = LoggerFactory.getLogger(this.getClass();
//    public Object bind(Object delegate) {
//        this.delegate = delegate;
//        return Proxy.newProxyInstance(delegate.getClass().getClassLoader(), delegate.getClass().getInterfaces(), this);
//    }
//
//    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//        Object result = null;
//        try {
//            logger.info("Before Proxy");
//            result = method.invoke(delegate, args);
//            logger.info("After Proxy");
//        } catch (Exception e) {
//            throw e;
//        }
//        return result;
//    }
//
//
//    public static void main(String[] args) {
//        PersonProxy personProxy = new PersonProxy();
//        IPerson iperson = (IPerson) personProxy.bind(new Person());
//        iperson.doSomething();
//    }
//
//}
//
