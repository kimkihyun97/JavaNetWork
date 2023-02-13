package Figure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Shape<type,color,area> {
        private String  type ;

        private String color ;
        private Double area ;

        private Shape(String type, String  color, Double area){
            this.type = type ;
            this.color = color;
            this.area = area ;

        }
        public String gettype(){
            return (String) type ;
        }
        public String getColor(){
            return (String) color;
        }
        public Double getArea(){
            return (Double) area;
        }
        public String toString(){
            return "도형타입 : "+type+"("+color+","+area+")" ;
        }
        public static final ArrayList<Shape> shapes = new ArrayList<>(Arrays.asList(new Shape("삼각형", "빨간색", 10.5),
                new Shape("사각형","파란색",11.2),new Shape("원","파란색",16.5),
                new Shape("원","빨간색",5.3), new Shape("원","노란색",8.1), new Shape("사각형","파란색",20.7),
                new Shape("삼각형","파란색",3.4), new Shape("사각형","빨간색",12.6))) ;

    public class ShapeTest {
        public static void main(String[] args) {
            List<Shape> circlefindGabType = findShapesByType(Shape.shapes, "사각형");
            System.out.println("사각형 : " + circlefindGabType);

            List<Shape> colorAreafindGabType = findShapesByColorNArea(Shape.shapes, "빨간색", 12.0);
            System.out.println("빨간 도형(면적<=12.0) : " + colorAreafindGabType);
        }
    }

        public static List<Shape> findShapesByColorNArea(List<Shape> shapes, String color, double area) {
            List<Shape> result2 = new ArrayList<>();

            for (Shape colorArea : shapes) {
                if (colorArea.getColor().equals(color) && colorArea.getArea() < area) {
                    result2.add(colorArea);
                }
            }
            return result2;
        }

        public static List<Shape> findShapesByType(List<Shape> shapes, String type) {
            List<Shape> result = new ArrayList<>();

            for (Shape shapeType1 : shapes) {
                if (shapeType1.gettype().equals(type))
                    result.add(shapeType1);
            }
            return result;
        }
    public static List<Shape> findShapes(List<Shape> shapes, String type, String color, Double area) {
        List<Shape> result3 = new ArrayList<>();

        for (Shape typeColorArea : shapes) {
            if (typeColorArea.gettype().equals(type)) {
                result3.add(typeColorArea);
            } else if (typeColorArea.getColor().equals(color) && typeColorArea.getArea() < area) {
                result3.add(typeColorArea);
            }
        }
        return result3;
    }
    public static List<Shape> findShapes(List<Shape> shapes, Predicate<Shape> p) {
        List<Shape> result2 = new ArrayList<>();

        for (Shape typeColorArea : shapes) {
            if (p.test(typeColorArea)) {
                result2.add(typeColorArea);
            }
        }
        return result2;
    }
}







