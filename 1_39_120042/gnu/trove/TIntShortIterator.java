package gnu.trove;

public class TIntShortIterator extends TPrimitiveIterator
{
    private final TIntShortHashMap _map;
    
    public TIntShortIterator(final TIntShortHashMap map) {
        super(map);
        this._map = map;
    }
    
    public void advance() {
        this.moveToNextIndex();
    }
    
    public int key() {
        return this._map._set[this._index];
    }
    
    public short value() {
        return this._map._values[this._index];
    }
    
    public short setValue(final short val) {
        final short old = this.value();
        this._map._values[this._index] = val;
        return old;
    }
}
