import java.util.ArrayList;


public class a209{
	public static void main(String[] args){
		int[] data=new int[64];
		ArrayList<Integer> count=new ArrayList<Integer>();
		for(int t=0;t<64;t++){
			data[t]=-1;
		}
		for(int t1=0;t1<64;t1++){
			if(data[t1]==-1){
				int tt=0;
				int l1=t1;
				int l2=c(t1);
				do{
					System.out.println(l1+" "+l2);
					data[l1]=l2;
					l1=l2;
					l2=c(l2);
					tt++;
				}while(l1!=t1);
				count.add(tt);
			}
		}
		long[] a0,a1,a;
		a0=new long[50];
		a1=new long[50];
		a=new long[50];
		a1[0]=1;
		for(int t=0;t<49;t++){
			a0[t+1]=a1[t]+a0[t];
			a1[t+1]=a0[t];
			a[t+1]=a0[t+1]+a1[t+1]*2;
			System.out.println(t+1+"\t"+a[t+1]);
		}
		long f=1;
		for(Integer x:count){
			f*=a[x];
			System.out.println(x+":\t"+f);
		}
	}
	public static int c(int x){
		boolean j=((x&32)==32)^((x&24)==24);
		x<<=1;
		x&=63;
		x+=j?1:0;
		return x;
	}
}
