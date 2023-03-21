package persona;

public class Persona {
	
	int edad;
	double altura;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Ejemplo. Nuevo ejemplo desde Github
		
		Persona obj1, obj2;
		
		obj1=new Persona();
		obj2=new Persona();
		
		obj1.edad=30;
		obj1.altura=1.75;
		obj2.edad=20;
		obj2.altura=1.80;
		
		System.out.println(obj1.edad);
		System.out.println(obj1.altura);
		System.out.println(obj2.edad);
		System.out.println(obj2.altura);
		
		

	}

}
