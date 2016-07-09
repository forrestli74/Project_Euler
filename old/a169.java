
public class a169{
	static int[] data={25,27,30,35,38,40,50,52,57,58,60,64,66,68,71,72,74,78,83};
	//static int[] data={1,2,3};
	static int size,o;
	static long[][] f;
	public static void main(String[] args){
		size=data.length;
		o=data[size-1]+1;
		f=new long[o][size];
		for(int t1=0;t1<o;t1++){
			for(int t2=0;t2<size;t2++){
				f[t1][t2]=-1;
			}
		}
		for(int a=data[size-1];a>=data[size-2];a--){
			f[a][size-1]=(long)(data[size-1]-a+1);
		}
		for(int a=data[size-2];a>=0;a--){
			f[a][size-1]=(long)(data[size-1]-data[size-2]+1);
		}
		c(0,0);
		String s="";
		for(int t1=0;t1<o;t1++){
			for(int t2=0;t2<size;t2++){
				s+=f[t1][t2]+"\t";
			}
			s+="\n";
		}
		System.out.println(s);
	}
	public static long c(int a,int t){
		if(a>data[t]){
			return 0;
		}
		if(f[a][t]!=-1){
			return f[a][t];
		}
		long tem=0;
		if(t!=0&&data[t-1]>a){
			a=data[t-1];
		}
		for(int aa=data[t];aa>=a;aa--){
			tem+=c(aa+1,t+1);
		}
		f[a][t]=tem;
		return tem;
	}
}
