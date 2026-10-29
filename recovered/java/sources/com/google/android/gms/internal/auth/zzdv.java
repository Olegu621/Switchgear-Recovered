            package com.google.android.gms.internal.auth;

            import p000.C1951n4;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzdv extends zzdx {
                final /* synthetic */ zzee zza;
                private int zzb = 0;
                private final int zzc;

                public zzdv(zzee zzeeVar) {
/* 1 */             this.zza = zzeeVar;
/* 13 */            this.zzc = zzeeVar.zzd();
                }

                @Override // java.util.Iterator
                public final boolean hasNext() {
                    return this.zzb < this.zzc;
                }

                @Override // com.google.android.gms.internal.auth.zzdz
                public final byte zza() {
/* 1 */             int i = this.zzb;
/* 5 */             if (i < this.zzc) {
/* 9 */                 this.zzb = i + 1;
/* 13 */                return this.zza.zzb(i);
                    }
/* 18 */            C1951n4.m6864o();
/* 21 */            return (byte) 0;
                }
            }
