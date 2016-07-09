

public class a077 {
	public static void main(String[] args){
		int a[][]=new int[101][101];
		int c=1;
		int[] p=new int[27];
		int t1,l;
		boolean[] b=new boolean[101];
		for(int t=2;t<101;t++){
			if(!b[t]){
				p[c]=t;
				for(int tt=t+t;tt<101;tt+=t){
					b[tt]=true;
				}
				c++;
			}
		}
		p[26]=200;
		//System.out.println(c);
		for(int t=1;t<=100;t++){
			a[0][t]=1;
		}
		for(int t0=1;t0<=100;t0++){
			l=0;
			System.out.print(t0+"\t");
			for(t1=1;p[t1]<=t0;t1++){
				a[t0][t1]+=a[t0][t1-1];
				a[t0][t1]+=a[t0-p[t1]][t1];
				System.out.print(a[t0][t1]+"\t");
				l=t1;
			}
			//System.out.println("\n\n"+l);
			for(t1=l+1;p[t1]<=100;t1++){
				a[t0][t1]=a[t0][l];
				System.out.print(a[t0][l]+"\t");
			}
			System.out.println();
		}
	}
}
