

public class a179 {
	static int[] p=new int[664579];
	static boolean[] b=new boolean[10000000];
	public static void pp(){
		int t1=0;
		b[1]=true;
		for(int t2=2;t2<10000000;t2++){
			if(!b[t2]){
				p[t1]=t2;
				t1++;
				for(int t3=t2*2;t3<10000000;t3+=t2){
					b[t3]=true;
				}
			}
		}
	}
	public static void main(String[] args){
		long sum=360463;
		pp();
		long time=System.currentTimeMillis();
		for(int a=3600001;a<10000000;a++){
			if(divcount(a)){
				sum++;
				//System.out.println(a);
			}
			if(a%100000==0){
				System.out.println(a/100000+"\t"+sum+"\t"+(System.currentTimeMillis()-time));
			}
		}
		System.out.println(sum);
	}
	public static boolean divcount(int x){
		int l1=x,l3,f=1;
		int l2=0;
		boolean j;
		while(l1!=1){
			j=true;
			while(j){
				if(l1%p[l2]==0){
					j=false;
				}else{
					l2++;
				}
			}
			l3=1;
			while(l1%p[l2]==0){
				l1/=p[l2];
				l3++;
			}
			f*=l3;
			if(!b[l1]){
				f*=2;
				l1=1;
			}
		}
		l1=x+1;
		l2=0;
		while(l1!=1){
			j=true;
			while(j){
				if(l1%p[l2]==0){
					j=false;
				}else{
					l2++;
				}
			}
			l3=1;
			while(l1%p[l2]==0){
				l1/=p[l2];
				l3++;
			}
			if(f%l3==0){
				f/=l3;
			}else{
				return false;
			}
			if(!b[l1]){
				if(f==2){
					return true;
				}else{
					return false;
				}
			}
		}
		if(f==1){
			return true;
		}else{
			return false;
		}
	}
}
