package seminar_2;

import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

// В файле содержится строка с данными:
// [{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},
//  {"фамилия":"Петрова","оценка":"4","предмет":"Информатика"}, {"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
// Напишите метод, который разберёт её на составные части и, используя StringBuilder создаст массив строк такого вида:
// Студент Иванов получил 5 по предмету Математика.
// Студент Петрова получил 4 по предмету Информатика.
// Студент Краснов получил 5 по предмету Физика.

public class task3 {
    public static void main(String[] args) {
        String str = "{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"}, {\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"}, {\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}";
        String[] jsons = str.split(", ");

        printOut(jsons);

    }

    private static void printOut(String[] jsons) {
        for (int i = 0; i < jsons.length; i++) {
            Object obj = JSONValue.parse(jsons[i]);
            JSONObject jsonObject = (JSONObject) obj;

            String name = (String) jsonObject.get("фамилия");
            String grade = (String) jsonObject.get("оценка");
            String subject = (String) jsonObject.get("предмет");

            System.out.printf("Студент %s получил %s по предмету %s\n", name, grade, subject);
        }
    }

}
