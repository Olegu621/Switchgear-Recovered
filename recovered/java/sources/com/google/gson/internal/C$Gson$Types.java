            package com.google.gson.internal;

            import java.io.Serializable;
            import java.lang.reflect.Array;
            import java.lang.reflect.GenericArrayType;
            import java.lang.reflect.GenericDeclaration;
            import java.lang.reflect.Modifier;
            import java.lang.reflect.ParameterizedType;
            import java.lang.reflect.Type;
            import java.lang.reflect.TypeVariable;
            import java.lang.reflect.WildcardType;
            import java.util.Arrays;
            import java.util.Collection;
            import java.util.HashMap;
            import java.util.Map;
            import java.util.Objects;
            import java.util.Properties;
            import okhttp3.HttpUrl;
            import p000.C1951n4;
            import p000.ds0;
            
            /* JADX INFO: renamed from: com.google.gson.internal.$Gson$Types, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 222 */   public final class C$Gson$Types {
                static final /* synthetic */ boolean $assertionsDisabled = false;
                static final Type[] EMPTY_TYPE_ARRAY = new Type[0];

                /* JADX INFO: renamed from: com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl */
                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static final class GenericArrayTypeImpl implements GenericArrayType, Serializable {
                    private static final long serialVersionUID = 0;
                    private final Type componentType;

                    public GenericArrayTypeImpl(Type type) {
/* 4 */                 Objects.requireNonNull(type);
/* 11 */                this.componentType = C$Gson$Types.canonicalize(type);
                    }

                    public boolean equals(Object obj) {
                        return (obj instanceof GenericArrayType) && C$Gson$Types.equals(this, (GenericArrayType) obj);
                    }

                    @Override // java.lang.reflect.GenericArrayType
                    public Type getGenericComponentType() {
/* 1 */                 return this.componentType;
                    }

                    public int hashCode() {
/* 3 */                 return this.componentType.hashCode();
                    }

                    public String toString() {
/* 20 */                return C$Gson$Types.typeToString(this.componentType) + HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
                    }
                }

                /* JADX INFO: renamed from: com.google.gson.internal.$Gson$Types$ParameterizedTypeImpl */
                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static final class ParameterizedTypeImpl implements ParameterizedType, Serializable {
                    private static final long serialVersionUID = 0;
                    private final Type ownerType;
                    private final Type rawType;
                    private final Type[] typeArguments;

                    public ParameterizedTypeImpl(Type type, Type type2, Type... typeArr) {
/* 4 */                 Objects.requireNonNull(type2);
/* 10 */                if (type2 instanceof Class) {
/* 13 */                    Class cls = (Class) type2;
/* 23 */                    boolean z = true;
/* 35 */                    boolean z2 = Modifier.isStatic(cls.getModifiers()) || cls.getEnclosingClass() == null;
/* 36 */                    if (type == null && !z2) {
/* 41 */                        z = false;
                            }
/* 42 */                    C$Gson$Preconditions.checkArgument(z);
                        }
/* 53 */                this.ownerType = type == null ? null : C$Gson$Types.canonicalize(type);
/* 59 */                this.rawType = C$Gson$Types.canonicalize(type2);
/* 65 */                Type[] typeArr2 = (Type[]) typeArr.clone();
/* 67 */                this.typeArguments = typeArr2;
/* 69 */                int length = typeArr2.length;
/* 70 */                for (int i = 0; i < length; i++) {
/* 76 */                    Objects.requireNonNull(this.typeArguments[i]);
/* 83 */                    C$Gson$Types.checkNotPrimitive(this.typeArguments[i]);
/* 86 */                    Type[] typeArr3 = this.typeArguments;
/* 94 */                    typeArr3[i] = C$Gson$Types.canonicalize(typeArr3[i]);
                        }
                    }

                    private static int hashCodeOrZero(Object obj) {
/* 1 */                 if (obj != null) {
/* 3 */                     return obj.hashCode();
                        }
/* 8 */                 return 0;
                    }

                    public boolean equals(Object obj) {
                        return (obj instanceof ParameterizedType) && C$Gson$Types.equals(this, (ParameterizedType) obj);
                    }

                    @Override // java.lang.reflect.ParameterizedType
                    public Type[] getActualTypeArguments() {
/* 7 */                 return (Type[]) this.typeArguments.clone();
                    }

                    @Override // java.lang.reflect.ParameterizedType
                    public Type getOwnerType() {
/* 1 */                 return this.ownerType;
                    }

                    @Override // java.lang.reflect.ParameterizedType
                    public Type getRawType() {
/* 1 */                 return this.rawType;
                    }

                    public int hashCode() {
/* 20 */                return hashCodeOrZero(this.ownerType) ^ (Arrays.hashCode(this.typeArguments) ^ this.rawType.hashCode());
                    }

                    public String toString() {
/* 3 */                 int length = this.typeArguments.length;
/* 4 */                 if (length == 0) {
/* 8 */                     return C$Gson$Types.typeToString(this.rawType);
                        }
/* 19 */                StringBuilder sb = new StringBuilder((length + 1) * 30);
/* 28 */                sb.append(C$Gson$Types.typeToString(this.rawType));
/* 33 */                sb.append("<");
/* 45 */                sb.append(C$Gson$Types.typeToString(this.typeArguments[0]));
/* 49 */                for (int i = 1; i < length; i++) {
/* 53 */                    sb.append(", ");
/* 64 */                    sb.append(C$Gson$Types.typeToString(this.typeArguments[i]));
                        }
/* 72 */                sb.append(">");
/* 75 */                return sb.toString();
                    }
                }

                /* JADX INFO: renamed from: com.google.gson.internal.$Gson$Types$WildcardTypeImpl */
                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static final class WildcardTypeImpl implements WildcardType, Serializable {
                    private static final long serialVersionUID = 0;
                    private final Type lowerBound;
                    private final Type upperBound;

                    public WildcardTypeImpl(Type[] typeArr, Type[] typeArr2) {
/* 12 */                C$Gson$Preconditions.checkArgument(typeArr2.length <= 1);
/* 21 */                C$Gson$Preconditions.checkArgument(typeArr.length == 1);
/* 25 */                if (typeArr2.length != 1) {
/* 61 */                    Objects.requireNonNull(typeArr[0]);
/* 66 */                    C$Gson$Types.checkNotPrimitive(typeArr[0]);
/* 70 */                    this.lowerBound = null;
/* 78 */                    this.upperBound = C$Gson$Types.canonicalize(typeArr[0]);
/* 80 */                    return;
                        }
/* 29 */                Objects.requireNonNull(typeArr2[0]);
/* 34 */                C$Gson$Types.checkNotPrimitive(typeArr2[0]);
/* 45 */                C$Gson$Preconditions.checkArgument(typeArr[0] == Object.class);
/* 54 */                this.lowerBound = C$Gson$Types.canonicalize(typeArr2[0]);
/* 56 */                this.upperBound = Object.class;
                    }

                    public boolean equals(Object obj) {
                        return (obj instanceof WildcardType) && C$Gson$Types.equals(this, (WildcardType) obj);
                    }

                    @Override // java.lang.reflect.WildcardType
                    public Type[] getLowerBounds() {
/* 1 */                 Type type = this.lowerBound;
                        return type != null ? new Type[]{type} : C$Gson$Types.EMPTY_TYPE_ARRAY;
                    }

                    @Override // java.lang.reflect.WildcardType
                    public Type[] getUpperBounds() {
/* 4 */                 return new Type[]{this.upperBound};
                    }

                    public int hashCode() {
/* 1 */                 Type type = this.lowerBound;
/* 21 */                return (this.upperBound.hashCode() + 31) ^ (type != null ? type.hashCode() + 31 : 1);
                    }

                    public String toString() {
/* 3 */                 if (this.lowerBound != null) {
/* 21 */                    return "? super " + C$Gson$Types.typeToString(this.lowerBound);
                        }
/* 30 */                if (this.upperBound == Object.class) {
/* 32 */                    return "?";
                        }
/* 51 */                return "? extends " + C$Gson$Types.typeToString(this.upperBound);
                    }
                }

                private C$Gson$Types() {
/* 9 */             throw new UnsupportedOperationException();
                }

                public static GenericArrayType arrayOf(Type type) {
/* 3 */             return new GenericArrayTypeImpl(type);
                }

                public static Type canonicalize(Type type) {
                    Type genericArrayTypeImpl;
/* 3 */             if (type instanceof Class) {
/* 5 */                 Class cls = (Class) type;
/* 11 */                if (cls.isArray()) {
                            genericArrayTypeImpl = cls;
/* 23 */                    genericArrayTypeImpl = new GenericArrayTypeImpl(canonicalize(cls.getComponentType()));
                        }
                        genericArrayTypeImpl = cls;
/* 27 */                return genericArrayTypeImpl;
                    }
/* 32 */            if (type instanceof ParameterizedType) {
/* 34 */                ParameterizedType parameterizedType = (ParameterizedType) type;
/* 50 */                return new ParameterizedTypeImpl(parameterizedType.getOwnerType(), parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
                    }
/* 56 */            if (type instanceof GenericArrayType) {
/* 66 */                return new GenericArrayTypeImpl(((GenericArrayType) type).getGenericComponentType());
                    }
/* 72 */            if (!(type instanceof WildcardType)) {
/* 90 */                return type;
                    }
/* 74 */            WildcardType wildcardType = (WildcardType) type;
/* 86 */            return new WildcardTypeImpl(wildcardType.getUpperBounds(), wildcardType.getLowerBounds());
                }

                public static void checkNotPrimitive(Type type) {
/* 17 */            C$Gson$Preconditions.checkArgument(((type instanceof Class) && ((Class) type).isPrimitive()) ? false : true);
                }

                private static Class<?> declaringClassOf(TypeVariable<?> typeVariable) {
/* 1 */             GenericDeclaration genericDeclaration = typeVariable.getGenericDeclaration();
/* 7 */             if (genericDeclaration instanceof Class) {
/* 9 */                 return (Class) genericDeclaration;
                    }
/* 12 */            return null;
                }

                private static boolean equal(Object obj, Object obj2) {
/* 1 */             return Objects.equals(obj, obj2);
                }

                public static boolean equals(Type type, Type type2) {
/* 2 */             if (type == type2) {
/* 1 */                 return true;
                    }
/* 7 */             if (type instanceof Class) {
/* 9 */                 return type.equals(type2);
                    }
/* 17 */            if (type instanceof ParameterizedType) {
/* 21 */                if (!(type2 instanceof ParameterizedType)) {
/* 16 */                    return false;
                        }
/* 24 */                ParameterizedType parameterizedType = (ParameterizedType) type;
/* 26 */                ParameterizedType parameterizedType2 = (ParameterizedType) type2;
                        return equal(parameterizedType.getOwnerType(), parameterizedType2.getOwnerType()) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments());
                    }
/* 74 */            if (type instanceof GenericArrayType) {
/* 78 */                if (type2 instanceof GenericArrayType) {
/* 93 */                    return equals(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
                        }
/* 16 */                return false;
                    }
/* 100 */           if (type instanceof WildcardType) {
/* 104 */               if (!(type2 instanceof WildcardType)) {
/* 16 */                    return false;
                        }
/* 107 */               WildcardType wildcardType = (WildcardType) type;
/* 109 */               WildcardType wildcardType2 = (WildcardType) type2;
                        return Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) && Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds());
                    }
/* 143 */           if (!(type instanceof TypeVariable) || !(type2 instanceof TypeVariable)) {
/* 16 */                return false;
                    }
/* 150 */           TypeVariable typeVariable = (TypeVariable) type;
/* 152 */           TypeVariable typeVariable2 = (TypeVariable) type2;
                    return typeVariable.getGenericDeclaration() == typeVariable2.getGenericDeclaration() && typeVariable.getName().equals(typeVariable2.getName());
                }

                public static Type getArrayComponentType(Type type) {
                    return type instanceof GenericArrayType ? ((GenericArrayType) type).getGenericComponentType() : ((Class) type).getComponentType();
                }

                public static Type getCollectionElementType(Type type, Class<?> cls) {
/* 3 */             Type supertype = getSupertype(type, cls, Collection.class);
                    return supertype instanceof ParameterizedType ? ((ParameterizedType) supertype).getActualTypeArguments()[0] : Object.class;
                }

                private static Type getGenericSupertype(Type type, Class<?> cls, Class<?> cls2) {
/* 1 */             if (cls2 == cls) {
/* 3 */                 return type;
                    }
/* 8 */             if (cls2.isInterface()) {
/* 10 */                Class<?>[] interfaces = cls.getInterfaces();
/* 14 */                int length = interfaces.length;
/* 16 */                for (int i = 0; i < length; i++) {
/* 18 */                    Class<?> cls3 = interfaces[i];
/* 20 */                    if (cls3 == cls2) {
/* 26 */                        return cls.getGenericInterfaces()[i];
                            }
/* 33 */                    if (cls2.isAssignableFrom(cls3)) {
/* 43 */                        return getGenericSupertype(cls.getGenericInterfaces()[i], interfaces[i], cls2);
                            }
                        }
                    }
/* 55 */            if (!cls.isInterface()) {
/* 59 */                while (cls != Object.class) {
/* 61 */                    Class<? super Object> superclass = cls.getSuperclass();
/* 65 */                    if (superclass == cls2) {
/* 67 */                        return cls.getGenericSuperclass();
                            }
/* 76 */                    if (cls2.isAssignableFrom(superclass)) {
/* 82 */                        return getGenericSupertype(cls.getGenericSuperclass(), superclass, cls2);
                            }
/* 87 */                    cls = superclass;
                        }
                    }
/* 89 */            return cls2;
                }

                public static Type[] getMapKeyAndValueTypes(Type type, Class<?> cls) {
/* 6 */             if (type == Properties.class) {
/* 8 */                 return new Type[]{String.class, String.class};
                    }
/* 19 */            Type supertype = getSupertype(type, cls, Map.class);
                    return supertype instanceof ParameterizedType ? ((ParameterizedType) supertype).getActualTypeArguments() : new Type[]{Object.class, Object.class};
                }

                public static Class<?> getRawType(Type type) {
/* 3 */             if (type instanceof Class) {
/* 5 */                 return (Class) type;
                    }
/* 10 */            if (type instanceof ParameterizedType) {
/* 14 */                Type rawType = ((ParameterizedType) type).getRawType();
/* 20 */                C$Gson$Preconditions.checkArgument(rawType instanceof Class);
/* 23 */                return (Class) rawType;
                    }
/* 29 */            if (type instanceof GenericArrayType) {
/* 45 */                return Array.newInstance(getRawType(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
                    }
/* 52 */            if (type instanceof TypeVariable) {
/* 54 */                return Object.class;
                    }
/* 59 */            if (type instanceof WildcardType) {
/* 69 */                return getRawType(((WildcardType) type).getUpperBounds()[0]);
                    }
/* 91 */            ds0.m3196m("Expected a Class, ParameterizedType, or GenericArrayType, but <", type, "> is of type ", type == null ? "null" : type.getClass().getName());
/* 94 */            return null;
                }

                private static Type getSupertype(Type type, Class<?> cls, Class<?> cls2) {
/* 3 */             if (type instanceof WildcardType) {
/* 12 */                type = ((WildcardType) type).getUpperBounds()[0];
                    }
/* 18 */            C$Gson$Preconditions.checkArgument(cls2.isAssignableFrom(cls));
/* 25 */            return resolve(type, cls, getGenericSupertype(type, cls, cls2));
                }

                private static int indexOf(Object[] objArr, Object obj) {
/* 1 */             int length = objArr.length;
/* 4 */             for (int i = 0; i < length; i++) {
/* 12 */                if (obj.equals(objArr[i])) {
/* 14 */                    return i;
                        }
                    }
/* 18 */            C1951n4.m6864o();
/* 2 */             return 0;
                }

                public static ParameterizedType newParameterizedTypeWithOwner(Type type, Type type2, Type... typeArr) {
/* 3 */             return new ParameterizedTypeImpl(type, type2, typeArr);
                }

                /* JADX WARN: Code duplicated, block: B:25:0x0049  */
                /* JADX WARN: Code duplicated, block: B:27:0x004d  */
                /* JADX WARN: Code duplicated, block: B:30:0x005f  */
                /* JADX WARN: Code duplicated, block: B:31:0x0064  */
                /* JADX WARN: Code duplicated, block: B:33:0x006a  */
                /* JADX WARN: Code duplicated, block: B:35:0x0080  */
                /* JADX WARN: Code duplicated, block: B:37:0x008e A[DONT_INVERT] */
                /* JADX WARN: Code duplicated, block: B:38:0x0090  */
                /* JADX WARN: Code duplicated, block: B:42:0x009f  */
                /* JADX WARN: Code duplicated, block: B:43:0x00a8  */
                /* JADX WARN: Code duplicated, block: B:45:0x00ac  */
                /* JADX WARN: Code duplicated, block: B:47:0x00b9  */
                /* JADX WARN: Code duplicated, block: B:49:0x00c3 A[EDGE_INSN: B:49:0x00c3->B:55:0x00d9 BREAK  A[LOOP:0: B:3:0x0001->B:61:?]] */
                /* JADX WARN: Code duplicated, block: B:50:0x00c8  */
                /* JADX WARN: Code duplicated, block: B:64:0x009a A[SYNTHETIC] */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.reflect.Type] */
                /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.reflect.Type] */
                /* JADX WARN: Type inference failed for: r11v10, types: [java.lang.Object, java.lang.reflect.Type] */
                /* JADX WARN: Type inference failed for: r11v11, types: [java.lang.reflect.Type] */
                /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.reflect.WildcardType] */
                /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.reflect.WildcardType] */
                /* JADX WARN: Type inference failed for: r11v4, types: [java.lang.reflect.WildcardType] */
                /* JADX WARN: Type inference failed for: r11v5, types: [java.lang.reflect.ParameterizedType] */
                /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.reflect.GenericArrayType] */
                /* JADX WARN: Type inference failed for: r11v7 */
                /* JADX WARN: Type inference failed for: r11v9 */
                /* JADX WARN: Type inference failed for: r12v0, types: [java.util.Map, java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type>] */
                /* JADX WARN: Type inference failed for: r1v17 */
                /* JADX WARN: Type inference failed for: r1v19 */
                private static Type resolve(Type type, Class<?> cls, Type type2, Map<TypeVariable<?>, Type> map) {
                    int i;
                    Type[] lowerBounds;
                    Type[] upperBounds;
                    Type typeResolve;
                    Type typeResolve2;
                    Type typeResolve3;
                    boolean z;
                    Type[] actualTypeArguments;
                    int length;
                    Type typeNewParameterizedTypeWithOwner;
                    Type typeResolve4;
                    Type genericComponentType;
                    Type typeResolve5;
                    TypeVariable typeVariable;
/* 1 */             TypeVariable typeVariable2 = null;
/* 33 */            do {
/* 4 */                 if (!(type2 instanceof TypeVariable)) {
/* 39 */                    if (!(type2 instanceof Class)) {
/* 76 */                        if (type2 instanceof GenericArrayType) {
/* 105 */                           if (type2 instanceof ParameterizedType) {
/* 171 */                               if (type2 instanceof WildcardType) {
                                            break;
                                        }
/* 173 */                               type2 = (WildcardType) type2;
/* 175 */                               lowerBounds = type2.getLowerBounds();
/* 179 */                               upperBounds = type2.getUpperBounds();
/* 184 */                               if (lowerBounds.length == 1) {
/* 202 */                                   if (upperBounds.length != 1) {
                                                break;
                                            }
/* 214 */                                   type2 = subtypeOf(typeResolve);
                                            break;
                                        }
/* 188 */                               typeResolve2 = resolve(type, cls, lowerBounds[0], map);
/* 194 */                               if (typeResolve2 != lowerBounds[0]) {
                                            break;
                                        }
/* 196 */                               type2 = supertypeOf(typeResolve2);
                                        break;
                                    }
/* 107 */                           type2 = (ParameterizedType) type2;
/* 109 */                           Type ownerType = type2.getOwnerType();
/* 113 */                           typeResolve3 = resolve(type, cls, ownerType, map);
/* 121 */                           z = !equal(typeResolve3, ownerType);
/* 122 */                           actualTypeArguments = type2.getActualTypeArguments();
/* 126 */                           length = actualTypeArguments.length;
/* 127 */                           for (i = 0; i < length; i++) {
/* 131 */                               typeResolve4 = resolve(type, cls, actualTypeArguments[i], map);
/* 141 */                               if (equal(typeResolve4, actualTypeArguments[i])) {
/* 143 */                                   if (!z) {
/* 150 */                                       actualTypeArguments = (Type[]) actualTypeArguments.clone();
/* 152 */                                       z = true;
                                            }
/* 153 */                                   actualTypeArguments[i] = typeResolve4;
                                        }
                                    }
/* 158 */                           if (z) {
                                        break;
                                    }
/* 164 */                           typeNewParameterizedTypeWithOwner = newParameterizedTypeWithOwner(typeResolve3, type2.getRawType(), actualTypeArguments);
/* 71 */                            type2 = typeNewParameterizedTypeWithOwner;
                                    break;
                                }
/* 78 */                        type2 = (GenericArrayType) type2;
/* 80 */                        genericComponentType = type2.getGenericComponentType();
/* 84 */                        typeResolve5 = resolve(type, cls, genericComponentType, map);
/* 92 */                        if (equal(genericComponentType, typeResolve5)) {
/* 96 */                            typeNewParameterizedTypeWithOwner = arrayOf(typeResolve5);
/* 71 */                            type2 = typeNewParameterizedTypeWithOwner;
                                    break;
                                }
                                break;
                            }
/* 42 */                    Class cls2 = (Class) type2;
/* 48 */                    if (!cls2.isArray()) {
/* 76 */                        if (type2 instanceof GenericArrayType) {
/* 105 */                           if (type2 instanceof ParameterizedType) {
/* 171 */                               if (type2 instanceof WildcardType) {
                                            break;
                                        }
/* 173 */                               type2 = (WildcardType) type2;
/* 175 */                               lowerBounds = type2.getLowerBounds();
/* 179 */                               upperBounds = type2.getUpperBounds();
/* 184 */                               if (lowerBounds.length == 1) {
/* 202 */                                   if (upperBounds.length != 1 && (typeResolve = resolve(type, cls, upperBounds[0], map)) != upperBounds[0]) {
/* 214 */                                       type2 = subtypeOf(typeResolve);
                                                break;
                                            }
                                            break;
                                            break;
                                        }
/* 188 */                               typeResolve2 = resolve(type, cls, lowerBounds[0], map);
/* 194 */                               if (typeResolve2 != lowerBounds[0]) {
                                            break;
                                        }
/* 196 */                               type2 = supertypeOf(typeResolve2);
                                        break;
                                    }
/* 107 */                           type2 = (ParameterizedType) type2;
/* 109 */                           Type ownerType2 = type2.getOwnerType();
/* 113 */                           typeResolve3 = resolve(type, cls, ownerType2, map);
/* 121 */                           z = !equal(typeResolve3, ownerType2);
/* 122 */                           actualTypeArguments = type2.getActualTypeArguments();
/* 126 */                           length = actualTypeArguments.length;
/* 127 */                           while (i < length) {
/* 131 */                               typeResolve4 = resolve(type, cls, actualTypeArguments[i], map);
/* 141 */                               if (equal(typeResolve4, actualTypeArguments[i])) {
/* 143 */                                   if (!z) {
/* 150 */                                       actualTypeArguments = (Type[]) actualTypeArguments.clone();
/* 152 */                                       z = true;
                                            }
/* 153 */                                   actualTypeArguments[i] = typeResolve4;
                                        }
                                    }
/* 158 */                           if (z) {
                                        break;
                                    }
/* 164 */                           typeNewParameterizedTypeWithOwner = newParameterizedTypeWithOwner(typeResolve3, type2.getRawType(), actualTypeArguments);
/* 71 */                            type2 = typeNewParameterizedTypeWithOwner;
                                    break;
                                }
/* 78 */                        type2 = (GenericArrayType) type2;
/* 80 */                        genericComponentType = type2.getGenericComponentType();
/* 84 */                        typeResolve5 = resolve(type, cls, genericComponentType, map);
/* 92 */                        if (equal(genericComponentType, typeResolve5)) {
                                    break;
                                }
/* 96 */                        typeNewParameterizedTypeWithOwner = arrayOf(typeResolve5);
/* 71 */                        type2 = typeNewParameterizedTypeWithOwner;
                                break;
                            }
/* 50 */                    Class<?> componentType = cls2.getComponentType();
/* 54 */                    Type typeResolve6 = resolve(type, cls, componentType, map);
/* 62 */                    if (!equal(componentType, typeResolve6)) {
/* 67 */                        typeNewParameterizedTypeWithOwner = arrayOf(typeResolve6);
/* 71 */                        type2 = typeNewParameterizedTypeWithOwner;
                                break;
                            }
/* 64 */                    type2 = cls2;
                            break;
                        }
/* 7 */                 typeVariable = (TypeVariable) type2;
/* 13 */                Type type3 = (Type) map.get(typeVariable);
/* 15 */                Class cls3 = Void.TYPE;
/* 17 */                if (type3 != null) {
                            return type3 == cls3 ? type2 : type3;
                        }
/* 23 */                map.put(typeVariable, cls3);
/* 26 */                if (typeVariable2 == null) {
/* 28 */                    typeVariable2 = typeVariable;
                        }
/* 29 */                type2 = resolveTypeVariable(type, cls, typeVariable);
/* 33 */            } while (type2 != typeVariable);
/* 218 */           if (typeVariable2 != null) {
/* 220 */               map.put(typeVariable2, type2);
                    }
/* 223 */           return type2;
                }

                private static Type resolveTypeVariable(Type type, Class<?> cls, TypeVariable<?> typeVariable) {
/* 1 */             Class<?> clsDeclaringClassOf = declaringClassOf(typeVariable);
/* 5 */             if (clsDeclaringClassOf != null) {
/* 8 */                 Type genericSupertype = getGenericSupertype(type, cls, clsDeclaringClassOf);
/* 14 */                if (genericSupertype instanceof ParameterizedType) {
/* 30 */                    return ((ParameterizedType) genericSupertype).getActualTypeArguments()[indexOf(clsDeclaringClassOf.getTypeParameters(), typeVariable)];
                        }
                    }
/* 33 */            return typeVariable;
                }

                public static WildcardType subtypeOf(Type type) {
/* 23 */            return new WildcardTypeImpl(type instanceof WildcardType ? ((WildcardType) type).getUpperBounds() : new Type[]{type}, EMPTY_TYPE_ARRAY);
                }

                public static WildcardType supertypeOf(Type type) {
/* 27 */            return new WildcardTypeImpl(new Type[]{Object.class}, type instanceof WildcardType ? ((WildcardType) type).getLowerBounds() : new Type[]{type});
                }

                public static String typeToString(Type type) {
                    return type instanceof Class ? ((Class) type).getName() : type.toString();
                }

/* 223 */       public static Type resolve(Type type, Class<?> cls, Type type2) {
/* 224 */           return resolve(type, cls, type2, new HashMap());
                }
            }
