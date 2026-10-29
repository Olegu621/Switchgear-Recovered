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
/* 8 */     final class zzju extends zziw<Double> implements zzkp<Double>, zzmc, RandomAccess {
                private static final zzju zzoi;
                private int size;
                private double[] zzoj;

                static {
/* 6 */             zzju zzjuVar = new zzju(new double[0], 0);
/* 9 */             zzoi = zzjuVar;
/* 11 */            zzjuVar.zzbp();
                }

                public zzju() {
/* 6 */             this(new double[10], 0);
                }

                private final void zzc(int i, double d) {
                    int i2;
/* 1 */             zzbq();
/* 4 */             if (i < 0 || i > (i2 = this.size)) {
/* 66 */                s80.m8425f(zzq(i));
/* 69 */                return;
                    }
/* 10 */            double[] dArr = this.zzoj;
/* 14 */            if (i2 < dArr.length) {
/* 19 */                System.arraycopy(dArr, i, dArr, i + 1, i2 - i);
                    } else {
/* 29 */                double[] dArr2 = new double[fm0.m3797w(i2, 3, 2, 1)];
/* 32 */                System.arraycopy(dArr, 0, dArr2, 0, i);
/* 42 */                System.arraycopy(this.zzoj, i, dArr2, i + 1, this.size - i);
/* 45 */                this.zzoj = dArr2;
                    }
/* 49 */            this.zzoj[i] = d;
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
/* 7 */             zzc(i, ((Double) obj).doubleValue());
                }

                @Override // com.google.android.gms.internal.drive.zziw, java.util.AbstractCollection, java.util.Collection, java.util.List
                public final boolean addAll(Collection<? extends Double> collection) {
/* 1 */             zzbq();
/* 4 */             zzkm.checkNotNull(collection);
/* 9 */             if (!(collection instanceof zzju)) {
/* 11 */                return super.addAll(collection);
                    }
/* 16 */            zzju zzjuVar = (zzju) collection;
/* 18 */            int i = zzjuVar.size;
/* 21 */            if (i == 0) {
/* 20 */                return false;
                    }
/* 24 */            int i2 = this.size;
/* 30 */            if (AbstractC0208c9.API_PRIORITY_OTHER - i2 < i) {
/* 69 */                throw new OutOfMemoryError();
                    }
/* 32 */            int i3 = i2 + i;
/* 33 */            double[] dArr = this.zzoj;
/* 36 */            if (i3 > dArr.length) {
/* 42 */                this.zzoj = Arrays.copyOf(dArr, i3);
                    }
/* 52 */            System.arraycopy(zzjuVar.zzoj, 0, this.zzoj, this.size, zzjuVar.size);
/* 55 */            this.size = i3;
/* 61 */            ((AbstractList) this).modCount++;
/* 59 */            return true;
                }

                @Override // com.google.android.gms.internal.drive.zziw, java.util.AbstractList, java.util.Collection, java.util.List
                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 7 */             if (!(obj instanceof zzju)) {
/* 9 */                 return super.equals(obj);
                    }
/* 14 */            zzju zzjuVar = (zzju) obj;
/* 21 */            if (this.size != zzjuVar.size) {
/* 20 */                return false;
                    }
/* 24 */            double[] dArr = zzjuVar.zzoj;
/* 29 */            for (int i = 0; i < this.size; i++) {
/* 47 */                if (Double.doubleToLongBits(this.zzoj[i]) != Double.doubleToLongBits(dArr[i])) {
/* 20 */                    return false;
                        }
                    }
/* 1 */             return true;
                }

                @Override // java.util.AbstractList, java.util.List
                public final /* synthetic */ Object get(int i) {
/* 1 */             zzp(i);
/* 8 */             return Double.valueOf(this.zzoj[i]);
                }

                @Override // com.google.android.gms.internal.drive.zziw, java.util.AbstractList, java.util.Collection, java.util.List
                public final int hashCode() {
/* 1 */             int iZzu = 1;
/* 5 */             for (int i = 0; i < this.size; i++) {
/* 21 */                iZzu = (iZzu * 31) + zzkm.zzu(Double.doubleToLongBits(this.zzoj[i]));
                    }
/* 25 */            return iZzu;
                }

                @Override // com.google.android.gms.internal.drive.zziw, java.util.AbstractCollection, java.util.Collection, java.util.List
                public final boolean remove(Object obj) {
/* 1 */             zzbq();
/* 8 */             for (int i = 0; i < this.size; i++) {
/* 22 */                if (obj.equals(Double.valueOf(this.zzoj[i]))) {
/* 24 */                    double[] dArr = this.zzoj;
/* 33 */                    System.arraycopy(dArr, i + 1, dArr, i, (this.size - i) - 1);
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
/* 6 */             double[] dArr = this.zzoj;
/* 11 */            System.arraycopy(dArr, i2, dArr, i, this.size - i2);
/* 18 */            this.size -= i2 - i;
/* 24 */            ((AbstractList) this).modCount++;
                }

                @Override // com.google.android.gms.internal.drive.zziw, java.util.AbstractList, java.util.List
                public final /* synthetic */ Object set(int i, Object obj) {
/* 3 */             double dDoubleValue = ((Double) obj).doubleValue();
/* 7 */             zzbq();
/* 10 */            zzp(i);
/* 13 */            double[] dArr = this.zzoj;
/* 15 */            double d = dArr[i];
/* 17 */            dArr[i] = dDoubleValue;
/* 19 */            return Double.valueOf(d);
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                public final int size() {
/* 1 */             return this.size;
                }

                @Override // com.google.android.gms.internal.drive.zzkp
                public final /* synthetic */ zzkp<Double> zzr(int i) {
/* 3 */             if (i >= this.size) {
/* 15 */                return new zzju(Arrays.copyOf(this.zzoj, i), this.size);
                    }
/* 19 */            f42.m3649e();
/* 22 */            return null;
                }

/* 9 */         private zzju(double[] dArr, int i) {
/* 11 */            this.zzoj = dArr;
/* 12 */            this.size = i;
                }

                @Override // com.google.android.gms.internal.drive.zziw, java.util.AbstractList, java.util.List
/* 50 */        public final /* synthetic */ Object remove(int i) {
/* 51 */            zzbq();
/* 52 */            zzp(i);
/* 53 */            double[] dArr = this.zzoj;
                    double d = dArr[i];
/* 54 */            int i2 = this.size;
                    if (i < i2 - 1) {
/* 55 */                System.arraycopy(dArr, i + 1, dArr, i, (i2 - i) - 1);
                    }
/* 56 */            this.size--;
/* 57 */            ((AbstractList) this).modCount++;
/* 58 */            return Double.valueOf(d);
                }

/* 69 */        public final void zzc(double d) {
/* 70 */            zzc(this.size, d);
                }
            }
