            package p000;

            import android.content.Context;
            import android.os.Looper;
            
            /* JADX INFO: renamed from: w8 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 7 */     public abstract class AbstractC2322w8 extends AbstractC0208c9 {
                public InterfaceC0836d9 buildClient(Context context, Looper looper, C2345wv c2345wv, Object obj, InterfaceC2478xy interfaceC2478xy, wp1 wp1Var) {
/* 8 */             throw new UnsupportedOperationException("buildClient must be implemented");
                }

                @Deprecated
/* 8 */         public InterfaceC0836d9 buildClient(Context context, Looper looper, C2345wv c2345wv, Object obj, rr0 rr0Var, sr0 sr0Var) {
/* 9 */             return buildClient(context, looper, c2345wv, obj, (InterfaceC2478xy) rr0Var, (wp1) sr0Var);
                }
            }
