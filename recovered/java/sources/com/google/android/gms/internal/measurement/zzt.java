            package com.google.android.gms.internal.measurement;

            import androidx.core.app.NotificationCompat;
            import java.util.List;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzt extends zzai {
                private final zzr zza;

                public zzt(zzr zzrVar) {
/* 3 */             super("internal.logger");
/* 6 */             this.zza = zzrVar;
/* 19 */            this.zze.put("log", new zzs(this, false, true));
/* 31 */            this.zze.put(NotificationCompat.GROUP_KEY_SILENT, new zzp(this, NotificationCompat.GROUP_KEY_SILENT));
/* 47 */            ((zzai) this.zze.get(NotificationCompat.GROUP_KEY_SILENT)).zzm("log", new zzs(this, true, true));
/* 59 */            this.zze.put("unmonitored", new zzq(this, "unmonitored"));
/* 75 */            ((zzai) this.zze.get("unmonitored")).zzm("log", new zzs(this, false, false));
                }

                @Override // com.google.android.gms.internal.measurement.zzai
                public final zzao zza(zzg zzgVar, List list) {
/* 1 */             return zzao.zzf;
                }

                public final /* synthetic */ zzr zzb() {
/* 1 */             return this.zza;
                }
            }
