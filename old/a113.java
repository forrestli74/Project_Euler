

public class a113 {
	public static void main(String[] args){
		long d[][]=new long[100][10];
		long i[][]=new long[100][10];
		long f=0;
		for(int t=0;t<10;t++){
			i[0][t]=1;
			d[0][t]=1;
		}
		int o=100;
		for(int t1=1;t1<o;t1++){
			for(int t2=0;t2<10;t2++){
				for(int t3=0;t3<=t2;t3++){
					i[t1][t2]+=i[t1-1][t3];
				}
				for(int t3=t2;t3<10;t3++){
					d[t1][t2]+=d[t1-1][t3];
				}
			}
			for(int t=1;t<10;t++){
				f+=i[t1][t]+d[t1][t];
			}
		}
		f-=9*(o-2);
		System.out.println(f);
	}
}
