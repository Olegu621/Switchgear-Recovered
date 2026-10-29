            package p000;

            import java.lang.reflect.Method;
            import java.util.concurrent.ScheduledThreadPoolExecutor;
            
            /* JADX INFO: renamed from: qy */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public abstract class AbstractC2124qy {

                /* JADX INFO: renamed from: a */
                public static final Method f15797a;

                static {
                    Method method;
                    try {
/* 11 */                method = ScheduledThreadPoolExecutor.class.getMethod("setRemoveOnCancelPolicy", Boolean.TYPE);
                    } catch (Throwable unused) {
/* 16 */                method = null;
                    }
/* 17 */            f15797a = method;
                }
            }
