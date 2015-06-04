

import java.util.Arrays;

public class a124 {
	public static void main(String[] args){
		long a[]=new long[100001];
		int l1,l2,f;
		for(int t=1;t<=100000;t++){
			l1=t;l2=2;f=1;
			while(l1!=1){
				while(l1%l2!=0){
					l2++;
				}
				while(l1%l2==0){
					l1/=l2;
				}
				f*=l2;
			}
			a[t]=f;
			a[t]*=1000000;
			a[t]+=t;
		}
		Arrays.sort(a);
		System.out.println(a[10000]);
	}
}
