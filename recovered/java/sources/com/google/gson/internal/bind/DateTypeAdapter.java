            package com.google.gson.internal.bind;

            import com.google.gson.Gson;
            import com.google.gson.TypeAdapter;
            import com.google.gson.TypeAdapterFactory;
            import com.google.gson.internal.JavaVersion;
            import com.google.gson.internal.PreJava9DateFormatProvider;
            import com.google.gson.internal.bind.util.ISO8601Utils;
            import com.google.gson.reflect.TypeToken;
            import com.google.gson.stream.JsonReader;
            import com.google.gson.stream.JsonToken;
            import com.google.gson.stream.JsonWriter;
            import java.io.IOException;
            import java.text.DateFormat;
            import java.text.ParseException;
            import java.text.ParsePosition;
            import java.util.ArrayList;
            import java.util.Date;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Locale;
            import p000.AbstractC0886en;
            import p000.C1951n4;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class DateTypeAdapter extends TypeAdapter<Date> {
                public static final TypeAdapterFactory FACTORY = new TypeAdapterFactory() { // from class: com.google.gson.internal.bind.DateTypeAdapter.1
                    @Override // com.google.gson.TypeAdapterFactory
                    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
/* 7 */                 if (typeToken.getRawType() == Date.class) {
/* 11 */                    return new DateTypeAdapter();
                        }
/* 15 */                return null;
                    }
                };
                private final List<DateFormat> dateFormats;

                public DateTypeAdapter() {
/* 6 */             ArrayList arrayList = new ArrayList();
/* 9 */             this.dateFormats = arrayList;
/* 11 */            Locale locale = Locale.US;
/* 18 */            arrayList.add(DateFormat.getDateTimeInstance(2, 2, locale));
/* 29 */            if (!Locale.getDefault().equals(locale)) {
/* 35 */                arrayList.add(DateFormat.getDateTimeInstance(2, 2));
                    }
/* 42 */            if (JavaVersion.isJava9OrLater()) {
/* 48 */                arrayList.add(PreJava9DateFormatProvider.getUSDateTimeFormat(2, 2));
                    }
                }

                private Date deserializeToDate(JsonReader jsonReader) throws IOException {
/* 1 */             String strNextString = jsonReader.nextString();
                    synchronized (this.dateFormats) {
                        try {
/* 10 */                    Iterator<DateFormat> it = this.dateFormats.iterator();
/* 18 */                    while (it.hasNext()) {
                                try {
/* 26 */                            return it.next().parse(strNextString);
                                } catch (ParseException unused) {
                                }
                            }
                            try {
/* 41 */                        return ISO8601Utils.parse(strNextString, new ParsePosition(0));
                            } catch (ParseException e) {
/* 59 */                        C1951n4.m6862m(AbstractC0886en.m3513q("Failed parsing '", strNextString, "' as Date; at path "), jsonReader.getPreviousPath(), e);
/* 62 */                        return null;
                            }
                        } catch (Throwable th) {
/* 65 */                    throw th;
                        }
                    }
                }

                @Override // com.google.gson.TypeAdapter
                public Date read(JsonReader jsonReader) throws IOException {
/* 7 */             if (jsonReader.peek() != JsonToken.NULL) {
/* 14 */                return deserializeToDate(jsonReader);
                    }
/* 9 */             jsonReader.nextNull();
/* 12 */            return null;
                }

                @Override // com.google.gson.TypeAdapter
                public void write(JsonWriter jsonWriter, Date date) throws IOException {
                    String str;
/* 1 */             if (date == null) {
/* 3 */                 jsonWriter.nullValue();
/* 6 */                 return;
                    }
/* 10 */            DateFormat dateFormat = this.dateFormats.get(0);
                    synchronized (this.dateFormats) {
/* 19 */                str = dateFormat.format(date);
                    }
/* 24 */            jsonWriter.value(str);
                }
            }
