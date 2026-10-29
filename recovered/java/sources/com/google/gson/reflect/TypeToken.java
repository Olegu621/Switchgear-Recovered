            package com.google.gson.reflect;

            import com.google.gson.internal.C$Gson$Types;
            import java.lang.reflect.GenericArrayType;
            import java.lang.reflect.ParameterizedType;
            import java.lang.reflect.Type;
            import java.lang.reflect.TypeVariable;
            import java.util.HashMap;
            import java.util.Map;
            import java.util.Objects;
            import p000.f42;
            import p000.s80;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 5 */     public class TypeToken<T> {
                private final int hashCode;
                private final Class<? super T> rawType;
                private final Type type;

                private TypeToken(Type type) {
/* 4 */             Objects.requireNonNull(type);
/* 9 */             Type typeCanonicalize = C$Gson$Types.canonicalize(type);
/* 13 */            this.type = typeCanonicalize;
/* 19 */            this.rawType = (Class<? super T>) C$Gson$Types.getRawType(typeCanonicalize);
/* 25 */            this.hashCode = typeCanonicalize.hashCode();
                }

                private static AssertionError buildUnexpectedTypeError(Type type, Class<?>... clsArr) {
/* 5 */             StringBuilder sb = new StringBuilder("Unexpected type. Expected one of: ");
/* 10 */            for (Class<?> cls : clsArr) {
/* 18 */                sb.append(cls.getName());
/* 23 */                sb.append(", ");
                    }
/* 31 */            sb.append("but got: ");
/* 42 */            sb.append(type.getClass().getName());
/* 47 */            sb.append(", for type token: ");
/* 54 */            sb.append(type.toString());
/* 59 */            sb.append('.');
/* 68 */            return new AssertionError(sb.toString());
                }

                public static TypeToken<?> get(Type type) {
/* 3 */             return new TypeToken<>(type);
                }

                public static TypeToken<?> getArray(Type type) {
/* 7 */             return new TypeToken<>(C$Gson$Types.arrayOf(type));
                }

                public static TypeToken<?> getParameterized(Type type, Type... typeArr) {
/* 1 */             Objects.requireNonNull(type);
/* 4 */             Objects.requireNonNull(typeArr);
/* 10 */            if (!(type instanceof Class)) {
/* 121 */               s80.m8430k(type, "rawType must be of type Class, but was ");
/* 9 */                 return null;
                    }
/* 13 */            Class cls = (Class) type;
/* 15 */            TypeVariable<Class<T>>[] typeParameters = cls.getTypeParameters();
/* 19 */            int length = typeParameters.length;
/* 20 */            int length2 = typeArr.length;
/* 21 */            if (length2 != length) {
/* 115 */               f42.m3653i(cls.getName(), " requires ", length, " type arguments, but got ", length2);
/* 9 */                 return null;
                    }
/* 25 */            for (int i = 0; i < length; i++) {
/* 27 */                Type type2 = typeArr[i];
/* 29 */                Class<?> rawType = C$Gson$Types.getRawType(type2);
/* 33 */                TypeVariable<Class<T>> typeVariable = typeParameters[i];
/* 41 */                for (Type type3 : typeVariable.getBounds()) {
/* 53 */                    if (!C$Gson$Types.getRawType(type3).isAssignableFrom(rawType)) {
/* 93 */                        throw new IllegalArgumentException("Type argument " + type2 + " does not satisfy bounds for type variable " + typeVariable + " declared by " + type);
                            }
                        }
                    }
/* 103 */           return new TypeToken<>(C$Gson$Types.newParameterizedTypeWithOwner(null, type, typeArr));
                }

                private Type getTypeTokenTypeArgument() {
/* 5 */             Type genericSuperclass = getClass().getGenericSuperclass();
/* 14 */            if (genericSuperclass instanceof ParameterizedType) {
/* 16 */                ParameterizedType parameterizedType = (ParameterizedType) genericSuperclass;
/* 22 */                if (parameterizedType.getRawType() == TypeToken.class) {
/* 31 */                    return C$Gson$Types.canonicalize(parameterizedType.getActualTypeArguments()[0]);
                        }
                    } else if (genericSuperclass == TypeToken.class) {
/* 40 */                f42.m3656l("TypeToken must be created with a type argument: new TypeToken<...>() {}; When using code shrinkers (ProGuard, R8, ...) make sure that generic signatures are preserved.");
/* 11 */                return null;
                    }
/* 46 */            f42.m3656l("Must only create direct subclasses of TypeToken");
/* 11 */            return null;
                }

                private static boolean isAssignableFrom(Type type, ParameterizedType parameterizedType, Map<String, Type> map) {
/* 2 */             if (type == null) {
/* 1 */                 return false;
                    }
/* 10 */            if (parameterizedType.equals(type)) {
/* 9 */                 return true;
                    }
/* 13 */            Class<?> rawType = C$Gson$Types.getRawType(type);
/* 24 */            ParameterizedType parameterizedType2 = type instanceof ParameterizedType ? (ParameterizedType) type : null;
/* 25 */            if (parameterizedType2 != null) {
/* 27 */                Type[] actualTypeArguments = parameterizedType2.getActualTypeArguments();
/* 31 */                TypeVariable<Class<?>>[] typeParameters = rawType.getTypeParameters();
/* 37 */                for (int i = 0; i < actualTypeArguments.length; i++) {
/* 39 */                    Type type2 = actualTypeArguments[i];
/* 41 */                    TypeVariable<Class<?>> typeVariable = typeParameters[i];
/* 45 */                    while (type2 instanceof TypeVariable) {
/* 53 */                        type2 = map.get(((TypeVariable) type2).getName());
                            }
/* 64 */                    map.put(typeVariable.getName(), type2);
                        }
/* 74 */                if (typeEquals(parameterizedType2, parameterizedType, map)) {
/* 9 */                     return true;
                        }
                    }
/* 82 */            for (Type type3 : rawType.getGenericInterfaces()) {
/* 95 */                if (isAssignableFrom(type3, parameterizedType, new HashMap(map))) {
/* 9 */                     return true;
                        }
                    }
/* 110 */           return isAssignableFrom(rawType.getGenericSuperclass(), parameterizedType, new HashMap(map));
                }

                private static boolean matches(Type type, Type type2, Map<String, Type> map) {
/* 5 */             if (type2.equals(type)) {
/* 30 */                return true;
                    }
                    return (type instanceof TypeVariable) && type2.equals(map.get(((TypeVariable) type).getName()));
                }

                private static boolean typeEquals(ParameterizedType parameterizedType, ParameterizedType parameterizedType2, Map<String, Type> map) {
/* 14 */            if (!parameterizedType.getRawType().equals(parameterizedType2.getRawType())) {
/* 13 */                return false;
                    }
/* 16 */            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
/* 20 */            Type[] actualTypeArguments2 = parameterizedType2.getActualTypeArguments();
/* 26 */            for (int i = 0; i < actualTypeArguments.length; i++) {
/* 36 */                if (!matches(actualTypeArguments[i], actualTypeArguments2[i], map)) {
/* 13 */                    return false;
                        }
                    }
/* 42 */            return true;
                }

                public final boolean equals(Object obj) {
                    return (obj instanceof TypeToken) && C$Gson$Types.equals(this.type, ((TypeToken) obj).type);
                }

                public final Class<? super T> getRawType() {
/* 1 */             return this.rawType;
                }

                public final Type getType() {
/* 1 */             return this.type;
                }

                public final int hashCode() {
/* 1 */             return this.hashCode;
                }

                public final String toString() {
/* 3 */             return C$Gson$Types.typeToString(this.type);
                }

/* 6 */         public static <T> TypeToken<T> get(Class<T> cls) {
/* 7 */             return new TypeToken<>(cls);
                }

/* 27 */        public TypeToken() {
/* 29 */            Type typeTokenTypeArgument = getTypeTokenTypeArgument();
                    this.type = typeTokenTypeArgument;
/* 30 */            this.rawType = (Class<? super T>) C$Gson$Types.getRawType(typeTokenTypeArgument);
/* 31 */            this.hashCode = typeTokenTypeArgument.hashCode();
                }

                @Deprecated
/* 114 */       public boolean isAssignableFrom(Type type) {
                    if (type == null) {
                        return false;
                    }
/* 115 */           if (this.type.equals(type)) {
                        return true;
                    }
/* 116 */           Type type2 = this.type;
                    if (type2 instanceof Class) {
/* 117 */               return this.rawType.isAssignableFrom(C$Gson$Types.getRawType(type));
                    }
/* 118 */           if (type2 instanceof ParameterizedType) {
/* 119 */               return isAssignableFrom(type, (ParameterizedType) type2, new HashMap());
                    }
/* 120 */           if (type2 instanceof GenericArrayType) {
                        return this.rawType.isAssignableFrom(C$Gson$Types.getRawType(type)) && isAssignableFrom(type, (GenericArrayType) this.type);
                    }
/* 123 */           throw buildUnexpectedTypeError(type2, Class.class, ParameterizedType.class, GenericArrayType.class);
                }

                @Deprecated
/* 123 */       public boolean isAssignableFrom(TypeToken<?> typeToken) {
/* 124 */           return isAssignableFrom(typeToken.getType());
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.reflect.Type] */
                /* JADX WARN: Type inference failed for: r1v10 */
                /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Class] */
                /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.reflect.Type] */
                /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.reflect.Type] */
                /* JADX WARN: Type inference failed for: r1v9 */
/* 124 */       private static boolean isAssignableFrom(Type type, GenericArrayType genericArrayType) {
/* 125 */           Type genericComponentType = genericArrayType.getGenericComponentType();
/* 126 */           if (!(genericComponentType instanceof ParameterizedType)) {
                        return true;
                    }
/* 127 */           if (type instanceof GenericArrayType) {
/* 128 */               type = ((GenericArrayType) type).getGenericComponentType();
                    } else if (type instanceof Class) {
/* 130 */               type = (Class) type;
/* 131 */               while (type.isArray()) {
/* 132 */                   type = type.getComponentType();
                        }
                    }
/* 133 */           return isAssignableFrom(type, (ParameterizedType) genericComponentType, new HashMap());
                }

                @Deprecated
/* 133 */       public boolean isAssignableFrom(Class<?> cls) {
/* 134 */           return isAssignableFrom((Type) cls);
                }
            }
