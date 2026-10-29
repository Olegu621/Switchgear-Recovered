            package p000;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class zz0 {

                /* JADX INFO: renamed from: a */
                public static final zz0 f20467a = new zz0();

                /* JADX INFO: renamed from: b */
                public static final Integer f20468b;

                static {
                    Integer num;
/* 8 */             Integer num2 = null;
                    try {
/* 21 */                Object obj = Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
/* 32 */                num = obj instanceof Integer ? (Integer) obj : null;
                    } catch (Throwable unused) {
                    }
/* 33 */            if (num != null && num.intValue() > 0) {
/* 41 */                num2 = num;
                    }
/* 42 */            f20468b = num2;
                }
            }
