package guru.qa;

import guru.qa.domain.Teacher;
import guru.qa.jupiter.TeacherFile;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class ArgumentsExampleTest {

    ClassLoader classLoader = getClass().getClassLoader();
    // classLoader это механизм который позволяет получать файлы из папки resourses
    @CsvSource(value = {
        "1, true",
        "2, false"
            })
   @ParameterizedTest
    void paramTest(int first, boolean second) {
        System.out.println(String.valueOf(first) + second);
    }

    @ValueSource(strings = {"dima.json", "danechka.json"})
    @ParameterizedTest
    void apiParamTest(@TeacherFile Teacher teacher) throws Exception{
        // в реальности будем отправлять объект teacher куда-нибудь в апи
        System.out.println(teacher.toString());
    }
}
