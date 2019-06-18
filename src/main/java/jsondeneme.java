
import org.json.JSONException;
import org.json.JSONObject;
import org.json.*;
import org.apache.log4j.Logger;

public class jsondeneme {

    private static final Logger logger = Logger.getLogger(jsondeneme.class);
    public static void main(String[] args) throws JSONException {

        //Json nesnesi oluşturuyorum
        JSONObject MyJsonObject = new JSONObject();

        //şimdi veriler ekleyelim.
        MyJsonObject.put("Ad", "Tuğçe");
        MyJsonObject.put("SoyAd", "Yalçın");
        MyJsonObject.put("Bölüm", "Elektrik-Elektronik Müh");
        MyJsonObject.put("Sınıf", 4);

        //ekrana gösterme
        System.out.println(MyJsonObject);
        logger.info(MyJsonObject);


        //JsonArray oluşturuyorum
        JSONArray MyJsonArray=new JSONArray ();

        //Array de yer alan veriler ekliyorum
        MyJsonArray.put("TOBB Üniversitesi");
        MyJsonArray.put("Fen Lisesi");

        //Array e bir isim vererek , daha önce oluşturduğum nesneye ekliyorum
        MyJsonObject.put("Okullar", MyJsonArray);

        System.out.println(MyJsonObject);



    }
}
