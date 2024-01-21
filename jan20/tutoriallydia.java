package jan20;

public class tutoriallydia {

    private static void checkVoterAge(Integer ageOfVoter){
        if(ageOfVoter >= 18){
            System.out.println("Very good, you can now vote");
        }else{
            System.out.println("Sorry, you are not old enough to cast a vote");
        }
    }
    private static Integer getValidVoterAge(){
        return 18;
    }
    private static Integer numberDoubler(Integer numberToBeDoubled){
        return numberToBeDoubled * 2;
    }
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
        Integer[] arr = new Integer[] { 1, 2, 3, 4, 5 };
        String[] names = new String[] {"Lydia", "Faith"};

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



        // Jan 21st 2024
        // Table of Contents-----
        // Control flow 
        // Loops (For Loops, While, Do While)
        // Conditionals If, Else, Else If, 
        // Methods (functions)
        // Variable Scopes (Scoping)
        // Type Conversion [TypeCasting]


        // Control FLow 

        //Loops 
        //perform an action repeatedly until a condition is satisfied... iteration...
        //1 - For Loops
        for(Integer i =0; i<=5; i++){
            //action...
            System.out.println(i);

        }
        //2 - Foreach Loop
        for(Integer i :  arr){
            System.out.println("Array item: " + i);
        }
        // 
        for(String name : names){
            System.out.println(name);
        }

        //3 - While Loop
        Integer currentNumber = 0;
        while(currentNumber <=7){
            System.out.println("Current number is: "+ currentNumber);
            //currentNumber = currentNumber + 1;
            currentNumber++;
        }
        //4 - Do WHILE Loop...
        System.out.println("Our second loop starts here... the do-while loop");
        do {
            //action you want to perform..
            System.out.println("Current number is: "+ currentNumber);
            currentNumber++;
        }while(currentNumber >= 7 && currentNumber <=10);

        //Conditionals...help control flow of execution...
        //if (condition) {statement} else 
        if(currentNumber ==  10){
            System.out.println("We don finish work ooo, currentNumber is 10");
            String myString = "Faith Olusegun";
            System.out.println(myString);
        }
        else if(currentNumber == 9){
            //
            System.out.println("Current number is actually 9");
        }
        else{
            System.out.println("Work is not done yet.");
        }
        Integer age = 19;
        //call the method...
        checkVoterAge(age);
        


        //
        if(age == 18){
            //jkjasdkjkja - leave your parents' house..
        }

        // METHODs 
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();

        int myNumber = 4;
        Integer doubledFour = numberDoubler(myNumber);
        System.out.println("Number " + myNumber + " doubled = " + doubledFour);


        // Type Conversion (TypeCasting) cast, convert from one data type to another
        int number = 200;
        double numberD = number; //automatic casting...
        System.out.println("int NumberBeforeConversion to double = " + number + " after conversion = " + numberD);

        //manual casting..
        double cgpa = 4.58d;
        int cgpaToInt = (int) cgpa;
        System.out.println("double NumberBeforeConversion to int = " + cgpa + " after conversion = " + cgpaToInt);

        






        
        



    }

    //

    
    
}
