            package p000;

            import android.util.ArrayMap;
            import java.util.HashSet;
            import java.util.concurrent.Executor;
            import java.util.concurrent.RejectedExecutionException;
            
            /* JADX INFO: renamed from: gn */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C0960gn extends AbstractC1934mo {

                /* JADX INFO: renamed from: a */
                public HashSet f8743a;

                /* JADX INFO: renamed from: b */
                public ArrayMap f8744b;

                @Override // p000.AbstractC1934mo
                /* JADX INFO: renamed from: a */
                public final void mo3974a(int i) {
/* 11 */            for (AbstractC1934mo abstractC1934mo : this.f8743a) {
                        try {
/* 33 */                    ((Executor) this.f8744b.get(abstractC1934mo)).execute(new RunnableC0923fn(abstractC1934mo, i, 0));
                        } catch (RejectedExecutionException e) {
/* 42 */                    hu0.m4326U("Camera2CameraControlImp", "Executor rejected to invoke onCaptureCancelled.", e);
                        }
                    }
                }

                @Override // p000.AbstractC1934mo
                /* JADX INFO: renamed from: b */
                public final void mo3975b(int i, InterfaceC2188so interfaceC2188so) {
/* 11 */            for (AbstractC1934mo abstractC1934mo : this.f8743a) {
                        try {
/* 33 */                    ((Executor) this.f8744b.get(abstractC1934mo)).execute(new RunnableC2524z6(abstractC1934mo, i, interfaceC2188so, 2));
                        } catch (RejectedExecutionException e) {
/* 42 */                    hu0.m4326U("Camera2CameraControlImp", "Executor rejected to invoke onCaptureCompleted.", e);
                        }
                    }
                }

                @Override // p000.AbstractC1934mo
                /* JADX INFO: renamed from: c */
                public final void mo3976c(int i, xt0 xt0Var) {
/* 11 */            for (AbstractC1934mo abstractC1934mo : this.f8743a) {
                        try {
/* 33 */                    ((Executor) this.f8744b.get(abstractC1934mo)).execute(new RunnableC2524z6(abstractC1934mo, i, xt0Var, 1));
                        } catch (RejectedExecutionException e) {
/* 42 */                    hu0.m4326U("Camera2CameraControlImp", "Executor rejected to invoke onCaptureFailed.", e);
                        }
                    }
                }
            }
