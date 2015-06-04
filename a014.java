
public class a014 {
	public static void main(String[] args){
		long a,c,f=0,f2=0;
		for(int t=2;t<1000000;t++){
			a=t;
			c=1;
			while(a!=1){
				if(a%2==0){
					a/=2;
				}else{
					a=3*a+1;
				}
				c++;
			}
			if(f<c){
				f=c;
				f2=t;
			}
		}
		System.out.println(f+" "+f2);
	}
}
