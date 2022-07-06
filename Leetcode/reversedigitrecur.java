public class reversedigitrecur {
    static int revnum=0;
    static int basepos=1;
    static int reverseDigits(int num){
        if (num > 0) {
            reverseDigits(num/10);
            revnum += (num%10)*basepos;
            basepos *=10;
        }
        return revnum;
    }
    public static void main(String args[]) {
        int num = 100000045;
        System.out.println(reverseDigits(num));
    }
}
