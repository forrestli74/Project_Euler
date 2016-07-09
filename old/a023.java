

public class a023 {
	public static void main(String[] args){
		long c1,c2;
		int vf=0;
		int tt=0;
		int f=0;
		int a[]=new int[7000];
		boolean b[]=new boolean[28124];
		for(int v=2;v<28124;v++){
			vf=v;
			c1=1;
			for(long t=2;t<=vf;t++){
				c2=0;
				while(vf%t==0){
					c2++;
					vf/=t;
				}
				c1*=(Math.pow(t,c2+1)-1)/(t-1);
			}
			if(c1>v*2){
				a[tt]=v;
				tt++;
			}
		}
		for(int t1=0;t1<7000;t1++){
			for(int t2=t1;t2<7000;t2++){
				if(a[t1]!=0&&a[t2]!=0&&a[t1]+a[t2]<28124){
					b[a[t1]+a[t2]]=true;
				}
			}
		}
		for(int t=1;t<28124;t++){
			if(b[t]==false){
				f+=t;
			}
		}
		System.out.println(f);
	}
}
