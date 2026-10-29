            package p000;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class b20 {

                /* JADX INFO: renamed from: a */
                public static final b20 f2175a;

                /* JADX INFO: renamed from: b */
                public static final b20 f2176b;

                /* JADX INFO: renamed from: c */
                public static final /* synthetic */ b20[] f2177c;

                static {
/* 6 */             b20 b20Var = new b20("DEFAULT", 0);
/* 9 */             f2175a = b20Var;
/* 16 */            b20 b20Var2 = new b20("LAZY", 1);
/* 24 */            b20 b20Var3 = new b20("ATOMIC", 2);
/* 27 */            f2176b = b20Var3;
/* 41 */            f2177c = new b20[]{b20Var, b20Var2, b20Var3, new b20("UNDISPATCHED", 3)};
                }

                public static b20 valueOf(String str) {
/* 7 */             return (b20) Enum.valueOf(b20.class, str);
                }

                public static b20[] values() {
/* 7 */             return (b20[]) f2177c.clone();
                }
            }
