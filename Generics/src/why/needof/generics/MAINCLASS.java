package why.needof.generics;

public class MAINCLASS {
	public static void main(String[] args) {
		StoreInteger objStoreInteger= new StoreInteger(51);
		Integer returnvalInteger=objStoreInteger.getValue() ;
		System.out.println(returnvalInteger);
		
		StoreDouble objStoreDouble= new StoreDouble(5.01);
		Double returnvaldouble=objStoreDouble.getValue() ;
		System.out.println(returnvaldouble);
		
		StoreObject oStoreObject= new StoreObject(12.31);
		Object myObject=oStoreObject.getObject();
		System.out.println(myObject);
		
		StoreObject oStoreObject1= new StoreObject(121);
		Object myObject1=oStoreObject1.getObject();
		System.out.println(myObject1);
		
		StoreObject oStoreObject2= new StoreObject("hii this is shikhar pratap singh ");
		Object myObject2=oStoreObject2.getObject();
		System.out.println(myObject2);
		
		
		
		
		
	}

}
