            package com.google.gson.internal.sql;

            import com.google.gson.Gson;
            import com.google.gson.TypeAdapter;
            import com.google.gson.TypeAdapterFactory;
            import com.google.gson.reflect.TypeToken;
            import com.google.gson.stream.JsonReader;
            import com.google.gson.stream.JsonWriter;
            import java.io.IOException;
            import java.sql.Timestamp;
            import java.util.Date;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 5 */     class SqlTimestampTypeAdapter extends TypeAdapter<Timestamp> {
                static final TypeAdapterFactory FACTORY = new TypeAdapterFactory() { // from class: com.google.gson.internal.sql.SqlTimestampTypeAdapter.1
                    @Override // com.google.gson.TypeAdapterFactory
                    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
/* 8 */                 if (typeToken.getRawType() == Timestamp.class) {
/* 18 */                    return new SqlTimestampTypeAdapter(gson.getAdapter(Date.class));
                        }
/* 7 */                 return null;
                    }
                };
                private final TypeAdapter<Date> dateTypeAdapter;

                private SqlTimestampTypeAdapter(TypeAdapter<Date> typeAdapter) {
/* 4 */             this.dateTypeAdapter = typeAdapter;
                }

                @Override // com.google.gson.TypeAdapter
                public Timestamp read(JsonReader jsonReader) throws IOException {
/* 3 */             Date date = this.dateTypeAdapter.read(jsonReader);
/* 9 */             if (date != null) {
/* 17 */                return new Timestamp(date.getTime());
                    }
/* 21 */            return null;
                }

                @Override // com.google.gson.TypeAdapter
/* 6 */         public void write(JsonWriter jsonWriter, Timestamp timestamp) throws IOException {
/* 7 */             this.dateTypeAdapter.write(jsonWriter, timestamp);
                }
            }
