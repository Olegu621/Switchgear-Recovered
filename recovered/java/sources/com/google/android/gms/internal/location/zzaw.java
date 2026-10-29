            package com.google.android.gms.internal.location;

            import android.app.PendingIntent;
            import com.google.android.gms.common.api.Status;
            import io.sentry.android.core.AbstractC1245n0;
            import p000.InterfaceC0992hi;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzaw extends zzaj {
                private InterfaceC0992hi zza;

                public zzaw(InterfaceC0992hi interfaceC0992hi) {
/* 4 */             this.zza = interfaceC0992hi;
                }

                @Override // com.google.android.gms.internal.location.zzak
                public final void zzb(int i, String[] strArr) {
/* 1 */             InterfaceC0992hi interfaceC0992hi = this.zza;
/* 3 */             if (interfaceC0992hi == null) {
/* 14 */                AbstractC1245n0.m4893u("LocationClientImpl", "onAddGeofenceResult called multiple times", new Exception());
/* 17 */                return;
                    }
/* 19 */            if ((i < 0 || i > 1) && (i < 1000 || i >= 1006)) {
/* 32 */                i = 1;
                    }
/* 33 */            if (i == 1) {
/* 36 */                i = 13;
                    }
/* 44 */            interfaceC0992hi.setResult(new Status(i, null, null, null));
/* 47 */            this.zza = null;
                }

                @Override // com.google.android.gms.internal.location.zzak
                public final void zzc(int i, String[] strArr) {
/* 10 */            AbstractC1245n0.m4893u("LocationClientImpl", "Unexpected call to onRemoveGeofencesByRequestIdsResult", new Exception());
                }

                @Override // com.google.android.gms.internal.location.zzak
                public final void zzd(int i, PendingIntent pendingIntent) {
/* 10 */            AbstractC1245n0.m4893u("LocationClientImpl", "Unexpected call to onRemoveGeofencesByPendingIntentResult", new Exception());
                }
            }
