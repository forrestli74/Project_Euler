
public class a240 {
	public static void main(String[] args){
		int o1=5,o2=6,o3=15,o4=3;
		long[][] data=new long[o2+1][o4*o2+1];
		data[o2][0]=1;
		long[][] data2 =new long[o2+1][];
		int lt;
		for(int t1=0;t1<o4;t1++){
			for(int t=0;t<=o2;t++){
				data2[t]=data[t].clone();
				data[t]=new long[o4*o2+1];
			}
			for(int t2=1;t2<=o2;t2++){
				for(int tt=1;tt<=o2;tt++){
					if(tt<t2){
						lt=tt;
					}else{
						lt=t2;
					}
					for(int t3=0;t3<=(o4-1)*o2;t3++){
						data[lt][t3+t2]+=data2[tt][t3];
					}
				}
			}
		}
		long sum=0;
		for(int t=1;t<=o2;t++){
			sum+=data[t][o3]*(long)Math.pow(t,o1-o4);
		}
		System.out.println(sum);
	}
}
