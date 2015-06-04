
import java.util.ArrayList;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jiaqi
 */
public class Temp {
    private static ArrayList<Integer> ps=new ArrayList<Integer>();
    public static void main(String[] args){
        
        for(int n=3;n<100;n++){
            ps.clear();
            for(int t=1;t<n;t++){
                if(a000.GCD(n, t)==1){
                    ps.add(t);
                }else{
                }
            }
            int size=ps.size();
            int[] number=new int[size];
            for(int t=0;t<size;t++){
                number[t]=ps.get(t);
            }
            int[] group=new int[n];
            int g=0;
            int gmax=0;
            for(int t=1;t<size;t++){
                if(group[t]!=0){
                    continue;
                }
                g++;
                int s=number[t];
                while(s!=1){
                    if(group[s]!=0){
                        g=group[s];
                        break;
                    }
                    s*=number[t];
                    s%=n;
                }
                s=number[t];
                while(s!=1){
                    group[s]=g;
                    s*=number[t];
                    s%=n;
                }
                if(g>gmax){
                    gmax++;
                }
            }
            int[] sizes=new int[gmax];
            for(int t=1;t<size;t++){
                if(group[t]!=0){
                    sizes[group[t]-1]++;
                }
            }
            String f=n+":\t";
            for(int t=0;t<gmax;t++){
                f+=sizes[t]+" ";
            }
            System.out.println(f);
            
            //System.out.println(n+":\t"+fi);
        }
    }
}
