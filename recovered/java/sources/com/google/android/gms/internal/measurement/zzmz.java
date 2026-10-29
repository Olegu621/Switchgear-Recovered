            package com.google.android.gms.internal.measurement;

            import java.util.AbstractList;
            import java.util.Arrays;
            import java.util.Collection;
            import java.util.RandomAccess;
            import p000.AbstractC0208c9;
            import p000.f42;
            import p000.s80;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 7 */     final class zzmz extends zzkt implements RandomAccess, zzmm, zzns {
                private static final long[] zza;
                private static final zzmz zzb;
                private long[] zzc;
                private int zzd;

                static {
/* 2 */             long[] jArr = new long[0];
/* 4 */             zza = jArr;
/* 11 */            zzb = new zzmz(jArr, 0, false);
                }

                public zzmz() {
/* 5 */             this(zza, 0, true);
                }

                public static zzmz zze() {
/* 1 */             return zzb;
                }

                private static int zzi(int i) {
/* 9 */             return Math.max(((i * 3) / 2) + 1, 10);
                }

                private final void zzj(int i) {
/* 1 */             if (i < 0 || i >= this.zzd) {
/* 12 */                s80.m8425f(zzk(i));
                    }
                }

                private final String zzk(int i) {
/* 9 */             return zzkv.zza(this.zzd, i, (byte) 13, "Index:", ", Size:");
                }

                @Override // com.google.android.gms.internal.measurement.zzkt, java.util.AbstractList, java.util.List
                public final /* synthetic */ void add(int i, Object obj) {
                    int i2;
/* 3 */             long jLongValue = ((Long) obj).longValue();
/* 7 */             zzcF();
/* 10 */            if (i < 0 || i > (i2 = this.zzd)) {
/* 71 */                s80.m8425f(zzk(i));
/* 74 */                return;
                    }
/* 16 */            int i3 = i + 1;
/* 18 */            long[] jArr = this.zzc;
/* 20 */            int length = jArr.length;
/* 21 */            if (i2 < length) {
/* 24 */                System.arraycopy(jArr, i, jArr, i3, i2 - i);
                    } else {
/* 32 */                long[] jArr2 = new long[zzi(length)];
/* 37 */                System.arraycopy(this.zzc, 0, jArr2, 0, i);
/* 45 */                System.arraycopy(this.zzc, i, jArr2, i3, this.zzd - i);
/* 48 */                this.zzc = jArr2;
                    }
/* 52 */            this.zzc[i] = jLongValue;
/* 58 */            this.zzd++;
/* 64 */            ((AbstractList) this).modCount++;
                }

                @Override // com.google.android.gms.internal.measurement.zzkt, java.util.AbstractCollection, java.util.Collection, java.util.List
                public final boolean addAll(Collection collection) {
/* 1 */             zzcF();
/* 4 */             byte[] bArr = zzmo.zzb;
/* 6 */             collection.getClass();
/* 11 */            if (!(collection instanceof zzmz)) {
/* 13 */                return super.addAll(collection);
                    }
/* 18 */            zzmz zzmzVar = (zzmz) collection;
/* 20 */            int i = zzmzVar.zzd;
/* 23 */            if (i == 0) {
/* 22 */                return false;
                    }
/* 26 */            int i2 = this.zzd;
/* 32 */            if (AbstractC0208c9.API_PRIORITY_OTHER - i2 < i) {
/* 71 */                throw new OutOfMemoryError();
                    }
/* 34 */            int i3 = i2 + i;
/* 35 */            long[] jArr = this.zzc;
/* 38 */            if (i3 > jArr.length) {
/* 44 */                this.zzc = Arrays.copyOf(jArr, i3);
                    }
/* 54 */            System.arraycopy(zzmzVar.zzc, 0, this.zzc, this.zzd, zzmzVar.zzd);
/* 57 */            this.zzd = i3;
/* 63 */            ((AbstractList) this).modCount++;
/* 61 */            return true;
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                public final boolean contains(Object obj) {
                    return indexOf(obj) != -1;
                }

                @Override // com.google.android.gms.internal.measurement.zzkt, java.util.AbstractList, java.util.Collection, java.util.List
                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 7 */             if (!(obj instanceof zzmz)) {
/* 9 */                 return super.equals(obj);
                    }
/* 14 */            zzmz zzmzVar = (zzmz) obj;
/* 21 */            if (this.zzd != zzmzVar.zzd) {
/* 20 */                return false;
                    }
/* 24 */            long[] jArr = zzmzVar.zzc;
/* 29 */            for (int i = 0; i < this.zzd; i++) {
/* 39 */                if (this.zzc[i] != jArr[i]) {
/* 20 */                    return false;
                        }
                    }
/* 1 */             return true;
                }

                @Override // java.util.AbstractList, java.util.List
                public final /* synthetic */ Object get(int i) {
/* 1 */             zzj(i);
/* 8 */             return Long.valueOf(this.zzc[i]);
                }

                @Override // com.google.android.gms.internal.measurement.zzkt, java.util.AbstractList, java.util.Collection, java.util.List
                public final int hashCode() {
/* 2 */             int i = 1;
/* 5 */             for (int i2 = 0; i2 < this.zzd; i2++) {
/* 11 */                long j = this.zzc[i2];
/* 13 */                byte[] bArr = zzmo.zzb;
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
/* 13 */            int i = this.zzd;
/* 16 */            for (int i2 = 0; i2 < i; i2++) {
/* 24 */                if (this.zzc[i2] == jLongValue) {
/* 26 */                    return i2;
                        }
                    }
/* 3 */             return -1;
                }

                @Override // com.google.android.gms.internal.measurement.zzkt, java.util.AbstractList, java.util.List
                public final /* bridge */ /* synthetic */ Object remove(int i) {
/* 1 */             zzcF();
/* 4 */             zzj(i);
/* 7 */             long[] jArr = this.zzc;
/* 9 */             long j = jArr[i];
/* 11 */            int i2 = this.zzd;
/* 15 */            if (i < i2 - 1) {
/* 22 */                System.arraycopy(jArr, i + 1, jArr, i, (i2 - i) - 1);
                    }
/* 29 */            this.zzd--;
/* 35 */            ((AbstractList) this).modCount++;
/* 37 */            return Long.valueOf(j);
                }

                @Override // java.util.AbstractList
                public final void removeRange(int i, int i2) {
/* 1 */             zzcF();
/* 4 */             if (i2 < i) {
/* 29 */                s80.m8425f("toIndex < fromIndex");
/* 32 */                return;
                    }
/* 6 */             long[] jArr = this.zzc;
/* 11 */            System.arraycopy(jArr, i2, jArr, i, this.zzd - i2);
/* 18 */            this.zzd -= i2 - i;
/* 24 */            ((AbstractList) this).modCount++;
                }

                @Override // com.google.android.gms.internal.measurement.zzkt, java.util.AbstractList, java.util.List
                public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
/* 3 */             long jLongValue = ((Long) obj).longValue();
/* 7 */             zzcF();
/* 10 */            zzj(i);
/* 13 */            long[] jArr = this.zzc;
/* 15 */            long j = jArr[i];
/* 17 */            jArr[i] = jLongValue;
/* 19 */            return Long.valueOf(j);
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                public final int size() {
/* 1 */             return this.zzd;
                }

                @Override // com.google.android.gms.internal.measurement.zzmm
                public final long zzc(int i) {
/* 1 */             zzj(i);
/* 6 */             return this.zzc[i];
                }

                @Override // com.google.android.gms.internal.measurement.zzmn, com.google.android.gms.internal.measurement.zzmg
                /* JADX INFO: renamed from: zzd */
                public final zzmm zzg(int i) {
/* 3 */             if (i >= this.zzd) {
/* 21 */                return new zzmz(i == 0 ? zza : Arrays.copyOf(this.zzc, i), this.zzd, true);
                    }
/* 25 */            f42.m3649e();
/* 28 */            return null;
                }

                public final void zzf(long j) {
/* 1 */             zzcF();
/* 4 */             int i = this.zzd;
/* 8 */             int length = this.zzc.length;
/* 9 */             if (i == length) {
/* 15 */                long[] jArr = new long[zzi(length)];
/* 22 */                System.arraycopy(this.zzc, 0, jArr, 0, this.zzd);
/* 25 */                this.zzc = jArr;
                    }
/* 27 */            long[] jArr2 = this.zzc;
/* 29 */            int i2 = this.zzd;
/* 33 */            this.zzd = i2 + 1;
/* 35 */            jArr2[i2] = j;
                }

                public final void zzh(int i) {
/* 3 */             int length = this.zzc.length;
/* 4 */             if (i <= length) {
/* 6 */                 return;
                    }
/* 7 */             if (length == 0) {
/* 33 */                this.zzc = new long[Math.max(i, 10)];
/* 35 */                return;
                    }
/* 9 */             while (length < i) {
/* 11 */                length = zzi(length);
                    }
/* 22 */            this.zzc = Arrays.copyOf(this.zzc, length);
                }

/* 8 */         private zzmz(long[] jArr, int i, boolean z) {
/* 9 */             super(z);
                    this.zzc = jArr;
                    this.zzd = i;
                }

                @Override // com.google.android.gms.internal.measurement.zzkt, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
/* 74 */        public final /* bridge */ /* synthetic */ boolean add(Object obj) {
/* 76 */            zzf(((Long) obj).longValue());
                    return true;
                }
            }
