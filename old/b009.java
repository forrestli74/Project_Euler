
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author jiaqi
 */
public class b009 {

	public static ArrayList<Integer>[] list;

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.nextLine());
		String f = "";
		int[] city, r1, r2;
		for (int t = 0; t < n; t++) {
			int size = Integer.parseInt(scan.nextLine());
			list = new ArrayList[size];
			for (int tt = 0; tt < size; tt++) {
				list[tt] = new ArrayList<Integer>();
			}
			for (int tt = 0; tt < size - 1; tt++) {
				String in = scan.nextLine();
				int ind = in.indexOf(' ');
				int a = Integer.parseInt(in.substring(0, ind));
				int b = Integer.parseInt(in.substring(ind + 1));
				list[a].add(b);
				list[b].add(a);
			}
			f += c1(0)[0] + "\n";
		}
		f = f.substring(0, f.length() - 1);
		System.out.print(f);
	}

	public static int[] c1(int t) {
		t = 0;
		list[t].add(-1);
		Node n0 = new Node(-1, t);
		int[] f = n0.ss();
		list[t].remove(list[t].size() - 1);
		return f;
	}
	/*
	public static int c2(){
	int max=100000000;
	for(int t=0;t<list.length;t++){
	int tem=c1(t);
	if(tem<max){
	max=tem;
	}
	}
	return max;
	
	}
	 */

	public static class Node {

		public int x;
		public Node[] s;

		public Node(int x1, int x2) {
			x = x2;
			int i = 0;
			s = new Node[list[x2].size() - 1];
			for (int t = 0; t < list[x2].size(); t++) {
				int l = list[x2].get(t);
				if (l != x1) {
					s[i] = new Node(x2, l);
					i++;
				}
			}
		}

		public int[] ss() {
			if (s.length == 0) {
				int[] f = new int[3];
				f[0] = 1;
				f[1] = 1;
				f[2] = 1;
				return f;
			}
			if (s.length == 1) {
				if (s[0].s.length == 0) {
					int[] f = new int[3];
					f[0] = 1;
					f[1] = 1;
					f[2] = 1;
					return f;
				}
				if (s[0].s.length == 1) {
					int[] tem = s[0].s[0].ss();
					tem[0] = tem[2];
					tem[1] = tem[2];
					return tem;
				} else {
					int[] f = s[0].ss();
					f[0]=f[1];f[1]=f[2];
					return f;
				}
			}
			int[] f = new int[3];
			int c0 = 10, c1 = 0,c2=0;
			for (int t = 0; t < s.length; t++) {
				if (s[t].s.length == 0) {
					continue;
				}
				int[] tem = s[t].ss();
				if(tem[2]-tem[0]<c0){
					c0=tem[2]-tem[0];
				}
				if(tem[2]==tem[0]){
					c1++;
				}
				f[0]+=tem[1];
				f[1]+=tem[0];
				f[2]+=tem[0];
			}
			f[1] -= c1 / 2;
			f[2] -= c1 / 2;
			if(c1%2==0){
				if(c1==0){
					if(c0==10){
						c0=1;
						f[0]=1;
					}
					f[1]+=c0;
					f[2]+=c0;
				}else{
					f[2]++;
				}
			}
			if(f[0]>f[1]){
				f[0]=f[1];
			}
			System.out.println("<" + c0 + "," + c1 + "," + x + "," + f[0]+","+f[1]+","+f[2] + ">");
			return f;
		}
	}
}