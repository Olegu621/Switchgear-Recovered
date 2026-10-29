            package p000;

            import android.app.Activity;
            import android.content.Context;
            import android.graphics.Rect;
            import androidx.window.extensions.core.util.function.Consumer;
            import java.lang.reflect.Method;
            import java.lang.reflect.Modifier;
            import kotlin.jvm.functions.Function0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class k62 extends b51 implements Function0 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f12623a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ l62 f12624b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public /* synthetic */ k62(l62 l62Var, int i) {
/* 6 */             super(0);
/* 1 */             this.f12623a = i;
/* 3 */             this.f12624b = l62Var;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() throws NoSuchMethodException, ClassNotFoundException {
/* 1 */             int i = this.f12623a;
/* 9 */             Class<?> cls = null;
/* 10 */            boolean z = false;
/* 12 */            l62 l62Var = this.f12624b;
                    switch (i) {
                        case 0:
/* 221 */                   Class<?> clsLoadClass = l62Var.f13125a.loadClass("androidx.window.extensions.layout.FoldingFeature");
/* 225 */                   clsLoadClass.getClass();
/* 230 */                   Method method = clsLoadClass.getMethod("getBounds", null);
/* 236 */                   Method method2 = clsLoadClass.getMethod("getType", null);
/* 242 */                   Method method3 = clsLoadClass.getMethod("getState", null);
/* 246 */                   method.getClass();
/* 267 */                   if (method.getReturnType().equals(yy1.m10224s(j22.m5667a(Rect.class))) && Modifier.isPublic(method.getModifiers())) {
/* 279 */                       method2.getClass();
/* 282 */                       Class cls2 = Integer.TYPE;
/* 300 */                       if (method2.getReturnType().equals(yy1.m10224s(j22.m5667a(cls2))) && Modifier.isPublic(method2.getModifiers())) {
/* 312 */                           method3.getClass();
/* 331 */                           if (method3.getReturnType().equals(yy1.m10224s(j22.m5667a(cls2))) && Modifier.isPublic(method3.getModifiers())) {
/* 343 */                               z = true;
                                    }
                                }
                            }
/* 344 */                   return Boolean.valueOf(z);
                        case 1:
                            try {
/* 145 */                       Class<?> clsLoadClass2 = ((ClassLoader) l62Var.f13126b.f7001a).loadClass("java.util.function.Consumer");
/* 149 */                       clsLoadClass2.getClass();
/* 152 */                       cls = clsLoadClass2;
                            } catch (ClassNotFoundException unused) {
                            }
/* 153 */                   if (cls == null) {
/* 155 */                       return Boolean.FALSE;
                            }
/* 160 */                   Class<?> clsLoadClass3 = l62Var.f13125a.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
/* 164 */                   clsLoadClass3.getClass();
/* 173 */                   Method method4 = clsLoadClass3.getMethod("addWindowLayoutInfoListener", Activity.class, cls);
/* 181 */                   Method method5 = clsLoadClass3.getMethod("removeWindowLayoutInfoListener", cls);
/* 185 */                   method4.getClass();
/* 196 */                   if (Modifier.isPublic(method4.getModifiers())) {
/* 198 */                       method5.getClass();
/* 209 */                       if (Modifier.isPublic(method5.getModifiers())) {
/* 211 */                           z = true;
                                }
                            }
/* 212 */                   return Boolean.valueOf(z);
                        case 2:
/* 78 */                    Class<?> clsLoadClass4 = l62Var.f13125a.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
/* 82 */                    clsLoadClass4.getClass();
/* 93 */                    Method method6 = clsLoadClass4.getMethod("addWindowLayoutInfoListener", Context.class, Consumer.class);
/* 101 */                   Method method7 = clsLoadClass4.getMethod("removeWindowLayoutInfoListener", Consumer.class);
/* 105 */                   method6.getClass();
/* 116 */                   if (Modifier.isPublic(method6.getModifiers())) {
/* 118 */                       method7.getClass();
/* 129 */                       if (Modifier.isPublic(method7.getModifiers())) {
/* 131 */                           z = true;
                                }
                            }
/* 132 */                   return Boolean.valueOf(z);
                        default:
/* 25 */                    Class<?> clsLoadClass5 = ((ClassLoader) l62Var.f13127c.f7853b).loadClass("androidx.window.extensions.WindowExtensions");
/* 29 */                    clsLoadClass5.getClass();
/* 34 */                    Method method8 = clsLoadClass5.getMethod("getWindowLayoutComponent", null);
/* 40 */                    Class<?> clsLoadClass6 = l62Var.f13125a.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
/* 44 */                    clsLoadClass6.getClass();
/* 47 */                    method8.getClass();
/* 58 */                    if (Modifier.isPublic(method8.getModifiers()) && method8.getReturnType().equals(clsLoadClass6)) {
/* 70 */                        z = true;
                            }
/* 71 */                    return Boolean.valueOf(z);
                    }
                }
            }
