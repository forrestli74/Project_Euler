

public class a164 {
	public static void main(String[] args){
		long a[][]=new long[10][10];
		long b[][]=new long[10][10];
		long l;
		for(int t=0;t<10;t++){
			a[t][0]=1;
		}
		for(int t=2;t<=20;t++){
			for(int t1=0;t1<10;t1++){
				for(int t2=0;t2<10;t2++){
					l=10-t1-t2;
					for(int t3=0;t3<l;t3++){
						b[t3][t1]+=a[t1][t2];
					}
				}
			}
			for(int t1=0;t1<10;t1++){
				for(int t2=0;t2<10;t2++){
					a[t1][t2]=b[t1][t2];
					b[t1][t2]=0;
				}
			}
		}
		l=0;
		for(int t1=1;t1<10;t1++){
			for(int t2=0;t2<10;t2++){
				l+=a[t1][t2];
			}
		}
		System.out.println(l);
	}
}
