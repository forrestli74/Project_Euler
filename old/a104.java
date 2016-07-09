

public class a104 {
	public static void main(String[] args){
		byte a[]=new byte[200000];
		byte b[]=new byte[200000];
		byte l[]=new byte[200000];
		byte ll=0;
		int c=3,d=1,t1;
		boolean j=true,jj;
		boolean n[]=new boolean[10];
		a[0]=1;b[0]=1;
		System.out.println("("+329468+")");
		for(t1=1;t1<10;t1++){
			n[t1]=true;
		}
		while(j){
			j=false;
			l[0]=0;
			for(t1=0;t1<d;t1++){
				l[t1]+=(a[t1]+b[t1]);
				l[t1+1]=(byte) (l[t1]/10);
				l[t1]=(byte) (l[t1]%10);
			}
			if(l[d]!=0)
				d++;
			for(t1=0;t1<d;t1++){
				a[t1]=b[t1];
				b[t1]=l[t1];
				//System.out.print(b[t1]);
			}
			
			for(t1=0;t1<9;t1++){
				n[b[t1]]=false;
			}
			for(t1=1;t1<10;t1++){
				if(n[t1]){
					j=true;
				}
				n[t1]=true;
			}
			
			if(d>8){
				for(t1=d-9;t1<d;t1++){
					n[b[t1]]=false;
				}
			}
			for(t1=1;t1<10;t1++){
				if(n[t1]){
					j=true;
				}
				n[t1]=true;
			}
			
			c++;
			//System.out.println(" "+(c-1));
		}
		System.out.println((c-1));
	}
}
