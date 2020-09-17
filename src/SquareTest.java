public class SquareTest {
    public static void main(String[] args) {
        Square[] squares = new Square[5];
        squares[0] = new Square(4.0);
        squares[1] = new Square(4.0);
        squares[2] = new Square(4.0);
        squares[3] = new Square(4.0);
        squares[4] = new Square(4.0);
        for (Square square:squares) {
            int random = (int) Math.floor((Math.random()* 99)+1);
            square.resize(random);
            System.out.println(square.getArea());

        }



    }
}
