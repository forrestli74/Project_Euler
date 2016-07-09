/*
 * 1001 0
 * 1100 1
 * 0110 2
 * 1221 3
 * 1122 4
 */

public class a237 {
	public static void main(String[] args){
		long[] data1,data2;
		data1=new long[4];
		data2=new long[4];
		data1[0]=1;
		for(long t=1;t<20L;t++){
			String f="";
			for(int tt=0;tt<4;tt++){
				data2[tt]=data1[tt];
				f+=data2[tt]+"\t";
			}
			System.out.println(f);
			data1[0]=(data2[1]*2+data2[2]+data2[3])%100000000;
			data1[1]=(data2[0]+data2[1])%100000000;
			data1[2]=data2[0]%100000000;
			data1[3]=(data2[1]*2+data2[3])%100000000;
		}
	}
}
