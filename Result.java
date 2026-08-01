public class Result{
    public static void main (String[]args){
        int mark = 29;
        if(mark > 100 || mark < 0){
            System.out.println("Invalid Mark");
        }
        else if(mark >= 80 ){
            System.out.println("A+");
        }
        else if(mark >= 70 ){
            System.out.println("A");
        }
        else if(mark >= 60 ){
            System.out.println("A-");
        }
        else if(mark >= 50 ){
            System.out.println("B");
        }
        else if(mark >= 40 ){
            System.out.println("C");
        }
        else if(mark >= 30 ){
            System.out.println("D");
        }
        else {
            System.out.println("F");
        }
    }
}