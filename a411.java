
import java.awt.Point;
import java.util.Comparator;
import java.util.Hashtable;
import java.util.TreeMap;
import java.util.TreeSet;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jiaqi
 */
public class a411 {
    public static void main(String[] args){
        int n=1;
        for(int t=0;t<5;t++){
            n*=29;
        }
        System.out.println(test(3,n));
    }
    public static int  test(int a,int n){
        int b=a;
        int t=0;
        while(n%a==0){
            n/=a;
        }
        while(b!=0&&b!=1){
            b*=a;
            b%=n;
            t++;
        }
        return t;
    }
    public static long solve(int n){
        TreeSet<Point> set=new TreeSet<Point>(new Comparator<Point>(){
            
            @Override
            public int compare(Point o1, Point o2) {
                if(o1.x!=o2.x){
                    return Integer.compare(o1.x,o2.x);
                }else{
                    return Integer.compare(o1.y,o2.y);
                }
            }
            
        });
        int px=1;
        int py=1;
        for(int t=0;t<=n*2;t++){
            set.add(new Point(px,py));
            px*=2;
            py*=3;
            px%=n;
            py%=n;
        }
        set.add(new Point(n,n));
        int[] ys=new int[set.size()];
        Point[] points=new Point[set.size()];
        set.toArray(points);
        for(int t=0;t<points.length;t++){
            System.out.println(points[t]);
            ys[t]=points[t].y;
        }
        int[] data=new int[n+2];
        //data[0]=1;
        for(int t=0;t<ys.length;t++){
            int max=0;
            for(int tt=0;tt<=ys[t];tt++){
                if(max<data[tt]){
                    max=data[tt];
                }
            }
            data[ys[t]]=max+1;
        }
        return data[n];
    }
}
/*
 * f2(i,j)=sum(f1(i,k)*f1(k,j),k in box of i,j)
 * f(i,j)=
 */