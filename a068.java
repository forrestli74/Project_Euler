

public class a068 {
	public static void main(String[] args){
		int a=0,l1,l2,l;
		byte b[]=new byte[10];
		boolean bb[]=new boolean[10];
		int ss;
		byte s[]=new byte[10];
		b[0]=5;
		boolean j=true;
		for(byte t=0;t<10;t++){
			s[t]=0;
		}
		s[0]=4;
		while(a<362880){
			for(byte t=0;t<10;t++){
				bb[t]=true;
			}
			bb[5]=false;
			l1=a;
			for(byte t=9;t>0;t--){
				l2=l1%t;
				l1/=t;
				l=9;
				do{
					if(bb[l]){
						l2--;
					}
					l--;
				}while(l2>=0);
				l++;
				b[10-t]=(byte) l;
				bb[l]=false;
				//System.out.print(l+" ");
			}
			//System.out.println();
			j=true;
			ss=b[9]+b[8]+b[1];
			for(int t=0;t<4;t++){
				if(ss!=b[2*t]+b[2*t+1]+b[2*t+2]){
					j=false;
				}
			}
			if(b[1]==9||b[2]==9||b[4]==9||b[6]==9||b[8]==9){
				j=false;
			}
			/*
			l=0;
			do{
				l++;
				if(s[l]>b[l])
					j=false;
			}while(s[l]==b[l]&&l<9);
			*/
			if(j){
				for(int t=0;t<10;t++){
					s[t]=b[t];
					System.out.print(b[t]+" ");
				}
				System.out.println("\t"+a);
			}
			a++;
		}
	}
}
