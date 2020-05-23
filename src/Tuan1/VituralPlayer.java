package Tuan1;

public class VituralPlayer extends Player {
    private String Emotion;

    public VituralPlayer (String Emotion){
        this.Emotion = Emotion;
    }

    public VituralPlayer (String name, int score, String Emotion){
        super(name, score);
        this.Emotion = Emotion;
    }

    public String getEmotion() {
        return Emotion;
    }

    public void setEmotion(String emotion) {
        this.Emotion = emotion;
    }

    String w[] = {"hahaha, thắng rồi", "ahihi, đồ ngốc","lêu lêu", "gà!!!"};
    String l[] = {"bạn giỏi quá", "hiu hiu", "buồn quá"};



}
