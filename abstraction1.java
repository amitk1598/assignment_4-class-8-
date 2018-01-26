
abstract class abstraction1 {
String colour;
String breed;
String name;
abstract void eat();
void speak(){
	
}
	
	
}

class pussy extends abstraction1{
	void eat(){
		colour = "red";
		breed = "labra";
		name = "tobby";
		System.out.println("chciken");
		System.out.println(colour);
		System.out.println(breed);
		System.out.println(name);
	}
}
