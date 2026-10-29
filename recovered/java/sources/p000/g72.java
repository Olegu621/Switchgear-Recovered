            package p000;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class g72 {

                /* JADX INFO: renamed from: a */
                public static final g72 f8506a;

                /* JADX INFO: renamed from: b */
                public static final g72 f8507b;

                /* JADX INFO: renamed from: c */
                public static final g72 f8508c;

                /* JADX INFO: renamed from: d */
                public static final /* synthetic */ g72[] f8509d;

                static {
/* 6 */             g72 g72Var = new g72("NETWORK_UNMETERED", 0);
/* 9 */             f8506a = g72Var;
/* 16 */            g72 g72Var2 = new g72("DEVICE_IDLE", 1);
/* 19 */            f8507b = g72Var2;
/* 26 */            g72 g72Var3 = new g72("DEVICE_CHARGING", 2);
/* 29 */            f8508c = g72Var3;
/* 35 */            f8509d = new g72[]{g72Var, g72Var2, g72Var3};
                }

                public static g72 valueOf(String str) {
/* 7 */             return (g72) Enum.valueOf(g72.class, str);
                }

                public static g72[] values() {
/* 7 */             return (g72[]) f8509d.clone();
                }
            }
