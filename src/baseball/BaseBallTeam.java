package baseball;

public class BaseBallTeam {
    private String name;
    private int win;
    private int lose;
    private int draw;

    public BaseBallTeam(){
    }

    public BaseBallTeam(String name,int win,int lose,int draw) {
        this.name = name;
        this.win = win;
        this.lose = lose;
        this.draw = draw;
    }

    public double getRate() {
        double rate = (double)this.win / (this.win + this.lose);
        return rate;
    }

    public void report() {
        System.out.println(this.name+" の2022年の成績は　"+this.win+"勝　"+this.lose+"敗　"+this.draw+"分、勝率は　"+this.getRate()+"です。");
    }
}
