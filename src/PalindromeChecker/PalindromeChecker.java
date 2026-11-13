package PalindromeChecker;

public class PalindromeChecker {
    public static boolean isPalindrome(String text){
        if(text==null){
            return false;
        }
        // Clean the input: remove all whitespace using regex "\\s+"
        //+ means that if there is more than one
        //\s for whitespace
        String cleaned=text.replaceAll("\\s+", "").toLowerCase();
        //create stack and queue
        Queue charQueue = new Queue();
        Stack charStack =new Stack();

        for(int i=0;i<cleaned.length();i++){
            char ch=cleaned.charAt(i);
            charQueue.enqueue(ch);
            charStack.push(ch);
        }
        System.out.println("Cleaned text: " + cleaned);
        while(!charStack.isEmpty()&& !charQueue.isEmpty()){
            char fromQueue= charQueue.dequeue();
            char fromStack=charStack.pop();
            System.out.println("From Queue: " + fromQueue + " | From Stack: " + fromStack);
            if(fromQueue!=fromStack){
                return false;
            }
        }
        return true;
    }
}
