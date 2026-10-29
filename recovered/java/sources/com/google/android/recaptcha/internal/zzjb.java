            package com.google.android.recaptcha.internal;

            import java.util.HashMap;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzjb {
                private final zzja zza;
                private final HashMap zzb;
                private final zzis zzc;
                private final zzdo zzd;

                public zzjb(zzis zzisVar, zzdo zzdoVar, zzct zzctVar) {
/* 4 */             this.zzc = zzisVar;
/* 6 */             this.zzd = zzdoVar;
/* 10 */            zzja zzjaVar = new zzja();
/* 13 */            this.zza = zzjaVar;
/* 17 */            HashMap map = new HashMap();
/* 20 */            this.zzb = map;
/* 24 */            zzjaVar.zzd(173, map);
                }

                public final zzja zza() {
/* 1 */             return this.zza;
                }

                public final void zzb() {
/* 1 */             zzja zzjaVar = this.zza;
/* 3 */             zzjaVar.zzc();
/* 10 */            zzjaVar.zzd(173, this.zzb);
                }

                public final zzdo zzc() {
/* 1 */             return this.zzd;
                }

                public final zzis zzd() {
/* 1 */             return this.zzc;
                }

                public final void zze(int i, Object obj) {
/* 9 */             this.zzb.put(Integer.valueOf(i - 2), obj);
                }
            }
