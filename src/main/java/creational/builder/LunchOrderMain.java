package creational.builder;

public class LunchOrderMain {
	public static void main(String[] args) {
		var lunchOrderBuilder = new LunchOrder.LunchOrderBuilder();
		lunchOrderBuilder.bread("bread").condiments("condiments").meat("meat").dressing("dressing");
		var lunchOrder = lunchOrderBuilder.build();
		System.out.println(lunchOrder.getBread());
		System.out.println(lunchOrder.getDressing());
		System.out.println(lunchOrder.getCondiments());
		System.out.println(lunchOrder.getMeat());
	}
}
