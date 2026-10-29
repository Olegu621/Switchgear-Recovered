            package com.google.gson.internal.bind;

            import com.google.gson.TypeAdapter;
            import com.google.gson.TypeAdapterFactory;
            import com.google.gson.internal.JavaVersion;
            import com.google.gson.internal.PreJava9DateFormatProvider;
            import com.google.gson.internal.bind.util.ISO8601Utils;
            import com.google.gson.stream.JsonReader;
            import com.google.gson.stream.JsonToken;
            import com.google.gson.stream.JsonWriter;
            import java.io.IOException;
            import java.text.DateFormat;
            import java.text.ParseException;
            import java.text.ParsePosition;
            import java.text.SimpleDateFormat;
            import java.util.ArrayList;
            import java.util.Date;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Locale;
            import java.util.Objects;
            import p000.AbstractC0886en;
            import p000.C1951n4;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 9 */     public final class DefaultDateTypeAdapter<T extends Date> extends TypeAdapter<T> {
                private static final String SIMPLE_NAME = "DefaultDateTypeAdapter";
                private final List<DateFormat> dateFormats;
                private final DateType<T> dateType;

                private DefaultDateTypeAdapter(DateType<T> dateType, int i) {
/* 6 */             ArrayList arrayList = new ArrayList();
/* 9 */             this.dateFormats = arrayList;
/* 11 */            Objects.requireNonNull(dateType);
/* 14 */            this.dateType = dateType;
/* 16 */            Locale locale = Locale.US;
/* 22 */            arrayList.add(DateFormat.getDateInstance(i, locale));
/* 33 */            if (!Locale.getDefault().equals(locale)) {
/* 39 */                arrayList.add(DateFormat.getDateInstance(i));
                    }
/* 46 */            if (JavaVersion.isJava9OrLater()) {
/* 52 */                arrayList.add(PreJava9DateFormatProvider.getUSDateFormat(i));
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
                public T read(JsonReader jsonReader) throws IOException {
/* 7 */             if (jsonReader.peek() == JsonToken.NULL) {
/* 9 */                 jsonReader.nextNull();
/* 12 */                return null;
                    }
/* 20 */            return (T) this.dateType.deserialize(deserializeToDate(jsonReader));
                }

                public String toString() {
/* 4 */             DateFormat dateFormat = this.dateFormats.get(0);
/* 16 */            if (dateFormat instanceof SimpleDateFormat) {
/* 35 */                return "DefaultDateTypeAdapter(" + ((SimpleDateFormat) dateFormat).toPattern() + ')';
                    }
/* 59 */            return "DefaultDateTypeAdapter(" + dateFormat.getClass().getSimpleName() + ')';
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

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
/* 10 */        public static abstract class DateType<T extends Date> {
                    public static final DateType<Date> DATE = new DateType<Date>(Date.class) { // from class: com.google.gson.internal.bind.DefaultDateTypeAdapter.DateType.1
                        @Override // com.google.gson.internal.bind.DefaultDateTypeAdapter.DateType
                        public Date deserialize(Date date) {
/* 1 */                     return date;
                        }
                    };
                    private final Class<T> dateClass;

                    public DateType(Class<T> cls) {
/* 4 */                 this.dateClass = cls;
                    }

                    private TypeAdapterFactory createFactory(DefaultDateTypeAdapter<T> defaultDateTypeAdapter) {
/* 3 */                 return TypeAdapters.newFactory(this.dateClass, defaultDateTypeAdapter);
                    }

                    public final TypeAdapterFactory createAdapterFactory(String str) {
/* 7 */                 return createFactory(new DefaultDateTypeAdapter<>(this, str));
                    }

                    public final TypeAdapterFactory createDefaultsAdapterFactory() {
/* 3 */                 int i = 2;
/* 8 */                 return createFactory(new DefaultDateTypeAdapter<>(this, i, i));
                    }

                    public abstract T deserialize(Date date);

/* 11 */            public final TypeAdapterFactory createAdapterFactory(int i) {
/* 12 */                return createFactory(new DefaultDateTypeAdapter<>(this, i));
                    }

/* 12 */            public final TypeAdapterFactory createAdapterFactory(int i, int i2) {
/* 13 */                return createFactory(new DefaultDateTypeAdapter<>(this, i, i2));
                    }
                }

/* 57 */        private DefaultDateTypeAdapter(DateType<T> dateType, String str) {
/* 59 */            ArrayList arrayList = new ArrayList();
                    this.dateFormats = arrayList;
/* 60 */            Objects.requireNonNull(dateType);
                    this.dateType = dateType;
                    Locale locale = Locale.US;
/* 61 */            arrayList.add(new SimpleDateFormat(str, locale));
/* 62 */            if (Locale.getDefault().equals(locale)) {
                        return;
                    }
/* 63 */            arrayList.add(new SimpleDateFormat(str));
                }

/* 64 */        private DefaultDateTypeAdapter(DateType<T> dateType, int i, int i2) {
/* 66 */            ArrayList arrayList = new ArrayList();
                    this.dateFormats = arrayList;
/* 67 */            Objects.requireNonNull(dateType);
                    this.dateType = dateType;
/* 68 */            Locale locale = Locale.US;
                    arrayList.add(DateFormat.getDateTimeInstance(i, i2, locale));
/* 69 */            if (!Locale.getDefault().equals(locale)) {
/* 70 */                arrayList.add(DateFormat.getDateTimeInstance(i, i2));
                    }
/* 71 */            if (JavaVersion.isJava9OrLater()) {
/* 72 */                arrayList.add(PreJava9DateFormatProvider.getUSDateTimeFormat(i, i2));
                    }
                }
            }
