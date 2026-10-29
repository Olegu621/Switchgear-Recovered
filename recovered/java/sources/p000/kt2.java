            package p000;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class kt2 {
                public static final jt2 Companion;

                /* JADX INFO: renamed from: a */
                public static final kt2 f13003a;

                /* JADX INFO: renamed from: b */
                public static final kt2 f13004b;

                /* JADX INFO: renamed from: c */
                public static final kt2 f13005c;

                /* JADX INFO: renamed from: d */
                public static final kt2 f13006d;

                /* JADX INFO: renamed from: e */
                public static final kt2 f13007e;

                /* JADX INFO: renamed from: f */
                public static final /* synthetic */ kt2[] f13008f;

                static {
/* 6 */             kt2 kt2Var = new kt2("ACCEPT_ALL", 0);
/* 9 */             f13003a = kt2Var;
/* 16 */            kt2 kt2Var2 = new kt2("DENY_ALL", 1);
/* 19 */            f13004b = kt2Var2;
/* 26 */            kt2 kt2Var3 = new kt2("SAVE", 2);
/* 29 */            f13005c = kt2Var3;
/* 36 */            kt2 kt2Var4 = new kt2("MORE", 3);
/* 39 */            f13006d = kt2Var4;
/* 46 */            kt2 kt2Var5 = new kt2("OK", 4);
/* 49 */            f13007e = kt2Var5;
/* 55 */            f13008f = new kt2[]{kt2Var, kt2Var2, kt2Var3, kt2Var4, kt2Var5};
/* 64 */            Companion = new jt2();
                }

                public static kt2 valueOf(String str) {
/* 7 */             return (kt2) Enum.valueOf(kt2.class, str);
                }

                public static kt2[] values() {
/* 7 */             return (kt2[]) f13008f.clone();
                }
            }
