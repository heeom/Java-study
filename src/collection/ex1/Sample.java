package collection.ex1;

public class Sample {

    private Object obj;

    public Sample(Object obj) {
        this.obj = obj; }

    public Object getObj() {
        return obj; }

    public void printInfo(){
        System.out.println(obj.getClass().getName());
    }
}
