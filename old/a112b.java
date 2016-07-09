/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jiaqi
 */
public class a112b {

			public static void main(String[] args) {
						int all=0;
						int good=0;
						do{
									all++;
									if(t(all)){
												good++;
									}
						}
						while(all!=good*100);
						System.out.println(all);
			}
			public static boolean t(int a){
						int x=a%10;
						a/=10;
						int y;
						boolean j1=true,j2=true;
						while(a!=0){
									y=x;
									x=a%10;
									a/=10;
									if(x<y){
												j1=false;
									}
									if(x>y){
												j2=false;
									}
						}
						return j1||j2;
			}
}
