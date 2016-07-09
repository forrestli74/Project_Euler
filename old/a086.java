
public class a086{
	public static void main(String[] args) {
		long sum=0,t1=0;
		while(sum<1000000){
			t1++;
			long l1=t1*t1;
			for(long t2=2;t2<t1*2;t2++){
				if(a000.sqrtif(l1+t2*t2)){
					long suml=0;
					if(t2>t1){
						suml=(t1*2-t2)/2+1;
					}else{
						suml=t2/2;
					}
					sum+=suml;
					System.out.println(t1+" "+t2+" "+suml);
				}
			}
		}
		System.out.println("all:"+t1+" "+sum);
	}
}
