            package com.google.android.play.core.integrity;

            import android.os.Bundle;
            import com.google.android.gms.tasks.TaskCompletionSource;
            import com.google.android.play.integrity.internal.AbstractBinderC0473o;
            import p000.C1020i9;
            import p000.qa3;
            
            /* JADX INFO: renamed from: com.google.android.play.core.integrity.ai */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class BinderC0396ai extends AbstractBinderC0473o {

                /* JADX INFO: renamed from: a */
                final /* synthetic */ C0397aj f5164a;

                /* JADX INFO: renamed from: b */
                private final qa3 f5165b;

                /* JADX INFO: renamed from: c */
                private final TaskCompletionSource f5166c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public BinderC0396ai(C0397aj c0397aj, TaskCompletionSource taskCompletionSource) {
/* 5 */             super("com.google.android.play.core.integrity.protocol.IIntegrityServiceCallback");
/* 1 */             this.f5164a = c0397aj;
/* 15 */            this.f5165b = new qa3("OnRequestIntegrityTokenCallback");
/* 17 */            this.f5166c = taskCompletionSource;
                }

                @Override // com.google.android.play.integrity.internal.InterfaceC0474p
                /* JADX INFO: renamed from: b */
                public final void mo2455b(Bundle bundle) {
/* 7 */             this.f5164a.f5167a.m10291d(this.f5166c);
/* 17 */            this.f5165b.m7756b("onRequestIntegrityToken", new Object[0]);
/* 26 */            C1020i9 c1020i9Mo2494a = this.f5164a.f5172f.mo2494a(bundle);
/* 30 */            if (c1020i9Mo2494a != null) {
/* 34 */                this.f5166c.trySetException(c1020i9Mo2494a);
/* 37 */                return;
                    }
/* 40 */            String string = bundle.getString("token");
/* 44 */            if (string == null) {
/* 56 */                this.f5166c.trySetException(new IntegrityServiceException(-100, null));
/* 59 */                return;
                    }
/* 74 */            C0395ah c0395ah = new C0395ah(this, this.f5164a.f5169c, bundle.getLong("request.token.sid"));
/* 77 */            TaskCompletionSource taskCompletionSource = this.f5166c;
/* 81 */            C0387a c0387a = new C0387a();
/* 84 */            c0387a.mo2447b(string);
/* 87 */            c0387a.mo2446a(c0395ah);
/* 94 */            taskCompletionSource.trySetResult(c0387a.mo2448c());
                }
            }
