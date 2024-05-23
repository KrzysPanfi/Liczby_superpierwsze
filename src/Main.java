public class Main {
    public static void main(String[] args) {
        int count = getSuperBprimenubers(2,1000);
        int count2=getSuperBprimenubers(100,10000);
        int count3=getSuperBprimenubers(1000,100000);
        int count4=getprimesum(100,10000);
        boolean wynik=issumofsuperbaprime(100,10000);
        System.out.println(count);
        System.out.println(count2);
        System.out.println(count3);
        System.out.println(count4);
        System.out.println(wynik);

    }

    public static int getSuperBprimenubers(int min,int max) {
        int count=0;
        for(int i=min;i<max;i++){
            int sum=0;
            String str=Integer.toString(i);
            char[] strnumbers=str.toCharArray();
            for(char c:strnumbers) {
                int num = c - '0';
                sum += num;
            }
           String binstr=Integer.toBinaryString(i);
           char[] binnumbers=binstr.toCharArray();
           int sum1=0;
           for(char c:binnumbers){
               int bin=c-'0';
               sum1+=bin;
           }
           if(isPrime(i)&&isPrime(sum)&&isPrime(sum1)){
               count++;
           }
        }
        return count;
    }
    public static int getprimesum(int min,int max) {
        int count=0;
        for(int i=min;i<max;i++){
            int sum=0;
            String str=Integer.toString(i);
            char[] strnumbers=str.toCharArray();
            for(char c:strnumbers) {
                int num = c - '0';
                sum += num;
            }

            if(isPrime(sum)){
                count++;
            }
        }
        return count;
    }
    public static boolean isPrime(int number) {
            if (number <= 1) {
                return false;
            }
            for (int i = 2; i <= number/2; i++) {
                if (number % i == 0) {
                    return false;
                }
            }
            return true;
        }
        public static boolean issumofsuperbaprime(int min, int max){
            boolean wynik;
            int count=0;
            for(int i=min;i<max;i++){
                int sum=0;
                String str=Integer.toString(i);
                char[] strnumbers=str.toCharArray();
                for(char c:strnumbers) {
                    int num = c - '0';
                    sum += num;
                }
                String binstr=Integer.toBinaryString(i);
                char[] binnumbers=binstr.toCharArray();
                int sum1=0;
                for(char c:binnumbers){
                    int bin=c-'0';
                    sum1+=bin;
                }
                if(isPrime(i)&&isPrime(sum)&&isPrime(sum1)){
                    count+=i;
                }
            }
            wynik=isPrime(count);
            return wynik;

        }
    }
