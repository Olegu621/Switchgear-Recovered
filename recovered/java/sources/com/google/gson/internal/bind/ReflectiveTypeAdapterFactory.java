            package com.google.gson.internal.bind;

            import com.google.gson.FieldNamingStrategy;
            import com.google.gson.Gson;
            import com.google.gson.JsonIOException;
            import com.google.gson.JsonParseException;
            import com.google.gson.JsonSyntaxException;
            import com.google.gson.ReflectionAccessFilter;
            import com.google.gson.TypeAdapter;
            import com.google.gson.TypeAdapterFactory;
            import com.google.gson.annotations.JsonAdapter;
            import com.google.gson.annotations.SerializedName;
            import com.google.gson.internal.C$Gson$Types;
            import com.google.gson.internal.ConstructorConstructor;
            import com.google.gson.internal.Excluder;
            import com.google.gson.internal.ObjectConstructor;
            import com.google.gson.internal.Primitives;
            import com.google.gson.internal.ReflectionAccessFilterHelper;
            import com.google.gson.internal.reflect.ReflectionHelper;
            import com.google.gson.reflect.TypeToken;
            import com.google.gson.stream.JsonReader;
            import com.google.gson.stream.JsonToken;
            import com.google.gson.stream.JsonWriter;
            import java.io.IOException;
            import java.lang.reflect.AccessibleObject;
            import java.lang.reflect.Constructor;
            import java.lang.reflect.Field;
            import java.lang.reflect.InvocationTargetException;
            import java.lang.reflect.Member;
            import java.lang.reflect.Method;
            import java.lang.reflect.Modifier;
            import java.lang.reflect.Type;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.Collections;
            import java.util.HashMap;
            import java.util.Iterator;
            import java.util.LinkedHashMap;
            import java.util.List;
            import java.util.Map;
            import p000.AbstractC0886en;
            import p000.ds0;
            import p000.f42;
            import p000.fm0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class ReflectiveTypeAdapterFactory implements TypeAdapterFactory {
                private final ConstructorConstructor constructorConstructor;
                private final Excluder excluder;
                private final FieldNamingStrategy fieldNamingPolicy;
                private final JsonAdapterAnnotationTypeAdapterFactory jsonAdapterFactory;
                private final List<ReflectionAccessFilter> reflectionFilters;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static abstract class Adapter<T, A> extends TypeAdapter<T> {
                    final Map<String, BoundField> boundFields;

                    public Adapter(Map<String, BoundField> map) {
/* 4 */                 this.boundFields = map;
                    }

                    public abstract A createAccumulator();

                    public abstract T finalize(A a2);

                    @Override // com.google.gson.TypeAdapter
                    public T read(JsonReader jsonReader) throws IOException {
/* 7 */                 if (jsonReader.peek() == JsonToken.NULL) {
/* 9 */                     jsonReader.nextNull();
/* 12 */                    return null;
                        }
/* 14 */                A aCreateAccumulator = createAccumulator();
                        try {
/* 18 */                    jsonReader.beginObject();
/* 25 */                    while (jsonReader.hasNext()) {
/* 33 */                        BoundField boundField = this.boundFields.get(jsonReader.nextName());
/* 39 */                        if (boundField == null || !boundField.deserialized) {
/* 50 */                            jsonReader.skipValue();
                                } else {
/* 46 */                            readField(aCreateAccumulator, jsonReader, boundField);
                                }
                            }
/* 54 */                    jsonReader.endObject();
/* 57 */                    return finalize(aCreateAccumulator);
                        } catch (IllegalAccessException e) {
/* 67 */                    throw ReflectionHelper.createExceptionForUnexpectedIllegalAccess(e);
                        } catch (IllegalStateException e2) {
/* 74 */                    throw new JsonSyntaxException(e2);
                        }
                    }

                    public abstract void readField(A a2, JsonReader jsonReader, BoundField boundField) throws IllegalAccessException, IOException;

                    @Override // com.google.gson.TypeAdapter
                    public void write(JsonWriter jsonWriter, T t) throws IOException {
/* 1 */                 if (t == null) {
/* 3 */                     jsonWriter.nullValue();
/* 6 */                     return;
                        }
/* 7 */                 jsonWriter.beginObject();
                        try {
/* 16 */                    Iterator<BoundField> it = this.boundFields.values().iterator();
/* 24 */                    while (it.hasNext()) {
/* 32 */                        it.next().write(jsonWriter, t);
                            }
/* 36 */                    jsonWriter.endObject();
                        } catch (IllegalAccessException e) {
/* 45 */                    throw ReflectionHelper.createExceptionForUnexpectedIllegalAccess(e);
                        }
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static abstract class BoundField {
                    final boolean deserialized;
                    final Field field;
                    final String fieldName;
                    final String name;
                    final boolean serialized;

                    public BoundField(String str, Field field, boolean z, boolean z2) {
/* 4 */                 this.name = str;
/* 6 */                 this.field = field;
/* 12 */                this.fieldName = field.getName();
/* 14 */                this.serialized = z;
/* 16 */                this.deserialized = z2;
                    }

                    public abstract void readIntoArray(JsonReader jsonReader, int i, Object[] objArr) throws JsonParseException, IOException;

                    public abstract void readIntoField(JsonReader jsonReader, Object obj) throws IllegalAccessException, IOException;

                    public abstract void write(JsonWriter jsonWriter, Object obj) throws IllegalAccessException, IOException;
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static final class FieldReflectionAdapter<T> extends Adapter<T, T> {
                    private final ObjectConstructor<T> constructor;

                    public FieldReflectionAdapter(ObjectConstructor<T> objectConstructor, Map<String, BoundField> map) {
/* 1 */                 super(map);
/* 4 */                 this.constructor = objectConstructor;
                    }

                    @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
                    public T createAccumulator() {
/* 3 */                 return this.constructor.construct();
                    }

                    @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
                    public T finalize(T t) {
/* 1 */                 return t;
                    }

                    @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
                    public void readField(T t, JsonReader jsonReader, BoundField boundField) throws IllegalAccessException, IOException {
/* 1 */                 boundField.readIntoField(jsonReader, t);
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static final class RecordAdapter<T> extends Adapter<T, Object[]> {
                    static final Map<Class<?>, Object> PRIMITIVE_DEFAULTS = primitiveDefaults();
                    private final Map<String, Integer> componentIndices;
                    private final Constructor<T> constructor;
                    private final Object[] constructorArgsDefaults;

                    public RecordAdapter(Class<T> cls, Map<String, BoundField> map, boolean z) {
/* 1 */                 super(map);
/* 9 */                 this.componentIndices = new HashMap();
/* 11 */                Constructor<T> canonicalRecordConstructor = ReflectionHelper.getCanonicalRecordConstructor(cls);
/* 15 */                this.constructor = canonicalRecordConstructor;
/* 17 */                if (z) {
/* 1 */                     ReflectiveTypeAdapterFactory.checkAccessible(null, canonicalRecordConstructor);
                        } else {
/* 24 */                    ReflectionHelper.makeAccessible(canonicalRecordConstructor);
                        }
/* 27 */                String[] recordComponentNames = ReflectionHelper.getRecordComponentNames(cls);
/* 34 */                for (int i = 0; i < recordComponentNames.length; i++) {
/* 44 */                    this.componentIndices.put(recordComponentNames[i], Integer.valueOf(i));
                        }
/* 52 */                Class<?>[] parameterTypes = this.constructor.getParameterTypes();
/* 59 */                this.constructorArgsDefaults = new Object[parameterTypes.length];
/* 62 */                for (int i2 = 0; i2 < parameterTypes.length; i2++) {
/* 74 */                    this.constructorArgsDefaults[i2] = PRIMITIVE_DEFAULTS.get(parameterTypes[i2]);
                        }
                    }

                    private static Map<Class<?>, Object> primitiveDefaults() {
/* 3 */                 HashMap map = new HashMap();
/* 13 */                map.put(Byte.TYPE, (byte) 0);
/* 22 */                map.put(Short.TYPE, (short) 0);
/* 31 */                map.put(Integer.TYPE, 0);
/* 42 */                map.put(Long.TYPE, 0L);
/* 52 */                map.put(Float.TYPE, Float.valueOf(0.0f));
/* 63 */                map.put(Double.TYPE, Double.valueOf(0.0d));
/* 72 */                map.put(Character.TYPE, (char) 0);
/* 79 */                map.put(Boolean.TYPE, Boolean.FALSE);
/* 82 */                return map;
                    }

                    @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
                    public Object[] createAccumulator() {
/* 7 */                 return (Object[]) this.constructorArgsDefaults.clone();
                    }

                    @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
                    public T finalize(Object[] objArr) {
                        try {
/* 7 */                     return this.constructor.newInstance(objArr);
                        } catch (IllegalAccessException e) {
/* 94 */                    throw ReflectionHelper.createExceptionForUnexpectedIllegalAccess(e);
                        } catch (IllegalArgumentException e2) {
/* 14 */                    e = e2;
/* 88 */                    throw new RuntimeException("Failed to invoke constructor '" + ReflectionHelper.constructorToString(this.constructor) + "' with args " + Arrays.toString(objArr), e);
                        } catch (InstantiationException e3) {
/* 16 */                    e = e3;
/* 88 */                    throw new RuntimeException("Failed to invoke constructor '" + ReflectionHelper.constructorToString(this.constructor) + "' with args " + Arrays.toString(objArr), e);
                        } catch (InvocationTargetException e4) {
/* 50 */                    ds0.m3198o("Failed to invoke constructor '" + ReflectionHelper.constructorToString(this.constructor) + "' with args " + Arrays.toString(objArr), e4.getCause());
/* 53 */                    return null;
                        }
                    }

                    @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
                    public void readField(Object[] objArr, JsonReader jsonReader, BoundField boundField) throws IOException {
/* 5 */                 Integer num = this.componentIndices.get(boundField.fieldName);
/* 11 */                if (num != null) {
/* 17 */                    boundField.readIntoArray(jsonReader, num.intValue(), objArr);
/* 20 */                    return;
                        }
/* 25 */                StringBuilder sb = new StringBuilder("Could not find the index in the constructor '");
/* 34 */                sb.append(ReflectionHelper.constructorToString(this.constructor));
/* 39 */                sb.append("' for field with name '");
/* 50 */                f42.m3656l(fm0.m3789o(sb, boundField.fieldName, "', unable to determine which argument in the constructor the field corresponds to. This is unexpected behavior, as we expect the RecordComponents to have the same names as the fields in the Java class, and that the order of the RecordComponents is the same as the order of the canonical constructor parameters."));
                    }
                }

                public ReflectiveTypeAdapterFactory(ConstructorConstructor constructorConstructor, FieldNamingStrategy fieldNamingStrategy, Excluder excluder, JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory, List<ReflectionAccessFilter> list) {
/* 4 */             this.constructorConstructor = constructorConstructor;
/* 6 */             this.fieldNamingPolicy = fieldNamingStrategy;
/* 8 */             this.excluder = excluder;
/* 10 */            this.jsonAdapterFactory = jsonAdapterAnnotationTypeAdapterFactory;
/* 12 */            this.reflectionFilters = list;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static <M extends AccessibleObject & Member> void checkAccessible(Object obj, M m) {
/* 12 */            if (Modifier.isStatic(m.getModifiers())) {
/* 14 */                obj = null;
                    }
/* 19 */            if (!ReflectionAccessFilterHelper.canAccess(m, obj)) {
/* 38 */                throw new JsonIOException(fm0.m3783i(ReflectionHelper.getAccessibleObjectDescription(m, true), " is not accessible and ReflectionAccessFilter does not permit making it accessible. Register a TypeAdapter for the declaring type, adjust the access filter or increase the visibility of the element and its declaring type."));
                    }
                }

                private BoundField createBoundField(final Gson gson, Field field, final Method method, String str, final TypeToken<?> typeToken, boolean z, boolean z2, final boolean z3) {
/* 7 */             final boolean zIsPrimitive = Primitives.isPrimitive(typeToken.getRawType());
/* 11 */            int modifiers = field.getModifiers();
/* 31 */            final boolean z4 = Modifier.isStatic(modifiers) && Modifier.isFinal(modifiers);
/* 40 */            JsonAdapter jsonAdapter = (JsonAdapter) field.getAnnotation(JsonAdapter.class);
/* 53 */            TypeAdapter<?> typeAdapter = jsonAdapter != null ? this.jsonAdapterFactory.getTypeAdapter(this.constructorConstructor, gson, typeToken, jsonAdapter) : null;
/* 58 */            final boolean z5 = typeAdapter != null;
/* 59 */            if (typeAdapter == null) {
/* 61 */                typeAdapter = gson.getAdapter(typeToken);
                    }
/* 65 */            final TypeAdapter<?> typeAdapter2 = typeAdapter;
/* 81 */            return new BoundField(str, field, z, z2) { // from class: com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.1
                        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField
                        public void readIntoArray(JsonReader jsonReader, int i, Object[] objArr) throws JsonParseException, IOException {
/* 3 */                     Object obj = typeAdapter2.read(jsonReader);
/* 7 */                     if (obj != null || !zIsPrimitive) {
/* 48 */                        objArr[i] = obj;
/* 50 */                        return;
                            }
/* 47 */                    throw new JsonParseException("null is not allowed as value for record component '" + this.fieldName + "' of primitive type; at path " + jsonReader.getPath());
                        }

                        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField
                        public void readIntoField(JsonReader jsonReader, Object obj) throws IllegalAccessException, IOException {
/* 3 */                     Object obj2 = typeAdapter2.read(jsonReader);
/* 7 */                     if (obj2 == null && zIsPrimitive) {
/* 14 */                        return;
                            }
/* 17 */                    if (z3) {
/* 1 */                         ReflectiveTypeAdapterFactory.checkAccessible(obj, this.field);
                            } else if (z4) {
/* 53 */                        throw new JsonIOException(AbstractC0886en.m3507k("Cannot set value of 'static final' ", ReflectionHelper.getAccessibleObjectDescription(this.field, false)));
                            }
/* 31 */                    this.field.set(obj, obj2);
                        }

                        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField
                        public void write(JsonWriter jsonWriter, Object obj) throws IllegalAccessException, IOException {
                            Object objInvoke;
/* 3 */                     if (this.serialized) {
/* 8 */                         if (z3) {
/* 10 */                            Method method2 = method;
/* 12 */                            if (method2 == null) {
/* 1 */                                 ReflectiveTypeAdapterFactory.checkAccessible(obj, this.field);
                                    } else {
/* 1 */                                 ReflectiveTypeAdapterFactory.checkAccessible(obj, method2);
                                    }
                                }
/* 23 */                        Method method3 = method;
/* 25 */                        if (method3 != null) {
                                    try {
/* 28 */                                objInvoke = method3.invoke(obj, null);
                                    } catch (InvocationTargetException e) {
/* 58 */                                throw new JsonIOException(fm0.m3784j("Accessor ", ReflectionHelper.getAccessibleObjectDescription(method, false), " threw exception"), e.getCause());
                                    }
                                } else {
/* 61 */                            objInvoke = this.field.get(obj);
                                }
/* 65 */                        if (objInvoke == obj) {
/* 67 */                            return;
                                }
/* 70 */                        jsonWriter.name(this.name);
/* 96 */                        (z5 ? typeAdapter2 : new TypeAdapterRuntimeTypeWrapper(gson, typeAdapter2, typeToken.getType())).write(jsonWriter, objInvoke);
                            }
                        }
                    };
                }

                /* JADX WARN: Code duplicated, block: B:49:0x00d9  */
                /* JADX WARN: Code duplicated, block: B:51:0x00e1  */
                /* JADX WARN: Code duplicated, block: B:54:0x00fd  */
                /* JADX WARN: Code duplicated, block: B:66:0x011e A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:69:0x0110 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:72:0x00fe A[SYNTHETIC] */
                private Map<String, BoundField> getBoundFields(Gson gson, TypeToken<?> typeToken, Class<?> cls, boolean z, boolean z2) {
                    boolean z3;
                    Method method;
                    Type typeResolve;
                    List<String> fieldNames;
                    int size;
                    BoundField boundField;
                    int i;
                    int i2;
                    int i3;
                    BoundField boundField2;
/* 3 */             Class<?> cls2 = cls;
/* 7 */             LinkedHashMap linkedHashMap = new LinkedHashMap();
/* 14 */            if (!cls2.isInterface()) {
/* 18 */                TypeToken<?> typeToken2 = typeToken;
/* 20 */                boolean z4 = z;
/* 22 */                Class<?> rawType = cls2;
/* 25 */                while (rawType != Object.class) {
/* 27 */                    Field[] declaredFields = rawType.getDeclaredFields();
/* 31 */                    boolean z5 = true;
/* 32 */                    boolean z6 = false;
/* 33 */                    if (rawType != cls2 && declaredFields.length > 0) {
/* 40 */                        ReflectionAccessFilter.FilterResult filterResult = ReflectionAccessFilterHelper.getFilterResult(this.reflectionFilters, rawType);
/* 46 */                        if (filterResult == ReflectionAccessFilter.FilterResult.BLOCK_ALL) {
/* 89 */                            throw new JsonIOException("ReflectionAccessFilter does not permit using reflection for " + rawType + " (supertype of " + cls2 + "). Register a TypeAdapter for this type or adjust the access filter.");
                                }
/* 54 */                        z4 = filterResult == ReflectionAccessFilter.FilterResult.BLOCK_INACCESSIBLE;
                            }
/* 55 */                    boolean z7 = z4;
/* 90 */                    int length = declaredFields.length;
/* 91 */                    int i4 = 0;
/* 92 */                    while (i4 < length) {
/* 94 */                        int i5 = i4;
/* 95 */                        Field field = declaredFields[i5];
/* 97 */                        boolean zIncludeField = this.includeField(field, z5);
/* 101 */                       boolean zIncludeField2 = this.includeField(field, z6);
/* 105 */                       if (zIncludeField || zIncludeField2) {
/* 117 */                           if (z2) {
/* 127 */                               if (Modifier.isStatic(field.getModifiers())) {
/* 130 */                                   z3 = z6;
                                        } else {
/* 133 */                                   Method accessor = ReflectionHelper.getAccessor(rawType, field);
/* 137 */                                   if (!z7) {
/* 139 */                                       ReflectionHelper.makeAccessible(accessor);
                                            }
/* 148 */                                   if (accessor.getAnnotation(SerializedName.class) != null && field.getAnnotation(SerializedName.class) == null) {
/* 174 */                                       throw new JsonIOException(fm0.m3784j("@SerializedName on ", ReflectionHelper.getAccessibleObjectDescription(accessor, z6), " is not supported"));
                                            }
/* 177 */                                   i5 = i5;
/* 178 */                                   method = accessor;
/* 179 */                                   z3 = zIncludeField2;
                                        }
/* 185 */                               if (!z7 && method == null) {
/* 189 */                                   ReflectionHelper.makeAccessible(field);
                                        }
/* 200 */                               typeResolve = C$Gson$Types.resolve(typeToken2.getType(), rawType, field.getGenericType());
/* 204 */                               fieldNames = this.getFieldNames(field);
/* 208 */                               size = fieldNames.size();
/* 214 */                               boundField = null;
/* 215 */                               i = 0;
/* 216 */                               while (i < size) {
/* 218 */                                   String str = fieldNames.get(i);
/* 224 */                                   if (i != 0) {
/* 226 */                                       zIncludeField = false;
                                            }
/* 227 */                                   int i6 = i5;
/* 233 */                                   List<String> list = fieldNames;
/* 235 */                                   boolean z8 = zIncludeField;
/* 238 */                                   int i7 = length;
/* 250 */                                   boundField2 = (BoundField) linkedHashMap.put(str, this.createBoundField(gson, field, method, str, TypeToken.get(typeResolve), z8, z3, z7));
/* 252 */                                   if (boundField == null) {
/* 254 */                                       boundField = boundField2;
                                            }
/* 255 */                                   i++;
/* 257 */                                   this = this;
/* 259 */                                   zIncludeField = z8;
/* 260 */                                   length = i7;
/* 262 */                                   i5 = i6;
/* 264 */                                   fieldNames = list;
                                        }
/* 267 */                               i2 = length;
/* 269 */                               i3 = i5;
/* 271 */                               if (boundField == null) {
/* 346 */                                   throw new IllegalArgumentException("Class " + cls.getName() + " declares multiple JSON fields named '" + boundField.name + "'; conflict is caused by fields " + ReflectionHelper.fieldToString(boundField.field) + " and " + ReflectionHelper.fieldToString(field));
                                        }
                                    } else {
/* 182 */                               z3 = zIncludeField2;
                                    }
/* 131 */                           method = null;
/* 185 */                           if (!z7) {
/* 189 */                               ReflectionHelper.makeAccessible(field);
                                    }
/* 200 */                           typeResolve = C$Gson$Types.resolve(typeToken2.getType(), rawType, field.getGenericType());
/* 204 */                           fieldNames = this.getFieldNames(field);
/* 208 */                           size = fieldNames.size();
/* 214 */                           boundField = null;
/* 215 */                           i = 0;
/* 216 */                           while (i < size) {
/* 218 */                               String str2 = fieldNames.get(i);
/* 224 */                               if (i != 0) {
/* 226 */                                   zIncludeField = false;
                                        }
/* 227 */                               int i8 = i5;
/* 233 */                               List<String> list2 = fieldNames;
/* 235 */                               boolean z9 = zIncludeField;
/* 238 */                               int i9 = length;
/* 250 */                               boundField2 = (BoundField) linkedHashMap.put(str2, this.createBoundField(gson, field, method, str2, TypeToken.get(typeResolve), z9, z3, z7));
/* 252 */                               if (boundField == null) {
/* 254 */                                   boundField = boundField2;
                                        }
/* 255 */                               i++;
/* 257 */                               this = this;
/* 259 */                               zIncludeField = z9;
/* 260 */                               length = i9;
/* 262 */                               i5 = i8;
/* 264 */                               fieldNames = list2;
                                    }
/* 267 */                           i2 = length;
/* 269 */                           i3 = i5;
/* 271 */                           if (boundField == null) {
/* 346 */                               throw new IllegalArgumentException("Class " + cls.getName() + " declares multiple JSON fields named '" + boundField.name + "'; conflict is caused by fields " + ReflectionHelper.fieldToString(boundField.field) + " and " + ReflectionHelper.fieldToString(field));
                                    }
                                } else {
/* 109 */                           i2 = length;
/* 111 */                           i3 = i5;
                                }
/* 273 */                       i4 = i3 + 1;
/* 275 */                       this = this;
/* 277 */                       typeToken2 = typeToken2;
/* 281 */                       length = i2;
/* 283 */                       z5 = true;
/* 284 */                       z6 = false;
                            }
/* 361 */                   typeToken2 = TypeToken.get(C$Gson$Types.resolve(typeToken2.getType(), rawType, rawType.getGenericSuperclass()));
/* 365 */                   rawType = typeToken2.getRawType();
/* 371 */                   cls2 = cls;
/* 373 */                   z4 = z7;
                        }
                    }
/* 376 */           return linkedHashMap;
                }

                private List<String> getFieldNames(Field field) {
/* 7 */             SerializedName serializedName = (SerializedName) field.getAnnotation(SerializedName.class);
/* 9 */             if (serializedName == null) {
/* 17 */                return Collections.singletonList(this.fieldNamingPolicy.translateName(field));
                    }
/* 22 */            String strValue = serializedName.value();
/* 26 */            String[] strArrAlternate = serializedName.alternate();
/* 31 */            if (strArrAlternate.length == 0) {
/* 33 */                return Collections.singletonList(strValue);
                    }
/* 43 */            ArrayList arrayList = new ArrayList(strArrAlternate.length + 1);
/* 46 */            arrayList.add(strValue);
/* 49 */            Collections.addAll(arrayList, strArrAlternate);
/* 52 */            return arrayList;
                }

                private boolean includeField(Field field, boolean z) {
                    return (this.excluder.excludeClass(field.getType(), z) || this.excluder.excludeField(field, z)) ? false : true;
                }

                @Override // com.google.gson.TypeAdapterFactory
                public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
/* 1 */             Class<? super T> rawType = typeToken.getRawType();
/* 11 */            if (!Object.class.isAssignableFrom(rawType)) {
/* 13 */                return null;
                    }
/* 17 */            ReflectionAccessFilter.FilterResult filterResult = ReflectionAccessFilterHelper.getFilterResult(this.reflectionFilters, rawType);
/* 23 */            if (filterResult != ReflectionAccessFilter.FilterResult.BLOCK_ALL) {
/* 32 */                boolean z = filterResult == ReflectionAccessFilter.FilterResult.BLOCK_INACCESSIBLE;
                        return ReflectionHelper.isRecord(rawType) ? new RecordAdapter(rawType, getBoundFields(gson, typeToken, rawType, z, true), z) : new FieldReflectionAdapter(this.constructorConstructor.get(typeToken), getBoundFields(gson, typeToken, rawType, z, false));
                    }
/* 98 */            throw new JsonIOException("ReflectionAccessFilter does not permit using reflection for " + rawType + ". Register a TypeAdapter for this type or adjust the access filter.");
                }
            }
