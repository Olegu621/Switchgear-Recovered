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
/* 8 */     final class zzja extends zziw<Boolean> implements zzkp<Boolean>, zzmc, RandomAccess {
                private static final zzja zzno;
                private int size;
                private boolean[] zznp;

                static {
/* 6 */             zzja zzjaVar = new zzja(new boolean[0], 0);
/* 9 */             zzno = zzjaVar;
/* 11 */            zzjaVar.zzbp();
                }

                public zzja() {
/* 6 */             this(new boolean[10], 0);
                }

                private final void zza(int i, boolean z) {
                    int i2;
/* 1 */             zzbq();
/* 4 */             if (i < 0 || i > (i2 = this.size)) {
/* 66 */                s80.m8425f(zzq(i));
/* 69 */                return;
                    }
/* 10 */            boolean[] zArr = this.zznp;
/* 14 */            if (i2 < zArr.length) {
/* 19 */                System.arraycopy(zArr, i, zArr, i + 1, i2 - i);
                    } else {
/* 29 */                boolean[] zArr2 = new boolean[fm0.m3797w(i2, 3, 2, 1)];
/* 32 */                System.arraycopy(zArr, 0, zArr2, 0, i);
/* 42 */                System.arraycopy(this.zznp, i, zArr2, i + 1, this.size - i);
/* 45 */                this.zznp = zArr2;
                    }
/* 49 */            this.zznp[i] = z;
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
/* 7 */             zza(i, ((Boolean) obj).booleanValue());
                }

                @Override // com.google.android.gms.internal.drive.zziw, java.util.AbstractCollection, java.util.Collection, java.util.List
                public final boolean addAll(Collection<? extends Boolean> collection) {
/* 1 */             zzbq();
/* 4 */             zzkm.checkNotNull(collection);
/* 9 */             if (!(collection instanceof zzja)) {
/* 11 */                return super.addAll(collection);
                    }
/* 16 */            zzja zzjaVar = (zzja) collection;
/* 18 */            int i = zzjaVar.size;
/* 21 */            if (i == 0) {
/* 20 */                return false;
                    }
/* 24 */            int i2 = this.size;
/* 30 */            if (AbstractC0208c9.API_PRIORITY_OTHER - i2 < i) {
/* 69 */                throw new OutOfMemoryError();
                    }
/* 32 */            int i3 = i2 + i;
/* 33 */            boolean[] zArr = this.zznp;
/* 36 */            if (i3 > zArr.length) {
/* 42 */                this.zznp = Arrays.copyOf(zArr, i3);
                    }
/* 52 */            System.arraycopy(zzjaVar.zznp, 0, this.zznp, this.size, zzjaVar.size);
/* 55 */            this.size = i3;
/* 61 */            ((AbstractList) this).modCount++;
/* 59 */            return true;
                }

                public final void addBoolean(boolean z) {
/* 3 */             zza(this.size, z);
                }

                @Override // com.google.android.gms.internal.drive.zziw, java.util.AbstractList, java.util.Collection, java.util.List
                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 7 */             if (!(obj instanceof zzja)) {
/* 9 */                 return super.equals(obj);
                    }
/* 14 */            zzja zzjaVar = (zzja) obj;
/* 21 */            if (this.size != zzjaVar.size) {
/* 20 */                return false;
                    }
/* 24 */            boolean[] zArr = zzjaVar.zznp;
/* 29 */            for (int i = 0; i < this.size; i++) {
/* 37 */                if (this.zznp[i] != zArr[i]) {
/* 20 */                    return false;
                        }
                    }
/* 1 */             return true;
                }

                @Override // java.util.AbstractList, java.util.List
                public final /* synthetic */ Object get(int i) {
/* 1 */             zzp(i);
/* 8 */             return Boolean.valueOf(this.zznp[i]);
                }

                @Override // com.google.android.gms.internal.drive.zziw, java.util.AbstractList, java.util.Collection, java.util.List
                public final int hashCode() {
/* 1 */             int iZze = 1;
/* 5 */             for (int i = 0; i < this.size; i++) {
/* 17 */                iZze = (iZze * 31) + zzkm.zze(this.zznp[i]);
                    }
/* 21 */            return iZze;
                }

                @Override // com.google.android.gms.internal.drive.zziw, java.util.AbstractCollection, java.util.Collection, java.util.List
                public final boolean remove(Object obj) {
/* 1 */             zzbq();
/* 8 */             for (int i = 0; i < this.size; i++) {
/* 22 */                if (obj.equals(Boolean.valueOf(this.zznp[i]))) {
/* 24 */                    boolean[] zArr = this.zznp;
/* 33 */                    System.arraycopy(zArr, i + 1, zArr, i, (this.size - i) - 1);
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
/* 6 */             boolean[] zArr = this.zznp;
/* 11 */            System.arraycopy(zArr, i2, zArr, i, this.size - i2);
/* 18 */            this.size -= i2 - i;
/* 24 */            ((AbstractList) this).modCount++;
                }

                @Override // com.google.android.gms.internal.drive.zziw, java.util.AbstractList, java.util.List
                public final /* synthetic */ Object set(int i, Object obj) {
/* 3 */             boolean zBooleanValue = ((Boolean) obj).booleanValue();
/* 7 */             zzbq();
/* 10 */            zzp(i);
/* 13 */            boolean[] zArr = this.zznp;
/* 15 */            boolean z = zArr[i];
/* 17 */            zArr[i] = zBooleanValue;
/* 19 */            return Boolean.valueOf(z);
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                public final int size() {
/* 1 */             return this.size;
                }

                @Override // com.google.android.gms.internal.drive.zzkp
                public final /* synthetic */ zzkp<Boolean> zzr(int i) {
/* 3 */             if (i >= this.size) {
/* 15 */                return new zzja(Arrays.copyOf(this.zznp, i), this.size);
                    }
/* 19 */            f42.m3649e();
/* 22 */            return null;
                }

/* 9 */         private zzja(boolean[] zArr, int i) {
/* 11 */            this.zznp = zArr;
/* 12 */            this.size = i;
                }

                @Override // com.google.android.gms.internal.drive.zziw, java.util.AbstractList, java.util.List
/* 50 */        public final /* synthetic */ Object remove(int i) {
/* 51 */            zzbq();
/* 52 */            zzp(i);
/* 53 */            boolean[] zArr = this.zznp;
                    boolean z = zArr[i];
/* 54 */            int i2 = this.size;
                    if (i < i2 - 1) {
/* 55 */                System.arraycopy(zArr, i + 1, zArr, i, (i2 - i) - 1);
                    }
/* 56 */            this.size--;
/* 57 */            ((AbstractList) this).modCount++;
/* 58 */            return Boolean.valueOf(z);
                }
            }
