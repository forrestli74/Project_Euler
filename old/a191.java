
public class a191{
	public static void main(String[] args){
		long[][] data=new long[31][3];
		long[] a=new long[31];
		data[0][0]=1;
		a[0]=1;
		for(int t=1;t<=30;t++){
			data[t][1]=data[t-1][0];
			data[t][2]=data[t-1][1];
			data[t][0]=data[t-1][0]+data[t-1][1]+data[t-1][2];
			a[t]=data[t][0]+data[t][1]+data[t][2];
		}
		long sum=a[30];
		for(int t=0;t<30;t++){
			sum+=a[t]*a[29-t];
		}
		System.out.println(sum);
	}
}