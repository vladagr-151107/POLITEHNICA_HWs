package HW8;

public class Test {
    public static void main(String[] args) {
        Form[] forms = new Form[3];
        forms[0] = new Point(2, 3);
        forms[1] = new Circle(6, 4, 5);
        forms[2] = new Cylinder(12, 8, 2, 3);

        for (Form form : forms) {
            System.out.println(form);
            System.out.println("Area: " + form.computeArea());
            System.out.println("Volume: " + form.computeVolume());
            System.out.println();
        }
    }
}
