            package com.google.gson.internal;

            import com.google.gson.InstanceCreator;
            import com.google.gson.JsonIOException;
            import com.google.gson.ReflectionAccessFilter;
            import com.google.gson.internal.reflect.ReflectionHelper;
            import com.google.gson.reflect.TypeToken;
            import java.lang.reflect.Constructor;
            import java.lang.reflect.InvocationTargetException;
            import java.lang.reflect.Modifier;
            import java.lang.reflect.ParameterizedType;
            import java.lang.reflect.Type;
            import java.util.ArrayDeque;
            import java.util.ArrayList;
            import java.util.Collection;
            import java.util.EnumMap;
            import java.util.EnumSet;
            import java.util.LinkedHashMap;
            import java.util.LinkedHashSet;
            import java.util.List;
            import java.util.Map;
            import java.util.Queue;
            import java.util.Set;
            import java.util.SortedMap;
            import java.util.SortedSet;
            import java.util.TreeMap;
            import java.util.TreeSet;
            import java.util.concurrent.ConcurrentHashMap;
            import java.util.concurrent.ConcurrentMap;
            import java.util.concurrent.ConcurrentNavigableMap;
            import java.util.concurrent.ConcurrentSkipListMap;
            import p000.C1951n4;
            import p000.ds0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class ConstructorConstructor {
                private final Map<Type, InstanceCreator<?>> instanceCreators;
                private final List<ReflectionAccessFilter> reflectionFilters;
                private final boolean useJdkUnsafe;

                public ConstructorConstructor(Map<Type, InstanceCreator<?>> map, boolean z, List<ReflectionAccessFilter> list) {
/* 4 */             this.instanceCreators = map;
/* 6 */             this.useJdkUnsafe = z;
/* 8 */             this.reflectionFilters = list;
                }

                public static String checkInstantiable(Class<?> cls) {
/* 1 */             int modifiers = cls.getModifiers();
/* 9 */             if (Modifier.isInterface(modifiers)) {
/* 17 */                return "Interfaces can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Interface name: ".concat(cls.getName());
                    }
/* 26 */            if (Modifier.isAbstract(modifiers)) {
/* 34 */                return "Abstract classes can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Class name: ".concat(cls.getName());
                    }
/* 39 */            return null;
                }

                private static <T> ObjectConstructor<T> newDefaultConstructor(Class<? super T> cls, ReflectionAccessFilter.FilterResult filterResult) {
                    final String strTryMakeAccessible;
/* 10 */            if (Modifier.isAbstract(cls.getModifiers())) {
/* 9 */                 return null;
                    }
                    try {
/* 13 */                final Constructor<? super T> declaredConstructor = cls.getDeclaredConstructor(null);
/* 17 */                ReflectionAccessFilter.FilterResult filterResult2 = ReflectionAccessFilter.FilterResult.ALLOW;
/* 19 */                if (filterResult == filterResult2 || (ReflectionAccessFilterHelper.canAccess(declaredConstructor, null) && (filterResult != ReflectionAccessFilter.FilterResult.BLOCK_ALL || Modifier.isPublic(declaredConstructor.getModifiers())))) {
                            return (filterResult != filterResult2 || (strTryMakeAccessible = ReflectionHelper.tryMakeAccessible(declaredConstructor)) == null) ? new ObjectConstructor<T>() { // from class: com.google.gson.internal.ConstructorConstructor.9
                                @Override // com.google.gson.internal.ObjectConstructor
                                public T construct() {
                                    try {
/* 8 */                                 return (T) declaredConstructor.newInstance(null);
                                    } catch (IllegalAccessException e) {
/* 22 */                                throw ReflectionHelper.createExceptionForUnexpectedIllegalAccess(e);
                                    } catch (InstantiationException e2) {
/* 59 */                                C1951n4.m6861l("Failed to invoke constructor '", ReflectionHelper.constructorToString(declaredConstructor), "' with no args", e2);
/* 51 */                                return null;
                                    } catch (InvocationTargetException e3) {
/* 48 */                                ds0.m3198o("Failed to invoke constructor '" + ReflectionHelper.constructorToString(declaredConstructor) + "' with no args", e3.getCause());
/* 51 */                                return null;
                                    }
                                }
                            } : new ObjectConstructor<T>() { // from class: com.google.gson.internal.ConstructorConstructor.8
                                @Override // com.google.gson.internal.ObjectConstructor
                                public T construct() {
/* 8 */                             throw new JsonIOException(strTryMakeAccessible);
                                }
                            };
                        }
/* 57 */                final String str = "Unable to invoke no-args constructor of " + cls + "; constructor is not accessible and ReflectionAccessFilter does not permit making it accessible. Register an InstanceCreator or a TypeAdapter for this type, change the visibility of the constructor or adjust the access filter.";
/* 63 */                return new ObjectConstructor<T>() { // from class: com.google.gson.internal.ConstructorConstructor.7
                            @Override // com.google.gson.internal.ObjectConstructor
                            public T construct() {
/* 8 */                         throw new JsonIOException(str);
                            }
                        };
                    } catch (NoSuchMethodException unused) {
/* 9 */                 return null;
                    }
                }

                private static <T> ObjectConstructor<T> newDefaultImplementationConstructor(Type type, Class<? super T> cls) {
/* 7 */             if (Collection.class.isAssignableFrom(cls)) {
/* 15 */                if (SortedSet.class.isAssignableFrom(cls)) {
/* 19 */                    return new ObjectConstructor<T>() { // from class: com.google.gson.internal.ConstructorConstructor.10
                                @Override // com.google.gson.internal.ObjectConstructor
                                public T construct() {
/* 3 */                             return (T) new TreeSet();
                                }
                            };
                        }
/* 29 */                if (Set.class.isAssignableFrom(cls)) {
/* 33 */                    return new ObjectConstructor<T>() { // from class: com.google.gson.internal.ConstructorConstructor.11
                                @Override // com.google.gson.internal.ObjectConstructor
                                public T construct() {
/* 3 */                             return (T) new LinkedHashSet();
                                }
                            };
                        }
                        return Queue.class.isAssignableFrom(cls) ? new ObjectConstructor<T>() { // from class: com.google.gson.internal.ConstructorConstructor.12
                            @Override // com.google.gson.internal.ObjectConstructor
                            public T construct() {
/* 3 */                         return (T) new ArrayDeque();
                            }
                        } : new ObjectConstructor<T>() { // from class: com.google.gson.internal.ConstructorConstructor.13
                            @Override // com.google.gson.internal.ObjectConstructor
                            public T construct() {
/* 3 */                         return (T) new ArrayList();
                            }
                        };
                    }
/* 63 */            if (!Map.class.isAssignableFrom(cls)) {
/* 148 */               return null;
                    }
/* 71 */            if (ConcurrentNavigableMap.class.isAssignableFrom(cls)) {
/* 75 */                return new ObjectConstructor<T>() { // from class: com.google.gson.internal.ConstructorConstructor.14
                            @Override // com.google.gson.internal.ObjectConstructor
                            public T construct() {
/* 3 */                         return (T) new ConcurrentSkipListMap();
                            }
                        };
                    }
/* 85 */            if (ConcurrentMap.class.isAssignableFrom(cls)) {
/* 89 */                return new ObjectConstructor<T>() { // from class: com.google.gson.internal.ConstructorConstructor.15
                            @Override // com.google.gson.internal.ObjectConstructor
                            public T construct() {
/* 3 */                         return (T) new ConcurrentHashMap();
                            }
                        };
                    }
/* 99 */            if (SortedMap.class.isAssignableFrom(cls)) {
/* 103 */               return new ObjectConstructor<T>() { // from class: com.google.gson.internal.ConstructorConstructor.16
                            @Override // com.google.gson.internal.ObjectConstructor
                            public T construct() {
/* 3 */                         return (T) new TreeMap();
                            }
                        };
                    }
                    return (!(type instanceof ParameterizedType) || String.class.isAssignableFrom(TypeToken.get(((ParameterizedType) type).getActualTypeArguments()[0]).getRawType())) ? new ObjectConstructor<T>() { // from class: com.google.gson.internal.ConstructorConstructor.18
                        @Override // com.google.gson.internal.ObjectConstructor
                        public T construct() {
/* 3 */                     return (T) new LinkedTreeMap();
                        }
                    } : new ObjectConstructor<T>() { // from class: com.google.gson.internal.ConstructorConstructor.17
                        @Override // com.google.gson.internal.ObjectConstructor
                        public T construct() {
/* 3 */                     return (T) new LinkedHashMap();
                        }
                    };
                }

                private static <T> ObjectConstructor<T> newSpecialCollectionConstructor(final Type type, Class<? super T> cls) {
/* 7 */             if (EnumSet.class.isAssignableFrom(cls)) {
/* 11 */                return new ObjectConstructor<T>() { // from class: com.google.gson.internal.ConstructorConstructor.5
                            @Override // com.google.gson.internal.ObjectConstructor
                            public T construct() {
/* 1 */                         Type type2 = type;
/* 8 */                         if (!(type2 instanceof ParameterizedType)) {
/* 38 */                            C1951n4.m6869t(type, "Invalid EnumSet type: ");
/* 5 */                             return null;
                                }
/* 17 */                        Type type3 = ((ParameterizedType) type2).getActualTypeArguments()[0];
/* 21 */                        if (type3 instanceof Class) {
/* 25 */                            return (T) EnumSet.noneOf((Class) type3);
                                }
/* 32 */                        C1951n4.m6869t(type, "Invalid EnumSet type: ");
/* 5 */                         return null;
                            }
                        };
                    }
/* 17 */            if (cls == EnumMap.class) {
/* 21 */                return new ObjectConstructor<T>() { // from class: com.google.gson.internal.ConstructorConstructor.6
                            @Override // com.google.gson.internal.ObjectConstructor
                            public T construct() {
/* 1 */                         Type type2 = type;
/* 8 */                         if (!(type2 instanceof ParameterizedType)) {
/* 39 */                            C1951n4.m6869t(type, "Invalid EnumMap type: ");
/* 5 */                             return null;
                                }
/* 17 */                        Type type3 = ((ParameterizedType) type2).getActualTypeArguments()[0];
/* 21 */                        if (type3 instanceof Class) {
/* 27 */                            return (T) new EnumMap((Class) type3);
                                }
/* 33 */                        C1951n4.m6869t(type, "Invalid EnumMap type: ");
/* 5 */                         return null;
                            }
                        };
                    }
/* 25 */            return null;
                }

                private <T> ObjectConstructor<T> newUnsafeAllocator(final Class<? super T> cls) {
/* 3 */             if (this.useJdkUnsafe) {
/* 7 */                 return new ObjectConstructor<T>() { // from class: com.google.gson.internal.ConstructorConstructor.19
                            @Override // com.google.gson.internal.ObjectConstructor
                            public T construct() {
                                try {
/* 5 */                             return (T) UnsafeAllocator.INSTANCE.newInstance(cls);
                                } catch (Exception e) {
/* 17 */                            C1951n4.m6861l("Unable to create instance of ", cls, ". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem.", e);
/* 20 */                            return null;
                                }
                            }
                        };
                    }
/* 26 */            final String str = "Unable to create instance of " + cls + "; usage of JDK Unsafe is disabled. Registering an InstanceCreator or a TypeAdapter for this type, adding a no-args constructor, or enabling usage of JDK Unsafe may fix this problem.";
/* 32 */            return new ObjectConstructor<T>() { // from class: com.google.gson.internal.ConstructorConstructor.20
                        @Override // com.google.gson.internal.ObjectConstructor
                        public T construct() {
/* 8 */                     throw new JsonIOException(str);
                        }
                    };
                }

                public <T> ObjectConstructor<T> get(TypeToken<T> typeToken) {
/* 1 */             final Type type = typeToken.getType();
/* 5 */             Class<? super T> rawType = typeToken.getRawType();
/* 11 */            final InstanceCreator<?> instanceCreator = this.instanceCreators.get(type);
/* 17 */            if (instanceCreator != null) {
/* 21 */                return new ObjectConstructor<T>() { // from class: com.google.gson.internal.ConstructorConstructor.1
                            @Override // com.google.gson.internal.ObjectConstructor
                            public T construct() {
/* 5 */                         return (T) instanceCreator.createInstance(type);
                            }
                        };
                    }
/* 27 */            final InstanceCreator<?> instanceCreator2 = this.instanceCreators.get(rawType);
/* 33 */            if (instanceCreator2 != null) {
/* 37 */                return new ObjectConstructor<T>() { // from class: com.google.gson.internal.ConstructorConstructor.2
                            @Override // com.google.gson.internal.ObjectConstructor
                            public T construct() {
/* 5 */                         return (T) instanceCreator2.createInstance(type);
                            }
                        };
                    }
/* 41 */            ObjectConstructor<T> objectConstructorNewSpecialCollectionConstructor = newSpecialCollectionConstructor(type, rawType);
/* 45 */            if (objectConstructorNewSpecialCollectionConstructor != null) {
/* 47 */                return objectConstructorNewSpecialCollectionConstructor;
                    }
/* 50 */            ReflectionAccessFilter.FilterResult filterResult = ReflectionAccessFilterHelper.getFilterResult(this.reflectionFilters, rawType);
/* 54 */            ObjectConstructor<T> objectConstructorNewDefaultConstructor = newDefaultConstructor(rawType, filterResult);
/* 58 */            if (objectConstructorNewDefaultConstructor != null) {
/* 60 */                return objectConstructorNewDefaultConstructor;
                    }
/* 61 */            ObjectConstructor<T> objectConstructorNewDefaultImplementationConstructor = newDefaultImplementationConstructor(type, rawType);
/* 65 */            if (objectConstructorNewDefaultImplementationConstructor != null) {
/* 67 */                return objectConstructorNewDefaultImplementationConstructor;
                    }
/* 68 */            final String strCheckInstantiable = checkInstantiable(rawType);
/* 72 */            if (strCheckInstantiable != null) {
/* 76 */                return new ObjectConstructor<T>() { // from class: com.google.gson.internal.ConstructorConstructor.3
                            @Override // com.google.gson.internal.ObjectConstructor
                            public T construct() {
/* 8 */                         throw new JsonIOException(strCheckInstantiable);
                            }
                        };
                    }
/* 82 */            if (filterResult == ReflectionAccessFilter.FilterResult.ALLOW) {
/* 84 */                return newUnsafeAllocator(rawType);
                    }
/* 104 */           final String str = "Unable to create instance of " + rawType + "; ReflectionAccessFilter does not permit using reflection or Unsafe. Register an InstanceCreator or a TypeAdapter for this type or adjust the access filter to allow using reflection.";
/* 110 */           return new ObjectConstructor<T>() { // from class: com.google.gson.internal.ConstructorConstructor.4
                        @Override // com.google.gson.internal.ObjectConstructor
                        public T construct() {
/* 8 */                     throw new JsonIOException(str);
                        }
                    };
                }

                public String toString() {
/* 3 */             return this.instanceCreators.toString();
                }
            }
