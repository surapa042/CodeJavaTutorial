public class LoopCall {
    public static void main(String[] args) {
        System.out.println("Hello from the main method.");
        for(int i = 1; i <= 5; i++){
            displayMessage();
        }
    }
    public static void displayMessage(){
        System.out.println("Hello from the displayMessage");
    }
        
    }
