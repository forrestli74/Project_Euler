
public class a215 {
	static int datat=0;
	static boolean[][] data;
	final static int o1=32,o2=10;
	public static void main(String[] args){
		int[][] c=new int[o1+2][3];
		c[0][2]=1;
		for(int t=1;t<o1+2;t++){
			c[t][0]=c[t-1][1]+c[t-1][2];
			c[t][1]=c[t-1][0];
			c[t][2]=c[t-1][1];
		}
		int o3=c[o1+1][0];
		data=new boolean[o3][o1];
		list(new boolean[o1],0);
		long[][] m=new long[o2][o3];
		for(int t=0;t<o3;t++){
			m[0][t]=1;
		}
		boolean j;
		long sum;
		System.out.println("1:\t"+o3);
		for(int t1=1;t1<o2;t1++){
			for(int t2=0;t2<o3;t2++){
				for(int t3=t2+1;t3<o3;t3++){
					j=true;
					for(int t4=1;t4<o1;t4++){
						if(data[t2][t4]&&data[t3][t4]){
							j=false;
							break;
						}
					}
					if(j){
						m[t1][t2]+=m[t1-1][t3];
						m[t1][t3]+=m[t1-1][t2];
					}
				}
			}
			sum=0;
			for(int t=0;t<o3;t++){
				sum+=m[t1][t];
				if(sum<0){
					System.out.println("wrong");
				}
			}
			System.out.println((t1+1)+":\t"+sum);
		}
	}
	static void list(boolean[] a,int index){
		if(index==o1){
			data[datat]=a.clone();
			datat++;
			String out="";
			for(int t=0;t<o1;t++){
				out+=a[t]?"|":" ";
			}
			System.out.println(datat+": "+out+"|");
			return;
		}else if(index>o1){
			return;
		}
		boolean[] tem=a.clone();
		tem[index]=true;
		list(tem,index+2);
		list(tem,index+3);
	}
}
