package dataset;

import java.util.Arrays;
import java.util.List;

public class DataSet {
    public static List<Student> students = Arrays.asList(
            new Student("S001", "김남승", 3, "Software", new Score(100, 90, 80))
            , new Student("D001", "김동혁", 3, "Design", new Score(80, 100, 90))
            , new Student("S002", "김병기", 4, "Software", new Score(97, 100, 100))
            , new Student ("D002", "Sienna", 4,  "Design", new Score(76, 25, 30))
            , new Student ("S003", "Pil", 4,  "Software", new Score(32, 90, 45))
            , new Student ("S006", "Clint", 3,  "Software", new Score(99, 80, 21))
            , new Student ("S004", "Khan", 2,  "Software", new Score(100, 70, 67))
            , new Student ("A001", "Mike", 2,  "Advertisement", new Score(89, 51, 89))
            , new Student ("S005", "Sven", 2,  "Software", new Score(23, 84, 99))
            , new Student ("T001", "Peter", 1,  "Theater", new Score(59, 88, 21))
    );
}
