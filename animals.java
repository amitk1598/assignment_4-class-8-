
interface animals {
	void speak();
	void eat();

}
class cat implements animals{

	
	public void speak() {
		System.out.println("meow");}

	public void eat() {
		System.out.println("rat");}
	}

class dog implements animals{
	
	public void speak() {
		System.out.println("bark");}

	public void eat() {
		System.out.println("chicken");}
	}


