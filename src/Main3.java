public class Main3 {
    public static void main(String[] args) throws Exception {
        int[] tab = new int[5];
        String s = null;

        try {
            System.out.println(tab[10]);
            //
            //
            //
            //
            //
            s.toLowerCase();
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            System.out.println("Ups cos sie zwpsulo");
        } catch (NullPointerException e) {
            System.out.println("Ups null pointer exception !!");
        }

        System.out.println("cos tam dalej !!");

        int a = 5;

        if(a == 5) {
            throw new NullPointerException();
        }

        validateInfo(5);
    }

    public static void validateInfo(int a) throws Exception {
        if(a == 5) {
            throw new Exception();
        }
    }
}
