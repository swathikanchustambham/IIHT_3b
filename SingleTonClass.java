//start coding a new program
public class SingleTonClass {
    static SingleTonClass obj = null;
    public static SingleTonClass createObject(){
        if(obj == null){
            obj=new SingleTonClass();
            System.out.println("Object created");
        }
        return obj;
    }
    public static void main(String args[]){
        SingleTonClass.createObject();
    }
}
