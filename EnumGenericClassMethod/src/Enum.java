public class Enum {
    public static void main(String[] args) {

        //Enum
        System.out.println("Implementation of Enum: \n");
        Level easyLevel = Level.Easy;
        System.out.println(easyLevel);

        Level mediumLevel = Level.Medium;
        System.out.println(mediumLevel);

        Level hardLevel = Level.Hard;
        System.out.println(hardLevel);
        System.out.println("\n");

        //End of Enum

        //Generic Class
        System.out.println("Implementation of Generic Class: \n");
        GenericClass<Integer> object1 = new GenericClass<Integer>(100);
        System.out.println(object1.getObject());

        GenericClass<String> object2 = new GenericClass<String>("Hello!");
        System.out.println(object2.getObject());

        GenericClass<Double> object3 = new GenericClass<Double>(8.8);
        System.out.println(object3.getObject());
        System.out.println("\n");

        //End of Generic Class

        //Generic Method
        System.out.println("Implementation of Generic Method: \n");
        GenericMethod example1 = new GenericMethod();
        example1.printvalue("Haha");
        example1.printvalue(100);
        System.out.println("\n");

        //End of Generic Method


    }
}