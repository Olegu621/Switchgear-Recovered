            package p000;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class y21 {

                /* JADX INFO: renamed from: a */
                public static final y21 f19457a;

                /* JADX INFO: renamed from: b */
                public static final /* synthetic */ y21[] f19458b;

                static {
/* 6 */             y21 y21Var = new y21("INVARIANT", 0);
/* 9 */             f19457a = y21Var;
/* 31 */            f19458b = new y21[]{y21Var, new y21("IN", 1), new y21("OUT", 2)};
                }

                public static y21 valueOf(String str) {
/* 7 */             return (y21) Enum.valueOf(y21.class, str);
                }

                public static y21[] values() {
/* 7 */             return (y21[]) f19458b.clone();
                }
            }
