package Shape;

import Point.Point2d;

import java.util.Collection;

public class Rectangle extends BaseShape {
    /** TODO
     * Create a filled rectangle centered on (0, 0)
     * @param width Width of the rectangle
     * @param height Height of the rectangle
     */
    public Rectangle(Double width, Double height) {
        super();
        Double halfWidth = width/2.0;
        Double halfHeight = width/2.0;

        int nHorizontalPoints = (int) (width/INCREMENT_FACTOR);
        int nVerctivalPoints =  (int) (height/INCREMENT_FACTOR);
        for(int i = 0; i < nHorizontalPoints; i++)
        {
            for(int j = 0; j < nVerctivalPoints; j++)
            {
                Double x = -halfWidth + i*INCREMENT_FACTOR;
                Double y = -halfHeight + j*INCREMENT_FACTOR;

                this.add(new Point2d(x,y));
            }
        }
    }

    /** TODO
     * Create a filled rectangle centered on (0, 0)
     * @param dimensions 2D point containing the width and height of the rectangle
     */
    public Rectangle(Point2d dimensions) {
        this(dimensions.X(), dimensions.Y());
    }

    /**
     * Create a rectangle from a given collection of Points
     * @param coords The collection of 2D points
     */
    private Rectangle(Collection<Point2d> coords) {
        super(coords);
    }

    /** TODO
     * @return Deep copy of the rectangle
     */
    @Override
    public Rectangle clone() {
        return new Rectangle(cloneCoords());
    }
}
