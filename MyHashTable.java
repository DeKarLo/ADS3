public class MyHashTable <K, V> {
    private class HashNode<K, V> {
        private K key;
        private V value;
        private HashNode<K, V> next;

        public HashNode(K key, V value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public String toString(){
            return "{" + key + " " + value + "}";
        }
    }

    private HashNode<K, V>[] chainArray;
    private int M = 11;
    private int size;

    public MyHashTable() {
        this.M = M;
        this.size = 0;
        this.chainArray = new HashNode[M];
    }

    public MyHashTable(int M) {
        this.M = M;
        this.size = 0;
        this.chainArray = new HashNode[M];
    }

    private int hash(K key) {
        return key.hashCode() % M;
    }

    public void put(K key, V value) {
        int index = hash(key);
        HashNode<K, V> node = new HashNode<>(key, value);
        node.next = chainArray[index];
        chainArray[index] = node;
        size++;
    }

    public V get(K key) {
        int index = hash(key);
        HashNode<K, V> currentNode = chainArray[index];
        while (currentNode != null) {
            if(currentNode.key.equals(key)) {
                return currentNode.value;
            }
        }
        return null;
    }

    public V remove(K key) {
        return null;
    }

    public boolean contains(V value) {
        return false;
    }

    public K getKey(V value) {
        return null;
    }


}
