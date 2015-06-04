
public class a009 {
	public static void main(String[] args){
		int c,t,f=0;
		for(int a=1;a<999;a++){
			for(int b=1;b+a<1000;b++){
				c=1000-a-b;
				t=a*a+b*b-c*c;
				if(t==0){
					f=a*b*c;
				}
			}
		}
		System.out.println(f);
	}
}
