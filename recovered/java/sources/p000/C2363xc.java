            package p000;
            
            /* JADX INFO: renamed from: xc */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C2363xc extends py0 {

                /* JADX INFO: renamed from: l */
                public static volatile C2363xc f19023l;

                /* JADX INFO: renamed from: k */
                public final z60 f19024k;

                public C2363xc() {
/* 3 */             super(17);
/* 11 */            this.f19024k = new z60();
                }

                /* JADX INFO: renamed from: y0 */
                public static C2363xc m9748y0() {
/* 3 */             if (f19023l != null) {
/* 5 */                 return f19023l;
                    }
                    synchronized (C2363xc.class) {
                        try {
/* 13 */                    if (f19023l == null) {
/* 20 */                        f19023l = new C2363xc();
                            }
                        } catch (Throwable th) {
/* 30 */                    throw th;
                        }
                    }
/* 26 */            return f19023l;
                }
            }
