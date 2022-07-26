package creational.builder;

public class LunchOrder {
	private final String bread;
	private final String condiments;
	private final String meat;
	private final String dressing;

	public LunchOrder(LunchOrderBuilder builder) {
		this.bread = builder.bread;
		this.condiments = builder.condiments;
		this.dressing = builder.dressing;
		this.meat = builder.meat;
	}

	public String getBread() {
		return bread;
	}

	public String getCondiments() {
		return condiments;
	}

	public String meat() {
		return meat;
	}

	public String getDressing() {
		return dressing;
	}

	public String getMeat() {
		return meat;
	}

	public static class LunchOrderBuilder {
		private String bread;
		private String condiments;
		private String meat;
		private String dressing;

		public LunchOrderBuilder() {
		}

		public LunchOrder build() {
			return new LunchOrder(this);
		}

		public LunchOrderBuilder bread(String bread) {
			this.bread = bread;
			return this;
		}

		public LunchOrderBuilder condiments(String condiments) {
			this.condiments = condiments;
			return this;
		}

		public LunchOrderBuilder meat(String meat) {
			this.meat = meat;
			return this;
		}

		public LunchOrderBuilder dressing(String dressing) {
			this.dressing = dressing;
			return this;
		}
	}
}
