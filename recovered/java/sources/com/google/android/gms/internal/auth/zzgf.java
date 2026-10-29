            package com.google.android.gms.internal.auth;

            import java.util.AbstractList;
            import java.util.Arrays;
            import java.util.RandomAccess;
            import p000.AbstractC0886en;
            import p000.f42;
            import p000.fm0;
            import p000.s80;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 8 */     final class zzgf extends zzdq implements RandomAccess {
                private static final zzgf zza;
                private Object[] zzb;
                private int zzc;

                static {
/* 6 */             zzgf zzgfVar = new zzgf(new Object[0], 0);
/* 9 */             zza = zzgfVar;
/* 11 */            zzgfVar.zzb();
                }

                public zzgf() {
/* 6 */             this(new Object[10], 0);
                }

                public static zzgf zze() {
/* 1 */             return zza;
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
                public final void add(int i, Object obj) {
                    int i2;
/* 1 */             zza();
/* 4 */             if (i < 0 || i > (i2 = this.zzc)) {
/* 66 */                s80.m8425f(zzf(i));
/* 69 */                return;
                    }
/* 10 */            Object[] objArr = this.zzb;
/* 14 */            if (i2 < objArr.length) {
/* 19 */                System.arraycopy(objArr, i, objArr, i + 1, i2 - i);
                    } else {
/* 29 */                Object[] objArr2 = new Object[fm0.m3797w(i2, 3, 2, 1)];
/* 32 */                System.arraycopy(objArr, 0, objArr2, 0, i);
/* 42 */                System.arraycopy(this.zzb, i, objArr2, i + 1, this.zzc - i);
/* 45 */                this.zzb = objArr2;
                    }
/* 49 */            this.zzb[i] = obj;
/* 54 */            this.zzc++;
/* 59 */            ((AbstractList) this).modCount++;
                }

                @Override // java.util.AbstractList, java.util.List
                public final Object get(int i) {
/* 1 */             zzg(i);
/* 6 */             return this.zzb[i];
                }

                @Override // com.google.android.gms.internal.auth.zzdq, java.util.AbstractList, java.util.List
                public final Object remove(int i) {
/* 1 */             zza();
/* 4 */             zzg(i);
/* 7 */             Object[] objArr = this.zzb;
/* 9 */             Object obj = objArr[i];
/* 11 */            int i2 = this.zzc;
/* 15 */            if (i < i2 - 1) {
/* 22 */                System.arraycopy(objArr, i + 1, objArr, i, (i2 - i) - 1);
                    }
/* 29 */            this.zzc--;
/* 35 */            ((AbstractList) this).modCount++;
/* 37 */            return obj;
                }

                @Override // com.google.android.gms.internal.auth.zzdq, java.util.AbstractList, java.util.List
                public final Object set(int i, Object obj) {
/* 1 */             zza();
/* 4 */             zzg(i);
/* 7 */             Object[] objArr = this.zzb;
/* 9 */             Object obj2 = objArr[i];
/* 11 */            objArr[i] = obj;
/* 17 */            ((AbstractList) this).modCount++;
/* 19 */            return obj2;
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                public final int size() {
/* 1 */             return this.zzc;
                }

                @Override // com.google.android.gms.internal.auth.zzey
                public final /* bridge */ /* synthetic */ zzey zzd(int i) {
/* 3 */             if (i >= this.zzc) {
/* 15 */                return new zzgf(Arrays.copyOf(this.zzb, i), this.zzc);
                    }
/* 19 */            f42.m3649e();
/* 22 */            return null;
                }

/* 9 */         private zzgf(Object[] objArr, int i) {
                    this.zzb = objArr;
                    this.zzc = i;
                }

                @Override // com.google.android.gms.internal.auth.zzdq, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
/* 69 */        public final boolean add(Object obj) {
/* 70 */            zza();
                    int i = this.zzc;
                    Object[] objArr = this.zzb;
/* 71 */            if (i == objArr.length) {
/* 72 */                this.zzb = Arrays.copyOf(objArr, ((i * 3) / 2) + 1);
                    }
                    Object[] objArr2 = this.zzb;
                    int i2 = this.zzc;
                    this.zzc = i2 + 1;
/* 73 */            objArr2[i2] = obj;
/* 74 */            ((AbstractList) this).modCount++;
                    return true;
                }
            }
