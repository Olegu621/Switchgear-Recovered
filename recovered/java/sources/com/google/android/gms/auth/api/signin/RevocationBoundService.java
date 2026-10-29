            package com.google.android.gms.auth.api.signin;

            import android.app.Service;
            import android.content.Intent;
            import android.os.IBinder;
            import android.util.Log;
            import com.google.android.gms.auth.api.signin.internal.zbt;
            import io.sentry.android.core.AbstractC1245n0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class RevocationBoundService extends Service {
                @Override // android.app.Service
                public final IBinder onBind(Intent intent) {
/* 13 */            if (!"com.google.android.gms.auth.api.signin.RevocationBoundService.disconnect".equals(intent.getAction()) && !"com.google.android.gms.auth.api.signin.RevocationBoundService.clearClientState".equals(intent.getAction())) {
/* 42 */                AbstractC1245n0.m4889q("RevocationService", "Unknown action sent to RevocationBoundService: ".concat(String.valueOf(intent.getAction())));
/* 45 */                return null;
                    }
/* 52 */            if (Log.isLoggable("RevocationService", 2)) {
/* 64 */                "RevocationBoundService handling ".concat(String.valueOf(intent.getAction()));
                    }
/* 69 */            return new zbt(this);
                }
            }
