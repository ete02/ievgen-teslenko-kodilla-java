package com.kodilla.testing.shape;
import com.kodilla.testing.shape.Circle;
import com.kodilla.testing.shape.ShapeCollector;
import com.kodilla.testing.shape.Square;
import com.kodilla.testing.shape.Triangle;
import org.junit.*;

public class ShapeCollectorTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("All tests are started");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("executing test nr: " + testCounter);
    }

    @Test
    public void addFigureTest() {
        //Given
        ShapeCollector collection = new ShapeCollector();
        //When
        Circle circle = new Circle("circle", 21);
        Square square = new Square("square", 34);
        Triangle triangle = new Triangle("triangle", 314);
        collection.addFigure(circle);
        collection.addFigure(square);
        collection.addFigure(triangle);
        //Than
        Assert.assertEquals(3, collection.collectedShapesQuantity());
    }

    @Test
    public void removeFigureTest() {
        //Given
        ShapeCollector collection = new ShapeCollector();
        //When
        Circle circle = new Circle("circle", 21);
        Square square = new Square("square", 34);
        Triangle triangle = new Triangle("triangle", 314);
        collection.addFigure(circle);
        collection.addFigure(square);
        collection.addFigure(triangle);

        collection.removeFigure(circle);
        //Than
        Assert.assertEquals(2, collection.collectedShapesQuantity());
    }

    @Test
    public void getFigureTest() {
        //Given
        ShapeCollector collection = new ShapeCollector();
        //When
        Circle circle = new Circle("circle", 21);
        Square square = new Square("square", 34);
        Triangle triangle = new Triangle("triangle", 314);
        collection.addFigure(circle);
        collection.addFigure(square);
        collection.addFigure(triangle);

        //Than
        Assert.assertEquals(square, collection.getFigure(1));
    }
    @Test
    public void getFigureTest2() {
        //Given
        ShapeCollector collection = new ShapeCollector();
        //When
        Circle circle = new Circle("circle", 21);
        Square square = new Square("square", 34);
        Triangle triangle = new Triangle("triangle", 314);
        collection.addFigure(circle);
        collection.addFigure(square);
        collection.addFigure(triangle);

        //Than
        Assert.assertNull("wartość poza zakresem", collection.getFigure(-2));
    }
    @Test
    public void getFigureTest3() {
        //Given
        ShapeCollector collection = new ShapeCollector();
        //When
        Circle circle = new Circle("circle", 21);
        Square square = new Square("square", 34);
        Triangle triangle = new Triangle("triangle", 314);
        collection.addFigure(circle);
        collection.addFigure(square);
        collection.addFigure(triangle);

        //Than
        Assert.assertNull("wartość poza zakresem", collection.getFigure(10));
    }
}