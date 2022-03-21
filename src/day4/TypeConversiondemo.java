package day4;

public class TypeConversiondemo {

	public static void main(String[] args) {
		
	byte b = 127;
	int i = b; // implicit conversion by java compiler 
	System.out.println( b);
	System.out.println(i);
	
	
	int ii = 127;
	byte bb = (byte)  ii; // explicit conversion by java programmer
	System.out.println(ii);
    System.out.println(bb);
    
    int x = 200;
    byte y = (byte) x;	
    System.out.println(x);
    System.out.println(y);
    		
    		
    		
    		
	}
	

}
