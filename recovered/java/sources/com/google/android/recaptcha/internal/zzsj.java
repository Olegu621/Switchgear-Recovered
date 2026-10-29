            package com.google.android.recaptcha.internal;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class zzsj extends zzsh implements zztt {
                public zzsj(zzsk zzskVar) {
/* 1 */             super(zzskVar);
                }

                @Override // com.google.android.recaptcha.internal.zzsh, com.google.android.recaptcha.internal.zztr
                /* JADX INFO: renamed from: zze, reason: merged with bridge method [inline-methods] */
                public final zzsk zzl() {
/* 5 */             boolean zZzL = ((zzsk) this.zza).zzL();
/* 9 */             zzsn zzsnVar = this.zza;
/* 11 */            if (!zZzL) {
/* 13 */                return (zzsk) zzsnVar;
                    }
/* 20 */            ((zzsk) zzsnVar).zzb.zzg();
/* 27 */            return (zzsk) super.zzl();
                }

                @Override // com.google.android.recaptcha.internal.zzsh
                public final void zzo() {
/* 1 */             super.zzo();
/* 14 */            if (((zzsk) this.zza).zzb != zzsd.zzd()) {
/* 18 */                zzsk zzskVar = (zzsk) this.zza;
/* 26 */                zzskVar.zzb = zzskVar.zzb.clone();
                    }
                }
            }
