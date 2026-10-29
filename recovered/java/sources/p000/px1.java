            package p000;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class px1 {

                /* JADX INFO: renamed from: a */
                public static final px1 f15322a;

                /* JADX INFO: renamed from: b */
                public static final px1 f15323b;

                /* JADX INFO: renamed from: c */
                public static final px1 f15324c;

                /* JADX INFO: renamed from: d */
                public static final /* synthetic */ px1[] f15325d;

                static {
/* 6 */             px1 px1Var = new px1("DEFAULT", 0);
/* 9 */             f15322a = px1Var;
/* 16 */            px1 px1Var2 = new px1("VERY_LOW", 1);
/* 19 */            f15323b = px1Var2;
/* 26 */            px1 px1Var3 = new px1("HIGHEST", 2);
/* 29 */            f15324c = px1Var3;
/* 35 */            f15325d = new px1[]{px1Var, px1Var2, px1Var3};
                }

                public static px1 valueOf(String str) {
/* 7 */             return (px1) Enum.valueOf(px1.class, str);
                }

                public static px1[] values() {
/* 7 */             return (px1[]) f15325d.clone();
                }
            }
