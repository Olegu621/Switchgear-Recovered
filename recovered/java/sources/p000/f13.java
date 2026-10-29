            package p000;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class f13 {

                /* JADX INFO: renamed from: a */
                public static final f13 f7967a;

                /* JADX INFO: renamed from: b */
                public static final f13 f7968b;

                /* JADX INFO: renamed from: c */
                public static final f13 f7969c;

                /* JADX INFO: renamed from: d */
                public static final f13 f7970d;

                /* JADX INFO: renamed from: e */
                public static final /* synthetic */ f13[] f7971e;

                static {
/* 6 */             f13 f13Var = new f13("ACCEPT_ALL", 0);
/* 9 */             f7967a = f13Var;
/* 16 */            f13 f13Var2 = new f13("DENY_ALL", 1);
/* 19 */            f7968b = f13Var2;
/* 26 */            f13 f13Var3 = new f13("GRANULAR", 2);
/* 29 */            f7969c = f13Var3;
/* 36 */            f13 f13Var4 = new f13("NO_INTERACTION", 3);
/* 39 */            f7970d = f13Var4;
/* 45 */            f7971e = new f13[]{f13Var, f13Var2, f13Var3, f13Var4};
                }

                public static f13 valueOf(String str) {
/* 7 */             return (f13) Enum.valueOf(f13.class, str);
                }

                public static f13[] values() {
/* 7 */             return (f13[]) f7971e.clone();
                }
            }
