// В файле содержится строка с исходными данными в такой форме:
// {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
// Требуется на её основе построить и вывести на экран новую строку, в форме SQL запроса:
// SELECT * FROM students WHERE name = "Ivanov" AND country = "Russia" AND city = "Moscow";
// Для разбора строки используйте String.split. 
// Сформируйте новую строку, используя StringBuilder. Значения null не включаются в запрос.

package seminar_2;

public class task1 {
    public static void main(String[] args) {
        String str = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}";
        System.out.println(createSQLRequest(str));
    }

    private static String createSQLRequest(String request) {
        request = request.substring(1, request.length() - 1);
        System.out.println(request);

        String[] attributes = request.split(", ");

        StringBuilder SQLrequest = new StringBuilder("SELECT * FROM students WHERE");

        for (int i = 0; i < attributes.length; i++) {
            String[] pair = attributes[i].split(":");
            String value = pair[1];

            if (!value.equals("\"null\"")) {
                String key = pair[0].substring(1, pair[0].length() - 1);

                if (i != 0) {
                    SQLrequest.append(" AND");
                }
                SQLrequest.append(" ").append(key).append(" = ").append(value);
            }

        }
        return SQLrequest.toString();
    }
        
}
    



