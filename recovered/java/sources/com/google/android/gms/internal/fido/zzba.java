            package com.google.android.gms.internal.fido;

            import java.util.Arrays;
            import java.util.Iterator;
            import java.util.Set;
            import p000.C1951n4;
            import p000.fm0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class zzba extends zzaw implements Set {
                private transient zzaz zza;

                public static int zzf(int i) {
/* 2 */             int iMax = Math.max(i, 2);
/* 9 */             if (iMax < 751619276) {
/* 13 */                int iHighestOneBit = Integer.highestOneBit(iMax - 1);
/* 28 */                do {
/* 17 */                    iHighestOneBit += iHighestOneBit;
/* 28 */                } while (((double) iHighestOneBit) * 0.7d < iMax);
/* 31 */                return iHighestOneBit;
                    }
/* 34 */            if (iMax < 1073741824) {
/* 32 */                return 1073741824;
                    }
/* 39 */            C1951n4.m6859j("collection too large");
/* 42 */            return 0;
                }

                public static zzba zzi(Object obj, Object obj2) {
/* 6 */             return zzk(2, obj, obj2);
                }

                private static zzba zzk(int i, Object... objArr) {
/* 1 */             if (i == 0) {
/* 123 */               return zzbd.zza;
                    }
/* 5 */             if (i == 1) {
/* 112 */               Object obj = objArr[0];
/* 114 */               obj.getClass();
/* 119 */               return new zzbe(obj);
                    }
/* 7 */             int iZzf = zzf(i);
/* 11 */            Object[] objArr2 = new Object[iZzf];
/* 13 */            int i2 = iZzf - 1;
/* 16 */            int i3 = 0;
/* 17 */            int i4 = 0;
/* 19 */            for (int i5 = 0; i5 < i; i5++) {
/* 21 */                Object obj2 = objArr[i5];
/* 23 */                if (obj2 == null) {
/* 66 */                    C1951n4.m6868s(fm0.m3781g(i5, "at index "));
/* 18 */                    return null;
                        }
/* 25 */                int iHashCode = obj2.hashCode();
/* 29 */                int iZza = zzav.zza(iHashCode);
                        while (true) {
/* 33 */                    int i6 = iZza & i2;
/* 35 */                    Object obj3 = objArr2[i6];
/* 37 */                    if (obj3 == null) {
/* 41 */                        objArr[i4] = obj2;
/* 43 */                        objArr2[i6] = obj2;
/* 45 */                        i3 += iHashCode;
/* 39 */                        i4++;
                                break;
                            }
/* 52 */                    if (obj3.equals(obj2)) {
                                break;
                            }
/* 54 */                    iZza++;
                        }
                    }
/* 70 */            Arrays.fill(objArr, i4, i, (Object) null);
/* 73 */            if (i4 == 1) {
/* 75 */                Object obj4 = objArr[0];
/* 77 */                obj4.getClass();
/* 82 */                return new zzbe(obj4);
                    }
/* 92 */            if (zzf(i4) < iZzf / 2) {
/* 107 */               return zzk(i4, objArr);
                    }
/* 94 */            if (i4 <= 0) {
/* 96 */                objArr = Arrays.copyOf(objArr, i4);
                    }
/* 103 */           return new zzbd(objArr, i3, objArr2, i2, i4);
                }

                @Override // java.util.Collection, java.util.Set
                public final boolean equals(Object obj) {
/* 2 */             if (obj == this) {
/* 1 */                 return true;
                    }
/* 8 */             if ((obj instanceof zzba) && zzj() && ((zzba) obj).zzj() && hashCode() != obj.hashCode()) {
/* 7 */                 return false;
                    }
/* 37 */            if (obj == this) {
/* 1 */                 return true;
                    }
/* 42 */            if (obj instanceof Set) {
/* 44 */                Set set = (Set) obj;
                        try {
                            return size() == set.size() && containsAll(set);
                        } catch (ClassCastException | NullPointerException unused) {
                        }
                    }
/* 7 */             return false;
                }

                @Override // java.util.Collection, java.util.Set
                public int hashCode() {
/* 1 */             Iterator it = iterator();
/* 6 */             int iHashCode = 0;
/* 11 */            while (it.hasNext()) {
/* 13 */                Object next = it.next();
/* 25 */                iHashCode += next != null ? next.hashCode() : 0;
                    }
/* 27 */            return iHashCode;
                }

                @Override // com.google.android.gms.internal.fido.zzaw, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
                /* JADX INFO: renamed from: zzd */
                public abstract zzbf iterator();

                public final zzaz zzg() {
/* 1 */             zzaz zzazVar = this.zza;
/* 3 */             if (zzazVar != null) {
/* 11 */                return zzazVar;
                    }
/* 5 */             zzaz zzazVarZzh = zzh();
/* 9 */             this.zza = zzazVarZzh;
/* 11 */            return zzazVarZzh;
                }

                public zzaz zzh() {
/* 5 */             return zzaz.zzg(toArray());
                }

                public boolean zzj() {
/* 1 */             return false;
                }
            }
