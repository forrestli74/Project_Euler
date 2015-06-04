
public class a315{
	public static void main(String[] args){
		int[] l={95,3,118,115,43,121,125,75,127,123};
		int[][] ma=new int[10][10];
		String out="";
		for(int t1=0;t1<10;t1++){
			//out+="{";
			for(int t2=0;t2<10;t2++){
				ma[t1][t2]=c(l[t1]&l[t2]);
				out+=ma[t1][t2]+"\t";
			}
			out=out.substring(0,out.length()-1)+"\n";
		}
		System.out.println(out);
		int[] pr=a000.primes(2000000, 20000000);
		int t=0;
		while(pr[t]<10000000){
			t++;
		}
		int p1=pr[t],p2;
		t++;
		int sum=0;
		while(pr[t]!=0){
			p2=p1;
			p1=pr[t];
			int l1=p1,l2=p2;
			int tem=0;
			while(l2!=0){
				tem+=ma[l1%10][l2%10];
				l1/=10;
				l2/=10;
			}
			sum+=tem;
			//System.out.println(p1+"\t"+p2+"\t"+tem);
			t++;
		}
		System.out.println(t+"\t"+(sum*2));
	}
	public static int c(int cc){
		int f=0;
		if(cc<0){
			cc=-cc;
		}
		while(cc!=0){
			if(cc%2==1)
				f++;
			cc/=2;
		}
		return f;
	}
}
