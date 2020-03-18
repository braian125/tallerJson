import org.json.JSONException;
import org.json.JSONObject;
import org.json.XML;

public class LabJson_punto2 {

    public static int PRETTY_PRINT_IDENT_FACTOR = 4;
    public static String XML_STRING =
            "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
                    " <flights>\n " +
                        " <flight>\n " +
                            " <from>Medellin</from>\n " +
                            " <to>Bogota</to>\n " +
                            " <fare>$150,000</fare>\n " +
                            " <aircraft>Airbus A330</aircraft>\n " +
                        " </flight>\n " +
                        " <flight>\n " +
                            " <from>Bogota</from>\n " +
                            " <to>Cartagena</to>\n " +
                            " <fare>$198,000</fare>\n " +
                            " <aircraft>Boeing 747</aircraft>\n " +
                        " </flight>\n " +
                        " <flight>\n " +
                            " <from>Barranquilla</from>\n " +
                            " <to>Medellin</to>\n " +
                            " <fare>$175,000</fare>\n " +
                            " <aircraft>Boeing 777</aircraft>\n " +
                        " </flight>\n " +
                    " </flights>\n ";

    public static void main(String[] args) {
        try {
            JSONObject jsobject = XML.toJSONObject(XML_STRING);
            String jsonPretty = jsobject.toString(PRETTY_PRINT_IDENT_FACTOR);
            System.out.println(jsonPretty);
        }catch (JSONException jex) {
            System.out.println(jex.toString());
        }
    }
}
