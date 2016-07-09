

public class a120 {
	public static void main(String[] args){
		long f=0;
		for(long t=3;t<=1000;t++){
			if(t%2==1){
				f+=t*(t-1);
			}else{
				f+=t*(t-2);
			}
		}
		System.out.println(f);
	}
}
