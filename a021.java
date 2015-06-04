
public class a021 {
	public static void main(String[] args){
		long c1,c2;
		int vf=0;
		long cf=0;
		long a[]=new long[20000];
		for(int v=2;v<20000;v++){
			vf=v;
			c1=1;
			for(long t=2;t<=vf;t++){
				c2=0;
				while(vf%t==0){
					c2++;
					vf/=t;
				}
				c1*=(Math.pow(t, c2+1)-1)/(t-1);
			}
			a[v]=(c1-v);
		}
		for(int v=2;v<10001;v++){
			if(a[v]>1&&a[v]<20000){
				if(a[(int) a[v]]==v&&a[v]!=v){
					cf+=v;
				}
			}
		}
		System.out.println(cf);
	}
}
