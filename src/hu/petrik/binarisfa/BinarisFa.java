package hu.petrik.binarisfa;

public class BinarisFa<T> {
    private BiFaElem fej;
    private class BiFaElem<T> {
        private T ertek;
        private BiFaElem<T> bal;
        private BiFaElem<T> jobb;

        public BiFaElem(T ertek) {
            this.ertek = ertek;
            this.bal = null;
            this.jobb = null;
        }
    }
}
