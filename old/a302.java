
import java.math.*;
public class a302 {
	public static void main(String[] args){
		int o=1000000;
		int oo=78498;
		int l1,l2,c,c2;
		long o2=(long)o*o*o;
		long max;
		long f;
		int tt;
		int sum=0;
		boolean[] b=new boolean[o];
		int[][] d=new int[oo][20];
		int[] p=new int[oo];
		int[] m1=new int[oo];
		int[] m2=new int[oo];
		c=0;
		boolean j;
		for(int t0=2;t0<o;t0++){
			if(!b[t0]){
				p[c]=t0;
				c++;
				for(int t1=t0*2;t1<o;t1+=t0){
					b[t1]=true;
				}
			}
		}
		System.out.println(c);
		for(int t0=0;t0<oo;t0++){
			l1=p[t0]-1;
			l2=0;c=0;
			while(l1!=1){
				if(l1%p[l2]==0){
					l1/=p[l2];
					if(l1%p[l2]==0){
						j=true;
						d[t0][c]=l2+1;
						while(l1%p[l2]==0){
							l1/=p[l2];
						}
					}else{
						d[t0][c]=-l2-1;
					}
					c++;
				}
				l2++;
			}
			j=false;
			max=o2/p[t0]/p[t0]/p[t0];
			/*
			for(int t1=0;t1<c;t1++){
				if(d[t0][t1]<0){
					max/=p[-d[t0][t1]-1];
				}
			}
			*/
			j=true;
			f=1;
			for(int t1=0;t1<t0;t1++){
				m1[t1]=0;
			}
			System.out.println("max"+max);
			br:
			while(true){

				//System.out.println(f);
				c2=0;
				j=true;
				while(j){
					if(c2>t0){
						break br;
					}
					j=false;
					m1[c2]++;
					f*=p[c2];
					if(f>max){
						j=true;
						f/=Math.pow(p[c2], m1[c2]);
						m1[c2]=0;
						c2++;
					}
					System.out.print(".");
				}
				//System.out.println(f);
				m2=m1.clone();
				for(int t1=0;t1<t0;t1++){
					if(m2[t1]!=0){
						m2[t1]--;
						tt=0;
						while(d[t1][tt]!=0){
							if(d[t1][tt]<0){
								m2[-d[t1][tt]-1]++;
							}else{
								m2[d[t1][tt]-1]+=2;
							}
						}
					}
				}
				for(int t1=0;t1<c;t1++){
					if(d[t0][t1]<0){
						m2[-d[t0][t1]-1]++;
					}else if(d[t0][t1]>0){
						m2[d[t0][t1]-1]+=2;
					}
				}
				for(int t1=0;t1<t0;t1++){
					if(m2[t1]==1){
						break br;
					}
				}
				System.out.println(m1[0]+" "+f);
				sum++;
			}
		}
	}
}
