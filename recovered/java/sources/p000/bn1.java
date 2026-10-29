            package p000;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class bn1 {

                /* JADX INFO: renamed from: a */
                public static final bn1 f2548a;

                /* JADX INFO: renamed from: b */
                public static final /* synthetic */ bn1[] f2549b;

                static {
/* 6 */             bn1 bn1Var = new bn1("WORLD", 0);
/* 9 */             f2548a = bn1Var;
/* 23 */            f2549b = new bn1[]{bn1Var, new bn1("EU", 1)};
                }

                public static bn1 valueOf(String str) {
/* 7 */             return (bn1) Enum.valueOf(bn1.class, str);
                }

                public static bn1[] values() {
/* 7 */             return (bn1[]) f2549b.clone();
                }
            }
