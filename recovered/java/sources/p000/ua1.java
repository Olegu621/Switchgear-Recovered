            package p000;

            import java.util.LinkedHashMap;
            import java.util.Locale;
            import java.util.Map;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class ua1 {
                private int createCount;
                private int evictionCount;
                private int hitCount;
                private final LinkedHashMap<Object, Object> map;
                private int maxSize;
                private int missCount;
                private int putCount;
                private int size;

                public ua1(int i) {
/* 4 */             if (i <= 0) {
/* 22 */                C1951n4.m6859j("maxSize <= 0");
/* 26 */                throw null;
                    }
/* 6 */             this.maxSize = i;
/* 17 */            this.map = new LinkedHashMap<>(0, 0.75f, true);
                }

                /* JADX INFO: renamed from: a */
                public final int m8997a(Object obj, Object obj2) {
/* 1 */             int iSizeOf = sizeOf(obj, obj2);
/* 5 */             if (iSizeOf >= 0) {
/* 7 */                 return iSizeOf;
                    }
/* 35 */            throw new IllegalStateException("Negative size: " + obj + "=" + obj2);
                }

                public Object create(Object obj) {
/* 1 */             return null;
                }

                public final synchronized int createCount() {
/* 2 */             return this.createCount;
                }

                public void entryRemoved(boolean z, Object obj, Object obj2, Object obj3) {
                }

                public final void evictAll() {
/* 2 */             trimToSize(-1);
                }

                public final synchronized int evictionCount() {
/* 2 */             return this.evictionCount;
                }

                public final Object get(Object obj) {
                    Object objPut;
/* 2 */             if (obj == null) {
/* 89 */                C1951n4.m6868s("key == null");
/* 1 */                 return null;
                    }
                    synchronized (this) {
                        try {
/* 7 */                     Object obj2 = this.map.get(obj);
/* 11 */                    if (obj2 != null) {
/* 17 */                        this.hitCount++;
/* 20 */                        return obj2;
                            }
/* 27 */                    this.missCount++;
/* 30 */                    Object objCreate = create(obj);
/* 34 */                    if (objCreate == null) {
/* 1 */                         return null;
                            }
                            synchronized (this) {
                                try {
/* 42 */                            this.createCount++;
/* 46 */                            objPut = this.map.put(obj, objCreate);
/* 50 */                            if (objPut != null) {
/* 54 */                                this.map.put(obj, objPut);
                                    } else {
/* 67 */                                this.size += m8997a(obj, objCreate);
                                    }
                                } catch (Throwable th) {
/* 84 */                            throw th;
                                }
                            }
/* 70 */                    if (objPut != null) {
/* 73 */                        entryRemoved(false, obj, objCreate, objPut);
/* 76 */                        return objPut;
                            }
/* 79 */                    trimToSize(this.maxSize);
/* 82 */                    return objCreate;
                        } catch (Throwable th2) {
/* 86 */                    throw th2;
                        }
                    }
                }

                public final synchronized int hitCount() {
/* 2 */             return this.hitCount;
                }

                public final synchronized int maxSize() {
/* 2 */             return this.maxSize;
                }

                public final synchronized int missCount() {
/* 2 */             return this.missCount;
                }

                public final Object put(Object obj, Object obj2) {
                    Object objPut;
/* 1 */             if (obj == null || obj2 == null) {
/* 58 */                C1951n4.m6868s("key == null || value == null");
/* 61 */                return null;
                    }
                    synchronized (this) {
                        try {
/* 10 */                    this.putCount++;
/* 19 */                    this.size += m8997a(obj, obj2);
/* 23 */                    objPut = this.map.put(obj, obj2);
/* 27 */                    if (objPut != null) {
/* 36 */                        this.size -= m8997a(obj, objPut);
                            }
                        } catch (Throwable th) {
/* 55 */                    throw th;
                        }
                    }
/* 42 */            if (objPut != null) {
/* 45 */                entryRemoved(false, obj, objPut, obj2);
                    }
/* 50 */            trimToSize(this.maxSize);
/* 53 */            return objPut;
                }

                public final synchronized int putCount() {
/* 2 */             return this.putCount;
                }

                public final Object remove(Object obj) {
                    Object objRemove;
/* 2 */             if (obj == null) {
/* 37 */                C1951n4.m6868s("key == null");
/* 1 */                 return null;
                    }
                    synchronized (this) {
                        try {
/* 7 */                     objRemove = this.map.remove(obj);
/* 11 */                    if (objRemove != null) {
/* 20 */                        this.size -= m8997a(obj, objRemove);
                            }
                        } catch (Throwable th) {
/* 34 */                    throw th;
                        }
                    }
/* 26 */            if (objRemove != null) {
/* 29 */                entryRemoved(false, obj, objRemove, null);
                    }
/* 32 */            return objRemove;
                }

                public void resize(int i) {
/* 1 */             if (i <= 0) {
/* 16 */                C1951n4.m6859j("maxSize <= 0");
/* 19 */                return;
                    }
                    synchronized (this) {
/* 4 */                 this.maxSize = i;
                    }
/* 7 */             trimToSize(i);
                }

                public final synchronized int size() {
/* 2 */             return this.size;
                }

                public int sizeOf(Object obj, Object obj2) {
/* 1 */             return 1;
                }

                public final synchronized Map<Object, Object> snapshot() {
/* 6 */             return new LinkedHashMap(this.map);
                }

                public final synchronized String toString() {
                    int i;
                    try {
/* 4 */                 int i2 = this.hitCount;
/* 8 */                 int i3 = this.missCount + i2;
/* 17 */                i = i3 != 0 ? (i2 * 100) / i3 : 0;
/* 18 */                Locale locale = Locale.US;
                    } catch (Throwable th) {
/* 70 */                throw th;
                    }
/* 63 */            return "LruCache[maxSize=" + this.maxSize + ",hits=" + this.hitCount + ",misses=" + this.missCount + ",hitRate=" + i + "%]";
                }

                public void trimToSize(int i) {
                    Object key;
                    Object value;
                    while (true) {
                        synchronized (this) {
                            try {
/* 4 */                         if (this.size < 0 || (this.map.isEmpty() && this.size != 0)) {
                                    break;
                                }
/* 23 */                        if (this.size > i && !this.map.isEmpty()) {
/* 44 */                            Map.Entry<Object, Object> next = this.map.entrySet().iterator().next();
/* 50 */                            key = next.getKey();
/* 54 */                            value = next.getValue();
/* 60 */                            this.map.remove(key);
/* 70 */                            this.size -= m8997a(key, value);
/* 76 */                            this.evictionCount++;
                                }
/* 85 */                        return;
                            } catch (Throwable th) {
/* 118 */                       throw th;
                            }
                        }
/* 80 */                entryRemoved(true, key, value, null);
                    }
/* 116 */           throw new IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
                }
            }
