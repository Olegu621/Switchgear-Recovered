            package p000;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class j02 {

                /* JADX INFO: renamed from: b */
                public static final i02 f11985b = new i02(true, null, null);

                /* JADX INFO: renamed from: c */
                public static final j02 f11986c = new j02();

                /* JADX INFO: renamed from: a */
                public final bl1 f11987a = new bl1(f11985b);

                /* JADX INFO: renamed from: a */
                public final void m5631a(o80 o80Var, c00 c00Var) {
                    vg2 vg2Var;
/* 1 */             bl1 bl1Var = this.f11987a;
/* 5 */             ts0 ts0Var = new ts0(c00Var);
                    synchronized (bl1Var.f2516a) {
/* 17 */                vg2 vg2Var2 = (vg2) bl1Var.f2520e.remove(ts0Var);
/* 20 */                if (vg2Var2 != null) {
/* 24 */                    vg2Var2.f18058c.set(false);
/* 29 */                    bl1Var.f2521f.remove(vg2Var2);
                        }
/* 36 */                vg2Var = new vg2(bl1Var.f2517b, o80Var, ts0Var);
/* 41 */                bl1Var.f2520e.put(ts0Var, vg2Var);
/* 46 */                bl1Var.f2521f.add(vg2Var);
                    }
/* 50 */            vg2Var.m9267a(0);
                }
            }
