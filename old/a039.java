
public class a039 {
	public static void main(String[] args){
		//int l1,l2,t3,c,f=0,fc=0;
		int n[]=new int[1001];
		int l1,l2,l,f=0,fc=0;
		for(byte a=2;a<40;a++){
			for(byte b=1;b<a;b++){
				l1=a;l2=b;l=2;
				while(l>1){
					l=l1%l2;
					l1=l2;
					l2=l;
				}
				if(l==1){
					l1=2*a*(a+b);
					l2=l1;
					while(l1<=1000){
						n[l1]++;
						l1+=l2;
					}
				}
			}
		}
		for(int t=1;t<=1000;t++){
			if(f<n[t]){
				f=n[t];
				fc=t;
			}
		}
		System.out.println(fc);
		
		
		
		
		/*for(int t1=4;t1<=61;t1++){
			l2=t1;
			c=0;t3=2;
			while(l2>1){
				if(l2%t3==0){
					l1=(int) Math.sqrt(l2);
					for(int t2=2;t2<l1;t2++){
						if(l2%t2==0&&l2/t2<t2*2){
							c++;
						}
					}
					l2/=t3;
				}else{
					t3++;
				}
			}
			if(fc<c){
				fc=c;
				f=t1;
			}
		}
		System.out.println(f*2+" "+fc);
		*/
	}
}
