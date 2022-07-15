class Square {
    private int side;
    private int field;
    private int circuit;

    private Square(int side) {
        this.side = side;
    }

    private Square(int field, int circuit) {
        this.field = field;
        this.circuit = circuit;
    }

    public Square(int side, int field, int circuit) {
        this(side);
        this.field = field;
        this.circuit = circuit;
    }

    private void krok1() {
        //krok1
        //
        //
        //
        //
        //
        //
    }

    private void krok2() {
        //krok2
        //
        //
        //
        //
        //
        //
        //
    }

    public void wyliczCos() {
        krok1();
        krok2();
    }

    public int getSide() {
        return side;
    }

    public int getField() {
        return field;
    }

    public int getCircuit() {
        return circuit;
    }

    public void setSide(int side) {
        this.side = side;
        this.field = side * side;
        this.circuit = 4 * side;
    }

    public void setField(int field) {
        this.field = field;
    }

    public void setCircuit(int circuit) {
        this.circuit = circuit;
    }
}
