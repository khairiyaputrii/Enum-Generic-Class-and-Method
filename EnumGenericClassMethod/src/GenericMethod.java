public class GenericMethod {

    public <T> void printvalue(T obj){
        System.out.println("Value= " + obj);
        System.out.println("Type= " + obj.getClass().getName());
    }
}