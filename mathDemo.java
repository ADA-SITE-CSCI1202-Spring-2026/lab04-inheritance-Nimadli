public class mathDemo {
    public int min(int a, int b){
        if(a < b) {return a;}
        else {return b;}
    }

    public static int max(int a, int b){
        if(a > b) {return a;}
        else {return b;}
    }

    public int sum(int[] args){
        int sum = 0;
        for(int i = 0; i < args.length; i++){
            sum += args[i];
        }
        return sum;
    }

    public static void main(String[] args){
        mathDemo a = new mathDemo();
        System.out.println(a.min(5, 6));
        
        System.out.println(mathDemo.max(5, 6));
    }

    // static allows us to call the methods without creating the object a
}