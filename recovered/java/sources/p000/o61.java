            package p000;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class o61 {

                /* JADX INFO: renamed from: a */
                public static final o61 f14643a;

                /* JADX INFO: renamed from: b */
                public static final o61 f14644b;

                /* JADX INFO: renamed from: c */
                public static final o61 f14645c;

                /* JADX INFO: renamed from: d */
                public static final o61 f14646d;

                /* JADX INFO: renamed from: e */
                public static final /* synthetic */ o61[] f14647e;

                static {
/* 6 */             o61 o61Var = new o61("FIRST_LAYER_ONLY", 0);
/* 9 */             f14643a = o61Var;
/* 16 */            o61 o61Var2 = new o61("SECOND_LAYER_ONLY", 1);
/* 19 */            f14644b = o61Var2;
/* 26 */            o61 o61Var3 = new o61("BOTH", 2);
/* 29 */            f14645c = o61Var3;
/* 36 */            o61 o61Var4 = new o61("HIDDEN", 3);
/* 39 */            f14646d = o61Var4;
/* 45 */            f14647e = new o61[]{o61Var, o61Var2, o61Var3, o61Var4};
                }

                public static o61 valueOf(String str) {
/* 7 */             return (o61) Enum.valueOf(o61.class, str);
                }

                public static o61[] values() {
/* 7 */             return (o61[]) f14647e.clone();
                }
            }
