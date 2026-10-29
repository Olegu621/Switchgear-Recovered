            package com.supercell.titan;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 25 */    public class ReflectionUtils {
                public static Object callStaticMethod(String str, String str2, Class cls, Object obj) {
/* 1 */             cls.getName();
                    try {
/* 21 */                return Class.forName(str).getMethod(str2, cls).invoke(null, obj);
                    } catch (Exception unused) {
/* 4 */                 return null;
                    }
                }

                public static Object getStaticFieldValue(String str, String str2) {
                    try {
/* 1 */                 Class<?> cls = Class.forName(str);
/* 9 */                 return cls.getField(str2).get(cls);
                    } catch (Exception unused) {
/* 14 */                return null;
                    }
                }

/* 26 */        public static Object callStaticMethod(String str, String str2, Object[] objArr, Class<?>[] clsArr) {
                    try {
/* 29 */                return Class.forName(str).getMethod(str2, clsArr).invoke(null, objArr);
                    } catch (Exception unused) {
                        return null;
                    }
                }
            }
