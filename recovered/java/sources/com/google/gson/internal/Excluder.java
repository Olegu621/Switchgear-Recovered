            package com.google.gson.internal;

            import com.google.gson.ExclusionStrategy;
            import com.google.gson.FieldAttributes;
            import com.google.gson.Gson;
            import com.google.gson.TypeAdapter;
            import com.google.gson.TypeAdapterFactory;
            import com.google.gson.annotations.Expose;
            import com.google.gson.annotations.Since;
            import com.google.gson.annotations.Until;
            import com.google.gson.reflect.TypeToken;
            import com.google.gson.stream.JsonReader;
            import com.google.gson.stream.JsonWriter;
            import java.io.IOException;
            import java.lang.reflect.Field;
            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.Iterator;
            import java.util.List;
            import p000.C1951n4;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class Excluder implements TypeAdapterFactory, Cloneable {
                public static final Excluder DEFAULT = new Excluder();
                private static final double IGNORE_VERSIONS = -1.0d;
                private List<ExclusionStrategy> deserializationStrategies;
                private boolean requireExpose;
                private List<ExclusionStrategy> serializationStrategies;
                private double version = IGNORE_VERSIONS;
                private int modifiers = 136;
                private boolean serializeInnerClasses = true;

                public Excluder() {
/* 15 */            List<ExclusionStrategy> list = Collections.EMPTY_LIST;
/* 17 */            this.serializationStrategies = list;
/* 19 */            this.deserializationStrategies = list;
                }

                private boolean excludeClassChecks(Class<?> cls) {
/* 8 */             if (this.version != IGNORE_VERSIONS && !isValidVersion((Since) cls.getAnnotation(Since.class), (Until) cls.getAnnotation(Until.class))) {
/* 7 */                 return true;
                    }
/* 35 */            if (this.serializeInnerClasses || !isInnerClass(cls)) {
/* 44 */                return isAnonymousOrNonStaticLocal(cls);
                    }
/* 7 */             return true;
                }

                private boolean excludeClassInStrategy(Class<?> cls, boolean z) {
/* 8 */             Iterator<ExclusionStrategy> it = (z ? this.serializationStrategies : this.deserializationStrategies).iterator();
/* 16 */            while (it.hasNext()) {
/* 28 */                if (it.next().shouldSkipClass(cls)) {
/* 30 */                    return true;
                        }
                    }
/* 32 */            return false;
                }

                private boolean isAnonymousOrNonStaticLocal(Class<?> cls) {
/* 7 */             if (Enum.class.isAssignableFrom(cls) || isStatic(cls)) {
/* 29 */                return false;
                    }
                    return cls.isAnonymousClass() || cls.isLocalClass();
                }

                private boolean isInnerClass(Class<?> cls) {
                    return cls.isMemberClass() && !isStatic(cls);
                }

                private boolean isStatic(Class<?> cls) {
                    return (cls.getModifiers() & 8) != 0;
                }

                private boolean isValidSince(Since since) {
/* 2 */             if (since != null) {
                        return this.version >= since.value();
                    }
/* 1 */             return true;
                }

                private boolean isValidUntil(Until until) {
/* 2 */             if (until != null) {
                        return this.version < until.value();
                    }
/* 1 */             return true;
                }

                private boolean isValidVersion(Since since, Until until) {
                    return isValidSince(since) && isValidUntil(until);
                }

                /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
                public Excluder m10488clone() {
                    try {
/* 5 */                 return (Excluder) super.clone();
                    } catch (CloneNotSupportedException e) {
/* 9 */                 C1951n4.m6856g(e);
/* 12 */                return null;
                    }
                }

                @Override // com.google.gson.TypeAdapterFactory
                public <T> TypeAdapter<T> create(final Gson gson, final TypeToken<T> typeToken) {
/* 1 */             Class<? super T> rawType = typeToken.getRawType();
/* 5 */             boolean zExcludeClassChecks = excludeClassChecks(rawType);
/* 22 */            final boolean z = zExcludeClassChecks || excludeClassInStrategy(rawType, true);
/* 34 */            final boolean z2 = zExcludeClassChecks || excludeClassInStrategy(rawType, false);
/* 35 */            if (z || z2) {
/* 46 */                return new TypeAdapter<T>() { // from class: com.google.gson.internal.Excluder.1
                            private TypeAdapter<T> delegate;

                            private TypeAdapter<T> delegate() {
/* 1 */                         TypeAdapter<T> typeAdapter = this.delegate;
/* 3 */                         if (typeAdapter != null) {
/* 5 */                             return typeAdapter;
                                }
/* 12 */                        TypeAdapter<T> delegateAdapter = gson.getDelegateAdapter(Excluder.this, typeToken);
/* 16 */                        this.delegate = delegateAdapter;
/* 18 */                        return delegateAdapter;
                            }

                            @Override // com.google.gson.TypeAdapter
                            public T read(JsonReader jsonReader) throws IOException {
/* 3 */                         if (!z2) {
/* 14 */                            return delegate().read(jsonReader);
                                }
/* 5 */                         jsonReader.skipValue();
/* 8 */                         return null;
                            }

                            @Override // com.google.gson.TypeAdapter
                            public void write(JsonWriter jsonWriter, T t) throws IOException {
/* 3 */                         if (z) {
/* 5 */                             jsonWriter.nullValue();
                                } else {
/* 13 */                            delegate().write(jsonWriter, t);
                                }
                            }
                        };
                    }
/* 39 */            return null;
                }

                public Excluder disableInnerClassSerialization() {
/* 1 */             Excluder excluderM10488clone = m10488clone();
/* 6 */             excluderM10488clone.serializeInnerClasses = false;
/* 8 */             return excluderM10488clone;
                }

                public boolean excludeClass(Class<?> cls, boolean z) {
                    return excludeClassChecks(cls) || excludeClassInStrategy(cls, z);
                }

                public boolean excludeField(Field field, boolean z) {
                    Expose expose;
/* 9 */             if ((this.modifiers & field.getModifiers()) != 0) {
/* 8 */                 return true;
                    }
/* 18 */            if ((this.version != IGNORE_VERSIONS && !isValidVersion((Since) field.getAnnotation(Since.class), (Until) field.getAnnotation(Until.class))) || field.isSynthetic()) {
/* 8 */                 return true;
                    }
/* 52 */            if (this.requireExpose && ((expose = (Expose) field.getAnnotation(Expose.class)) == null || (!z ? expose.deserialize() : expose.serialize()))) {
/* 8 */                 return true;
                    }
/* 82 */            if ((!this.serializeInnerClasses && isInnerClass(field.getType())) || isAnonymousOrNonStaticLocal(field.getType())) {
/* 8 */                 return true;
                    }
/* 111 */           List<ExclusionStrategy> list = z ? this.serializationStrategies : this.deserializationStrategies;
/* 117 */           if (list.isEmpty()) {
/* 147 */               return false;
                    }
/* 121 */           FieldAttributes fieldAttributes = new FieldAttributes(field);
/* 124 */           Iterator<ExclusionStrategy> it = list.iterator();
/* 132 */           while (it.hasNext()) {
/* 144 */               if (it.next().shouldSkipField(fieldAttributes)) {
/* 8 */                     return true;
                        }
                    }
/* 147 */           return false;
                }

                public Excluder excludeFieldsWithoutExposeAnnotation() {
/* 1 */             Excluder excluderM10488clone = m10488clone();
/* 6 */             excluderM10488clone.requireExpose = true;
/* 8 */             return excluderM10488clone;
                }

                public Excluder withExclusionStrategy(ExclusionStrategy exclusionStrategy, boolean z, boolean z2) {
/* 1 */             Excluder excluderM10488clone = m10488clone();
/* 5 */             if (z) {
/* 11 */                ArrayList arrayList = new ArrayList(this.serializationStrategies);
/* 14 */                excluderM10488clone.serializationStrategies = arrayList;
/* 16 */                arrayList.add(exclusionStrategy);
                    }
/* 19 */            if (z2) {
/* 25 */                ArrayList arrayList2 = new ArrayList(this.deserializationStrategies);
/* 28 */                excluderM10488clone.deserializationStrategies = arrayList2;
/* 30 */                arrayList2.add(exclusionStrategy);
                    }
/* 33 */            return excluderM10488clone;
                }

                public Excluder withModifiers(int... iArr) {
/* 1 */             Excluder excluderM10488clone = m10488clone();
/* 6 */             excluderM10488clone.modifiers = 0;
/* 9 */             for (int i : iArr) {
/* 16 */                excluderM10488clone.modifiers = i | excluderM10488clone.modifiers;
                    }
/* 21 */            return excluderM10488clone;
                }

                public Excluder withVersion(double d) {
/* 1 */             Excluder excluderM10488clone = m10488clone();
/* 5 */             excluderM10488clone.version = d;
/* 7 */             return excluderM10488clone;
                }
            }
