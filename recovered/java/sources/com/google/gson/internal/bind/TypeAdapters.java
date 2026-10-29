            package com.google.gson.internal.bind;

            import com.google.gson.Gson;
            import com.google.gson.JsonArray;
            import com.google.gson.JsonElement;
            import com.google.gson.JsonIOException;
            import com.google.gson.JsonNull;
            import com.google.gson.JsonObject;
            import com.google.gson.JsonPrimitive;
            import com.google.gson.JsonSyntaxException;
            import com.google.gson.TypeAdapter;
            import com.google.gson.TypeAdapterFactory;
            import com.google.gson.annotations.SerializedName;
            import com.google.gson.internal.LazilyParsedNumber;
            import com.google.gson.reflect.TypeToken;
            import com.google.gson.stream.JsonReader;
            import com.google.gson.stream.JsonToken;
            import com.google.gson.stream.JsonWriter;
            import java.io.IOException;
            import java.lang.reflect.AccessibleObject;
            import java.lang.reflect.Field;
            import java.math.BigDecimal;
            import java.math.BigInteger;
            import java.net.InetAddress;
            import java.net.URI;
            import java.net.URISyntaxException;
            import java.net.URL;
            import java.security.AccessController;
            import java.security.PrivilegedAction;
            import java.util.ArrayDeque;
            import java.util.ArrayList;
            import java.util.BitSet;
            import java.util.Calendar;
            import java.util.Currency;
            import java.util.GregorianCalendar;
            import java.util.HashMap;
            import java.util.Iterator;
            import java.util.Locale;
            import java.util.Map;
            import java.util.StringTokenizer;
            import java.util.UUID;
            import java.util.concurrent.atomic.AtomicBoolean;
            import java.util.concurrent.atomic.AtomicInteger;
            import java.util.concurrent.atomic.AtomicIntegerArray;
            import p000.AbstractC0886en;
            import p000.C1951n4;
            import p000.ds0;
            import p000.fm0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 5 */     public final class TypeAdapters {
                public static final TypeAdapter<AtomicBoolean> ATOMIC_BOOLEAN;
                public static final TypeAdapterFactory ATOMIC_BOOLEAN_FACTORY;
                public static final TypeAdapter<AtomicInteger> ATOMIC_INTEGER;
                public static final TypeAdapter<AtomicIntegerArray> ATOMIC_INTEGER_ARRAY;
                public static final TypeAdapterFactory ATOMIC_INTEGER_ARRAY_FACTORY;
                public static final TypeAdapterFactory ATOMIC_INTEGER_FACTORY;
                public static final TypeAdapter<BigDecimal> BIG_DECIMAL;
                public static final TypeAdapter<BigInteger> BIG_INTEGER;
                public static final TypeAdapter<BitSet> BIT_SET;
                public static final TypeAdapterFactory BIT_SET_FACTORY;
                public static final TypeAdapter<Boolean> BOOLEAN;
                public static final TypeAdapter<Boolean> BOOLEAN_AS_STRING;
                public static final TypeAdapterFactory BOOLEAN_FACTORY;
                public static final TypeAdapter<Number> BYTE;
                public static final TypeAdapterFactory BYTE_FACTORY;
                public static final TypeAdapter<Calendar> CALENDAR;
                public static final TypeAdapterFactory CALENDAR_FACTORY;
                public static final TypeAdapter<Character> CHARACTER;
                public static final TypeAdapterFactory CHARACTER_FACTORY;
                public static final TypeAdapter<Class> CLASS;
                public static final TypeAdapterFactory CLASS_FACTORY;
                public static final TypeAdapter<Currency> CURRENCY;
                public static final TypeAdapterFactory CURRENCY_FACTORY;
                public static final TypeAdapter<Number> DOUBLE;
                public static final TypeAdapterFactory ENUM_FACTORY;
                public static final TypeAdapter<Number> FLOAT;
                public static final TypeAdapter<InetAddress> INET_ADDRESS;
                public static final TypeAdapterFactory INET_ADDRESS_FACTORY;
                public static final TypeAdapter<Number> INTEGER;
                public static final TypeAdapterFactory INTEGER_FACTORY;
                public static final TypeAdapter<JsonElement> JSON_ELEMENT;
                public static final TypeAdapterFactory JSON_ELEMENT_FACTORY;
                public static final TypeAdapter<LazilyParsedNumber> LAZILY_PARSED_NUMBER;
                public static final TypeAdapter<Locale> LOCALE;
                public static final TypeAdapterFactory LOCALE_FACTORY;
                public static final TypeAdapter<Number> LONG;
                public static final TypeAdapter<Number> SHORT;
                public static final TypeAdapterFactory SHORT_FACTORY;
                public static final TypeAdapter<String> STRING;
                public static final TypeAdapter<StringBuffer> STRING_BUFFER;
                public static final TypeAdapterFactory STRING_BUFFER_FACTORY;
                public static final TypeAdapter<StringBuilder> STRING_BUILDER;
                public static final TypeAdapterFactory STRING_BUILDER_FACTORY;
                public static final TypeAdapterFactory STRING_FACTORY;
                public static final TypeAdapter<URI> URI;
                public static final TypeAdapterFactory URI_FACTORY;
                public static final TypeAdapter<URL> URL;
                public static final TypeAdapterFactory URL_FACTORY;
                public static final TypeAdapter<UUID> UUID;
                public static final TypeAdapterFactory UUID_FACTORY;

                /* JADX INFO: renamed from: com.google.gson.internal.bind.TypeAdapters$35 */
                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static /* synthetic */ class C058635 {
                    static final /* synthetic */ int[] $SwitchMap$com$google$gson$stream$JsonToken;

                    static {
/* 6 */                 int[] iArr = new int[JsonToken.values().length];
/* 8 */                 $SwitchMap$com$google$gson$stream$JsonToken = iArr;
                        try {
/* 17 */                    iArr[JsonToken.NUMBER.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
/* 28 */                    $SwitchMap$com$google$gson$stream$JsonToken[JsonToken.STRING.ordinal()] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                        try {
/* 39 */                    $SwitchMap$com$google$gson$stream$JsonToken[JsonToken.BOOLEAN.ordinal()] = 3;
                        } catch (NoSuchFieldError unused3) {
                        }
                        try {
/* 50 */                    $SwitchMap$com$google$gson$stream$JsonToken[JsonToken.BEGIN_ARRAY.ordinal()] = 4;
                        } catch (NoSuchFieldError unused4) {
                        }
                        try {
/* 61 */                    $SwitchMap$com$google$gson$stream$JsonToken[JsonToken.BEGIN_OBJECT.ordinal()] = 5;
                        } catch (NoSuchFieldError unused5) {
                        }
                        try {
/* 72 */                    $SwitchMap$com$google$gson$stream$JsonToken[JsonToken.NULL.ordinal()] = 6;
                        } catch (NoSuchFieldError unused6) {
                        }
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static final class EnumTypeAdapter<T extends Enum<T>> extends TypeAdapter<T> {
                    private final Map<String, T> nameToConstant = new HashMap();
                    private final Map<String, T> stringToConstant = new HashMap();
                    private final Map<T, String> constantToName = new HashMap();

                    public EnumTypeAdapter(final Class<T> cls) {
                        try {
/* 40 */                    for (Field field : (Field[]) AccessController.doPrivileged(new PrivilegedAction<Field[]>() { // from class: com.google.gson.internal.bind.TypeAdapters.EnumTypeAdapter.1
                                @Override // java.security.PrivilegedAction
                                public Field[] run() {
/* 3 */                             Field[] declaredFields = cls.getDeclaredFields();
/* 10 */                            ArrayList arrayList = new ArrayList(declaredFields.length);
/* 16 */                            for (Field field2 : declaredFields) {
/* 24 */                                if (field2.isEnumConstant()) {
/* 26 */                                    arrayList.add(field2);
                                        }
                                    }
/* 38 */                            Field[] fieldArr = (Field[]) arrayList.toArray(new Field[0]);
/* 41 */                            AccessibleObject.setAccessible(fieldArr, true);
/* 44 */                            return fieldArr;
                                }
                            })) {
/* 48 */                        Enum r5 = (Enum) field.get(null);
/* 50 */                        String strName = r5.name();
/* 54 */                        String string = r5.toString();
/* 64 */                        SerializedName serializedName = (SerializedName) field.getAnnotation(SerializedName.class);
/* 66 */                        if (serializedName != null) {
/* 68 */                            strName = serializedName.value();
/* 78 */                            for (String str : serializedName.alternate()) {
/* 84 */                                this.nameToConstant.put(str, (T) r5);
                                    }
                                }
/* 94 */                        this.nameToConstant.put(strName, (T) r5);
/* 99 */                        this.stringToConstant.put(string, (T) r5);
/* 104 */                       this.constantToName.put((T) r5, strName);
                            }
                        } catch (IllegalAccessException e) {
/* 111 */                   C1951n4.m6856g(e);
/* 114 */                   throw null;
                        }
                    }

                    @Override // com.google.gson.TypeAdapter
                    public T read(JsonReader jsonReader) throws IOException {
/* 7 */                 if (jsonReader.peek() == JsonToken.NULL) {
/* 9 */                     jsonReader.nextNull();
/* 12 */                    return null;
                        }
/* 14 */                String strNextString = jsonReader.nextString();
/* 20 */                T t = this.nameToConstant.get(strNextString);
                        return t == null ? this.stringToConstant.get(strNextString) : t;
                    }

                    @Override // com.google.gson.TypeAdapter
                    public void write(JsonWriter jsonWriter, T t) throws IOException {
/* 13 */                jsonWriter.value(t == null ? null : this.constantToName.get(t));
                    }
                }

                static {
/* 6 */             TypeAdapter<Class> typeAdapterNullSafe = new TypeAdapter<Class>() { // from class: com.google.gson.internal.bind.TypeAdapters.1
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // com.google.gson.TypeAdapter
                        public Class read(JsonReader jsonReader) throws IOException {
/* 8 */                     throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
                        }

                        @Override // com.google.gson.TypeAdapter
                        public void write(JsonWriter jsonWriter, Class cls) throws IOException {
/* 29 */                    throw new UnsupportedOperationException("Attempted to serialize java.lang.Class: " + cls.getName() + ". Forgot to register a type adapter?");
                        }
                    }.nullSafe();
/* 10 */            CLASS = typeAdapterNullSafe;
/* 18 */            CLASS_FACTORY = newFactory(Class.class, typeAdapterNullSafe);
/* 25 */            TypeAdapter<BitSet> typeAdapterNullSafe2 = new TypeAdapter<BitSet>() { // from class: com.google.gson.internal.bind.TypeAdapters.2
                        @Override // com.google.gson.TypeAdapter
                        public BitSet read(JsonReader jsonReader) throws IOException {
/* 3 */                     BitSet bitSet = new BitSet();
/* 6 */                     jsonReader.beginArray();
/* 9 */                     JsonToken jsonTokenPeek = jsonReader.peek();
/* 14 */                    int i = 0;
/* 17 */                    while (jsonTokenPeek != JsonToken.END_ARRAY) {
/* 25 */                        int i2 = C058635.$SwitchMap$com$google$gson$stream$JsonToken[jsonTokenPeek.ordinal()];
/* 27 */                        boolean zNextBoolean = true;
/* 28 */                        if (i2 == 1 || i2 == 2) {
/* 73 */                            int iNextInt = jsonReader.nextInt();
/* 77 */                            if (iNextInt == 0) {
/* 79 */                                zNextBoolean = false;
                                    } else if (iNextInt != 1) {
/* 101 */                               StringBuilder sbM3793s = fm0.m3793s(iNextInt, "Invalid bitset value ", ", expected 0 or 1; at path ");
/* 109 */                               sbM3793s.append(jsonReader.getPreviousPath());
/* 119 */                               throw new JsonSyntaxException(sbM3793s.toString());
                                    }
                                } else {
/* 34 */                            if (i2 != 3) {
/* 47 */                                StringBuilder sb = new StringBuilder("Invalid bitset value type: ");
/* 50 */                                sb.append(jsonTokenPeek);
/* 53 */                                String path = jsonReader.getPath();
/* 59 */                                sb.append("; at path ");
/* 62 */                                sb.append(path);
/* 72 */                                throw new JsonSyntaxException(sb.toString());
                                    }
/* 36 */                            zNextBoolean = jsonReader.nextBoolean();
                                }
/* 83 */                        if (zNextBoolean) {
/* 85 */                            bitSet.set(i);
                                }
/* 88 */                        i++;
/* 90 */                        jsonTokenPeek = jsonReader.peek();
                            }
/* 120 */                   jsonReader.endArray();
/* 123 */                   return bitSet;
                        }

                        @Override // com.google.gson.TypeAdapter
                        public void write(JsonWriter jsonWriter, BitSet bitSet) throws IOException {
/* 1 */                     jsonWriter.beginArray();
/* 4 */                     int length = bitSet.length();
/* 9 */                     for (int i = 0; i < length; i++) {
/* 16 */                        jsonWriter.value(bitSet.get(i) ? 1L : 0L);
                            }
/* 22 */                    jsonWriter.endArray();
                        }
                    }.nullSafe();
/* 29 */            BIT_SET = typeAdapterNullSafe2;
/* 37 */            BIT_SET_FACTORY = newFactory(BitSet.class, typeAdapterNullSafe2);
/* 41 */            TypeAdapter<Boolean> typeAdapter = new TypeAdapter<Boolean>() { // from class: com.google.gson.internal.bind.TypeAdapters.3
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // com.google.gson.TypeAdapter
                        public Boolean read(JsonReader jsonReader) throws IOException {
/* 1 */                     JsonToken jsonTokenPeek = jsonReader.peek();
/* 7 */                     if (jsonTokenPeek != JsonToken.NULL) {
                                return jsonTokenPeek == JsonToken.STRING ? Boolean.valueOf(Boolean.parseBoolean(jsonReader.nextString())) : Boolean.valueOf(jsonReader.nextBoolean());
                            }
/* 9 */                     jsonReader.nextNull();
/* 12 */                    return null;
                        }

                        @Override // com.google.gson.TypeAdapter
/* 6 */                 public void write(JsonWriter jsonWriter, Boolean bool) throws IOException {
/* 7 */                     jsonWriter.value(bool);
                        }
                    };
/* 44 */            BOOLEAN = typeAdapter;
/* 51 */            BOOLEAN_AS_STRING = new TypeAdapter<Boolean>() { // from class: com.google.gson.internal.bind.TypeAdapters.4
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // com.google.gson.TypeAdapter
                        public Boolean read(JsonReader jsonReader) throws IOException {
/* 7 */                     if (jsonReader.peek() != JsonToken.NULL) {
/* 18 */                        return Boolean.valueOf(jsonReader.nextString());
                            }
/* 9 */                     jsonReader.nextNull();
/* 12 */                    return null;
                        }

                        @Override // com.google.gson.TypeAdapter
                        public void write(JsonWriter jsonWriter, Boolean bool) throws IOException {
/* 10 */                    jsonWriter.value(bool == null ? "null" : bool.toString());
                        }
                    };
/* 61 */            BOOLEAN_FACTORY = newFactory(Boolean.TYPE, Boolean.class, typeAdapter);
/* 65 */            TypeAdapter<Number> typeAdapter2 = new TypeAdapter<Number>() { // from class: com.google.gson.internal.bind.TypeAdapters.5
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // com.google.gson.TypeAdapter
                        public Number read(JsonReader jsonReader) throws IOException {
/* 7 */                     if (jsonReader.peek() == JsonToken.NULL) {
/* 9 */                         jsonReader.nextNull();
/* 12 */                        return null;
                            }
                            try {
/* 14 */                        int iNextInt = jsonReader.nextInt();
/* 20 */                        if (iNextInt <= 255 && iNextInt >= -128) {
/* 27 */                            return Byte.valueOf((byte) iNextInt);
                                }
/* 38 */                        StringBuilder sbM3793s = fm0.m3793s(iNextInt, "Lossy conversion from ", " to byte; at path ");
/* 46 */                        sbM3793s.append(jsonReader.getPreviousPath());
/* 56 */                        throw new JsonSyntaxException(sbM3793s.toString());
                            } catch (NumberFormatException e) {
/* 63 */                        throw new JsonSyntaxException(e);
                            }
                        }

                        @Override // com.google.gson.TypeAdapter
                        public void write(JsonWriter jsonWriter, Number number) throws IOException {
/* 1 */                     if (number == null) {
/* 3 */                         jsonWriter.nullValue();
                            } else {
/* 12 */                        jsonWriter.value(number.byteValue());
                            }
                        }
                    };
/* 68 */            BYTE = typeAdapter2;
/* 78 */            BYTE_FACTORY = newFactory(Byte.TYPE, Byte.class, typeAdapter2);
/* 82 */            TypeAdapter<Number> typeAdapter3 = new TypeAdapter<Number>() { // from class: com.google.gson.internal.bind.TypeAdapters.6
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // com.google.gson.TypeAdapter
                        public Number read(JsonReader jsonReader) throws IOException {
/* 7 */                     if (jsonReader.peek() == JsonToken.NULL) {
/* 9 */                         jsonReader.nextNull();
/* 12 */                        return null;
                            }
                            try {
/* 14 */                        int iNextInt = jsonReader.nextInt();
/* 21 */                        if (iNextInt <= 65535 && iNextInt >= -32768) {
/* 28 */                            return Short.valueOf((short) iNextInt);
                                }
/* 39 */                        StringBuilder sbM3793s = fm0.m3793s(iNextInt, "Lossy conversion from ", " to short; at path ");
/* 47 */                        sbM3793s.append(jsonReader.getPreviousPath());
/* 57 */                        throw new JsonSyntaxException(sbM3793s.toString());
                            } catch (NumberFormatException e) {
/* 64 */                        throw new JsonSyntaxException(e);
                            }
                        }

                        @Override // com.google.gson.TypeAdapter
                        public void write(JsonWriter jsonWriter, Number number) throws IOException {
/* 1 */                     if (number == null) {
/* 3 */                         jsonWriter.nullValue();
                            } else {
/* 12 */                        jsonWriter.value(number.shortValue());
                            }
                        }
                    };
/* 85 */            SHORT = typeAdapter3;
/* 95 */            SHORT_FACTORY = newFactory(Short.TYPE, Short.class, typeAdapter3);
/* 99 */            TypeAdapter<Number> typeAdapter4 = new TypeAdapter<Number>() { // from class: com.google.gson.internal.bind.TypeAdapters.7
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // com.google.gson.TypeAdapter
                        public Number read(JsonReader jsonReader) throws IOException {
/* 7 */                     if (jsonReader.peek() == JsonToken.NULL) {
/* 9 */                         jsonReader.nextNull();
/* 12 */                        return null;
                            }
                            try {
/* 18 */                        return Integer.valueOf(jsonReader.nextInt());
                            } catch (NumberFormatException e) {
/* 29 */                        throw new JsonSyntaxException(e);
                            }
                        }

                        @Override // com.google.gson.TypeAdapter
                        public void write(JsonWriter jsonWriter, Number number) throws IOException {
/* 1 */                     if (number == null) {
/* 3 */                         jsonWriter.nullValue();
                            } else {
/* 12 */                        jsonWriter.value(number.intValue());
                            }
                        }
                    };
/* 102 */           INTEGER = typeAdapter4;
/* 112 */           INTEGER_FACTORY = newFactory(Integer.TYPE, Integer.class, typeAdapter4);
/* 119 */           TypeAdapter<AtomicInteger> typeAdapterNullSafe3 = new TypeAdapter<AtomicInteger>() { // from class: com.google.gson.internal.bind.TypeAdapters.8
                        @Override // com.google.gson.TypeAdapter
                        public AtomicInteger read(JsonReader jsonReader) throws IOException {
                            try {
/* 7 */                         return new AtomicInteger(jsonReader.nextInt());
                            } catch (NumberFormatException e) {
/* 17 */                        throw new JsonSyntaxException(e);
                            }
                        }

                        @Override // com.google.gson.TypeAdapter
                        public void write(JsonWriter jsonWriter, AtomicInteger atomicInteger) throws IOException {
/* 6 */                     jsonWriter.value(atomicInteger.get());
                        }
                    }.nullSafe();
/* 123 */           ATOMIC_INTEGER = typeAdapterNullSafe3;
/* 131 */           ATOMIC_INTEGER_FACTORY = newFactory(AtomicInteger.class, typeAdapterNullSafe3);
/* 138 */           TypeAdapter<AtomicBoolean> typeAdapterNullSafe4 = new TypeAdapter<AtomicBoolean>() { // from class: com.google.gson.internal.bind.TypeAdapters.9
                        @Override // com.google.gson.TypeAdapter
                        public AtomicBoolean read(JsonReader jsonReader) throws IOException {
/* 7 */                     return new AtomicBoolean(jsonReader.nextBoolean());
                        }

                        @Override // com.google.gson.TypeAdapter
                        public void write(JsonWriter jsonWriter, AtomicBoolean atomicBoolean) throws IOException {
/* 5 */                     jsonWriter.value(atomicBoolean.get());
                        }
                    }.nullSafe();
/* 142 */           ATOMIC_BOOLEAN = typeAdapterNullSafe4;
/* 150 */           ATOMIC_BOOLEAN_FACTORY = newFactory(AtomicBoolean.class, typeAdapterNullSafe4);
/* 157 */           TypeAdapter<AtomicIntegerArray> typeAdapterNullSafe5 = new TypeAdapter<AtomicIntegerArray>() { // from class: com.google.gson.internal.bind.TypeAdapters.10
                        @Override // com.google.gson.TypeAdapter
                        public AtomicIntegerArray read(JsonReader jsonReader) throws IOException {
/* 3 */                     ArrayList arrayList = new ArrayList();
/* 6 */                     jsonReader.beginArray();
/* 13 */                    while (jsonReader.hasNext()) {
                                try {
/* 23 */                            arrayList.add(Integer.valueOf(jsonReader.nextInt()));
                                } catch (NumberFormatException e) {
/* 33 */                            throw new JsonSyntaxException(e);
                                }
                            }
/* 34 */                    jsonReader.endArray();
/* 37 */                    int size = arrayList.size();
/* 43 */                    AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
/* 47 */                    for (int i = 0; i < size; i++) {
/* 59 */                        atomicIntegerArray.set(i, ((Integer) arrayList.get(i)).intValue());
                            }
/* 65 */                    return atomicIntegerArray;
                        }

                        @Override // com.google.gson.TypeAdapter
                        public void write(JsonWriter jsonWriter, AtomicIntegerArray atomicIntegerArray) throws IOException {
/* 1 */                     jsonWriter.beginArray();
/* 4 */                     int length = atomicIntegerArray.length();
/* 9 */                     for (int i = 0; i < length; i++) {
/* 16 */                        jsonWriter.value(atomicIntegerArray.get(i));
                            }
/* 22 */                    jsonWriter.endArray();
                        }
                    }.nullSafe();
/* 161 */           ATOMIC_INTEGER_ARRAY = typeAdapterNullSafe5;
/* 169 */           ATOMIC_INTEGER_ARRAY_FACTORY = newFactory(AtomicIntegerArray.class, typeAdapterNullSafe5);
/* 176 */           LONG = new TypeAdapter<Number>() { // from class: com.google.gson.internal.bind.TypeAdapters.11
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // com.google.gson.TypeAdapter
                        public Number read(JsonReader jsonReader) throws IOException {
/* 7 */                     if (jsonReader.peek() == JsonToken.NULL) {
/* 9 */                         jsonReader.nextNull();
/* 12 */                        return null;
                            }
                            try {
/* 18 */                        return Long.valueOf(jsonReader.nextLong());
                            } catch (NumberFormatException e) {
/* 29 */                        throw new JsonSyntaxException(e);
                            }
                        }

                        @Override // com.google.gson.TypeAdapter
                        public void write(JsonWriter jsonWriter, Number number) throws IOException {
/* 1 */                     if (number == null) {
/* 3 */                         jsonWriter.nullValue();
                            } else {
/* 11 */                        jsonWriter.value(number.longValue());
                            }
                        }
                    };
/* 183 */           FLOAT = new TypeAdapter<Number>() { // from class: com.google.gson.internal.bind.TypeAdapters.12
                        /* JADX WARN: Can't rename method to resolve collision */
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
/* 9 */                     if (!(number instanceof Float)) {
/* 16 */                        number = Float.valueOf(number.floatValue());
                            }
/* 20 */                    jsonWriter.value(number);
                        }
                    };
/* 190 */           DOUBLE = new TypeAdapter<Number>() { // from class: com.google.gson.internal.bind.TypeAdapters.13
                        /* JADX WARN: Can't rename method to resolve collision */
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
                            } else {
/* 11 */                        jsonWriter.value(number.doubleValue());
                            }
                        }
                    };
/* 194 */           TypeAdapter<Character> typeAdapter5 = new TypeAdapter<Character>() { // from class: com.google.gson.internal.bind.TypeAdapters.14
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // com.google.gson.TypeAdapter
                        public Character read(JsonReader jsonReader) throws IOException {
/* 7 */                     if (jsonReader.peek() == JsonToken.NULL) {
/* 9 */                         jsonReader.nextNull();
/* 12 */                        return null;
                            }
/* 14 */                    String strNextString = jsonReader.nextString();
/* 23 */                    if (strNextString.length() == 1) {
/* 30 */                        return Character.valueOf(strNextString.charAt(0));
                            }
/* 41 */                    StringBuilder sbM3513q = AbstractC0886en.m3513q("Expecting character, got: ", strNextString, "; at ");
/* 49 */                    sbM3513q.append(jsonReader.getPreviousPath());
/* 59 */                    throw new JsonSyntaxException(sbM3513q.toString());
                        }

                        @Override // com.google.gson.TypeAdapter
                        public void write(JsonWriter jsonWriter, Character ch) throws IOException {
/* 9 */                     jsonWriter.value(ch == null ? null : String.valueOf(ch));
                        }
                    };
/* 197 */           CHARACTER = typeAdapter5;
/* 207 */           CHARACTER_FACTORY = newFactory(Character.TYPE, Character.class, typeAdapter5);
/* 211 */           TypeAdapter<String> typeAdapter6 = new TypeAdapter<String>() { // from class: com.google.gson.internal.bind.TypeAdapters.15
                        @Override // com.google.gson.TypeAdapter
                        public String read(JsonReader jsonReader) throws IOException {
/* 1 */                     JsonToken jsonTokenPeek = jsonReader.peek();
/* 7 */                     if (jsonTokenPeek != JsonToken.NULL) {
                                return jsonTokenPeek == JsonToken.BOOLEAN ? Boolean.toString(jsonReader.nextBoolean()) : jsonReader.nextString();
                            }
/* 9 */                     jsonReader.nextNull();
/* 12 */                    return null;
                        }

                        @Override // com.google.gson.TypeAdapter
/* 6 */                 public void write(JsonWriter jsonWriter, String str) throws IOException {
/* 7 */                     jsonWriter.value(str);
                        }
                    };
/* 214 */           STRING = typeAdapter6;
/* 221 */           BIG_DECIMAL = new TypeAdapter<BigDecimal>() { // from class: com.google.gson.internal.bind.TypeAdapters.16
                        @Override // com.google.gson.TypeAdapter
                        public BigDecimal read(JsonReader jsonReader) throws IOException {
/* 8 */                     if (jsonReader.peek() == JsonToken.NULL) {
/* 10 */                        jsonReader.nextNull();
/* 7 */                         return null;
                            }
/* 14 */                    String strNextString = jsonReader.nextString();
                            try {
/* 20 */                        return new BigDecimal(strNextString);
                            } catch (NumberFormatException e) {
/* 37 */                        C1951n4.m6862m(AbstractC0886en.m3513q("Failed parsing '", strNextString, "' as BigDecimal; at path "), jsonReader.getPreviousPath(), e);
/* 7 */                         return null;
                            }
                        }

                        @Override // com.google.gson.TypeAdapter
/* 6 */                 public void write(JsonWriter jsonWriter, BigDecimal bigDecimal) throws IOException {
/* 7 */                     jsonWriter.value(bigDecimal);
                        }
                    };
/* 228 */           BIG_INTEGER = new TypeAdapter<BigInteger>() { // from class: com.google.gson.internal.bind.TypeAdapters.17
                        @Override // com.google.gson.TypeAdapter
                        public BigInteger read(JsonReader jsonReader) throws IOException {
/* 8 */                     if (jsonReader.peek() == JsonToken.NULL) {
/* 10 */                        jsonReader.nextNull();
/* 7 */                         return null;
                            }
/* 14 */                    String strNextString = jsonReader.nextString();
                            try {
/* 20 */                        return new BigInteger(strNextString);
                            } catch (NumberFormatException e) {
/* 37 */                        C1951n4.m6862m(AbstractC0886en.m3513q("Failed parsing '", strNextString, "' as BigInteger; at path "), jsonReader.getPreviousPath(), e);
/* 7 */                         return null;
                            }
                        }

                        @Override // com.google.gson.TypeAdapter
/* 6 */                 public void write(JsonWriter jsonWriter, BigInteger bigInteger) throws IOException {
/* 7 */                     jsonWriter.value(bigInteger);
                        }
                    };
/* 235 */           LAZILY_PARSED_NUMBER = new TypeAdapter<LazilyParsedNumber>() { // from class: com.google.gson.internal.bind.TypeAdapters.18
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // com.google.gson.TypeAdapter
                        public LazilyParsedNumber read(JsonReader jsonReader) throws IOException {
/* 7 */                     if (jsonReader.peek() != JsonToken.NULL) {
/* 20 */                        return new LazilyParsedNumber(jsonReader.nextString());
                            }
/* 9 */                     jsonReader.nextNull();
/* 12 */                    return null;
                        }

                        @Override // com.google.gson.TypeAdapter
/* 6 */                 public void write(JsonWriter jsonWriter, LazilyParsedNumber lazilyParsedNumber) throws IOException {
/* 7 */                     jsonWriter.value(lazilyParsedNumber);
                        }
                    };
/* 243 */           STRING_FACTORY = newFactory(String.class, typeAdapter6);
/* 247 */           TypeAdapter<StringBuilder> typeAdapter7 = new TypeAdapter<StringBuilder>() { // from class: com.google.gson.internal.bind.TypeAdapters.19
                        @Override // com.google.gson.TypeAdapter
                        public StringBuilder read(JsonReader jsonReader) throws IOException {
/* 7 */                     if (jsonReader.peek() != JsonToken.NULL) {
/* 20 */                        return new StringBuilder(jsonReader.nextString());
                            }
/* 9 */                     jsonReader.nextNull();
/* 12 */                    return null;
                        }

                        @Override // com.google.gson.TypeAdapter
                        public void write(JsonWriter jsonWriter, StringBuilder sb) throws IOException {
/* 9 */                     jsonWriter.value(sb == null ? null : sb.toString());
                        }
                    };
/* 250 */           STRING_BUILDER = typeAdapter7;
/* 258 */           STRING_BUILDER_FACTORY = newFactory(StringBuilder.class, typeAdapter7);
/* 262 */           TypeAdapter<StringBuffer> typeAdapter8 = new TypeAdapter<StringBuffer>() { // from class: com.google.gson.internal.bind.TypeAdapters.20
                        @Override // com.google.gson.TypeAdapter
                        public StringBuffer read(JsonReader jsonReader) throws IOException {
/* 7 */                     if (jsonReader.peek() != JsonToken.NULL) {
/* 20 */                        return new StringBuffer(jsonReader.nextString());
                            }
/* 9 */                     jsonReader.nextNull();
/* 12 */                    return null;
                        }

                        @Override // com.google.gson.TypeAdapter
                        public void write(JsonWriter jsonWriter, StringBuffer stringBuffer) throws IOException {
/* 9 */                     jsonWriter.value(stringBuffer == null ? null : stringBuffer.toString());
                        }
                    };
/* 265 */           STRING_BUFFER = typeAdapter8;
/* 273 */           STRING_BUFFER_FACTORY = newFactory(StringBuffer.class, typeAdapter8);
/* 277 */           TypeAdapter<URL> typeAdapter9 = new TypeAdapter<URL>() { // from class: com.google.gson.internal.bind.TypeAdapters.21
                        @Override // com.google.gson.TypeAdapter
                        public URL read(JsonReader jsonReader) throws IOException {
/* 8 */                     if (jsonReader.peek() == JsonToken.NULL) {
/* 10 */                        jsonReader.nextNull();
/* 7 */                         return null;
                            }
/* 14 */                    String strNextString = jsonReader.nextString();
/* 24 */                    if ("null".equals(strNextString)) {
/* 7 */                         return null;
                            }
/* 29 */                    return new URL(strNextString);
                        }

                        @Override // com.google.gson.TypeAdapter
                        public void write(JsonWriter jsonWriter, URL url) throws IOException {
/* 9 */                     jsonWriter.value(url == null ? null : url.toExternalForm());
                        }
                    };
/* 280 */           URL = typeAdapter9;
/* 288 */           URL_FACTORY = newFactory(URL.class, typeAdapter9);
/* 292 */           TypeAdapter<URI> typeAdapter10 = new TypeAdapter<URI>() { // from class: com.google.gson.internal.bind.TypeAdapters.22
                        @Override // com.google.gson.TypeAdapter
                        public URI read(JsonReader jsonReader) throws IOException {
/* 8 */                     if (jsonReader.peek() == JsonToken.NULL) {
/* 10 */                        jsonReader.nextNull();
/* 7 */                         return null;
                            }
                            try {
/* 14 */                        String strNextString = jsonReader.nextString();
/* 24 */                        if ("null".equals(strNextString)) {
/* 7 */                             return null;
                                }
/* 29 */                        return new URI(strNextString);
                            } catch (URISyntaxException e) {
/* 39 */                        throw new JsonIOException(e);
                            }
                        }

                        @Override // com.google.gson.TypeAdapter
                        public void write(JsonWriter jsonWriter, URI uri) throws IOException {
/* 9 */                     jsonWriter.value(uri == null ? null : uri.toASCIIString());
                        }
                    };
/* 295 */           URI = typeAdapter10;
/* 303 */           URI_FACTORY = newFactory(URI.class, typeAdapter10);
/* 307 */           TypeAdapter<InetAddress> typeAdapter11 = new TypeAdapter<InetAddress>() { // from class: com.google.gson.internal.bind.TypeAdapters.23
                        @Override // com.google.gson.TypeAdapter
                        public InetAddress read(JsonReader jsonReader) throws IOException {
/* 7 */                     if (jsonReader.peek() != JsonToken.NULL) {
/* 18 */                        return InetAddress.getByName(jsonReader.nextString());
                            }
/* 9 */                     jsonReader.nextNull();
/* 12 */                    return null;
                        }

                        @Override // com.google.gson.TypeAdapter
                        public void write(JsonWriter jsonWriter, InetAddress inetAddress) throws IOException {
/* 9 */                     jsonWriter.value(inetAddress == null ? null : inetAddress.getHostAddress());
                        }
                    };
/* 310 */           INET_ADDRESS = typeAdapter11;
/* 318 */           INET_ADDRESS_FACTORY = newTypeHierarchyFactory(InetAddress.class, typeAdapter11);
/* 322 */           TypeAdapter<UUID> typeAdapter12 = new TypeAdapter<UUID>() { // from class: com.google.gson.internal.bind.TypeAdapters.24
                        @Override // com.google.gson.TypeAdapter
                        public UUID read(JsonReader jsonReader) throws IOException {
/* 8 */                     if (jsonReader.peek() == JsonToken.NULL) {
/* 10 */                        jsonReader.nextNull();
/* 7 */                         return null;
                            }
/* 14 */                    String strNextString = jsonReader.nextString();
                            try {
/* 18 */                        return UUID.fromString(strNextString);
                            } catch (IllegalArgumentException e) {
/* 36 */                        C1951n4.m6862m(AbstractC0886en.m3513q("Failed parsing '", strNextString, "' as UUID; at path "), jsonReader.getPreviousPath(), e);
/* 7 */                         return null;
                            }
                        }

                        @Override // com.google.gson.TypeAdapter
                        public void write(JsonWriter jsonWriter, UUID uuid) throws IOException {
/* 9 */                     jsonWriter.value(uuid == null ? null : uuid.toString());
                        }
                    };
/* 325 */           UUID = typeAdapter12;
/* 333 */           UUID_FACTORY = newFactory(UUID.class, typeAdapter12);
/* 340 */           TypeAdapter<Currency> typeAdapterNullSafe6 = new TypeAdapter<Currency>() { // from class: com.google.gson.internal.bind.TypeAdapters.25
                        @Override // com.google.gson.TypeAdapter
                        public Currency read(JsonReader jsonReader) throws IOException {
/* 1 */                     String strNextString = jsonReader.nextString();
                            try {
/* 5 */                         return Currency.getInstance(strNextString);
                            } catch (IllegalArgumentException e) {
/* 23 */                        C1951n4.m6862m(AbstractC0886en.m3513q("Failed parsing '", strNextString, "' as Currency; at path "), jsonReader.getPreviousPath(), e);
/* 26 */                        return null;
                            }
                        }

                        @Override // com.google.gson.TypeAdapter
                        public void write(JsonWriter jsonWriter, Currency currency) throws IOException {
/* 5 */                     jsonWriter.value(currency.getCurrencyCode());
                        }
                    }.nullSafe();
/* 344 */           CURRENCY = typeAdapterNullSafe6;
/* 352 */           CURRENCY_FACTORY = newFactory(Currency.class, typeAdapterNullSafe6);
/* 356 */           TypeAdapter<Calendar> typeAdapter13 = new TypeAdapter<Calendar>() { // from class: com.google.gson.internal.bind.TypeAdapters.26
                        private static final String DAY_OF_MONTH = "dayOfMonth";
                        private static final String HOUR_OF_DAY = "hourOfDay";
                        private static final String MINUTE = "minute";
                        private static final String MONTH = "month";
                        private static final String SECOND = "second";
                        private static final String YEAR = "year";

                        @Override // com.google.gson.TypeAdapter
                        public Calendar read(JsonReader jsonReader) throws IOException {
/* 7 */                     if (jsonReader.peek() == JsonToken.NULL) {
/* 9 */                         jsonReader.nextNull();
/* 12 */                        return null;
                            }
/* 14 */                    jsonReader.beginObject();
/* 18 */                    int i = 0;
/* 19 */                    int i2 = 0;
/* 20 */                    int i3 = 0;
/* 21 */                    int i4 = 0;
/* 22 */                    int i5 = 0;
/* 23 */                    int i6 = 0;
/* 30 */                    while (jsonReader.peek() != JsonToken.END_OBJECT) {
/* 32 */                        String strNextName = jsonReader.nextName();
/* 36 */                        int iNextInt = jsonReader.nextInt();
/* 46 */                        if (YEAR.equals(strNextName)) {
/* 48 */                            i = iNextInt;
                                } else if (MONTH.equals(strNextName)) {
/* 58 */                            i2 = iNextInt;
                                } else if (DAY_OF_MONTH.equals(strNextName)) {
/* 68 */                            i3 = iNextInt;
                                } else if (HOUR_OF_DAY.equals(strNextName)) {
/* 78 */                            i4 = iNextInt;
                                } else if (MINUTE.equals(strNextName)) {
/* 88 */                            i5 = iNextInt;
                                } else if (SECOND.equals(strNextName)) {
/* 98 */                            i6 = iNextInt;
                                }
                            }
/* 100 */                   jsonReader.endObject();
/* 105 */                   return new GregorianCalendar(i, i2, i3, i4, i5, i6);
                        }

                        @Override // com.google.gson.TypeAdapter
                        public void write(JsonWriter jsonWriter, Calendar calendar) throws IOException {
/* 1 */                     if (calendar == null) {
/* 3 */                         jsonWriter.nullValue();
/* 6 */                         return;
                            }
/* 7 */                     jsonWriter.beginObject();
/* 12 */                    jsonWriter.name(YEAR);
/* 21 */                    jsonWriter.value(calendar.get(1));
/* 26 */                    jsonWriter.name(MONTH);
/* 35 */                    jsonWriter.value(calendar.get(2));
/* 40 */                    jsonWriter.name(DAY_OF_MONTH);
/* 49 */                    jsonWriter.value(calendar.get(5));
/* 54 */                    jsonWriter.name(HOUR_OF_DAY);
/* 64 */                    jsonWriter.value(calendar.get(11));
/* 69 */                    jsonWriter.name(MINUTE);
/* 79 */                    jsonWriter.value(calendar.get(12));
/* 84 */                    jsonWriter.name(SECOND);
/* 94 */                    jsonWriter.value(calendar.get(13));
/* 97 */                    jsonWriter.endObject();
                        }
                    };
/* 359 */           CALENDAR = typeAdapter13;
/* 369 */           CALENDAR_FACTORY = newFactoryForMultipleTypes(Calendar.class, GregorianCalendar.class, typeAdapter13);
/* 373 */           TypeAdapter<Locale> typeAdapter14 = new TypeAdapter<Locale>() { // from class: com.google.gson.internal.bind.TypeAdapters.27
                        @Override // com.google.gson.TypeAdapter
                        public Locale read(JsonReader jsonReader) throws IOException {
/* 8 */                     if (jsonReader.peek() == JsonToken.NULL) {
/* 10 */                        jsonReader.nextNull();
/* 7 */                         return null;
                            }
/* 22 */                    StringTokenizer stringTokenizer = new StringTokenizer(jsonReader.nextString(), "_");
/* 36 */                    String strNextToken = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
/* 48 */                    String strNextToken2 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
/* 55 */                    String strNextToken3 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
/* 59 */                    if (strNextToken2 == null && strNextToken3 == null) {
/* 65 */                        return new Locale(strNextToken);
                            }
                            return strNextToken3 == null ? new Locale(strNextToken, strNextToken2) : new Locale(strNextToken, strNextToken2, strNextToken3);
                        }

                        @Override // com.google.gson.TypeAdapter
                        public void write(JsonWriter jsonWriter, Locale locale) throws IOException {
/* 9 */                     jsonWriter.value(locale == null ? null : locale.toString());
                        }
                    };
/* 376 */           LOCALE = typeAdapter14;
/* 384 */           LOCALE_FACTORY = newFactory(Locale.class, typeAdapter14);
/* 388 */           TypeAdapter<JsonElement> typeAdapter15 = new TypeAdapter<JsonElement>() { // from class: com.google.gson.internal.bind.TypeAdapters.28
                        private JsonElement readTerminal(JsonReader jsonReader, JsonToken jsonToken) throws IOException {
/* 7 */                     int i = C058635.$SwitchMap$com$google$gson$stream$JsonToken[jsonToken.ordinal()];
/* 10 */                    if (i == 1) {
/* 69 */                        return new JsonPrimitive(new LazilyParsedNumber(jsonReader.nextString()));
                            }
/* 13 */                    if (i == 2) {
/* 54 */                        return new JsonPrimitive(jsonReader.nextString());
                            }
/* 16 */                    if (i == 3) {
/* 44 */                        return new JsonPrimitive(Boolean.valueOf(jsonReader.nextBoolean()));
                            }
/* 19 */                    if (i == 6) {
/* 21 */                        jsonReader.nextNull();
/* 24 */                        return JsonNull.INSTANCE;
                            }
/* 29 */                    ds0.m3204u(jsonToken, "Unexpected token: ");
/* 32 */                    return null;
                        }

                        private JsonElement tryBeginNesting(JsonReader jsonReader, JsonToken jsonToken) throws IOException {
/* 7 */                     int i = C058635.$SwitchMap$com$google$gson$stream$JsonToken[jsonToken.ordinal()];
/* 10 */                    if (i == 4) {
/* 26 */                        jsonReader.beginArray();
/* 31 */                        return new JsonArray();
                            }
/* 13 */                    if (i != 5) {
/* 15 */                        return null;
                            }
/* 17 */                    jsonReader.beginObject();
/* 22 */                    return new JsonObject();
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // com.google.gson.TypeAdapter
                        public JsonElement read(JsonReader jsonReader) throws IOException {
/* 3 */                     if (jsonReader instanceof JsonTreeReader) {
/* 7 */                         return ((JsonTreeReader) jsonReader).nextJsonElement();
                            }
/* 12 */                    JsonToken jsonTokenPeek = jsonReader.peek();
/* 16 */                    JsonElement jsonElementTryBeginNesting = tryBeginNesting(jsonReader, jsonTokenPeek);
/* 20 */                    if (jsonElementTryBeginNesting == null) {
/* 22 */                        return readTerminal(jsonReader, jsonTokenPeek);
                            }
/* 29 */                    ArrayDeque arrayDeque = new ArrayDeque();
                            while (true) {
/* 36 */                        if (jsonReader.hasNext()) {
/* 47 */                            String strNextName = jsonElementTryBeginNesting instanceof JsonObject ? jsonReader.nextName() : null;
/* 48 */                            JsonToken jsonTokenPeek2 = jsonReader.peek();
/* 52 */                            JsonElement jsonElementTryBeginNesting2 = tryBeginNesting(jsonReader, jsonTokenPeek2);
/* 60 */                            boolean z = jsonElementTryBeginNesting2 != null;
/* 61 */                            if (jsonElementTryBeginNesting2 == null) {
/* 63 */                                jsonElementTryBeginNesting2 = readTerminal(jsonReader, jsonTokenPeek2);
                                    }
/* 69 */                            if (jsonElementTryBeginNesting instanceof JsonArray) {
/* 74 */                                ((JsonArray) jsonElementTryBeginNesting).add(jsonElementTryBeginNesting2);
                                    } else {
/* 81 */                                ((JsonObject) jsonElementTryBeginNesting).add(strNextName, jsonElementTryBeginNesting2);
                                    }
/* 84 */                            if (z) {
/* 86 */                                arrayDeque.addLast(jsonElementTryBeginNesting);
/* 89 */                                jsonElementTryBeginNesting = jsonElementTryBeginNesting2;
                                    }
                                } else {
/* 93 */                            if (jsonElementTryBeginNesting instanceof JsonArray) {
/* 95 */                                jsonReader.endArray();
                                    } else {
/* 99 */                                jsonReader.endObject();
                                    }
/* 106 */                           if (arrayDeque.isEmpty()) {
/* 108 */                               return jsonElementTryBeginNesting;
                                    }
/* 113 */                           jsonElementTryBeginNesting = (JsonElement) arrayDeque.removeLast();
                                }
                            }
                        }

                        @Override // com.google.gson.TypeAdapter
                        public void write(JsonWriter jsonWriter, JsonElement jsonElement) throws IOException {
/* 1 */                     if (jsonElement == null || jsonElement.isJsonNull()) {
/* 160 */                       jsonWriter.nullValue();
/* 163 */                       return;
                            }
/* 15 */                    if (jsonElement.isJsonPrimitive()) {
/* 17 */                        JsonPrimitive asJsonPrimitive = jsonElement.getAsJsonPrimitive();
/* 25 */                        if (asJsonPrimitive.isNumber()) {
/* 31 */                            jsonWriter.value(asJsonPrimitive.getAsNumber());
/* 34 */                            return;
                                } else if (asJsonPrimitive.isBoolean()) {
/* 45 */                            jsonWriter.value(asJsonPrimitive.getAsBoolean());
/* 48 */                            return;
                                } else {
/* 53 */                            jsonWriter.value(asJsonPrimitive.getAsString());
/* 56 */                            return;
                                }
                            }
/* 61 */                    if (jsonElement.isJsonArray()) {
/* 63 */                        jsonWriter.beginArray();
/* 70 */                        Iterator<JsonElement> it = jsonElement.getAsJsonArray().iterator();
/* 78 */                        while (it.hasNext()) {
/* 86 */                            write(jsonWriter, it.next());
                                }
/* 90 */                        jsonWriter.endArray();
/* 93 */                        return;
                            }
/* 98 */                    if (!jsonElement.isJsonObject()) {
/* 156 */                       C1951n4.m6865p(jsonElement.getClass(), "Couldn't write ");
/* 159 */                       return;
                            }
/* 100 */                   jsonWriter.beginObject();
/* 119 */                   for (Map.Entry<String, JsonElement> entry : jsonElement.getAsJsonObject().entrySet()) {
/* 133 */                       jsonWriter.name(entry.getKey());
/* 142 */                       write(jsonWriter, entry.getValue());
                            }
/* 146 */                   jsonWriter.endObject();
                        }
                    };
/* 391 */           JSON_ELEMENT = typeAdapter15;
/* 399 */           JSON_ELEMENT_FACTORY = newTypeHierarchyFactory(JsonElement.class, typeAdapter15);
/* 406 */           ENUM_FACTORY = new TypeAdapterFactory() { // from class: com.google.gson.internal.bind.TypeAdapters.29
                        @Override // com.google.gson.TypeAdapterFactory
                        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
/* 1 */                     Class<? super T> rawType = typeToken.getRawType();
/* 11 */                    if (!Enum.class.isAssignableFrom(rawType) || rawType == Enum.class) {
/* 32 */                        return null;
                            }
/* 20 */                    if (!rawType.isEnum()) {
/* 22 */                        rawType = rawType.getSuperclass();
                            }
/* 28 */                    return new EnumTypeAdapter(rawType);
                        }
                    };
                }

                private TypeAdapters() {
/* 9 */             throw new UnsupportedOperationException();
                }

                public static <TT> TypeAdapterFactory newFactory(final TypeToken<TT> typeToken, final TypeAdapter<TT> typeAdapter) {
/* 3 */             return new TypeAdapterFactory() { // from class: com.google.gson.internal.bind.TypeAdapters.30
                        @Override // com.google.gson.TypeAdapterFactory
                        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken2) {
/* 7 */                     if (typeToken2.equals(typeToken)) {
/* 9 */                         return typeAdapter;
                            }
/* 12 */                    return null;
                        }
                    };
                }

                public static <TT> TypeAdapterFactory newFactoryForMultipleTypes(final Class<TT> cls, final Class<? extends TT> cls2, final TypeAdapter<? super TT> typeAdapter) {
/* 3 */             return new TypeAdapterFactory() { // from class: com.google.gson.internal.bind.TypeAdapters.33
                        @Override // com.google.gson.TypeAdapterFactory
                        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
/* 1 */                     Class<? super T> rawType = typeToken.getRawType();
/* 7 */                     if (rawType == cls || rawType == cls2) {
/* 16 */                        return typeAdapter;
                            }
/* 14 */                    return null;
                        }

                        public String toString() {
/* 46 */                    return "Factory[type=" + cls.getName() + "+" + cls2.getName() + ",adapter=" + typeAdapter + "]";
                        }
                    };
                }

                public static <T1> TypeAdapterFactory newTypeHierarchyFactory(final Class<T1> cls, final TypeAdapter<T1> typeAdapter) {
/* 3 */             return new TypeAdapterFactory() { // from class: com.google.gson.internal.bind.TypeAdapters.34
                        @Override // com.google.gson.TypeAdapterFactory
                        public <T2> TypeAdapter<T2> create(Gson gson, TypeToken<T2> typeToken) {
/* 1 */                     final Class<? super T2> rawType = typeToken.getRawType();
/* 11 */                    if (cls.isAssignableFrom(rawType)) {
/* 17 */                        return (TypeAdapter<T2>) new TypeAdapter<T1>() { // from class: com.google.gson.internal.bind.TypeAdapters.34.1
                                    @Override // com.google.gson.TypeAdapter
                                    public T1 read(JsonReader jsonReader) throws IOException {
/* 5 */                                 T1 t1 = (T1) typeAdapter.read(jsonReader);
/* 9 */                                 if (t1 == null || rawType.isInstance(t1)) {
/* 74 */                                    return t1;
                                        }
/* 73 */                                throw new JsonSyntaxException("Expected a " + rawType.getName() + " but was " + t1.getClass().getName() + "; at path " + jsonReader.getPreviousPath());
                                    }

                                    @Override // com.google.gson.TypeAdapter
                                    public void write(JsonWriter jsonWriter, T1 t1) throws IOException {
/* 5 */                                 typeAdapter.write(jsonWriter, t1);
                                    }
                                };
                            }
/* 13 */                    return null;
                        }

                        public String toString() {
/* 32 */                    return "Factory[typeHierarchy=" + cls.getName() + ",adapter=" + typeAdapter + "]";
                        }
                    };
                }

/* 6 */         public static <TT> TypeAdapterFactory newFactory(final Class<TT> cls, final TypeAdapter<TT> typeAdapter) {
/* 7 */             return new TypeAdapterFactory() { // from class: com.google.gson.internal.bind.TypeAdapters.31
                        @Override // com.google.gson.TypeAdapterFactory
                        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
/* 7 */                     if (typeToken.getRawType() == cls) {
/* 9 */                         return typeAdapter;
                            }
/* 12 */                    return null;
                        }

                        public String toString() {
/* 32 */                    return "Factory[type=" + cls.getName() + ",adapter=" + typeAdapter + "]";
                        }
                    };
                }

/* 7 */         public static <TT> TypeAdapterFactory newFactory(final Class<TT> cls, final Class<TT> cls2, final TypeAdapter<? super TT> typeAdapter) {
/* 8 */             return new TypeAdapterFactory() { // from class: com.google.gson.internal.bind.TypeAdapters.32
                        @Override // com.google.gson.TypeAdapterFactory
                        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
/* 1 */                     Class<? super T> rawType = typeToken.getRawType();
/* 7 */                     if (rawType == cls || rawType == cls2) {
/* 16 */                        return typeAdapter;
                            }
/* 14 */                    return null;
                        }

                        public String toString() {
/* 46 */                    return "Factory[type=" + cls2.getName() + "+" + cls.getName() + ",adapter=" + typeAdapter + "]";
                        }
                    };
                }
            }
