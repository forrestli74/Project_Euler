

public class a172 {
	public static void main(String[] args){
		long[] data=new long[1048576];
		long[] l;
		int i1;
		data[0]=1;
		for(int t1=1;t1<18;t1++){
			l=new long[1048576];
			for(int t2=0;t2<1048576;t2++){
				i1=1;
				for(int t3=0;t3<10;t3++){
					if((t2/i1)%4!=3){
						l[t2+i1]+=data[t2];
					}
					i1*=4;
				}
			}
			data=l.clone();
		}
		l=new long[1048576];
		for(int t2=0;t2<1048576;t2++){
			i1=4;
			for(int t3=1;t3<10;t3++){
				if((t2/i1)%4!=3){
					l[t2+i1]+=data[t2];
				}
				i1*=4;
			}
		}
		long f=0;
		for(int t1=0;t1<1048576;t1++){
			f+=l[t1];
		}
		System.out.println(f);
	}
}
