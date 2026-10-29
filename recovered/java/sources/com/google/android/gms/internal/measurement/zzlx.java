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
/* 7 */     final class zzlx extends zzkt implements RandomAccess, zzmk, zzns {
                private static final float[] zza;
                private float[] zzb;
                private int zzc;

                static {
/* 2 */             float[] fArr = new float[0];
/* 4 */             zza = fArr;
/* 8 */             new zzlx(fArr, 0, false);
                }

                public zzlx() {
/* 5 */             this(zza, 0, true);
                }

                private static int zzi(int i) {
/* 9 */             return Math.max(((i * 3) / 2) + 1, 10);
                }

                private final void zzj(int i) {
/* 1 */             if (i < 0 || i >= this.zzc) {
/* 12 */                s80.m8425f(zzk(i));
                    }
                }

                private final String zzk(int i) {
/* 9 */             return zzkv.zza(this.zzc, i, (byte) 13, "Index:", ", Size:");
                }

                @Override // com.google.android.gms.internal.measurement.zzkt, java.util.AbstractList, java.util.List
                public final /* synthetic */ void add(int i, Object obj) {
                    int i2;
/* 3 */             float fFloatValue = ((Float) obj).floatValue();
/* 7 */             zzcF();
/* 10 */            if (i < 0 || i > (i2 = this.zzc)) {
/* 71 */                s80.m8425f(zzk(i));
/* 74 */                return;
                    }
/* 16 */            int i3 = i + 1;
/* 18 */            float[] fArr = this.zzb;
/* 20 */            int length = fArr.length;
/* 21 */            if (i2 < length) {
/* 24 */                System.arraycopy(fArr, i, fArr, i3, i2 - i);
                    } else {
/* 32 */                float[] fArr2 = new float[zzi(length)];
/* 37 */                System.arraycopy(this.zzb, 0, fArr2, 0, i);
/* 45 */                System.arraycopy(this.zzb, i, fArr2, i3, this.zzc - i);
/* 48 */                this.zzb = fArr2;
                    }
/* 52 */            this.zzb[i] = fFloatValue;
/* 58 */            this.zzc++;
/* 64 */            ((AbstractList) this).modCount++;
                }

                @Override // com.google.android.gms.internal.measurement.zzkt, java.util.AbstractCollection, java.util.Collection, java.util.List
                public final boolean addAll(Collection collection) {
/* 1 */             zzcF();
/* 4 */             byte[] bArr = zzmo.zzb;
/* 6 */             collection.getClass();
/* 11 */            if (!(collection instanceof zzlx)) {
/* 13 */                return super.addAll(collection);
                    }
/* 18 */            zzlx zzlxVar = (zzlx) collection;
/* 20 */            int i = zzlxVar.zzc;
/* 23 */            if (i == 0) {
/* 22 */                return false;
                    }
/* 26 */            int i2 = this.zzc;
/* 32 */            if (AbstractC0208c9.API_PRIORITY_OTHER - i2 < i) {
/* 71 */                throw new OutOfMemoryError();
                    }
/* 34 */            int i3 = i2 + i;
/* 35 */            float[] fArr = this.zzb;
/* 38 */            if (i3 > fArr.length) {
/* 44 */                this.zzb = Arrays.copyOf(fArr, i3);
                    }
/* 54 */            System.arraycopy(zzlxVar.zzb, 0, this.zzb, this.zzc, zzlxVar.zzc);
/* 57 */            this.zzc = i3;
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
/* 7 */             if (!(obj instanceof zzlx)) {
/* 9 */                 return super.equals(obj);
                    }
/* 14 */            zzlx zzlxVar = (zzlx) obj;
/* 21 */            if (this.zzc != zzlxVar.zzc) {
/* 20 */                return false;
                    }
/* 24 */            float[] fArr = zzlxVar.zzb;
/* 29 */            for (int i = 0; i < this.zzc; i++) {
/* 45 */                if (Float.floatToIntBits(this.zzb[i]) != Float.floatToIntBits(fArr[i])) {
/* 20 */                    return false;
                        }
                    }
/* 1 */             return true;
                }

                @Override // java.util.AbstractList, java.util.List
                public final /* synthetic */ Object get(int i) {
/* 1 */             zzj(i);
/* 8 */             return Float.valueOf(this.zzb[i]);
                }

                @Override // com.google.android.gms.internal.measurement.zzkt, java.util.AbstractList, java.util.Collection, java.util.List
                public final int hashCode() {
/* 2 */             int iFloatToIntBits = 1;
/* 5 */             for (int i = 0; i < this.zzc; i++) {
/* 17 */                iFloatToIntBits = (iFloatToIntBits * 31) + Float.floatToIntBits(this.zzb[i]);
                    }
/* 21 */            return iFloatToIntBits;
                }

                @Override // java.util.AbstractList, java.util.List
                public final int indexOf(Object obj) {
/* 4 */             if (!(obj instanceof Float)) {
/* 3 */                 return -1;
                    }
/* 9 */             float fFloatValue = ((Float) obj).floatValue();
/* 13 */            int i = this.zzc;
/* 16 */            for (int i2 = 0; i2 < i; i2++) {
/* 24 */                if (this.zzb[i2] == fFloatValue) {
/* 26 */                    return i2;
                        }
                    }
/* 3 */             return -1;
                }

                @Override // com.google.android.gms.internal.measurement.zzkt, java.util.AbstractList, java.util.List
                public final /* bridge */ /* synthetic */ Object remove(int i) {
/* 1 */             zzcF();
/* 4 */             zzj(i);
/* 7 */             float[] fArr = this.zzb;
/* 9 */             float f = fArr[i];
/* 11 */            int i2 = this.zzc;
/* 15 */            if (i < i2 - 1) {
/* 22 */                System.arraycopy(fArr, i + 1, fArr, i, (i2 - i) - 1);
                    }
/* 29 */            this.zzc--;
/* 35 */            ((AbstractList) this).modCount++;
/* 37 */            return Float.valueOf(f);
                }

                @Override // java.util.AbstractList
                public final void removeRange(int i, int i2) {
/* 1 */             zzcF();
/* 4 */             if (i2 < i) {
/* 29 */                s80.m8425f("toIndex < fromIndex");
/* 32 */                return;
                    }
/* 6 */             float[] fArr = this.zzb;
/* 11 */            System.arraycopy(fArr, i2, fArr, i, this.zzc - i2);
/* 18 */            this.zzc -= i2 - i;
/* 24 */            ((AbstractList) this).modCount++;
                }

                @Override // com.google.android.gms.internal.measurement.zzkt, java.util.AbstractList, java.util.List
                public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
/* 3 */             float fFloatValue = ((Float) obj).floatValue();
/* 7 */             zzcF();
/* 10 */            zzj(i);
/* 13 */            float[] fArr = this.zzb;
/* 15 */            float f = fArr[i];
/* 17 */            fArr[i] = fFloatValue;
/* 19 */            return Float.valueOf(f);
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                public final int size() {
/* 1 */             return this.zzc;
                }

                @Override // com.google.android.gms.internal.measurement.zzmn, com.google.android.gms.internal.measurement.zzmg
                /* JADX INFO: renamed from: zzd */
                public final zzmk zzg(int i) {
/* 3 */             if (i >= this.zzc) {
/* 21 */                return new zzlx(i == 0 ? zza : Arrays.copyOf(this.zzb, i), this.zzc, true);
                    }
/* 25 */            f42.m3649e();
/* 28 */            return null;
                }

                public final float zze(int i) {
/* 1 */             zzj(i);
/* 6 */             return this.zzb[i];
                }

                public final void zzf(float f) {
/* 1 */             zzcF();
/* 4 */             int i = this.zzc;
/* 8 */             int length = this.zzb.length;
/* 9 */             if (i == length) {
/* 15 */                float[] fArr = new float[zzi(length)];
/* 22 */                System.arraycopy(this.zzb, 0, fArr, 0, this.zzc);
/* 25 */                this.zzb = fArr;
                    }
/* 27 */            float[] fArr2 = this.zzb;
/* 29 */            int i2 = this.zzc;
/* 33 */            this.zzc = i2 + 1;
/* 35 */            fArr2[i2] = f;
                }

                public final void zzh(int i) {
/* 3 */             int length = this.zzb.length;
/* 4 */             if (i <= length) {
/* 6 */                 return;
                    }
/* 7 */             if (length == 0) {
/* 33 */                this.zzb = new float[Math.max(i, 10)];
/* 35 */                return;
                    }
/* 9 */             while (length < i) {
/* 11 */                length = zzi(length);
                    }
/* 22 */            this.zzb = Arrays.copyOf(this.zzb, length);
                }

/* 8 */         private zzlx(float[] fArr, int i, boolean z) {
/* 9 */             super(z);
                    this.zzb = fArr;
                    this.zzc = i;
                }

                @Override // com.google.android.gms.internal.measurement.zzkt, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
/* 74 */        public final /* bridge */ /* synthetic */ boolean add(Object obj) {
/* 76 */            zzf(((Float) obj).floatValue());
                    return true;
                }
            }
