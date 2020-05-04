package InterceptorLearn;

public class Client {
    FilterManager filterManager;

    public void setFilterManager(FilterManager filterManager){
        System.out.println("----client setFileManager----"+filterManager.toString());
        this.filterManager = filterManager;
    }

    public void sendRequest(String request){
        System.out.println("----client sendRequest----"+request);
        filterManager.filterRequest(request);
    }
}
