            package p000;

            import android.os.DeadObjectException;
            import android.os.RemoteException;
            import com.google.android.gms.common.Feature;
            import com.google.android.gms.common.api.Status;
            import com.google.android.gms.tasks.TaskCompletionSource;
            import java.util.Map;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class xb3 extends gb3 {

                /* JADX INFO: renamed from: b */
                public final um2 f19020b;

                /* JADX INFO: renamed from: c */
                public final TaskCompletionSource f19021c;

                /* JADX INFO: renamed from: d */
                public final yg2 f19022d;

                public xb3(int i, um2 um2Var, TaskCompletionSource taskCompletionSource, yg2 yg2Var) {
/* 1 */             super(i);
/* 4 */             this.f19021c = taskCompletionSource;
/* 6 */             this.f19020b = um2Var;
/* 8 */             this.f19022d = yg2Var;
/* 11 */            if (i == 2 && um2Var.shouldAutoResolveMissingFeatures()) {
/* 22 */                C1951n4.m6859j("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
/* 26 */                throw null;
                    }
                }

                @Override // p000.bc3
                /* JADX INFO: renamed from: a */
                public final void mo1333a(Status status) {
/* 5 */             ((xt0) this.f19022d).getClass();
/* 14 */            this.f19021c.trySetException(i13.m4438q(status));
                }

                @Override // p000.bc3
                /* JADX INFO: renamed from: b */
                public final void mo1334b(Exception exc) {
/* 3 */             this.f19021c.trySetException(exc);
                }

                @Override // p000.bc3
                /* JADX INFO: renamed from: c */
                public final void mo1335c(cb3 cb3Var) throws DeadObjectException {
/* 1 */             TaskCompletionSource taskCompletionSource = this.f19021c;
                    try {
/* 7 */                 this.f19020b.doExecute(cb3Var.f2821b, taskCompletionSource);
                    } catch (DeadObjectException e) {
/* 28 */                throw e;
                    } catch (RemoteException e2) {
/* 23 */                mo1333a(bc3.m1332e(e2));
                    } catch (RuntimeException e3) {
/* 15 */                taskCompletionSource.trySetException(e3);
                    }
                }

                @Override // p000.bc3
                /* JADX INFO: renamed from: d */
                public final void mo1336d(we2 we2Var, boolean z) {
/* 1 */             Boolean boolValueOf = Boolean.valueOf(z);
/* 7 */             Map map = (Map) we2Var.f18595b;
/* 9 */             TaskCompletionSource taskCompletionSource = this.f19021c;
/* 11 */            map.put(taskCompletionSource, boolValueOf);
/* 25 */            taskCompletionSource.getTask().addOnCompleteListener(new we2(15, we2Var, taskCompletionSource));
                }

                @Override // p000.gb3
                /* JADX INFO: renamed from: f */
                public final boolean mo3907f(cb3 cb3Var) {
/* 3 */             return this.f19020b.shouldAutoResolveMissingFeatures();
                }

                @Override // p000.gb3
                /* JADX INFO: renamed from: g */
                public final Feature[] mo3908g(cb3 cb3Var) {
/* 3 */             return this.f19020b.zab();
                }
            }
