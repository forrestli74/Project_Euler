
public class a205{
  public static void main(String[] args){
    long[] a=new long[37];
    long[] b=new long[37];
    long sum=0,l;
    double f;
    for(int t1=1;t1<5;t1++){
      for(int t2=1;t2<5;t2++){
        for(int t3=1;t3<5;t3++){
          for(int t4=1;t4<5;t4++){
            for(int t5=1;t5<5;t5++){
              for(int t6=1;t6<5;t6++){
                for(int t7=1;t7<5;t7++){
                  for(int t8=1;t8<5;t8++){
                    for(int t9=1;t9<5;t9++){
                      a[t1+t2+t3+t4+t5+t6+t7+t8+t9]++;
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
    for(int t1=1;t1<7;t1++){
      for(int t2=1;t2<7;t2++){
        for(int t3=1;t3<7;t3++){
          for(int t4=1;t4<7;t4++){
            for(int t5=1;t5<7;t5++){
              for(int t6=1;t6<7;t6++){
                b[t1+t2+t3+t4+t5+t6]++;
              }
            }
          }
        }
      }
    }
    for(int t1=4;t1<37;t1++){
      l=0;
      for(int t2=1;t2<t1;t2++){
        l+=b[t2];
      }
      sum+=l*a[t1];
    }
    f=sum/Math.pow(4,9)/Math.pow(6,6);
    System.out.println(f);
  }
}