            package p000;

            import android.p003os.OutcomeReceiver;
            import java.util.concurrent.atomic.AtomicBoolean;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class f10 extends AtomicBoolean implements OutcomeReceiver {

                /* JADX INFO: renamed from: a */
                private final c10 f7963a;

                public f10(C0890er c0890er) {
/* 2 */             super(false);
/* 5 */             this.f7963a = c0890er;
                }

                public final void onError(Throwable th) {
/* 7 */             if (compareAndSet(false, true)) {
/* 9 */                 c10 c10Var = this.f7963a;
/* 11 */                m42 m42Var = o42.f14612b;
/* 17 */                c10Var.resumeWith(pg3.m7426e(th));
                    }
                }

                public final void onResult(Object obj) {
/* 7 */             if (compareAndSet(false, true)) {
/* 9 */                 c10 c10Var = this.f7963a;
/* 11 */                m42 m42Var = o42.f14612b;
/* 13 */                c10Var.resumeWith(obj);
                    }
                }

                @Override // java.util.concurrent.atomic.AtomicBoolean
                public final String toString() {
/* 20 */            return "ContinuationOutcomeReceiver(outcomeReceived = " + get() + ')';
                }
            }
