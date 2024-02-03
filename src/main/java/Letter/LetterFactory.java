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
        Rectangle horizontalBar = new Rectangle(stripeThickness, maxWidth);

        horizontalBar.rotate(horizontalBar.getCoords(),Math.toRadians(90.0));

        Rectangle leftInclinedBar = new Rectangle(stripeThickness, maxHeight);
        leftInclinedBar.rotate(leftInclinedBar.getCoords(), Math.toRadians(-45.0));

        Rectangle rightInclinedBar = new Rectangle(stripeThickness, maxHeight);
        rightInclinedBar.rotate(rightInclinedBar.getCoords(), Math.toRadians(45.0));

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

        BaseShape letterB = new BaseShape();
        return letterB;
    }

    /** TODO
     * Create the letter C graphically
     * @return BaseShape containing the letter C
     */
    public static BaseShape create_C() {
        BaseShape letterC = new BaseShape();
        return letterC;
    }

    /** TODO
     * Create the letter E graphically
     * @return BaseShape containing the letter E
     */
    public static BaseShape create_E() {

        BaseShape letterE = new BaseShape();
        return letterE;
    }

    /** TODO
     * Create the letter H graphically
     * @return BaseShape containing the letter H
     */
    public static BaseShape create_H() {

        BaseShape letterH = new BaseShape();
        return letterH;
    }

    /** TODO
     * Create the letter N graphically
     * @return BaseShape containing the letter N
     */
    public static BaseShape create_N() {

        BaseShape letterN = new BaseShape();
        return letterN;
    }

    /** TODO
     * Create the letter O graphically
     * @return BaseShape containing the letter O
     */
    public static BaseShape create_O() {

        BaseShape letterO = new BaseShape();
        return letterO;
    }




}


