package jan20;

public class tutoriallydia {

    public static void main(String[] args) {

        /// Types (DataTypes in JAVA)
        Float f = 2.54f; // Float type - 32 bits
        String s = "Lydia"; // String - 8 bits
        Boolean b = true; // 1 byte
        Double d = 2.567d; // 64 bits
        Character c = 'b'; // 16 bits - 4byte
        Short sh = 2; // 16 bits - 4byte
        Long l = 2000l; // 64 bits
        Byte by = 124; // 8bits - 2 bytes
        Integer in = 123; // 32bits - 8bytes
        Integer[] arr = new Integer[] { 1, 2, 3 };

        // Variables
        // [AccessModifier?] [Type] [varName]
        Integer myVar = 34;
        Boolean myBool = true;
        Long aVeryLongNumber = 1_000_000_000L;

        System.out.println("Welcome to tutorial");
        System.out.println(myVar);
        System.out.println(myBool);
        System.out.println(aVeryLongNumber);


        //instantiate ->
        Car newCar = new Car(1, "Lydia Oyetoyan");
        Car myCar = new Car();
        Boolean resultOfStartingCar = myCar.startCar(1);
    
        System.out.println("Result of starting car. Was the car started?  " + resultOfStartingCar);
        System.out.println("State of the car after starting car: >>> " + myCar.getState());

        Boolean stopCarResult = myCar.stopCar(0);
        System.out.println();
        System.out.println();
        System.out.println("Result of stopping car. Was the car stopped?  " + stopCarResult); //true
        System.out.println("State of the car after stopping car: >>> " + myCar.getState()); //0



    }
}
