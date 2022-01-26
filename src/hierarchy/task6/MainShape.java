package hierarchy.task6;

public class MainShape {
    public static void main(String args[]) {

        Pyramid pyr1 = new Pyramid(3.25, 5.765);
        pyr1.getVolume();

        Cylinder cyl1 = new Cylinder(23.5, 5.2);

        Box myBox = new Box(65.45);

       System.out.println(myBox.add(pyr1));
       System.out.println(myBox.add(cyl1));


    }
}
