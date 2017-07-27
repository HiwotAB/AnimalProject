
public class AnimalApp {

	public static void main(String[] args) {

		Animal a = new Animal();
		print(a.eat());
		print(a.sleep());
		

		Cat c = new Cat();
		print(c.eat());
		print(c.sleep());
		print(c.purr());
		

		Bird b = new Bird();
		print(b.eat());
		print(b.sleep());
		print(b.fly());
		
		
		Dogs myDogs = new Dogs();
		print(myDogs.eat());
		print(myDogs.sleep());
		print(myDogs.barks());
		print(myDogs.search());
		
		Rabbit myRabbit= new Rabbit();
		print(myRabbit.eat());
		print(myRabbit.sleep());
		print(myRabbit.teeth());
		print(myRabbit.jumps());
		

	}
	private static void print(String s){
		System.out.println(s);
		
	}
}
