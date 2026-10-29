            package p000;

            import android.os.Build;
            import android.os.Handler;
            import android.os.Looper;
            import android.view.Choreographer;
            import java.lang.reflect.InvocationTargetException;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class lt0 {
                private static volatile Choreographer choreographer;

                static {
                    Object n42Var;
                    try {
/* 1 */                 m42 m42Var = o42.f14612b;
/* 14 */                n42Var = new kt0(m6537a(Looper.getMainLooper()), false);
                    } catch (Throwable th) {
/* 19 */                m42 m42Var2 = o42.f14612b;
/* 23 */                n42Var = new n42(th);
                    }
/* 30 */            if (n42Var instanceof n42) {
/* 32 */                n42Var = null;
                    }
                }

                /* JADX INFO: renamed from: a */
                public static final Handler m6537a(Looper looper) throws IllegalAccessException, InvocationTargetException {
/* 10 */            if (Build.VERSION.SDK_INT < 28) {
                        try {
/* 66 */                    return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
                        } catch (NoSuchMethodException unused) {
/* 71 */                    return new Handler(looper);
                        }
                    }
/* 26 */            Object objInvoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
/* 30 */            objInvoke.getClass();
/* 33 */            return (Handler) objInvoke;
                }
            }
