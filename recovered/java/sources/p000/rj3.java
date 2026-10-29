            package p000;

            import android.os.Build;
            import dalvik.system.VMStack;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class rj3 extends lj3 {

                /* JADX INFO: renamed from: b */
                public static final dg3 f16134b;

                static {
                    try {
/* 10 */                Class.forName("dalvik.system.VMStack").getMethod("getStackClass2", null);
/* 23 */                qj3.class.getName().equals(m8192a());
                    } catch (Throwable unused) {
                    }
/* 26 */            String str = Build.FINGERPRINT;
/* 28 */            if (str != null) {
/* 32 */                "robolectric".equals(str);
                    }
/* 42 */            f16134b = new dg3(12);
                }

                /* JADX INFO: renamed from: a */
                public static String m8192a() {
                    try {
/* 5 */                 return VMStack.getStackClass2().getName();
                    } catch (Throwable unused) {
/* 10 */                return null;
                    }
                }
            }
