

public class a064 {
	public static void main(String[] args){
		int s=1,c,l1,l2,l3,f=0;
		boolean j1;
		for(int a=2;a<10001;a++){
			s++;j1=true;c=0;
			if(s*s==a){
				j1=false;
			}else{
				s--;
			}
			l1=1;;l2=1;l3=s;
			while(j1){
				l2=l1;
				l1=a-l3*l3;
				if(l1%l2==0){
					l1/=l2;
				}else{
					System.out.println("wrong,a:"+a+",s:"+s+",l:"+l1+" "+l2+" "+l3);
				}
				l3=-l3;
				while(l3<=s){
					l3+=l1;
				}
				l3-=l1;
				if(l1==1){
					j1=false;
				}
				//System.out.print(l1+" ");
				c++;
			}
			if(c%2==1){
				f++;
			}
			//System.out.println(" @"+a+" "+c);
		}
		System.out.println(f);
	}
}
