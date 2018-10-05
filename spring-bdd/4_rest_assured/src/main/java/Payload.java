public class Payload {
    public static String getPostData(){
String b = "{\n" +
        "    \"location\":{\n" +
        "        \"lat\" : -38.383494,\n" +
        "        \"lng\" : 33.427362\n" +
        "    },\n" +
        "    \"accuracy\":50,\n" +
        "    \"name\":\"Frontline house\",\n" +
        "    \"phone_number\":\"(+91) 983 893 3937\",\n" +
        "    \"address\" : \"29, side layout, cohen 09\",\n" +
        "    \"types\": [\"shoe park\",\"shop\"],\n" +
        "    \"website\" : \"http://google.com\",\n" +
        "    \"language\" : \"French-IN\"\n" +
        "}\n" +
        "\n";

return b;
    }
}
