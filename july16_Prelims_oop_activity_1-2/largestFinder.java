public class largestFinder{
    public static void main (String [] args){
        int a=29, b=67, c=19;
        int largest;

        if (a>=b && a>=c){
            largest=a;
        }
        else if (b>=a && b>=c){
            largest=b;
        }
        else{
            largest=c;
        }
        System.out.println("The largest number is: "+ largest);
    }
}
