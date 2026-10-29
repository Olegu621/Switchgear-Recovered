            package p000;

            import android.util.SparseArray;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class b02 {

                /* JADX INFO: renamed from: a */
                public static final b02 f2153a;

                /* JADX INFO: renamed from: b */
                public static final /* synthetic */ b02[] f2154b;

                static {
/* 6 */             b02 b02Var = new b02("DEFAULT", 0);
/* 9 */             f2153a = b02Var;
/* 16 */            b02 b02Var2 = new b02("UNMETERED_ONLY", 1);
/* 24 */            b02 b02Var3 = new b02("UNMETERED_OR_DAILY", 2);
/* 32 */            b02 b02Var4 = new b02("FAST_IF_RADIO_AWAKE", 3);
/* 40 */            b02 b02Var5 = new b02("NEVER", 4);
/* 48 */            b02 b02Var6 = new b02("UNRECOGNIZED", 5);
/* 55 */            f2154b = new b02[]{b02Var, b02Var2, b02Var3, b02Var4, b02Var5, b02Var6};
/* 59 */            SparseArray sparseArray = new SparseArray();
/* 62 */            sparseArray.put(0, b02Var);
/* 65 */            sparseArray.put(1, b02Var2);
/* 68 */            sparseArray.put(2, b02Var3);
/* 71 */            sparseArray.put(3, b02Var4);
/* 74 */            sparseArray.put(4, b02Var5);
/* 78 */            sparseArray.put(-1, b02Var6);
                }

                public static b02 valueOf(String str) {
/* 7 */             return (b02) Enum.valueOf(b02.class, str);
                }

                public static b02[] values() {
/* 7 */             return (b02[]) f2154b.clone();
                }
            }
