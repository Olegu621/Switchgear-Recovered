            package p000;

            import io.sentry.android.core.AbstractC1245n0;
            import java.util.concurrent.CancellationException;
            import java.util.concurrent.ExecutionException;
            import java.util.concurrent.FutureTask;
            import java.util.concurrent.atomic.AtomicBoolean;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class oj1 extends FutureTask {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ RunnableC2289vd f14779a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public oj1(RunnableC2289vd runnableC2289vd, CallableC2139rc callableC2139rc) {
/* 3 */             super(callableC2139rc);
/* 1 */             this.f14779a = runnableC2289vd;
                }

                @Override // java.util.concurrent.FutureTask
                public final void done() {
/* 3 */             RunnableC2289vd runnableC2289vd = this.f14779a;
/* 5 */             AtomicBoolean atomicBoolean = runnableC2289vd.f18008e;
                    try {
/* 7 */                 Object obj = get();
/* 15 */                if (atomicBoolean.get()) {
/* 52 */                    return;
                        }
/* 17 */                runnableC2289vd.m9254b(obj);
                    } catch (InterruptedException e) {
/* 49 */                AbstractC1245n0.m4890r("AsyncTask", e);
                    } catch (CancellationException unused) {
/* 30 */                if (atomicBoolean.get()) {
/* 52 */                    return;
                        }
/* 33 */                runnableC2289vd.m9254b(null);
                    } catch (ExecutionException e2) {
/* 42 */                ds0.m3198o("An error occurred while executing doInBackground()", e2.getCause());
                    } catch (Throwable th) {
/* 22 */                ds0.m3198o("An error occurred while executing doInBackground()", th);
                    }
                }
            }
