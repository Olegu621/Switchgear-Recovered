            package p000;

            import android.app.Activity;
            import android.content.res.Configuration;
            import android.os.Build;
            import android.os.Handler;
            import android.os.IBinder;
            import android.os.Looper;
            import java.lang.reflect.Field;
            import java.lang.reflect.Method;
            import java.util.List;
            
            /* JADX INFO: renamed from: b3 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class AbstractC0166b3 {

                /* JADX INFO: renamed from: a */
                public static final Class f2185a;

                /* JADX INFO: renamed from: b */
                public static final Field f2186b;

                /* JADX INFO: renamed from: c */
                public static final Field f2187c;

                /* JADX INFO: renamed from: d */
                public static final Method f2188d;

                /* JADX INFO: renamed from: e */
                public static final Method f2189e;

                /* JADX INFO: renamed from: f */
                public static final Method f2190f;

                /* JADX INFO: renamed from: g */
                public static final Handler f2191g = new Handler(Looper.getMainLooper());

                static {
                    Class<?> cls;
                    Field declaredField;
                    Field declaredField2;
                    Method declaredMethod;
                    Method declaredMethod2;
/* 14 */            Method method = null;
                    try {
/* 17 */                cls = Class.forName("android.app.ActivityThread");
                    } catch (Throwable unused) {
/* 22 */                cls = null;
                    }
/* 23 */            f2185a = cls;
                    try {
/* 28 */                declaredField = Activity.class.getDeclaredField("mMainThread");
/* 32 */                declaredField.setAccessible(true);
                    } catch (Throwable unused2) {
/* 36 */                declaredField = null;
                    }
/* 37 */            f2186b = declaredField;
                    try {
/* 41 */                declaredField2 = Activity.class.getDeclaredField("mToken");
/* 45 */                declaredField2.setAccessible(true);
                    } catch (Throwable unused3) {
/* 49 */                declaredField2 = null;
                    }
/* 50 */            f2187c = declaredField2;
/* 52 */            Class cls2 = f2185a;
/* 54 */            Class cls3 = Boolean.TYPE;
/* 60 */            if (cls2 == null) {
/* 62 */                declaredMethod = null;
                    } else {
                        try {
/* 70 */                    declaredMethod = cls2.getDeclaredMethod("performStopActivity", IBinder.class, cls3, String.class);
/* 74 */                    declaredMethod.setAccessible(true);
                        } catch (Throwable unused4) {
/* 62 */                    declaredMethod = null;
                        }
                    }
/* 77 */            f2188d = declaredMethod;
/* 79 */            Class cls4 = f2185a;
/* 81 */            if (cls4 == null) {
/* 83 */                declaredMethod2 = null;
                    } else {
                        try {
/* 89 */                    declaredMethod2 = cls4.getDeclaredMethod("performStopActivity", IBinder.class, cls3);
/* 93 */                    declaredMethod2.setAccessible(true);
                        } catch (Throwable unused5) {
/* 83 */                    declaredMethod2 = null;
                        }
                    }
/* 96 */            f2189e = declaredMethod2;
/* 98 */            Class cls5 = f2185a;
/* 100 */           int i = Build.VERSION.SDK_INT;
/* 104 */           if ((i == 26 || i == 27) && cls5 != null) {
                        try {
/* 121 */                   Class cls6 = Integer.TYPE;
/* 123 */                   Class cls7 = Boolean.TYPE;
/* 135 */                   Method declaredMethod3 = cls5.getDeclaredMethod("requestRelaunchActivity", IBinder.class, List.class, List.class, cls6, cls7, Configuration.class, Configuration.class, cls7, cls7);
/* 139 */                   declaredMethod3.setAccessible(true);
/* 142 */                   method = declaredMethod3;
                        } catch (Throwable unused6) {
                        }
                    }
/* 143 */           f2190f = method;
                }
            }
