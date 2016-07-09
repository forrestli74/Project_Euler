/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jiaqi
 */
public class a352 {

	public static double p;
	public static final double L2 = Math.log(.5);

	public static void main(String[] args) {
		p = 0.02;
		System.out.println(t(25,false));
	}

	public static double t(int a,boolean pp) {
		if (a == 1) {
			return 1;
		}
		int size = (int) (L2 / Math.log(1 - p));
		int l1 = a / size;
		int l2 = a - l1 * size;
		l1++;
		double sum1 = a, sum2 = l1 + 1;
		if(pp){
			double e1,e2;
			double l=0;
			do{
				l++;
				e1=Math.pow(1-p, a/l);
				e2=2-Math.pow(2, 1-l);
			}while(e1<e2);
		}
		if (l1 != 0) {
			size = a / l1;
			l2 = a - l1 * size;
			l1 -= l2;
			sum1 = r(size, l1, l2);
		l1 += l2;
		}
		l1++;
		size = a / l1;
		l2 = a - l1 * size;
		l1 -= l2;
		sum2 = r(size, l1, l2);

		return sum1 < sum2 ? sum1 : sum2;
	}

	public static double r(int size, int l1, int l2) {
		double sum = l1 + l2;
		double p1 = Math.pow(1 - p, l1);
		double p2 = Math.pow(1 - p, l2);
		sum += t(size,true) * (1 - p1);
		sum += t(size + 1,true) * (1 - p2);
		System.out.println(size + " " + l1 + " " + l2 + ":" + sum);
		return sum;
	}
}
