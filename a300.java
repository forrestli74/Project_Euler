

public class a300 {
	public static void main(String[] args){
		int size=8;
		byte[][] p=new byte[size][2];
		long o=(long) Math.pow(2,size);
		boolean[] v=new boolean[size];
		byte[] go=new byte[size];
		boolean bl;
		int d,t1;
		int c=0;
		long all;
		System.out.println(o);
		System.out.println(c);
		for(long al=0;al<o;al++){
			all=al;
			for(int tt=0;tt<size;tt++){
				v[tt]=(all%2)*2==0;
				all/=2;
				v[tt]=(all%2)*2==0;
				all/=2;
			}
			t1=size-1;
			while(t1>0){
				switch(go[t1]){
				case 0:
					p[t1][0]=(byte) (p[t1-1][0]-1);
					p[t1][1]=p[t1-1][1];
					break;
				case 1:
					p[t1][0]=(byte) (p[t1-1][0]+1);
					p[t1][1]=p[t1-1][1];
					break;
				case 2:
					p[t1][1]=(byte) (p[t1-1][1]-1);
					p[t1][0]=p[t1-1][0];
					break;
				case 3:
					p[t1][1]=(byte) (p[t1-1][1]+1);
					p[t1][0]=p[t1-1][0];
					break;
				}
				for(int t2=t1+1;t2<size;t2++){
					p[t1][0]=(byte) (p[t1-1][0]-1);
					p[t1][1]=p[t1-1][1];
				}
				bl=true;
				t1++;
				br1:
				for(int t2=0;t2<t1;t2++){
					if(p[t1][0]==p[t2][0]&&p[t1][1]==p[t2][1]){
						go[t1]++;
						for(int t3=t1+1;t3<size;t3++){
							go[t3]=0;
							p[t3][0]=(byte) (p[t3-1][0]-1);
							p[t3][1]=p[t3-1][1];
						}
						bl=false;
						break br1;
					}
				}
				if(bl){
					go[t1]++;
				}
				while(go[t1]==4){
					go[t1]=0;
					t1--;
					go[t1]++;
				}
			}
		}
	}
}
