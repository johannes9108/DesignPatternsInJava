package structural.decorator;

public class DecoratorSandwichDemo {

	public static void main(String args[]) {
		SimpleSandwich sand = new SimpleSandwich();
		Sandwich sandwich = new DressingDecorator(new MeatDecorator(sand));
		
		System.out.println(sand.make());
		System.out.println(sandwich.make());
	}
}
