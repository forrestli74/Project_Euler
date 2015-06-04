
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jiaqi
 */
public class a389 {
    static final int allN=4*6*8*12*20+1;
    public static double[] probs=new double[allN];
    public static void main(String[] args){
        
        probs[1]=1;
        printF();
        step(1,4);
        print();
        step(4,6);
        //printF();
        step(4*6,8);
        //printF();
        step(4*6*8,12);
        //printF();
        step(4*6*8*12,20);
        print();
        
    }
    public static void printF(){
        double f=0;
        
        int t=1;
        while(probs[t]!=0){
            f+=t*probs[t];
            t++;
        }
        System.out.println(f);
    }
    public static void print(){
        int t=1;
        String fs="";
        double av=0;
        while(probs[t]!=0){
            av+=t*probs[t];
            fs+=(t+"\t"+probs[t]+"\n");
            t++;
        }
        double v=0;
        while(probs[t]!=0){
            v+=(t-av)*(t-av)*probs[t];
        }
        fs+=av+" "+v+"\n";
        
        
        File ff=new File("/home/jiaqi/Desktop/a389.txt");
        ff.setWritable(true);
        try {
            FileWriter fw=new FileWriter(ff);
            
            fw.write(fs);
            
            fw.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    public static void step(int a,int b){
        double[] tem0=new double[allN];
        //calculate each prob, number of dies
        for(int t1=1;t1<=a;t1++){
            if(t1%10==0){
                System.out.println(" "+t1);
            }
            //number of points
            double[] tem1=new double[t1*b+1];
            tem1[0]=1;
            //number of rolls
            for(int t2=0;t2<t1;t2++){
                double[] tem2=new double[t1*b+1];
                //each point prob
                for(int t3=t2;t3<=t2*b;t3++){
                    //each side
                    for(int t4=1;t4<=b;t4++){
                        tem2[t3+t4]+=tem1[t3]/b;
                    }
                }
                tem1=tem2;
            }
            for(int t2=1;t2<=b*t1;t2++){
                tem0[t2]+=probs[t1]*tem1[t2];
            }
        }
        probs=tem0;
    }
}
