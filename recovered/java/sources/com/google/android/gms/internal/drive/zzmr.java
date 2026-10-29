            package com.google.android.gms.internal.drive;

            import java.util.AbstractSet;
            import java.util.Iterator;
            import java.util.Map;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 5 */     class zzmr extends AbstractSet {
                private final /* synthetic */ zzmi zzvk;

                private zzmr(zzmi zzmiVar) {
/* 1 */             this.zzvk = zzmiVar;
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
                public /* synthetic */ boolean add(Object obj) {
/* 1 */             Map.Entry entry = (Map.Entry) obj;
/* 7 */             if (contains(entry)) {
/* 26 */                return false;
                    }
/* 21 */            this.zzvk.put((Comparable) entry.getKey(), entry.getValue());
/* 24 */            return true;
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
                public void clear() {
/* 3 */             this.zzvk.clear();
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
                public boolean contains(Object obj) {
/* 1 */             Map.Entry entry = (Map.Entry) obj;
/* 9 */             Object obj2 = this.zzvk.get(entry.getKey());
/* 13 */            Object value = entry.getValue();
/* 17 */            if (obj2 != value) {
                        return obj2 != null && obj2.equals(value);
                    }
/* 30 */            return true;
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
                public Iterator iterator() {
/* 6 */             return new zzmq(this.zzvk, null);
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
                public boolean remove(Object obj) {
/* 1 */             Map.Entry entry = (Map.Entry) obj;
/* 7 */             if (!contains(entry)) {
/* 20 */                return false;
                    }
/* 15 */            this.zzvk.remove(entry.getKey());
/* 18 */            return true;
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
                public int size() {
/* 3 */             return this.zzvk.size();
                }

/* 6 */         public /* synthetic */ zzmr(zzmi zzmiVar, zzmj zzmjVar) {
/* 7 */             this(zzmiVar);
                }
            }
