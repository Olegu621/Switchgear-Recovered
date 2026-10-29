            package p000;

            import java.lang.reflect.Method;
            import java.util.HashMap;
            import java.util.Map;
            
            /* JADX INFO: renamed from: jv */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1807jv {

                /* JADX INFO: renamed from: c */
                public static final C1807jv f12502c = new C1807jv();

                /* JADX INFO: renamed from: a */
                public final HashMap f12503a = new HashMap();

                /* JADX INFO: renamed from: b */
                public final HashMap f12504b = new HashMap();

                /* JADX INFO: renamed from: b */
                public static void m5898b(HashMap map, C1770iv c1770iv, t61 t61Var, Class cls) {
/* 5 */             t61 t61Var2 = (t61) map.get(c1770iv);
/* 7 */             if (t61Var2 == null || t61Var == t61Var2) {
/* 66 */                if (t61Var2 == null) {
/* 68 */                    map.put(c1770iv, t61Var);
/* 71 */                    return;
                        }
/* 71 */                return;
                    }
/* 65 */            throw new IllegalArgumentException("Method " + c1770iv.f11941b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + t61Var2 + ", new value " + t61Var);
                }

                /* JADX INFO: renamed from: a */
                public final C1005hv m5899a(Class cls, Method[] methodArr) {
                    int i;
/* 1 */             Class superclass = cls.getSuperclass();
/* 7 */             HashMap map = new HashMap();
/* 11 */            HashMap map2 = this.f12503a;
/* 13 */            if (superclass != null) {
/* 19 */                C1005hv c1005hvM5899a = (C1005hv) map2.get(superclass);
/* 21 */                if (c1005hvM5899a == null) {
/* 24 */                    c1005hvM5899a = m5899a(superclass, null);
                        }
/* 30 */                map.putAll(c1005hvM5899a.f9332b);
                    }
/* 40 */            for (Class<?> cls2 : cls.getInterfaces()) {
/* 48 */                C1005hv c1005hvM5899a2 = (C1005hv) map2.get(cls2);
/* 50 */                if (c1005hvM5899a2 == null) {
/* 53 */                    c1005hvM5899a2 = m5899a(cls2, null);
                        }
/* 71 */                for (Map.Entry entry : c1005hvM5899a2.f9332b.entrySet()) {
/* 91 */                    m5898b(map, (C1770iv) entry.getKey(), (t61) entry.getValue(), cls);
                        }
                    }
/* 98 */            if (methodArr == null) {
                        try {
/* 101 */                   methodArr = cls.getDeclaredMethods();
                        } catch (NoClassDefFoundError e) {
/* 233 */                   throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
                        }
                    }
/* 107 */           boolean z = false;
/* 108 */           for (Method method : methodArr) {
/* 118 */               zp1 zp1Var = (zp1) method.getAnnotation(zp1.class);
/* 120 */               if (zp1Var != null) {
/* 123 */                   Class<?>[] parameterTypes = method.getParameterTypes();
/* 129 */                   if (parameterTypes.length <= 0) {
/* 149 */                       i = 0;
                            } else {
/* 139 */                       if (!g71.class.isAssignableFrom(parameterTypes[0])) {
/* 145 */                           C1951n4.m6859j("invalid parameter type. Must be one and instanceof LifecycleOwner");
/* 10 */                            return null;
                                }
/* 141 */                       i = 1;
                            }
/* 150 */                   t61 t61VarValue = zp1Var.value();
/* 156 */                   if (parameterTypes.length > 1) {
/* 166 */                       if (!t61.class.isAssignableFrom(parameterTypes[1])) {
/* 182 */                           C1951n4.m6859j("invalid parameter type. second arg must be an event");
/* 10 */                            return null;
                                }
/* 170 */                       if (t61VarValue != t61.ON_ANY) {
/* 176 */                           C1951n4.m6859j("Second arg is supported only for ON_ANY value");
/* 10 */                            return null;
                                }
/* 172 */                       i = 2;
                            }
/* 187 */                   if (parameterTypes.length > 2) {
/* 203 */                       C1951n4.m6859j("cannot have more than 2 params");
/* 10 */                        return null;
                            }
/* 194 */                   m5898b(map, new C1770iv(method, i), t61VarValue, cls);
/* 197 */                   z = true;
                        }
                    }
/* 209 */           C1005hv c1005hv = new C1005hv(map);
/* 212 */           map2.put(cls, c1005hv);
/* 221 */           this.f12504b.put(cls, Boolean.valueOf(z));
/* 224 */           return c1005hv;
                }
            }
