

public class a015 {
	public static void main(String[] args){
		long f=1;
		int a=2;
		for(int t=21;t<=40;t++){
			f*=t;
			if(f%a==0&&a<21){
				f/=a;
				a++;
			}
		}
		System.out.println(f);
	}
	public static long jie(int a,int b){
		long f=1;
		for(int t=b+1;t<=a;t++){
			f*=t;
		}
		return f;
	}
}
