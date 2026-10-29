            package com.google.android.recaptcha.internal;

            import java.util.Iterator;
            import java.util.Map;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzuj extends zzuo {
                public zzuj() {
/* 2 */             super(null);
                }

                @Override // com.google.android.recaptcha.internal.zzuo
                public final void zza() {
/* 5 */             if (!zzj()) {
/* 12 */                for (int i = 0; i < zzc(); i++) {
/* 26 */                    ((zzsc) ((zzuk) zzg(i)).zza()).zzg();
                        }
/* 36 */                Iterator it = zzd().iterator();
/* 44 */                while (it.hasNext()) {
/* 58 */                    ((zzsc) ((Map.Entry) it.next()).getKey()).zzg();
                        }
                    }
/* 62 */            super.zza();
                }
            }
