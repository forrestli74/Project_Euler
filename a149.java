

public class a149 {
	public static void main(String[] args){
		long[] temd = new long[4000000];
		long[][] data = new long[2000][2000];
		for(long t1=1;t1<56;t1++){
			temd[(int) (t1-1)]=(100003-t1*200003+300007*t1*t1*t1)%1000000-500000;
			data[0][(int) (t1-1)]=temd[(int) (t1-1)];
		}
		for(int t1=55;t1<4000000;t1++){
			temd[t1]=(temd[t1-24]+temd[t1-55]+1000000)%1000000-500000;
			data[t1/2000][t1%2000]=temd[t1];
			if(temd[t1]==86613){
				System.out.println(t1);
			}
		}
		System.out.println(temd[9]+" "+temd[99]);
		long max=0;
		for(int t1=0;t1<2000;t1++){
			for(int t2=0;t2<2000;t2++){
				long l1=data[t1][t2],l2=data[t2][t1];
				for(int t3=t1+1;t3<2000;t3++){
					l1+=data[t3][t2];
					l2+=data[t2][t3];
					if(l1>max){
						max=l1;
					}
					if(l2>max){
						max=l2;
					}
				}
			}
		}
		for(int t1=0;t1<2000;t1++){
			for(int t2=t1;t2<2000;t2++){
				long l1=data[t1][t2],l2=data[t2][t1];
				int lm=2000-t2+t1;
				for(int t3=t2+1;t3<lm;t3++){
					
				}
			}
		}
	}
}
