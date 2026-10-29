            package com.google.android.gms.internal.measurement;

            import java.util.Objects;
            import p000.C1951n4;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzkz extends zzla {
                final /* synthetic */ zzlg zza;
                private int zzb;
                private final int zzc;

                public zzkz(zzlg zzlgVar) {
/* 1 */             Objects.requireNonNull(zzlgVar);
/* 4 */             this.zza = zzlgVar;
/* 10 */            this.zzb = 0;
/* 16 */            this.zzc = zzlgVar.zzc();
                }

                @Override // java.util.Iterator
                public final boolean hasNext() {
                    return this.zzb < this.zzc;
                }

                @Override // com.google.android.gms.internal.measurement.zzlc
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
