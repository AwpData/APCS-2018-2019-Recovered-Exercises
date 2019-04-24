
public class Apples {
    
    public static void myname() {
    System.out.println("Trevor Tang"); 
    }
    
    public static void myaddress() {
    System.out.println("18473 SE 82th Place, Bellevue, WA 98059");
    }
    
    public static void mystudentid() {
    System.out.println("3612783");
    }
    public static void printspace() {
    System.out.println("");
    }
    public static void library() {
    	myname();
    	mystudentid();
    	printspace();
    }
    public static void letter() {
    	myname();
    	myaddress();
    	printspace();
    }
    public static void transcript() {
    	myname();
    	myaddress();
    	mystudentid();
    }
    public static void main(String[]args) {
        //To send me a letter
        letter();
        //To check out a book
        library();
        //Student Transcript
        transcript();
    } 
}

