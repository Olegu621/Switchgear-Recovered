            package com.google.android.recaptcha.internal;

            import java.util.Iterator;
            import p000.C1951n4;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzon implements Iterator {
                final /* synthetic */ zzoo zza;
                private int zzb = 0;

                public zzon(zzoo zzooVar) {
/* 1 */             this.zza = zzooVar;
                }

                @Override // java.util.Iterator
                public final boolean hasNext() {
/* 1 */             int i = this.zzb;
/* 3 */             zzoo zzooVar = this.zza;
                    return i < zzooVar.zza() - zzooVar.zzb();
                }

                @Override // java.util.Iterator
                public final Object next() {
/* 1 */             int i = this.zzb;
/* 3 */             zzoo zzooVar = this.zza;
/* 14 */            if (i >= zzooVar.zza() - zzooVar.zzb()) {
/* 34 */                C1951n4.m6864o();
/* 37 */                return null;
                    }
/* 27 */            Object obj = zzooVar.zzb.zzb[zzooVar.zzb() + i];
/* 31 */            this.zzb = i + 1;
/* 33 */            return obj;
                }

                @Override // java.util.Iterator
                public final void remove() {
/* 6 */             throw new UnsupportedOperationException();
                }
            }
