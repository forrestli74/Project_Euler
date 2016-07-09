import java.util.ArrayList;
import java.util.Arrays;


public class a293{
	public static long o=1000000010;
	public static int[] ps;
	public static ArrayList<Integer> ads;
	public static void main(String[] args) {
		int sum=0;
		ps=a000.primes(50847535, (int)o);
		ads=new ArrayList<Integer>();
		ads.add(2);
		c(2,0);
		Integer[] rads=new Integer[ads.size()];
		ads.toArray(rads);
		Arrays.sort(rads);
		boolean[] real=new boolean[100000];
		System.out.println(rads[2]);
		int len=rads.length;
		int x=0;
		for(int t=0;t<len;t++){
			int n=rads[t];
			while(ps[x]<n){
				x++;
			}
			if(!real[ps[x]-n]){
				System.out.println(ps[x]+" "+n);
				real[ps[x]-n]=true;
				sum+=ps[x]-n+1;
			}
		}
		System.out.println(sum);
	}
	public static void c(long n,int pi){
		long x=n*ps[pi];
		if(x<o){
			ads.add((int)x+1);
			c(x,pi);
			x=n*ps[++pi];
			if(x<o){
				ads.add((int)x+1);
				c(x,pi);
			}
		}
	}
}
