            package com.google.firebase.analytics.connector.internal;

            import android.os.Bundle;
            import java.util.Objects;
            import p000.i13;
            import p000.qj3;
            import p000.rk3;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzd implements rk3 {
                final /* synthetic */ zze zza;

                public zzd(zze zzeVar) {
/* 1 */             Objects.requireNonNull(zzeVar);
/* 4 */             this.zza = zzeVar;
                }

                @Override // p000.rk3
                public final void onEvent(String str, String str2, Bundle bundle, long j) {
/* 1 */             zze zzeVar = this.zza;
/* 9 */             if (zzeVar.zza.contains(str2)) {
/* 14 */                Bundle bundle2 = new Bundle();
/* 17 */                int i = zzc.zza;
/* 23 */                String strM7889V = qj3.m7889V(str2, i13.f9405h, i13.f9403f);
/* 27 */                if (strM7889V != null) {
/* 29 */                    str2 = strM7889V;
                        }
/* 32 */                bundle2.putString("events", str2);
/* 40 */                zzeVar.zzd().onMessageTriggered(2, bundle2);
                    }
                }
            }
