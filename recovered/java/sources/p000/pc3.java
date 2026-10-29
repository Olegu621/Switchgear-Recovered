            package p000;

            import android.content.Context;
            import java.util.Iterator;
            import java.util.Set;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class pc3 {

                /* JADX INFO: renamed from: a */
                public static final ha1 f15068a = new ha1("GoogleSignInCommon", new String[0]);

                /* JADX INFO: renamed from: a */
                public static void m7388a(Context context) {
/* 5 */             qc3.m7763m(context).m7770n();
/* 8 */             Set set = tr0.f17239a;
                    synchronized (set) {
                    }
/* 12 */            Iterator it = set.iterator();
/* 20 */            if (!it.hasNext()) {
/* 22 */                ur0.m9123a();
                    } else {
/* 32 */                ((tr0) it.next()).getClass();
/* 35 */                f42.m3660p();
                    }
                }
            }
