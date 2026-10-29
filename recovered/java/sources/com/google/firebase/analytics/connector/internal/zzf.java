            package com.google.firebase.analytics.connector.internal;

            import android.os.Bundle;
            import java.util.Objects;
            import p000.rk3;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzf implements rk3 {
                final /* synthetic */ zzg zza;

                public zzf(zzg zzgVar) {
/* 1 */             Objects.requireNonNull(zzgVar);
/* 4 */             this.zza = zzgVar;
                }

                @Override // p000.rk3
                public final void onEvent(String str, String str2, Bundle bundle, long j) {
/* 1 */             if (str == null || !zzc.zzc(str2)) {
/* 39 */                return;
                    }
/* 11 */            Bundle bundle2 = new Bundle();
/* 16 */            bundle2.putString("name", str2);
/* 21 */            bundle2.putLong("timestampInMillis", j);
/* 26 */            bundle2.putBundle("params", bundle);
/* 36 */            this.zza.zzd().onMessageTriggered(3, bundle2);
                }
            }
