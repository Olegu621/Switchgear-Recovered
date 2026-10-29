            package p000;

            import com.google.android.gms.common.api.Status;
            import com.google.android.gms.tasks.TaskCompletionSource;
            import java.util.concurrent.TimeUnit;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class hc3 implements rr1 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ sr1 f9011a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ TaskCompletionSource f9012b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ tr1 f9013c;

                public hc3(sr1 sr1Var, TaskCompletionSource taskCompletionSource, tr1 tr1Var) {
/* 4 */             this.f9011a = sr1Var;
/* 6 */             this.f9012b = taskCompletionSource;
/* 8 */             this.f9013c = tr1Var;
                }

                @Override // p000.rr1
                /* JADX INFO: renamed from: a */
                public final void mo4165a(Status status) {
/* 1 */             boolean zM2006D1 = status.m2006D1();
/* 5 */             TaskCompletionSource taskCompletionSource = this.f9012b;
/* 7 */             if (!zM2006D1) {
/* 33 */                taskCompletionSource.setException(i13.m4438q(status));
/* 36 */                return;
                    }
/* 25 */            taskCompletionSource.setResult(this.f9013c.mo197b(this.f9011a.await(0L, TimeUnit.MILLISECONDS)));
                }
            }
