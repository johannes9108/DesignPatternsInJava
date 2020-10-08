package creational.builder;

public class LunchOrderBeanDemo {

	public static void main(String[] args) {
		LunchOrderBean lunchOrderBean = new LunchOrderBean();
		
		lunchOrderBean.setBread("Wheat");
		lunchOrderBean.setCondiments("Condiments");
		lunchOrderBean.setDressing("Dressing");
		lunchOrderBean.setMeat("Meat");
		
		System.out.println(lunchOrderBean);
	}
}
