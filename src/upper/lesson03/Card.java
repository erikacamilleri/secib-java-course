package upper.lesson03;

import org.json.JSONObject;

public class Card extends ListNode<JSONObject> {

    boolean isKnown;

    String front;

    String back;

    @Override
    public JSONObject getValue() {
        JSONObject value = new JSONObject();
        value.put("isKnown", this.isKnown);
        value.put("front", this.front);
        value.put("back", this.back);
        return value;
    }
}
