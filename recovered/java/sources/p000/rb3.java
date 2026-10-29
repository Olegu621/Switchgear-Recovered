            package p000;

            import android.os.Looper;
            import com.google.android.gms.common.api.Status;
            import io.sentry.android.core.AbstractC1245n0;
            import java.lang.ref.WeakReference;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class rb3 extends dr2 implements q42 {

                /* JADX INFO: renamed from: a */
                public rb3 f15966a = null;

                /* JADX INFO: renamed from: b */
                public final Object f15967b = new Object();

                /* JADX INFO: renamed from: c */
                public final WeakReference f15968c;

                public rb3(WeakReference weakReference) {
/* 16 */            kb1.m6062o(weakReference, "GoogleApiClient reference must not be null");
/* 19 */            this.f15968c = weakReference;
/* 25 */            tr0 tr0Var = (tr0) weakReference.get();
/* 44 */            new nb3(this, tr0Var != null ? ((eb3) tr0Var).f7609b.getLooper() : Looper.getMainLooper());
                }

                /* JADX INFO: renamed from: a */
                public final void m8130a(Status status) {
                    synchronized (this.f15967b) {
                        synchronized (this.f15967b) {
                        }
                    }
                }

                @Override // p000.q42
                public final void onResult(p42 p42Var) {
                    synchronized (this.f15967b) {
/* 12 */                if (p42Var.getStatus().m2006D1()) {
                        } else {
/* 27 */                    m8130a(p42Var.getStatus());
/* 32 */                    if (p42Var instanceof b32) {
                                try {
/* 37 */                            ((b32) p42Var).release();
                                } catch (RuntimeException e) {
/* 54 */                            AbstractC1245n0.m4891s("TransformedResultImpl", "Unable to release ".concat(String.valueOf(p42Var)), e);
                                }
                            }
                        }
                    }
                }
            }
