            package p000;

            import android.os.Trace;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class nq2 {
                /* JADX INFO: renamed from: a */
                public static void m7030a(String str, int i) {
/* 1 */             Trace.beginAsyncSection(str, i);
                }

                /* JADX INFO: renamed from: b */
                public static void m7031b(String str, int i) {
/* 1 */             Trace.endAsyncSection(str, i);
                }

                /* JADX INFO: renamed from: c */
                public static boolean m7032c() {
/* 1 */             return Trace.isEnabled();
                }

                /* JADX INFO: renamed from: d */
                public static void m7033d(int i, String str) {
/* 2 */             Trace.setCounter(str, i);
                }
            }
