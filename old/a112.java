
import java.util.Scanner;

public class a112 {

			static long[][] data = new long[12][9];
			static long[][] datai = new long[12][10];
			static long[][] datad = new long[12][10];

			public static void main(String[] args) {
						for (int t = 0; t < 9; t++) {
									data[1][t] = 1;
						}
						for (int t1 = 2; t1 < 12; t1++) {
									for (int t2 = 0; t2 < 9; t2++) {
												for (int t3 = t2; t3 < 9; t3++) {
															data[t1][t2] += data[t1 - 1][t3];
												}
									}
						}
						for (int t = 0; t < 10; t++) {
									datad[1][t] = 1;
									datai[1][t] = 1;
						}
						for (int t1 = 1; t1 < 12; t1++) {
									for (int t2 = 0; t2 < 9; t2++) {
												for (int t3 = t2; t3 < 9; t3++) {
															datai[t1][t2 + 1] += data[t1 - 1][t3];
												}
												datad[t1][t2 + 1] = 1;
												for (int t3 = 0; t3 <= t2; t3++) {
															datad[t1][t2 + 1] += datad[t1 - 1][t3 + 1];
												}
									}
									for (int t2 = 0; t2 < 10; t2++) {
												datai[t1][0] += datai[t1 - 1][t2];
												datad[t1][0] += datad[t1 - 1][t2];
									}
						}
						String title = "10^:\t";
						for (int t = 0; t < 10; t++) {
									title += t + "\t";
						}
						String out1 = title + "\n", out2 = out1;
						for (int t1 = 1; t1 < 12; t1++) {
									out1 += t1 + "\t";
									out2 += t1 + "\t";
									for (int t2 = 0; t2 < 10; t2++) {
												out1 += datai[t1][t2] + "\t";
												out2 += datad[t1][t2] + "\t";
									}
									out1 += "\n";
									out2 += "\n";
						}
						System.out.print(out1 + "\n" + out2);
						Scanner scanner = new Scanner(System.in);
						while (true) {
									System.out.println(test(scanner.nextLong()));
						}
			}

			public static String test(long n) {
						long f = 0;
						String out = "";
						int log = (int) Math.log10(n) + 1;
						int[] dig = new int[log + 1];
						boolean j = true, ji = true, jd = true;
						for (int t = 1; t <= log; t++) {
									dig[t] = (int) (n % 10);
									n /= 10;
						}
						for (int t = 0; t < dig[log]; t++) {
									f += datai[log][t] + datad[log][t] - 1;
						}
						f -= 9 * log - 9;
						out += f + "\n";
						int tt = log;
						while (tt > 1 && dig[tt] == dig[tt - 1]) {
									tt--;
						}
						if (dig[tt - 1] >= dig[log]) {
									f++;
						}
						out += f + "\n";
						int tt1 = log - 1;
						while (tt1 > 0 && dig[tt1] >= dig[tt1 + 1]) {
									for (int t2 = dig[tt1 + 1]; t2 < dig[tt1]; t2++) {
												f += datai[tt1][t2];
									}
									tt1--;
						}
						out += f + "\n";
						tt1 = log - 1;
						while (tt1 > 0 && dig[tt1] <= dig[tt1 + 1]) {
									if (dig[tt1] > 0) {
												f++;
									}
									for (int t2 = 1; t2 < dig[tt1]; t2++) {
												f += datad[tt1][t2];
									}
									tt1--;
						}
						out += f + "\n";
						return out;
			}
}
