import java.util.Scanner;

public class byteConvert {
	private static long		step1	= 1024, step2 = step1 * step1, step3 = step1 * step2, step4 = step1 * step3;
	private static int		option;
	private static Scanner	in		= new Scanner(System.in);

	public static void main(String args[]) {
		System.out.println("Please choose an option. Convert from: ");
		System.out.println("1 Bytes.");
		System.out.println("2 KiloBytes.");
		System.out.println("3 MegaBytes.");
		System.out.println("4 GigaBytes.");
		System.out.println("5 TeraBytes.");

		option = in.nextInt();
		convert(option);

		in.close();
	}

	private static int convert(int a) {

		switch (a) {
			case 1:
				option = in.nextInt();
				bytes(option);
				break;
			case 2:
				option = in.nextInt();
				kbytes(option);
				break;
			case 3:
				option = in.nextInt();
				mbytes(option);
				break;
			case 4:
				option = in.nextInt();
				gbytes(option);
				break;
			case 5:
				option = in.nextInt();
				tbytes(option);
				break;
			default:
				break;
		}
		return a;
	}

	private static long bytes(long a) {
		System.out.println("    Bytes: " + a);
		System.out.println("Kilobytes: " + (double) a / step1);
		System.out.println("Megabytes: " + (double) a / step2);
		System.out.println("Gigabytes: " + (double) a / step3);
		System.out.println("Terabytes: " + (double) a / step4);
		return a;
	}

	private static long kbytes(long a) {
		System.out.println("    Bytes: " + a * step1);
		System.out.println("Kilobytes: " + a);
		System.out.println("Megabytes: " + (double) a / step1);
		System.out.println("Gigabytes: " + (double) a / step2);
		System.out.println("Terabytes: " + (double) a / step3);
		return a;
	}

	private static long mbytes(long a) {
		System.out.println("    Bytes: " + a * step1);
		System.out.println("Kilobytes: " + a * step1);
		System.out.println("Megabytes: " + a);
		System.out.println("Gigabytes: " + (double) a / step1);
		System.out.println("Terabytes: " + (double) a / step2);
		return a;
	}

	private static long gbytes(long a) {
		System.out.println("    Bytes: " + a * step3);
		System.out.println("Kilobytes: " + a * step2);
		System.out.println("Megabytes: " + a * step1);
		System.out.println("Gigabytes: " + a);
		System.out.println("Terabytes: " + (double) a / step1);
		return a;
	}

	private static long tbytes(long a) {
		System.out.println("    Bytes: " + a * step4);
		System.out.println("Kilobytes: " + a * step3);
		System.out.println("Megabytes: " + a * step2);
		System.out.println("Gigabytes: " + a * step1);
		System.out.println("Terabytes: " + a);
		return a;
	}
}