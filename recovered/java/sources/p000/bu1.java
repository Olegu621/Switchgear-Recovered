            package p000;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class bu1 {

                /* JADX INFO: renamed from: a */
                public static final bu1 f2607a;

                /* JADX INFO: renamed from: b */
                public static final bu1 f2608b;

                /* JADX INFO: renamed from: c */
                public static final bu1 f2609c;

                /* JADX INFO: renamed from: d */
                public static final bu1 f2610d;

                /* JADX INFO: renamed from: e */
                public static final bu1 f2611e;

                /* JADX INFO: renamed from: f */
                public static final /* synthetic */ bu1[] f2612f;

                static {
/* 6 */             bu1 bu1Var = new bu1("ACCEPT_ALL", 0);
/* 9 */             f2607a = bu1Var;
/* 16 */            bu1 bu1Var2 = new bu1("DENY_ALL", 1);
/* 19 */            f2608b = bu1Var2;
/* 26 */            bu1 bu1Var3 = new bu1("OK", 2);
/* 29 */            f2609c = bu1Var3;
/* 36 */            bu1 bu1Var4 = new bu1("SAVE_SETTINGS", 3);
/* 39 */            f2610d = bu1Var4;
/* 46 */            bu1 bu1Var5 = new bu1("MANAGE_SETTINGS", 4);
/* 49 */            f2611e = bu1Var5;
/* 55 */            f2612f = new bu1[]{bu1Var, bu1Var2, bu1Var3, bu1Var4, bu1Var5};
                }

                public static bu1 valueOf(String str) {
/* 7 */             return (bu1) Enum.valueOf(bu1.class, str);
                }

                public static bu1[] values() {
/* 7 */             return (bu1[]) f2612f.clone();
                }
            }
