public class RectangleTest {
    public static void main(String[] args) {
        Rectangle[] rectangles = new Rectangle[5];
            rectangles[0] = new Rectangle(3.0,7.3);
            rectangles[1] = new Rectangle(3.0,7.3);
            rectangles[2] = new Rectangle(3.0,7.3);
            rectangles[3] = new Rectangle(3.0,7.3);
            rectangles[4] = new Rectangle(3.0,7.3);
        for (Rectangle rec: rectangles) {
            int random = (int) Math.floor((Math.random()* 99)+1);
              rec.resize(random);
            System.out.println(rec.getArea());
        }

    }
}
