package Generic.Class;

public class ClassMain {
    static void main() {
        Pocket<Double, Double, Double> size3dl =
                new Pocket<>(123.45, 234.56, 345.67);

        var size3dl2 = new Pocket<>(123.45, 234.56, 345.67);

        double width = size3dl.getFieldA();
        double height = size3dl.getFieldB();
        double depth = size3dl.getFieldC();

        Pocket<String, Integer, Boolean> person =
                new Pocket<>("홍길동",20,false);

        Pocket<String, Integer, Boolean>[] people = new Pocket[] {
                new Pocket<>("전우치", 19, false),
                new Pocket<>("이도룡", 21, true),
                new Pocket<>("성춘향", 18, true)
        };
    }



}
