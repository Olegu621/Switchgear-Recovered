            package p000;

            import com.quago.mobile.sdk.utils.IQuagoLog;
            import com.supercell.titan.QuagoManager;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class c02 implements IQuagoLog {
                @Override // com.quago.mobile.sdk.utils.IQuagoLog
                public final void onLog(int i, String str, String str2, Throwable th) {
/* 1 */             QuagoManager.onLog(i, str, str2);
                }
            }
