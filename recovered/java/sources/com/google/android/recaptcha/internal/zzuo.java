            package com.google.android.recaptcha.internal;

            import java.util.AbstractMap;
            import java.util.Collections;
            import java.util.Iterator;
            import java.util.Map;
            import java.util.Set;
            import java.util.SortedMap;
            import java.util.TreeMap;
            import p000.f42;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 9 */     class zzuo extends AbstractMap {
                private Object[] zza;
                private int zzb;
                private Map zzc;
                private boolean zzd;
                private volatile zzum zze;
                private Map zzf;

                private zzuo() {
/* 4 */             Map map = Collections.EMPTY_MAP;
/* 6 */             this.zzc = map;
/* 8 */             this.zzf = map;
                }

                private final int zzl(Comparable comparable) {
/* 1 */             int i = this.zzb;
/* 3 */             int i2 = i - 1;
/* 5 */             int i3 = 0;
/* 6 */             if (i2 >= 0) {
/* 18 */                int iCompareTo = comparable.compareTo(((zzuk) this.zza[i2]).zza());
/* 22 */                if (iCompareTo > 0) {
/* 26 */                    return -(i + 1);
                        }
/* 28 */                if (iCompareTo == 0) {
/* 31 */                    return i2;
                        }
                    }
/* 32 */            while (i3 <= i2) {
/* 36 */                int i4 = (i3 + i2) / 2;
/* 48 */                int iCompareTo2 = comparable.compareTo(((zzuk) this.zza[i4]).zza());
/* 52 */                if (iCompareTo2 < 0) {
/* 54 */                    i2 = i4 - 1;
                        } else {
/* 57 */                    if (iCompareTo2 <= 0) {
/* 62 */                        return i4;
                            }
/* 59 */                    i3 = i4 + 1;
                        }
                    }
/* 65 */            return -(i3 + 1);
                }

                /* JADX INFO: Access modifiers changed from: private */
                public final Object zzm(int i) {
/* 1 */             zzo();
/* 10 */            Object value = ((zzuk) this.zza[i]).getValue();
/* 14 */            Object[] objArr = this.zza;
/* 23 */            System.arraycopy(objArr, i + 1, objArr, i, (this.zzb - i) - 1);
/* 30 */            this.zzb--;
/* 38 */            if (!this.zzc.isEmpty()) {
/* 48 */                Iterator it = zzn().entrySet().iterator();
/* 52 */                Object[] objArr2 = this.zza;
/* 54 */                int i2 = this.zzb;
/* 62 */                Map.Entry entry = (Map.Entry) it.next();
/* 77 */                objArr2[i2] = new zzuk(this, (Comparable) entry.getKey(), entry.getValue());
/* 83 */                this.zzb++;
/* 85 */                it.remove();
                    }
/* 88 */            return value;
                }

                private final SortedMap zzn() {
/* 1 */             zzo();
/* 10 */            if (this.zzc.isEmpty() && !(this.zzc instanceof TreeMap)) {
/* 20 */                TreeMap treeMap = new TreeMap();
/* 23 */                this.zzc = treeMap;
/* 29 */                this.zzf = treeMap.descendingMap();
                    }
/* 33 */            return (SortedMap) this.zzc;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public final void zzo() {
/* 3 */             if (this.zzd) {
/* 6 */                 f42.m3660p();
                    }
                }

                @Override // java.util.AbstractMap, java.util.Map
                public final void clear() {
/* 1 */             zzo();
/* 6 */             if (this.zzb != 0) {
/* 9 */                 this.zza = null;
/* 12 */                this.zzb = 0;
                    }
/* 20 */            if (this.zzc.isEmpty()) {
/* 27 */                return;
                    }
/* 24 */            this.zzc.clear();
                }

                @Override // java.util.AbstractMap, java.util.Map
                public final boolean containsKey(Object obj) {
/* 1 */             Comparable comparable = (Comparable) obj;
                    return zzl(comparable) >= 0 || this.zzc.containsKey(comparable);
                }

                @Override // java.util.AbstractMap, java.util.Map
                public final Set entrySet() {
/* 3 */             if (this.zze == null) {
/* 11 */                this.zze = new zzum(this, null);
                    }
/* 13 */            return this.zze;
                }

                @Override // java.util.AbstractMap, java.util.Map
                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 7 */             if (!(obj instanceof zzuo)) {
/* 9 */                 return super.equals(obj);
                    }
/* 14 */            zzuo zzuoVar = (zzuo) obj;
/* 16 */            int size = size();
/* 25 */            if (size != zzuoVar.size()) {
/* 24 */                return false;
                    }
/* 27 */            int i = this.zzb;
/* 31 */            if (i != zzuoVar.zzb) {
/* 74 */                return entrySet().equals(zzuoVar.entrySet());
                    }
/* 34 */            for (int i2 = 0; i2 < i; i2++) {
/* 48 */                if (!zzg(i2).equals(zzuoVar.zzg(i2))) {
/* 24 */                    return false;
                        }
                    }
/* 54 */            if (i != size) {
/* 60 */                return this.zzc.equals(zzuoVar.zzc);
                    }
/* 1 */             return true;
                }

                @Override // java.util.AbstractMap, java.util.Map
                public final Object get(Object obj) {
/* 1 */             Comparable comparable = (Comparable) obj;
/* 3 */             int iZzl = zzl(comparable);
                    return iZzl >= 0 ? ((zzuk) this.zza[iZzl]).getValue() : this.zzc.get(comparable);
                }

                @Override // java.util.AbstractMap, java.util.Map
                public final int hashCode() {
/* 1 */             int i = this.zzb;
/* 4 */             int iHashCode = 0;
/* 5 */             for (int i2 = 0; i2 < i; i2++) {
/* 15 */                iHashCode += this.zza[i2].hashCode();
                    }
                    return this.zzc.size() > 0 ? this.zzc.hashCode() + iHashCode : iHashCode;
                }

                @Override // java.util.AbstractMap, java.util.Map
                public final Object remove(Object obj) {
/* 1 */             zzo();
/* 4 */             Comparable comparable = (Comparable) obj;
/* 6 */             int iZzl = zzl(comparable);
/* 10 */            if (iZzl >= 0) {
/* 12 */                return zzm(iZzl);
                    }
/* 23 */            if (this.zzc.isEmpty()) {
/* 25 */                return null;
                    }
/* 29 */            return this.zzc.remove(comparable);
                }

                @Override // java.util.AbstractMap, java.util.Map
                public final int size() {
/* 9 */             return this.zzc.size() + this.zzb;
                }

                public void zza() {
/* 3 */             if (this.zzd) {
/* 46 */                return;
                    }
/* 22 */            this.zzc = this.zzc.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.zzc);
/* 41 */            this.zzf = this.zzf.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.zzf);
/* 44 */            this.zzd = true;
                }

                public final int zzc() {
/* 1 */             return this.zzb;
                }

                public final Iterable zzd() {
                    return this.zzc.isEmpty() ? Collections.EMPTY_SET : this.zzc.entrySet();
                }

                @Override // java.util.AbstractMap, java.util.Map
                /* JADX INFO: renamed from: zzf, reason: merged with bridge method [inline-methods] */
                public final Object put(Comparable comparable, Object obj) {
/* 1 */             zzo();
/* 4 */             int iZzl = zzl(comparable);
/* 8 */             if (iZzl >= 0) {
/* 16 */                return ((zzuk) this.zza[iZzl]).setValue(obj);
                    }
/* 21 */            zzo();
/* 28 */            if (this.zza == null) {
/* 32 */                this.zza = new Object[16];
                    }
/* 36 */            int i = -(iZzl + 1);
/* 37 */            if (i >= 16) {
/* 43 */                return zzn().put(comparable, obj);
                    }
/* 50 */            if (this.zzb == 16) {
/* 58 */                zzuk zzukVar = (zzuk) this.zza[15];
/* 60 */                this.zzb = 15;
/* 74 */                zzn().put(zzukVar.zza(), zzukVar.getValue());
                    }
/* 77 */            Object[] objArr = this.zza;
/* 81 */            int length = objArr.length;
/* 84 */            System.arraycopy(objArr, i, objArr, i + 1, 15 - i);
/* 94 */            this.zza[i] = new zzuk(this, comparable, obj);
/* 100 */           this.zzb++;
/* 102 */           return null;
                }

                public final Map.Entry zzg(int i) {
/* 3 */             if (i < this.zzb) {
/* 9 */                 return (zzuk) this.zza[i];
                    }
/* 17 */            throw new ArrayIndexOutOfBoundsException(i);
                }

                public final boolean zzj() {
/* 1 */             return this.zzd;
                }

/* 10 */        public /* synthetic */ zzuo(zzun zzunVar) {
/* 12 */            Map map = Collections.EMPTY_MAP;
                    this.zzc = map;
/* 13 */            this.zzf = map;
                }
            }
