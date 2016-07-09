
public class a006 {
	public static void main(String[] args){
		long sum=0;
		for(byte t1=1;t1<101;t1++){
			for(byte t2=1;t2<101;t2++){
				sum+=t1*t2;
			}
			sum-=t1*t1;
		}
		System.out.println(sum);
	}
}
