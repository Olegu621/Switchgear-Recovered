            package p000;

            import io.sentry.C1697u2;
            import java.util.Iterator;
            import java.util.Map;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class np3 {
                /* JADX INFO: renamed from: a */
                public static final void m7019a(Object obj, Object obj2) {
/* 1 */             lp3 lp3Var = (lp3) obj;
/* 3 */             if (obj2 != null) {
/* 41 */                C1697u2.m5431g();
/* 44 */                return;
                    }
/* 9 */             if (lp3Var.isEmpty()) {
/* 26 */                return;
                    }
/* 16 */            Iterator it = lp3Var.entrySet().iterator();
/* 24 */            if (it.hasNext()) {
/* 31 */                Map.Entry entry = (Map.Entry) it.next();
/* 33 */                entry.getKey();
/* 36 */                entry.getValue();
/* 40 */                throw null;
                    }
                }

                /* JADX INFO: renamed from: b */
                public static final lp3 m7020b(Object obj, Object obj2) {
/* 1 */             lp3 lp3Var = (lp3) obj;
/* 3 */             lp3 lp3Var2 = (lp3) obj2;
/* 9 */             if (!lp3Var2.isEmpty()) {
/* 13 */                if (!lp3Var.f13449a) {
/* 19 */                    if (lp3Var.isEmpty()) {
/* 23 */                        lp3Var = new lp3();
                            } else {
/* 29 */                        lp3 lp3Var3 = new lp3(lp3Var);
/* 33 */                        lp3Var3.f13449a = true;
/* 35 */                        lp3Var = lp3Var3;
                            }
                        }
/* 36 */                lp3Var.m6517a();
/* 43 */                if (!lp3Var2.isEmpty()) {
/* 45 */                    lp3Var.putAll(lp3Var2);
                        }
                    }
/* 48 */            return lp3Var;
                }
            }
