value class Vec3 {
  final double x;
  final double y;
  final double z;

  public Vec3(double x, double y, double z) {
    this.x = x;
    this.y = y;
    this.z = z;
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
  var v1 = new Vec3(1.0, 2.0, 3.0);
  var v2 = new Vec3(1.0, 2.0, 3.0);

  IO.println(v1);
  IO.println(v1.getClass().isValue());
  IO.println(v1 == v2);

  // hashCode
  IO.println(v1.hashCode());
  IO.println(v2.hashCode());

  IO.println(System.identityHashCode(v1));
  IO.println(System.identityHashCode(v2));

//  synchronized (v1) {
//    // Do stuff
//  }

//  Object o = v1;
//  synchronized (o) {
//    // Trick the compiler
//  }

//  var weakReference = new java.lang.ref.WeakReference<>(v1);
}