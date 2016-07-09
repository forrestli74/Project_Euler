

import java.util.*;

public class a087 {
	public static void main(String[] args){
		boolean b[]=new boolean[8000];
		int a[]=new int[1669];
		int t=0,t1,t2,t3;
		long sum=0;
		long l1,l2,l3,l;
		boolean[][] d=new boolean[5000][10000];
		for(t2=2;t2<8000;t2++){
			if(!b[t2]){
				a[t]=t2;
				t++;
				for(t3=t2*2;t3<8000;t3+=t2){
					b[t3]=true;
				}
				System.out.print(t2+" ");
			}
			System.out.print(t2+" ");
		}
		System.out.println("\n"+t);
		for(t1=0;t1<1007;t1++){
			l1=a[t1]*a[t1];
			t2=0;
			l2=a[t2]*a[t2]*a[t2];
			while(l1+l2<50000000){
				t3=0;
				l3=a[t3]*a[t3]*a[t3]*a[t3];
				l=l1+l2+l3;
				while(l<50000000){
					if(!d[(int) (l/10000)][(int) (l%10000)]){
						d[(int) (l/10000)][(int) (l%10000)]=true;
						//System.out.println(a[t1]+" "+a[t2]+" "+a[t3]+"\t"+l);
						sum++;
					}else{
						//System.out.println(a[t1]+" "+a[t2]+" "+a[t3]+"\t"+l);
					}
					t3++;
					l3=a[t3]*a[t3]*a[t3]*a[t3];
					l=l1+l2+l3;
				}
				t2++;
				l2=a[t2]*a[t2]*a[t2];
			}
			//System.out.print(t1+" ");
		}
		System.out.println(sum);
	}
}
