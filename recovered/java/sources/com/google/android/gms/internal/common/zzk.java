            package com.google.android.gms.internal.common;

            import java.util.Iterator;
            import p000.C1951n4;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            abstract class zzk implements Iterator {
                private Object zza;
                private int zzb = 2;

                @Override // java.util.Iterator
                public final boolean hasNext() {
/* 11 */            zzr.zza(this.zzb != 4);
/* 14 */            int i = this.zzb;
/* 16 */            int i2 = i - 1;
/* 18 */            if (i == 0) {
/* 44 */                throw null;
                    }
/* 20 */            if (i2 == 0) {
/* 4 */                 return true;
                    }
/* 23 */            if (i2 != 2) {
/* 25 */                this.zzb = 4;
/* 31 */                this.zza = zza();
/* 36 */                if (this.zzb != 3) {
/* 38 */                    this.zzb = 1;
/* 4 */                     return true;
                        }
                    }
/* 3 */             return false;
                }

                @Override // java.util.Iterator
                public final Object next() {
/* 5 */             if (!hasNext()) {
/* 16 */                C1951n4.m6864o();
/* 19 */                return null;
                    }
/* 8 */             this.zzb = 2;
/* 10 */            Object obj = this.zza;
/* 13 */            this.zza = null;
/* 15 */            return obj;
                }

                @Override // java.util.Iterator
                public final void remove() {
/* 6 */             throw new UnsupportedOperationException();
                }

                public abstract Object zza();

                public final Object zzb() {
/* 2 */             this.zzb = 3;
/* 4 */             return null;
                }
            }
