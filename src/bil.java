public class bil {

    private int hastighet;
    private String märke;
    private String modell;
    private String regnr;
    private int årsmodell;

    public bil(String regnr, String märke, String modell, int årsmodell) {

        if (märke == null || märke.isBlank()) {
            throw new IllegalArgumentException("Märke får inte vara tomt");
        }

        if (modell == null || modell.isBlank()) {
            throw new IllegalArgumentException("Modell får inte vara tom");
        }

        if (regnr == null || regnr.isBlank()) {
            throw new IllegalArgumentException("Registreringsnummer får inte vara tomt");
        }

        if (årsmodell < 1860 ||
            årsmodell > java.time.Year.now().getValue()) {
            throw new IllegalArgumentException("Ogiltig årsmodell");
        }

        this.hastighet = 0;
        this.märke = märke;
        this.modell = modell;
        this.regnr = regnr;
        this.årsmodell = årsmodell;
    }

    public void setModell(String modell) {
        if (modell == null || modell.isBlank()) {
            throw new IllegalArgumentException("Modell får inte vara tom");
        }
        this.modell = modell;
    }

    public String get_märke() {
        return märke;
    }

    public int getHastighet() {
        return hastighet;
    }

    public String getModell() {
        return modell;
    }

    public String getRegnr() {
        return regnr;
    }

    public int getÅrsmodell() {
        return årsmodell;
    }

    public void ökaHastighet(int ökning) {
        if (ökning <= 0) {
            throw new IllegalArgumentException("Ökningen måste vara större än 0.");
        }

        hastighet += ökning;
    }

    public void bromsa(int minskning) {
        if (minskning <= 0) {
            throw new IllegalArgumentException( "Minskningen måste vara större än 0." );
        }

        if (minskning > hastighet) {
            hastighet = 0;
        } else {
            hastighet -= minskning;
        }
    }

    // @Override
    // public String toString() {
    //     return "Bil{" +
    //             "märke='" + märke + '\'' +
    //             ", modell='" + modell + '\'' +
    //             ", registreringsnummer='" + regnr + '\'' +
    //             ", årsmodell=" + årsmodell +
    //             ", hastighet=" + hastighet +
    //             '}';
    // }
}