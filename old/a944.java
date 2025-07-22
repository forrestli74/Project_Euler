
//208008179
// not working
public class a944 {
    static final long P = 1234567891L;
    static final long INV2 = 617283946L;
    // static final long P = 19L;
    // static final long INV2 = 10L;
    // static final long N = 10;
    // static final long S = 3;
    static final long N = 100000000000000L;
    static final long S = 10000000L;
    // 2^n /2 * (1-2^-fl(n/a-1)) * a
    public static void main(String[] args) {
        System.out.println("a");
        long partial = 0;
        for(long a=1;a<=S;a++) {
            long partial2 = mul((P+1-pow(INV2, N/a-1))%P, a);
            // long tmp = mul(partial2, pow(2, (N-1)%(P-1)));
            // System.out.println(a + "\t" + tmp);

            partial = (partial + partial2) % P;
        }
        long prevA = S;
        for(long floor = N/S-1;floor > 1;floor --) {
            long nextA = N/floor;
            if(nextA == prevA) {
                continue;
            }
            if(N/nextA != floor) {
                System.out.println("error " + nextA + " " + floor);
            }
            if(N/(prevA+1) != floor) {
                System.out.println("error2 " + prevA + " " + floor);
            }
            // prev +1 ... nexta
            long sum = mul(INV2, mul((nextA+prevA+1)%P, (nextA-prevA)));
            long partial2 = mul((P+1-pow(INV2, floor-1))%P, sum);
            // long tmp = mul(partial2, pow(2, (N-1)%(P-1)));
            // System.out.println(floor + " "+prevA + " " + nextA + "\t" + sum + "\t" + tmp);
            partial = (partial + partial2) % P;
            prevA = nextA;
        }
        long rtn = mul(partial, pow(2, (N-1)%(P-1)));
        System.out.println(rtn);
    }


    static long mul(long a, long b) {
        return (a*b) % P;
    }

    static long pow(long a, long b) {
        long rtn = 1;
        while(b != 0) {
            if(b%2 == 1) {
                rtn = mul(rtn, a);
            }
            b /= 2;
            a = mul(a, a);
        }
        return rtn;
    }
}