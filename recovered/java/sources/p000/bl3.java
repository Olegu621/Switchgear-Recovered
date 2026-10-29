            package p000;

            import java.util.Locale;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class bl3 {

                /* JADX INFO: renamed from: a */
                public String f2531a;

                /* JADX INFO: renamed from: a */
                public static bl3 m1393a(String str) {
/* 13 */            kb1.m6054g(str == null || !str.isEmpty());
/* 16 */            if (str == null) {
/* 18 */                return null;
                    }
/* 22 */            bl3 bl3Var = new bl3();
/* 31 */            bl3Var.f2531a = str.toLowerCase(Locale.US);
/* 33 */            return bl3Var;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (obj == this) {
/* 3 */                 return true;
                    }
/* 5 */             if (obj == null || obj.getClass() != bl3.class) {
/* 27 */                return false;
                    }
/* 22 */            return this.f2531a.equals(((bl3) obj).f2531a);
                }

                public final int hashCode() {
/* 3 */             return this.f2531a.hashCode();
                }

                public final String toString() {
/* 1 */             return this.f2531a;
                }
            }
