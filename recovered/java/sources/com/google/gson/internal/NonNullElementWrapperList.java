            package com.google.gson.internal;

            import java.util.AbstractList;
            import java.util.ArrayList;
            import java.util.Collection;
            import java.util.Objects;
            import java.util.RandomAccess;
            import p000.C1951n4;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 6 */     public class NonNullElementWrapperList<E> extends AbstractList<E> implements RandomAccess {
                private final ArrayList<E> delegate;

                public NonNullElementWrapperList(ArrayList<E> arrayList) {
/* 4 */             Objects.requireNonNull(arrayList);
/* 7 */             this.delegate = arrayList;
                }

                private E nonNull(E e) {
/* 1 */             if (e != null) {
/* 3 */                 return e;
                    }
/* 6 */             C1951n4.m6868s("Element must be non-null");
/* 9 */             return null;
                }

                @Override // java.util.AbstractList, java.util.List
                public void add(int i, E e) {
/* 7 */             this.delegate.add(i, nonNull(e));
                }

                @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
                public void clear() {
/* 3 */             this.delegate.clear();
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                public boolean contains(Object obj) {
/* 3 */             return this.delegate.contains(obj);
                }

                @Override // java.util.AbstractList, java.util.Collection, java.util.List
                public boolean equals(Object obj) {
/* 3 */             return this.delegate.equals(obj);
                }

                @Override // java.util.AbstractList, java.util.List
                public E get(int i) {
/* 3 */             return this.delegate.get(i);
                }

                @Override // java.util.AbstractList, java.util.Collection, java.util.List
                public int hashCode() {
/* 3 */             return this.delegate.hashCode();
                }

                @Override // java.util.AbstractList, java.util.List
                public int indexOf(Object obj) {
/* 3 */             return this.delegate.indexOf(obj);
                }

                @Override // java.util.AbstractList, java.util.List
                public int lastIndexOf(Object obj) {
/* 3 */             return this.delegate.lastIndexOf(obj);
                }

                @Override // java.util.AbstractList, java.util.List
                public E remove(int i) {
/* 3 */             return this.delegate.remove(i);
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                public boolean removeAll(Collection<?> collection) {
/* 3 */             return this.delegate.removeAll(collection);
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                public boolean retainAll(Collection<?> collection) {
/* 3 */             return this.delegate.retainAll(collection);
                }

                @Override // java.util.AbstractList, java.util.List
                public E set(int i, E e) {
/* 7 */             return this.delegate.set(i, nonNull(e));
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                public int size() {
/* 3 */             return this.delegate.size();
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                public Object[] toArray() {
/* 3 */             return this.delegate.toArray();
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
/* 7 */         public boolean remove(Object obj) {
/* 8 */             return this.delegate.remove(obj);
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
/* 7 */         public <T> T[] toArray(T[] tArr) {
/* 8 */             return (T[]) this.delegate.toArray(tArr);
                }
            }
