            package com.google.android.gms.internal.auth;

            import java.util.Collections;
            import java.util.List;
            import java.util.Map;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzgk extends zzgu {
                public zzgk(int i) {
/* 2 */             super(i, null);
                }

                @Override // com.google.android.gms.internal.auth.zzgu
                public final void zza() {
/* 5 */             if (!zzj()) {
/* 12 */                for (int i = 0; i < zzb(); i++) {
/* 14 */                    Map.Entry entryZzg = zzg(i);
/* 28 */                    if (((zzeo) entryZzg.getKey()).zzc()) {
/* 40 */                        entryZzg.setValue(Collections.unmodifiableList((List) entryZzg.getValue()));
                            }
                        }
/* 58 */                for (Map.Entry entry : zzc()) {
/* 76 */                    if (((zzeo) entry.getKey()).zzc()) {
/* 88 */                        entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                            }
                        }
                    }
/* 92 */            super.zza();
                }
            }
