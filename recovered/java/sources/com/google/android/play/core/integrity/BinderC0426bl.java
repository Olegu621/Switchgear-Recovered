            package com.google.android.play.core.integrity;

            import android.os.Bundle;
            import android.os.RemoteException;
            import com.google.android.gms.tasks.TaskCompletionSource;
            import p000.C1020i9;
            import p000.qa3;
            
            /* JADX INFO: renamed from: com.google.android.play.core.integrity.bl */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class BinderC0426bl extends BinderC0423bi {

                /* JADX INFO: renamed from: c */
                final /* synthetic */ C0428bn f5226c;

                /* JADX INFO: renamed from: d */
                private final qa3 f5227d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public BinderC0426bl(C0428bn c0428bn, TaskCompletionSource taskCompletionSource) {
/* 3 */             super(c0428bn, taskCompletionSource);
/* 1 */             this.f5226c = c0428bn;
/* 13 */            this.f5227d = new qa3("OnWarmUpIntegrityTokenCallback");
                }

                @Override // com.google.android.play.core.integrity.BinderC0423bi, com.google.android.play.integrity.internal.InterfaceC0469k
                /* JADX INFO: renamed from: e */
                public final void mo2478e(Bundle bundle) throws RemoteException {
/* 1 */             super.mo2478e(bundle);
/* 11 */            this.f5227d.m7756b("onWarmUpExpressIntegrityToken", new Object[0]);
/* 20 */            C1020i9 c1020i9Mo2494a = this.f5226c.f5234f.mo2494a(bundle);
/* 24 */            TaskCompletionSource taskCompletionSource = this.f5220a;
/* 26 */            if (c1020i9Mo2494a != null) {
/* 28 */                taskCompletionSource.trySetException(c1020i9Mo2494a);
                    } else {
/* 42 */                taskCompletionSource.trySetResult(Long.valueOf(bundle.getLong("warm.up.sid")));
                    }
                }
            }
