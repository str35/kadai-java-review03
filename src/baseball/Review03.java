package baseball;

public class Review03 {

    public static void main(String[] args) {
        BaseBallTeam yakuruto = new BaseBallTeam("東京ヤクルトスワローズ",80,59,4);
        BaseBallTeam dena = new BaseBallTeam("横浜DeNAベイスターズ",73,68,2);
        BaseBallTeam hanshin = new BaseBallTeam("阪神タイガース",68,71,4);
        BaseBallTeam yomiuri = new BaseBallTeam("読売ジャイアンツ",68,72,3);
        BaseBallTeam toyo = new BaseBallTeam("広島東洋カープ",66,74,3);
        BaseBallTeam chuuniti = new BaseBallTeam("中日ドラゴンズ",66,75,2);

        yakuruto.report();
        dena.report();
        hanshin.report();
        yomiuri.report();
        toyo.report();
        chuuniti.report();
    }

}
