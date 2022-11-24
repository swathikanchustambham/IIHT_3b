public class MaxSingleTonClass{
    static MaxSingleTonClass obj = null;
    public static MaxSingleTonClass createObject(){
        if(obj == null){
            obj=new MaxSingleTonClass();
        }
        System.out.println("object created...");
        return obj;
        
    }
    //if method is called thrice then

    public static void main(String args[]){
        MaxSingleTonClass maxClasses[] =new MaxSingleTonClass[3];
        maxClasses[0] = MaxSingleTonClass.createObject();
        maxClasses[1] = MaxSingleTonClass.createObject();
        maxClasses[2] = MaxSingleTonClass.createObject();

        for(MaxSingleTonClass max : maxClasses){
    System.out.println(max.toString());
}
    }
}