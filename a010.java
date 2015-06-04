

public class a010 {
	public static void main(String[] args){
		boolean a[]=new boolean[2000000];
		long sum=0;
		for(int t1=2;t1<2000000;t1++){
			if(a[t1]==false){
				sum+=t1;
				for(int t2=t1;t2<2000000;t2+=t1){
					a[t2]=true;
				}
			}
		}
		System.out.println(sum);
	}
}
