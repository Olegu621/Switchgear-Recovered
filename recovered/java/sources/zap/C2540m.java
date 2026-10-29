            package zap;

            import android.content.Context;
            
            /* JADX INFO: renamed from: zap.m */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes3.dex */
/* 9 */     public final class C2540m {
                private static final boolean DIAGNOSTICS = false;

                /* JADX INFO: renamed from: b */
                public static native boolean m10315b();

                /* JADX INFO: renamed from: c */
                public static native void m10316c(C2534ab c2534ab);

                static {
/* 11 */            System.loadLibrary("FUSION");
                }

/* 14 */        private C2540m() {
                }

/* 65 */        private static void startLoaderTrace() {
                }

/* 72 */        public static boolean start(Context context) {
/* 73 */            C2544s.m10321b(context, null);
/* 76 */            return m10315b();
                }
            }
