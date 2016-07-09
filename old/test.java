

public class test{
	public static void main(String[] args){
		long start=System.currentTimeMillis();
		int[] a=a000.primes(30000000,600000000);
		long end=System.currentTimeMillis();
		System.out.println("!!!\n"+(end-start)/1000.+"\n"+a[a.length-1]);
	}
}
 
	
