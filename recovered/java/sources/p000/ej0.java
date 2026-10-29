            package p000;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class ej0 {

                /* JADX INFO: renamed from: a */
                public static final ej0 f7731a;

                /* JADX INFO: renamed from: b */
                public static final /* synthetic */ ej0[] f7732b;

                static {
/* 6 */             ej0 ej0Var = new ej0("LEFT", 0);
/* 9 */             f7731a = ej0Var;
/* 31 */            f7732b = new ej0[]{ej0Var, new ej0("CENTER", 1), new ej0("RIGHT", 2)};
                }

                public static ej0 valueOf(String str) {
/* 7 */             return (ej0) Enum.valueOf(ej0.class, str);
                }

                public static ej0[] values() {
/* 7 */             return (ej0[]) f7732b.clone();
                }
            }
