value class Vec3 {
  final double x;
  final double y;
  final double z;

  public Vec3(double x, double y, double z) {

//    super();

//    IO.println(this.toString());

//    if (Double.isNaN(x) || Double.isNaN(y) || Double.isNaN(z)) {
//      throw new IllegalArgumentException("Vector components shall be numbers");
//    }

    this.x = x;
    this.y = y;
    this.z = z;

//    IO.println(this.toString());

//    if (Double.isNaN(x) || Double.isNaN(y) || Double.isNaN(z)) {
//      throw new IllegalArgumentException("Vector components shall be numbers");
//    }

//    super();
  }

  @Override
  public String toString() {
    return "Vec3{" +
      "x=" + x +
      ", y=" + y +
      ", z=" + z +
      '}';
  }
}
void main() {
  var vector = new Vec3(1.0, 2.0, 3.0);
}