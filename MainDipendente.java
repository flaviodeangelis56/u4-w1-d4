public class MainDipendente {
    public static void main(String[] args) {
        Dipendente filippo = new Dipendente(500, "MT45TR", 500, 30, TipoLivello.OPERAIO, TipoDipartimento.VENDITE);
        filippo.stampaDatiDipendente();
        filippo.promuovi();

        System.out.println(Dipendente.calcolaPaga(filippo));
        System.out.println(Dipendente.calcolaPagaConStraordinari(filippo, 10));
    }
}
