public class GestioneDipendenti {
    public static void main(String[] args) {

        Dipendente goku = new Dipendente(500, "GO453KU", 500, 30, TipoLivello.OPERAIO, TipoDipartimento.PRODUZIONE);
        Dipendente vegeta = new Dipendente(500, "VEG657TA", 500, 30, TipoLivello.OPERAIO, TipoDipartimento.PRODUZIONE);
        Dipendente killua = new Dipendente(700, "KILL908UA", 700, 40, TipoLivello.IMPIEGATO, TipoDipartimento.AMMINISTRAZIONE);
        Dipendente gon = new Dipendente(1500, "GO3241N", 1000, 50, TipoLivello.DIRIGENTE, TipoDipartimento.VENDITE);
        goku.promuovi();
        goku.stampaDatiDipendente();
        vegeta.stampaDatiDipendente();
        killua.promuovi();
        killua.stampaDatiDipendente();
        gon.stampaDatiDipendente();
        double stipendioGoku = Dipendente.calcolaPagaConStraordinari(goku, 5);
        double stipendioVegeta = Dipendente.calcolaPagaConStraordinari(vegeta, 5);
        double stipendioKillua = Dipendente.calcolaPagaConStraordinari(killua, 5);
        double stipendioGon = Dipendente.calcolaPagaConStraordinari(gon, 5);
        calcolaSommaStipendi(stipendioGoku, stipendioVegeta, stipendioKillua, stipendioGon);

    }

    public static void calcolaSommaStipendi(double stipendioGoku, double stipendioVegeta, double stipendioKillua, double stipendioGon) {
        System.out.println("somma stipendi dipendenti : ");
        System.out.println(stipendioGoku + stipendioVegeta + stipendioKillua + stipendioGon);
    }
}
