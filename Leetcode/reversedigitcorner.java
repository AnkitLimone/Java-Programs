public class reversedigitcorner {
    static int reversedigit(int num){
        StringBuffer string = new StringBuffer(String.valueOf(num));
        string.reverse();

        num = Integer.parseInt(String.valueOf(string));
        return num;
    }
    public static void main(String args[]) {
        int  num =120005;
        System.out.println("reverse is "+ reversedigit(num));
    }
}
