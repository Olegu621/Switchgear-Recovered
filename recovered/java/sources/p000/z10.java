            package p000;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class z10 {

                /* JADX INFO: renamed from: a */
                public static final z10 f19902a;

                /* JADX INFO: renamed from: b */
                public static final /* synthetic */ z10[] f19903b;

                static {
/* 6 */             z10 z10Var = new z10("COROUTINE_SUSPENDED", 0);
/* 9 */             f19902a = z10Var;
/* 31 */            f19903b = new z10[]{z10Var, new z10("UNDECIDED", 1), new z10("RESUMED", 2)};
                }

                public static z10 valueOf(String str) {
/* 7 */             return (z10) Enum.valueOf(z10.class, str);
                }

                public static z10[] values() {
/* 7 */             return (z10[]) f19903b.clone();
                }
            }
