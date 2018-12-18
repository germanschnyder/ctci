package main.java.chapter_2;


public class ExerciseFactory {

    //use getShape method to get object of type shape
    public Chapter2_Exercise getExercise(int number, String specific) {
        switch (number) {
            case 1:
                return new Exercise_1();
            case 2:
                return new Exercise_2();
            case 3:
                return new Exercise_3();
            case 4:
                return new Exercise_4();
            case 5:
                return new Exercise_5();
            case 6:
                return new Exercise_6();
            case 7:
                if (specific.equalsIgnoreCase("IntersectWithSet")) {
                    return new IntersectWithSet();
                } else // if (specific.equalsIgnoreCase("IntersectFromTail")) {
                    return new IntersectFromTail();
            case 8:
                if (specific == "FindLoopWithRunners")
                    return new FindLoopWithRunners();
                else
                    return new FindLoopWithHashSet();
            default:
        }

        throw new IllegalArgumentException(String.format("Exercise %d:%s not found", number, specific));
    }
}