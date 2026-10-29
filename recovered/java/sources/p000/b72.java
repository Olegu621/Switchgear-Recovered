            package p000;

            import android.app.Application;
            import java.lang.reflect.Constructor;
            import java.lang.reflect.InvocationTargetException;
            import java.util.Arrays;
            import java.util.List;
            import kotlin.collections.C1839a;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class b72 {

                /* JADX INFO: renamed from: a */
                public static final List f2283a = C2085pw.m7566e(Application.class, n62.class);

                /* JADX INFO: renamed from: b */
                public static final List f2284b = C1839a.m6210b(n62.class);

                /* JADX INFO: renamed from: a */
                public static final Constructor m1293a(List list, Class cls) {
/* 1 */             list.getClass();
/* 4 */             Constructor<?>[] constructors = cls.getConstructors();
/* 8 */             constructors.getClass();
/* 13 */            for (Constructor<?> constructor : constructors) {
/* 17 */                Class<?>[] parameterTypes = constructor.getParameterTypes();
/* 21 */                parameterTypes.getClass();
/* 24 */                List listM7779n = C2103qd.m7779n(parameterTypes);
/* 32 */                if (list.equals(listM7779n)) {
/* 34 */                    return constructor;
                        }
/* 43 */                if (list.size() == listM7779n.size() && listM7779n.containsAll(list)) {
/* 83 */                    throw new UnsupportedOperationException("Class " + cls.getSimpleName() + " must have parameters in the proper order: " + list);
                        }
                    }
/* 87 */            return null;
                }

                /* JADX INFO: renamed from: b */
                public static final q33 m1294b(Class cls, Constructor constructor, Object... objArr) {
                    try {
/* 11 */                return (q33) constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
                    } catch (IllegalAccessException e) {
/* 69 */                f42.m3658n("Failed to access ", cls, e);
/* 1 */                 return null;
                    } catch (InstantiationException e2) {
/* 66 */                throw new RuntimeException("A " + cls + " cannot be instantiated.", e2);
                    } catch (InvocationTargetException e3) {
/* 38 */                ds0.m3198o("An exception happened in constructor of " + cls, e3.getCause());
/* 1 */                 return null;
                    }
                }
            }
