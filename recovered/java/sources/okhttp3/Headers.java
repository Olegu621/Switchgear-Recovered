            package okhttp3;

            import com.google.firebase.analytics.FirebaseAnalytics;
            import java.time.Instant;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.Collections;
            import java.util.Comparator;
            import java.util.Date;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Locale;
            import java.util.Map;
            import java.util.Set;
            import java.util.TreeMap;
            import java.util.TreeSet;
            import kotlin.Metadata;
            import kotlin.Pair;
            import kotlin.jvm.internal.DefaultConstructorMarker;
            import kotlin.jvm.internal.Intrinsics;
            import kotlin.text.C1852e;
            import kotlin.text.StringsKt;
            import okhttp3.internal.Util;
            import okhttp3.internal.http.DatesKt;
            import p000.C1951n4;
            import p000.C2126r;
            import p000.C2270uw;
            import p000.ds0;
            import p000.k50;
            import p000.nd0;
            import p000.r21;
            import p000.rh2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            @Metadata(m6175d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010 \n\u0002\b\u0006\u0018\u0000 '2\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00020\u0001:\u0002&'B\u0015\b\u0002\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\u000b\u001a\u00020\fJ\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0096\u0002J\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0012\u001a\u00020\u0003H\u0086\u0002J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0012\u001a\u00020\u0003J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0012\u001a\u00020\u0003H\u0007J\b\u0010\u0017\u001a\u00020\tH\u0016J\u001b\u0010\u0018\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00020\u0019H\u0096\u0002J\u000e\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\tJ\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\u001cJ\u0006\u0010\u001d\u001a\u00020\u001eJ\r\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\b\u001fJ\u0018\u0010 \u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\"0!J\b\u0010#\u001a\u00020\u0003H\u0016J\u000e\u0010$\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\tJ\u0014\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00030\"2\u0006\u0010\u0012\u001a\u00020\u0003R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0007R\u0011\u0010\b\u001a\u00020\t8G¢\u0006\u0006\u001a\u0004\b\b\u0010\n¨\u0006("}, m6176d2 = {"Lokhttp3/Headers;", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlin/Pair;", HttpUrl.FRAGMENT_ENCODE_SET, "namesAndValues", HttpUrl.FRAGMENT_ENCODE_SET, "([Ljava/lang/String;)V", "[Ljava/lang/String;", "size", HttpUrl.FRAGMENT_ENCODE_SET, "()I", "byteCount", HttpUrl.FRAGMENT_ENCODE_SET, "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", HttpUrl.FRAGMENT_ENCODE_SET, "get", "name", "getDate", "Ljava/util/Date;", "getInstant", "Ljava/time/Instant;", "hashCode", "iterator", HttpUrl.FRAGMENT_ENCODE_SET, FirebaseAnalytics.Param.INDEX, "names", HttpUrl.FRAGMENT_ENCODE_SET, "newBuilder", "Lokhttp3/Headers$Builder;", "-deprecated_size", "toMultimap", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "toString", FirebaseAnalytics.Param.VALUE, "values", "Builder", "Companion", "okhttp"}, m6177k = 1, m6178mv = {1, 6, 0}, m6180xi = 48)
/* 2 */     public final class Headers implements Iterable<Pair<? extends String, ? extends String>>, r21 {

                /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE = new Companion(null);
                private final String[] namesAndValues;

                private Headers(String[] strArr) {
/* 4 */             this.namesAndValues = strArr;
                }

                /* JADX INFO: renamed from: of */
                public static final Headers m7192of(Map<String, String> map) {
/* 3 */             return INSTANCE.m7194of(map);
                }

                /* JADX INFO: renamed from: -deprecated_size, reason: not valid java name */
                public final int m10548deprecated_size() {
/* 1 */             return size();
                }

                public final long byteCount() {
/* 1 */             String[] strArr = this.namesAndValues;
/* 4 */             long length = strArr.length * 2;
/* 7 */             int length2 = strArr.length;
/* 9 */             for (int i = 0; i < length2; i++) {
/* 22 */                length += (long) this.namesAndValues[i].length();
                    }
/* 25 */            return length;
                }

                public boolean equals(Object other) {
                    return (other instanceof Headers) && Arrays.equals(this.namesAndValues, ((Headers) other).namesAndValues);
                }

                public final String get(String name) {
/* 1 */             name.getClass();
/* 1 */             return INSTANCE.get(this.namesAndValues, name);
                }

                public final Date getDate(String name) {
/* 1 */             name.getClass();
/* 4 */             String str = get(name);
/* 8 */             if (str == null) {
/* 10 */                return null;
                    }
/* 12 */            return DatesKt.toHttpDateOrNull(str);
                }

                public final Instant getInstant(String name) {
/* 1 */             name.getClass();
/* 4 */             Date date = getDate(name);
/* 8 */             if (date == null) {
/* 10 */                return null;
                    }
/* 1 */             return date.toInstant();
                }

                public int hashCode() {
/* 3 */             return Arrays.hashCode(this.namesAndValues);
                }

                @Override // java.lang.Iterable
                public Iterator<Pair<? extends String, ? extends String>> iterator() {
/* 1 */             int size = size();
/* 5 */             Pair[] pairArr = new Pair[size];
/* 8 */             for (int i = 0; i < size; i++) {
/* 23 */                pairArr[i] = new Pair(name(i), value(i));
                    }
/* 30 */            return new C2126r(pairArr);
                }

                public final String name(int index) {
/* 5 */             return this.namesAndValues[index * 2];
                }

                public final Set<String> names() {
/* 5 */             rh2.f16075a.getClass();
/* 8 */             Comparator comparator = String.CASE_INSENSITIVE_ORDER;
/* 10 */            comparator.getClass();
/* 13 */            TreeSet treeSet = new TreeSet(comparator);
/* 16 */            int size = size();
/* 21 */            for (int i = 0; i < size; i++) {
/* 29 */                treeSet.add(name(i));
                    }
/* 34 */            Set<String> setUnmodifiableSet = Collections.unmodifiableSet(treeSet);
/* 38 */            setUnmodifiableSet.getClass();
/* 41 */            return setUnmodifiableSet;
                }

                public final Builder newBuilder() {
/* 3 */             Builder builder = new Builder();
/* 12 */            C2270uw.m9141l(builder.getNamesAndValues$okhttp(), this.namesAndValues);
/* 15 */            return builder;
                }

                public final int size() {
/* 4 */             return this.namesAndValues.length / 2;
                }

                public final Map<String, List<String>> toMultimap() {
/* 5 */             rh2.f16075a.getClass();
/* 8 */             Comparator comparator = String.CASE_INSENSITIVE_ORDER;
/* 10 */            comparator.getClass();
/* 13 */            TreeMap treeMap = new TreeMap(comparator);
/* 16 */            int size = size();
/* 20 */            int i = 0;
/* 21 */            while (i < size) {
/* 23 */                int i2 = i + 1;
/* 25 */                String strName = name(i);
/* 29 */                Locale locale = Locale.US;
/* 31 */                locale.getClass();
/* 34 */                String lowerCase = strName.toLowerCase(locale);
/* 38 */                lowerCase.getClass();
/* 45 */                List arrayList = (List) treeMap.get(lowerCase);
/* 47 */                if (arrayList == null) {
/* 52 */                    arrayList = new ArrayList(2);
/* 55 */                    treeMap.put(lowerCase, arrayList);
                        }
/* 62 */                arrayList.add(value(i));
/* 65 */                i = i2;
                    }
/* 67 */            return treeMap;
                }

                public String toString() {
/* 3 */             StringBuilder sb = new StringBuilder();
/* 6 */             int size = size();
/* 10 */            int i = 0;
/* 11 */            while (i < size) {
/* 13 */                int i2 = i + 1;
/* 15 */                String strName = name(i);
/* 19 */                String strValue = value(i);
/* 23 */                sb.append(strName);
/* 28 */                sb.append(": ");
/* 35 */                if (Util.isSensitiveHeader(strName)) {
/* 37 */                    strValue = "██";
                        }
/* 39 */                sb.append(strValue);
/* 44 */                sb.append("\n");
/* 47 */                i = i2;
                    }
/* 49 */            return sb.toString();
                }

                public final String value(int index) {
/* 7 */             return this.namesAndValues[(index * 2) + 1];
                }

                public final List<String> values(String name) {
/* 1 */             name.getClass();
/* 4 */             int size = size();
/* 8 */             ArrayList arrayList = null;
/* 9 */             int i = 0;
/* 10 */            while (i < size) {
/* 12 */                int i2 = i + 1;
/* 22 */                if (name.equalsIgnoreCase(name(i))) {
/* 24 */                    if (arrayList == null) {
/* 29 */                        arrayList = new ArrayList(2);
                            }
/* 36 */                    arrayList.add(value(i));
                        }
/* 39 */                i = i2;
                    }
/* 41 */            if (arrayList == null) {
/* 51 */                return nd0.f14189a;
                    }
/* 43 */            List<String> listUnmodifiableList = Collections.unmodifiableList(arrayList);
/* 47 */            listUnmodifiableList.getClass();
/* 50 */            return listUnmodifiableList;
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0018\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J%\u0010\t\u001a\u0004\u0018\u00010\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0002¢\u0006\u0002\u0010\fJ#\u0010\r\u001a\u00020\u000e2\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u000b\"\u00020\u0006H\u0007¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u000b\"\u00020\u0006H\u0007¢\u0006\u0004\b\u0011\u0010\u0010J!\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0013H\u0007¢\u0006\u0002\b\u0011J\u001d\u0010\u0014\u001a\u00020\u000e*\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0013H\u0007¢\u0006\u0002\b\u000f¨\u0006\u0015"}, m6176d2 = {"Lokhttp3/Headers$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, "()V", "checkName", HttpUrl.FRAGMENT_ENCODE_SET, "name", HttpUrl.FRAGMENT_ENCODE_SET, "checkValue", FirebaseAnalytics.Param.VALUE, "get", "namesAndValues", HttpUrl.FRAGMENT_ENCODE_SET, "([Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "headersOf", "Lokhttp3/Headers;", "of", "([Ljava/lang/String;)Lokhttp3/Headers;", "-deprecated_of", "headers", HttpUrl.FRAGMENT_ENCODE_SET, "toHeaders", "okhttp"}, m6177k = 1, m6178mv = {1, 6, 0}, m6180xi = 48)
/* 3 */         public static final class Companion {
                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
/* 1 */                 this();
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public final void checkName(String name) {
/* 5 */                 if (name.length() <= 0) {
/* 54 */                    C1951n4.m6859j("name is empty");
/* 57 */                    return;
                        }
/* 7 */                 int length = name.length();
/* 11 */                int i = 0;
/* 12 */                while (i < length) {
/* 14 */                    int i2 = i + 1;
/* 16 */                    char cCharAt = name.charAt(i);
/* 22 */                    if ('!' > cCharAt || cCharAt >= 127) {
/* 48 */                        ds0.m3200q(Util.format("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(cCharAt), Integer.valueOf(i), name));
/* 51 */                        return;
                            }
/* 28 */                    i = i2;
                        }
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public final void checkValue(String value, String name) {
/* 1 */                 int length = value.length();
/* 5 */                 int i = 0;
/* 6 */                 while (i < length) {
/* 8 */                     int i2 = i + 1;
/* 10 */                    char cCharAt = value.charAt(i);
/* 16 */                    if (cCharAt != '\t' && (' ' > cCharAt || cCharAt >= 127)) {
/* 64 */                        ds0.m3200q(Intrinsics.m6219d(Util.isSensitiveHeader(name) ? HttpUrl.FRAGMENT_ENCODE_SET : Intrinsics.m6219d(value, ": "), Util.format("Unexpected char %#04x at %d in %s value", Integer.valueOf(cCharAt), Integer.valueOf(i), name)));
/* 67 */                        return;
                            }
/* 68 */                    i = i2;
                        }
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public final String get(String[] namesAndValues, String name) {
/* 2 */                 int length = namesAndValues.length - 2;
/* 6 */                 int iM5985v = k50.m5985v(length, 0, -2);
/* 10 */                if (iM5985v > length) {
/* 32 */                    return null;
                        }
                        while (true) {
/* 12 */                    int i = length - 2;
/* 20 */                    if (C1852e.m6258h(name, namesAndValues[length])) {
/* 24 */                        return namesAndValues[length + 1];
                            }
/* 27 */                    if (length == iM5985v) {
/* 32 */                        return null;
                            }
/* 30 */                    length = i;
                        }
                    }

                    /* JADX INFO: renamed from: -deprecated_of, reason: not valid java name */
                    public final Headers m10550deprecated_of(String... namesAndValues) {
/* 1 */                 namesAndValues.getClass();
/* 11 */                return m7195of((String[]) Arrays.copyOf(namesAndValues, namesAndValues.length));
                    }

                    /* JADX INFO: renamed from: of */
                    public final Headers m7195of(String... namesAndValues) {
/* 1 */                 namesAndValues.getClass();
/* 7 */                 DefaultConstructorMarker defaultConstructorMarker = null;
/* 8 */                 if (namesAndValues.length % 2 != 0) {
/* 81 */                    C1951n4.m6859j("Expected alternating header names and values");
/* 7 */                     return null;
                        }
/* 14 */                String[] strArr = (String[]) namesAndValues.clone();
/* 16 */                int length = strArr.length;
/* 17 */                int i = 0;
/* 18 */                int i2 = 0;
/* 19 */                while (i2 < length) {
/* 21 */                    int i3 = i2 + 1;
/* 23 */                    String str = strArr[i2];
/* 25 */                    if (str == null) {
/* 41 */                        C1951n4.m6859j("Headers cannot be null");
/* 7 */                         return null;
                            }
/* 35 */                    strArr[i2] = StringsKt.m6239O(str).toString();
/* 37 */                    i2 = i3;
                        }
/* 48 */                int iM5985v = k50.m5985v(0, strArr.length - 1, 2);
/* 52 */                if (iM5985v >= 0) {
                            while (true) {
/* 54 */                        int i4 = i + 2;
/* 56 */                        String str2 = strArr[i];
/* 60 */                        String str3 = strArr[i + 1];
/* 62 */                        checkName(str2);
/* 65 */                        checkValue(str3, str2);
/* 68 */                        if (i == iM5985v) {
                                    break;
                                }
/* 71 */                        i = i4;
                            }
                        }
/* 75 */                return new Headers(strArr, defaultConstructorMarker);
                    }

/* 4 */             private Companion() {
                    }

                    /* JADX INFO: renamed from: -deprecated_of, reason: not valid java name */
/* 15 */            public final Headers m10549deprecated_of(Map<String, String> headers) {
                        headers.getClass();
/* 16 */                return m7194of(headers);
                    }

                    /* JADX INFO: renamed from: of */
/* 84 */            public final Headers m7194of(Map<String, String> map) {
                        map.getClass();
/* 85 */                String[] strArr = new String[map.size() * 2];
                        int i = 0;
                        for (Map.Entry<String, String> entry : map.entrySet()) {
                            String key = entry.getKey();
                            String value = entry.getValue();
/* 87 */                    String string = StringsKt.m6239O(key).toString();
/* 88 */                    String string2 = StringsKt.m6239O(value).toString();
/* 89 */                    checkName(string);
/* 90 */                    checkValue(string2, string);
/* 91 */                    strArr[i] = string;
/* 92 */                    strArr[i + 1] = string2;
                            i += 2;
                        }
/* 93 */                return new Headers(strArr, null);
                    }
                }

/* 6 */         public /* synthetic */ Headers(String[] strArr, DefaultConstructorMarker defaultConstructorMarker) {
/* 7 */             this(strArr);
                }

                /* JADX INFO: renamed from: of */
/* 7 */         public static final Headers m7193of(String... strArr) {
/* 8 */             return INSTANCE.m7195of(strArr);
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0005J\u0018\u0010\b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\fH\u0007J\u0016\u0010\b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\rJ\u0016\u0010\b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0005J\u000e\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0010J\u0015\u0010\u0011\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0005H\u0000¢\u0006\u0002\b\u0012J\u001d\u0010\u0011\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0005H\u0000¢\u0006\u0002\b\u0012J\u0016\u0010\u0013\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0005J\u0006\u0010\u0014\u001a\u00020\u0010J\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u00052\u0006\u0010\n\u001a\u00020\u0005H\u0086\u0002J\u000e\u0010\u0016\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0005J\u0019\u0010\u0017\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\fH\u0087\u0002J\u0019\u0010\u0017\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\rH\u0086\u0002J\u0019\u0010\u0017\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0005H\u0086\u0002R\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, m6176d2 = {"Lokhttp3/Headers$Builder;", HttpUrl.FRAGMENT_ENCODE_SET, "()V", "namesAndValues", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "getNamesAndValues$okhttp", "()Ljava/util/List;", "add", "line", "name", FirebaseAnalytics.Param.VALUE, "Ljava/time/Instant;", "Ljava/util/Date;", "addAll", "headers", "Lokhttp3/Headers;", "addLenient", "addLenient$okhttp", "addUnsafeNonAscii", "build", "get", "removeAll", "set", "okhttp"}, m6177k = 1, m6178mv = {1, 6, 0}, m6180xi = 48)
/* 20 */        public static final class Builder {
                    private final List<String> namesAndValues = new ArrayList(20);

                    public final Builder add(String line) {
/* 1 */                 line.getClass();
/* 8 */                 int iM6226B = StringsKt.m6226B(line, ':', 0, 6);
/* 13 */                if (iM6226B != -1) {
/* 33 */                    add(StringsKt.m6239O(line.substring(0, iM6226B)).toString(), line.substring(iM6226B + 1));
/* 36 */                    return this;
                        }
/* 43 */                ds0.m3200q(Intrinsics.m6219d(line, "Unexpected header: "));
/* 46 */                return null;
                    }

                    public final Builder addAll(Headers headers) {
/* 1 */                 headers.getClass();
/* 4 */                 int size = headers.size();
/* 9 */                 for (int i = 0; i < size; i++) {
/* 21 */                    addLenient$okhttp(headers.name(i), headers.value(i));
                        }
/* 26 */                return this;
                    }

                    public final Builder addLenient$okhttp(String line) {
/* 1 */                 line.getClass();
/* 8 */                 int iM6226B = StringsKt.m6226B(line, ':', 1, 4);
/* 14 */                if (iM6226B != -1) {
/* 25 */                    addLenient$okhttp(line.substring(0, iM6226B), line.substring(iM6226B + 1));
/* 28 */                    return this;
                        }
/* 35 */                if (line.charAt(0) == ':') {
/* 41 */                    addLenient$okhttp(HttpUrl.FRAGMENT_ENCODE_SET, line.substring(1));
/* 44 */                    return this;
                        }
/* 45 */                addLenient$okhttp(HttpUrl.FRAGMENT_ENCODE_SET, line);
/* 48 */                return this;
                    }

                    public final Builder addUnsafeNonAscii(String name, String value) {
/* 1 */                 name.getClass();
/* 4 */                 value.getClass();
/* 1 */                 Headers.INSTANCE.checkName(name);
/* 12 */                addLenient$okhttp(name, value);
/* 15 */                return this;
                    }

                    public final Headers build() {
/* 8 */                 Object[] array = this.namesAndValues.toArray(new String[0]);
/* 12 */                DefaultConstructorMarker defaultConstructorMarker = null;
/* 13 */                if (array != null) {
/* 17 */                    return new Headers((String[]) array, defaultConstructorMarker);
                        }
/* 23 */                C1951n4.m6868s("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
/* 12 */                return null;
                    }

                    public final String get(String name) {
/* 1 */                 name.getClass();
/* 10 */                int size = this.namesAndValues.size() - 2;
/* 14 */                int iM5985v = k50.m5985v(size, 0, -2);
/* 18 */                if (iM5985v > size) {
/* 52 */                    return null;
                        }
                        while (true) {
/* 20 */                    int i = size - 2;
/* 34 */                    if (name.equalsIgnoreCase(this.namesAndValues.get(size))) {
/* 40 */                        return this.namesAndValues.get(size + 1);
                            }
/* 47 */                    if (size == iM5985v) {
/* 52 */                        return null;
                            }
/* 50 */                    size = i;
                        }
                    }

                    public final List<String> getNamesAndValues$okhttp() {
/* 1 */                 return this.namesAndValues;
                    }

                    public final Builder removeAll(String name) {
/* 1 */                 name.getClass();
/* 4 */                 int i = 0;
/* 13 */                while (i < getNamesAndValues$okhttp().size()) {
/* 29 */                    if (name.equalsIgnoreCase(getNamesAndValues$okhttp().get(i))) {
/* 35 */                        getNamesAndValues$okhttp().remove(i);
/* 42 */                        getNamesAndValues$okhttp().remove(i);
/* 45 */                        i -= 2;
                            }
/* 47 */                    i += 2;
                        }
/* 50 */                return this;
                    }

                    public final Builder set(String name, String value) {
/* 1 */                 name.getClass();
/* 4 */                 value.getClass();
/* 7 */                 Companion companion = Headers.INSTANCE;
/* 1 */                 companion.checkName(name);
/* 1 */                 companion.checkValue(value, name);
/* 15 */                removeAll(name);
/* 18 */                addLenient$okhttp(name, value);
/* 21 */                return this;
                    }

/* 21 */            public final Builder set(String name, Instant value) {
                        name.getClass();
                        value.getClass();
/* 22 */                return set(name, new Date(value.toEpochMilli()));
                    }

/* 22 */            public final Builder set(String name, Date value) {
                        name.getClass();
                        value.getClass();
/* 23 */                set(name, DatesKt.toHttpDateString(value));
                        return this;
                    }

/* 47 */            public final Builder add(String name, String value) {
                        name.getClass();
                        value.getClass();
/* 48 */                Companion companion = Headers.INSTANCE;
/* 1 */                 companion.checkName(name);
/* 1 */                 companion.checkValue(value, name);
/* 50 */                addLenient$okhttp(name, value);
                        return this;
                    }

/* 48 */            public final Builder addLenient$okhttp(String name, String value) {
                        name.getClass();
                        value.getClass();
/* 49 */                getNamesAndValues$okhttp().add(name);
/* 50 */                getNamesAndValues$okhttp().add(StringsKt.m6239O(value).toString());
                        return this;
                    }

/* 50 */            public final Builder add(String name, Date value) {
                        name.getClass();
                        value.getClass();
/* 51 */                add(name, DatesKt.toHttpDateString(value));
                        return this;
                    }

/* 51 */            public final Builder add(String name, Instant value) {
                        name.getClass();
                        value.getClass();
/* 52 */                add(name, new Date(value.toEpochMilli()));
                        return this;
                    }
                }
            }
