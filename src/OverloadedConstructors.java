public class OverloadedConstructors {
    int num;
    public OverloadedConstructors(){
        this(10);
    }
    public OverloadedConstructors(int num){
        this.num=num;
    }
    public static void main(String[] args) {
        OverloadedConstructors obj=new OverloadedConstructors();
        System.out.println(obj.num);
    }
}
