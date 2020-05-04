package InterceptorLearn;

public class FilterManager {
    FilterChain filterChain;

    public FilterManager(Target target){
        System.out.println("----FilterManger constructor-----"+target.toString());
        filterChain = new FilterChain();
        filterChain.setTarget(target);
    }
    public void setFilter(Filter filter){
        System.out.println("----FilterManger setFile-----"+filter.toString());
        filterChain.addFilter(filter);
    }

    public void filterRequest(String request){
        System.out.println("----FilterManger filterRequest-----"+request.toString());
        filterChain.execute(request);
    }
}
