package Homework03;

public class TestProcessor {
    public static boolean stringComparison(String result, String expectedResult) {
        return result.equals(expectedResult);
    }
    public static void getUpEarlyTest(Calendar date) {
       Calendar typicalDateExpected = 2;
       Calendar typicalDateResult = Proffessor.getUpEarly();

        if (stringComparison(typicaDateExpected, typicalDateResult)) {
            System.out.println("Method getUpEarly() from class Student returns what is expected");
        } else {
            System.err.println(
                    "Method getUpEarly() from class Student returns: " +
                            typicalDateResult + ", but the expected result is: " +
                            typicalDateExpected
            );
        }
    }

}
