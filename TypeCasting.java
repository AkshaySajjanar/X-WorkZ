class TypeCasting{
	public static void main(String args[]){
		int a = 10;
		int b = 20; 
		double c = 12.34;
		double d = 13.45;
		
		c = a; //Impliciting: which assigns lower datatype to higher datatype.
		System.out.println(c);
		
		b = (int)d; //Expliciting: Which assigns higher datatype to lower datatype.
		System.out.println(b);
		
	}
}
