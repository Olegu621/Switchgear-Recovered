            package p000;

            import java.lang.reflect.InvocationHandler;
            import java.lang.reflect.InvocationTargetException;
            import java.lang.reflect.Method;
            import org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface;
            
            /* JADX INFO: renamed from: vk */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C2297vk implements InvocationHandler {

                /* JADX INFO: renamed from: a */
                public final FeatureFlagHolderBoundaryInterface f18229a;

                public C2297vk(FeatureFlagHolderBoundaryInterface featureFlagHolderBoundaryInterface) {
/* 4 */             this.f18229a = featureFlagHolderBoundaryInterface;
                }

                @Override // java.lang.reflect.InvocationHandler
                public final Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
/* 1 */             FeatureFlagHolderBoundaryInterface featureFlagHolderBoundaryInterface = this.f18229a;
                    try {
/* 36 */                return Class.forName(method.getDeclaringClass().getName(), true, featureFlagHolderBoundaryInterface.getClass().getClassLoader()).getDeclaredMethod(method.getName(), method.getParameterTypes()).invoke(featureFlagHolderBoundaryInterface, objArr);
                    } catch (InvocationTargetException e) {
/* 56 */                throw e.getTargetException();
                    } catch (ReflectiveOperationException e2) {
/* 47 */                f42.m3658n("Reflection failed for method ", method, e2);
/* 50 */                return null;
                    }
                }
            }
