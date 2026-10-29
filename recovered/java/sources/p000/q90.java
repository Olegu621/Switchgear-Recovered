            package p000;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class q90 {

                /* JADX INFO: renamed from: a */
                public static final q90 f15447a;

                /* JADX INFO: renamed from: b */
                public static final /* synthetic */ q90[] f15448b;

                /* JADX INFO: Fake field, exist only in values array */
                q90 EF0;

                static {
/* 6 */             q90 q90Var = new q90("ALL", 0);
/* 14 */            q90 q90Var2 = new q90("SHORT", 1);
/* 17 */            f15447a = q90Var2;
/* 23 */            f15448b = new q90[]{q90Var, q90Var2};
                }

                public static q90 valueOf(String str) {
/* 7 */             return (q90) Enum.valueOf(q90.class, str);
                }

                public static q90[] values() {
/* 7 */             return (q90[]) f15448b.clone();
                }
            }
