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
/* 7 */     final class zzib extends zzfx implements RandomAccess, zzho, zzit {
                private static final long[] zza;
                private long[] zzb;
                private int zzc;

                static {
/* 2 */             long[] jArr = new long[0];
/* 4 */             zza = jArr;
/* 8 */             new zzib(jArr, 0, false);
                }

                public zzib() {
/* 5 */             this(zza, 0, true);
                }

                private static int zzh(int i) {
/* 9 */             return Math.max(((i * 3) / 2) + 1, 10);
                }

                private final String zzi(int i) {
/* 7 */             return AbstractC0886en.m3506j("Index:", i, this.zzc, ", Size:");
                }

                private final void zzj(int i) {
/* 1 */             if (i < 0 || i >= this.zzc) {
/* 12 */                s80.m8425f(zzi(i));
                    }
                }

                @Override // com.google.android.gms.internal.play_billing.zzfx, java.util.AbstractList, java.util.List
                public final /* synthetic */ void add(int i, Object obj) {
                    int i2;
/* 3 */             long jLongValue = ((Long) obj).longValue();
/* 7 */             zza();
/* 10 */            if (i < 0 || i > (i2 = this.zzc)) {
/* 71 */                s80.m8425f(zzi(i));
/* 74 */                return;
                    }
/* 16 */            int i3 = i + 1;
/* 18 */            long[] jArr = this.zzb;
/* 20 */            int length = jArr.length;
/* 21 */            if (i2 < length) {
/* 24 */                System.arraycopy(jArr, i, jArr, i3, i2 - i);
                    } else {
/* 32 */                long[] jArr2 = new long[zzh(length)];
/* 37 */                System.arraycopy(this.zzb, 0, jArr2, 0, i);
/* 45 */                System.arraycopy(this.zzb, i, jArr2, i3, this.zzc - i);
/* 48 */                this.zzb = jArr2;
                    }
/* 52 */            this.zzb[i] = jLongValue;
/* 58 */            this.zzc++;
/* 64 */            ((AbstractList) this).modCount++;
                }

                @Override // com.google.android.gms.internal.play_billing.zzfx, java.util.AbstractCollection, java.util.Collection, java.util.List
                public final boolean addAll(Collection collection) {
/* 1 */             zza();
/* 4 */             byte[] bArr = zzhp.zzb;
/* 6 */             collection.getClass();
/* 11 */            if (!(collection instanceof zzib)) {
/* 13 */                return super.addAll(collection);
                    }
/* 18 */            zzib zzibVar = (zzib) collection;
/* 20 */            int i = zzibVar.zzc;
/* 23 */            if (i == 0) {
/* 22 */                return false;
                    }
/* 26 */            int i2 = this.zzc;
/* 32 */            if (AbstractC0208c9.API_PRIORITY_OTHER - i2 < i) {
/* 71 */                throw new OutOfMemoryError();
                    }
/* 34 */            int i3 = i2 + i;
/* 35 */            long[] jArr = this.zzb;
/* 38 */            if (i3 > jArr.length) {
/* 44 */                this.zzb = Arrays.copyOf(jArr, i3);
                    }
/* 54 */            System.arraycopy(zzibVar.zzb, 0, this.zzb, this.zzc, zzibVar.zzc);
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
/* 7 */             if (!(obj instanceof zzib)) {
/* 9 */                 return super.equals(obj);
                    }
/* 14 */            zzib zzibVar = (zzib) obj;
/* 21 */            if (this.zzc != zzibVar.zzc) {
/* 20 */                return false;
                    }
/* 24 */            long[] jArr = zzibVar.zzb;
/* 29 */            for (int i = 0; i < this.zzc; i++) {
/* 39 */                if (this.zzb[i] != jArr[i]) {
/* 20 */                    return false;
                        }
                    }
/* 1 */             return true;
                }

                @Override // java.util.AbstractList, java.util.List
                public final /* synthetic */ Object get(int i) {
/* 1 */             zzj(i);
/* 8 */             return Long.valueOf(this.zzb[i]);
                }

                @Override // com.google.android.gms.internal.play_billing.zzfx, java.util.AbstractList, java.util.Collection, java.util.List
                public final int hashCode() {
/* 2 */             int i = 1;
/* 5 */             for (int i2 = 0; i2 < this.zzc; i2++) {
/* 11 */                long j = this.zzb[i2];
/* 13 */                byte[] bArr = zzhp.zzb;
/* 22 */                i = (i * 31) + ((int) (j ^ (j >>> 32)));
                    }
/* 26 */            return i;
                }

                @Override // java.util.AbstractList, java.util.List
                public final int indexOf(Object obj) {
/* 4 */             if (!(obj instanceof Long)) {
/* 3 */                 return -1;
                    }
/* 9 */             long jLongValue = ((Long) obj).longValue();
/* 13 */            int i = this.zzc;
/* 16 */            for (int i2 = 0; i2 < i; i2++) {
/* 24 */                if (this.zzb[i2] == jLongValue) {
/* 26 */                    return i2;
                        }
                    }
/* 3 */             return -1;
                }

                @Override // com.google.android.gms.internal.play_billing.zzfx, java.util.AbstractList, java.util.List
                public final /* bridge */ /* synthetic */ Object remove(int i) {
/* 1 */             zza();
/* 4 */             zzj(i);
/* 7 */             long[] jArr = this.zzb;
/* 9 */             long j = jArr[i];
/* 11 */            int i2 = this.zzc;
/* 15 */            if (i < i2 - 1) {
/* 22 */                System.arraycopy(jArr, i + 1, jArr, i, (i2 - i) - 1);
                    }
/* 29 */            this.zzc--;
/* 35 */            ((AbstractList) this).modCount++;
/* 37 */            return Long.valueOf(j);
                }

                @Override // java.util.AbstractList
                public final void removeRange(int i, int i2) {
/* 1 */             zza();
/* 4 */             if (i2 < i) {
/* 29 */                s80.m8425f("toIndex < fromIndex");
/* 32 */                return;
                    }
/* 6 */             long[] jArr = this.zzb;
/* 11 */            System.arraycopy(jArr, i2, jArr, i, this.zzc - i2);
/* 18 */            this.zzc -= i2 - i;
/* 24 */            ((AbstractList) this).modCount++;
                }

                @Override // com.google.android.gms.internal.play_billing.zzfx, java.util.AbstractList, java.util.List
                public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
/* 3 */             long jLongValue = ((Long) obj).longValue();
/* 7 */             zza();
/* 10 */            zzj(i);
/* 13 */            long[] jArr = this.zzb;
/* 15 */            long j = jArr[i];
/* 17 */            jArr[i] = jLongValue;
/* 19 */            return Long.valueOf(j);
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                public final int size() {
/* 1 */             return this.zzc;
                }

                @Override // com.google.android.gms.internal.play_billing.zzho
                public final /* bridge */ /* synthetic */ zzho zzd(int i) {
/* 3 */             if (i >= this.zzc) {
/* 21 */                return new zzib(i == 0 ? zza : Arrays.copyOf(this.zzb, i), this.zzc, true);
                    }
/* 25 */            f42.m3649e();
/* 28 */            return null;
                }

                public final long zze(int i) {
/* 1 */             zzj(i);
/* 6 */             return this.zzb[i];
                }

                public final void zzf(long j) {
/* 1 */             zza();
/* 4 */             int i = this.zzc;
/* 8 */             int length = this.zzb.length;
/* 9 */             if (i == length) {
/* 15 */                long[] jArr = new long[zzh(length)];
/* 22 */                System.arraycopy(this.zzb, 0, jArr, 0, this.zzc);
/* 25 */                this.zzb = jArr;
                    }
/* 27 */            long[] jArr2 = this.zzb;
/* 29 */            int i2 = this.zzc;
/* 33 */            this.zzc = i2 + 1;
/* 35 */            jArr2[i2] = j;
                }

                public final void zzg(int i) {
/* 3 */             int length = this.zzb.length;
/* 4 */             if (i <= length) {
/* 6 */                 return;
                    }
/* 7 */             if (length == 0) {
/* 33 */                this.zzb = new long[Math.max(i, 10)];
/* 35 */                return;
                    }
/* 9 */             while (length < i) {
/* 11 */                length = zzh(length);
                    }
/* 22 */            this.zzb = Arrays.copyOf(this.zzb, length);
                }

/* 8 */         private zzib(long[] jArr, int i, boolean z) {
/* 9 */             super(z);
                    this.zzb = jArr;
                    this.zzc = i;
                }

                @Override // com.google.android.gms.internal.play_billing.zzfx, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
/* 74 */        public final /* bridge */ /* synthetic */ boolean add(Object obj) {
/* 76 */            zzf(((Long) obj).longValue());
                    return true;
                }
            }
