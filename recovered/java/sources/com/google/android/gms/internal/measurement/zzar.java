            package com.google.android.gms.internal.measurement;

            import java.util.Iterator;
            import java.util.Objects;
            import p000.C1951n4;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzar implements Iterator {
                final /* synthetic */ zzas zza;
                private int zzb;

                public zzar(zzas zzasVar) {
/* 1 */             Objects.requireNonNull(zzasVar);
/* 4 */             this.zza = zzasVar;
/* 10 */            this.zzb = 0;
                }

                @Override // java.util.Iterator
                public final boolean hasNext() {
                    return this.zzb < this.zza.zzb().length();
                }

                @Override // java.util.Iterator
                public final /* bridge */ /* synthetic */ Object next() {
/* 1 */             zzas zzasVar = this.zza;
/* 3 */             String strZzb = zzasVar.zzb();
/* 7 */             int i = this.zzb;
/* 13 */            if (i < strZzb.length()) {
/* 19 */                this.zzb = i + 1;
/* 33 */                return new zzas(String.valueOf(zzasVar.zzb().charAt(i)));
                    }
/* 37 */            C1951n4.m6864o();
/* 40 */            return null;
                }
            }
