            package p000;

            import android.os.Bundle;
            import com.google.android.gms.tasks.TaskCompletionSource;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class fp3 extends jo3 {
                @Override // p000.jo3, com.google.android.play.core.appupdate.internal.zzh
                public final void zzb(Bundle bundle) {
/* 1 */             super.zzb(bundle);
/* 7 */             int i = bundle.getInt("error.code", -2);
/* 11 */            TaskCompletionSource taskCompletionSource = this.f12412b;
/* 13 */            if (i != 0) {
/* 24 */                taskCompletionSource.trySetException(new my0(bundle.getInt("error.code", -2)));
                    } else {
/* 29 */                taskCompletionSource.trySetResult(null);
                    }
                }
            }
