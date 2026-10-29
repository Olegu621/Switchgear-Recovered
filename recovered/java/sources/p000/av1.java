            package p000;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class av1 {

                /* JADX INFO: renamed from: a */
                public static final av1 f2105a;

                /* JADX INFO: renamed from: b */
                public static final av1 f2106b;

                /* JADX INFO: renamed from: c */
                public static final av1 f2107c;

                /* JADX INFO: renamed from: d */
                public static final av1 f2108d;

                /* JADX INFO: renamed from: e */
                public static final /* synthetic */ av1[] f2109e;

                static {
/* 6 */             av1 av1Var = new av1("ACCEPT_ALL", 0);
/* 9 */             f2105a = av1Var;
/* 16 */            av1 av1Var2 = new av1("DENY_ALL", 1);
/* 19 */            f2106b = av1Var2;
/* 26 */            av1 av1Var3 = new av1("GRANULAR", 2);
/* 29 */            f2107c = av1Var3;
/* 36 */            av1 av1Var4 = new av1("NO_INTERACTION", 3);
/* 39 */            f2108d = av1Var4;
/* 45 */            f2109e = new av1[]{av1Var, av1Var2, av1Var3, av1Var4};
                }

                public static av1 valueOf(String str) {
/* 7 */             return (av1) Enum.valueOf(av1.class, str);
                }

                public static av1[] values() {
/* 7 */             return (av1[]) f2109e.clone();
                }
            }
