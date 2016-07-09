
import java.math.BigInteger;
import java.util.ArrayList;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jiaqi
 */
public class a119 {
			public static final int o=30;
			static long[] pow=new long[o];
			static long[] x=new long[o];
			static long[] save=new long[31];
			public static void main(String[] args) {
						for(int t=0;t<o;t++){
									pow[t]=2;
						}
						for(int t=2;t<o;t++){
									long tem=1;
									for(int tt=0;tt<t;tt++){
												tem*=pow[t];
									}
									x[t]=tem;
						}
						int min=2;
						int count=0;
						while(count<30){
									if(t(min)){
												save[count]=x[min];
												count++;
												
												System.out.print(x[min]);
									}
									pow[min]++;
									long tem=1;
									for(int t=0;t<min;t++){
												tem*=pow[min];
									}
									x[min]=tem;
									min=2;
									for(int t=3;t<o;t++){
												if(x[t]<x[min]){
															min=t;
												}
									}
						}
						String f="";
						for(int t=2;t<o;t++){
									f+=t+" "+save[t]+"\n";
						}
						System.out.print(f);
			}
			static boolean t(int min){
						if(x[min]<10){
									return false;
						}
						long l=x[min];
						long sum=0;
						while(l!=0){
									sum+=l%10;
									l/=10;
						}
						return sum==pow[min];
			}
}
