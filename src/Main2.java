public class Main2 {
    public static void main(String[] args) {
        Square square = new Square(5, 25, 20);

        System.out.println(square.getSide());
        System.out.println(square.getField());
        System.out.println(square.getCircuit());

        square.setSide(7);
        square.wyliczCos();

        System.out.println(square.getSide());
        System.out.println(square.getField());
        System.out.println(square.getCircuit());

        square.setSide(8);

        square.setSide(10);
    }
}
