void main() {
  Integer i1 = Integer.valueOf(1024);
  Integer i2 = Integer.valueOf(1024);

  IO.println("i1 : " + i1);
  IO.println("i2 : " + i2);

  IO.println("== : " + (i1 == i2));
  IO.println("equals : " + i1.equals(i2));

  IO.println("==============");

  // Long, Double, Character, ...
  IO.println("Long      " + (Long.valueOf(2026) == Long.valueOf(2026)));
  IO.println("Double    " + (Double.valueOf(2026d) == Double.valueOf(2026d)));
  IO.println("Character " + (Character.valueOf('S') == Character.valueOf('S')));
  IO.println("...");
  // ...

  IO.println("==============");

  LocalDate t1 = LocalDate.of(2026, Month.OCTOBER, 9);
  LocalDate t2 = LocalDate.of(2026, Month.OCTOBER, 9);

  IO.println("LocalDate " + (t1 == t2));

  IO.println("==============");

  Optional<String> o1 = Optional.of("Devoxx");
  Optional<String> o2 = Optional.of("Devoxx");

  IO.println("Optional  " + (o1 == o2));
}