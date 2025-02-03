public class PDemo003 {
    public static void main(String[] args) {
        int a=30;
        int b=40;
        int c=50;
        if(a>b && a>c){
            System.out.println(a+" is greatest");
        }
        else if(b>a && b>c){
            System.out.println(b+" is greatest");
        }
        else{
            System.out.println(c+" is greatest");
        }
    }
}
