package hu.petrik.lancoltlista;

public class lancoltlista<T> {
    private ListaElem elso;
    private ListaElem utolso;

    public void hozzaAd(T ertek) {
        ListaElem ujElem = new ListaElem(ertek);
        ujElem.setElozo(this.utolso);
        if (this.elso == null) {
            this.elso = ujElem;

        } else {
            this.utolso.setKovetkezo(ujElem);
        }
        this.utolso = ujElem;
    }

    @Override
    public String toString() {
        StringBuilder builder= new StringBuilder();
        ListaElem jelenlegiElem = this.elso;
        if (jelenlegiElem != null){
            builder.append(jelenlegiElem);
            jelenlegiElem = jelenlegiElem.getKovetkezo();
        }
        while (jelenlegiElem != null){
            builder.append(", ").append(jelenlegiElem);
            jelenlegiElem = jelenlegiElem.getKovetkezo();
        }
        return builder.toString();
    }

    private class ListaElem {
        private T ertek;
        private ListaElem kovetkezo;
        private ListaElem elozo;

        public ListaElem(T ertek) {
            this.ertek = ertek;
            this.kovetkezo = null;
            this.elozo = null;
        }

        public ListaElem getKovetkezo() {
            return kovetkezo;
        }

        public void setKovetkezo(ListaElem kovetkezo) {
            this.kovetkezo = kovetkezo;
        }

        public ListaElem getElozo() {
            return elozo;
        }

        public void setElozo(ListaElem elozo) {
            this.elozo = elozo;
        }

        @Override
        public String toString() {
            String s = this.ertek.toString();
            if (this.kovetkezo != null){
                s += ", " + this.kovetkezo;
            }
            return s;

        }
    }
}
