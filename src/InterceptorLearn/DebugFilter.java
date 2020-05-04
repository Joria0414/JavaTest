package InterceptorLearn;

public class DebugFilter implements Filter{
    public void execute(String request){
        System.out.println("----DEBUG----request log: " + request);
    }
}
