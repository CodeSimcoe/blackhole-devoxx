interface Vector {
  double magnitudeSquared();
}

abstract value class AbstractVector implements Vector {
  double magnitude() {
    return Math.sqrt(magnitudeSquared());
  }
}

value class Vec3 extends AbstractVector {
  double x;
  double y;
  double z;

  Vec3(double x, double y, double z) {
    this.x = x;
    this.y = y;
    this.z = z;
  }

  @Override
  public double magnitudeSquared() {
    return x * x + y * y + z * z;
  }
}

void main() {
  var vector = new Vec3(3.0, 4.0, 12.0);
  IO.println(vector.magnitude());
}