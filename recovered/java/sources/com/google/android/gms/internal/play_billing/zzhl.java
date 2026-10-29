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
/* 7 */     final class zzhl extends zzfx implements RandomAccess, zzhn, zzit {
                private static final int[] zza;
                private static final zzhl zzb;
                private int[] zzc;
                private int zzd;

                static {
/* 2 */             int[] iArr = new int[0];
/* 4 */             zza = iArr;
/* 11 */            zzb = new zzhl(iArr, 0, false);
                }

                public zzhl() {
/* 5 */             this(zza, 0, true);
                }

                public static zzhl zzf() {
/* 1 */             return zzb;
                }

                private static int zzi(int i) {
/* 9 */             return Math.max(((i * 3) / 2) + 1, 10);
                }

                private final String zzj(int i) {
/* 7 */             return AbstractC0886en.m3506j("Index:", i, this.zzd, ", Size:");
                }

                private final void zzk(int i) {
/* 1 */             if (i < 0 || i >= this.zzd) {
/* 12 */                s80.m8425f(zzj(i));
                    }
                }

                @Override // com.google.android.gms.internal.play_billing.zzfx, java.util.AbstractList, java.util.List
                public final /* synthetic */ void add(int i, Object obj) {
                    int i2;
/* 3 */             int iIntValue = ((Integer) obj).intValue();
/* 7 */             zza();
/* 10 */            if (i < 0 || i > (i2 = this.zzd)) {
/* 71 */                s80.m8425f(zzj(i));
/* 74 */                return;
                    }
/* 16 */            int i3 = i + 1;
/* 18 */            int[] iArr = this.zzc;
/* 20 */            int length = iArr.length;
/* 21 */            if (i2 < length) {
/* 24 */                System.arraycopy(iArr, i, iArr, i3, i2 - i);
                    } else {
/* 32 */                int[] iArr2 = new int[zzi(length)];
/* 37 */                System.arraycopy(this.zzc, 0, iArr2, 0, i);
/* 45 */                System.arraycopy(this.zzc, i, iArr2, i3, this.zzd - i);
/* 48 */                this.zzc = iArr2;
                    }
/* 52 */            this.zzc[i] = iIntValue;
/* 58 */            this.zzd++;
/* 64 */            ((AbstractList) this).modCount++;
                }

                @Override // com.google.android.gms.internal.play_billing.zzfx, java.util.AbstractCollection, java.util.Collection, java.util.List
                public final boolean addAll(Collection collection) {
/* 1 */             zza();
/* 4 */             byte[] bArr = zzhp.zzb;
/* 6 */             collection.getClass();
/* 11 */            if (!(collection instanceof zzhl)) {
/* 13 */                return super.addAll(collection);
                    }
/* 18 */            zzhl zzhlVar = (zzhl) collection;
/* 20 */            int i = zzhlVar.zzd;
/* 23 */            if (i == 0) {
/* 22 */                return false;
                    }
/* 26 */            int i2 = this.zzd;
/* 32 */            if (AbstractC0208c9.API_PRIORITY_OTHER - i2 < i) {
/* 71 */                throw new OutOfMemoryError();
                    }
/* 34 */            int i3 = i2 + i;
/* 35 */            int[] iArr = this.zzc;
/* 38 */            if (i3 > iArr.length) {
/* 44 */                this.zzc = Arrays.copyOf(iArr, i3);
                    }
/* 54 */            System.arraycopy(zzhlVar.zzc, 0, this.zzc, this.zzd, zzhlVar.zzd);
/* 57 */            this.zzd = i3;
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
/* 7 */             if (!(obj instanceof zzhl)) {
/* 9 */                 return super.equals(obj);
                    }
/* 14 */            zzhl zzhlVar = (zzhl) obj;
/* 21 */            if (this.zzd != zzhlVar.zzd) {
/* 20 */                return false;
                    }
/* 24 */            int[] iArr = zzhlVar.zzc;
/* 29 */            for (int i = 0; i < this.zzd; i++) {
/* 37 */                if (this.zzc[i] != iArr[i]) {
/* 20 */                    return false;
                        }
                    }
/* 1 */             return true;
                }

                @Override // java.util.AbstractList, java.util.List
                public final /* synthetic */ Object get(int i) {
/* 1 */             zzk(i);
/* 8 */             return Integer.valueOf(this.zzc[i]);
                }

                @Override // com.google.android.gms.internal.play_billing.zzfx, java.util.AbstractList, java.util.Collection, java.util.List
                public final int hashCode() {
/* 2 */             int i = 1;
/* 5 */             for (int i2 = 0; i2 < this.zzd; i2++) {
/* 13 */                i = (i * 31) + this.zzc[i2];
                    }
/* 17 */            return i;
                }

                @Override // java.util.AbstractList, java.util.List
                public final int indexOf(Object obj) {
/* 4 */             if (!(obj instanceof Integer)) {
/* 3 */                 return -1;
                    }
/* 9 */             int iIntValue = ((Integer) obj).intValue();
/* 13 */            int i = this.zzd;
/* 16 */            for (int i2 = 0; i2 < i; i2++) {
/* 22 */                if (this.zzc[i2] == iIntValue) {
/* 24 */                    return i2;
                        }
                    }
/* 3 */             return -1;
                }

                @Override // com.google.android.gms.internal.play_billing.zzfx, java.util.AbstractList, java.util.List
                public final /* bridge */ /* synthetic */ Object remove(int i) {
/* 1 */             zza();
/* 4 */             zzk(i);
/* 7 */             int[] iArr = this.zzc;
/* 9 */             int i2 = iArr[i];
/* 11 */            int i3 = this.zzd;
/* 15 */            if (i < i3 - 1) {
/* 22 */                System.arraycopy(iArr, i + 1, iArr, i, (i3 - i) - 1);
                    }
/* 29 */            this.zzd--;
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
/* 6 */             int[] iArr = this.zzc;
/* 11 */            System.arraycopy(iArr, i2, iArr, i, this.zzd - i2);
/* 18 */            this.zzd -= i2 - i;
/* 24 */            ((AbstractList) this).modCount++;
                }

                @Override // com.google.android.gms.internal.play_billing.zzfx, java.util.AbstractList, java.util.List
                public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
/* 3 */             int iIntValue = ((Integer) obj).intValue();
/* 7 */             zza();
/* 10 */            zzk(i);
/* 13 */            int[] iArr = this.zzc;
/* 15 */            int i2 = iArr[i];
/* 17 */            iArr[i] = iIntValue;
/* 19 */            return Integer.valueOf(i2);
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                public final int size() {
/* 1 */             return this.zzd;
                }

                @Override // com.google.android.gms.internal.play_billing.zzho
                public final /* bridge */ /* synthetic */ zzho zzd(int i) {
/* 3 */             if (i >= this.zzd) {
/* 21 */                return new zzhl(i == 0 ? zza : Arrays.copyOf(this.zzc, i), this.zzd, true);
                    }
/* 25 */            f42.m3649e();
/* 28 */            return null;
                }

                public final int zze(int i) {
/* 1 */             zzk(i);
/* 6 */             return this.zzc[i];
                }

                public final void zzg(int i) {
/* 1 */             zza();
/* 4 */             int i2 = this.zzd;
/* 8 */             int length = this.zzc.length;
/* 9 */             if (i2 == length) {
/* 15 */                int[] iArr = new int[zzi(length)];
/* 22 */                System.arraycopy(this.zzc, 0, iArr, 0, this.zzd);
/* 25 */                this.zzc = iArr;
                    }
/* 27 */            int[] iArr2 = this.zzc;
/* 29 */            int i3 = this.zzd;
/* 33 */            this.zzd = i3 + 1;
/* 35 */            iArr2[i3] = i;
                }

                public final void zzh(int i) {
/* 3 */             int length = this.zzc.length;
/* 4 */             if (i <= length) {
/* 6 */                 return;
                    }
/* 7 */             if (length == 0) {
/* 33 */                this.zzc = new int[Math.max(i, 10)];
/* 35 */                return;
                    }
/* 9 */             while (length < i) {
/* 11 */                length = zzi(length);
                    }
/* 22 */            this.zzc = Arrays.copyOf(this.zzc, length);
                }

/* 8 */         private zzhl(int[] iArr, int i, boolean z) {
/* 9 */             super(z);
                    this.zzc = iArr;
                    this.zzd = i;
                }

                @Override // com.google.android.gms.internal.play_billing.zzfx, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
/* 74 */        public final /* bridge */ /* synthetic */ boolean add(Object obj) {
/* 76 */            zzg(((Integer) obj).intValue());
                    return true;
                }
            }
