            package com.google.android.gms.games.internal.p006v2.resolution;

            import android.content.Intent;
            import android.os.Bundle;
            import android.os.Looper;
            import android.os.ResultReceiver;
            import com.google.android.gms.internal.games_v2.zzfa;
            import com.google.android.gms.tasks.TaskCompletionSource;
            import p000.ze3;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zza extends ResultReceiver {

                /* JADX INFO: renamed from: a */
                public final TaskCompletionSource f4040a;

                public zza() {
/* 10 */            super(new zzfa(Looper.getMainLooper()));
/* 18 */            this.f4040a = new TaskCompletionSource();
                }

                @Override // android.os.ResultReceiver
                public final void onReceiveResult(int i, Bundle bundle) {
                    Intent intent;
/* 1 */             super.onReceiveResult(i, bundle);
/* 11 */            boolean z = i == -1;
/* 12 */            if (bundle == null || (intent = (Intent) bundle.getParcelable("resultData")) == null) {
/* 32 */                intent = new Intent();
                    }
/* 50 */            this.f4040a.trySetResult(z ? new ze3(intent, true) : new ze3(intent, false));
                }
            }
