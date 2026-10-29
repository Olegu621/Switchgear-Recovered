            package com.google.gson;

            import com.google.gson.internal.C$Gson$Preconditions;
            import com.google.gson.internal.Excluder;
            import com.google.gson.internal.bind.DefaultDateTypeAdapter;
            import com.google.gson.internal.bind.TreeTypeAdapter;
            import com.google.gson.internal.bind.TypeAdapters;
            import com.google.gson.internal.sql.SqlTypesSupport;
            import com.google.gson.reflect.TypeToken;
            import java.lang.reflect.Type;
            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.HashMap;
            import java.util.LinkedList;
            import java.util.List;
            import java.util.Map;
            import java.util.Objects;
            import p000.f42;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 7 */     public final class GsonBuilder {
                private boolean complexMapKeySerialization;
                private String datePattern;
                private int dateStyle;
                private boolean escapeHtmlChars;
                private Excluder excluder;
                private final List<TypeAdapterFactory> factories;
                private FieldNamingStrategy fieldNamingPolicy;
                private boolean generateNonExecutableJson;
                private final List<TypeAdapterFactory> hierarchyFactories;
                private final Map<Type, InstanceCreator<?>> instanceCreators;
                private boolean lenient;
                private LongSerializationPolicy longSerializationPolicy;
                private ToNumberStrategy numberToNumberStrategy;
                private ToNumberStrategy objectToNumberStrategy;
                private boolean prettyPrinting;
                private final LinkedList<ReflectionAccessFilter> reflectionFilters;
                private boolean serializeNulls;
                private boolean serializeSpecialFloatingPointValues;
                private int timeStyle;
                private boolean useJdkUnsafe;

                public GsonBuilder(Gson gson) {
/* 6 */             this.excluder = Excluder.DEFAULT;
/* 10 */            this.longSerializationPolicy = LongSerializationPolicy.DEFAULT;
/* 14 */            this.fieldNamingPolicy = FieldNamingPolicy.IDENTITY;
/* 18 */            HashMap map = new HashMap();
/* 21 */            this.instanceCreators = map;
/* 25 */            ArrayList arrayList = new ArrayList();
/* 28 */            this.factories = arrayList;
/* 32 */            ArrayList arrayList2 = new ArrayList();
/* 35 */            this.hierarchyFactories = arrayList2;
/* 38 */            this.serializeNulls = false;
/* 42 */            this.datePattern = Gson.DEFAULT_DATE_PATTERN;
/* 45 */            this.dateStyle = 2;
/* 47 */            this.timeStyle = 2;
/* 49 */            this.complexMapKeySerialization = false;
/* 51 */            this.serializeSpecialFloatingPointValues = false;
/* 54 */            this.escapeHtmlChars = true;
/* 56 */            this.prettyPrinting = false;
/* 58 */            this.generateNonExecutableJson = false;
/* 60 */            this.lenient = false;
/* 62 */            this.useJdkUnsafe = true;
/* 66 */            this.objectToNumberStrategy = Gson.DEFAULT_OBJECT_TO_NUMBER_STRATEGY;
/* 70 */            this.numberToNumberStrategy = Gson.DEFAULT_NUMBER_TO_NUMBER_STRATEGY;
/* 74 */            LinkedList<ReflectionAccessFilter> linkedList = new LinkedList<>();
/* 77 */            this.reflectionFilters = linkedList;
/* 81 */            this.excluder = gson.excluder;
/* 85 */            this.fieldNamingPolicy = gson.fieldNamingStrategy;
/* 89 */            map.putAll(gson.instanceCreators);
/* 94 */            this.serializeNulls = gson.serializeNulls;
/* 98 */            this.complexMapKeySerialization = gson.complexMapKeySerialization;
/* 102 */           this.generateNonExecutableJson = gson.generateNonExecutableJson;
/* 106 */           this.escapeHtmlChars = gson.htmlSafe;
/* 110 */           this.prettyPrinting = gson.prettyPrinting;
/* 114 */           this.lenient = gson.lenient;
/* 118 */           this.serializeSpecialFloatingPointValues = gson.serializeSpecialFloatingPointValues;
/* 122 */           this.longSerializationPolicy = gson.longSerializationPolicy;
/* 126 */           this.datePattern = gson.datePattern;
/* 130 */           this.dateStyle = gson.dateStyle;
/* 134 */           this.timeStyle = gson.timeStyle;
/* 138 */           arrayList.addAll(gson.builderFactories);
/* 143 */           arrayList2.addAll(gson.builderHierarchyFactories);
/* 148 */           this.useJdkUnsafe = gson.useJdkUnsafe;
/* 152 */           this.objectToNumberStrategy = gson.objectToNumberStrategy;
/* 156 */           this.numberToNumberStrategy = gson.numberToNumberStrategy;
/* 160 */           linkedList.addAll(gson.reflectionFilters);
                }

                private void addTypeAdaptersForDate(String str, int i, int i2, List<TypeAdapterFactory> list) {
                    TypeAdapterFactory typeAdapterFactoryCreateAdapterFactory;
                    TypeAdapterFactory typeAdapterFactoryCreateAdapterFactory2;
/* 1 */             boolean z = SqlTypesSupport.SUPPORTS_SQL_TYPES;
/* 3 */             TypeAdapterFactory typeAdapterFactoryCreateAdapterFactory3 = null;
/* 4 */             if (str != null && !str.trim().isEmpty()) {
/* 18 */                typeAdapterFactoryCreateAdapterFactory = DefaultDateTypeAdapter.DateType.DATE.createAdapterFactory(str);
/* 22 */                if (z) {
/* 26 */                    typeAdapterFactoryCreateAdapterFactory3 = SqlTypesSupport.TIMESTAMP_DATE_TYPE.createAdapterFactory(str);
/* 32 */                    typeAdapterFactoryCreateAdapterFactory2 = SqlTypesSupport.DATE_DATE_TYPE.createAdapterFactory(str);
                        } else {
/* 37 */                    typeAdapterFactoryCreateAdapterFactory2 = null;
                        }
                    } else {
/* 40 */                if (i == 2 || i2 == 2) {
/* 81 */                    return;
                        }
/* 46 */                TypeAdapterFactory typeAdapterFactoryCreateAdapterFactory4 = DefaultDateTypeAdapter.DateType.DATE.createAdapterFactory(i, i2);
/* 50 */                if (z) {
/* 54 */                    typeAdapterFactoryCreateAdapterFactory3 = SqlTypesSupport.TIMESTAMP_DATE_TYPE.createAdapterFactory(i, i2);
/* 60 */                    TypeAdapterFactory typeAdapterFactoryCreateAdapterFactory5 = SqlTypesSupport.DATE_DATE_TYPE.createAdapterFactory(i, i2);
/* 65 */                    typeAdapterFactoryCreateAdapterFactory = typeAdapterFactoryCreateAdapterFactory4;
/* 66 */                    typeAdapterFactoryCreateAdapterFactory2 = typeAdapterFactoryCreateAdapterFactory5;
                        } else {
/* 68 */                    typeAdapterFactoryCreateAdapterFactory = typeAdapterFactoryCreateAdapterFactory4;
/* 37 */                    typeAdapterFactoryCreateAdapterFactory2 = null;
                        }
                    }
/* 70 */            list.add(typeAdapterFactoryCreateAdapterFactory);
/* 73 */            if (z) {
/* 75 */                list.add(typeAdapterFactoryCreateAdapterFactory3);
/* 78 */                list.add(typeAdapterFactoryCreateAdapterFactory2);
                    }
                }

                public GsonBuilder addDeserializationExclusionStrategy(ExclusionStrategy exclusionStrategy) {
/* 1 */             Objects.requireNonNull(exclusionStrategy);
/* 12 */            this.excluder = this.excluder.withExclusionStrategy(exclusionStrategy, false, true);
/* 14 */            return this;
                }

                public GsonBuilder addReflectionAccessFilter(ReflectionAccessFilter reflectionAccessFilter) {
/* 1 */             Objects.requireNonNull(reflectionAccessFilter);
/* 6 */             this.reflectionFilters.addFirst(reflectionAccessFilter);
/* 9 */             return this;
                }

                public GsonBuilder addSerializationExclusionStrategy(ExclusionStrategy exclusionStrategy) {
/* 1 */             Objects.requireNonNull(exclusionStrategy);
/* 12 */            this.excluder = this.excluder.withExclusionStrategy(exclusionStrategy, true, false);
/* 14 */            return this;
                }

                public Gson create() {
/* 20 */            ArrayList arrayList = new ArrayList(this.hierarchyFactories.size() + this.factories.size() + 3);
/* 25 */            arrayList.addAll(this.factories);
/* 28 */            Collections.reverse(arrayList);
/* 35 */            ArrayList arrayList2 = new ArrayList(this.hierarchyFactories);
/* 38 */            Collections.reverse(arrayList2);
/* 41 */            arrayList.addAll(arrayList2);
/* 50 */            addTypeAdaptersForDate(this.datePattern, this.dateStyle, this.timeStyle, arrayList);
/* 160 */           return new Gson(this.excluder, this.fieldNamingPolicy, new HashMap(this.instanceCreators), this.serializeNulls, this.complexMapKeySerialization, this.generateNonExecutableJson, this.escapeHtmlChars, this.prettyPrinting, this.lenient, this.serializeSpecialFloatingPointValues, this.useJdkUnsafe, this.longSerializationPolicy, this.datePattern, this.dateStyle, this.timeStyle, new ArrayList(this.factories), new ArrayList(this.hierarchyFactories), arrayList, this.objectToNumberStrategy, this.numberToNumberStrategy, new ArrayList(this.reflectionFilters));
                }

                public GsonBuilder disableHtmlEscaping() {
/* 2 */             this.escapeHtmlChars = false;
/* 4 */             return this;
                }

                public GsonBuilder disableInnerClassSerialization() {
/* 7 */             this.excluder = this.excluder.disableInnerClassSerialization();
/* 9 */             return this;
                }

                public GsonBuilder disableJdkUnsafe() {
/* 2 */             this.useJdkUnsafe = false;
/* 4 */             return this;
                }

                public GsonBuilder enableComplexMapKeySerialization() {
/* 2 */             this.complexMapKeySerialization = true;
/* 4 */             return this;
                }

                public GsonBuilder excludeFieldsWithModifiers(int... iArr) {
/* 1 */             Objects.requireNonNull(iArr);
/* 10 */            this.excluder = this.excluder.withModifiers(iArr);
/* 12 */            return this;
                }

                public GsonBuilder excludeFieldsWithoutExposeAnnotation() {
/* 7 */             this.excluder = this.excluder.excludeFieldsWithoutExposeAnnotation();
/* 9 */             return this;
                }

                public GsonBuilder generateNonExecutableJson() {
/* 2 */             this.generateNonExecutableJson = true;
/* 4 */             return this;
                }

                public GsonBuilder registerTypeAdapter(Type type, Object obj) {
/* 1 */             Objects.requireNonNull(type);
/* 4 */             boolean z = obj instanceof JsonSerializer;
/* 24 */            C$Gson$Preconditions.checkArgument(z || (obj instanceof JsonDeserializer) || (obj instanceof InstanceCreator) || (obj instanceof TypeAdapter));
/* 29 */            if (obj instanceof InstanceCreator) {
/* 36 */                this.instanceCreators.put(type, (InstanceCreator) obj);
                    }
/* 39 */            if (z || (obj instanceof JsonDeserializer)) {
/* 55 */                this.factories.add(TreeTypeAdapter.newFactoryWithMatchRawType(TypeToken.get(type), obj));
                    }
/* 60 */            if (obj instanceof TypeAdapter) {
/* 74 */                this.factories.add(TypeAdapters.newFactory(TypeToken.get(type), (TypeAdapter) obj));
                    }
/* 77 */            return this;
                }

                public GsonBuilder registerTypeAdapterFactory(TypeAdapterFactory typeAdapterFactory) {
/* 1 */             Objects.requireNonNull(typeAdapterFactory);
/* 6 */             this.factories.add(typeAdapterFactory);
/* 9 */             return this;
                }

                public GsonBuilder registerTypeHierarchyAdapter(Class<?> cls, Object obj) {
/* 1 */             Objects.requireNonNull(cls);
/* 4 */             boolean z = obj instanceof JsonSerializer;
/* 20 */            C$Gson$Preconditions.checkArgument(z || (obj instanceof JsonDeserializer) || (obj instanceof TypeAdapter));
/* 25 */            if ((obj instanceof JsonDeserializer) || z) {
/* 35 */                this.hierarchyFactories.add(TreeTypeAdapter.newTypeHierarchyFactory(cls, obj));
                    }
/* 40 */            if (obj instanceof TypeAdapter) {
/* 50 */                this.factories.add(TypeAdapters.newTypeHierarchyFactory(cls, (TypeAdapter) obj));
                    }
/* 53 */            return this;
                }

                public GsonBuilder serializeNulls() {
/* 2 */             this.serializeNulls = true;
/* 4 */             return this;
                }

                public GsonBuilder serializeSpecialFloatingPointValues() {
/* 2 */             this.serializeSpecialFloatingPointValues = true;
/* 4 */             return this;
                }

                public GsonBuilder setDateFormat(int i, int i2) {
/* 1 */             this.dateStyle = i;
/* 3 */             this.timeStyle = i2;
/* 6 */             this.datePattern = null;
/* 8 */             return this;
                }

                public GsonBuilder setExclusionStrategies(ExclusionStrategy... exclusionStrategyArr) {
/* 1 */             Objects.requireNonNull(exclusionStrategyArr);
/* 6 */             for (ExclusionStrategy exclusionStrategy : exclusionStrategyArr) {
/* 17 */                this.excluder = this.excluder.withExclusionStrategy(exclusionStrategy, true, true);
                    }
/* 22 */            return this;
                }

                public GsonBuilder setFieldNamingPolicy(FieldNamingPolicy fieldNamingPolicy) {
/* 1 */             return setFieldNamingStrategy(fieldNamingPolicy);
                }

                public GsonBuilder setFieldNamingStrategy(FieldNamingStrategy fieldNamingStrategy) {
/* 1 */             Objects.requireNonNull(fieldNamingStrategy);
/* 6 */             this.fieldNamingPolicy = fieldNamingStrategy;
/* 8 */             return this;
                }

                public GsonBuilder setLenient() {
/* 2 */             this.lenient = true;
/* 4 */             return this;
                }

                public GsonBuilder setLongSerializationPolicy(LongSerializationPolicy longSerializationPolicy) {
/* 1 */             Objects.requireNonNull(longSerializationPolicy);
/* 4 */             this.longSerializationPolicy = longSerializationPolicy;
/* 6 */             return this;
                }

                public GsonBuilder setNumberToNumberStrategy(ToNumberStrategy toNumberStrategy) {
/* 1 */             Objects.requireNonNull(toNumberStrategy);
/* 6 */             this.numberToNumberStrategy = toNumberStrategy;
/* 8 */             return this;
                }

                public GsonBuilder setObjectToNumberStrategy(ToNumberStrategy toNumberStrategy) {
/* 1 */             Objects.requireNonNull(toNumberStrategy);
/* 6 */             this.objectToNumberStrategy = toNumberStrategy;
/* 8 */             return this;
                }

                public GsonBuilder setPrettyPrinting() {
/* 2 */             this.prettyPrinting = true;
/* 4 */             return this;
                }

                public GsonBuilder setVersion(double d) {
/* 5 */             if (Double.isNaN(d) || d < 0.0d) {
/* 24 */                f42.m3657m("Invalid version: ", d);
/* 27 */                return null;
                    }
/* 19 */            this.excluder = this.excluder.withVersion(d);
/* 21 */            return this;
                }

/* 8 */         public GsonBuilder setDateFormat(int i) {
/* 9 */             this.dateStyle = i;
/* 10 */            this.datePattern = null;
                    return this;
                }

/* 10 */        public GsonBuilder setDateFormat(String str) {
/* 11 */            this.datePattern = str;
                    return this;
                }

/* 163 */       public GsonBuilder() {
/* 165 */           this.excluder = Excluder.DEFAULT;
/* 166 */           this.longSerializationPolicy = LongSerializationPolicy.DEFAULT;
/* 167 */           this.fieldNamingPolicy = FieldNamingPolicy.IDENTITY;
/* 168 */           this.instanceCreators = new HashMap();
/* 169 */           this.factories = new ArrayList();
/* 170 */           this.hierarchyFactories = new ArrayList();
/* 171 */           this.serializeNulls = false;
/* 172 */           this.datePattern = Gson.DEFAULT_DATE_PATTERN;
/* 173 */           this.dateStyle = 2;
/* 174 */           this.timeStyle = 2;
/* 175 */           this.complexMapKeySerialization = false;
/* 176 */           this.serializeSpecialFloatingPointValues = false;
/* 177 */           this.escapeHtmlChars = true;
/* 178 */           this.prettyPrinting = false;
/* 179 */           this.generateNonExecutableJson = false;
/* 180 */           this.lenient = false;
/* 181 */           this.useJdkUnsafe = true;
/* 182 */           this.objectToNumberStrategy = Gson.DEFAULT_OBJECT_TO_NUMBER_STRATEGY;
/* 183 */           this.numberToNumberStrategy = Gson.DEFAULT_NUMBER_TO_NUMBER_STRATEGY;
/* 184 */           this.reflectionFilters = new LinkedList<>();
                }
            }
