            package com.google.android.gms.internal.play_billing;

            import p000.fm0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzt extends zzq {
                final /* synthetic */ zzu zzg;

                public zzt(zzu zzuVar) {
/* 1 */             this.zzg = zzuVar;
                }

                @Override // com.google.android.gms.internal.play_billing.zzq
                public final String zza() {
/* 9 */             zzr zzrVar = (zzr) this.zzg.zza.get();
                    return zzrVar == null ? "Completer object has been garbage collected, future will fail soon" : fm0.m3784j("tag=[", String.valueOf(zzrVar.zza), "]");
                }
            }
