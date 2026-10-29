            package com.google.gson.internal.sql;

            import com.google.gson.Gson;
            import com.google.gson.TypeAdapter;
            import com.google.gson.TypeAdapterFactory;
            import com.google.gson.reflect.TypeToken;
            import com.google.gson.stream.JsonReader;
            import com.google.gson.stream.JsonToken;
            import com.google.gson.stream.JsonWriter;
            import java.io.IOException;
            import java.sql.Date;
            import java.text.DateFormat;
            import java.text.ParseException;
            import java.text.SimpleDateFormat;
            import p000.AbstractC0886en;
            import p000.C1951n4;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class SqlDateTypeAdapter extends TypeAdapter<Date> {
                static final TypeAdapterFactory FACTORY = new TypeAdapterFactory() { // from class: com.google.gson.internal.sql.SqlDateTypeAdapter.1
                    @Override // com.google.gson.TypeAdapterFactory
                    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
/* 1 */                 Class<? super T> rawType = typeToken.getRawType();
/* 8 */                 if (rawType == Date.class) {
/* 12 */                    return new SqlDateTypeAdapter();
                        }
/* 7 */                 return null;
                    }
                };
                private final DateFormat format;

                private SqlDateTypeAdapter() {
/* 11 */            this.format = new SimpleDateFormat("MMM d, yyyy");
                }

                @Override // com.google.gson.TypeAdapter
                public Date read(JsonReader jsonReader) throws IOException {
                    java.util.Date date;
/* 8 */             if (jsonReader.peek() == JsonToken.NULL) {
/* 10 */                jsonReader.nextNull();
/* 7 */                 return null;
                    }
/* 14 */            String strNextString = jsonReader.nextString();
                    try {
                        synchronized (this) {
/* 21 */                    date = this.format.parse(strNextString);
                        }
/* 32 */                return new Date(date.getTime());
                    } catch (ParseException e) {
/* 53 */                C1951n4.m6862m(AbstractC0886en.m3513q("Failed parsing '", strNextString, "' as SQL Date; at path "), jsonReader.getPreviousPath(), e);
/* 7 */                 return null;
                    }
                }

                @Override // com.google.gson.TypeAdapter
                public void write(JsonWriter jsonWriter, Date date) throws IOException {
                    String str;
/* 1 */             if (date == null) {
/* 3 */                 jsonWriter.nullValue();
/* 6 */                 return;
                    }
                    synchronized (this) {
/* 10 */                str = this.format.format((java.util.Date) date);
                    }
/* 15 */            jsonWriter.value(str);
                }
            }
