

public class a101 {
	public static void main(String[] args){
		long a[]=new long[10];
		long sum=0;
		for(int t1=1;t1<11;t1++){
			String out="";
			for(int t2=0;t2<t1;t2++){
				a[t2]=f(t2);
				out+=a[t2]+"\t";
			}
			for(int t2=1;t2<t1;t2++){
				for(int t3=0;t3<t1-t2;t3++){
					a[t3]=a[t3+1]-a[t3];
				}
			}
			int x=t1-1;
//			do{
				for(int t2=1;t2<t1;t2++){
					a[t2]+=a[t2-1];
				}
				x++;
				out+=a[t1-1]+"\t";
				//System.out.println(t1+" "+a[t1-1]+" "+f(x));
//			}while(a[t1-1]==f(x));
			out+="("+f(x)+")";
			System.out.println(out);
			sum+=a[t1-1];
		}
		System.out.println(sum);
	}
	public static long f(long x){
		long f=1;
		for(int t=0;t<5;t++){
			f*=x;
			f-=1;
			f*=x;
			f+=1;
		}
		return f;
	}
}
