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
/* 8 */     final class zzev extends zzdq implements RandomAccess, zzey, zzgd {
                private static final zzev zza;
                private int[] zzb;
                private int zzc;

                static {
/* 6 */             zzev zzevVar = new zzev(new int[0], 0);
/* 9 */             zza = zzevVar;
/* 11 */            zzevVar.zzb();
                }

                public zzev() {
/* 6 */             this(new int[10], 0);
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
/* 3 */             int iIntValue = ((Integer) obj).intValue();
/* 7 */             zza();
/* 10 */            if (i < 0 || i > (i2 = this.zzc)) {
/* 72 */                s80.m8425f(zzf(i));
/* 75 */                return;
                    }
/* 16 */            int[] iArr = this.zzb;
/* 20 */            if (i2 < iArr.length) {
/* 25 */                System.arraycopy(iArr, i, iArr, i + 1, i2 - i);
                    } else {
/* 35 */                int[] iArr2 = new int[fm0.m3797w(i2, 3, 2, 1)];
/* 38 */                System.arraycopy(iArr, 0, iArr2, 0, i);
/* 48 */                System.arraycopy(this.zzb, i, iArr2, i + 1, this.zzc - i);
/* 51 */                this.zzb = iArr2;
                    }
/* 55 */            this.zzb[i] = iIntValue;
/* 60 */            this.zzc++;
/* 65 */            ((AbstractList) this).modCount++;
                }

                @Override // com.google.android.gms.internal.auth.zzdq, java.util.AbstractCollection, java.util.Collection, java.util.List
                public final boolean addAll(Collection collection) {
/* 1 */             zza();
/* 4 */             zzez.zze(collection);
/* 9 */             if (!(collection instanceof zzev)) {
/* 11 */                return super.addAll(collection);
                    }
/* 16 */            zzev zzevVar = (zzev) collection;
/* 18 */            int i = zzevVar.zzc;
/* 21 */            if (i == 0) {
/* 20 */                return false;
                    }
/* 24 */            int i2 = this.zzc;
/* 30 */            if (AbstractC0208c9.API_PRIORITY_OTHER - i2 < i) {
/* 69 */                throw new OutOfMemoryError();
                    }
/* 32 */            int i3 = i2 + i;
/* 33 */            int[] iArr = this.zzb;
/* 36 */            if (i3 > iArr.length) {
/* 42 */                this.zzb = Arrays.copyOf(iArr, i3);
                    }
/* 52 */            System.arraycopy(zzevVar.zzb, 0, this.zzb, this.zzc, zzevVar.zzc);
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
/* 7 */             if (!(obj instanceof zzev)) {
/* 9 */                 return super.equals(obj);
                    }
/* 14 */            zzev zzevVar = (zzev) obj;
/* 21 */            if (this.zzc != zzevVar.zzc) {
/* 20 */                return false;
                    }
/* 24 */            int[] iArr = zzevVar.zzb;
/* 29 */            for (int i = 0; i < this.zzc; i++) {
/* 37 */                if (this.zzb[i] != iArr[i]) {
/* 20 */                    return false;
                        }
                    }
/* 1 */             return true;
                }

                @Override // java.util.AbstractList, java.util.List
                public final /* synthetic */ Object get(int i) {
/* 1 */             zzg(i);
/* 8 */             return Integer.valueOf(this.zzb[i]);
                }

                @Override // com.google.android.gms.internal.auth.zzdq, java.util.AbstractList, java.util.Collection, java.util.List
                public final int hashCode() {
/* 1 */             int i = 1;
/* 5 */             for (int i2 = 0; i2 < this.zzc; i2++) {
/* 13 */                i = (i * 31) + this.zzb[i2];
                    }
/* 17 */            return i;
                }

                @Override // java.util.AbstractList, java.util.List
                public final int indexOf(Object obj) {
/* 4 */             if (!(obj instanceof Integer)) {
/* 3 */                 return -1;
                    }
/* 9 */             int iIntValue = ((Integer) obj).intValue();
/* 13 */            int i = this.zzc;
/* 16 */            for (int i2 = 0; i2 < i; i2++) {
/* 22 */                if (this.zzb[i2] == iIntValue) {
/* 24 */                    return i2;
                        }
                    }
/* 3 */             return -1;
                }

                @Override // com.google.android.gms.internal.auth.zzdq, java.util.AbstractList, java.util.List
                public final /* bridge */ /* synthetic */ Object remove(int i) {
/* 1 */             zza();
/* 4 */             zzg(i);
/* 7 */             int[] iArr = this.zzb;
/* 9 */             int i2 = iArr[i];
/* 11 */            int i3 = this.zzc;
/* 15 */            if (i < i3 - 1) {
/* 22 */                System.arraycopy(iArr, i + 1, iArr, i, (i3 - i) - 1);
                    }
/* 29 */            this.zzc--;
/* 35 */            ((AbstractList) this).modCount++;
/* 37 */            return Integer.valueOf(i2);
                }

                @Override // java.util.AbstractList
                public final void removeRange(int i, int i2) {
/* 1 */             zza();
/* 4 */             if (i2 < i) {
/* 29 */                s80.m8425f("toIndex < fromIndex");
/* 32 */                return;
                    }
/* 6 */             int[] iArr = this.zzb;
/* 11 */            System.arraycopy(iArr, i2, iArr, i, this.zzc - i2);
/* 18 */            this.zzc -= i2 - i;
/* 24 */            ((AbstractList) this).modCount++;
                }

                @Override // com.google.android.gms.internal.auth.zzdq, java.util.AbstractList, java.util.List
                public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
/* 3 */             int iIntValue = ((Integer) obj).intValue();
/* 7 */             zza();
/* 10 */            zzg(i);
/* 13 */            int[] iArr = this.zzb;
/* 15 */            int i2 = iArr[i];
/* 17 */            iArr[i] = iIntValue;
/* 19 */            return Integer.valueOf(i2);
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                public final int size() {
/* 1 */             return this.zzc;
                }

                @Override // com.google.android.gms.internal.auth.zzey
                public final /* bridge */ /* synthetic */ zzey zzd(int i) {
/* 3 */             if (i >= this.zzc) {
/* 15 */                return new zzev(Arrays.copyOf(this.zzb, i), this.zzc);
                    }
/* 19 */            f42.m3649e();
/* 22 */            return null;
                }

                public final void zze(int i) {
/* 1 */             zza();
/* 4 */             int i2 = this.zzc;
/* 6 */             int[] iArr = this.zzb;
/* 9 */             if (i2 == iArr.length) {
/* 18 */                int[] iArr2 = new int[fm0.m3797w(i2, 3, 2, 1)];
/* 21 */                System.arraycopy(iArr, 0, iArr2, 0, i2);
/* 24 */                this.zzb = iArr2;
                    }
/* 26 */            int[] iArr3 = this.zzb;
/* 28 */            int i3 = this.zzc;
/* 32 */            this.zzc = i3 + 1;
/* 34 */            iArr3[i3] = i;
                }

/* 9 */         private zzev(int[] iArr, int i) {
                    this.zzb = iArr;
                    this.zzc = i;
                }

                @Override // com.google.android.gms.internal.auth.zzdq, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
/* 75 */        public final /* bridge */ /* synthetic */ boolean add(Object obj) {
/* 77 */            zze(((Integer) obj).intValue());
                    return true;
                }
            }
