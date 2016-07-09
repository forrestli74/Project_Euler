

public class a094 {
	public static void main(String[] args){
		long l1,l2,l,f=0;
		a000 x=new a000();
		for(long a=1;a<=166666667;a++){
			
			l2=a*(3*a+2);
			l=x.sqrt(l2);
			if(l*l==l2){
				f+=6*a+4;
				System.out.println((2*a+1)+","+(2*a+2));
			}
			l2+=2*a+1;
			l=x.sqrt(l2);
			if(l*l==l2){
				f+=6*a+2;
				System.out.println((2*a+1)+","+(2*a));
			}
		}
		System.out.println(f);
	}
}