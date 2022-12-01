package hu.petrik.lancoltlista;

public class lancoltlista <T>{
    private ListaElem elso;

    public void hozzaAd(T ertek) {
        if (this.elso == null) {
            elso = new ListaElem(ertek);

        }else {
            elso.hozzaAd(ertek);
        }
    }

    private class  ListaElem{
        private T ertek;
        private ListaElem kovetkezo;

        public ListaElem(T ertek) {
            this.ertek = ertek;
            this.kovetkezo = null;
        }

        public void hozzaAd(T ertek) {
        }
    }
}
