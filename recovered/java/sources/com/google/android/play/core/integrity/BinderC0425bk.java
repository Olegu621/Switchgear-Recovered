            package com.google.android.play.core.integrity;

            import android.os.Bundle;
            import android.os.RemoteException;
            import com.google.android.gms.tasks.TaskCompletionSource;
            import p000.C1020i9;
            import p000.qa3;
            
            /* JADX INFO: renamed from: com.google.android.play.core.integrity.bk */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class BinderC0425bk extends BinderC0423bi {

                /* JADX INFO: renamed from: c */
                final /* synthetic */ C0428bn f5223c;

                /* JADX INFO: renamed from: d */
                private final qa3 f5224d;

                /* JADX INFO: renamed from: e */
                private final long f5225e;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public BinderC0425bk(C0428bn c0428bn, TaskCompletionSource taskCompletionSource, long j) {
/* 3 */             super(c0428bn, taskCompletionSource);
/* 1 */             this.f5223c = c0428bn;
/* 13 */            this.f5224d = new qa3("OnRequestIntegrityTokenCallback");
/* 15 */            this.f5225e = j;
                }

                @Override // com.google.android.play.core.integrity.BinderC0423bi, com.google.android.play.integrity.internal.InterfaceC0469k
                /* JADX INFO: renamed from: c */
                public final void mo2476c(Bundle bundle) throws RemoteException {
/* 1 */             super.mo2476c(bundle);
/* 11 */            this.f5224d.m7756b("onRequestExpressIntegrityToken", new Object[0]);
/* 20 */            C1020i9 c1020i9Mo2494a = this.f5223c.f5234f.mo2494a(bundle);
/* 24 */            if (c1020i9Mo2494a != null) {
/* 28 */                this.f5220a.trySetException(c1020i9Mo2494a);
/* 31 */                return;
                    }
/* 46 */            C0424bj c0424bj = new C0424bj(this, this.f5223c.f5231c, bundle.getLong("request.token.sid"));
/* 49 */            TaskCompletionSource taskCompletionSource = this.f5220a;
/* 53 */            C0414b c0414b = new C0414b();
/* 62 */            c0414b.mo2472b(bundle.getString("token"));
/* 65 */            c0414b.mo2471a(c0424bj);
/* 72 */            taskCompletionSource.trySetResult(c0414b.mo2473c());
                }
            }
