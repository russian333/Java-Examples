public class Hi{
    public static void main(String[] args){
        int[] h = {1,2,3,4,5,6,7,8,9,10};
        for(int x: h){
            System.out.println("XDlol " + side(x));
        }
    }
    private static int side(int n){
        return n*2+5;
    }
}