package Shape;

import Point.Point2d;

import java.util.Collection;

public class Ellipse extends BaseShape {
    /** TODO
     * Create a filled Ellipse that is centered on (0, 0)
     * @param widthDiameter Width of the Ellipse
     * @param heightDiameter Height of the Ellipse
     */
    public Ellipse(Double widthDiameter, Double heightDiameter) {
        super();
        Double halfWidthDiameter = widthDiameter/2.0;
        Double halfHeightDiameter = heightDiameter/2.0;

        int nHorizontalPoints = (int) (widthDiameter/INCREMENT_FACTOR);
        int nVerctivalPoints =  (int) (heightDiameter/INCREMENT_FACTOR);
        for(int i = 0; i < nHorizontalPoints; i++)
        {
            for(int j = 0; j < nVerctivalPoints; j++)
            {

                Double x = -halfWidthDiameter + i*INCREMENT_FACTOR;
                Double y = -halfHeightDiameter + j*INCREMENT_FACTOR;

                if((Math.pow(x,2.0))/(Math.pow(halfWidthDiameter,2.0)) + (Math.pow(y,2.0))/(Math.pow(halfHeightDiameter,2.0)) <=1) {
                    this.add(new Point2d(x, y));
                }
            }
        }

    }

    /** TODO
     * Create a filled Ellipse that is centered on (0,0)
     * @param dimensions 2D point containing the width and height of the Ellipse
     */
    public Ellipse(Point2d dimensions) {
        this(dimensions.X(), dimensions.Y());
    }

    /**
     * Create an Ellipse from a given collection of 2D points
     * @param coords Collection of 2D points
     */
    private Ellipse(Collection<Point2d> coords) {
        super(coords);
    }

    /** TODO
     * @return Deep Copy of the Ellipse
     */
    @Override
    public Ellipse clone() {
        return new Ellipse(cloneCoords());
    }
}
