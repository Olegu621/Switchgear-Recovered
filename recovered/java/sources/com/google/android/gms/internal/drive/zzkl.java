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
/* 8 */     final class zzkl extends zziw<Integer> implements zzkp<Integer>, zzmc, RandomAccess {
                private static final zzkl zzsl;
                private int size;
                private int[] zzsm;

                static {
/* 6 */             zzkl zzklVar = new zzkl(new int[0], 0);
/* 9 */             zzsl = zzklVar;
/* 11 */            zzklVar.zzbp();
                }

                public zzkl() {
/* 6 */             this(new int[10], 0);
                }

                private final void zzo(int i, int i2) {
                    int i3;
/* 1 */             zzbq();
/* 4 */             if (i < 0 || i > (i3 = this.size)) {
/* 66 */                s80.m8425f(zzq(i));
/* 69 */                return;
                    }
/* 10 */            int[] iArr = this.zzsm;
/* 14 */            if (i3 < iArr.length) {
/* 19 */                System.arraycopy(iArr, i, iArr, i + 1, i3 - i);
                    } else {
/* 29 */                int[] iArr2 = new int[fm0.m3797w(i3, 3, 2, 1)];
/* 32 */                System.arraycopy(iArr, 0, iArr2, 0, i);
/* 42 */                System.arraycopy(this.zzsm, i, iArr2, i + 1, this.size - i);
/* 45 */                this.zzsm = iArr2;
                    }
/* 49 */            this.zzsm[i] = i2;
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
/* 7 */             zzo(i, ((Integer) obj).intValue());
                }

                @Override // com.google.android.gms.internal.drive.zziw, java.util.AbstractCollection, java.util.Collection, java.util.List
                public final boolean addAll(Collection<? extends Integer> collection) {
/* 1 */             zzbq();
/* 4 */             zzkm.checkNotNull(collection);
/* 9 */             if (!(collection instanceof zzkl)) {
/* 11 */                return super.addAll(collection);
                    }
/* 16 */            zzkl zzklVar = (zzkl) collection;
/* 18 */            int i = zzklVar.size;
/* 21 */            if (i == 0) {
/* 20 */                return false;
                    }
/* 24 */            int i2 = this.size;
/* 30 */            if (AbstractC0208c9.API_PRIORITY_OTHER - i2 < i) {
/* 69 */                throw new OutOfMemoryError();
                    }
/* 32 */            int i3 = i2 + i;
/* 33 */            int[] iArr = this.zzsm;
/* 36 */            if (i3 > iArr.length) {
/* 42 */                this.zzsm = Arrays.copyOf(iArr, i3);
                    }
/* 52 */            System.arraycopy(zzklVar.zzsm, 0, this.zzsm, this.size, zzklVar.size);
/* 55 */            this.size = i3;
/* 61 */            ((AbstractList) this).modCount++;
/* 59 */            return true;
                }

                @Override // com.google.android.gms.internal.drive.zziw, java.util.AbstractList, java.util.Collection, java.util.List
                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 7 */             if (!(obj instanceof zzkl)) {
/* 9 */                 return super.equals(obj);
                    }
/* 14 */            zzkl zzklVar = (zzkl) obj;
/* 21 */            if (this.size != zzklVar.size) {
/* 20 */                return false;
                    }
/* 24 */            int[] iArr = zzklVar.zzsm;
/* 29 */            for (int i = 0; i < this.size; i++) {
/* 37 */                if (this.zzsm[i] != iArr[i]) {
/* 20 */                    return false;
                        }
                    }
/* 1 */             return true;
                }

                @Override // java.util.AbstractList, java.util.List
                public final /* synthetic */ Object get(int i) {
/* 5 */             return Integer.valueOf(getInt(i));
                }

                public final int getInt(int i) {
/* 1 */             zzp(i);
/* 6 */             return this.zzsm[i];
                }

                @Override // com.google.android.gms.internal.drive.zziw, java.util.AbstractList, java.util.Collection, java.util.List
                public final int hashCode() {
/* 1 */             int i = 1;
/* 5 */             for (int i2 = 0; i2 < this.size; i2++) {
/* 13 */                i = (i * 31) + this.zzsm[i2];
                    }
/* 17 */            return i;
                }

                @Override // com.google.android.gms.internal.drive.zziw, java.util.AbstractCollection, java.util.Collection, java.util.List
                public final boolean remove(Object obj) {
/* 1 */             zzbq();
/* 8 */             for (int i = 0; i < this.size; i++) {
/* 22 */                if (obj.equals(Integer.valueOf(this.zzsm[i]))) {
/* 24 */                    int[] iArr = this.zzsm;
/* 33 */                    System.arraycopy(iArr, i + 1, iArr, i, (this.size - i) - 1);
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
/* 6 */             int[] iArr = this.zzsm;
/* 11 */            System.arraycopy(iArr, i2, iArr, i, this.size - i2);
/* 18 */            this.size -= i2 - i;
/* 24 */            ((AbstractList) this).modCount++;
                }

                @Override // com.google.android.gms.internal.drive.zziw, java.util.AbstractList, java.util.List
                public final /* synthetic */ Object set(int i, Object obj) {
/* 3 */             int iIntValue = ((Integer) obj).intValue();
/* 7 */             zzbq();
/* 10 */            zzp(i);
/* 13 */            int[] iArr = this.zzsm;
/* 15 */            int i2 = iArr[i];
/* 17 */            iArr[i] = iIntValue;
/* 19 */            return Integer.valueOf(i2);
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                public final int size() {
/* 1 */             return this.size;
                }

                public final void zzam(int i) {
/* 3 */             zzo(this.size, i);
                }

                @Override // com.google.android.gms.internal.drive.zzkp
                public final /* synthetic */ zzkp<Integer> zzr(int i) {
/* 3 */             if (i >= this.size) {
/* 15 */                return new zzkl(Arrays.copyOf(this.zzsm, i), this.size);
                    }
/* 19 */            f42.m3649e();
/* 22 */            return null;
                }

/* 9 */         private zzkl(int[] iArr, int i) {
/* 11 */            this.zzsm = iArr;
/* 12 */            this.size = i;
                }

                @Override // com.google.android.gms.internal.drive.zziw, java.util.AbstractList, java.util.List
/* 50 */        public final /* synthetic */ Object remove(int i) {
/* 51 */            zzbq();
/* 52 */            zzp(i);
/* 53 */            int[] iArr = this.zzsm;
                    int i2 = iArr[i];
/* 54 */            int i3 = this.size;
                    if (i < i3 - 1) {
/* 55 */                System.arraycopy(iArr, i + 1, iArr, i, (i3 - i) - 1);
                    }
/* 56 */            this.size--;
/* 57 */            ((AbstractList) this).modCount++;
/* 58 */            return Integer.valueOf(i2);
                }
            }
