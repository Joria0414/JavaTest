package InterceptorLearn;

public class Target {
    public void execute(String request){
        System.out.println("----Target----Executing request: " + request);
    }
}
