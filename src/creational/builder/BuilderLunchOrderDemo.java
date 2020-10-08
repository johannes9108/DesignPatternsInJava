package creational.builder;

public class BuilderLunchOrderDemo {

	public static void main(String[] args) {
		LunchOrder.Builder builder = new LunchOrder.Builder();
		builder.bread("Wheat").meat("K�ttf�rs");
		
		LunchOrder lunchOrder = builder.build();
		
		System.out.println(lunchOrder);
	}
}
