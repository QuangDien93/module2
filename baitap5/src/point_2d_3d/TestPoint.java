package point_2d_3d;

public class TestPoint {
    public static void main(String[] args) {
//        Point2D point2D = new Point2D(11,12);
//        System.out.println(point2D.toString());
//        point2D.setXY(13,14);
//        System.out.println(point2D.toString());
//        Point3D point3D = new Point3D(1,2,3);
//        System.out.println(point3D.toString());
//        point3D.setXYZ(4,5,6);
//        System.out.println(point3D.toString());
        MoveablePoint moveablePoint = new MoveablePoint(1,2,10,10);
        System.out.println(moveablePoint.toString());
        moveablePoint.move();
        System.out.println(moveablePoint.toString());

    }
}
