package com.ctci.common;

public class ExerciseFactory {

    @SuppressWarnings("unchecked")
    public static <T extends Exercise> T getExerciseByName(int chapter, int number) {
        return getExerciseByName(chapter, number, 0);
    }

    @SuppressWarnings("unchecked")
    public static <T extends Exercise> T getExerciseByName(int chapter, int number, int version) {
        String exerciseClassName = version > 0 ?
                String.format("Exercise_%d_%d", number, version) : String.format("Exercise_%d", number);

        exerciseClassName = String.format("com.ctci.chapter_%d.%s", chapter, exerciseClassName);

        try {
            Class<?> clazz = Class.forName(exerciseClassName);
            return (T) clazz.newInstance();
        } catch (InstantiationException | ClassNotFoundException | IllegalAccessException e) {
            throw new IllegalArgumentException(String.format("Exercise %s not found", exerciseClassName));
        }
    }
}