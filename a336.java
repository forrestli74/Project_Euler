import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;


public class a336{
	static int max;
	static int i;
	static int[][] save;
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		max=scanner.nextInt();
		int want=scanner.nextInt();
		int ss=1;
		for(int t=2;t<max-1;t++){
			ss*=t;
		}
		i=0;
		save=new int[ss][];
		int[] tem=new int[2];
		tem[0]=1;
		goit(tem);
		Arrays.sort(save,new Com(max));
		/*
		String f="";
		for(int[] a:save){
			f+=s(a);
		}
		System.out.print(f+save.length);
		*/
		System.out.println(s(save[want]));
	}
	private static String s(int[] s){
		String f="";
		for(int t=0;t<max;t++){
			f=(char)('A'+max-1-s[t])+f;
		}
		return f+"\n";
	}
	public static class Com implements Comparator<int[]>{
		int s;
		public Com(int size){s=size;}
		public int compare(int[] a,int[] b) {
			for(int t=s-1;t>=0;t--){
				if(a[t]>b[t]){
					return -1;
				}else if(a[t]<b[t]){
					return 1;
				}
			}
			return 0;
		}
	}
	private static void goit(int[] a){
		int size=a.length;
		if(size==max){
			save[i]=a.clone();
			i++;
			return;
		}
		int[] tem=new int[size+1];
		for(int t=1;t<size;t++){
			for(int tt=0;tt<t;tt++){
				tem[size-tt]=a[tt];
			}
			for(int tt=t;tt<size;tt++){
				tem[tt-t]=a[tt];
			}
			tem[size-t]=size;
			goit(tem);
		}
	}
}
