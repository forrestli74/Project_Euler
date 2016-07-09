
public class a002{
	public static void main(String[] args){
		long a1,a2,a3;
		a1=0;
		a2=1;
		long sum=1;
		do{
			a3=a1+a2;
			a1=a2;
			a2=a3;
			sum+=a2;
		}while(a2<4000000);
		System.out.println((sum-a2)/2);
		
	}
}