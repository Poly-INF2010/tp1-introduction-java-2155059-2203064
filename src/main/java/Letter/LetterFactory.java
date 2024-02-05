package Letter;

import Point.Point2d;
import Shape.*;

public final class LetterFactory {
    final static Double maxHeight = 150.0;
    final static Double maxWidth = maxHeight / 2.5;
    final static Double halfMaxHeight = maxHeight / 2;
    final static Double halfMaxWidth = maxWidth / 2;
    final static Double stripeThickness = maxHeight / 8;
    final static Double halfStripeThickness = stripeThickness / 2;


    /** TODO
     * Create the letter A graphically
     * @return BaseShape containing the letter A
     */
    public static BaseShape create_A()  {

        Rectangle horizontalBar = (Rectangle) new Rectangle(maxWidth*(1.0/4.0), stripeThickness*(4.0/7.0));

        horizontalBar.translate(horizontalBar.getCoords(),new Point2d(new Double[] {0.0, halfMaxHeight}));

        Double angleInclination = 10.0;
        Rectangle leftInclinedBar = new Rectangle(stripeThickness*(4.0/7.0), maxHeight);
        leftInclinedBar.rotate(leftInclinedBar.getCoords(), Math.toRadians(angleInclination));


        Rectangle rightInclinedBar = new Rectangle(stripeThickness*(4.0/7.0), maxHeight);
        rightInclinedBar.rotate(rightInclinedBar.getCoords(), Math.toRadians(-angleInclination));
        rightInclinedBar.translate(rightInclinedBar.getCoords(),new Point2d(new Double[] {2.0, 0.0}));

        return new BaseShape()
                .add(horizontalBar)
                .add(leftInclinedBar)
                .add(rightInclinedBar);
    }

    /** TODO
     * Create the letter B graphically
     * @return BaseShape containing the letter B
     */
    public static BaseShape create_B() {

        Ellipse topEllipse =  new Ellipse(maxWidth, halfMaxHeight);
        topEllipse.remove(new Ellipse(maxWidth-stripeThickness, halfMaxHeight-stripeThickness));

        Ellipse bottomEllipse =  new Ellipse(maxWidth, halfMaxHeight);
        bottomEllipse.remove(new Ellipse(maxWidth-stripeThickness, halfMaxHeight-stripeThickness));

        Double[] translateVectorY = {0.0, halfMaxHeight};
        bottomEllipse.translate(bottomEllipse.getCoords(),new Point2d(translateVectorY));


        Rectangle leftBar = new Rectangle(stripeThickness,maxHeight);
        leftBar.translate(leftBar.getCoords(),new Point2d(new Double[] {-25.0, 0.0}));
        leftBar.translate(leftBar.getCoords(),new Point2d(new Double[] {0.0, -28.0}));

        return new BaseShape().add(topEllipse).add(bottomEllipse).add(leftBar);

    }

    /** TODO
     * Create the letter C graphically
     * @return BaseShape containing the letter C
     */
    public static BaseShape create_C() {

        Ellipse croissant =  new Ellipse(maxWidth, maxHeight);
        croissant.remove(new Ellipse(maxWidth-stripeThickness, maxHeight-stripeThickness));
        for(Point2d coord :croissant.getCoords())
        {
            if(coord.Y() > -halfMaxHeight/1.5 && coord.Y() < halfMaxHeight/1.5 && coord.X()>0)
            {
                croissant.remove(coord);
            }
        }
        return new BaseShape().add(croissant);
    }

    /** TODO
     * Create the letter E graphically
     * @return BaseShape containing the letter E
     */
    public static BaseShape create_E() {

        Rectangle topHorizontalBar = new Rectangle(maxWidth, halfStripeThickness);

        Rectangle middleHorizontalBar = new Rectangle(maxWidth, halfStripeThickness);
        middleHorizontalBar.translate(middleHorizontalBar.getCoords(),new Point2d(new Double[] {0.0,-halfMaxHeight+halfStripeThickness}));

        Rectangle bottomHorizontalBar = new Rectangle(maxWidth, halfStripeThickness);
        bottomHorizontalBar.translate(bottomHorizontalBar.getCoords(),new Point2d(new Double[] {0.0,-maxHeight+halfStripeThickness}));

        Rectangle leftVerticalBar = new Rectangle(halfStripeThickness,maxHeight);
        leftVerticalBar.translate(leftVerticalBar.getCoords(),new Point2d(new Double[] {-halfMaxWidth,0.0}));
        leftVerticalBar.translate(leftVerticalBar.getCoords(),new Point2d(new Double[] {0.0,-(maxHeight+16.40) }));

        return new BaseShape().add(leftVerticalBar).add(topHorizontalBar).add(bottomHorizontalBar).add(middleHorizontalBar);

    }

    /** TODO
     * Create the letter H graphically
     * @return BaseShape containing the letter H
     */
    public static BaseShape create_H() {

        Rectangle leftSide = new Rectangle(stripeThickness/2, maxHeight);
        leftSide.addAll(leftSide.translate(leftSide.getCoords(), new Point2d(- halfMaxWidth, 0.0)));
        Rectangle rightSide = new Rectangle(stripeThickness/2, maxHeight);
        rightSide.addAll(rightSide.translate(rightSide.getCoords(), new Point2d( halfMaxWidth, 0.0)));
        Rectangle middle = new Rectangle(maxWidth, stripeThickness/2 );
        middle.addAll(middle.translate(middle.getCoords(), new Point2d( halfMaxWidth-30, maxHeight/1.5)));

        return new BaseShape().add(rightSide).add(leftSide).add(middle);
    }

    /** TODO
     * Create the letter N graphically
     * @return BaseShape containing the letter N
     */
    public static BaseShape create_N() {

        Rectangle leftSide = new Rectangle(halfStripeThickness, maxHeight);
        Rectangle rightSide = leftSide.clone();
        Rectangle diagonale = new Rectangle(halfStripeThickness, maxHeight+5);


        leftSide.addAll(leftSide.translate(leftSide.getCoords(), new Point2d(-halfMaxWidth+21, 0.0)));
        rightSide.addAll(rightSide.translate(rightSide.getCoords(), new Point2d(halfMaxWidth+21, 0.0)));
        Double angle =  -1.3*Math.PI / 12;
        diagonale.addAll(diagonale.rotate(diagonale.getCoords(), angle));


        BaseShape Nshape = new BaseShape();
        Nshape.add(leftSide);
        Nshape.add(rightSide);
        Nshape.add(diagonale);

        return Nshape;
    }

    /** TODO
     * Create the letter O graphically
     * @return BaseShape containing the letter O
     */
    public static BaseShape create_O() {


        return new Ellipse(maxWidth, maxHeight).remove(new Ellipse(maxWidth-stripeThickness, maxHeight-stripeThickness));
    }




}


