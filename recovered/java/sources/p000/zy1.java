            package p000;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zy1 {

                /* JADX INFO: renamed from: a */
                public static final zy1 f20382a;

                /* JADX INFO: renamed from: b */
                public static final /* synthetic */ zy1[] f20383b;

                static {
/* 6 */             zy1 zy1Var = new zy1("DEFAULT", 0);
/* 9 */             f20382a = zy1Var;
/* 31 */            f20383b = new zy1[]{zy1Var, new zy1("SIGNED", 1), new zy1("FIXED", 2)};
                }

                public static zy1 valueOf(String str) {
/* 7 */             return (zy1) Enum.valueOf(zy1.class, str);
                }

                public static zy1[] values() {
/* 7 */             return (zy1[]) f20383b.clone();
                }
            }
