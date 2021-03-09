public class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape rectangle = shapeFactory.getShape("rectangle");
        rectangle.draw();
//        normalement on aura rectangle qui va s'afficher
        Shape carre = shapeFactory.getShape("square");
        carre.draw();
    }
}
