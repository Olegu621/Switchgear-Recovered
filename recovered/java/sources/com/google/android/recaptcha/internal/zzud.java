            package com.google.android.recaptcha.internal;

            import java.util.AbstractList;
            import java.util.Arrays;
            import java.util.RandomAccess;
            import p000.AbstractC0886en;
            import p000.f42;
            import p000.s80;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 7 */     final class zzud extends zzpz implements RandomAccess {
                private static final Object[] zza;
                private static final zzud zzb;
                private Object[] zzc;
                private int zzd;

                static {
/* 2 */             Object[] objArr = new Object[0];
/* 4 */             zza = objArr;
/* 11 */            zzb = new zzud(objArr, 0, false);
                }

                public zzud() {
/* 5 */             this(zza, 0, true);
                }

                public static zzud zze() {
/* 1 */             return zzb;
                }

                private static int zzg(int i) {
/* 9 */             return Math.max(((i * 3) / 2) + 1, 10);
                }

                private final String zzh(int i) {
/* 7 */             return AbstractC0886en.m3506j("Index:", i, this.zzd, ", Size:");
                }

                private final void zzi(int i) {
/* 1 */             if (i < 0 || i >= this.zzd) {
/* 12 */                s80.m8425f(zzh(i));
                    }
                }

                @Override // com.google.android.recaptcha.internal.zzpz, java.util.AbstractList, java.util.List
                public final void add(int i, Object obj) {
                    int i2;
/* 1 */             zza();
/* 4 */             if (i < 0 || i > (i2 = this.zzd)) {
/* 65 */                s80.m8425f(zzh(i));
/* 68 */                return;
                    }
/* 10 */            int i3 = i + 1;
/* 12 */            Object[] objArr = this.zzc;
/* 14 */            int length = objArr.length;
/* 15 */            if (i2 < length) {
/* 18 */                System.arraycopy(objArr, i, objArr, i3, i2 - i);
                    } else {
/* 26 */                Object[] objArr2 = new Object[zzg(length)];
/* 31 */                System.arraycopy(this.zzc, 0, objArr2, 0, i);
/* 39 */                System.arraycopy(this.zzc, i, objArr2, i3, this.zzd - i);
/* 42 */                this.zzc = objArr2;
                    }
/* 46 */            this.zzc[i] = obj;
/* 52 */            this.zzd++;
/* 58 */            ((AbstractList) this).modCount++;
                }

                @Override // java.util.AbstractList, java.util.List
                public final Object get(int i) {
/* 1 */             zzi(i);
/* 6 */             return this.zzc[i];
                }

                @Override // com.google.android.recaptcha.internal.zzpz, java.util.AbstractList, java.util.List
                public final Object remove(int i) {
/* 1 */             zza();
/* 4 */             zzi(i);
/* 7 */             Object[] objArr = this.zzc;
/* 9 */             Object obj = objArr[i];
/* 11 */            int i2 = this.zzd;
/* 15 */            if (i < i2 - 1) {
/* 22 */                System.arraycopy(objArr, i + 1, objArr, i, (i2 - i) - 1);
                    }
/* 29 */            this.zzd--;
/* 35 */            ((AbstractList) this).modCount++;
/* 37 */            return obj;
                }

                @Override // com.google.android.recaptcha.internal.zzpz, java.util.AbstractList, java.util.List
                public final Object set(int i, Object obj) {
/* 1 */             zza();
/* 4 */             zzi(i);
/* 7 */             Object[] objArr = this.zzc;
/* 9 */             Object obj2 = objArr[i];
/* 11 */            objArr[i] = obj;
/* 17 */            ((AbstractList) this).modCount++;
/* 19 */            return obj2;
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                public final int size() {
/* 1 */             return this.zzd;
                }

                @Override // com.google.android.recaptcha.internal.zzsu
                public final /* bridge */ /* synthetic */ zzsu zzd(int i) {
/* 3 */             if (i >= this.zzd) {
/* 21 */                return new zzud(i == 0 ? zza : Arrays.copyOf(this.zzc, i), this.zzd, true);
                    }
/* 25 */            f42.m3649e();
/* 28 */            return null;
                }

                public final void zzf(int i) {
/* 3 */             int length = this.zzc.length;
/* 4 */             if (i <= length) {
/* 6 */                 return;
                    }
/* 7 */             if (length == 0) {
/* 33 */                this.zzc = new Object[Math.max(i, 10)];
/* 35 */                return;
                    }
/* 9 */             while (length < i) {
/* 11 */                length = zzg(length);
                    }
/* 22 */            this.zzc = Arrays.copyOf(this.zzc, length);
                }

/* 8 */         private zzud(Object[] objArr, int i, boolean z) {
/* 9 */             super(z);
                    this.zzc = objArr;
                    this.zzd = i;
                }

                @Override // com.google.android.recaptcha.internal.zzpz, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
/* 68 */        public final boolean add(Object obj) {
/* 69 */            zza();
                    int i = this.zzd;
/* 70 */            int length = this.zzc.length;
                    if (i == length) {
/* 72 */                this.zzc = Arrays.copyOf(this.zzc, zzg(length));
                    }
                    Object[] objArr = this.zzc;
                    int i2 = this.zzd;
                    this.zzd = i2 + 1;
/* 73 */            objArr[i2] = obj;
/* 74 */            ((AbstractList) this).modCount++;
                    return true;
                }
            }
