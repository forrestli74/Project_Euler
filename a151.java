

public class a151 {
	static long cc=0;
	public static void main(String[] args){
		int[] a=new int[5];
		a[0]=1;
		System.out.println(c(a));
	}
	public static double c(int[] a){
		int size=0,index=0;
		for(int t1=0;t1<5;t1++){
			size+=a[t1];
		}
		if(size>0){
			int[] l;
			double f=0;
			if(size==1){
				f+=1;
			}
			for(int t1=0;t1<5;t1++){
				if(a[t1]!=0){
					l=a.clone();
					l[t1]-=1;
					for(int t2=t1+1;t2<5;t2++){
						l[t2]+=1;
					}
					for(int t2=0;t2<5;t2++){
						//System.out.print(l[t2]+" ");
					}
					//System.out.println("\n\t"+size+" "+index+" "+cc+" "+f);
					if(cc%10000000==0){
						System.out.println(cc/100000+" ");
					}
					cc++;
					f+=c(l)*a[t1]/size;
				}
			}
			return f;
		}else{
			return 0;
		}
	}
}
