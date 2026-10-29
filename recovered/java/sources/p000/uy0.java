            package p000;

            import kotlin.text.C1852e;
            import kotlin.text.CharsKt;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class uy0 {
                /* JADX INFO: renamed from: a */
                public static long m9146a(int i, String str) throws C0900f0 {
/* 1 */             str.getClass();
/* 8 */             int i2 = 2;
/* 9 */             if (i == str.length()) {
/* 15 */                return Long.parseLong(str, CharsKt.checkRadix(2));
                    }
/* 27 */            throw new C0900f0("Invalid Bit Length", i2);
                }

                /* JADX INFO: renamed from: b */
                public static String m9147b(uh2 uh2Var, int i) throws C0900f0 {
/* 12 */            Integer numValueOf = uh2Var instanceof uh2 ? Integer.valueOf(uh2Var.f17529a) : null;
/* 13 */            int i2 = 3;
/* 14 */            if (numValueOf == null) {
/* 112 */               throw new C0900f0("Invalid value: " + uh2Var, i2);
                    }
/* 25 */            String string = Integer.toString(numValueOf.intValue(), CharsKt.checkRadix(2));
/* 29 */            string.getClass();
/* 36 */            if (string.length() <= i && numValueOf.intValue() >= 0) {
                        return string.length() < i ? fm0.m3783i(C1852e.m6260j(i - string.length(), "0"), string) : string;
                    }
/* 92 */            throw new C0900f0(uh2Var + " too large to encode into " + i, i2);
                }
            }
