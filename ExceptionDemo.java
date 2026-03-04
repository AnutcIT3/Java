public class ExceptionDemo {
    public static void main(String[] args) {
        try{
            System.out.println(10/0);
        }
        catch(ArithmeticException e){
           System.out.println("loi toan hoc");
        }
        catch(OutOfMemoryError e){
            System.out.println("loi!");
        }
        catch(Exception e){
            System.out.println("loi");
        }
        finally{
            System.out.println("co loi");
        }
    }
}
