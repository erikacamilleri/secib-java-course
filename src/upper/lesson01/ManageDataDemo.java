package upper.lesson01;

import org.json.JSONObject;

public class ManageDataDemo {
    public static void main(String[] args) {
        // RTV123JKLMN123;FB;CEL;RAN;{"api":"https://blabla.com", "token":"QaB567833434dsdfJKL12"}
        JSONObject metaData = new JSONObject();
        metaData.put("api", "https://blabla.com");
        metaData.put("token", "QaB567833434dsdfJKL12");
        Fixture mltJuv = new Fixture(
            "ZTV123VKLMN123",
            "FB",
            "MLT",
            "RAN",
            metaData
        );
        mltJuv.save();
    }
}
