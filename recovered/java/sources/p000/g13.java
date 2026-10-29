            package p000;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class g13 {

                /* JADX INFO: renamed from: a */
                public static final g13 f8432a;

                /* JADX INFO: renamed from: b */
                public static final g13 f8433b;

                /* JADX INFO: renamed from: c */
                public static final g13 f8434c;

                /* JADX INFO: renamed from: d */
                public static final /* synthetic */ g13[] f8435d;

                static {
/* 6 */             g13 g13Var = new g13("DEFAULT", 0);
/* 9 */             f8432a = g13Var;
/* 16 */            g13 g13Var2 = new g13("CCPA", 1);
/* 19 */            f8433b = g13Var2;
/* 26 */            g13 g13Var3 = new g13("TCF", 2);
/* 29 */            f8434c = g13Var3;
/* 35 */            f8435d = new g13[]{g13Var, g13Var2, g13Var3};
                }

                public static g13 valueOf(String str) {
/* 7 */             return (g13) Enum.valueOf(g13.class, str);
                }

                public static g13[] values() {
/* 7 */             return (g13[]) f8435d.clone();
                }
            }
