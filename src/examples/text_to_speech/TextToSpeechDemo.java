package examples.text_to_speech;

public class TextToSpeechDemo {
    public static void main(String[] args) throws Exception {
        SpeechUtils su = new SpeechUtils();
        su.init("kevin16");
        // high quality
        su.doSpeak("Miss Camilleri created me to wish you luck in your upcoming exams...");
        su.terminate();
    }
}