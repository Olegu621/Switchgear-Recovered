            package io.sentry.util;

            import java.lang.reflect.Field;
            import java.lang.reflect.Modifier;
            import p000.ds0;
            import sun.misc.Unsafe;
            
            /* JADX INFO: renamed from: io.sentry.util.b */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public abstract /* synthetic */ class AbstractC1703b {

                /* JADX INFO: renamed from: a */
                public static final /* synthetic */ Unsafe f11726a = m5445a();

                /* JADX INFO: renamed from: a */
                public static /* synthetic */ Unsafe m5445a() {
                    Field field;
                    Field declaredField;
                    try {
/* 6 */                 declaredField = Unsafe.class.getDeclaredField("theUnsafe");
                    } catch (NoSuchFieldException e) {
/* 14 */                Field[] declaredFields = Unsafe.class.getDeclaredFields();
/* 18 */                int length = declaredFields.length;
/* 19 */                int i = 0;
                        while (true) {
/* 20 */                    if (i >= length) {
/* 50 */                        field = null;
                                break;
                            }
/* 22 */                    field = declaredFields[i];
/* 32 */                    if (Modifier.isStatic(field.getModifiers()) && Unsafe.class.isAssignableFrom(field.getType())) {
                                break;
                            }
/* 47 */                    i++;
                        }
/* 51 */                if (field != null) {
/* 77 */                    throw new UnsupportedOperationException("Couldn't find the Unsafe", e);
                        }
/* 53 */                declaredField = field;
                    }
/* 55 */            declaredField.setAccessible(true);
                    try {
/* 62 */                return (Unsafe) declaredField.get(null);
                    } catch (Exception e2) {
/* 66 */                ds0.m3199p(e2);
/* 1 */                 return null;
                    }
                }
            }
