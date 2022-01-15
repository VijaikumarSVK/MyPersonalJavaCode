package OOPConcepts;

public class CallByValueAndCallByReference {
	
	 int p;
	int q;
	

	public static void main(String[] args) {

		CallByValueAndCallByReference obj = new CallByValueAndCallByReference();

		int q = 123;
		int h = 200;
		int j = obj.testsum(q, h); // call by value OR pass by value
		System.out.println(j);
		
		obj.p = 10;
		obj.q = 20;
			
		//after swap
		obj.swap(obj);
		System.out.println(obj.p);
		System.out.println(obj.q);
	}

	public int testsum(int a, int b) {   // call by value OR pass by value
		a = 500;
		b = 500;
		int c = a + b; 

		return c;
	}
	//call by reference
	public void swap(CallByValueAndCallByReference t){
		int vijai;
		vijai = t.p; // vijai = 10
		t.p = t.q; // t.p = 20
		t.q = vijai; // t.q = 10
		
		
	}
	
}
