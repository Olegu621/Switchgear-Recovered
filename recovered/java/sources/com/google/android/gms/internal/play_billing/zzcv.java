            package com.google.android.gms.internal.play_billing;

            import java.util.Arrays;
            import java.util.Objects;
            import java.util.Set;
            import p000.C1951n4;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class zzcv extends zzcj implements Set {
                private transient zzco zza;

                public static int zzh(int i) {
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

                /* JADX INFO: Access modifiers changed from: private */
                public static zzcv zzl(int i, Object... objArr) {
/* 1 */             if (i == 0) {
/* 120 */               return zzdq.zza;
                    }
/* 5 */             if (i == 1) {
/* 109 */               Object obj = objArr[0];
/* 111 */               Objects.requireNonNull(obj);
/* 116 */               return new zzdt(obj);
                    }
/* 7 */             int iZzh = zzh(i);
/* 11 */            Object[] objArr2 = new Object[iZzh];
/* 13 */            int i2 = iZzh - 1;
/* 16 */            int i3 = 0;
/* 17 */            int i4 = 0;
/* 18 */            for (int i5 = 0; i5 < i; i5++) {
/* 20 */                Object obj2 = objArr[i5];
/* 22 */                zzdd.zza(obj2, i5);
/* 25 */                int iHashCode = obj2.hashCode();
/* 29 */                int iZza = zzcg.zza(iHashCode);
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
/* 61 */            Arrays.fill(objArr, i4, i, (Object) null);
/* 64 */            if (i4 == 1) {
/* 66 */                Object obj4 = objArr[0];
/* 68 */                Objects.requireNonNull(obj4);
/* 73 */                return new zzdt(obj4);
                    }
/* 83 */            if (zzh(i4) < iZzh / 2) {
/* 85 */                return zzl(i4, objArr);
                    }
/* 90 */            int length = objArr.length;
/* 96 */            if (i4 < (length >> 1) + (length >> 2)) {
/* 98 */                objArr = Arrays.copyOf(objArr, i4);
                    }
/* 105 */           return new zzdq(objArr, i3, objArr2, i2, i4);
                }

                @Override // java.util.Collection, java.util.Set
                public boolean equals(Object obj) {
/* 2 */             if (obj == this) {
/* 1 */                 return true;
                    }
/* 8 */             if ((obj instanceof zzcv) && zzk() && ((zzcv) obj).zzk() && hashCode() != obj.hashCode()) {
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
/* 1 */             return zzds.zza(this);
                }

                @Override // com.google.android.gms.internal.play_billing.zzcj
                public zzco zzd() {
/* 1 */             zzco zzcoVar = this.zza;
/* 3 */             if (zzcoVar != null) {
/* 11 */                return zzcoVar;
                    }
/* 5 */             zzco zzcoVarZzi = zzi();
/* 9 */             this.zza = zzcoVarZzi;
/* 11 */            return zzcoVarZzi;
                }

                @Override // com.google.android.gms.internal.play_billing.zzcj, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
                /* JADX INFO: renamed from: zze, reason: merged with bridge method [inline-methods] */
                public abstract zzdw iterator();

                public zzco zzi() {
/* 1 */             Object[] array = toArray();
/* 5 */             int i = zzco.zzd;
/* 8 */             return zzco.zzj(array, array.length);
                }

                public boolean zzk() {
/* 1 */             return false;
                }
            }
