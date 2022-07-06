public class reversedigititerative {
    static int reversedigi(int num){
        int revnum=0;
        while(num>0){
            revnum=revnum*10+num%10;
            num =num/10;

        }
        return revnum;
        
    }
    public static void main(String args[]) {
        int num = 100000045;
        System.out.println("reverse number is := " +reversedigi(num));
    }
}
