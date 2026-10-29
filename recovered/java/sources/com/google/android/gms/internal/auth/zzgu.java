            package com.google.android.gms.internal.auth;

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
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            class zzgu extends AbstractMap {
                private final int zza;
                private List zzb = Collections.EMPTY_LIST;
                private Map zzc;
                private boolean zzd;
                private volatile zzgs zze;
                private Map zzf;

                public /* synthetic */ zzgu(int i, zzgt zzgtVar) {
/* 4 */             this.zza = i;
/* 10 */            Map map = Collections.EMPTY_MAP;
/* 12 */            this.zzc = map;
/* 14 */            this.zzf = map;
                }

                private final int zzk(Comparable comparable) {
/* 3 */             int size = this.zzb.size();
/* 7 */             int i = size - 1;
/* 9 */             int i2 = 0;
/* 10 */            if (i >= 0) {
/* 24 */                int iCompareTo = comparable.compareTo(((zzgo) this.zzb.get(i)).zza());
/* 28 */                if (iCompareTo > 0) {
/* 32 */                    return -(size + 1);
                        }
/* 34 */                if (iCompareTo == 0) {
/* 37 */                    return i;
                        }
                    }
/* 38 */            while (i2 <= i) {
/* 42 */                int i3 = (i2 + i) / 2;
/* 56 */                int iCompareTo2 = comparable.compareTo(((zzgo) this.zzb.get(i3)).zza());
/* 60 */                if (iCompareTo2 < 0) {
/* 62 */                    i = i3 - 1;
                        } else {
/* 66 */                    if (iCompareTo2 <= 0) {
/* 72 */                        return i3;
                            }
/* 68 */                    i2 = i3 + 1;
                        }
                    }
/* 75 */            return -(i2 + 1);
                }

                /* JADX INFO: Access modifiers changed from: private */
                public final Object zzl(int i) {
/* 1 */             zzn();
/* 12 */            Object value = ((zzgo) this.zzb.remove(i)).getValue();
/* 22 */            if (!this.zzc.isEmpty()) {
/* 32 */                Iterator it = zzm().entrySet().iterator();
/* 36 */                List list = this.zzb;
/* 44 */                Map.Entry entry = (Map.Entry) it.next();
/* 59 */                list.add(new zzgo(this, (Comparable) entry.getKey(), entry.getValue()));
/* 62 */                it.remove();
                    }
/* 65 */            return value;
                }

                private final SortedMap zzm() {
/* 1 */             zzn();
/* 10 */            if (this.zzc.isEmpty() && !(this.zzc instanceof TreeMap)) {
/* 20 */                TreeMap treeMap = new TreeMap();
/* 23 */                this.zzc = treeMap;
/* 29 */                this.zzf = treeMap.descendingMap();
                    }
/* 33 */            return (SortedMap) this.zzc;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public final void zzn() {
/* 3 */             if (this.zzd) {
/* 6 */                 f42.m3660p();
                    }
                }

                @Override // java.util.AbstractMap, java.util.Map
                public final void clear() {
/* 1 */             zzn();
/* 10 */            if (!this.zzb.isEmpty()) {
/* 14 */                this.zzb.clear();
                    }
/* 23 */            if (this.zzc.isEmpty()) {
/* 30 */                return;
                    }
/* 27 */            this.zzc.clear();
                }

                @Override // java.util.AbstractMap, java.util.Map
                public final boolean containsKey(Object obj) {
/* 1 */             Comparable comparable = (Comparable) obj;
                    return zzk(comparable) >= 0 || this.zzc.containsKey(comparable);
                }

                @Override // java.util.AbstractMap, java.util.Map
                public final Set entrySet() {
/* 3 */             if (this.zze == null) {
/* 11 */                this.zze = new zzgs(this, null);
                    }
/* 13 */            return this.zze;
                }

                @Override // java.util.AbstractMap, java.util.Map
                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 7 */             if (!(obj instanceof zzgu)) {
/* 9 */                 return super.equals(obj);
                    }
/* 14 */            zzgu zzguVar = (zzgu) obj;
/* 16 */            int size = size();
/* 25 */            if (size != zzguVar.size()) {
/* 24 */                return false;
                    }
/* 28 */            int iZzb = zzb();
/* 36 */            if (iZzb != zzguVar.zzb()) {
/* 79 */                return entrySet().equals(zzguVar.entrySet());
                    }
/* 39 */            for (int i = 0; i < iZzb; i++) {
/* 53 */                if (!zzg(i).equals(zzguVar.zzg(i))) {
/* 24 */                    return false;
                        }
                    }
/* 59 */            if (iZzb != size) {
/* 65 */                return this.zzc.equals(zzguVar.zzc);
                    }
/* 1 */             return true;
                }

                @Override // java.util.AbstractMap, java.util.Map
                public final Object get(Object obj) {
/* 1 */             Comparable comparable = (Comparable) obj;
/* 3 */             int iZzk = zzk(comparable);
                    return iZzk >= 0 ? ((zzgo) this.zzb.get(iZzk)).getValue() : this.zzc.get(comparable);
                }

                @Override // java.util.AbstractMap, java.util.Map
                public final int hashCode() {
/* 1 */             int iZzb = zzb();
/* 6 */             int iHashCode = 0;
/* 7 */             for (int i = 0; i < iZzb; i++) {
/* 21 */                iHashCode += ((zzgo) this.zzb.get(i)).hashCode();
                    }
                    return this.zzc.size() > 0 ? this.zzc.hashCode() + iHashCode : iHashCode;
                }

                @Override // java.util.AbstractMap, java.util.Map
                public final Object remove(Object obj) {
/* 1 */             zzn();
/* 4 */             Comparable comparable = (Comparable) obj;
/* 6 */             int iZzk = zzk(comparable);
/* 10 */            if (iZzk >= 0) {
/* 12 */                return zzl(iZzk);
                    }
/* 23 */            if (this.zzc.isEmpty()) {
/* 25 */                return null;
                    }
/* 29 */            return this.zzc.remove(comparable);
                }

                @Override // java.util.AbstractMap, java.util.Map
                public final int size() {
/* 13 */            return this.zzc.size() + this.zzb.size();
                }

                public void zza() {
/* 3 */             if (this.zzd) {
/* 46 */                return;
                    }
/* 22 */            this.zzc = this.zzc.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.zzc);
/* 41 */            this.zzf = this.zzf.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.zzf);
/* 44 */            this.zzd = true;
                }

                public final int zzb() {
/* 3 */             return this.zzb.size();
                }

                public final Iterable zzc() {
                    return this.zzc.isEmpty() ? zzgn.zza() : this.zzc.entrySet();
                }

                @Override // java.util.AbstractMap, java.util.Map
                /* JADX INFO: renamed from: zze, reason: merged with bridge method [inline-methods] */
                public final Object put(Comparable comparable, Object obj) {
/* 1 */             zzn();
/* 4 */             int iZzk = zzk(comparable);
/* 8 */             if (iZzk >= 0) {
/* 18 */                return ((zzgo) this.zzb.get(iZzk)).setValue(obj);
                    }
/* 23 */            zzn();
/* 32 */            if (this.zzb.isEmpty() && !(this.zzb instanceof ArrayList)) {
/* 47 */                this.zzb = new ArrayList(this.zza);
                    }
/* 51 */            int i = -(iZzk + 1);
/* 54 */            if (i >= this.zza) {
/* 60 */                return zzm().put(comparable, obj);
                    }
/* 67 */            int size = this.zzb.size();
/* 71 */            int i2 = this.zza;
/* 73 */            if (size == i2) {
/* 83 */                zzgo zzgoVar = (zzgo) this.zzb.remove(i2 - 1);
/* 97 */                zzm().put(zzgoVar.zza(), zzgoVar.getValue());
                    }
/* 107 */           this.zzb.add(i, new zzgo(this, comparable, obj));
/* 110 */           return null;
                }

                public final Map.Entry zzg(int i) {
/* 7 */             return (Map.Entry) this.zzb.get(i);
                }

                public final boolean zzj() {
/* 1 */             return this.zzd;
                }
            }
