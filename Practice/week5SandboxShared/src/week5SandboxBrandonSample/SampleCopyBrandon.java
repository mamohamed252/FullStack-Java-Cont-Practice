package week5SandboxBrandonSample;

//class
public class SampleCopyBrandon {
    //properties or class variables
    
    
	//JavaDocs
	
	
    // method name should be unique by class
    public static void main(String[] args) {
        System.out.println("This is today's sanbox");
        
        //invoke a method
        whileLoop();
        
        forLoopExample();
        doWhileLoop();
    }
    
    // more methods
    
    private static void doWhileLoop() {
        int count = 5;
        System.out.println("This is the do while loop");
        do{
            System.out.println(count--);
            System.out.println("next ");
        }while(count > 0);
        
    }

    private static void forLoopExample() {
        System.out.println("This is the for loop");
        for(int i = 5; i > 0; i--) {
            System.out.println(i);
        }
        
    }

    // declaration method
    private static void whileLoop() {
        int count = 5;
        System.out.println("This is the while loop");
        while(count > 0) {
            System.out.println(count--);
        }
    }
    
    
    
    

}
