            package com.google.android.gms.internal.measurement;

            import java.util.Collections;
            import java.util.List;
            import java.util.Map;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zznz extends zzod {
                public zznz() {
/* 2 */             super(null);
                }

                @Override // com.google.android.gms.internal.measurement.zzod
                public final void zza() {
/* 5 */             if (!zzb()) {
/* 12 */                for (int i = 0; i < zzc(); i++) {
/* 14 */                    Map.Entry entryZzd = zzd(i);
/* 31 */                    if (((zzlu) ((zzoa) entryZzd).zza()).zzd()) {
/* 43 */                        entryZzd.setValue(Collections.unmodifiableList((List) entryZzd.getValue()));
                            }
                        }
/* 61 */                for (Map.Entry entry : zze()) {
/* 79 */                    if (((zzlu) entry.getKey()).zzd()) {
/* 91 */                        entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                            }
                        }
                    }
/* 95 */            super.zza();
                }
            }
