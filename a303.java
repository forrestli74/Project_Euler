

public class a303 {
	static int o=10000;
	static long[] data=new long[o+1];
	public static void main(String[] args){
		long l;
		long c;
		long sum=0;
		long ll;
		for(int a=1;a<=o;a++){
			ll=1;
			for(int t=2;t<100;t++){
				if(a%t==0){
					ll=data[a]/t;
					if(ll==0){
						ll=1;
					}
					break;
				}
			}
			l=a*ll;
			c=ll;
			while(!che(l)){
				l+=a;
				c++;
			}
			data[a]=c;
			sum+=c;
			//if(a%100==0)
			System.out.println(sum+"\t"+a+"\t"+c+"\t"+l);
		}
		System.out.println(sum);
	}
	public static boolean che(long a){
		for(int t=51;t<58;t++){
			if((a+"").indexOf(t)!=-1){
				return false;
			}
		}
		return true;
	}
}
