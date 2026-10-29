            package com.google.android.gms.internal.drive;

            import java.util.AbstractList;
            import java.util.Arrays;
            import java.util.Collection;
            import java.util.RandomAccess;
            import p000.AbstractC0208c9;
            import p000.f42;
            import p000.fm0;
            import p000.s80;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 8 */     final class zzkh extends zziw<Float> implements zzkp<Float>, zzmc, RandomAccess {
                private static final zzkh zzrm;
                private int size;
                private float[] zzrn;

                static {
/* 6 */             zzkh zzkhVar = new zzkh(new float[0], 0);
/* 9 */             zzrm = zzkhVar;
/* 11 */            zzkhVar.zzbp();
                }

                public zzkh() {
/* 6 */             this(new float[10], 0);
                }

                private final void zzc(int i, float f) {
                    int i2;
/* 1 */             zzbq();
/* 4 */             if (i < 0 || i > (i2 = this.size)) {
/* 66 */                s80.m8425f(zzq(i));
/* 69 */                return;
                    }
/* 10 */            float[] fArr = this.zzrn;
/* 14 */            if (i2 < fArr.length) {
/* 19 */                System.arraycopy(fArr, i, fArr, i + 1, i2 - i);
                    } else {
/* 29 */                float[] fArr2 = new float[fm0.m3797w(i2, 3, 2, 1)];
/* 32 */                System.arraycopy(fArr, 0, fArr2, 0, i);
/* 42 */                System.arraycopy(this.zzrn, i, fArr2, i + 1, this.size - i);
/* 45 */                this.zzrn = fArr2;
                    }
/* 49 */            this.zzrn[i] = f;
/* 54 */            this.size++;
/* 59 */            ((AbstractList) this).modCount++;
                }

                private final void zzp(int i) {
/* 1 */             if (i < 0 || i >= this.size) {
/* 12 */                s80.m8425f(zzq(i));
                    }
                }

                private final String zzq(int i) {
/* 1 */             int i2 = this.size;
/* 7 */             StringBuilder sb = new StringBuilder(35);
/* 12 */            sb.append("Index:");
/* 15 */            sb.append(i);
/* 20 */            sb.append(", Size:");
/* 23 */            sb.append(i2);
/* 26 */            return sb.toString();
                }

                @Override // com.google.android.gms.internal.drive.zziw, java.util.AbstractList, java.util.List
                public final /* synthetic */ void add(int i, Object obj) {
/* 7 */             zzc(i, ((Float) obj).floatValue());
                }

                @Override // com.google.android.gms.internal.drive.zziw, java.util.AbstractCollection, java.util.Collection, java.util.List
                public final boolean addAll(Collection<? extends Float> collection) {
/* 1 */             zzbq();
/* 4 */             zzkm.checkNotNull(collection);
/* 9 */             if (!(collection instanceof zzkh)) {
/* 11 */                return super.addAll(collection);
                    }
/* 16 */            zzkh zzkhVar = (zzkh) collection;
/* 18 */            int i = zzkhVar.size;
/* 21 */            if (i == 0) {
/* 20 */                return false;
                    }
/* 24 */            int i2 = this.size;
/* 30 */            if (AbstractC0208c9.API_PRIORITY_OTHER - i2 < i) {
/* 69 */                throw new OutOfMemoryError();
                    }
/* 32 */            int i3 = i2 + i;
/* 33 */            float[] fArr = this.zzrn;
/* 36 */            if (i3 > fArr.length) {
/* 42 */                this.zzrn = Arrays.copyOf(fArr, i3);
                    }
/* 52 */            System.arraycopy(zzkhVar.zzrn, 0, this.zzrn, this.size, zzkhVar.size);
/* 55 */            this.size = i3;
/* 61 */            ((AbstractList) this).modCount++;
/* 59 */            return true;
                }

                @Override // com.google.android.gms.internal.drive.zziw, java.util.AbstractList, java.util.Collection, java.util.List
                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 7 */             if (!(obj instanceof zzkh)) {
/* 9 */                 return super.equals(obj);
                    }
/* 14 */            zzkh zzkhVar = (zzkh) obj;
/* 21 */            if (this.size != zzkhVar.size) {
/* 20 */                return false;
                    }
/* 24 */            float[] fArr = zzkhVar.zzrn;
/* 29 */            for (int i = 0; i < this.size; i++) {
/* 45 */                if (Float.floatToIntBits(this.zzrn[i]) != Float.floatToIntBits(fArr[i])) {
/* 20 */                    return false;
                        }
                    }
/* 1 */             return true;
                }

                @Override // java.util.AbstractList, java.util.List
                public final /* synthetic */ Object get(int i) {
/* 1 */             zzp(i);
/* 8 */             return Float.valueOf(this.zzrn[i]);
                }

                @Override // com.google.android.gms.internal.drive.zziw, java.util.AbstractList, java.util.Collection, java.util.List
                public final int hashCode() {
/* 1 */             int iFloatToIntBits = 1;
/* 5 */             for (int i = 0; i < this.size; i++) {
/* 17 */                iFloatToIntBits = (iFloatToIntBits * 31) + Float.floatToIntBits(this.zzrn[i]);
                    }
/* 21 */            return iFloatToIntBits;
                }

                @Override // com.google.android.gms.internal.drive.zziw, java.util.AbstractCollection, java.util.Collection, java.util.List
                public final boolean remove(Object obj) {
/* 1 */             zzbq();
/* 8 */             for (int i = 0; i < this.size; i++) {
/* 22 */                if (obj.equals(Float.valueOf(this.zzrn[i]))) {
/* 24 */                    float[] fArr = this.zzrn;
/* 33 */                    System.arraycopy(fArr, i + 1, fArr, i, (this.size - i) - 1);
/* 39 */                    this.size--;
/* 44 */                    ((AbstractList) this).modCount++;
/* 31 */                    return true;
                        }
                    }
/* 4 */             return false;
                }

                @Override // java.util.AbstractList
                public final void removeRange(int i, int i2) {
/* 1 */             zzbq();
/* 4 */             if (i2 < i) {
/* 29 */                s80.m8425f("toIndex < fromIndex");
/* 32 */                return;
                    }
/* 6 */             float[] fArr = this.zzrn;
/* 11 */            System.arraycopy(fArr, i2, fArr, i, this.size - i2);
/* 18 */            this.size -= i2 - i;
/* 24 */            ((AbstractList) this).modCount++;
                }

                @Override // com.google.android.gms.internal.drive.zziw, java.util.AbstractList, java.util.List
                public final /* synthetic */ Object set(int i, Object obj) {
/* 3 */             float fFloatValue = ((Float) obj).floatValue();
/* 7 */             zzbq();
/* 10 */            zzp(i);
/* 13 */            float[] fArr = this.zzrn;
/* 15 */            float f = fArr[i];
/* 17 */            fArr[i] = fFloatValue;
/* 19 */            return Float.valueOf(f);
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                public final int size() {
/* 1 */             return this.size;
                }

                @Override // com.google.android.gms.internal.drive.zzkp
                public final /* synthetic */ zzkp<Float> zzr(int i) {
/* 3 */             if (i >= this.size) {
/* 15 */                return new zzkh(Arrays.copyOf(this.zzrn, i), this.size);
                    }
/* 19 */            f42.m3649e();
/* 22 */            return null;
                }

/* 9 */         private zzkh(float[] fArr, int i) {
/* 11 */            this.zzrn = fArr;
/* 12 */            this.size = i;
                }

                @Override // com.google.android.gms.internal.drive.zziw, java.util.AbstractList, java.util.List
/* 50 */        public final /* synthetic */ Object remove(int i) {
/* 51 */            zzbq();
/* 52 */            zzp(i);
/* 53 */            float[] fArr = this.zzrn;
                    float f = fArr[i];
/* 54 */            int i2 = this.size;
                    if (i < i2 - 1) {
/* 55 */                System.arraycopy(fArr, i + 1, fArr, i, (i2 - i) - 1);
                    }
/* 56 */            this.size--;
/* 57 */            ((AbstractList) this).modCount++;
/* 58 */            return Float.valueOf(f);
                }

/* 69 */        public final void zzc(float f) {
/* 70 */            zzc(this.size, f);
                }
            }
