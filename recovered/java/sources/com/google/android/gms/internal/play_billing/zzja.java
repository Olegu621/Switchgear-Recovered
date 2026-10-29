            package com.google.android.gms.internal.play_billing;

            import java.util.Collections;
            import java.util.List;
            import java.util.Map;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzja extends zzjf {
                public zzja() {
/* 2 */             super(null);
                }

                @Override // com.google.android.gms.internal.play_billing.zzjf
                public final void zza() {
/* 5 */             if (!zzj()) {
/* 12 */                for (int i = 0; i < zzc(); i++) {
/* 14 */                    Map.Entry entryZzg = zzg(i);
/* 31 */                    if (((zzha) ((zzjb) entryZzg).zza()).zze()) {
/* 43 */                        entryZzg.setValue(Collections.unmodifiableList((List) entryZzg.getValue()));
                            }
                        }
/* 61 */                for (Map.Entry entry : zzd()) {
/* 79 */                    if (((zzha) entry.getKey()).zze()) {
/* 91 */                        entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                            }
                        }
                    }
/* 95 */            super.zza();
                }
            }
