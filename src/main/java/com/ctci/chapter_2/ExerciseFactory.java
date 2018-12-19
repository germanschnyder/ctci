package com.ctci.chapter_2;

public class ExerciseFactory {

    @SuppressWarnings("unchecked")
    public static <T extends Chapter2_Exercise> T getExerciseByName(int number) {
        return getExerciseByName(number, 0);
    }

    @SuppressWarnings("unchecked")
    public static <T extends Chapter2_Exercise> T getExerciseByName(int number, int version) {
        String exerciseClassName = version > 0 ?
                String.format("Exercise_%d_%d", number, version) : String.format("Exercise_%d", number);

        exerciseClassName = ExerciseFactory.class.getPackage().getName() + "." + exerciseClassName;
        try {
            Class<?> clazz = Class.forName(exerciseClassName);
            return (T) clazz.newInstance();
        } catch (InstantiationException | ClassNotFoundException | IllegalAccessException e) {
            throw new IllegalArgumentException(String.format("Exercise %s not found", exerciseClassName));
        }
    }
}