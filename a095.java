

public class a095 {
	public static void main(String[] args){
		a000 x=new a000();
		int o=1000000;
		int a[]=new int[1000];
		int l,t1,t2,fl=0,f=0;
		long time;
		boolean j,j2;
		boolean b[]=new boolean[o+1];
		time=System.currentTimeMillis();
		for(int t=6;t<o;t++){
			l=t;t1=0;
			j=!b[t];
			do{
				l=(int) x.divsum(l);
				//System.out.println(l);
				a[t1]=l;
				if(l==1||l>o){
					j=false;
				}else if(b[l]){
					j=false;
				}
				for(t2=0;t2<t1;t2++){
					if(l==a[t2])
						j=false;
				}
				if(l==t||l==1){
					j=false;
					for(t2=0;t2<t1;t2++){
						b[a[t2]]=true;
					}
					
					if(l==t){
						System.out.println(l+" "+t1+" "+(System.currentTimeMillis()-time));
						if(fl<t1){
							fl=t1;
							f=t;
						}
					}
				}
				t1++;
			}while(j);
			
		}
		System.out.println(fl+1);
	}
}
