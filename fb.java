class Main {
	private static final int FB_LIMIT = 100;

	public static void main(final String[] args) {
		for (int i = 1; i <= FB_LIMIT; i++) {
			String out = "";

			if (i % 3 == 0) out = "Fizz";
			if (i % 5 == 0) out += "Buzz";

			if (out.equals("")) out = Integer.toString(i);

			System.out.println(out);
		}
	}
}
