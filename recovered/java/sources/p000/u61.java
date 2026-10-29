            package p000;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class u61 {

                /* JADX INFO: renamed from: a */
                public static final u61 f17374a;

                /* JADX INFO: renamed from: b */
                public static final u61 f17375b;

                /* JADX INFO: renamed from: c */
                public static final u61 f17376c;

                /* JADX INFO: renamed from: d */
                public static final u61 f17377d;

                /* JADX INFO: renamed from: e */
                public static final u61 f17378e;

                /* JADX INFO: renamed from: f */
                public static final /* synthetic */ u61[] f17379f;

                static {
/* 6 */             u61 u61Var = new u61("DESTROYED", 0);
/* 9 */             f17374a = u61Var;
/* 16 */            u61 u61Var2 = new u61("INITIALIZED", 1);
/* 19 */            f17375b = u61Var2;
/* 26 */            u61 u61Var3 = new u61("CREATED", 2);
/* 29 */            f17376c = u61Var3;
/* 36 */            u61 u61Var4 = new u61("STARTED", 3);
/* 39 */            f17377d = u61Var4;
/* 46 */            u61 u61Var5 = new u61("RESUMED", 4);
/* 49 */            f17378e = u61Var5;
/* 55 */            f17379f = new u61[]{u61Var, u61Var2, u61Var3, u61Var4, u61Var5};
                }

                public static u61 valueOf(String str) {
/* 7 */             return (u61) Enum.valueOf(u61.class, str);
                }

                public static u61[] values() {
/* 7 */             return (u61[]) f17379f.clone();
                }
            }
