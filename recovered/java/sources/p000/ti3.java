            package p000;

            import java.util.HashMap;
            import java.util.Iterator;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 31 */    public final class ti3 {

                /* JADX INFO: renamed from: d */
                public static final qi3 f17116d = new qi3(0);

                /* JADX INFO: renamed from: e */
                public static final si3 f17117e = new si3(0);

                /* JADX INFO: renamed from: a */
                public final HashMap f17118a;

                /* JADX INFO: renamed from: b */
                public final HashMap f17119b;

                /* JADX INFO: renamed from: c */
                public si3 f17120c;

                public ti3(ti3 ti3Var) {
/* 6 */             HashMap map = new HashMap();
/* 9 */             this.f17118a = map;
/* 13 */            HashMap map2 = new HashMap();
/* 16 */            this.f17119b = map2;
/* 20 */            map.putAll(ti3Var.f17118a);
/* 25 */            map2.putAll(ti3Var.f17119b);
/* 30 */            this.f17120c = ti3Var.f17120c;
                }

                /* JADX INFO: renamed from: a */
                public void m8791a(ph3 ph3Var, Object obj, ii3 ii3Var) {
/* 7 */             qi3 qi3Var = (qi3) this.f17118a.get(ph3Var);
/* 11 */            if (qi3Var == null) {
/* 46 */                if (!ph3Var.f15134d || ((xk3) xk3.f19242b.get()).f19243a <= 20) {
/* 66 */                    ph3Var.mo1656b(obj, ii3Var);
/* 69 */                    return;
                        } else {
/* 62 */                    ii3Var.m4549a(ph3Var.f15131a, obj);
/* 65 */                    return;
                        }
                    }
                    switch (qi3Var.f15578a) {
                        case 0:
                            break;
                        default:
/* 20 */                    if (ph3Var.f15134d && ((xk3) xk3.f19242b.get()).f19243a > 20) {
/* 36 */                        ii3Var.m4549a(ph3Var.f15131a, obj);
                            } else {
/* 40 */                        ph3Var.mo1656b(obj, ii3Var);
                            }
                            break;
                    }
                }

                /* JADX INFO: renamed from: b */
                public void m8792b(ph3 ph3Var, Iterator it, ii3 ii3Var) {
/* 7 */             si3 si3Var = (si3) this.f17119b.get(ph3Var);
/* 9 */             if (si3Var != null) {
                        switch (si3Var.f16650a) {
                            case 0:
                                break;
                            default:
/* 16 */                        ph3Var.m7452c(it, ii3Var);
                                break;
                        }
/* 19 */                return;
                    }
/* 22 */            if (this.f17120c != null && !this.f17118a.containsKey(ph3Var)) {
/* 33 */                ph3Var.m7452c(it, ii3Var);
                    } else {
/* 41 */                while (it.hasNext()) {
/* 47 */                    m8791a(ph3Var, it.next(), ii3Var);
                        }
                    }
                }

/* 32 */        public /* synthetic */ ti3() {
                    this.f17118a = new HashMap();
/* 34 */            this.f17119b = new HashMap();
                    this.f17120c = null;
                }
            }
