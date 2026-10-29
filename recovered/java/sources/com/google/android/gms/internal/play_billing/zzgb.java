            package com.google.android.gms.internal.play_billing;

            import java.util.AbstractList;
            import java.util.Arrays;
            import java.util.Collection;
            import java.util.RandomAccess;
            import p000.AbstractC0208c9;
            import p000.AbstractC0886en;
            import p000.f42;
            import p000.s80;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 7 */     final class zzgb extends zzfx implements RandomAccess, zzho, zzit {
                private static final boolean[] zza;
                private boolean[] zzb;
                private int zzc;

                static {
/* 2 */             boolean[] zArr = new boolean[0];
/* 4 */             zza = zArr;
/* 8 */             new zzgb(zArr, 0, false);
                }

                public zzgb() {
/* 5 */             this(zza, 0, true);
                }

                private static int zzg(int i) {
/* 9 */             return Math.max(((i * 3) / 2) + 1, 10);
                }

                private final String zzh(int i) {
/* 7 */             return AbstractC0886en.m3506j("Index:", i, this.zzc, ", Size:");
                }

                private final void zzi(int i) {
/* 1 */             if (i < 0 || i >= this.zzc) {
/* 12 */                s80.m8425f(zzh(i));
                    }
                }

                @Override // com.google.android.gms.internal.play_billing.zzfx, java.util.AbstractList, java.util.List
                public final /* synthetic */ void add(int i, Object obj) {
                    int i2;
/* 3 */             boolean zBooleanValue = ((Boolean) obj).booleanValue();
/* 7 */             zza();
/* 10 */            if (i < 0 || i > (i2 = this.zzc)) {
/* 71 */                s80.m8425f(zzh(i));
/* 74 */                return;
                    }
/* 16 */            int i3 = i + 1;
/* 18 */            boolean[] zArr = this.zzb;
/* 20 */            int length = zArr.length;
/* 21 */            if (i2 < length) {
/* 24 */                System.arraycopy(zArr, i, zArr, i3, i2 - i);
                    } else {
/* 32 */                boolean[] zArr2 = new boolean[zzg(length)];
/* 37 */                System.arraycopy(this.zzb, 0, zArr2, 0, i);
/* 45 */                System.arraycopy(this.zzb, i, zArr2, i3, this.zzc - i);
/* 48 */                this.zzb = zArr2;
                    }
/* 52 */            this.zzb[i] = zBooleanValue;
/* 58 */            this.zzc++;
/* 64 */            ((AbstractList) this).modCount++;
                }

                @Override // com.google.android.gms.internal.play_billing.zzfx, java.util.AbstractCollection, java.util.Collection, java.util.List
                public final boolean addAll(Collection collection) {
/* 1 */             zza();
/* 4 */             byte[] bArr = zzhp.zzb;
/* 6 */             collection.getClass();
/* 11 */            if (!(collection instanceof zzgb)) {
/* 13 */                return super.addAll(collection);
                    }
/* 18 */            zzgb zzgbVar = (zzgb) collection;
/* 20 */            int i = zzgbVar.zzc;
/* 23 */            if (i == 0) {
/* 22 */                return false;
                    }
/* 26 */            int i2 = this.zzc;
/* 32 */            if (AbstractC0208c9.API_PRIORITY_OTHER - i2 < i) {
/* 71 */                throw new OutOfMemoryError();
                    }
/* 34 */            int i3 = i2 + i;
/* 35 */            boolean[] zArr = this.zzb;
/* 38 */            if (i3 > zArr.length) {
/* 44 */                this.zzb = Arrays.copyOf(zArr, i3);
                    }
/* 54 */            System.arraycopy(zzgbVar.zzb, 0, this.zzb, this.zzc, zzgbVar.zzc);
/* 57 */            this.zzc = i3;
/* 63 */            ((AbstractList) this).modCount++;
/* 61 */            return true;
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                public final boolean contains(Object obj) {
                    return indexOf(obj) != -1;
                }

                @Override // com.google.android.gms.internal.play_billing.zzfx, java.util.AbstractList, java.util.Collection, java.util.List
                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 7 */             if (!(obj instanceof zzgb)) {
/* 9 */                 return super.equals(obj);
                    }
/* 14 */            zzgb zzgbVar = (zzgb) obj;
/* 21 */            if (this.zzc != zzgbVar.zzc) {
/* 20 */                return false;
                    }
/* 24 */            boolean[] zArr = zzgbVar.zzb;
/* 29 */            for (int i = 0; i < this.zzc; i++) {
/* 37 */                if (this.zzb[i] != zArr[i]) {
/* 20 */                    return false;
                        }
                    }
/* 1 */             return true;
                }

                @Override // java.util.AbstractList, java.util.List
                public final /* synthetic */ Object get(int i) {
/* 1 */             zzi(i);
/* 8 */             return Boolean.valueOf(this.zzb[i]);
                }

                @Override // com.google.android.gms.internal.play_billing.zzfx, java.util.AbstractList, java.util.Collection, java.util.List
                public final int hashCode() {
/* 2 */             int iZza = 1;
/* 5 */             for (int i = 0; i < this.zzc; i++) {
/* 17 */                iZza = (iZza * 31) + zzhp.zza(this.zzb[i]);
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

                @Override // com.google.android.gms.internal.play_billing.zzfx, java.util.AbstractList, java.util.List
                public final /* bridge */ /* synthetic */ Object remove(int i) {
/* 1 */             zza();
/* 4 */             zzi(i);
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

                @Override // com.google.android.gms.internal.play_billing.zzfx, java.util.AbstractList, java.util.List
                public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
/* 3 */             boolean zBooleanValue = ((Boolean) obj).booleanValue();
/* 7 */             zza();
/* 10 */            zzi(i);
/* 13 */            boolean[] zArr = this.zzb;
/* 15 */            boolean z = zArr[i];
/* 17 */            zArr[i] = zBooleanValue;
/* 19 */            return Boolean.valueOf(z);
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                public final int size() {
/* 1 */             return this.zzc;
                }

                @Override // com.google.android.gms.internal.play_billing.zzho
                public final /* bridge */ /* synthetic */ zzho zzd(int i) {
/* 3 */             if (i >= this.zzc) {
/* 21 */                return new zzgb(i == 0 ? zza : Arrays.copyOf(this.zzb, i), this.zzc, true);
                    }
/* 25 */            f42.m3649e();
/* 28 */            return null;
                }

                public final void zze(boolean z) {
/* 1 */             zza();
/* 4 */             int i = this.zzc;
/* 8 */             int length = this.zzb.length;
/* 9 */             if (i == length) {
/* 15 */                boolean[] zArr = new boolean[zzg(length)];
/* 22 */                System.arraycopy(this.zzb, 0, zArr, 0, this.zzc);
/* 25 */                this.zzb = zArr;
                    }
/* 27 */            boolean[] zArr2 = this.zzb;
/* 29 */            int i2 = this.zzc;
/* 33 */            this.zzc = i2 + 1;
/* 35 */            zArr2[i2] = z;
                }

                public final boolean zzf(int i) {
/* 1 */             zzi(i);
/* 6 */             return this.zzb[i];
                }

/* 8 */         private zzgb(boolean[] zArr, int i, boolean z) {
/* 9 */             super(z);
                    this.zzb = zArr;
                    this.zzc = i;
                }

                @Override // com.google.android.gms.internal.play_billing.zzfx, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
/* 74 */        public final /* bridge */ /* synthetic */ boolean add(Object obj) {
/* 76 */            zze(((Boolean) obj).booleanValue());
                    return true;
                }
            }
