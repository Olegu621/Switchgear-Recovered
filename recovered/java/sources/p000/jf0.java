            package p000;

            import java.io.PrintWriter;
            import java.io.StringWriter;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class jf0 {
                /* JADX INFO: renamed from: a */
                public static void m5798a(Throwable th, Throwable th2) {
/* 1 */             th.getClass();
/* 4 */             th2.getClass();
/* 7 */             if (th != th2) {
/* 11 */                yy1.f19859b.mo12a(th, th2);
                    }
                }

                /* JADX INFO: renamed from: b */
                public static String m5799b(Throwable th) {
/* 1 */             th.getClass();
/* 6 */             StringWriter stringWriter = new StringWriter();
/* 11 */            PrintWriter printWriter = new PrintWriter(stringWriter);
/* 14 */            th.printStackTrace(printWriter);
/* 17 */            printWriter.flush();
/* 20 */            String string = stringWriter.toString();
/* 24 */            string.getClass();
/* 27 */            return string;
                }
            }
