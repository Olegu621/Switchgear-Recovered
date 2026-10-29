            package p000;

            import kotlin.text.C1852e;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class bm2 {

                /* JADX INFO: renamed from: a */
                public static final bm2 f2536a;

                /* JADX INFO: renamed from: b */
                public static final /* synthetic */ bm2[] f2537b;

                /* JADX INFO: Fake field, exist only in values array */
                bm2 EF0;

                static {
/* 6 */             bm2 bm2Var = new bm2("TLSv1_1", 0);
/* 14 */            bm2 bm2Var2 = new bm2("TLSv1_2", 1);
/* 17 */            f2536a = bm2Var2;
/* 23 */            f2537b = new bm2[]{bm2Var, bm2Var2};
                }

                public static bm2 valueOf(String str) {
/* 7 */             return (bm2) Enum.valueOf(bm2.class, str);
                }

                public static bm2[] values() {
/* 7 */             return (bm2[]) f2537b.clone();
                }

                @Override // java.lang.Enum
                public final String toString() {
/* 9 */             return C1852e.m6261k(name(), "_", ".");
                }
            }
