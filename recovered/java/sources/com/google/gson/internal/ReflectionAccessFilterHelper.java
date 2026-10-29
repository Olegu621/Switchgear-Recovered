            package com.google.gson.internal;

            import com.google.gson.ReflectionAccessFilter;
            import java.lang.reflect.AccessibleObject;
            import java.lang.reflect.Method;
            import java.util.Iterator;
            import java.util.List;
            import p000.ds0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 20 */    public class ReflectionAccessFilterHelper {

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static abstract class AccessChecker {
                    public static final AccessChecker INSTANCE;

                    static {
                        AccessChecker accessChecker;
/* 5 */                 if (JavaVersion.isJava9OrLater()) {
                            try {
/* 17 */                        final Method declaredMethod = AccessibleObject.class.getDeclaredMethod("canAccess", Object.class);
/* 23 */                        accessChecker = new AccessChecker() { // from class: com.google.gson.internal.ReflectionAccessFilterHelper.AccessChecker.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
/* 4 */                                 super();
                                    }

                                    @Override // com.google.gson.internal.ReflectionAccessFilterHelper.AccessChecker
                                    public boolean canAccess(AccessibleObject accessibleObject, Object obj) {
                                        try {
/* 13 */                                    return ((Boolean) declaredMethod.invoke(accessibleObject, obj)).booleanValue();
                                        } catch (Exception e) {
/* 21 */                                    ds0.m3198o("Failed invoking canAccess", e);
/* 24 */                                    return false;
                                        }
                                    }
                                };
                            } catch (NoSuchMethodException unused) {
/* 27 */                        accessChecker = null;
                            }
                        } else {
/* 27 */                    accessChecker = null;
                        }
/* 28 */                if (accessChecker == null) {
/* 32 */                    accessChecker = new AccessChecker() { // from class: com.google.gson.internal.ReflectionAccessFilterHelper.AccessChecker.2
                                @Override // com.google.gson.internal.ReflectionAccessFilterHelper.AccessChecker
                                public boolean canAccess(AccessibleObject accessibleObject, Object obj) {
/* 1 */                             return true;
                                }
                            };
                        }
/* 35 */                INSTANCE = accessChecker;
                    }

                    private AccessChecker() {
                    }

                    public abstract boolean canAccess(AccessibleObject accessibleObject, Object obj);
                }

                private ReflectionAccessFilterHelper() {
                }

                public static boolean canAccess(AccessibleObject accessibleObject, Object obj) {
/* 3 */             return AccessChecker.INSTANCE.canAccess(accessibleObject, obj);
                }

                public static ReflectionAccessFilter.FilterResult getFilterResult(List<ReflectionAccessFilter> list, Class<?> cls) {
/* 1 */             Iterator<ReflectionAccessFilter> it = list.iterator();
/* 9 */             while (it.hasNext()) {
/* 17 */                ReflectionAccessFilter.FilterResult filterResultCheck = it.next().check(cls);
/* 23 */                if (filterResultCheck != ReflectionAccessFilter.FilterResult.INDECISIVE) {
/* 25 */                    return filterResultCheck;
                        }
                    }
/* 26 */            return ReflectionAccessFilter.FilterResult.ALLOW;
                }

                private static boolean isAndroidType(String str) {
                    return str.startsWith("android.") || str.startsWith("androidx.") || isJavaType(str);
                }

                public static boolean isAnyPlatformType(Class<?> cls) {
/* 1 */             String name = cls.getName();
                    return isAndroidType(name) || name.startsWith("kotlin.") || name.startsWith("kotlinx.") || name.startsWith("scala.");
                }

                private static boolean isJavaType(String str) {
                    return str.startsWith("java.") || str.startsWith("javax.");
                }

/* 21 */        public static boolean isJavaType(Class<?> cls) {
/* 22 */            return isJavaType(cls.getName());
                }

/* 27 */        public static boolean isAndroidType(Class<?> cls) {
/* 28 */            return isAndroidType(cls.getName());
                }
            }
