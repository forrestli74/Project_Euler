/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jiaqi
 */
public class a134 {
			public static final int PP=78498;
			public static void main(String[] args) {
						int[] primes=a000.primes(PP+1,1000100);
						int a10=1;
						for(int ip=2;ip<PP;ip++){
									int p1=primes[ip];
									int p2=primes[ip+1];
									if(p1>a10){
												a10*=10;
									}
									int x=t(a10,p2,p1);
						}
						
			}
			public static int t(int a,int b, int q){
				return 0;
						
			}
}
