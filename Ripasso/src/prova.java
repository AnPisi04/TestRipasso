

class Class1{
	
	protected int a;
	
	public Class1() {
		a = 3;
	}
	
	public Class1(int a) {
		this.a = a;
	}
	
	
	public void incr() {
		
		a = a + 1;
	}
	
	public void incr1() {
		
		a = a + 1;
	}
	
	// overloading: metodi con stesso nome ma parametri diversi
	public void incr(int a) {
		
		this.a = this.a + 1;
	}
	
	public int getValue() {
		return a;
	}
	
	public void incValue(int a) {
		this.a = this.a + a;
	}
	
	public boolean equals(Class1 c) {
		return this.a == c.getValue();
	}
	
	// overriding: sovrascrivere un metodo
	public String toString() {
		return "Valore attributo a: " + this.a;
	}
	
}


class Class2 extends Class1{
	
	protected int b;
	
	public Class2() {
		super();   // utilizza il costruttore della classe estesa cioè viene chiamato public Class1() e il valore di a viene impostato a 3
		b = 1;
	}
	
	public void dec() {
		a = a - 1;
	}
	
	public void inc() {
		super.incr();
		b = b + 1;
	}
	
	public void incr1() {
		
		a = a + 2;
	}
	
	public String toString() {
		return "Valore attributo a: " + this.a + "valore b: " + this.b ;
	}
	
}


abstract class ClassAbstract {

	int a;
	
	public ClassAbstract() {
		a = 1;
	}
	
	public void inc() {
		a = a + 1;
	}
	
	// metodo astratto
	public abstract void dec();
	
}


 
interface ClassInterface{
	public void method1();
	public void method2();
}

class Class3 implements ClassInterface{
	
	int a;
	
	public Class3(){
		
	}
	
	public void method1() {
		a = a + 3;
	}
	
	public void method2() {
		a = a + 100;
	}
	
}

public class prova{
	
	public static void main(String[] args) {
		
		/*System.out.println("Prova");
		Class1 var1;
		var1 = new Class1();
		System.out.println(var1.getValue());
		var1.incr();
		System.out.println(var1.getValue());
		
		
		Class1 c1, c2;
		c1 = new Class1();
		c2 = c1;
		
		c1.incr();
		//c2.incr();
		System.out.println(c1.getValue());
		System.out.println(c2.getValue());*/
		
		/*Class1 c1 = new Class1();
		Class1 c2 = new Class1();;
		
		c1.incr();
		System.out.println(c1.getValue());
		System.out.println(c2.getValue());
		System.out.println(c2.equals(c1));*/
		
		/*Class1 c1 = new Class1();
		Class1 c2 = new Class1(4);
		
		System.out.println(c1.getValue());
		System.out.println(c2.getValue());*/
		
		/*String s0;
		String s1;
		s0 = "prova";
		System.out.println(s0);
		s0 = s0.replace('p', 'a');
		
		System.out.println(s0);*/
		
		/*Class1 c1 = new Class1();
		System.out.println(c1);*/
		
		/*int[] a;
		a = new int[50];
		
		System.out.println(a.length);*/
		
		/*Class1 c1 = new Class1();
		Class2 c2 = new Class2();
		System.out.println(c1.getValue());
		System.out.println(c2.getValue());
		c1.incr();
		c2.inc();
		System.out.println(c1);
		System.out.println(c2);*/
		
		//Class1 c = new Class2();
		
		//non posso eseguire un metodo che è in class2 e non in class1
		// non posso eseguire : c.dec();
		/*c.incr1();
		System.out.println(c.getValue());
		c.incr();
		System.out.println(c);*/
		
		// NON SI PUò FARE: Class2 c = new Class1();
		
		// non si può definire perchè astratta
		//ClassAbstract c = new ClassAbstract();
		
		
		//Class3 c3 = new Class3();

		
		String s = "12";
		int a;
		
		try {
			a = Integer.parseInt(s);
			
		}catch(Exception e) { // cattura tutte le eccezzioni
			a = 0;
		}
		finally {  // viene sempre eseguito. serve quando si opera sui file (se si devono aprire più file nel finally si chiudono ad esempio i file aperti precedentemente)
			System.out.println("Convertito");
		}
		
		System.out.println(a);
		
	}
	
	
}