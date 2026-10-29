            package com.google.gson.internal.bind;

            import com.google.gson.Gson;
            import com.google.gson.JsonDeserializer;
            import com.google.gson.JsonSerializer;
            import com.google.gson.TypeAdapter;
            import com.google.gson.TypeAdapterFactory;
            import com.google.gson.annotations.JsonAdapter;
            import com.google.gson.internal.ConstructorConstructor;
            import com.google.gson.reflect.TypeToken;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class JsonAdapterAnnotationTypeAdapterFactory implements TypeAdapterFactory {
                private final ConstructorConstructor constructorConstructor;

                public JsonAdapterAnnotationTypeAdapterFactory(ConstructorConstructor constructorConstructor) {
/* 4 */             this.constructorConstructor = constructorConstructor;
                }

                @Override // com.google.gson.TypeAdapterFactory
                public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
/* 11 */            JsonAdapter jsonAdapter = (JsonAdapter) typeToken.getRawType().getAnnotation(JsonAdapter.class);
/* 13 */            if (jsonAdapter == null) {
/* 15 */                return null;
                    }
/* 19 */            return (TypeAdapter<T>) getTypeAdapter(this.constructorConstructor, gson, typeToken, jsonAdapter);
                }

                public TypeAdapter<?> getTypeAdapter(ConstructorConstructor constructorConstructor, Gson gson, TypeToken<?> typeToken, JsonAdapter jsonAdapter) {
                    TypeAdapter<?> typeAdapterCreate;
/* 13 */            Object objConstruct = constructorConstructor.get(TypeToken.get((Class) jsonAdapter.value())).construct();
/* 17 */            boolean zNullSafe = jsonAdapter.nullSafe();
/* 23 */            if (objConstruct instanceof TypeAdapter) {
/* 25 */                typeAdapterCreate = (TypeAdapter) objConstruct;
                    } else if (objConstruct instanceof TypeAdapterFactory) {
/* 34 */                typeAdapterCreate = ((TypeAdapterFactory) objConstruct).create(gson, typeToken);
                    } else {
/* 39 */                boolean z = objConstruct instanceof JsonSerializer;
/* 41 */                if (!z && !(objConstruct instanceof JsonDeserializer)) {
/* 92 */                    throw new IllegalArgumentException("Invalid attempt to bind an instance of " + objConstruct.getClass().getName() + " as a @JsonAdapter for " + typeToken.toString() + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
                        }
/* 115 */               TreeTypeAdapter treeTypeAdapter = new TreeTypeAdapter(z ? (JsonSerializer) objConstruct : null, objConstruct instanceof JsonDeserializer ? (JsonDeserializer) objConstruct : null, gson, typeToken, null, zNullSafe);
/* 118 */               zNullSafe = false;
/* 119 */               typeAdapterCreate = treeTypeAdapter;
                    }
                    return (typeAdapterCreate == null || !zNullSafe) ? typeAdapterCreate : typeAdapterCreate.nullSafe();
                }
            }
