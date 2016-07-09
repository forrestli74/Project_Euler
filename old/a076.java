

public class a076 {
	public static void main(String[] args){
		int a[][]=new int[101][101];
		for(int t=1;t<=100;t++){
			a[0][t]=1;
		}
		for(int t0=1;t0<=100;t0++){
			for(int t1=1;t1<=t0;t1++){
				a[t0][t1]+=a[t0][t1-1];
				a[t0][t1]+=a[t0-t1][t1];
				System.out.print(a[t0][t1]+"\t");
			}
			for(int t1=t0+1;t1<=100;t1++){
				a[t0][t1]=a[t0][t0];
				System.out.print(a[t0][t1]+"\t");
			}
			System.out.println();
		}
	}
}
