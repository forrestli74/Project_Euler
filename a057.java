


public class a057 {
	public static void main(String[] args){
		byte[] f1=new byte[1000];
		byte[] f2=new byte[1000];
		byte[] l1=new byte[1000];
		byte[] l2=new byte[1000];
		f1[0]=3;
		f2[0]=2;
		int d1;
		int sum=0;
		for(int t=2;t<=1000;t++){
			l1[0]=0;l2[0]=0;
			for(int tt=0;tt<999;tt++){
				l1[tt]+=f1[tt]+f2[tt]*2;
				l1[tt+1]=(byte) (l1[tt]/10);
				l1[tt]=(byte) (l1[tt]%10);
				l2[tt]+=f1[tt]+f2[tt];
				l2[tt+1]=(byte) (l2[tt]/10);
				l2[tt]=(byte) (l2[tt]%10);
			}
			for(int tt=0;tt<999;tt++){
				f1[tt]=l1[tt];
				f2[tt]=l2[tt];
			}
			d1=999;
			while(f1[d1]==0){
				d1--;
			}
			if(f2[d1]==0){
				
				sum++;
			}
		}
		
		System.out.println(sum);
	}
}
