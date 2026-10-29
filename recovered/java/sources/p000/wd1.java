            package p000;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class wd1 {

                /* JADX INFO: renamed from: a */
                public static final wd1 f18585a;

                /* JADX INFO: renamed from: b */
                public static final wd1 f18586b;

                /* JADX INFO: renamed from: c */
                public static final wd1 f18587c;

                /* JADX INFO: renamed from: d */
                public static final /* synthetic */ wd1[] f18588d;

                static {
/* 6 */             wd1 wd1Var = new wd1("Linear", 0);
/* 9 */             f18585a = wd1Var;
/* 16 */            wd1 wd1Var2 = new wd1("NonLinear", 1);
/* 19 */            f18586b = wd1Var2;
/* 26 */            wd1 wd1Var3 = new wd1("Companion", 2);
/* 29 */            f18587c = wd1Var3;
/* 35 */            f18588d = new wd1[]{wd1Var, wd1Var2, wd1Var3};
                }

                public static wd1 valueOf(String str) {
/* 7 */             return (wd1) Enum.valueOf(wd1.class, str);
                }

                public static wd1[] values() {
/* 7 */             return (wd1[]) f18588d.clone();
                }

                @Override // java.lang.Enum
                public final String toString() {
/* 1 */             int iOrdinal = ordinal();
/* 5 */             if (iOrdinal == 0) {
/* 24 */                return "linear";
                    }
/* 8 */             if (iOrdinal == 1) {
/* 21 */                return "nonlinear";
                    }
/* 11 */            if (iOrdinal == 2) {
/* 13 */                return "companion";
                    }
/* 16 */            ds0.m3187b();
/* 19 */            return null;
                }
            }
