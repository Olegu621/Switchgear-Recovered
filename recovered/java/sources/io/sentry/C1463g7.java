            package io.sentry;

            import io.sentry.util.C1702a;
            import java.io.Serializable;
            import java.util.Collection;
            import java.util.Iterator;
            import java.util.Queue;
            
            /* JADX INFO: renamed from: io.sentry.g7 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 24 */    public final class C1463g7 implements Queue, Collection, Serializable {

                /* JADX INFO: renamed from: a */
                public final C1464h f10963a;

                /* JADX INFO: renamed from: b */
                public final C1702a f10964b = new C1702a();

                public C1463g7(C1464h c1464h) {
/* 4 */             this.f10963a = c1464h;
                }

                @Override // java.util.Queue, java.util.Collection
                public final boolean add(Object obj) {
/* 1 */             C1702a c1702a = this.f10964b;
/* 3 */             c1702a.m5443c();
                    try {
/* 8 */                 boolean zAdd = this.f10963a.add(obj);
/* 12 */                c1702a.close();
/* 15 */                return zAdd;
                    } catch (Throwable th) {
                        try {
/* 17 */                    c1702a.close();
                        } catch (Throwable th2) {
/* 22 */                    th.addSuppressed(th2);
                        }
/* 25 */                throw th;
                    }
                }

                @Override // java.util.Collection
                public final boolean addAll(Collection collection) {
/* 1 */             C1702a c1702a = this.f10964b;
/* 3 */             c1702a.m5443c();
                    try {
/* 8 */                 boolean zAddAll = this.f10963a.addAll(collection);
/* 12 */                c1702a.close();
/* 15 */                return zAddAll;
                    } catch (Throwable th) {
                        try {
/* 17 */                    c1702a.close();
                        } catch (Throwable th2) {
/* 22 */                    th.addSuppressed(th2);
                        }
/* 25 */                throw th;
                    }
                }

                @Override // java.util.Collection
                public final void clear() {
/* 1 */             C1702a c1702a = this.f10964b;
/* 3 */             c1702a.m5443c();
                    try {
/* 8 */                 this.f10963a.clear();
/* 11 */                c1702a.close();
                    } catch (Throwable th) {
                        try {
/* 16 */                    c1702a.close();
                        } catch (Throwable th2) {
/* 21 */                    th.addSuppressed(th2);
                        }
/* 24 */                throw th;
                    }
                }

                @Override // java.util.Collection
                public final boolean contains(Object obj) {
/* 1 */             C1702a c1702a = this.f10964b;
/* 3 */             c1702a.m5443c();
                    try {
/* 8 */                 boolean zContains = this.f10963a.contains(obj);
/* 12 */                c1702a.close();
/* 15 */                return zContains;
                    } catch (Throwable th) {
                        try {
/* 17 */                    c1702a.close();
                        } catch (Throwable th2) {
/* 22 */                    th.addSuppressed(th2);
                        }
/* 25 */                throw th;
                    }
                }

                @Override // java.util.Collection
                public final boolean containsAll(Collection collection) {
/* 1 */             C1702a c1702a = this.f10964b;
/* 3 */             c1702a.m5443c();
                    try {
/* 8 */                 boolean zContainsAll = this.f10963a.containsAll(collection);
/* 12 */                c1702a.close();
/* 15 */                return zContainsAll;
                    } catch (Throwable th) {
                        try {
/* 17 */                    c1702a.close();
                        } catch (Throwable th2) {
/* 22 */                    th.addSuppressed(th2);
                        }
/* 25 */                throw th;
                    }
                }

                @Override // java.util.Queue
                public final Object element() {
/* 1 */             C1702a c1702a = this.f10964b;
/* 3 */             c1702a.m5443c();
                    try {
/* 8 */                 Object objElement = this.f10963a.element();
/* 12 */                c1702a.close();
/* 15 */                return objElement;
                    } catch (Throwable th) {
                        try {
/* 17 */                    c1702a.close();
                        } catch (Throwable th2) {
/* 22 */                    th.addSuppressed(th2);
                        }
/* 25 */                throw th;
                    }
                }

                @Override // java.util.Collection
                public final boolean equals(Object obj) {
/* 1 */             if (obj == this) {
/* 3 */                 return true;
                    }
/* 5 */             C1702a c1702a = this.f10964b;
/* 7 */             c1702a.m5443c();
                    try {
/* 12 */                boolean zEquals = this.f10963a.equals(obj);
/* 16 */                c1702a.close();
/* 19 */                return zEquals;
                    } catch (Throwable th) {
                        try {
/* 21 */                    c1702a.close();
                        } catch (Throwable th2) {
/* 26 */                    th.addSuppressed(th2);
                        }
/* 29 */                throw th;
                    }
                }

                @Override // java.util.Collection
                public final int hashCode() {
/* 1 */             C1702a c1702a = this.f10964b;
/* 3 */             c1702a.m5443c();
                    try {
/* 8 */                 int iHashCode = this.f10963a.hashCode();
/* 12 */                c1702a.close();
/* 15 */                return iHashCode;
                    } catch (Throwable th) {
                        try {
/* 17 */                    c1702a.close();
                        } catch (Throwable th2) {
/* 22 */                    th.addSuppressed(th2);
                        }
/* 25 */                throw th;
                    }
                }

                @Override // java.util.Collection
                public final boolean isEmpty() {
/* 1 */             C1702a c1702a = this.f10964b;
/* 3 */             c1702a.m5443c();
                    try {
/* 8 */                 boolean zIsEmpty = this.f10963a.isEmpty();
/* 12 */                c1702a.close();
/* 15 */                return zIsEmpty;
                    } catch (Throwable th) {
                        try {
/* 17 */                    c1702a.close();
                        } catch (Throwable th2) {
/* 22 */                    th.addSuppressed(th2);
                        }
/* 25 */                throw th;
                    }
                }

                @Override // java.util.Collection, java.lang.Iterable
                public final Iterator iterator() {
/* 3 */             return this.f10963a.iterator();
                }

                @Override // java.util.Queue
                public final boolean offer(Object obj) {
/* 1 */             C1702a c1702a = this.f10964b;
/* 3 */             c1702a.m5443c();
                    try {
/* 8 */                 boolean zOffer = this.f10963a.offer(obj);
/* 12 */                c1702a.close();
/* 15 */                return zOffer;
                    } catch (Throwable th) {
                        try {
/* 17 */                    c1702a.close();
                        } catch (Throwable th2) {
/* 22 */                    th.addSuppressed(th2);
                        }
/* 25 */                throw th;
                    }
                }

                @Override // java.util.Queue
                public final Object peek() {
/* 1 */             C1702a c1702a = this.f10964b;
/* 3 */             c1702a.m5443c();
                    try {
/* 8 */                 Object objPeek = this.f10963a.peek();
/* 12 */                c1702a.close();
/* 15 */                return objPeek;
                    } catch (Throwable th) {
                        try {
/* 17 */                    c1702a.close();
                        } catch (Throwable th2) {
/* 22 */                    th.addSuppressed(th2);
                        }
/* 25 */                throw th;
                    }
                }

                @Override // java.util.Queue
                public final Object poll() {
/* 1 */             C1702a c1702a = this.f10964b;
/* 3 */             c1702a.m5443c();
                    try {
/* 8 */                 Object objPoll = this.f10963a.poll();
/* 12 */                c1702a.close();
/* 15 */                return objPoll;
                    } catch (Throwable th) {
                        try {
/* 17 */                    c1702a.close();
                        } catch (Throwable th2) {
/* 22 */                    th.addSuppressed(th2);
                        }
/* 25 */                throw th;
                    }
                }

                @Override // java.util.Queue
                public final Object remove() {
/* 1 */             C1702a c1702a = this.f10964b;
/* 3 */             c1702a.m5443c();
                    try {
/* 8 */                 Object objRemove = this.f10963a.remove();
/* 12 */                c1702a.close();
/* 15 */                return objRemove;
                    } catch (Throwable th) {
                        try {
/* 17 */                    c1702a.close();
                        } catch (Throwable th2) {
/* 22 */                    th.addSuppressed(th2);
                        }
/* 25 */                throw th;
                    }
                }

                @Override // java.util.Collection
                public final boolean removeAll(Collection collection) {
/* 1 */             C1702a c1702a = this.f10964b;
/* 3 */             c1702a.m5443c();
                    try {
/* 8 */                 boolean zRemoveAll = this.f10963a.removeAll(collection);
/* 12 */                c1702a.close();
/* 15 */                return zRemoveAll;
                    } catch (Throwable th) {
                        try {
/* 17 */                    c1702a.close();
                        } catch (Throwable th2) {
/* 22 */                    th.addSuppressed(th2);
                        }
/* 25 */                throw th;
                    }
                }

                @Override // java.util.Collection
                public final boolean retainAll(Collection collection) {
/* 1 */             C1702a c1702a = this.f10964b;
/* 3 */             c1702a.m5443c();
                    try {
/* 8 */                 boolean zRetainAll = this.f10963a.retainAll(collection);
/* 12 */                c1702a.close();
/* 15 */                return zRetainAll;
                    } catch (Throwable th) {
                        try {
/* 17 */                    c1702a.close();
                        } catch (Throwable th2) {
/* 22 */                    th.addSuppressed(th2);
                        }
/* 25 */                throw th;
                    }
                }

                @Override // java.util.Collection
                public final int size() {
/* 1 */             C1702a c1702a = this.f10964b;
/* 3 */             c1702a.m5443c();
                    try {
/* 8 */                 int size = this.f10963a.size();
/* 12 */                c1702a.close();
/* 15 */                return size;
                    } catch (Throwable th) {
                        try {
/* 17 */                    c1702a.close();
                        } catch (Throwable th2) {
/* 22 */                    th.addSuppressed(th2);
                        }
/* 25 */                throw th;
                    }
                }

                @Override // java.util.Collection
                public final Object[] toArray() {
/* 1 */             C1702a c1702a = this.f10964b;
/* 3 */             c1702a.m5443c();
                    try {
/* 8 */                 Object[] array = this.f10963a.toArray();
/* 12 */                c1702a.close();
/* 15 */                return array;
                    } catch (Throwable th) {
                        try {
/* 17 */                    c1702a.close();
                        } catch (Throwable th2) {
/* 22 */                    th.addSuppressed(th2);
                        }
/* 25 */                throw th;
                    }
                }

                public final String toString() {
/* 1 */             C1702a c1702a = this.f10964b;
/* 3 */             c1702a.m5443c();
                    try {
/* 8 */                 String string = this.f10963a.toString();
/* 12 */                c1702a.close();
/* 15 */                return string;
                    } catch (Throwable th) {
                        try {
/* 17 */                    c1702a.close();
                        } catch (Throwable th2) {
/* 22 */                    th.addSuppressed(th2);
                        }
/* 25 */                throw th;
                    }
                }

                @Override // java.util.Collection
/* 25 */        public final boolean remove(Object obj) {
/* 26 */            C1702a c1702a = this.f10964b;
                    c1702a.m5443c();
                    try {
/* 28 */                boolean zRemove = this.f10963a.remove(obj);
/* 29 */                c1702a.close();
                        return zRemove;
                    } catch (Throwable th) {
                        try {
/* 30 */                    c1702a.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }

                @Override // java.util.Collection
/* 25 */        public final Object[] toArray(Object[] objArr) {
/* 26 */            C1702a c1702a = this.f10964b;
                    c1702a.m5443c();
                    try {
/* 28 */                Object[] array = this.f10963a.toArray(objArr);
/* 29 */                c1702a.close();
                        return array;
                    } catch (Throwable th) {
                        try {
/* 30 */                    c1702a.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
            }
