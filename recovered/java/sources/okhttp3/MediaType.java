            package okhttp3;

            import java.nio.charset.Charset;
            import java.util.ArrayList;
            import java.util.Locale;
            import java.util.regex.Matcher;
            import java.util.regex.Pattern;
            import kotlin.Metadata;
            import kotlin.jvm.internal.DefaultConstructorMarker;
            import kotlin.jvm.internal.Intrinsics;
            import kotlin.text.C1852e;
            import p000.C1951n4;
            import p000.ds0;
            import p000.k50;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            @Metadata(m6175d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B-\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\u0002\u0010\bJ\u0016\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fH\u0007J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0014\u001a\u00020\u0003J\r\u0010\u0005\u001a\u00020\u0003H\u0007¢\u0006\u0002\b\u0015J\b\u0010\u0016\u001a\u00020\u0003H\u0016J\r\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0002\b\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\tR\u0013\u0010\u0005\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\nR\u0013\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\n¨\u0006\u0019"}, m6176d2 = {"Lokhttp3/MediaType;", HttpUrl.FRAGMENT_ENCODE_SET, "mediaType", HttpUrl.FRAGMENT_ENCODE_SET, "type", "subtype", "parameterNamesAndValues", HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V", "[Ljava/lang/String;", "()Ljava/lang/String;", "charset", "Ljava/nio/charset/Charset;", "defaultValue", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "parameter", "name", "-deprecated_subtype", "toString", "-deprecated_type", "Companion", "okhttp"}, m6177k = 1, m6178mv = {1, 6, 0}, m6180xi = 48)
/* 2 */     public final class MediaType {
                private static final String QUOTED = "\"([^\"]*)\"";
                private static final String TOKEN = "([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)";
                private final String mediaType;
                private final String[] parameterNamesAndValues;
                private final String subtype;
                private final String type;

                /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE = new Companion(null);
                private static final Pattern TYPE_SUBTYPE = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");
                private static final Pattern PARAMETER = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

                private MediaType(String str, String str2, String str3, String[] strArr) {
/* 4 */             this.mediaType = str;
/* 6 */             this.type = str2;
/* 8 */             this.subtype = str3;
/* 10 */            this.parameterNamesAndValues = strArr;
                }

                public static /* synthetic */ Charset charset$default(MediaType mediaType, Charset charset, int i, Object obj) {
/* 3 */             if ((i & 1) != 0) {
/* 5 */                 charset = null;
                    }
/* 6 */             return mediaType.charset(charset);
                }

                public static final MediaType get(String str) {
/* 3 */             return INSTANCE.get(str);
                }

                public static final MediaType parse(String str) {
/* 3 */             return INSTANCE.parse(str);
                }

                /* JADX INFO: renamed from: -deprecated_subtype, reason: not valid java name and from getter */
                public final String getSubtype() {
/* 1 */             return this.subtype;
                }

                /* JADX INFO: renamed from: -deprecated_type, reason: not valid java name and from getter */
                public final String getType() {
/* 1 */             return this.type;
                }

                public final Charset charset(Charset defaultValue) {
/* 3 */             String strParameter = parameter("charset");
/* 7 */             if (strParameter == null) {
/* 9 */                 return defaultValue;
                    }
                    try {
/* 10 */                return Charset.forName(strParameter);
                    } catch (IllegalArgumentException unused) {
/* 15 */                return defaultValue;
                    }
                }

                public boolean equals(Object other) {
                    return (other instanceof MediaType) && Intrinsics.m6216a(((MediaType) other).mediaType, this.mediaType);
                }

                public int hashCode() {
/* 3 */             return this.mediaType.hashCode();
                }

                public final String parameter(String name) {
/* 1 */             name.getClass();
/* 10 */            int i = 0;
/* 11 */            int iM5985v = k50.m5985v(0, this.parameterNamesAndValues.length - 1, 2);
/* 15 */            if (iM5985v < 0) {
/* 41 */                return null;
                    }
                    while (true) {
/* 17 */                int i2 = i + 2;
/* 27 */                if (C1852e.m6258h(this.parameterNamesAndValues[i], name)) {
/* 33 */                    return this.parameterNamesAndValues[i + 1];
                        }
/* 36 */                if (i == iM5985v) {
/* 41 */                    return null;
                        }
/* 39 */                i = i2;
                    }
                }

                public final String subtype() {
/* 1 */             return this.subtype;
                }

                /* JADX INFO: renamed from: toString, reason: from getter */
                public String getMediaType() {
/* 1 */             return this.mediaType;
                }

                public final String type() {
/* 1 */             return this.type;
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0015\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0007H\u0007¢\u0006\u0002\b\rJ\u0017\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\u0007H\u0007¢\u0006\u0002\b\u000fJ\u0011\u0010\u0010\u001a\u00020\u000b*\u00020\u0007H\u0007¢\u0006\u0002\b\nJ\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u000b*\u00020\u0007H\u0007¢\u0006\u0002\b\u000eR\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m6176d2 = {"Lokhttp3/MediaType$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, "()V", "PARAMETER", "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "QUOTED", HttpUrl.FRAGMENT_ENCODE_SET, "TOKEN", "TYPE_SUBTYPE", "get", "Lokhttp3/MediaType;", "mediaType", "-deprecated_get", "parse", "-deprecated_parse", "toMediaType", "toMediaTypeOrNull", "okhttp"}, m6177k = 1, m6178mv = {1, 6, 0}, m6180xi = 48)
/* 3 */         public static final class Companion {
                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
/* 1 */                 this();
                    }

                    /* JADX INFO: renamed from: -deprecated_get, reason: not valid java name */
                    public final MediaType m10576deprecated_get(String mediaType) {
/* 1 */                 mediaType.getClass();
/* 4 */                 return get(mediaType);
                    }

                    /* JADX INFO: renamed from: -deprecated_parse, reason: not valid java name */
                    public final MediaType m10577deprecated_parse(String mediaType) {
/* 1 */                 mediaType.getClass();
/* 4 */                 return parse(mediaType);
                    }

                    public final MediaType get(String str) {
/* 1 */                 str.getClass();
/* 8 */                 Matcher matcher = MediaType.TYPE_SUBTYPE.matcher(str);
/* 17 */                if (!matcher.lookingAt()) {
/* 223 */                   ds0.m3193j(str, "No subtype found for: \"");
/* 16 */                    return null;
                        }
/* 20 */                String strGroup = matcher.group(1);
/* 24 */                strGroup.getClass();
/* 27 */                Locale locale = Locale.US;
/* 29 */                locale.getClass();
/* 32 */                String lowerCase = strGroup.toLowerCase(locale);
/* 36 */                lowerCase.getClass();
/* 40 */                String strGroup2 = matcher.group(2);
/* 44 */                strGroup2.getClass();
/* 47 */                String lowerCase2 = strGroup2.toLowerCase(locale);
/* 51 */                lowerCase2.getClass();
/* 56 */                ArrayList arrayList = new ArrayList();
/* 63 */                Matcher matcher2 = MediaType.PARAMETER.matcher(str);
/* 67 */                int iEnd = matcher.end();
/* 76 */                while (iEnd < str.length()) {
/* 82 */                    matcher2.region(iEnd, str.length());
/* 89 */                    if (!matcher2.lookingAt()) {
/* 194 */                       throw new IllegalArgumentException(("Parameter is not formatted correctly: \"" + str.substring(iEnd) + "\" for: \"" + str + '\"').toString());
                            }
/* 91 */                    String strGroup3 = matcher2.group(1);
/* 95 */                    if (strGroup3 == null) {
/* 97 */                        iEnd = matcher2.end();
                            } else {
/* 102 */                       String strGroup4 = matcher2.group(2);
/* 106 */                       if (strGroup4 == null) {
/* 109 */                           strGroup4 = matcher2.group(3);
                                } else if (C1852e.m6263m(strGroup4, "'", false) && C1852e.m6257g(strGroup4, "'", false) && strGroup4.length() > 2) {
/* 139 */                           strGroup4 = strGroup4.substring(1, strGroup4.length() - 1);
                                }
/* 143 */                       arrayList.add(strGroup3);
/* 146 */                       arrayList.add(strGroup4);
/* 149 */                       iEnd = matcher2.end();
                            }
                        }
/* 199 */               Object[] array = arrayList.toArray(new String[0]);
/* 203 */               if (array != null) {
/* 210 */                   return new MediaType(str, lowerCase, lowerCase2, (String[]) array, null);
                        }
/* 216 */               C1951n4.m6868s("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
/* 16 */                return null;
                    }

                    public final MediaType parse(String str) {
/* 1 */                 str.getClass();
                        try {
/* 4 */                     return get(str);
                        } catch (IllegalArgumentException unused) {
/* 9 */                     return null;
                        }
                    }

/* 4 */             private Companion() {
                    }
                }

/* 12 */        public /* synthetic */ MediaType(String str, String str2, String str3, String[] strArr, DefaultConstructorMarker defaultConstructorMarker) {
/* 13 */            this(str, str2, str3, strArr);
                }

/* 15 */        public final Charset charset() {
/* 16 */            return charset$default(this, null, 1, null);
                }
            }
