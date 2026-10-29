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
/* 8 */     final class zzdu extends zzdq implements RandomAccess, zzey, zzgd {
                private static final zzdu zza;
                private boolean[] zzb;
                private int zzc;

                static {
/* 6 */             zzdu zzduVar = new zzdu(new boolean[0], 0);
/* 9 */             zza = zzduVar;
/* 11 */            zzduVar.zzb();
                }

                public zzdu() {
/* 6 */             this(new boolean[10], 0);
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
/* 3 */             boolean zBooleanValue = ((Boolean) obj).booleanValue();
/* 7 */             zza();
/* 10 */            if (i < 0 || i > (i2 = this.zzc)) {
/* 72 */                s80.m8425f(zzf(i));
/* 75 */                return;
                    }
/* 16 */            boolean[] zArr = this.zzb;
/* 20 */            if (i2 < zArr.length) {
/* 25 */                System.arraycopy(zArr, i, zArr, i + 1, i2 - i);
                    } else {
/* 35 */                boolean[] zArr2 = new boolean[fm0.m3797w(i2, 3, 2, 1)];
/* 38 */                System.arraycopy(zArr, 0, zArr2, 0, i);
/* 48 */                System.arraycopy(this.zzb, i, zArr2, i + 1, this.zzc - i);
/* 51 */                this.zzb = zArr2;
                    }
/* 55 */            this.zzb[i] = zBooleanValue;
/* 60 */            this.zzc++;
/* 65 */            ((AbstractList) this).modCount++;
                }

                @Override // com.google.android.gms.internal.auth.zzdq, java.util.AbstractCollection, java.util.Collection, java.util.List
                public final boolean addAll(Collection collection) {
/* 1 */             zza();
/* 4 */             zzez.zze(collection);
/* 9 */             if (!(collection instanceof zzdu)) {
/* 11 */                return super.addAll(collection);
                    }
/* 16 */            zzdu zzduVar = (zzdu) collection;
/* 18 */            int i = zzduVar.zzc;
/* 21 */            if (i == 0) {
/* 20 */                return false;
                    }
/* 24 */            int i2 = this.zzc;
/* 30 */            if (AbstractC0208c9.API_PRIORITY_OTHER - i2 < i) {
/* 69 */                throw new OutOfMemoryError();
                    }
/* 32 */            int i3 = i2 + i;
/* 33 */            boolean[] zArr = this.zzb;
/* 36 */            if (i3 > zArr.length) {
/* 42 */                this.zzb = Arrays.copyOf(zArr, i3);
                    }
/* 52 */            System.arraycopy(zzduVar.zzb, 0, this.zzb, this.zzc, zzduVar.zzc);
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
/* 7 */             if (!(obj instanceof zzdu)) {
/* 9 */                 return super.equals(obj);
                    }
/* 14 */            zzdu zzduVar = (zzdu) obj;
/* 21 */            if (this.zzc != zzduVar.zzc) {
/* 20 */                return false;
                    }
/* 24 */            boolean[] zArr = zzduVar.zzb;
/* 29 */            for (int i = 0; i < this.zzc; i++) {
/* 37 */                if (this.zzb[i] != zArr[i]) {
/* 20 */                    return false;
                        }
                    }
/* 1 */             return true;
                }

                @Override // java.util.AbstractList, java.util.List
                public final /* synthetic */ Object get(int i) {
/* 1 */             zzg(i);
/* 8 */             return Boolean.valueOf(this.zzb[i]);
                }

                @Override // com.google.android.gms.internal.auth.zzdq, java.util.AbstractList, java.util.Collection, java.util.List
                public final int hashCode() {
/* 1 */             int iZza = 1;
/* 5 */             for (int i = 0; i < this.zzc; i++) {
/* 17 */                iZza = (iZza * 31) + zzez.zza(this.zzb[i]);
                    }
/* 21 */            return iZza;
                }

                @Override // java.util.AbstractList, java.util.List
                public final int indexOf(Object obj) {
/* 4 */             if (!(obj instanceof Boolean)) {
/* 3 */                 return -1;
                    }
/* 9 */             boolean zBooleanValue = ((Boolean) obj).booleanValue();
/* 13 */            int i = this.zzc;
/* 16 */            for (int i2 = 0; i2 < i; i2++) {
/* 22 */                if (this.zzb[i2] == zBooleanValue) {
/* 24 */                    return i2;
                        }
                    }
/* 3 */             return -1;
                }

                @Override // com.google.android.gms.internal.auth.zzdq, java.util.AbstractList, java.util.List
                public final /* bridge */ /* synthetic */ Object remove(int i) {
/* 1 */             zza();
/* 4 */             zzg(i);
/* 7 */             boolean[] zArr = this.zzb;
/* 9 */             boolean z = zArr[i];
/* 11 */            int i2 = this.zzc;
/* 15 */            if (i < i2 - 1) {
/* 22 */                System.arraycopy(zArr, i + 1, zArr, i, (i2 - i) - 1);
                    }
/* 29 */            this.zzc--;
/* 35 */            ((AbstractList) this).modCount++;
/* 37 */            return Boolean.valueOf(z);
                }

                @Override // java.util.AbstractList
                public final void removeRange(int i, int i2) {
/* 1 */             zza();
/* 4 */             if (i2 < i) {
/* 29 */                s80.m8425f("toIndex < fromIndex");
/* 32 */                return;
                    }
/* 6 */             boolean[] zArr = this.zzb;
/* 11 */            System.arraycopy(zArr, i2, zArr, i, this.zzc - i2);
/* 18 */            this.zzc -= i2 - i;
/* 24 */            ((AbstractList) this).modCount++;
                }

                @Override // com.google.android.gms.internal.auth.zzdq, java.util.AbstractList, java.util.List
                public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
/* 3 */             boolean zBooleanValue = ((Boolean) obj).booleanValue();
/* 7 */             zza();
/* 10 */            zzg(i);
/* 13 */            boolean[] zArr = this.zzb;
/* 15 */            boolean z = zArr[i];
/* 17 */            zArr[i] = zBooleanValue;
/* 19 */            return Boolean.valueOf(z);
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                public final int size() {
/* 1 */             return this.zzc;
                }

                @Override // com.google.android.gms.internal.auth.zzey
                public final /* bridge */ /* synthetic */ zzey zzd(int i) {
/* 3 */             if (i >= this.zzc) {
/* 15 */                return new zzdu(Arrays.copyOf(this.zzb, i), this.zzc);
                    }
/* 19 */            f42.m3649e();
/* 22 */            return null;
                }

                public final void zze(boolean z) {
/* 1 */             zza();
/* 4 */             int i = this.zzc;
/* 6 */             boolean[] zArr = this.zzb;
/* 9 */             if (i == zArr.length) {
/* 18 */                boolean[] zArr2 = new boolean[fm0.m3797w(i, 3, 2, 1)];
/* 21 */                System.arraycopy(zArr, 0, zArr2, 0, i);
/* 24 */                this.zzb = zArr2;
                    }
/* 26 */            boolean[] zArr3 = this.zzb;
/* 28 */            int i2 = this.zzc;
/* 32 */            this.zzc = i2 + 1;
/* 34 */            zArr3[i2] = z;
                }

/* 9 */         private zzdu(boolean[] zArr, int i) {
                    this.zzb = zArr;
                    this.zzc = i;
                }

                @Override // com.google.android.gms.internal.auth.zzdq, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
/* 75 */        public final /* bridge */ /* synthetic */ boolean add(Object obj) {
/* 77 */            zze(((Boolean) obj).booleanValue());
                    return true;
                }
            }
