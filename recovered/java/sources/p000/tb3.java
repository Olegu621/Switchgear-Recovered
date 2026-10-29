            package p000;

            import android.os.DeadObjectException;
            import com.google.android.gms.common.api.Status;
            import io.sentry.android.core.AbstractC1245n0;
            import java.util.Map;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class tb3 extends bc3 {

                /* JADX INFO: renamed from: b */
                public final AbstractC0955gi f17027b;

                public tb3(int i, AbstractC0955gi abstractC0955gi) {
/* 1 */             super(i);
/* 6 */             kb1.m6062o(abstractC0955gi, "Null methods are not runnable.");
/* 9 */             this.f17027b = abstractC0955gi;
                }

                @Override // p000.bc3
                /* JADX INFO: renamed from: a */
                public final void mo1333a(Status status) {
                    try {
/* 3 */                 this.f17027b.setFailedResult(status);
                    } catch (IllegalStateException e) {
/* 12 */                AbstractC1245n0.m4891s("ApiCallRunner", "Exception reporting failure", e);
                    }
                }

                @Override // p000.bc3
                /* JADX INFO: renamed from: b */
                public final void mo1334b(Exception exc) {
                    try {
/* 29 */                this.f17027b.setFailedResult(new Status(10, AbstractC0886en.m3508l(exc.getClass().getSimpleName(), ": ", exc.getLocalizedMessage()), null, null));
                    } catch (IllegalStateException e) {
/* 38 */                AbstractC1245n0.m4891s("ApiCallRunner", "Exception reporting failure", e);
                    }
                }

                @Override // p000.bc3
                /* JADX INFO: renamed from: c */
                public final void mo1335c(cb3 cb3Var) throws DeadObjectException {
                    try {
/* 5 */                 this.f17027b.run(cb3Var.f2821b);
                    } catch (RuntimeException e) {
/* 10 */                mo1334b(e);
                    }
                }

                @Override // p000.bc3
                /* JADX INFO: renamed from: d */
                public final void mo1336d(we2 we2Var, boolean z) {
/* 1 */             Boolean boolValueOf = Boolean.valueOf(z);
/* 7 */             Map map = (Map) we2Var.f18596c;
/* 9 */             AbstractC0955gi abstractC0955gi = this.f17027b;
/* 11 */            map.put(abstractC0955gi, boolValueOf);
/* 19 */            abstractC0955gi.addStatusListener(new xa3(we2Var, abstractC0955gi));
                }
            }
