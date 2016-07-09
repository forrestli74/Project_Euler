

public class a122{
  public static void main(String[] args){
    int o=201;
    int sum=0, l,b2;
    int[] d=new int[o];
    for(int a=2;a<o;a++){
      b2=2;
      l=a;
      d[a]=d[a-1]+1;
        while(b2<=a){
          if(a%b2==0&&(d[a/b2]+d[b2])<d[a]){
            d[a]=d[a/b2]+d[b2];
            l=a/b2;
          }
          b2++;
        }
        //TODO
        System.out.println(a+":\t"+l+"\t"+d[a]);
        sum+=d[a];
      }
    System.out.println(sum);
    }
  }
