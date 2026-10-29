            package p000;

            import android.os.Build;
            import android.os.Bundle;
            import android.view.inputmethod.InputConnection;
            import android.view.inputmethod.InputConnectionWrapper;
            import android.view.inputmethod.InputContentInfo;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class cy0 extends InputConnectionWrapper {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ C2357x6 f6936a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public cy0(InputConnection inputConnection, C2357x6 c2357x6) {
/* 4 */             super(inputConnection, false);
/* 1 */             this.f6936a = c2357x6;
                }

                @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
                public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
/* 1 */             ts0 ts0Var = null;
/* 2 */             if (inputContentInfo != null && Build.VERSION.SDK_INT >= 25) {
/* 19 */                ts0Var = new ts0(new ey0(inputContentInfo));
                    }
/* 28 */            if (this.f6936a.m9713d(ts0Var, i, bundle)) {
/* 30 */                return true;
                    }
/* 32 */            return super.commitContent(inputContentInfo, i, bundle);
                }
            }
