value record Vec3(double x, double y, double z) {}

void main() {
  var v1 = new Vec3(1.0, 2.0, 3.0);
  IO.println(v1);
  IO.println(v1.getClass().isValue());
}