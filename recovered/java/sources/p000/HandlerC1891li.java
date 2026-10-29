            package p000;

            import android.os.Message;
            import android.util.Pair;
            import com.google.android.gms.common.api.Status;
            import com.google.android.gms.common.api.internal.BasePendingResult;
            import com.google.android.gms.internal.base.zau;
            import io.sentry.android.core.AbstractC1245n0;
            
            /* JADX INFO: renamed from: li */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class HandlerC1891li extends zau {
                /* JADX INFO: renamed from: a */
                public final void m6453a(q42 q42Var, p42 p42Var) {
/* 1 */             int i = BasePendingResult.zad;
/* 3 */             kb1.m6061n(q42Var);
/* 16 */            sendMessage(obtainMessage(1, new Pair(q42Var, p42Var)));
                }

                @Override // android.os.Handler
                public final void handleMessage(Message message) {
/* 1 */             int i = message.what;
/* 4 */             if (i != 1) {
/* 7 */                 if (i != 2) {
/* 22 */                    AbstractC1245n0.m4893u("BasePendingResult", fm0.m3781g(i, "Don't know how to handle message: "), new Exception());
/* 25 */                    return;
                        } else {
/* 32 */                    ((BasePendingResult) message.obj).forceFailureUnlessReady(Status.f3443v);
/* 35 */                    return;
                        }
                    }
/* 38 */            Pair pair = (Pair) message.obj;
/* 42 */            q42 q42Var = (q42) pair.first;
/* 46 */            p42 p42Var = (p42) pair.second;
                    try {
/* 48 */                q42Var.onResult(p42Var);
                    } catch (RuntimeException e) {
/* 53 */                BasePendingResult.zal(p42Var);
/* 56 */                throw e;
                    }
                }
            }
