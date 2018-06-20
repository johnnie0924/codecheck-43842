package codecheck;

public class App {
	public static void main(String[] args) {
		for (int i = 0, l = args.length; i < l; i++) {
			if("decode".equals(args[0])) {
				System.out.println(decode(args[1]));
			}else if("encode".equals(args[0])) {
				System.out.println(encode(Long.parseLong(args[1])));
			}
		}
//		System.out.println(decode("B"));
//		System.out.println(decode("BB"));
//		System.out.println(decode("I"));
//		System.out.println(decode("BA"));
//		System.out.println();
//		System.out.println(encode(1));
//		System.out.println(encode(10));
//		System.out.println(encode(8));
//		System.out.println(encode(9));
//		System.out.println(encode(0));

	}

	public static String encode(long inInt) {
		String result = "";
		long temp = inInt;
		long temp2 = 0;
		do {
			temp2 = temp % 9;
			if (temp2 == 0) {
				result = result + "A";
			} else if (temp2 == 1) {
				result = result + "B";
			} else if (temp2 == 2) {
				result = result + "C";
			} else if (temp2 == 3) {
				result = result + "D";
			} else if (temp2 == 4) {
				result = result + "E";
			} else if (temp2 == 5) {
				result = result + "F";
			} else if (temp2 == 6) {
				result = result + "G";
			} else if (temp2 == 7) {
				result = result + "H";
			} else if (temp2 == 8) {
				result = result + "I";
			}
			temp = temp / 9;
		} while (temp > 0);

		return result;
	}

	public static long decode(String instr) {
		int result = 0;
		String[] ar = instr.split("");
		int j = 0;
		for (int i = ar.length - 1; i > -1; i--) {
			if ("A".equals(ar[i])) {
				result = result + 0;
			} else if ("B".equals(ar[i])) {
				result = (int) (result + 1 * Math.pow(9, j));
			} else if ("C".equals(ar[i])) {
				result = (int) (result + 2 * Math.pow(9, j));
			} else if ("D".equals(ar[i])) {
				result = (int) (result + 3 * Math.pow(9, j));
			} else if ("E".equals(ar[i])) {
				result = (int) (result + 4 * Math.pow(9, j));
			} else if ("F".equals(ar[i])) {
				result = (int) (result + 5 * Math.pow(9, j));
			} else if ("G".equals(ar[i])) {
				result = (int) (result + 6 * Math.pow(9, j));
			} else if ("H".equals(ar[i])) {
				result = (int) (result + 7 * Math.pow(9, j));
			} else if ("I".equals(ar[i])) {
				result = (int) (result + 8 * Math.pow(9, j));
			}
			j++;
		}

		return result;
	}

	public static String align(String instr) {
		String result = "";

		return result;
	}
}
