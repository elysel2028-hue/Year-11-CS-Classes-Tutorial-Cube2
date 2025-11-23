public class Cube2 {
    private Cube basicCube;
    private String color;

    public Cube2() {
        basicCube = new Cube();
        this.color = "black";
    }

    public Cube2(int side) {
        this();
        basicCube.setSide(side);
    }

    public Cube2(int side, String color) {
        this(side);
        this.color = color;
    }

    public int getSide() {
        return basicCube.getSide();
    }

    public void setSide(int side) {
        basicCube.setSide(side);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int calculateVolume() {
        return basicCube.calculateVolume();
    }

    public int calculateSurfaceArea() {
        return basicCube.calculateSurfaceArea();
    }

    public Cube2 add(Cube2 otherCube) {
        int a = this.getSide();
        int b = otherCube.getSide();
        double c = Math.sqrt(a * a + b * b);

        if (c == (int)c) {
            return new Cube2((int)c, this.color);
        } else {
            throw new IllegalArgumentException("cube side lengths dont form a pythagorean triple");
        }
    }

    public Cube2 minus(Cube2 otherCube) {
        int a = this.getSide();
        int b = otherCube.getSide();

        if (a <= b) {
            throw new IllegalArgumentException("A cube's side length must be equal to or greater than 1");
        }

        double c = Math.sqrt(a * a - b * b);

        if (c == (int)c) {
            return new Cube2((int)c, this.color);
        } else {
            throw new IllegalArgumentException("cube side lengths dont form a pythagorean triple");
        }
    }

    public boolean equals(Cube2 otherCube) {
        return this.getSide() == otherCube.getSide() && this.color.equals(otherCube.color);
    }

@Override
public String toString() {
    return "Cube{side=" + getSide() + ", color=\"" + color + "\"}";
}

    public static void main(String[] args) {
        Cube2 x = new Cube2(6, "red");
        System.out.println(x.toString());
    }
}