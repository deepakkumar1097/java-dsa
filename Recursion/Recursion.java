public class Recursion{
    /**
    * Example 1: without recursion
    */

    static void firstmethod(){
        secondmethod();
        System.out.println("This is first method")
    }
    static void secondmethod(){
        thirdmethod();
        System.out.println("This is second method")
    }
    static void thirdmethod(){
        fourthmethod();
        System.out.println("This is third method")
    }
    static void fourthmethod(){
        System.out.println("This is fourth method")
    }

    /**
    * Example 2: with recursion
    */

    static void recursivemethod(int n){
        if(n == 0){
            System.out.println("n is less than one")
            return;
        } else {
            System.out.println("This is" + n +"th method");
        }
    }

    /**
    * Example 3
    */

    static void russiandollexample(int n){
        if(n == 1){
            System.out.println("All dolls are opened");
        } else {
            russiandollexample(n -1);
        }
    }

    /**
     * Example 4
     */

    public int factorial(int n){
        if( n < 0){ // step 3: unintentional case 
            return -1 
        }
        if(n == 0 || n==1){ // step 2 : base case
            return 1
        }

        return n* factorial(n-1) // step 1 : recursive case
    }

    /**
     * Example 5
     */
     
    public int fibonacci(int n){
        if(n < 0){
            return -1
        }
        if(n == 0 || n == 1){
            return n
        }
        return fibonacci(n-1) + fibonacci(n-2)
    }

    

    public static void main(String[] args){
        russiandollexample(5);
        firstmethod();
        recursivemethod(5);

        Recursion recursive = new Recursion();
        var rec = recursive.factorial(6);
        System.out.println(rec)

        var fibo = recursive.fibonacci(6);
        System.out.println(fibo)
    }
}