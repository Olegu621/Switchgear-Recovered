            package com.google.android.gms.internal.play_billing;

            import java.io.Serializable;
            import java.util.Set;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzct extends zzbi implements Serializable {
                private static final zzct zza;
                private static final zzct zzb;
                private final transient zzco zzc;

                static {
/* 3 */             int i = zzco.zzd;
/* 10 */            zza = new zzct(zzdk.zza);
/* 25 */            zzb = new zzct(zzco.zzm(zzdh.zza()));
                }

                public zzct(zzco zzcoVar) {
/* 4 */             this.zzc = zzcoVar;
                }

                public static zzct zza() {
/* 1 */             return zzb;
                }

                public static zzct zzb() {
/* 1 */             return zza;
                }

                @Override // com.google.android.gms.internal.play_billing.zzdj
                public final /* bridge */ /* synthetic */ Set zzc() {
                    return this.zzc.isEmpty() ? zzdq.zza : new zzdr(this.zzc, zzdg.zza);
                }
            }
