            package io.sentry.android.replay;

            import android.os.Handler;
            import android.os.Looper;
            import io.sentry.util.C1713l;
            import java.lang.reflect.Field;
            import java.lang.reflect.Method;
            import kotlin.jvm.functions.Function0;
            import kotlin.text.Regex;
            import p000.b51;
            import p000.f72;
            import p000.p51;
            
            /* JADX INFO: renamed from: io.sentry.android.replay.a */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1293a extends b51 implements Function0 {

                /* JADX INFO: renamed from: b */
                public static final C1293a f10427b;

                /* JADX INFO: renamed from: c */
                public static final C1293a f10428c;

                /* JADX INFO: renamed from: d */
                public static final C1293a f10429d;

                /* JADX INFO: renamed from: e */
                public static final C1293a f10430e;

                /* JADX INFO: renamed from: f */
                public static final C1293a f10431f;

                /* JADX INFO: renamed from: i */
                public static final C1293a f10432i;

                /* JADX INFO: renamed from: v */
                public static final C1293a f10433v;

                /* JADX INFO: renamed from: w */
                public static final C1293a f10434w;

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f10435a;

                static {
/* 3 */             int i = 0;
/* 8 */             f10427b = new C1293a(i, 0);
/* 16 */            f10428c = new C1293a(i, 1);
/* 24 */            f10429d = new C1293a(i, 2);
/* 32 */            f10430e = new C1293a(i, 3);
/* 40 */            f10431f = new C1293a(i, 4);
/* 48 */            f10432i = new C1293a(i, 5);
/* 56 */            f10433v = new C1293a(i, 6);
/* 64 */            f10434w = new C1293a(i, 7);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public /* synthetic */ C1293a(int i, int i2) {
/* 3 */             super(i);
/* 1 */             this.f10435a = i2;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() throws NoSuchFieldException {
                    Method method;
                    switch (this.f10435a) {
                        case 0:
/* 129 */                   return new Regex("_[a-z]");
                        case 1:
/* 121 */                   return new C1713l();
                        case 2:
/* 96 */                    C1346u c1346u = new C1346u();
/* 115 */                   new Handler(Looper.getMainLooper()).postAtFrontOfQueue(new f72(c1346u, 27));
/* 118 */                   return c1346u;
                        case 3:
/* 72 */                    p51 p51Var = C1294a0.f10436a;
/* 80 */                    Class cls = (Class) C1294a0.f10436a.getValue();
/* 82 */                    if (cls == null) {
/* 4 */                         return null;
                            }
/* 86 */                    Field declaredField = cls.getDeclaredField("mViews");
/* 90 */                    declaredField.setAccessible(true);
/* 93 */                    return declaredField;
                        case 4:
                            try {
/* 67 */                        return Class.forName("android.view.WindowManagerGlobal");
                            } catch (Throwable unused) {
/* 4 */                         return null;
                            }
                        case 5:
/* 40 */                    p51 p51Var2 = C1294a0.f10436a;
/* 48 */                    Class cls2 = (Class) C1294a0.f10436a.getValue();
/* 50 */                    if (cls2 == null || (method = cls2.getMethod("getInstance", null)) == null) {
/* 4 */                         return null;
                            }
/* 60 */                    return method.invoke(null, null);
                        case 6:
                            try {
/* 35 */                        return Class.forName("com.android.internal.policy.DecorView");
                            } catch (Throwable unused2) {
/* 4 */                         return null;
                            }
                        default:
/* 14 */                    Class cls3 = (Class) AbstractC1320g0.f10532a.getValue();
/* 16 */                    if (cls3 == null) {
/* 4 */                         return null;
                            }
                            try {
/* 20 */                        Field declaredField2 = cls3.getDeclaredField("mWindow");
/* 24 */                        declaredField2.setAccessible(true);
/* 27 */                        return declaredField2;
                            } catch (NoSuchFieldException unused3) {
/* 29 */                        cls3.toString();
/* 4 */                         return null;
                            }
                    }
                }
            }
