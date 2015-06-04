
public class a303b{
	
	/**
	 * @param args
	 */
	public static long[] bs;
	public static int o=10000;
	public static void main(String[] args) {
		bs=new long[o];
		long t=0;
		int count=o;
		long sum=0;
		while(count!=0){
			t++;
			long tem=1;
			long lt=t;
			long ll=0;
			while(lt!=0){
				ll+=tem*(lt%3);
				tem*=10;
				lt/=3;
			}
			for(int tt=1;tt<=o;tt++){
				if(ll%tt==0&&bs[tt-1]==0){
					bs[tt-1]=ll/tt;
					System.out.println(count+"\t"+tt+":\t"+ll+"\t"+(ll/t));
					sum+=ll/tt;
					count--;
				}
			}
		}
		System.out.println("sum:"+sum);
	}
	
}
