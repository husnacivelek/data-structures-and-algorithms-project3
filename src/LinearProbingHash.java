public class LinearProbingHash<Key> {

    Key[] table;
    int M;
    int N;

    public LinearProbingHash(int M) {
        table = (Key[]) new Object[M];
        this.M = M;
    }

    public int hash(int sum) {
        return ((sum & 0x7fffffff) % M);
    }

    public Key contains(Key key,int sum){
        int ix = hash(sum);
        int startIx = ix;

        while (table[ix]!=null && (ix + 1 != startIx)) {
            if (table[ix].equals(key))
                return table[ix];

            ix = (ix + 1) % M;
        }
        return null;
    }

    public boolean insert(Key key,int sum) {
        int ix = hash(sum);
        if (N == M) {
            return false;
        }
        while (table[ix]!=null) {
            if (table[ix].equals(key)) {
                return false;
            }
            ix = (ix + 1) % M;
        }
        table[ix] = key;
        N++;
        return true;
    }

    public String toString() {
        String s = "[";
        for (int i = 0; i < M; i++) {
            s += table[i] + ",";
        }
        return s + "]";
    }
}
