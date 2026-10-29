            package com.google.gson.internal;

            import java.lang.reflect.Type;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class Primitives {
                private Primitives() {
                }

                public static boolean isPrimitive(Type type) {
                    return (type instanceof Class) && ((Class) type).isPrimitive();
                }

                public static boolean isWrapperType(Type type) {
                    return type == Integer.class || type == Float.class || type == Byte.class || type == Double.class || type == Long.class || type == Character.class || type == Boolean.class || type == Short.class || type == Void.class;
                }

                public static <T> Class<T> unwrap(Class<T> cls) {
/* 3 */             if (cls == Integer.class) {
/* 5 */                 return Integer.TYPE;
                    }
/* 10 */            if (cls == Float.class) {
/* 12 */                return Float.TYPE;
                    }
/* 17 */            if (cls == Byte.class) {
/* 19 */                return Byte.TYPE;
                    }
/* 24 */            if (cls == Double.class) {
/* 26 */                return Double.TYPE;
                    }
/* 31 */            if (cls == Long.class) {
/* 33 */                return Long.TYPE;
                    }
/* 38 */            if (cls == Character.class) {
/* 40 */                return Character.TYPE;
                    }
/* 45 */            if (cls == Boolean.class) {
/* 47 */                return Boolean.TYPE;
                    }
/* 52 */            if (cls == Short.class) {
/* 54 */                return Short.TYPE;
                    }
                    return cls == Void.class ? Void.TYPE : cls;
                }

                public static <T> Class<T> wrap(Class<T> cls) {
/* 3 */             if (cls == Integer.TYPE) {
/* 5 */                 return Integer.class;
                    }
/* 10 */            if (cls == Float.TYPE) {
/* 12 */                return Float.class;
                    }
/* 17 */            if (cls == Byte.TYPE) {
/* 19 */                return Byte.class;
                    }
/* 24 */            if (cls == Double.TYPE) {
/* 26 */                return Double.class;
                    }
/* 31 */            if (cls == Long.TYPE) {
/* 33 */                return Long.class;
                    }
/* 38 */            if (cls == Character.TYPE) {
/* 40 */                return Character.class;
                    }
/* 45 */            if (cls == Boolean.TYPE) {
/* 47 */                return Boolean.class;
                    }
/* 52 */            if (cls == Short.TYPE) {
/* 54 */                return Short.class;
                    }
                    return cls == Void.TYPE ? Void.class : cls;
                }
            }
