package ru.atom.geometry;

/**
 * Template class for
 */
public class Point implements Collider /* super class and interfaces here if necessary */ {
    // fields
    private int x,y;

    // and methods
    Point(int x, int y){
        this.x=x;
        this.y=y;
    }

    int getX() {
        return x;
    }

    int getY() {
        return y;
    }

    /**
     * @param o - other object to check equality with
     * @return true if two points are equal and not null.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        // cast from Object to Point
        Point point = (Point) o;

        // your code here
        return this.x == point.x && this.y == point.y;
        //throw new UnsupportedOperationException();
    }

    @Override
    public boolean isColliding(Collider collider) {
        if (collider instanceof Point){
//            Point point= (Point) collider;
            return this.equals(collider);
        }
        return false;
    }
}
