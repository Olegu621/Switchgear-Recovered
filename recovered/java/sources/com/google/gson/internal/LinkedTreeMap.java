            package com.google.gson.internal;

            import java.io.IOException;
            import java.io.InvalidObjectException;
            import java.io.ObjectInputStream;
            import java.io.ObjectStreamException;
            import java.io.Serializable;
            import java.util.AbstractMap;
            import java.util.AbstractSet;
            import java.util.Comparator;
            import java.util.ConcurrentModificationException;
            import java.util.Iterator;
            import java.util.LinkedHashMap;
            import java.util.Map;
            import java.util.Objects;
            import java.util.Set;
            import p000.C1951n4;
            import p000.f42;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 19 */    public final class LinkedTreeMap<K, V> extends AbstractMap<K, V> implements Serializable {
                static final /* synthetic */ boolean $assertionsDisabled = false;
                private static final Comparator<Comparable> NATURAL_ORDER = new Comparator<Comparable>() { // from class: com.google.gson.internal.LinkedTreeMap.1
                    @Override // java.util.Comparator
/* 9 */             public int compare(Comparable comparable, Comparable comparable2) {
/* 10 */                return comparable.compareTo(comparable2);
                    }
                };
                private final boolean allowNullValues;
                private final Comparator<? super K> comparator;
                private LinkedTreeMap<K, V>.EntrySet entrySet;
                final Node<K, V> header;
                private LinkedTreeMap<K, V>.KeySet keySet;
                int modCount;
                Node<K, V> root;
                int size;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public class EntrySet extends AbstractSet<Map.Entry<K, V>> {
                    public EntrySet() {
                    }

                    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
                    public void clear() {
/* 3 */                 LinkedTreeMap.this.clear();
                    }

                    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
                    public boolean contains(Object obj) {
                        return (obj instanceof Map.Entry) && LinkedTreeMap.this.findByEntry((Map.Entry) obj) != null;
                    }

                    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
                    public Iterator<Map.Entry<K, V>> iterator() {
/* 3 */                 return new LinkedTreeMap<K, V>.LinkedTreeMapIterator<Map.Entry<K, V>>() { // from class: com.google.gson.internal.LinkedTreeMap.EntrySet.1
                            {
/* 3 */                         LinkedTreeMap linkedTreeMap = LinkedTreeMap.this;
                            }

                            @Override // java.util.Iterator
/* 5 */                     public Map.Entry<K, V> next() {
/* 6 */                         return nextNode();
                            }
                        };
                    }

                    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
                    public boolean remove(Object obj) {
                        Node<K, V> nodeFindByEntry;
/* 4 */                 if (!(obj instanceof Map.Entry) || (nodeFindByEntry = LinkedTreeMap.this.findByEntry((Map.Entry) obj)) == null) {
/* 3 */                     return false;
                        }
/* 21 */                LinkedTreeMap.this.removeInternal(nodeFindByEntry, true);
/* 20 */                return true;
                    }

                    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
                    public int size() {
/* 3 */                 return LinkedTreeMap.this.size;
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public final class KeySet extends AbstractSet<K> {
                    public KeySet() {
                    }

                    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
                    public void clear() {
/* 3 */                 LinkedTreeMap.this.clear();
                    }

                    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
                    public boolean contains(Object obj) {
/* 3 */                 return LinkedTreeMap.this.containsKey(obj);
                    }

                    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
                    public Iterator<K> iterator() {
/* 3 */                 return new LinkedTreeMap<K, V>.LinkedTreeMapIterator<K>() { // from class: com.google.gson.internal.LinkedTreeMap.KeySet.1
                            {
/* 3 */                         LinkedTreeMap linkedTreeMap = LinkedTreeMap.this;
                            }

                            @Override // java.util.Iterator
                            public K next() {
/* 5 */                         return nextNode().key;
                            }
                        };
                    }

                    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
                    public boolean remove(Object obj) {
                        return LinkedTreeMap.this.removeInternalByKey(obj) != null;
                    }

                    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
                    public int size() {
/* 3 */                 return LinkedTreeMap.this.size;
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public abstract class LinkedTreeMapIterator<T> implements Iterator<T> {
                    int expectedModCount;
                    Node<K, V> lastReturned = null;
                    Node<K, V> next;

                    public LinkedTreeMapIterator() {
/* 10 */                this.next = LinkedTreeMap.this.header.next;
/* 17 */                this.expectedModCount = LinkedTreeMap.this.modCount;
                    }

                    @Override // java.util.Iterator
                    public final boolean hasNext() {
                        return this.next != LinkedTreeMap.this.header;
                    }

                    public final Node<K, V> nextNode() {
/* 1 */                 Node<K, V> node = this.next;
/* 3 */                 LinkedTreeMap linkedTreeMap = LinkedTreeMap.this;
/* 7 */                 if (node == linkedTreeMap.header) {
/* 28 */                    C1951n4.m6864o();
/* 31 */                    return null;
                        }
/* 13 */                if (linkedTreeMap.modCount != this.expectedModCount) {
/* 27 */                    throw new ConcurrentModificationException();
                        }
/* 17 */                this.next = node.next;
/* 19 */                this.lastReturned = node;
/* 21 */                return node;
                    }

                    @Override // java.util.Iterator
                    public final void remove() {
/* 1 */                 Node<K, V> node = this.lastReturned;
/* 3 */                 if (node == null) {
/* 21 */                    f42.m3664t();
/* 24 */                    return;
                        }
/* 8 */                 LinkedTreeMap.this.removeInternal(node, true);
/* 12 */                this.lastReturned = null;
/* 18 */                this.expectedModCount = LinkedTreeMap.this.modCount;
                    }
                }

                public LinkedTreeMap(Comparator<? super K> comparator, boolean z) {
/* 5 */             this.size = 0;
/* 7 */             this.modCount = 0;
/* 14 */            this.comparator = comparator == null ? NATURAL_ORDER : comparator;
/* 16 */            this.allowNullValues = z;
/* 23 */            this.header = new Node<>(z);
                }

                private boolean equal(Object obj, Object obj2) {
/* 1 */             return Objects.equals(obj, obj2);
                }

                private void readObject(ObjectInputStream objectInputStream) throws IOException {
/* 8 */             throw new InvalidObjectException("Deserialization is unsupported");
                }

                private void rebalance(Node<K, V> node, boolean z) {
/* 1 */             while (node != null) {
/* 3 */                 Node<K, V> node2 = node.left;
/* 5 */                 Node<K, V> node3 = node.right;
/* 13 */                int i = node2 != null ? node2.height : 0;
/* 19 */                int i2 = node3 != null ? node3.height : 0;
/* 20 */                int i3 = i - i2;
/* 23 */                if (i3 == -2) {
/* 25 */                    Node<K, V> node4 = node3.left;
/* 27 */                    Node<K, V> node5 = node3.right;
/* 39 */                    int i4 = (node4 != null ? node4.height : 0) - (node5 != null ? node5.height : 0);
/* 41 */                    if (i4 == -1 || (i4 == 0 && !z)) {
/* 55 */                        rotateLeft(node);
                            } else {
/* 48 */                        rotateRight(node3);
/* 51 */                        rotateLeft(node);
                            }
/* 58 */                    if (z) {
/* 122 */                       return;
                            }
                        } else if (i3 == 2) {
/* 65 */                    Node<K, V> node6 = node2.left;
/* 67 */                    Node<K, V> node7 = node2.right;
/* 79 */                    int i5 = (node6 != null ? node6.height : 0) - (node7 != null ? node7.height : 0);
/* 80 */                    if (i5 == 1 || (i5 == 0 && !z)) {
/* 94 */                        rotateRight(node);
                            } else {
/* 87 */                        rotateLeft(node2);
/* 90 */                        rotateRight(node);
                            }
/* 97 */                    if (z) {
/* 122 */                       return;
                            }
                        } else if (i3 == 0) {
/* 104 */                   node.height = i + 1;
/* 106 */                   if (z) {
/* 122 */                       return;
                            }
                        } else {
/* 114 */                   node.height = Math.max(i, i2) + 1;
/* 116 */                   if (!z) {
/* 122 */                       return;
                            }
                        }
/* 119 */               node = node.parent;
                    }
                }

                private void replaceInParent(Node<K, V> node, Node<K, V> node2) {
/* 1 */             Node<K, V> node3 = node.parent;
/* 4 */             node.parent = null;
/* 6 */             if (node2 != null) {
/* 8 */                 node2.parent = node3;
                    }
/* 10 */            if (node3 == null) {
/* 22 */                this.root = node2;
                    } else if (node3.left == node) {
/* 16 */                node3.left = node2;
                    } else {
/* 19 */                node3.right = node2;
                    }
                }

                private void rotateLeft(Node<K, V> node) {
/* 1 */             Node<K, V> node2 = node.left;
/* 3 */             Node<K, V> node3 = node.right;
/* 5 */             Node<K, V> node4 = node3.left;
/* 7 */             Node<K, V> node5 = node3.right;
/* 9 */             node.right = node4;
/* 11 */            if (node4 != null) {
/* 13 */                node4.parent = node;
                    }
/* 15 */            replaceInParent(node, node3);
/* 18 */            node3.left = node;
/* 20 */            node.parent = node3;
/* 39 */            int iMax = Math.max(node2 != null ? node2.height : 0, node4 != null ? node4.height : 0) + 1;
/* 41 */            node.height = iMax;
/* 53 */            node3.height = Math.max(iMax, node5 != null ? node5.height : 0) + 1;
                }

                private void rotateRight(Node<K, V> node) {
/* 1 */             Node<K, V> node2 = node.left;
/* 3 */             Node<K, V> node3 = node.right;
/* 5 */             Node<K, V> node4 = node2.left;
/* 7 */             Node<K, V> node5 = node2.right;
/* 9 */             node.left = node5;
/* 11 */            if (node5 != null) {
/* 13 */                node5.parent = node;
                    }
/* 15 */            replaceInParent(node, node2);
/* 18 */            node2.right = node;
/* 20 */            node.parent = node2;
/* 39 */            int iMax = Math.max(node3 != null ? node3.height : 0, node5 != null ? node5.height : 0) + 1;
/* 41 */            node.height = iMax;
/* 53 */            node2.height = Math.max(iMax, node4 != null ? node4.height : 0) + 1;
                }

                private Object writeReplace() throws ObjectStreamException {
/* 3 */             return new LinkedHashMap(this);
                }

                @Override // java.util.AbstractMap, java.util.Map
                public void clear() {
/* 2 */             this.root = null;
/* 5 */             this.size = 0;
/* 11 */            this.modCount++;
/* 13 */            Node<K, V> node = this.header;
/* 15 */            node.prev = node;
/* 17 */            node.next = node;
                }

                @Override // java.util.AbstractMap, java.util.Map
                public boolean containsKey(Object obj) {
                    return findByObject(obj) != null;
                }

                @Override // java.util.AbstractMap, java.util.Map
                public Set<Map.Entry<K, V>> entrySet() {
/* 1 */             LinkedTreeMap<K, V>.EntrySet entrySet = this.entrySet;
/* 3 */             if (entrySet != null) {
/* 5 */                 return entrySet;
                    }
/* 8 */             LinkedTreeMap<K, V>.EntrySet entrySet2 = new EntrySet();
/* 11 */            this.entrySet = entrySet2;
/* 13 */            return entrySet2;
                }

                public Node<K, V> find(K k, boolean z) {
                    int iCompareTo;
                    Node<K, V> node;
/* 1 */             Comparator<? super K> comparator = this.comparator;
/* 3 */             Node<K, V> node2 = this.root;
/* 6 */             if (node2 != null) {
/* 16 */                Comparable comparable = comparator == NATURAL_ORDER ? (Comparable) k : null;
                        while (true) {
/* 17 */                    K k2 = node2.key;
/* 26 */                    iCompareTo = comparable != null ? comparable.compareTo(k2) : comparator.compare(k, k2);
/* 30 */                    if (iCompareTo == 0) {
/* 32 */                        return node2;
                            }
/* 38 */                    Node<K, V> node3 = iCompareTo < 0 ? node2.left : node2.right;
/* 40 */                    if (node3 == null) {
                                break;
                            }
/* 44 */                    node2 = node3;
                        }
                    } else {
/* 46 */                iCompareTo = 0;
                    }
/* 42 */            Node<K, V> node4 = node2;
/* 48 */            if (!z) {
/* 5 */                 return null;
                    }
/* 51 */            Node<K, V> node5 = this.header;
/* 54 */            if (node4 != null) {
/* 105 */               node = new Node<>(this.allowNullValues, node4, k, node5, node5.prev);
/* 108 */               if (iCompareTo < 0) {
/* 110 */                   node4.left = node;
                        } else {
/* 113 */                   node4.right = node;
                        }
/* 115 */               rebalance(node4, true);
                    } else {
/* 58 */                if (comparator == NATURAL_ORDER && !(k instanceof Comparable)) {
/* 84 */                    throw new ClassCastException(k.getClass().getName().concat(" is not Comparable"));
                        }
/* 92 */                node = new Node<>(this.allowNullValues, node4, k, node5, node5.prev);
/* 95 */                this.root = node;
                    }
/* 121 */           this.size++;
/* 126 */           this.modCount++;
/* 128 */           return node;
                }

                public Node<K, V> findByEntry(Map.Entry<?, ?> entry) {
/* 5 */             Node<K, V> nodeFindByObject = findByObject(entry.getKey());
/* 9 */             if (nodeFindByObject == null || !equal(nodeFindByObject.value, entry.getValue())) {
/* 24 */                return null;
                    }
/* 23 */            return nodeFindByObject;
                }

                /* JADX WARN: Multi-variable type inference failed */
                public Node<K, V> findByObject(Object obj) {
/* 2 */             if (obj != 0) {
                        try {
/* 5 */                     return find(obj, false);
                        } catch (ClassCastException unused) {
                        }
                    }
/* 1 */             return null;
                }

                @Override // java.util.AbstractMap, java.util.Map
                public V get(Object obj) {
/* 1 */             Node<K, V> nodeFindByObject = findByObject(obj);
/* 5 */             if (nodeFindByObject != null) {
/* 7 */                 return nodeFindByObject.value;
                    }
/* 10 */            return null;
                }

                @Override // java.util.AbstractMap, java.util.Map
                public Set<K> keySet() {
/* 1 */             LinkedTreeMap<K, V>.KeySet keySet = this.keySet;
/* 3 */             if (keySet != null) {
/* 5 */                 return keySet;
                    }
/* 8 */             LinkedTreeMap<K, V>.KeySet keySet2 = new KeySet();
/* 11 */            this.keySet = keySet2;
/* 13 */            return keySet2;
                }

                @Override // java.util.AbstractMap, java.util.Map
                public V put(K k, V v) {
/* 2 */             if (k == null) {
/* 29 */                C1951n4.m6868s("key == null");
/* 1 */                 return null;
                    }
/* 4 */             if (v == null && !this.allowNullValues) {
/* 13 */                C1951n4.m6868s("value == null");
/* 1 */                 return null;
                    }
/* 18 */            Node<K, V> nodeFind = find(k, true);
/* 22 */            V v2 = nodeFind.value;
/* 24 */            nodeFind.value = v;
/* 26 */            return v2;
                }

                @Override // java.util.AbstractMap, java.util.Map
                public V remove(Object obj) {
/* 1 */             Node<K, V> nodeRemoveInternalByKey = removeInternalByKey(obj);
/* 5 */             if (nodeRemoveInternalByKey != null) {
/* 7 */                 return nodeRemoveInternalByKey.value;
                    }
/* 10 */            return null;
                }

                public void removeInternal(Node<K, V> node, boolean z) {
                    int i;
/* 1 */             if (z) {
/* 3 */                 Node<K, V> node2 = node.prev;
/* 7 */                 node2.next = node.next;
/* 11 */                node.next.prev = node2;
                    }
/* 13 */            Node<K, V> node3 = node.left;
/* 15 */            Node<K, V> node4 = node.right;
/* 17 */            Node<K, V> node5 = node.parent;
/* 19 */            int i2 = 0;
/* 21 */            if (node3 == null || node4 == null) {
/* 81 */                if (node3 != null) {
/* 83 */                    replaceInParent(node, node3);
/* 86 */                    node.left = null;
                        } else if (node4 != null) {
/* 91 */                    replaceInParent(node, node4);
/* 94 */                    node.right = null;
                        } else {
/* 97 */                    replaceInParent(node, null);
                        }
/* 100 */               rebalance(node5, false);
/* 107 */               this.size--;
/* 113 */               this.modCount++;
/* 115 */               return;
                    }
/* 36 */            Node<K, V> nodeLast = node3.height > node4.height ? node3.last() : node4.first();
/* 40 */            removeInternal(nodeLast, false);
/* 43 */            Node<K, V> node6 = node.left;
/* 45 */            if (node6 != null) {
/* 47 */                i = node6.height;
/* 49 */                nodeLast.left = node6;
/* 51 */                node6.parent = nodeLast;
/* 53 */                node.left = null;
                    } else {
/* 56 */                i = 0;
                    }
/* 57 */            Node<K, V> node7 = node.right;
/* 59 */            if (node7 != null) {
/* 61 */                i2 = node7.height;
/* 63 */                nodeLast.right = node7;
/* 65 */                node7.parent = nodeLast;
/* 67 */                node.right = null;
                    }
/* 75 */            nodeLast.height = Math.max(i, i2) + 1;
/* 77 */            replaceInParent(node, nodeLast);
                }

                public Node<K, V> removeInternalByKey(Object obj) {
/* 1 */             Node<K, V> nodeFindByObject = findByObject(obj);
/* 5 */             if (nodeFindByObject != null) {
/* 8 */                 removeInternal(nodeFindByObject, true);
                    }
/* 11 */            return nodeFindByObject;
                }

                @Override // java.util.AbstractMap, java.util.Map
                public int size() {
/* 1 */             return this.size;
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
/* 20 */        public static final class Node<K, V> implements Map.Entry<K, V> {
                    final boolean allowNullValue;
                    int height;
                    final K key;
                    Node<K, V> left;
                    Node<K, V> next;
                    Node<K, V> parent;
                    Node<K, V> prev;
                    Node<K, V> right;
                    V value;

                    public Node(boolean z, Node<K, V> node, K k, Node<K, V> node2, Node<K, V> node3) {
/* 4 */                 this.parent = node;
/* 6 */                 this.key = k;
/* 8 */                 this.allowNullValue = z;
/* 11 */                this.height = 1;
/* 13 */                this.next = node2;
/* 15 */                this.prev = node3;
/* 17 */                node3.next = this;
/* 19 */                node2.prev = this;
                    }

                    @Override // java.util.Map.Entry
                    public boolean equals(Object obj) {
/* 4 */                 if (obj instanceof Map.Entry) {
/* 6 */                     Map.Entry entry = (Map.Entry) obj;
/* 8 */                     K k = this.key;
/* 10 */                    if (k != null ? k.equals(entry.getKey()) : entry.getKey() == null) {
/* 29 */                        V v = this.value;
/* 31 */                        if (v == null) {
/* 37 */                            if (entry.getValue() == null) {
/* 50 */                                return true;
                                    }
                                } else if (v.equals(entry.getValue())) {
/* 50 */                            return true;
                                }
                            }
                        }
/* 3 */                 return false;
                    }

                    public Node<K, V> first() {
/* 1 */                 Node<K, V> node = this.left;
                        while (true) {
/* 3 */                     Node<K, V> node2 = node;
/* 4 */                     Node<K, V> node3 = this;
/* 5 */                     this = node2;
/* 6 */                     if (this == null) {
/* 11 */                        return node3;
                            }
/* 8 */                     node = this.left;
                        }
                    }

                    @Override // java.util.Map.Entry
                    public K getKey() {
/* 1 */                 return this.key;
                    }

                    @Override // java.util.Map.Entry
                    public V getValue() {
/* 1 */                 return this.value;
                    }

                    @Override // java.util.Map.Entry
                    public int hashCode() {
/* 1 */                 K k = this.key;
/* 8 */                 int iHashCode = k == null ? 0 : k.hashCode();
/* 12 */                V v = this.value;
/* 21 */                return iHashCode ^ (v != null ? v.hashCode() : 0);
                    }

                    public Node<K, V> last() {
/* 1 */                 Node<K, V> node = this.right;
                        while (true) {
/* 3 */                     Node<K, V> node2 = node;
/* 4 */                     Node<K, V> node3 = this;
/* 5 */                     this = node2;
/* 6 */                     if (this == null) {
/* 11 */                        return node3;
                            }
/* 8 */                     node = this.right;
                        }
                    }

                    @Override // java.util.Map.Entry
                    public V setValue(V v) {
/* 1 */                 if (v == null && !this.allowNullValue) {
/* 10 */                    C1951n4.m6868s("value == null");
/* 13 */                    return null;
                        }
/* 15 */                V v2 = this.value;
/* 17 */                this.value = v;
/* 19 */                return v2;
                    }

                    public String toString() {
/* 21 */                return this.key + "=" + this.value;
                    }

/* 21 */            public Node(boolean z) {
/* 23 */                this.key = null;
/* 24 */                this.allowNullValue = z;
/* 25 */                this.prev = this;
                        this.next = this;
                    }
                }

/* 25 */        public LinkedTreeMap(boolean z) {
/* 26 */            this(NATURAL_ORDER, z);
                }

/* 26 */        public LinkedTreeMap() {
/* 27 */            this(NATURAL_ORDER, true);
                }
            }
