            package p000;

            import android.view.View;
            import java.util.ArrayList;
            import java.util.Iterator;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class en0 {

                /* JADX INFO: renamed from: a */
                public static final jn0 f7805a = new jn0();

                /* JADX INFO: renamed from: b */
                public static final ln0 f7806b;

                static {
/* 8 */             ln0 ln0Var = null;
                    try {
/* 19 */                ln0Var = (ln0) qn0.class.getDeclaredConstructor(null).newInstance(null);
                    } catch (Exception unused) {
                    }
/* 22 */            f7806b = ln0Var;
                }

                /* JADX INFO: renamed from: a */
                public static final void m3522a(int i, ArrayList arrayList) {
/* 1 */             arrayList.getClass();
/* 4 */             Iterator it = arrayList.iterator();
/* 12 */            while (it.hasNext()) {
/* 20 */                ((View) it.next()).setVisibility(i);
                    }
                }
            }
