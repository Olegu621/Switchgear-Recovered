            package p000;

            import android.graphics.Typeface;
            import java.lang.reflect.Array;
            import java.lang.reflect.InvocationTargetException;
            import java.lang.reflect.Method;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class os2 extends ns2 {
                @Override // p000.ns2
                /* JADX INFO: renamed from: P0 */
                public final Typeface mo7039P0(Object obj) {
                    try {
/* 10 */                Object objNewInstance = Array.newInstance((Class<?>) this.f14440j, 1);
/* 15 */                Array.set(objNewInstance, 0, obj);
/* 30 */                return (Typeface) this.f14446p.invoke(null, objNewInstance, "sans-serif", -1, -1);
                    } catch (IllegalAccessException | InvocationTargetException e) {
/* 36 */                ds0.m3199p(e);
/* 6 */                 return null;
                    }
                }

                @Override // p000.ns2
                /* JADX INFO: renamed from: S0 */
                public final Method mo7041S0(Class cls) throws NoSuchMethodException {
/* 6 */             Class<?> cls2 = Array.newInstance((Class<?>) cls, 1).getClass();
/* 12 */            Class cls3 = Integer.TYPE;
/* 22 */            Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, String.class, cls3, cls3);
/* 26 */            declaredMethod.setAccessible(true);
/* 29 */            return declaredMethod;
                }
            }
