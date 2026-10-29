            package com.google.gson.internal;

            import java.io.ObjectInputStream;
            import java.io.ObjectStreamClass;
            import java.lang.reflect.Field;
            import java.lang.reflect.Method;
            import p000.C1951n4;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class UnsafeAllocator {
                public static final UnsafeAllocator INSTANCE = create();

                /* JADX INFO: Access modifiers changed from: private */
                public static void assertInstantiable(Class<?> cls) {
/* 1 */             String strCheckInstantiable = ConstructorConstructor.checkInstantiable(cls);
/* 5 */             if (strCheckInstantiable == null) {
/* 7 */                 return;
                    }
/* 14 */            C1951n4.m6856g("UnsafeAllocator is used for non-instantiable type: ".concat(strCheckInstantiable));
                }

                private static UnsafeAllocator create() {
                    try {
                        try {
                            try {
/* 11 */                        Class<?> cls = Class.forName("sun.misc.Unsafe");
/* 17 */                        Field declaredField = cls.getDeclaredField("theUnsafe");
/* 21 */                        declaredField.setAccessible(true);
/* 24 */                        final Object obj = declaredField.get(null);
/* 34 */                        final Method method = cls.getMethod("allocateInstance", Class.class);
/* 40 */                        return new UnsafeAllocator() { // from class: com.google.gson.internal.UnsafeAllocator.1
                                    @Override // com.google.gson.internal.UnsafeAllocator
                                    public <T> T newInstance(Class<T> cls2) throws Exception {
/* 1 */                                 UnsafeAllocator.assertInstantiable(cls2);
/* 12 */                                return (T) method.invoke(obj, cls2);
                                    }
                                };
                            } catch (Exception unused) {
/* 113 */                       return new UnsafeAllocator() { // from class: com.google.gson.internal.UnsafeAllocator.4
                                    @Override // com.google.gson.internal.UnsafeAllocator
                                    public <T> T newInstance(Class<T> cls2) {
/* 25 */                                throw new UnsupportedOperationException("Cannot allocate " + cls2 + ". Usage of JDK sun.misc.Unsafe is enabled, but it could not be used. Make sure your runtime is configured correctly.");
                                    }
                                };
                            }
                        } catch (Exception unused2) {
/* 98 */                    final Method declaredMethod = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Class.class);
/* 102 */                   declaredMethod.setAccessible(true);
/* 107 */                   return new UnsafeAllocator() { // from class: com.google.gson.internal.UnsafeAllocator.3
                                @Override // com.google.gson.internal.UnsafeAllocator
                                public <T> T newInstance(Class<T> cls2) throws Exception {
/* 1 */                             UnsafeAllocator.assertInstantiable(cls2);
/* 13 */                            return (T) declaredMethod.invoke(null, cls2, Object.class);
                                }
                            };
                        }
                    } catch (Exception unused3) {
/* 50 */                Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
/* 54 */                declaredMethod2.setAccessible(true);
/* 69 */                final int iIntValue = ((Integer) declaredMethod2.invoke(null, Object.class)).intValue();
/* 79 */                final Method declaredMethod3 = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Integer.TYPE);
/* 83 */                declaredMethod3.setAccessible(true);
/* 88 */                return new UnsafeAllocator() { // from class: com.google.gson.internal.UnsafeAllocator.2
                            @Override // com.google.gson.internal.UnsafeAllocator
                            public <T> T newInstance(Class<T> cls2) throws Exception {
/* 1 */                         UnsafeAllocator.assertInstantiable(cls2);
/* 17 */                        return (T) declaredMethod3.invoke(null, cls2, Integer.valueOf(iIntValue));
                            }
                        };
                    }
                }

                public abstract <T> T newInstance(Class<T> cls) throws Exception;
            }
