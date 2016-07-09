

public class a225 {
	public static void main(String[] args){
		int c=0;
		int t=5,l1,l2,l3,l;
		while(c<124){
			l1=1;l2=1;l3=3;
			//System.out.print(t+":");
			br:{
				while(l1!=1||l2!=1||l3!=1){
					l=(l1+l2+l3)%t;
					l1=l2;
					l2=l3;
					l3=l;
					//System.out.print(l+" ");
					if(l==0){
						break br;
					}
				}
				c++;
				System.out.println(t);
			}
			t+=2;
		}
	}
}
