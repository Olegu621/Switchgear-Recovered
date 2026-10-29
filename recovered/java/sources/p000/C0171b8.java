            package p000;

            import android.os.Build;
            import java.lang.reflect.Method;
            import java.lang.reflect.Modifier;
            import kotlin.coroutines.AbstractC1840a;
            
            /* JADX INFO: renamed from: b8 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C0171b8 extends AbstractC1840a implements t10 {
                private volatile Object _preHandler;

                public C0171b8() {
/* 3 */             super(dc0.f7101c);
/* 6 */             this._preHandler = this;
                }

                /* JADX INFO: renamed from: g */
                public final void m1296g(Throwable th) {
                    Method declaredMethod;
/* 1 */             int i = Build.VERSION.SDK_INT;
/* 5 */             if (26 > i || i >= 28) {
/* 75 */                return;
                    }
/* 11 */            Object obj = this._preHandler;
/* 14 */            if (obj != this) {
/* 16 */                declaredMethod = (Method) obj;
                    } else {
                        try {
/* 23 */                    declaredMethod = Thread.class.getDeclaredMethod("getUncaughtExceptionPreHandler", null);
/* 35 */                    if (!Modifier.isPublic(declaredMethod.getModifiers()) || !Modifier.isStatic(declaredMethod.getModifiers())) {
/* 48 */                        declaredMethod = null;
                            }
                        } catch (Throwable unused) {
                        }
/* 49 */                this._preHandler = declaredMethod;
                    }
/* 58 */            Object objInvoke = declaredMethod != null ? declaredMethod.invoke(null, null) : null;
/* 64 */            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = objInvoke instanceof Thread.UncaughtExceptionHandler ? (Thread.UncaughtExceptionHandler) objInvoke : null;
/* 66 */            if (uncaughtExceptionHandler != null) {
/* 72 */                uncaughtExceptionHandler.uncaughtException(Thread.currentThread(), th);
                    }
                }
            }
