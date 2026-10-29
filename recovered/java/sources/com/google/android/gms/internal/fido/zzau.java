            package com.google.android.gms.internal.fido;

            import com.google.firebase.analytics.FirebaseAnalytics;
            import p000.C1951n4;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            abstract class zzau extends zzbg {
                private final int zza;
                private int zzb;

                public zzau(int i, int i2) {
/* 6 */             zzas.zzb(i2, i, FirebaseAnalytics.Param.INDEX);
/* 9 */             this.zza = i;
/* 11 */            this.zzb = i2;
                }

                @Override // java.util.Iterator, java.util.ListIterator
                public final boolean hasNext() {
                    return this.zzb < this.zza;
                }

                @Override // java.util.ListIterator
                public final boolean hasPrevious() {
                    return this.zzb > 0;
                }

                @Override // java.util.Iterator, java.util.ListIterator
                public final Object next() {
/* 5 */             if (!hasNext()) {
/* 18 */                C1951n4.m6864o();
/* 21 */                return null;
                    }
/* 7 */             int i = this.zzb;
/* 11 */            this.zzb = i + 1;
/* 13 */            return zza(i);
                }

                @Override // java.util.ListIterator
                public final int nextIndex() {
/* 1 */             return this.zzb;
                }

                @Override // java.util.ListIterator
                public final Object previous() {
/* 5 */             if (!hasPrevious()) {
/* 18 */                C1951n4.m6864o();
/* 21 */                return null;
                    }
/* 9 */             int i = this.zzb - 1;
/* 11 */            this.zzb = i;
/* 13 */            return zza(i);
                }

                @Override // java.util.ListIterator
                public final int previousIndex() {
/* 3 */             return this.zzb - 1;
                }

                public abstract Object zza(int i);
            }
