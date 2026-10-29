            package com.google.android.gms.internal.measurement;

            import java.util.List;
            import java.util.concurrent.Callable;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzu extends zzai {
                private final Callable zza;

                public zzu(String str, Callable callable) {
/* 3 */             super("internal.appMetadata");
/* 6 */             this.zza = callable;
                }

                @Override // com.google.android.gms.internal.measurement.zzai
                public final zzao zza(zzg zzgVar, List list) {
                    try {
/* 7 */                 return zzi.zza(this.zza.call());
                    } catch (Exception unused) {
/* 12 */                return zzao.zzf;
                    }
                }
            }
