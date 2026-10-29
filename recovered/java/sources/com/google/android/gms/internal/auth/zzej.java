            package com.google.android.gms.internal.auth;

            import java.util.AbstractList;
            import java.util.Arrays;
            import java.util.Collection;
            import java.util.RandomAccess;
            import p000.AbstractC0208c9;
            import p000.AbstractC0886en;
            import p000.f42;
            import p000.fm0;
            import p000.s80;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 8 */     final class zzej extends zzdq implements RandomAccess, zzey, zzgd {
                private static final zzej zza;
                private double[] zzb;
                private int zzc;

                static {
/* 6 */             zzej zzejVar = new zzej(new double[0], 0);
/* 9 */             zza = zzejVar;
/* 11 */            zzejVar.zzb();
                }

                public zzej() {
/* 6 */             this(new double[10], 0);
                }

                private final String zzf(int i) {
/* 7 */             return AbstractC0886en.m3506j("Index:", i, this.zzc, ", Size:");
                }

                private final void zzg(int i) {
/* 1 */             if (i < 0 || i >= this.zzc) {
/* 12 */                s80.m8425f(zzf(i));
                    }
                }

                @Override // com.google.android.gms.internal.auth.zzdq, java.util.AbstractList, java.util.List
                public final /* synthetic */ void add(int i, Object obj) {
                    int i2;
/* 3 */             double dDoubleValue = ((Double) obj).doubleValue();
/* 7 */             zza();
/* 10 */            if (i < 0 || i > (i2 = this.zzc)) {
/* 72 */                s80.m8425f(zzf(i));
/* 75 */                return;
                    }
/* 16 */            double[] dArr = this.zzb;
/* 20 */            if (i2 < dArr.length) {
/* 25 */                System.arraycopy(dArr, i, dArr, i + 1, i2 - i);
                    } else {
/* 35 */                double[] dArr2 = new double[fm0.m3797w(i2, 3, 2, 1)];
/* 38 */                System.arraycopy(dArr, 0, dArr2, 0, i);
/* 48 */                System.arraycopy(this.zzb, i, dArr2, i + 1, this.zzc - i);
/* 51 */                this.zzb = dArr2;
                    }
/* 55 */            this.zzb[i] = dDoubleValue;
/* 60 */            this.zzc++;
/* 65 */            ((AbstractList) this).modCount++;
                }

                @Override // com.google.android.gms.internal.auth.zzdq, java.util.AbstractCollection, java.util.Collection, java.util.List
                public final boolean addAll(Collection collection) {
/* 1 */             zza();
/* 4 */             zzez.zze(collection);
/* 9 */             if (!(collection instanceof zzej)) {
/* 11 */                return super.addAll(collection);
                    }
/* 16 */            zzej zzejVar = (zzej) collection;
/* 18 */            int i = zzejVar.zzc;
/* 21 */            if (i == 0) {
/* 20 */                return false;
                    }
/* 24 */            int i2 = this.zzc;
/* 30 */            if (AbstractC0208c9.API_PRIORITY_OTHER - i2 < i) {
/* 69 */                throw new OutOfMemoryError();
                    }
/* 32 */            int i3 = i2 + i;
/* 33 */            double[] dArr = this.zzb;
/* 36 */            if (i3 > dArr.length) {
/* 42 */                this.zzb = Arrays.copyOf(dArr, i3);
                    }
/* 52 */            System.arraycopy(zzejVar.zzb, 0, this.zzb, this.zzc, zzejVar.zzc);
/* 55 */            this.zzc = i3;
/* 61 */            ((AbstractList) this).modCount++;
/* 59 */            return true;
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                public final boolean contains(Object obj) {
                    return indexOf(obj) != -1;
                }

                @Override // com.google.android.gms.internal.auth.zzdq, java.util.AbstractList, java.util.Collection, java.util.List
                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 7 */             if (!(obj instanceof zzej)) {
/* 9 */                 return super.equals(obj);
                    }
/* 14 */            zzej zzejVar = (zzej) obj;
/* 21 */            if (this.zzc != zzejVar.zzc) {
/* 20 */                return false;
                    }
/* 24 */            double[] dArr = zzejVar.zzb;
/* 29 */            for (int i = 0; i < this.zzc; i++) {
/* 47 */                if (Double.doubleToLongBits(this.zzb[i]) != Double.doubleToLongBits(dArr[i])) {
/* 20 */                    return false;
                        }
                    }
/* 1 */             return true;
                }

                @Override // java.util.AbstractList, java.util.List
                public final /* synthetic */ Object get(int i) {
/* 1 */             zzg(i);
/* 8 */             return Double.valueOf(this.zzb[i]);
                }

                @Override // com.google.android.gms.internal.auth.zzdq, java.util.AbstractList, java.util.Collection, java.util.List
                public final int hashCode() {
/* 1 */             int iZzc = 1;
/* 5 */             for (int i = 0; i < this.zzc; i++) {
/* 21 */                iZzc = (iZzc * 31) + zzez.zzc(Double.doubleToLongBits(this.zzb[i]));
                    }
/* 25 */            return iZzc;
                }

                @Override // java.util.AbstractList, java.util.List
                public final int indexOf(Object obj) {
/* 4 */             if (!(obj instanceof Double)) {
/* 3 */                 return -1;
                    }
/* 9 */             double dDoubleValue = ((Double) obj).doubleValue();
/* 13 */            int i = this.zzc;
/* 16 */            for (int i2 = 0; i2 < i; i2++) {
/* 24 */                if (this.zzb[i2] == dDoubleValue) {
/* 26 */                    return i2;
                        }
                    }
/* 3 */             return -1;
                }

                @Override // com.google.android.gms.internal.auth.zzdq, java.util.AbstractList, java.util.List
                public final /* bridge */ /* synthetic */ Object remove(int i) {
/* 1 */             zza();
/* 4 */             zzg(i);
/* 7 */             double[] dArr = this.zzb;
/* 9 */             double d = dArr[i];
/* 11 */            int i2 = this.zzc;
/* 15 */            if (i < i2 - 1) {
/* 22 */                System.arraycopy(dArr, i + 1, dArr, i, (i2 - i) - 1);
                    }
/* 29 */            this.zzc--;
/* 35 */            ((AbstractList) this).modCount++;
/* 37 */            return Double.valueOf(d);
                }

                @Override // java.util.AbstractList
                public final void removeRange(int i, int i2) {
/* 1 */             zza();
/* 4 */             if (i2 < i) {
/* 29 */                s80.m8425f("toIndex < fromIndex");
/* 32 */                return;
                    }
/* 6 */             double[] dArr = this.zzb;
/* 11 */            System.arraycopy(dArr, i2, dArr, i, this.zzc - i2);
/* 18 */            this.zzc -= i2 - i;
/* 24 */            ((AbstractList) this).modCount++;
                }

                @Override // com.google.android.gms.internal.auth.zzdq, java.util.AbstractList, java.util.List
                public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
/* 3 */             double dDoubleValue = ((Double) obj).doubleValue();
/* 7 */             zza();
/* 10 */            zzg(i);
/* 13 */            double[] dArr = this.zzb;
/* 15 */            double d = dArr[i];
/* 17 */            dArr[i] = dDoubleValue;
/* 19 */            return Double.valueOf(d);
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                public final int size() {
/* 1 */             return this.zzc;
                }

                @Override // com.google.android.gms.internal.auth.zzey
                public final /* bridge */ /* synthetic */ zzey zzd(int i) {
/* 3 */             if (i >= this.zzc) {
/* 15 */                return new zzej(Arrays.copyOf(this.zzb, i), this.zzc);
                    }
/* 19 */            f42.m3649e();
/* 22 */            return null;
                }

                public final void zze(double d) {
/* 1 */             zza();
/* 4 */             int i = this.zzc;
/* 6 */             double[] dArr = this.zzb;
/* 9 */             if (i == dArr.length) {
/* 18 */                double[] dArr2 = new double[fm0.m3797w(i, 3, 2, 1)];
/* 21 */                System.arraycopy(dArr, 0, dArr2, 0, i);
/* 24 */                this.zzb = dArr2;
                    }
/* 26 */            double[] dArr3 = this.zzb;
/* 28 */            int i2 = this.zzc;
/* 32 */            this.zzc = i2 + 1;
/* 34 */            dArr3[i2] = d;
                }

/* 9 */         private zzej(double[] dArr, int i) {
                    this.zzb = dArr;
                    this.zzc = i;
                }

                @Override // com.google.android.gms.internal.auth.zzdq, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
/* 75 */        public final /* bridge */ /* synthetic */ boolean add(Object obj) {
/* 77 */            zze(((Double) obj).doubleValue());
                    return true;
                }
            }
