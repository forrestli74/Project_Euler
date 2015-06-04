

public class a007 {
	public static void main(String[] args){
		long a[]=new long[10001];
		a[0]=2;
		boolean j,j2;
		for(int t1=0;t1<10000;t1++){
			j=false;
			for(long t2=a[t1];t2<2*a[t1]&&j==false;t2++){
				j2=false;
				for(int t3=0;t3<=t1;t3++){
					if(t2%a[t3]==0){
						j2=true;
					}
				}
				if(j2==false){
					j=true;
					a[t1+1]=t2;
				}
			}
		}
		System.out.println(a[10000]);
	}
}
