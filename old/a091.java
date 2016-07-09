

public class a091 {
	public static void main(String[] args){
		int o=51;
		long sum=0;
		int s1,s2,l,x,y;
		for(int t1=1;t1<o;t1++){
			for(int t2=1;t2<o;t2++){
				l=d(t1,t2);
				s1=t1/l;
				s2=t2/l;
				x=t1;y=t2;
				while(x<o&&0<=y){
					x+=s2;
					y-=s1;
					sum++;
				}
				x=t1;y=t2;
				while(0<=x&&y<o){
					x-=s2;
					y+=s1;
					sum++;
				}
				sum-=2;
			}
		}
		sum+=(o-1)*(o-1)*3;
		System.out.println(sum);
	}
	public static int d(int a,int b){
		int l;
		if(a<b){
			l=a;
			a=b;
			b=l;
		}
		while(b!=0){
			l=a%b;
			a=b;
			b=l;
		}
		return a;
	}
}
