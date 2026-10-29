            package p000;

            import java.lang.reflect.Constructor;
            import java.lang.reflect.InvocationTargetException;
            import java.lang.reflect.Method;
            import java.util.ArrayList;
            import java.util.Collection;
            import java.util.HashMap;
            import kotlin.collections.C1839a;
            import kotlin.text.C1852e;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class k71 {

                /* JADX INFO: renamed from: a */
                public static final HashMap f12630a = new HashMap();

                /* JADX INFO: renamed from: b */
                public static final HashMap f12631b = new HashMap();

                /* JADX INFO: renamed from: a */
                public static void m5997a(Constructor constructor, f71 f71Var) {
                    try {
/* 9 */                 constructor.newInstance(f71Var).getClass();
/* 17 */                throw new ClassCastException();
                    } catch (IllegalAccessException e) {
/* 38 */                throw new RuntimeException(e);
                    } catch (InstantiationException e2) {
/* 31 */                throw new RuntimeException(e2);
                    } catch (InvocationTargetException e3) {
/* 24 */                throw new RuntimeException(e3);
                    }
                }

                /* JADX WARN: Code duplicated, block: B:58:0x00ff  */
                /* JADX WARN: Code duplicated, block: B:70:0x012b  */
                /* JADX INFO: renamed from: b */
                public static int m5998b(Class cls) {
                    Constructor<?> declaredConstructor;
                    boolean zBooleanValue;
                    Class<?>[] interfaces;
/* 1 */             HashMap map = f12630a;
/* 7 */             Integer num = (Integer) map.get(cls);
/* 9 */             if (num != null) {
/* 11 */                return num.intValue();
                    }
/* 20 */            int i = 1;
/* 21 */            if (cls.getCanonicalName() != null) {
/* 26 */                ArrayList arrayList = null;
                        try {
/* 27 */                    Package r4 = cls.getPackage();
/* 31 */                    String canonicalName = cls.getCanonicalName();
/* 44 */                    String name = r4 != null ? r4.getName() : HttpUrl.FRAGMENT_ENCODE_SET;
/* 46 */                    name.getClass();
/* 53 */                    if (name.length() != 0) {
/* 56 */                        canonicalName.getClass();
/* 64 */                        canonicalName = canonicalName.substring(name.length() + 1);
                            }
/* 68 */                    canonicalName.getClass();
/* 81 */                    String strConcat = C1852e.m6261k(canonicalName, ".", "_").concat("_LifecycleAdapter");
/* 89 */                    if (name.length() != 0) {
/* 108 */                       strConcat = name + '.' + strConcat;
                            }
/* 120 */                   declaredConstructor = Class.forName(strConcat).getDeclaredConstructor(cls);
/* 128 */                   if (!declaredConstructor.isAccessible()) {
/* 130 */                       declaredConstructor.setAccessible(true);
                            }
                        } catch (ClassNotFoundException unused) {
/* 138 */                   declaredConstructor = null;
                        } catch (NoSuchMethodException e) {
/* 134 */                   ds0.m3199p(e);
/* 25 */                    return 0;
                        }
/* 140 */               HashMap map2 = f12631b;
/* 142 */               if (declaredConstructor != null) {
/* 148 */                   map2.put(cls, C1839a.m6210b(declaredConstructor));
                        } else {
/* 154 */                   C1807jv c1807jv = C1807jv.f12502c;
/* 156 */                   HashMap map3 = c1807jv.f12504b;
/* 162 */                   Boolean bool = (Boolean) map3.get(cls);
/* 164 */                   if (bool != null) {
/* 166 */                       zBooleanValue = bool.booleanValue();
                            } else {
                                try {
/* 171 */                           Method[] declaredMethods = cls.getDeclaredMethods();
/* 175 */                           int length = declaredMethods.length;
/* 176 */                           int i2 = 0;
                                    while (true) {
/* 177 */                               if (i2 >= length) {
/* 201 */                                   map3.put(cls, Boolean.FALSE);
/* 204 */                                   zBooleanValue = false;
                                            break;
                                        }
/* 189 */                               if (((zp1) declaredMethods[i2].getAnnotation(zp1.class)) != null) {
/* 191 */                                   c1807jv.m5899a(cls, declaredMethods);
/* 194 */                                   zBooleanValue = true;
                                            break;
                                        }
/* 196 */                               i2++;
                                    }
                                } catch (NoClassDefFoundError e2) {
/* 321 */                           throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e2);
                                }
                            }
/* 205 */                   if (!zBooleanValue) {
/* 208 */                       Class superclass = cls.getSuperclass();
/* 214 */                       if (superclass == null || !f71.class.isAssignableFrom(superclass)) {
/* 246 */                           interfaces = cls.getInterfaces();
/* 250 */                           interfaces.getClass();
/* 254 */                           for (Class<?> cls2 : interfaces) {
/* 258 */                               if (cls2 == null && f71.class.isAssignableFrom(cls2)) {
/* 266 */                                   cls2.getClass();
/* 273 */                                   if (m5998b(cls2) != 1) {
/* 276 */                                       if (arrayList == null) {
/* 280 */                                           arrayList = new ArrayList();
                                                }
/* 283 */                                       Object obj = map2.get(cls2);
/* 287 */                                       obj.getClass();
/* 292 */                                       arrayList.addAll((Collection) obj);
                                            }
                                        }
                                    }
/* 298 */                           if (arrayList != null) {
/* 300 */                               map2.put(cls, arrayList);
                                    }
                                } else {
/* 222 */                           superclass.getClass();
/* 229 */                           if (m5998b(superclass) != 1) {
/* 234 */                               Object obj2 = map2.get(superclass);
/* 238 */                               obj2.getClass();
/* 243 */                               arrayList = new ArrayList((Collection) obj2);
/* 246 */                               interfaces = cls.getInterfaces();
/* 250 */                               interfaces.getClass();
/* 254 */                               while (i < r8) {
/* 258 */                                   if (cls2 == null) {
                                            }
                                        }
/* 298 */                               if (arrayList != null) {
/* 300 */                                   map2.put(cls, arrayList);
                                        }
                                    }
                                }
                            }
                        }
/* 151 */               i = 2;
                    }
/* 309 */           map.put(cls, Integer.valueOf(i));
/* 312 */           return i;
                }
            }
