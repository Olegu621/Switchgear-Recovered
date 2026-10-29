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
/* 8 */     final class zzle extends zziw<Long> implements zzkp<Long>, zzmc, RandomAccess {
                private static final zzle zztp;
                private int size;
                private long[] zztq;

                static {
/* 6 */             zzle zzleVar = new zzle(new long[0], 0);
/* 9 */             zztp = zzleVar;
/* 11 */            zzleVar.zzbp();
                }

                public zzle() {
/* 6 */             this(new long[10], 0);
                }

                private final void zzk(int i, long j) {
                    int i2;
/* 1 */             zzbq();
/* 4 */             if (i < 0 || i > (i2 = this.size)) {
/* 66 */                s80.m8425f(zzq(i));
/* 69 */                return;
                    }
/* 10 */            long[] jArr = this.zztq;
/* 14 */            if (i2 < jArr.length) {
/* 19 */                System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
                    } else {
/* 29 */                long[] jArr2 = new long[fm0.m3797w(i2, 3, 2, 1)];
/* 32 */                System.arraycopy(jArr, 0, jArr2, 0, i);
/* 42 */                System.arraycopy(this.zztq, i, jArr2, i + 1, this.size - i);
/* 45 */                this.zztq = jArr2;
                    }
/* 49 */            this.zztq[i] = j;
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
/* 7 */             zzk(i, ((Long) obj).longValue());
                }

                @Override // com.google.android.gms.internal.drive.zziw, java.util.AbstractCollection, java.util.Collection, java.util.List
                public final boolean addAll(Collection<? extends Long> collection) {
/* 1 */             zzbq();
/* 4 */             zzkm.checkNotNull(collection);
/* 9 */             if (!(collection instanceof zzle)) {
/* 11 */                return super.addAll(collection);
                    }
/* 16 */            zzle zzleVar = (zzle) collection;
/* 18 */            int i = zzleVar.size;
/* 21 */            if (i == 0) {
/* 20 */                return false;
                    }
/* 24 */            int i2 = this.size;
/* 30 */            if (AbstractC0208c9.API_PRIORITY_OTHER - i2 < i) {
/* 69 */                throw new OutOfMemoryError();
                    }
/* 32 */            int i3 = i2 + i;
/* 33 */            long[] jArr = this.zztq;
/* 36 */            if (i3 > jArr.length) {
/* 42 */                this.zztq = Arrays.copyOf(jArr, i3);
                    }
/* 52 */            System.arraycopy(zzleVar.zztq, 0, this.zztq, this.size, zzleVar.size);
/* 55 */            this.size = i3;
/* 61 */            ((AbstractList) this).modCount++;
/* 59 */            return true;
                }

                @Override // com.google.android.gms.internal.drive.zziw, java.util.AbstractList, java.util.Collection, java.util.List
                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 7 */             if (!(obj instanceof zzle)) {
/* 9 */                 return super.equals(obj);
                    }
/* 14 */            zzle zzleVar = (zzle) obj;
/* 21 */            if (this.size != zzleVar.size) {
/* 20 */                return false;
                    }
/* 24 */            long[] jArr = zzleVar.zztq;
/* 29 */            for (int i = 0; i < this.size; i++) {
/* 39 */                if (this.zztq[i] != jArr[i]) {
/* 20 */                    return false;
                        }
                    }
/* 1 */             return true;
                }

                @Override // java.util.AbstractList, java.util.List
                public final /* synthetic */ Object get(int i) {
/* 5 */             return Long.valueOf(getLong(i));
                }

                public final long getLong(int i) {
/* 1 */             zzp(i);
/* 6 */             return this.zztq[i];
                }

                @Override // com.google.android.gms.internal.drive.zziw, java.util.AbstractList, java.util.Collection, java.util.List
                public final int hashCode() {
/* 1 */             int iZzu = 1;
/* 5 */             for (int i = 0; i < this.size; i++) {
/* 17 */                iZzu = (iZzu * 31) + zzkm.zzu(this.zztq[i]);
                    }
/* 21 */            return iZzu;
                }

                @Override // com.google.android.gms.internal.drive.zziw, java.util.AbstractCollection, java.util.Collection, java.util.List
                public final boolean remove(Object obj) {
/* 1 */             zzbq();
/* 8 */             for (int i = 0; i < this.size; i++) {
/* 22 */                if (obj.equals(Long.valueOf(this.zztq[i]))) {
/* 24 */                    long[] jArr = this.zztq;
/* 33 */                    System.arraycopy(jArr, i + 1, jArr, i, (this.size - i) - 1);
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
/* 6 */             long[] jArr = this.zztq;
/* 11 */            System.arraycopy(jArr, i2, jArr, i, this.size - i2);
/* 18 */            this.size -= i2 - i;
/* 24 */            ((AbstractList) this).modCount++;
                }

                @Override // com.google.android.gms.internal.drive.zziw, java.util.AbstractList, java.util.List
                public final /* synthetic */ Object set(int i, Object obj) {
/* 3 */             long jLongValue = ((Long) obj).longValue();
/* 7 */             zzbq();
/* 10 */            zzp(i);
/* 13 */            long[] jArr = this.zztq;
/* 15 */            long j = jArr[i];
/* 17 */            jArr[i] = jLongValue;
/* 19 */            return Long.valueOf(j);
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                public final int size() {
/* 1 */             return this.size;
                }

                @Override // com.google.android.gms.internal.drive.zzkp
                public final /* synthetic */ zzkp<Long> zzr(int i) {
/* 3 */             if (i >= this.size) {
/* 15 */                return new zzle(Arrays.copyOf(this.zztq, i), this.size);
                    }
/* 19 */            f42.m3649e();
/* 22 */            return null;
                }

                public final void zzv(long j) {
/* 3 */             zzk(this.size, j);
                }

/* 9 */         private zzle(long[] jArr, int i) {
/* 11 */            this.zztq = jArr;
/* 12 */            this.size = i;
                }

                @Override // com.google.android.gms.internal.drive.zziw, java.util.AbstractList, java.util.List
/* 50 */        public final /* synthetic */ Object remove(int i) {
/* 51 */            zzbq();
/* 52 */            zzp(i);
/* 53 */            long[] jArr = this.zztq;
                    long j = jArr[i];
/* 54 */            int i2 = this.size;
                    if (i < i2 - 1) {
/* 55 */                System.arraycopy(jArr, i + 1, jArr, i, (i2 - i) - 1);
                    }
/* 56 */            this.size--;
/* 57 */            ((AbstractList) this).modCount++;
/* 58 */            return Long.valueOf(j);
                }
            }
