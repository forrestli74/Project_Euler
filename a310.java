
public class a310 {
	public static void main(String[] args){
		int o=100000;
		long sum=0;
		boolean[] d;
		int[] data=new int[100001];
		int[] ss=new int[100001];
		int b;
		data[1]=1;
		for(int t=2;t<=100000;t++){
			d=new boolean[t];
			for(int tt=1;tt*tt<=t;tt++){
				d[data[t-tt*tt]]=true;
			}
			b=0;
			while(d[b]){
				b++;
			}
			data[t]=b;
		}
		for(int t1=0;t1<=o;t1++){
			ss[data[t1]]++;
			for(int t2=t1;t2<=o;t2++){
				sum+=ss[data[t1]^data[t2]];
			}
			if(t1%1000==0){
				System.out.println(t1);
			}
		}
		System.out.println(sum);
	}
}
