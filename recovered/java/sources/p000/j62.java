            package p000;

            import java.lang.reflect.Method;
            import java.lang.reflect.Modifier;
            import kotlin.jvm.functions.Function0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class j62 extends b51 implements Function0 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f12100a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ er0 f12101b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public /* synthetic */ j62(er0 er0Var, int i) {
/* 6 */             super(0);
/* 1 */             this.f12100a = i;
/* 3 */             this.f12101b = er0Var;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() throws NoSuchMethodException, ClassNotFoundException {
/* 1 */             int i = this.f12100a;
/* 5 */             er0 er0Var = this.f12101b;
                    switch (i) {
                        case 0:
/* 76 */                    Class<?> clsLoadClass = ((ClassLoader) er0Var.f7853b).loadClass("androidx.window.extensions.WindowExtensionsProvider");
/* 80 */                    clsLoadClass.getClass();
/* 83 */                    return clsLoadClass;
                        default:
/* 14 */                    Class<?> clsLoadClass2 = ((ClassLoader) er0Var.f7853b).loadClass("androidx.window.extensions.WindowExtensionsProvider");
/* 18 */                    clsLoadClass2.getClass();
/* 24 */                    Method declaredMethod = clsLoadClass2.getDeclaredMethod("getWindowExtensions", null);
/* 34 */                    Class<?> clsLoadClass3 = ((ClassLoader) er0Var.f7853b).loadClass("androidx.window.extensions.WindowExtensions");
/* 38 */                    clsLoadClass3.getClass();
/* 41 */                    declaredMethod.getClass();
/* 67 */                    return Boolean.valueOf(declaredMethod.getReturnType().equals(clsLoadClass3) && Modifier.isPublic(declaredMethod.getModifiers()));
                    }
                }
            }
