            package com.google.gson;

            import com.google.gson.internal.ConstructorConstructor;
            import com.google.gson.internal.Excluder;
            import com.google.gson.internal.LazilyParsedNumber;
            import com.google.gson.internal.Primitives;
            import com.google.gson.internal.Streams;
            import com.google.gson.internal.bind.ArrayTypeAdapter;
            import com.google.gson.internal.bind.CollectionTypeAdapterFactory;
            import com.google.gson.internal.bind.DateTypeAdapter;
            import com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory;
            import com.google.gson.internal.bind.JsonTreeReader;
            import com.google.gson.internal.bind.JsonTreeWriter;
            import com.google.gson.internal.bind.MapTypeAdapterFactory;
            import com.google.gson.internal.bind.NumberTypeAdapter;
            import com.google.gson.internal.bind.ObjectTypeAdapter;
            import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
            import com.google.gson.internal.bind.SerializationDelegatingTypeAdapter;
            import com.google.gson.internal.bind.TypeAdapters;
            import com.google.gson.internal.sql.SqlTypesSupport;
            import com.google.gson.reflect.TypeToken;
            import com.google.gson.stream.JsonReader;
            import com.google.gson.stream.JsonToken;
            import com.google.gson.stream.JsonWriter;
            import com.google.gson.stream.MalformedJsonException;
            import java.io.EOFException;
            import java.io.IOException;
            import java.io.Reader;
            import java.io.StringReader;
            import java.io.StringWriter;
            import java.io.Writer;
            import java.lang.reflect.Type;
            import java.math.BigDecimal;
            import java.math.BigInteger;
            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.HashMap;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Map;
            import java.util.Objects;
            import java.util.concurrent.ConcurrentHashMap;
            import java.util.concurrent.ConcurrentMap;
            import java.util.concurrent.atomic.AtomicLong;
            import java.util.concurrent.atomic.AtomicLongArray;
            import p000.C1951n4;
            import p000.f42;
            import p000.s80;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 13 */    public final class Gson {
                static final boolean DEFAULT_COMPLEX_MAP_KEYS = false;
                static final String DEFAULT_DATE_PATTERN = null;
                static final boolean DEFAULT_ESCAPE_HTML = true;
                static final boolean DEFAULT_JSON_NON_EXECUTABLE = false;
                static final boolean DEFAULT_LENIENT = false;
                static final boolean DEFAULT_PRETTY_PRINT = false;
                static final boolean DEFAULT_SERIALIZE_NULLS = false;
                static final boolean DEFAULT_SPECIALIZE_FLOAT_VALUES = false;
                static final boolean DEFAULT_USE_JDK_UNSAFE = true;
                private static final String JSON_NON_EXECUTABLE_PREFIX = ")]}'\n";
                final List<TypeAdapterFactory> builderFactories;
                final List<TypeAdapterFactory> builderHierarchyFactories;
                final boolean complexMapKeySerialization;
                private final ConstructorConstructor constructorConstructor;
                final String datePattern;
                final int dateStyle;
                final Excluder excluder;
                final List<TypeAdapterFactory> factories;
                final FieldNamingStrategy fieldNamingStrategy;
                final boolean generateNonExecutableJson;
                final boolean htmlSafe;
                final Map<Type, InstanceCreator<?>> instanceCreators;
                private final JsonAdapterAnnotationTypeAdapterFactory jsonAdapterFactory;
                final boolean lenient;
                final LongSerializationPolicy longSerializationPolicy;
                final ToNumberStrategy numberToNumberStrategy;
                final ToNumberStrategy objectToNumberStrategy;
                final boolean prettyPrinting;
                final List<ReflectionAccessFilter> reflectionFilters;
                final boolean serializeNulls;
                final boolean serializeSpecialFloatingPointValues;
                private final ThreadLocal<Map<TypeToken<?>, TypeAdapter<?>>> threadLocalAdapterResults;
                final int timeStyle;
                private final ConcurrentMap<TypeToken<?>, TypeAdapter<?>> typeTokenCache;
                final boolean useJdkUnsafe;
                static final FieldNamingStrategy DEFAULT_FIELD_NAMING_STRATEGY = FieldNamingPolicy.IDENTITY;
                static final ToNumberStrategy DEFAULT_OBJECT_TO_NUMBER_STRATEGY = ToNumberPolicy.DOUBLE;
                static final ToNumberStrategy DEFAULT_NUMBER_TO_NUMBER_STRATEGY = ToNumberPolicy.LAZILY_PARSED_NUMBER;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static class FutureTypeAdapter<T> extends SerializationDelegatingTypeAdapter<T> {
                    private TypeAdapter<T> delegate = null;

                    private TypeAdapter<T> delegate() {
/* 1 */                 TypeAdapter<T> typeAdapter = this.delegate;
/* 3 */                 if (typeAdapter != null) {
/* 5 */                     return typeAdapter;
                        }
/* 8 */                 f42.m3656l("Adapter for type with cyclic dependency has been used before dependency has been resolved");
/* 11 */                return null;
                    }

                    @Override // com.google.gson.internal.bind.SerializationDelegatingTypeAdapter
                    public TypeAdapter<T> getSerializationDelegate() {
/* 1 */                 return delegate();
                    }

                    @Override // com.google.gson.TypeAdapter
                    public T read(JsonReader jsonReader) throws IOException {
/* 5 */                 return delegate().read(jsonReader);
                    }

                    public void setDelegate(TypeAdapter<T> typeAdapter) {
/* 3 */                 if (this.delegate == null) {
/* 5 */                     this.delegate = typeAdapter;
                        } else {
/* 10 */                    C1951n4.m6856g("Delegate is already set");
                        }
                    }

                    @Override // com.google.gson.TypeAdapter
                    public void write(JsonWriter jsonWriter, T t) throws IOException {
/* 5 */                 delegate().write(jsonWriter, t);
                    }
                }

                public Gson(Excluder excluder, FieldNamingStrategy fieldNamingStrategy, Map<Type, InstanceCreator<?>> map, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, LongSerializationPolicy longSerializationPolicy, String str, int i, int i2, List<TypeAdapterFactory> list, List<TypeAdapterFactory> list2, List<TypeAdapterFactory> list3, ToNumberStrategy toNumberStrategy, ToNumberStrategy toNumberStrategy2, List<ReflectionAccessFilter> list4) {
/* 2 */             this.threadLocalAdapterResults = new ThreadLocal<>();
/* 3 */             this.typeTokenCache = new ConcurrentHashMap();
/* 4 */             this.excluder = excluder;
/* 5 */             this.fieldNamingStrategy = fieldNamingStrategy;
/* 6 */             this.instanceCreators = map;
/* 7 */             ConstructorConstructor constructorConstructor = new ConstructorConstructor(map, z8, list4);
                    this.constructorConstructor = constructorConstructor;
/* 8 */             this.serializeNulls = z;
/* 9 */             this.complexMapKeySerialization = z2;
/* 10 */            this.generateNonExecutableJson = z3;
/* 11 */            this.htmlSafe = z4;
/* 12 */            this.prettyPrinting = z5;
/* 13 */            this.lenient = z6;
/* 14 */            this.serializeSpecialFloatingPointValues = z7;
/* 15 */            this.useJdkUnsafe = z8;
/* 16 */            this.longSerializationPolicy = longSerializationPolicy;
/* 17 */            this.datePattern = str;
/* 18 */            this.dateStyle = i;
/* 19 */            this.timeStyle = i2;
/* 20 */            this.builderFactories = list;
/* 21 */            this.builderHierarchyFactories = list2;
/* 22 */            this.objectToNumberStrategy = toNumberStrategy;
/* 23 */            this.numberToNumberStrategy = toNumberStrategy2;
/* 24 */            this.reflectionFilters = list4;
/* 25 */            ArrayList arrayList = new ArrayList();
/* 26 */            arrayList.add(TypeAdapters.JSON_ELEMENT_FACTORY);
/* 27 */            arrayList.add(ObjectTypeAdapter.getFactory(toNumberStrategy));
/* 28 */            arrayList.add(excluder);
/* 29 */            arrayList.addAll(list3);
/* 30 */            arrayList.add(TypeAdapters.STRING_FACTORY);
/* 31 */            arrayList.add(TypeAdapters.INTEGER_FACTORY);
/* 32 */            arrayList.add(TypeAdapters.BOOLEAN_FACTORY);
/* 33 */            arrayList.add(TypeAdapters.BYTE_FACTORY);
/* 34 */            arrayList.add(TypeAdapters.SHORT_FACTORY);
/* 35 */            TypeAdapter<Number> typeAdapterLongAdapter = longAdapter(longSerializationPolicy);
/* 36 */            arrayList.add(TypeAdapters.newFactory(Long.TYPE, Long.class, typeAdapterLongAdapter));
/* 37 */            arrayList.add(TypeAdapters.newFactory(Double.TYPE, Double.class, doubleAdapter(z7)));
/* 40 */            arrayList.add(TypeAdapters.newFactory(Float.TYPE, Float.class, floatAdapter(z7)));
/* 43 */            arrayList.add(NumberTypeAdapter.getFactory(toNumberStrategy2));
/* 44 */            arrayList.add(TypeAdapters.ATOMIC_INTEGER_FACTORY);
/* 45 */            arrayList.add(TypeAdapters.ATOMIC_BOOLEAN_FACTORY);
/* 46 */            arrayList.add(TypeAdapters.newFactory(AtomicLong.class, atomicLongAdapter(typeAdapterLongAdapter)));
/* 47 */            arrayList.add(TypeAdapters.newFactory(AtomicLongArray.class, atomicLongArrayAdapter(typeAdapterLongAdapter)));
/* 48 */            arrayList.add(TypeAdapters.ATOMIC_INTEGER_ARRAY_FACTORY);
/* 49 */            arrayList.add(TypeAdapters.CHARACTER_FACTORY);
/* 50 */            arrayList.add(TypeAdapters.STRING_BUILDER_FACTORY);
/* 51 */            arrayList.add(TypeAdapters.STRING_BUFFER_FACTORY);
/* 52 */            arrayList.add(TypeAdapters.newFactory(BigDecimal.class, TypeAdapters.BIG_DECIMAL));
/* 53 */            arrayList.add(TypeAdapters.newFactory(BigInteger.class, TypeAdapters.BIG_INTEGER));
/* 54 */            arrayList.add(TypeAdapters.newFactory(LazilyParsedNumber.class, TypeAdapters.LAZILY_PARSED_NUMBER));
/* 55 */            arrayList.add(TypeAdapters.URL_FACTORY);
/* 56 */            arrayList.add(TypeAdapters.URI_FACTORY);
/* 57 */            arrayList.add(TypeAdapters.UUID_FACTORY);
/* 58 */            arrayList.add(TypeAdapters.CURRENCY_FACTORY);
/* 59 */            arrayList.add(TypeAdapters.LOCALE_FACTORY);
/* 60 */            arrayList.add(TypeAdapters.INET_ADDRESS_FACTORY);
/* 61 */            arrayList.add(TypeAdapters.BIT_SET_FACTORY);
/* 62 */            arrayList.add(DateTypeAdapter.FACTORY);
/* 63 */            arrayList.add(TypeAdapters.CALENDAR_FACTORY);
/* 64 */            if (SqlTypesSupport.SUPPORTS_SQL_TYPES) {
/* 65 */                arrayList.add(SqlTypesSupport.TIME_FACTORY);
/* 66 */                arrayList.add(SqlTypesSupport.DATE_FACTORY);
/* 67 */                arrayList.add(SqlTypesSupport.TIMESTAMP_FACTORY);
                    }
/* 68 */            arrayList.add(ArrayTypeAdapter.FACTORY);
/* 69 */            arrayList.add(TypeAdapters.CLASS_FACTORY);
/* 70 */            arrayList.add(new CollectionTypeAdapterFactory(constructorConstructor));
/* 71 */            arrayList.add(new MapTypeAdapterFactory(constructorConstructor, z2));
/* 72 */            JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory = new JsonAdapterAnnotationTypeAdapterFactory(constructorConstructor);
                    this.jsonAdapterFactory = jsonAdapterAnnotationTypeAdapterFactory;
/* 73 */            arrayList.add(jsonAdapterAnnotationTypeAdapterFactory);
/* 74 */            arrayList.add(TypeAdapters.ENUM_FACTORY);
/* 75 */            arrayList.add(new ReflectiveTypeAdapterFactory(constructorConstructor, fieldNamingStrategy, excluder, jsonAdapterAnnotationTypeAdapterFactory, list4));
/* 76 */            this.factories = Collections.unmodifiableList(arrayList);
                }

                private static void assertFullConsumption(Object obj, JsonReader jsonReader) {
/* 1 */             if (obj != null) {
                        try {
/* 9 */                     if (jsonReader.peek() == JsonToken.END_DOCUMENT) {
                            } else {
/* 19 */                        throw new JsonSyntaxException("JSON document was not fully consumed.");
                            }
                        } catch (MalformedJsonException e) {
/* 33 */                    throw new JsonSyntaxException(e);
                        } catch (IOException e2) {
/* 26 */                    throw new JsonIOException(e2);
                        }
                    }
                }

                private static TypeAdapter<AtomicLong> atomicLongAdapter(final TypeAdapter<Number> typeAdapter) {
/* 6 */             return new TypeAdapter<AtomicLong>() { // from class: com.google.gson.Gson.4
                        @Override // com.google.gson.TypeAdapter
                        public AtomicLong read(JsonReader jsonReader) throws IOException {
/* 15 */                    return new AtomicLong(((Number) typeAdapter.read(jsonReader)).longValue());
                        }

                        @Override // com.google.gson.TypeAdapter
                        public void write(JsonWriter jsonWriter, AtomicLong atomicLong) throws IOException {
/* 11 */                    typeAdapter.write(jsonWriter, Long.valueOf(atomicLong.get()));
                        }
                    }.nullSafe();
                }

                private static TypeAdapter<AtomicLongArray> atomicLongArrayAdapter(final TypeAdapter<Number> typeAdapter) {
/* 6 */             return new TypeAdapter<AtomicLongArray>() { // from class: com.google.gson.Gson.5
                        @Override // com.google.gson.TypeAdapter
                        public AtomicLongArray read(JsonReader jsonReader) throws IOException {
/* 3 */                     ArrayList arrayList = new ArrayList();
/* 6 */                     jsonReader.beginArray();
/* 13 */                    while (jsonReader.hasNext()) {
/* 31 */                        arrayList.add(Long.valueOf(((Number) typeAdapter.read(jsonReader)).longValue()));
                            }
/* 35 */                    jsonReader.endArray();
/* 38 */                    int size = arrayList.size();
/* 44 */                    AtomicLongArray atomicLongArray = new AtomicLongArray(size);
/* 48 */                    for (int i = 0; i < size; i++) {
/* 60 */                        atomicLongArray.set(i, ((Long) arrayList.get(i)).longValue());
                            }
/* 66 */                    return atomicLongArray;
                        }

                        @Override // com.google.gson.TypeAdapter
                        public void write(JsonWriter jsonWriter, AtomicLongArray atomicLongArray) throws IOException {
/* 1 */                     jsonWriter.beginArray();
/* 4 */                     int length = atomicLongArray.length();
/* 9 */                     for (int i = 0; i < length; i++) {
/* 21 */                        typeAdapter.write(jsonWriter, Long.valueOf(atomicLongArray.get(i)));
                            }
/* 27 */                    jsonWriter.endArray();
                        }
                    }.nullSafe();
                }

                public static void checkValidFloatingPoint(double d) {
/* 5 */             if (Double.isNaN(d) || Double.isInfinite(d)) {
/* 36 */                throw new IllegalArgumentException(d + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
                    }
                }

                private TypeAdapter<Number> doubleAdapter(boolean z) {
                    return z ? TypeAdapters.DOUBLE : new TypeAdapter<Number>() { // from class: com.google.gson.Gson.1
                        @Override // com.google.gson.TypeAdapter
                        public Number read(JsonReader jsonReader) throws IOException {
/* 7 */                     if (jsonReader.peek() != JsonToken.NULL) {
/* 18 */                        return Double.valueOf(jsonReader.nextDouble());
                            }
/* 9 */                     jsonReader.nextNull();
/* 12 */                    return null;
                        }

                        @Override // com.google.gson.TypeAdapter
                        public void write(JsonWriter jsonWriter, Number number) throws IOException {
/* 1 */                     if (number == null) {
/* 3 */                         jsonWriter.nullValue();
/* 6 */                         return;
                            }
/* 7 */                     double dDoubleValue = number.doubleValue();
/* 11 */                    Gson.checkValidFloatingPoint(dDoubleValue);
/* 14 */                    jsonWriter.value(dDoubleValue);
                        }
                    };
                }

                private TypeAdapter<Number> floatAdapter(boolean z) {
                    return z ? TypeAdapters.FLOAT : new TypeAdapter<Number>() { // from class: com.google.gson.Gson.2
                        @Override // com.google.gson.TypeAdapter
                        public Number read(JsonReader jsonReader) throws IOException {
/* 7 */                     if (jsonReader.peek() != JsonToken.NULL) {
/* 19 */                        return Float.valueOf((float) jsonReader.nextDouble());
                            }
/* 9 */                     jsonReader.nextNull();
/* 12 */                    return null;
                        }

                        @Override // com.google.gson.TypeAdapter
                        public void write(JsonWriter jsonWriter, Number number) throws IOException {
/* 1 */                     if (number == null) {
/* 3 */                         jsonWriter.nullValue();
/* 6 */                         return;
                            }
/* 7 */                     float fFloatValue = number.floatValue();
/* 12 */                    Gson.checkValidFloatingPoint(fFloatValue);
/* 17 */                    if (!(number instanceof Float)) {
/* 20 */                        number = Float.valueOf(fFloatValue);
                            }
/* 24 */                    jsonWriter.value(number);
                        }
                    };
                }

                private static TypeAdapter<Number> longAdapter(LongSerializationPolicy longSerializationPolicy) {
                    return longSerializationPolicy == LongSerializationPolicy.DEFAULT ? TypeAdapters.LONG : new TypeAdapter<Number>() { // from class: com.google.gson.Gson.3
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // com.google.gson.TypeAdapter
                        public Number read(JsonReader jsonReader) throws IOException {
/* 7 */                     if (jsonReader.peek() != JsonToken.NULL) {
/* 18 */                        return Long.valueOf(jsonReader.nextLong());
                            }
/* 9 */                     jsonReader.nextNull();
/* 12 */                    return null;
                        }

                        @Override // com.google.gson.TypeAdapter
                        public void write(JsonWriter jsonWriter, Number number) throws IOException {
/* 1 */                     if (number == null) {
/* 3 */                         jsonWriter.nullValue();
                            } else {
/* 11 */                        jsonWriter.value(number.toString());
                            }
                        }
                    };
                }

                @Deprecated
                public Excluder excluder() {
/* 1 */             return this.excluder;
                }

                public FieldNamingStrategy fieldNamingStrategy() {
/* 1 */             return this.fieldNamingStrategy;
                }

                public <T> T fromJson(JsonReader jsonReader, TypeToken<T> typeToken) throws JsonSyntaxException, JsonIOException {
/* 3 */             boolean zIsLenient = jsonReader.isLenient();
/* 7 */             boolean z = true;
/* 8 */             jsonReader.setLenient(true);
                    try {
                        try {
                            try {
/* 11 */                        jsonReader.peek();
/* 14 */                        z = false;
/* 19 */                        T t = getAdapter(typeToken).read(jsonReader);
/* 23 */                        jsonReader.setLenient(zIsLenient);
/* 26 */                        return t;
                            } catch (EOFException e) {
/* 71 */                        if (!z) {
/* 83 */                            throw new JsonSyntaxException(e);
                                }
/* 73 */                        jsonReader.setLenient(zIsLenient);
/* 76 */                        return null;
                            } catch (IllegalStateException e2) {
/* 70 */                        throw new JsonSyntaxException(e2);
                            }
                        } catch (IOException e3) {
/* 64 */                    throw new JsonSyntaxException(e3);
                        } catch (AssertionError e4) {
/* 58 */                    throw new AssertionError("AssertionError (GSON 2.10.1): " + e4.getMessage(), e4);
                        }
                    } catch (Throwable th) {
/* 84 */                jsonReader.setLenient(zIsLenient);
/* 87 */                throw th;
                    }
                }

                public <T> TypeAdapter<T> getAdapter(TypeToken<T> typeToken) {
                    boolean z;
/* 3 */             Objects.requireNonNull(typeToken, "type must not be null");
/* 12 */            TypeAdapter<T> typeAdapter = (TypeAdapter) this.typeTokenCache.get(typeToken);
/* 14 */            if (typeAdapter != null) {
/* 16 */                return typeAdapter;
                    }
/* 19 */            Map<? extends TypeToken<?>, ? extends TypeAdapter<?>> map = this.threadLocalAdapterResults.get();
/* 25 */            if (map == null) {
/* 29 */                map = new HashMap<>();
/* 34 */                this.threadLocalAdapterResults.set((Map<TypeToken<?>, TypeAdapter<?>>) map);
/* 37 */                z = true;
                    } else {
/* 43 */                TypeAdapter<T> typeAdapter2 = (TypeAdapter) map.get(typeToken);
/* 45 */                if (typeAdapter2 != null) {
/* 47 */                    return typeAdapter2;
                        }
/* 48 */                z = false;
                    }
                    try {
/* 51 */                FutureTypeAdapter futureTypeAdapter = new FutureTypeAdapter();
/* 54 */                map.put(typeToken, futureTypeAdapter);
/* 59 */                Iterator<TypeAdapterFactory> it = this.factories.iterator();
/* 64 */                TypeAdapter<T> typeAdapterCreate = null;
/* 69 */                while (it.hasNext()) {
/* 77 */                    typeAdapterCreate = it.next().create(this, typeToken);
/* 81 */                    if (typeAdapterCreate != null) {
/* 83 */                        futureTypeAdapter.setDelegate(typeAdapterCreate);
/* 86 */                        map.put(typeToken, typeAdapterCreate);
                                break;
                            }
                        }
/* 92 */                if (z) {
/* 96 */                    this.threadLocalAdapterResults.remove();
                        }
/* 99 */                if (typeAdapterCreate == null) {
/* 111 */                   s80.m8430k(typeToken, "GSON (2.10.1) cannot handle ");
/* 63 */                    return null;
                        }
/* 101 */               if (z) {
/* 105 */                   this.typeTokenCache.putAll(map);
                        }
/* 108 */               return typeAdapterCreate;
                    } catch (Throwable th) {
/* 115 */               if (z) {
/* 119 */                   this.threadLocalAdapterResults.remove();
                        }
/* 122 */               throw th;
                    }
                }

                public <T> TypeAdapter<T> getDelegateAdapter(TypeAdapterFactory typeAdapterFactory, TypeToken<T> typeToken) {
/* 7 */             if (!this.factories.contains(typeAdapterFactory)) {
/* 9 */                 typeAdapterFactory = this.jsonAdapterFactory;
                    }
/* 17 */            boolean z = false;
/* 22 */            for (TypeAdapterFactory typeAdapterFactory2 : this.factories) {
/* 30 */                if (z) {
/* 36 */                    TypeAdapter<T> typeAdapterCreate = typeAdapterFactory2.create(this, typeToken);
/* 40 */                    if (typeAdapterCreate != null) {
/* 42 */                        return typeAdapterCreate;
                            }
                        } else if (typeAdapterFactory2 == typeAdapterFactory) {
/* 34 */                    z = true;
                        }
                    }
/* 45 */            s80.m8430k(typeToken, "GSON cannot serialize ");
/* 48 */            return null;
                }

                public boolean htmlSafe() {
/* 1 */             return this.htmlSafe;
                }

                public GsonBuilder newBuilder() {
/* 3 */             return new GsonBuilder(this);
                }

                public JsonReader newJsonReader(Reader reader) {
/* 3 */             JsonReader jsonReader = new JsonReader(reader);
/* 8 */             jsonReader.setLenient(this.lenient);
/* 11 */            return jsonReader;
                }

                public JsonWriter newJsonWriter(Writer writer) throws IOException {
/* 3 */             if (this.generateNonExecutableJson) {
/* 7 */                 writer.write(JSON_NON_EXECUTABLE_PREFIX);
                    }
/* 12 */            JsonWriter jsonWriter = new JsonWriter(writer);
/* 17 */            if (this.prettyPrinting) {
/* 21 */                jsonWriter.setIndent("  ");
                    }
/* 26 */            jsonWriter.setHtmlSafe(this.htmlSafe);
/* 31 */            jsonWriter.setLenient(this.lenient);
/* 36 */            jsonWriter.setSerializeNulls(this.serializeNulls);
/* 39 */            return jsonWriter;
                }

                public boolean serializeNulls() {
/* 1 */             return this.serializeNulls;
                }

                public void toJson(Object obj, Type type, JsonWriter jsonWriter) throws JsonIOException {
/* 7 */             TypeAdapter adapter = getAdapter(TypeToken.get(type));
/* 11 */            boolean zIsLenient = jsonWriter.isLenient();
/* 16 */            jsonWriter.setLenient(true);
/* 19 */            boolean zIsHtmlSafe = jsonWriter.isHtmlSafe();
/* 25 */            jsonWriter.setHtmlSafe(this.htmlSafe);
/* 28 */            boolean serializeNulls = jsonWriter.getSerializeNulls();
/* 34 */            jsonWriter.setSerializeNulls(this.serializeNulls);
                    try {
                        try {
/* 37 */                    adapter.write(jsonWriter, obj);
/* 40 */                    jsonWriter.setLenient(zIsLenient);
/* 43 */                    jsonWriter.setHtmlSafe(zIsHtmlSafe);
/* 46 */                    jsonWriter.setSerializeNulls(serializeNulls);
                        } catch (IOException e) {
/* 81 */                    throw new JsonIOException(e);
                        } catch (AssertionError e2) {
/* 74 */                    throw new AssertionError("AssertionError (GSON 2.10.1): " + e2.getMessage(), e2);
                        }
                    } catch (Throwable th) {
/* 82 */                jsonWriter.setLenient(zIsLenient);
/* 85 */                jsonWriter.setHtmlSafe(zIsHtmlSafe);
/* 88 */                jsonWriter.setSerializeNulls(serializeNulls);
/* 91 */                throw th;
                    }
                }

                public JsonElement toJsonTree(Object obj) {
                    return obj == null ? JsonNull.INSTANCE : toJsonTree(obj, obj.getClass());
                }

                public String toString() {
/* 38 */            return "{serializeNulls:" + this.serializeNulls + ",factories:" + this.factories + ",instanceCreators:" + this.constructorConstructor + "}";
                }

/* 14 */        public JsonElement toJsonTree(Object obj, Type type) {
/* 15 */            JsonTreeWriter jsonTreeWriter = new JsonTreeWriter();
/* 16 */            toJson(obj, type, jsonTreeWriter);
/* 17 */            return jsonTreeWriter.get();
                }

                /* JADX WARN: Illegal instructions before constructor call */
/* 76 */        public Gson() {
/* 77 */            Excluder excluder = Excluder.DEFAULT;
                    FieldNamingStrategy fieldNamingStrategy = DEFAULT_FIELD_NAMING_STRATEGY;
/* 78 */            Map map = Collections.EMPTY_MAP;
                    LongSerializationPolicy longSerializationPolicy = LongSerializationPolicy.DEFAULT;
                    String str = DEFAULT_DATE_PATTERN;
/* 79 */            List list = Collections.EMPTY_LIST;
/* 81 */            this(excluder, fieldNamingStrategy, map, false, false, false, true, false, false, false, true, longSerializationPolicy, str, 2, 2, list, list, list, DEFAULT_OBJECT_TO_NUMBER_STRATEGY, DEFAULT_NUMBER_TO_NUMBER_STRATEGY, list);
                }

/* 87 */        public <T> T fromJson(String str, Type type) throws JsonSyntaxException {
/* 88 */            return (T) fromJson(str, TypeToken.get(type));
                }

/* 88 */        public <T> T fromJson(String str, TypeToken<T> typeToken) throws JsonSyntaxException {
                    if (str == null) {
                        return null;
                    }
/* 90 */            return (T) fromJson(new StringReader(str), typeToken);
                }

/* 90 */        public <T> T fromJson(Reader reader, Class<T> cls) throws JsonSyntaxException, JsonIOException {
/* 92 */            return (T) Primitives.wrap(cls).cast(fromJson(reader, TypeToken.get((Class) cls)));
                }

/* 91 */        public String toJson(Object obj, Type type) {
/* 92 */            StringWriter stringWriter = new StringWriter();
/* 93 */            toJson(obj, type, stringWriter);
/* 94 */            return stringWriter.toString();
                }

/* 92 */        public <T> T fromJson(Reader reader, Type type) throws JsonSyntaxException, JsonIOException {
/* 93 */            return (T) fromJson(reader, TypeToken.get(type));
                }

/* 93 */        public <T> T fromJson(Reader reader, TypeToken<T> typeToken) throws JsonSyntaxException, JsonIOException {
/* 94 */            JsonReader jsonReaderNewJsonReader = newJsonReader(reader);
/* 95 */            T t = (T) fromJson(jsonReaderNewJsonReader, typeToken);
/* 96 */            assertFullConsumption(t, jsonReaderNewJsonReader);
                    return t;
                }

/* 94 */        public void toJson(Object obj, Appendable appendable) throws JsonIOException {
                    if (obj != null) {
/* 95 */                toJson(obj, obj.getClass(), appendable);
                    } else {
/* 96 */                toJson((JsonElement) JsonNull.INSTANCE, appendable);
                    }
                }

/* 96 */        public <T> T fromJson(JsonReader jsonReader, Type type) throws JsonSyntaxException, JsonIOException {
/* 97 */            return (T) fromJson(jsonReader, TypeToken.get(type));
                }

/* 96 */        public void toJson(Object obj, Type type, Appendable appendable) throws JsonIOException {
                    try {
/* 98 */                toJson(obj, type, newJsonWriter(Streams.writerForAppendable(appendable)));
                    } catch (IOException e) {
/* 99 */                throw new JsonIOException(e);
                    }
                }

/* 97 */        public <T> T fromJson(String str, Class<T> cls) throws JsonSyntaxException {
/* 99 */            return (T) Primitives.wrap(cls).cast(fromJson(str, TypeToken.get((Class) cls)));
                }

/* 99 */        public <T> T fromJson(JsonElement jsonElement, Class<T> cls) throws JsonSyntaxException {
/* 101 */           return (T) Primitives.wrap(cls).cast(fromJson(jsonElement, TypeToken.get((Class) cls)));
                }

/* 99 */        public String toJson(Object obj) {
                    if (obj == null) {
/* 100 */               return toJson((JsonElement) JsonNull.INSTANCE);
                    }
/* 101 */           return toJson(obj, obj.getClass());
                }

/* 101 */       public <T> T fromJson(JsonElement jsonElement, Type type) throws JsonSyntaxException {
/* 102 */           return (T) fromJson(jsonElement, TypeToken.get(type));
                }

/* 101 */       public String toJson(JsonElement jsonElement) {
/* 102 */           StringWriter stringWriter = new StringWriter();
/* 103 */           toJson(jsonElement, (Appendable) stringWriter);
/* 104 */           return stringWriter.toString();
                }

/* 102 */       public <T> T fromJson(JsonElement jsonElement, TypeToken<T> typeToken) throws JsonSyntaxException {
                    if (jsonElement == null) {
                        return null;
                    }
/* 103 */           return (T) fromJson(new JsonTreeReader(jsonElement), typeToken);
                }

/* 104 */       public void toJson(JsonElement jsonElement, Appendable appendable) throws JsonIOException {
                    try {
/* 106 */               toJson(jsonElement, newJsonWriter(Streams.writerForAppendable(appendable)));
                    } catch (IOException e) {
/* 107 */               throw new JsonIOException(e);
                    }
                }

/* 107 */       public void toJson(JsonElement jsonElement, JsonWriter jsonWriter) throws JsonIOException {
                    boolean zIsLenient = jsonWriter.isLenient();
/* 109 */           jsonWriter.setLenient(true);
/* 110 */           boolean zIsHtmlSafe = jsonWriter.isHtmlSafe();
/* 111 */           jsonWriter.setHtmlSafe(this.htmlSafe);
/* 112 */           boolean serializeNulls = jsonWriter.getSerializeNulls();
/* 113 */           jsonWriter.setSerializeNulls(this.serializeNulls);
                    try {
                        try {
/* 114 */                   Streams.write(jsonElement, jsonWriter);
/* 115 */                   jsonWriter.setLenient(zIsLenient);
/* 116 */                   jsonWriter.setHtmlSafe(zIsHtmlSafe);
/* 117 */                   jsonWriter.setSerializeNulls(serializeNulls);
                        } catch (IOException e) {
/* 119 */                   throw new JsonIOException(e);
                        } catch (AssertionError e2) {
/* 118 */                   throw new AssertionError("AssertionError (GSON 2.10.1): " + e2.getMessage(), e2);
                        }
                    } catch (Throwable th) {
/* 120 */               jsonWriter.setLenient(zIsLenient);
/* 121 */               jsonWriter.setHtmlSafe(zIsHtmlSafe);
/* 122 */               jsonWriter.setSerializeNulls(serializeNulls);
/* 123 */               throw th;
                    }
                }

/* 122 */       public <T> TypeAdapter<T> getAdapter(Class<T> cls) {
/* 123 */           return getAdapter(TypeToken.get((Class) cls));
                }
            }
