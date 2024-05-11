public class BST <K , V>{
    BSTNode<K, V> root ;
    public void put (K key , V value) {
        root = put(root , new BSTNode<>(key , value)) ;
    }
    private BSTNode<K , V> put(BSTNode<K , V> current , BSTNode<K , V> newNode) {
        if (current = null) {
            return newNode ;
        }

        int cmp = newNode.key.compareTo(current.key) ;
        if (cmp > 0) {
            current.right = put(current.right , newNode) ;
        }
        else if (cmp < 0) {
            current.left = put(current.left , newNode) ;
        }
        else {
            current.value = newNode.value ;
        }

        return current ;
    }

    private static class BSTNode <K , V> {
        K key ;
        V value ;
        int length = 1 ;

        BSTNode<K, V> left , right ;


    }
}
