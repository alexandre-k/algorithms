package algo;

public class SymbolTable implements SymboleTableInterface {
    public boolean contains(Key key) {
        return get(key) != null;
    }

    public void delete(Key key) {
        put(key, null);
    }

    public void put(Key key, Value, value) {

    }
}
