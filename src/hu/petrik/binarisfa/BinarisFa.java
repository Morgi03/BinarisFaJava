package hu.petrik.binarisfa;

public class BinarisFa<T extends Comparable<T>> {
    private BiFaElem<T> fej;

    public BinarisFa() {
        this.fej = null;
    }

    public void beszur(T ertek) {
        if (this.fej == null) {
            this.fej = new BiFaElem<>(ertek);
        } else {
            fej.beszur(ertek)
        }
    }

    private class BiFaElem<T extends Comparable<T>> {
        private T ertek;
        private BiFaElem<T> bal;
        private BiFaElem<T> jobb;

        public BiFaElem(T ertek) {
            this.ertek = ertek;
            this.bal = null;
            this.jobb = null;
        }

        public T getErtek() {
            return ertek;
        }

        public void setErtek(T ertek) {
            this.ertek = ertek;
        }

        public BiFaElem<T> getBal() {
            return bal;
        }

        public void setBal(BiFaElem<T> bal) {
            this.bal = bal;
        }

        public BiFaElem<T> getJobb() {
            return jobb;
        }

        public void setJobb(BiFaElem<T> jobb) {
            this.jobb = jobb;
        }

        public void beszur(T ertek) {
            if (ertek.compareTo(this.ertek) < 0) {
                //TODO: beszúrás balra
            } else {
                //TODO: beszúrás jobbra
            }
        }
    }
}
