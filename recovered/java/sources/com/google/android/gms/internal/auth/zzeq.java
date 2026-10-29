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
/* 8 */     final class zzeq extends zzdq implements RandomAccess, zzey, zzgd {
                private static final zzeq zza;
                private float[] zzb;
                private int zzc;

                static {
/* 6 */             zzeq zzeqVar = new zzeq(new float[0], 0);
/* 9 */             zza = zzeqVar;
/* 11 */            zzeqVar.zzb();
                }

                public zzeq() {
/* 6 */             this(new float[10], 0);
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
/* 3 */             float fFloatValue = ((Float) obj).floatValue();
/* 7 */             zza();
/* 10 */            if (i < 0 || i > (i2 = this.zzc)) {
/* 72 */                s80.m8425f(zzf(i));
/* 75 */                return;
                    }
/* 16 */            float[] fArr = this.zzb;
/* 20 */            if (i2 < fArr.length) {
/* 25 */                System.arraycopy(fArr, i, fArr, i + 1, i2 - i);
                    } else {
/* 35 */                float[] fArr2 = new float[fm0.m3797w(i2, 3, 2, 1)];
/* 38 */                System.arraycopy(fArr, 0, fArr2, 0, i);
/* 48 */                System.arraycopy(this.zzb, i, fArr2, i + 1, this.zzc - i);
/* 51 */                this.zzb = fArr2;
                    }
/* 55 */            this.zzb[i] = fFloatValue;
/* 60 */            this.zzc++;
/* 65 */            ((AbstractList) this).modCount++;
                }

                @Override // com.google.android.gms.internal.auth.zzdq, java.util.AbstractCollection, java.util.Collection, java.util.List
                public final boolean addAll(Collection collection) {
/* 1 */             zza();
/* 4 */             zzez.zze(collection);
/* 9 */             if (!(collection instanceof zzeq)) {
/* 11 */                return super.addAll(collection);
                    }
/* 16 */            zzeq zzeqVar = (zzeq) collection;
/* 18 */            int i = zzeqVar.zzc;
/* 21 */            if (i == 0) {
/* 20 */                return false;
                    }
/* 24 */            int i2 = this.zzc;
/* 30 */            if (AbstractC0208c9.API_PRIORITY_OTHER - i2 < i) {
/* 69 */                throw new OutOfMemoryError();
                    }
/* 32 */            int i3 = i2 + i;
/* 33 */            float[] fArr = this.zzb;
/* 36 */            if (i3 > fArr.length) {
/* 42 */                this.zzb = Arrays.copyOf(fArr, i3);
                    }
/* 52 */            System.arraycopy(zzeqVar.zzb, 0, this.zzb, this.zzc, zzeqVar.zzc);
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
/* 7 */             if (!(obj instanceof zzeq)) {
/* 9 */                 return super.equals(obj);
                    }
/* 14 */            zzeq zzeqVar = (zzeq) obj;
/* 21 */            if (this.zzc != zzeqVar.zzc) {
/* 20 */                return false;
                    }
/* 24 */            float[] fArr = zzeqVar.zzb;
/* 29 */            for (int i = 0; i < this.zzc; i++) {
/* 45 */                if (Float.floatToIntBits(this.zzb[i]) != Float.floatToIntBits(fArr[i])) {
/* 20 */                    return false;
                        }
                    }
/* 1 */             return true;
                }

                @Override // java.util.AbstractList, java.util.List
                public final /* synthetic */ Object get(int i) {
/* 1 */             zzg(i);
/* 8 */             return Float.valueOf(this.zzb[i]);
                }

                @Override // com.google.android.gms.internal.auth.zzdq, java.util.AbstractList, java.util.Collection, java.util.List
                public final int hashCode() {
/* 1 */             int iFloatToIntBits = 1;
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

                @Override // com.google.android.gms.internal.auth.zzdq, java.util.AbstractList, java.util.List
                public final /* bridge */ /* synthetic */ Object remove(int i) {
/* 1 */             zza();
/* 4 */             zzg(i);
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
/* 1 */             zza();
/* 4 */             if (i2 < i) {
/* 29 */                s80.m8425f("toIndex < fromIndex");
/* 32 */                return;
                    }
/* 6 */             float[] fArr = this.zzb;
/* 11 */            System.arraycopy(fArr, i2, fArr, i, this.zzc - i2);
/* 18 */            this.zzc -= i2 - i;
/* 24 */            ((AbstractList) this).modCount++;
                }

                @Override // com.google.android.gms.internal.auth.zzdq, java.util.AbstractList, java.util.List
                public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
/* 3 */             float fFloatValue = ((Float) obj).floatValue();
/* 7 */             zza();
/* 10 */            zzg(i);
/* 13 */            float[] fArr = this.zzb;
/* 15 */            float f = fArr[i];
/* 17 */            fArr[i] = fFloatValue;
/* 19 */            return Float.valueOf(f);
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                public final int size() {
/* 1 */             return this.zzc;
                }

                @Override // com.google.android.gms.internal.auth.zzey
                public final /* bridge */ /* synthetic */ zzey zzd(int i) {
/* 3 */             if (i >= this.zzc) {
/* 15 */                return new zzeq(Arrays.copyOf(this.zzb, i), this.zzc);
                    }
/* 19 */            f42.m3649e();
/* 22 */            return null;
                }

                public final void zze(float f) {
/* 1 */             zza();
/* 4 */             int i = this.zzc;
/* 6 */             float[] fArr = this.zzb;
/* 9 */             if (i == fArr.length) {
/* 18 */                float[] fArr2 = new float[fm0.m3797w(i, 3, 2, 1)];
/* 21 */                System.arraycopy(fArr, 0, fArr2, 0, i);
/* 24 */                this.zzb = fArr2;
                    }
/* 26 */            float[] fArr3 = this.zzb;
/* 28 */            int i2 = this.zzc;
/* 32 */            this.zzc = i2 + 1;
/* 34 */            fArr3[i2] = f;
                }

/* 9 */         private zzeq(float[] fArr, int i) {
                    this.zzb = fArr;
                    this.zzc = i;
                }

                @Override // com.google.android.gms.internal.auth.zzdq, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
/* 75 */        public final /* bridge */ /* synthetic */ boolean add(Object obj) {
/* 77 */            zze(((Float) obj).floatValue());
                    return true;
                }
            }
