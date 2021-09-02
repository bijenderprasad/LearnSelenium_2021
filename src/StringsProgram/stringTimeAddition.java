package StringsProgram;

public class stringTimeAddition {

	public static void main(String[] args) {
		String one = "08:55:15";
		String two = "20:15:15";
		String[] on = one.split(":");
		String[] tw = two.split(":");
		int[] ans = new int[3];
		int g = Integer.parseInt(on[1]);

		int len = 2;
		int carry = 0;
		for (int i = 2; i >= 0; i--) {

			int o = Integer.parseInt(on[i]);
			int w = Integer.parseInt(tw[i]);

			if (o + w > 60 && i != 0) {
				ans[i] = o + w - 60;
				carry = 1;
			} else
				ans[len] = o + w + carry;

			if (o + w > 24 && i == 0) {
				ans[i] = o + w - 24 + carry;
			}
			if (o + w < 24 && i == 0)
				ans[i] = o + w + carry;

			len--;

		}

		for (int x : ans) {
			System.out.print(x + ":");
		}
	}

}
