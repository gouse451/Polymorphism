package polymorphism;

public class MethodOverloadingDiffDataTypes {

	public void methodOne(int a){
        System.out.println(a);
    }
    
	public void methodOne(String a)
    {
       System.out.println(a);
    }	
	
	public static void main(String[] args) {

		MethodOverloadingDiffDataTypes obj = new MethodOverloadingDiffDataTypes();
		
		obj.methodOne(10);
		obj.methodOne("I am a String");
		
	}
}