            package com.google.android.gms.internal.common;

            import com.google.firebase.analytics.FirebaseAnalytics;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzs extends zzv {
                final /* synthetic */ zzp zza;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public zzs(zzw zzwVar, CharSequence charSequence, zzp zzpVar) {
/* 3 */             super(zzwVar, charSequence);
/* 1 */             this.zza = zzpVar;
                }

                @Override // com.google.android.gms.internal.common.zzv
                public final int zzc(int i) {
/* 1 */             CharSequence charSequence = ((zzv) this).zzb;
/* 3 */             int length = charSequence.length();
/* 9 */             zzr.zzc(i, length, FirebaseAnalytics.Param.INDEX);
/* 12 */            while (i < length) {
/* 24 */                if (this.zza.zza(charSequence.charAt(i))) {
/* 26 */                    return i;
                        }
/* 27 */                i++;
                    }
/* 30 */            return -1;
                }

                @Override // com.google.android.gms.internal.common.zzv
                public final int zzd(int i) {
/* 1 */             return i + 1;
                }
            }
