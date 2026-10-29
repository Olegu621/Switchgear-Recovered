            package p000;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class w10 {

                /* JADX INFO: renamed from: a */
                public static final w10 f18410a;

                /* JADX INFO: renamed from: b */
                public static final w10 f18411b;

                /* JADX INFO: renamed from: c */
                public static final w10 f18412c;

                /* JADX INFO: renamed from: d */
                public static final w10 f18413d;

                /* JADX INFO: renamed from: e */
                public static final w10 f18414e;

                /* JADX INFO: renamed from: f */
                public static final /* synthetic */ w10[] f18415f;

                static {
/* 6 */             w10 w10Var = new w10("CPU_ACQUIRED", 0);
/* 9 */             f18410a = w10Var;
/* 16 */            w10 w10Var2 = new w10("BLOCKING", 1);
/* 19 */            f18411b = w10Var2;
/* 26 */            w10 w10Var3 = new w10("PARKING", 2);
/* 29 */            f18412c = w10Var3;
/* 36 */            w10 w10Var4 = new w10("DORMANT", 3);
/* 39 */            f18413d = w10Var4;
/* 46 */            w10 w10Var5 = new w10("TERMINATED", 4);
/* 49 */            f18414e = w10Var5;
/* 55 */            f18415f = new w10[]{w10Var, w10Var2, w10Var3, w10Var4, w10Var5};
                }

                public static w10 valueOf(String str) {
/* 7 */             return (w10) Enum.valueOf(w10.class, str);
                }

                public static w10[] values() {
/* 7 */             return (w10[]) f18415f.clone();
                }
            }
