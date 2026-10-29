            package com.google.android.gms.internal.drive;

            import java.lang.Comparable;
            import java.util.AbstractMap;
            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Map;
            import java.util.Set;
            import java.util.SortedMap;
            import java.util.TreeMap;
            import p000.f42;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 15 */    class zzmi<K extends Comparable<K>, V> extends AbstractMap<K, V> {
                private boolean zzot;
                private final int zzvd;
                private List<zzmp> zzve;
                private Map<K, V> zzvf;
                private volatile zzmr zzvg;
                private Map<K, V> zzvh;
                private volatile zzml zzvi;

                private zzmi(int i) {
/* 4 */             this.zzvd = i;
/* 8 */             this.zzve = Collections.EMPTY_LIST;
/* 10 */            Map<K, V> map = Collections.EMPTY_MAP;
/* 12 */            this.zzvf = map;
/* 14 */            this.zzvh = map;
                }

                public static <FieldDescriptorType extends zzkd<FieldDescriptorType>> zzmi<FieldDescriptorType, Object> zzav(int i) {
/* 3 */             return new zzmj(i);
                }

                /* JADX INFO: Access modifiers changed from: private */
                public final V zzax(int i) {
/* 1 */             zzeu();
/* 12 */            V v = (V) this.zzve.remove(i).getValue();
/* 22 */            if (!this.zzvf.isEmpty()) {
/* 32 */                Iterator<Map.Entry<K, V>> it = zzev().entrySet().iterator();
/* 49 */                this.zzve.add(new zzmp(this, it.next()));
/* 52 */                it.remove();
                    }
/* 55 */            return v;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public final void zzeu() {
/* 3 */             if (this.zzot) {
/* 6 */                 f42.m3660p();
                    }
                }

                private final SortedMap<K, V> zzev() {
/* 1 */             zzeu();
/* 10 */            if (this.zzvf.isEmpty() && !(this.zzvf instanceof TreeMap)) {
/* 20 */                TreeMap treeMap = new TreeMap();
/* 23 */                this.zzvf = treeMap;
/* 29 */                this.zzvh = treeMap.descendingMap();
                    }
/* 33 */            return (SortedMap) this.zzvf;
                }

                @Override // java.util.AbstractMap, java.util.Map
                public void clear() {
/* 1 */             zzeu();
/* 10 */            if (!this.zzve.isEmpty()) {
/* 14 */                this.zzve.clear();
                    }
/* 23 */            if (this.zzvf.isEmpty()) {
/* 30 */                return;
                    }
/* 27 */            this.zzvf.clear();
                }

                @Override // java.util.AbstractMap, java.util.Map
                public boolean containsKey(Object obj) {
/* 1 */             Comparable comparable = (Comparable) obj;
                    return zza(comparable) >= 0 || this.zzvf.containsKey(comparable);
                }

                @Override // java.util.AbstractMap, java.util.Map
                public Set<Map.Entry<K, V>> entrySet() {
/* 3 */             if (this.zzvg == null) {
/* 11 */                this.zzvg = new zzmr(this, null);
                    }
/* 13 */            return this.zzvg;
                }

                @Override // java.util.AbstractMap, java.util.Map
                public boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 7 */             if (!(obj instanceof zzmi)) {
/* 9 */                 return super.equals(obj);
                    }
/* 14 */            zzmi zzmiVar = (zzmi) obj;
/* 16 */            int size = size();
/* 25 */            if (size != zzmiVar.size()) {
/* 24 */                return false;
                    }
/* 28 */            int iZzer = zzer();
/* 36 */            if (iZzer != zzmiVar.zzer()) {
/* 46 */                return entrySet().equals(zzmiVar.entrySet());
                    }
/* 52 */            for (int i = 0; i < iZzer; i++) {
/* 66 */                if (!zzaw(i).equals(zzmiVar.zzaw(i))) {
/* 24 */                    return false;
                        }
                    }
/* 72 */            if (iZzer != size) {
/* 78 */                return this.zzvf.equals(zzmiVar.zzvf);
                    }
/* 1 */             return true;
                }

                @Override // java.util.AbstractMap, java.util.Map
                public V get(Object obj) {
/* 1 */             Comparable comparable = (Comparable) obj;
/* 3 */             int iZza = zza(comparable);
                    return iZza >= 0 ? (V) this.zzve.get(iZza).getValue() : this.zzvf.get(comparable);
                }

                @Override // java.util.AbstractMap, java.util.Map
                public int hashCode() {
/* 1 */             int iZzer = zzer();
/* 6 */             int iHashCode = 0;
/* 7 */             for (int i = 0; i < iZzer; i++) {
/* 21 */                iHashCode += this.zzve.get(i).hashCode();
                    }
                    return this.zzvf.size() > 0 ? this.zzvf.hashCode() + iHashCode : iHashCode;
                }

                public final boolean isImmutable() {
/* 1 */             return this.zzot;
                }

                @Override // java.util.AbstractMap, java.util.Map
                public V remove(Object obj) {
/* 1 */             zzeu();
/* 4 */             Comparable comparable = (Comparable) obj;
/* 6 */             int iZza = zza(comparable);
/* 10 */            if (iZza >= 0) {
/* 12 */                return zzax(iZza);
                    }
/* 23 */            if (this.zzvf.isEmpty()) {
/* 25 */                return null;
                    }
/* 29 */            return this.zzvf.remove(comparable);
                }

                @Override // java.util.AbstractMap, java.util.Map
                public int size() {
/* 13 */            return this.zzvf.size() + this.zzve.size();
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.AbstractMap, java.util.Map
                /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
                public final V put(K k, V v) {
/* 1 */             zzeu();
/* 4 */             int iZza = zza(k);
/* 8 */             if (iZza >= 0) {
/* 18 */                return (V) this.zzve.get(iZza).setValue(v);
                    }
/* 23 */            zzeu();
/* 32 */            if (this.zzve.isEmpty() && !(this.zzve instanceof ArrayList)) {
/* 47 */                this.zzve = new ArrayList(this.zzvd);
                    }
/* 51 */            int i = -(iZza + 1);
/* 54 */            if (i >= this.zzvd) {
/* 60 */                return zzev().put(k, v);
                    }
/* 67 */            int size = this.zzve.size();
/* 71 */            int i2 = this.zzvd;
/* 73 */            if (size == i2) {
/* 79 */                zzmp zzmpVarRemove = this.zzve.remove(i2 - 1);
/* 99 */                zzev().put((Comparable) zzmpVarRemove.getKey(), zzmpVarRemove.getValue());
                    }
/* 109 */           this.zzve.add(i, new zzmp(this, k, v));
/* 112 */           return null;
                }

                public final Map.Entry<K, V> zzaw(int i) {
/* 3 */             return this.zzve.get(i);
                }

                public void zzbp() {
/* 3 */             if (this.zzot) {
/* 46 */                return;
                    }
/* 22 */            this.zzvf = this.zzvf.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.zzvf);
/* 41 */            this.zzvh = this.zzvh.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.zzvh);
/* 44 */            this.zzot = true;
                }

                public final int zzer() {
/* 3 */             return this.zzve.size();
                }

                public final Iterable<Map.Entry<K, V>> zzes() {
                    return this.zzvf.isEmpty() ? zzmm.zzex() : this.zzvf.entrySet();
                }

                public final Set<Map.Entry<K, V>> zzet() {
/* 3 */             if (this.zzvi == null) {
/* 11 */                this.zzvi = new zzml(this, null);
                    }
/* 13 */            return this.zzvi;
                }

/* 16 */        public /* synthetic */ zzmi(int i, zzmj zzmjVar) {
/* 17 */            this(i);
                }

                /* JADX WARN: Code duplicated, block: B:13:0x0028  */
                /* JADX WARN: Code duplicated, block: B:17:0x0045  */
                /* JADX WARN: Code duplicated, block: B:21:0x0043 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:22:0x0048 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:23:0x0040 A[SYNTHETIC] */
/* 113 */       private final int zza(K k) {
                    int i;
                    int i2;
                    int i3;
                    int iCompareTo;
/* 114 */           int size = this.zzve.size();
                    int i4 = size - 1;
                    if (i4 < 0) {
                        i = 0;
                        while (i <= i4) {
/* 116 */                   i3 = (i + i4) / 2;
/* 117 */                   iCompareTo = k.compareTo((Comparable) this.zzve.get(i3).getKey());
                            if (iCompareTo < 0) {
                                i4 = i3 - 1;
                            } else {
                                if (iCompareTo > 0) {
                                    return i3;
                                }
                                i = i3 + 1;
                            }
                        }
                        i2 = i + 1;
                    } else {
/* 115 */               int iCompareTo2 = k.compareTo((Comparable) this.zzve.get(i4).getKey());
                        if (iCompareTo2 > 0) {
                            i2 = size + 1;
                        } else {
                            if (iCompareTo2 == 0) {
                                return i4;
                            }
                            i = 0;
                            while (i <= i4) {
/* 116 */                       i3 = (i + i4) / 2;
/* 117 */                       iCompareTo = k.compareTo((Comparable) this.zzve.get(i3).getKey());
                                if (iCompareTo < 0) {
                                    i4 = i3 - 1;
                                } else {
                                    if (iCompareTo > 0) {
                                        return i3;
                                    }
                                    i = i3 + 1;
                                }
                            }
                            i2 = i + 1;
                        }
                    }
                    return -i2;
                }
            }
