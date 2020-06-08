package cn.bouncyslime.javaKnowledge.generic.genericMethod;

public class GenericMethods{
    public <T> void f(T x){
        System.out.println(x.getClass().getName());
    }
    
    public static void main(String[] args) {
		GenericMethods genericMethods = new GenericMethods();
		genericMethods.f("");
		genericMethods.f(2);
		genericMethods.f('c');
		genericMethods.f(2.2);
	}
}
