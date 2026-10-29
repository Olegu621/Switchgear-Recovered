            package p000;

            import java.util.concurrent.TimeUnit;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class jb0 {
                /* JADX INFO: renamed from: a */
                public static final double m5734a(double d, ib0 ib0Var, ib0 ib0Var2) {
/* 1 */             TimeUnit timeUnit = ib0Var2.f9526a;
/* 3 */             TimeUnit timeUnit2 = ib0Var.f9526a;
/* 7 */             long jConvert = timeUnit.convert(1L, timeUnit2);
                    return jConvert > 0 ? d * jConvert : d / timeUnit2.convert(1L, timeUnit);
                }
            }
