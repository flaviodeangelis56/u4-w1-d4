public class Dipendente {
    public double stipendioBase = 1000;
    private String matricola;
    private double stipendio;
    private double importoOrarioStraordinario;
    private TipoLivello livello;
    private TipoDipartimento dipartimento;

    // COSTRURROTI
    public Dipendente(String matricola, TipoDipartimento dipartimento) {
        this.stipendio = stipendioBase;
        this.importoOrarioStraordinario = 30;
        this.livello = TipoLivello.OPERAIO;
    }

    public Dipendente(double stipendioBase, String matricola, double stipendio, double importoOrarioStraordinario, TipoLivello livello, TipoDipartimento dipartimento) {
        this.stipendioBase = stipendioBase;
        this.matricola = matricola;
        this.stipendio = stipendio;
        this.importoOrarioStraordinario = importoOrarioStraordinario;
        this.livello = livello;
        this.dipartimento = dipartimento;
    }

    // METODI STATICI
    public static double calcolaPaga(Dipendente istanzaDipendente) {
        return istanzaDipendente.stipendio + istanzaDipendente.stipendioBase;
    }

    public static double calcolaPagaConStraordinari(Dipendente istanzaDipendente, int oreStraordinari) {
        return (istanzaDipendente.stipendio + istanzaDipendente.stipendioBase) + (istanzaDipendente.importoOrarioStraordinario * oreStraordinari);
    }

    // GETTER
    public double getStipendioBase() {
        return stipendioBase;
    }

    public String getMatricola() {
        return matricola;
    }

    public double getStipendio() {
        return stipendio;
    }

    // METODI

    public double getImportoOrarioStraordinario() {
        return importoOrarioStraordinario;
    }

    public void setImportoOrarioStraordinario(double importoOrarioStraordinario) {
        this.importoOrarioStraordinario = importoOrarioStraordinario;
    }

    public TipoLivello getLivello() {
        return livello;
    }

    public TipoDipartimento getDipartimento() {
        return dipartimento;
    }

    // SETTER
    public void setDipartimento(TipoDipartimento dipartimento) {
        this.dipartimento = dipartimento;
    }

    @Override
    public String toString() {
        return "Dipendente{" +
                "stipendioBase=" + stipendioBase +
                ", matricola='" + matricola + '\'' +
                ", stipendio=" + stipendio +
                ", importoOrarioStraordinario=" + importoOrarioStraordinario +
                ", livello=" + livello +
                ", dipartimento=" + dipartimento +
                '}';
    }

    public void stampaDatiDipendente() {
        System.out.println("Dipendente{" +
                "stipendioBase=" + this.stipendioBase +
                ", matricola='" + this.matricola + '\'' +
                ", stipendio=" + this.stipendio +
                ", importoOrarioStraordinario=" + this.importoOrarioStraordinario +
                ", livello=" + this.livello +
                ", dipartimento=" + this.dipartimento +
                '}');
    }

    public void promuovi() {
        if (this.livello == TipoLivello.DIRIGENTE) {
            System.out.println("Questo dipendete a già raggiunto il grado massimo è un DIRIGENTE");
        }
        if (this.livello == TipoLivello.QUADRO) {
            this.livello = TipoLivello.DIRIGENTE;
            this.stipendioBase = this.stipendio * 2;
            System.out.println(this.livello);
        }
        if (this.livello == TipoLivello.IMPIEGATO) {
            this.livello = TipoLivello.QUADRO;
            this.stipendioBase = this.stipendio * 1.5;
            System.out.println(this.livello);
        }
        if (this.livello == TipoLivello.OPERAIO) {
            this.livello = TipoLivello.IMPIEGATO;
            this.stipendioBase = this.stipendio * 1.2;
            System.out.println(this.livello);
        }
    }
}
