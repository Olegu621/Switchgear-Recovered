            package p000;

            import java.util.Locale;
            import kotlin.jvm.functions.Function2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class f92 {
                /* JADX INFO: renamed from: a */
                public static ql2 m3682a(ql2 ql2Var) throws C0900f0 {
/* 1 */             ql2Var.getClass();
/* 4 */             wp0 wp0Var = ql2Var.f15623b;
/* 9 */             if (!wp0Var.f18728k) {
/* 80 */                throw new C0900f0("Unable to encode TCModel tcModel.gvl.readyPromise is not resolved", 3);
                    }
/* 15 */            String upperCase = wp0Var.f18730m.toUpperCase(Locale.ROOT);
/* 19 */            upperCase.getClass();
/* 22 */            ql2Var.f15631j = upperCase;
/* 24 */            Integer num = wp0Var.f18721d;
/* 26 */            if (num != null) {
/* 37 */                ql2Var.m7950h(new uh2(num.intValue()));
                    }
                    try {
/* 56 */                return (ql2) ((Function2) g92.f8520a.get(ql2Var.f15628g - 1)).invoke(ql2Var, wp0Var);
                    } catch (Throwable unused) {
/* 72 */                throw new C0900f0(fm0.m3781g(ql2Var.f15628g, "Invalid version "), 3);
                    }
                }
            }
