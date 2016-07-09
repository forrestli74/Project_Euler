

public class a062 {
	public static void main(String[] args){
		byte[][] a=new byte[30001][11];
		long l;
		boolean j;
		for(long t=1;t<30000;t++){
			l=t*t*t;
			while(l!=0){
				a[(int) t][(int) (l%10)]++;
				l/=10;
			}
			for(int t2=1;t2<t;t2++){
				j=true;
				for(int t3=0;t3<10;t3++){
					if(a[t2][t3]!=a[(int) t][t3]){
						j=false;
						break;
					}
				}
				if(j){
					a[t2][10]++;
					if(a[t2][10]>=4){
						System.out.println(a[t2][10]+" "+t2+" "+t);
					}
				}
			}
		}
	}
}
