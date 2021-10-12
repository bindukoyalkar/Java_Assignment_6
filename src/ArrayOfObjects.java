public class ArrayOfObjects {
    public ArrayOfObjects(String str){
        System.out.println(str);
    }
    public static void main(String[] args) {
        ArrayOfObjects []arr= new ArrayOfObjects[5];
        //below statement won't execute because there is no no-argument constructor in this class, hence
        // we have commented it
        //arr[0]=new ArrayOfObjects();
        arr[1]=new ArrayOfObjects("Hello");
    }
}
/* the initialization messages from the constructor are not printed because we have only
declared and instantiate the array of objects, but we have not created objects of class.
 */