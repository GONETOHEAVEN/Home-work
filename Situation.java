public class Situation {
    Situation[] direction;
    String subject, text;
    int dK, dA, dR;

    public Situation(String subject, String text, int variants, int dK, int dA, int dR) {
        this.subject = subject;
        this.text = text;
        this.dK = dK;
        this.dA = dA;
        this.dR = dR;
        direction = new Situation[variants];
    }
}
