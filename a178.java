

public class a178 {
	public static void main(String[] args){
		long f=0;
		long[] data=new long[1000];
		long[] l;
		int l1,l2,l3;
		for(int t1=0;t1<10;t1++){
			data[t1*111]=1;
		}
		for(int t1=2;t1<41;t1++){
			l=new long[1000];
			for(int t2=0;t2<1000;t2++){
				l1=t2%10;
				l2=((t2/10)%10)*10;
				l3=(t2/100)*100;
				if(l1>0){
					if(l3==l1*100){
						l[l1-1+l2+l3-100]+=data[l1+l2+l3];
					}else{
						l[l1-1+l2+l3]+=data[l1+l2+l3];
					}
				}
				if(l1<9){
					if(l2==l1*10){
						l[l1+1+l2+l3+10]+=data[l1+l2+l3];
					}else{
						l[l1+1+l2+l3]+=data[l1+l2+l3];
					}
				}
			}
			data=l.clone();
			for(int t2=1;t2<10;t2++){
				f+=data[90+t2];
			}
		}
		System.out.println(f);
	}
}
