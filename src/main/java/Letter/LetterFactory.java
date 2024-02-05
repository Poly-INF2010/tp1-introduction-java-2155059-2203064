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


        // Create the central vertical bar of 'A'
        Rectangle horizontalBar = new Rectangle(maxWidth*(1.0/4.0), stripeThickness*(4.0/7.0));


        Double[] translateVectorX = {2.0, 0.0};
        Double[] translateVectorY = {0.0, halfMaxHeight};
        horizontalBar.translate(horizontalBar.getCoords(),new Point2d(translateVectorY));


        Rectangle leftInclinedBar = new Rectangle(stripeThickness*(4.0/7.0), maxHeight);
        leftInclinedBar.rotate(leftInclinedBar.getCoords(), Math.toRadians(10.0));


        Rectangle rightInclinedBar = new Rectangle(stripeThickness*(4.0/7.0), maxHeight);
        rightInclinedBar.rotate(rightInclinedBar.getCoords(), Math.toRadians(-10.0));
        rightInclinedBar.translate(rightInclinedBar.getCoords(),new Point2d(translateVectorX));

        BaseShape letterA = new BaseShape();
        letterA.add(horizontalBar);
        letterA.add(leftInclinedBar);
        letterA.add(rightInclinedBar);



        return letterA;
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

        BaseShape letterB = new BaseShape();
        letterB.add(topEllipse);
        letterB.add(bottomEllipse);
        letterB.add(leftBar);
        return letterB;
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
        BaseShape letterC = new BaseShape();
        letterC.add(croissant);
        return letterC;
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





        BaseShape letterE = new BaseShape();
        letterE.add(leftVerticalBar);
        letterE.add(topHorizontalBar);
        letterE.add(bottomHorizontalBar);
        letterE.add(middleHorizontalBar);


        return letterE;
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

        BaseShape Hshape = new BaseShape();
        Hshape.add(rightSide);
        Hshape.add(leftSide);
        Hshape.add(middle);
        return Hshape;
    }

    /** TODO
     * Create the letter N graphically
     * @return BaseShape containing the letter N
     */
    public static BaseShape create_N() {

        Rectangle leftSide = new Rectangle(halfStripeThickness, maxHeight);
        Rectangle rightSide = leftSide.clone();
        Rectangle diagonale = new Rectangle(halfStripeThickness, maxHeight+5);
        double angle =  -1.3*Math.PI / 12;

        leftSide.addAll(leftSide.translate(leftSide.getCoords(), new Point2d(-halfMaxWidth+21, 0.0)));
        rightSide.addAll(rightSide.translate(rightSide.getCoords(), new Point2d(halfMaxWidth+21, 0.0)));
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


