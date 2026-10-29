            package p000;

            import java.io.Closeable;
            import java.io.IOException;
            import java.util.HashMap;
            import java.util.LinkedHashSet;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class q33 {

                /* JADX INFO: renamed from: a */
                public final HashMap f15382a = new HashMap();

                /* JADX INFO: renamed from: b */
                public final LinkedHashSet f15383b = new LinkedHashSet();

                /* JADX INFO: renamed from: c */
                public volatile boolean f15384c = false;

                /* JADX INFO: renamed from: a */
                public static void m7694a(Object obj) {
/* 3 */             if (obj instanceof Closeable) {
                        try {
/* 7 */                     ((Closeable) obj).close();
                        } catch (IOException e) {
/* 12 */                    ds0.m3199p(e);
                        }
                    }
                }

                /* JADX INFO: renamed from: b */
                public void mo729b() {
                }
            }
