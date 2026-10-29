            package com.google.gson.internal.reflect;

            import com.google.gson.JsonIOException;
            import java.lang.reflect.AccessibleObject;
            import java.lang.reflect.Constructor;
            import java.lang.reflect.Field;
            import java.lang.reflect.Method;
            import p000.fm0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class ReflectionHelper {
                private static final RecordHelper RECORD_HELPER;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static abstract class RecordHelper {
                    private RecordHelper() {
                    }

                    public abstract Method getAccessor(Class<?> cls, Field field);

                    public abstract <T> Constructor<T> getCanonicalRecordConstructor(Class<T> cls);

                    public abstract String[] getRecordComponentNames(Class<?> cls);

                    public abstract boolean isRecord(Class<?> cls);
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static class RecordNotSupportedHelper extends RecordHelper {
                    private RecordNotSupportedHelper() {
/* 2 */                 super();
                    }

                    @Override // com.google.gson.internal.reflect.ReflectionHelper.RecordHelper
                    public Method getAccessor(Class<?> cls, Field field) {
/* 8 */                 throw new UnsupportedOperationException("Records are not supported on this JVM, this method should not be called");
                    }

                    @Override // com.google.gson.internal.reflect.ReflectionHelper.RecordHelper
                    public <T> Constructor<T> getCanonicalRecordConstructor(Class<T> cls) {
/* 8 */                 throw new UnsupportedOperationException("Records are not supported on this JVM, this method should not be called");
                    }

                    @Override // com.google.gson.internal.reflect.ReflectionHelper.RecordHelper
                    public String[] getRecordComponentNames(Class<?> cls) {
/* 8 */                 throw new UnsupportedOperationException("Records are not supported on this JVM, this method should not be called");
                    }

                    @Override // com.google.gson.internal.reflect.ReflectionHelper.RecordHelper
                    public boolean isRecord(Class<?> cls) {
/* 1 */                 return false;
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static class RecordSupportedHelper extends RecordHelper {
                    private final Method getName;
                    private final Method getRecordComponents;
                    private final Method getType;
                    private final Method isRecord;

                    private RecordSupportedHelper() throws NoSuchMethodException {
/* 2 */                 super();
/* 13 */                this.isRecord = Class.class.getMethod("isRecord", null);
/* 17 */                Method method = Class.class.getMethod("getRecordComponents", null);
/* 21 */                this.getRecordComponents = method;
/* 27 */                Class<?> componentType = method.getReturnType().getComponentType();
/* 37 */                this.getName = componentType.getMethod("getName", null);
/* 45 */                this.getType = componentType.getMethod("getType", null);
                    }

                    @Override // com.google.gson.internal.reflect.ReflectionHelper.RecordHelper
                    public Method getAccessor(Class<?> cls, Field field) {
                        try {
/* 6 */                     return cls.getMethod(field.getName(), null);
                        } catch (ReflectiveOperationException e) {
/* 16 */                    throw ReflectionHelper.createExceptionForRecordReflectionException(e);
                        }
                    }

                    @Override // com.google.gson.internal.reflect.ReflectionHelper.RecordHelper
                    public <T> Constructor<T> getCanonicalRecordConstructor(Class<T> cls) {
                        try {
/* 8 */                     Object[] objArr = (Object[]) this.getRecordComponents.invoke(cls, null);
/* 11 */                    Class<?>[] clsArr = new Class[objArr.length];
/* 15 */                    for (int i = 0; i < objArr.length; i++) {
/* 27 */                        clsArr[i] = (Class) this.getType.invoke(objArr[i], null);
                            }
/* 32 */                    return cls.getDeclaredConstructor(clsArr);
                        } catch (ReflectiveOperationException e) {
/* 42 */                    throw ReflectionHelper.createExceptionForRecordReflectionException(e);
                        }
                    }

                    @Override // com.google.gson.internal.reflect.ReflectionHelper.RecordHelper
                    public String[] getRecordComponentNames(Class<?> cls) {
                        try {
/* 8 */                     Object[] objArr = (Object[]) this.getRecordComponents.invoke(cls, null);
/* 11 */                    String[] strArr = new String[objArr.length];
/* 15 */                    for (int i = 0; i < objArr.length; i++) {
/* 27 */                        strArr[i] = (String) this.getName.invoke(objArr[i], null);
                            }
/* 32 */                    return strArr;
                        } catch (ReflectiveOperationException e) {
/* 38 */                    throw ReflectionHelper.createExceptionForRecordReflectionException(e);
                        }
                    }

                    @Override // com.google.gson.internal.reflect.ReflectionHelper.RecordHelper
                    public boolean isRecord(Class<?> cls) {
                        try {
/* 10 */                    return ((Boolean) this.isRecord.invoke(cls, null)).booleanValue();
                        } catch (ReflectiveOperationException e) {
/* 20 */                    throw ReflectionHelper.createExceptionForRecordReflectionException(e);
                        }
                    }
                }

                static {
                    RecordHelper recordNotSupportedHelper;
                    try {
/* 4 */                 recordNotSupportedHelper = new RecordSupportedHelper();
                    } catch (NoSuchMethodException unused) {
/* 10 */                recordNotSupportedHelper = new RecordNotSupportedHelper();
                    }
/* 13 */            RECORD_HELPER = recordNotSupportedHelper;
                }

                private ReflectionHelper() {
                }

                private static void appendExecutableParameters(AccessibleObject accessibleObject, StringBuilder sb) {
/* 3 */             sb.append('(');
/* 19 */            Class<?>[] parameterTypes = accessibleObject instanceof Method ? ((Method) accessibleObject).getParameterTypes() : ((Constructor) accessibleObject).getParameterTypes();
/* 25 */            for (int i = 0; i < parameterTypes.length; i++) {
/* 27 */                if (i > 0) {
/* 31 */                    sb.append(", ");
                        }
/* 40 */                sb.append(parameterTypes[i].getSimpleName());
                    }
/* 48 */            sb.append(')');
                }

                public static String constructorToString(Constructor<?> constructor) {
/* 11 */            StringBuilder sb = new StringBuilder(constructor.getDeclaringClass().getName());
/* 14 */            appendExecutableParameters(constructor, sb);
/* 17 */            return sb.toString();
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static RuntimeException createExceptionForRecordReflectionException(ReflectiveOperationException reflectiveOperationException) {
/* 8 */             throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.10.1). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", reflectiveOperationException);
                }

                public static RuntimeException createExceptionForUnexpectedIllegalAccess(IllegalAccessException illegalAccessException) {
/* 8 */             throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.10.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", illegalAccessException);
                }

                public static String fieldToString(Field field) {
/* 29 */            return field.getDeclaringClass().getName() + "#" + field.getName();
                }

                public static String getAccessibleObjectDescription(AccessibleObject accessibleObject, boolean z) {
                    String str;
/* 5 */             if (accessibleObject instanceof Field) {
/* 26 */                str = "field '" + fieldToString((Field) accessibleObject) + "'";
                    } else if (accessibleObject instanceof Method) {
/* 35 */                Method method = (Method) accessibleObject;
/* 43 */                StringBuilder sb = new StringBuilder(method.getName());
/* 46 */                appendExecutableParameters(method, sb);
/* 82 */                str = "method '" + method.getDeclaringClass().getName() + "#" + sb.toString() + "'";
                    } else if (accessibleObject instanceof Constructor) {
/* 110 */               str = "constructor '" + constructorToString((Constructor) accessibleObject) + "'";
                    } else {
/* 129 */               str = "<unknown AccessibleObject> " + accessibleObject.toString();
                    }
/* 133 */           if (!z || !Character.isLowerCase(str.charAt(0))) {
/* 174 */               return str;
                    }
/* 170 */           return Character.toUpperCase(str.charAt(0)) + str.substring(1);
                }

                public static Method getAccessor(Class<?> cls, Field field) {
/* 3 */             return RECORD_HELPER.getAccessor(cls, field);
                }

                public static <T> Constructor<T> getCanonicalRecordConstructor(Class<T> cls) {
/* 3 */             return RECORD_HELPER.getCanonicalRecordConstructor(cls);
                }

                public static String[] getRecordComponentNames(Class<?> cls) {
/* 3 */             return RECORD_HELPER.getRecordComponentNames(cls);
                }

                public static boolean isRecord(Class<?> cls) {
/* 3 */             return RECORD_HELPER.isRecord(cls);
                }

                public static void makeAccessible(AccessibleObject accessibleObject) throws JsonIOException {
                    try {
/* 2 */                 accessibleObject.setAccessible(true);
                    } catch (Exception e) {
/* 25 */                throw new JsonIOException(fm0.m3784j("Failed making ", getAccessibleObjectDescription(accessibleObject, false), " accessible; either increase its visibility or write a custom TypeAdapter for its declaring type."), e);
                    }
                }

                public static String tryMakeAccessible(Constructor<?> constructor) {
                    try {
/* 2 */                 constructor.setAccessible(true);
/* 5 */                 return null;
                    } catch (Exception e) {
/* 34 */                return "Failed making constructor '" + constructorToString(constructor) + "' accessible; either increase its visibility or write a custom InstanceCreator or TypeAdapter for its declaring type: " + e.getMessage();
                    }
                }
            }
