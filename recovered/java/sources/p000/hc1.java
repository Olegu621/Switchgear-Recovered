            package p000;

            import io.sentry.C1697u2;
            import java.util.Iterator;
            import java.util.Map;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class hc1 {
                /* JADX INFO: renamed from: a */
                public static void m4163a(Object obj, Object obj2) {
/* 1 */             fc1 fc1Var = (fc1) obj;
/* 3 */             if (obj2 != null) {
/* 41 */                C1697u2.m5431g();
/* 44 */                return;
                    }
/* 9 */             if (fc1Var.isEmpty()) {
/* 26 */                return;
                    }
/* 16 */            Iterator it = fc1Var.entrySet().iterator();
/* 24 */            if (it.hasNext()) {
/* 31 */                Map.Entry entry = (Map.Entry) it.next();
/* 33 */                entry.getKey();
/* 36 */                entry.getValue();
/* 40 */                throw null;
                    }
                }

                /* JADX INFO: renamed from: b */
                public static fc1 m4164b(Object obj, Object obj2) {
/* 1 */             fc1 fc1VarM3713c = (fc1) obj;
/* 3 */             fc1 fc1Var = (fc1) obj2;
/* 9 */             if (!fc1Var.isEmpty()) {
/* 13 */                if (!fc1VarM3713c.f8123a) {
/* 15 */                    fc1VarM3713c = fc1VarM3713c.m3713c();
                        }
/* 19 */                fc1VarM3713c.m3712b();
/* 26 */                if (!fc1Var.isEmpty()) {
/* 28 */                    fc1VarM3713c.putAll(fc1Var);
                        }
                    }
/* 31 */            return fc1VarM3713c;
                }
            }
