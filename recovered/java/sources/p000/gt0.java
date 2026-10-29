            package p000;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class gt0 extends RuntimeException {

                /* JADX INFO: renamed from: a */
                public final String f8805a;

                /* JADX INFO: renamed from: b */
                public final Exception f8806b;

                /* JADX INFO: renamed from: c */
                public final ym1 f8807c;

                public gt0(Exception exc, ym1 ym1Var, String str) {
/* 1 */             super(str, exc);
/* 4 */             this.f8806b = exc;
/* 6 */             this.f8807c = ym1Var;
/* 8 */             this.f8805a = str;
                }

                /* JADX INFO: renamed from: a */
                public static gt0 m4014a(Exception exc, ym1 ym1Var, String str) {
/* 3 */             if (exc instanceof gt0) {
/* 5 */                 gt0 gt0Var = (gt0) exc;
/* 7 */                 Exception exc2 = gt0Var.f8806b;
/* 9 */                 if (str == null) {
/* 11 */                    str = gt0Var.f8805a;
                        }
/* 14 */                exc = exc2;
                    }
/* 17 */            return new gt0(exc, ym1Var, str);
                }
            }
