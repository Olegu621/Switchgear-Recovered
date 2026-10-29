            package okhttp3;

            import io.flutter.plugin.editing.SpellCheckPlugin;
            import java.util.concurrent.TimeUnit;
            import kotlin.Metadata;
            import kotlin.jvm.internal.DefaultConstructorMarker;
            import kotlin.jvm.internal.Intrinsics;
            import kotlin.text.C1852e;
            import kotlin.text.StringsKt;
            import okhttp3.internal.Util;
            import p000.AbstractC0208c9;
            import p000.ds0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            @Metadata(m6175d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0011\u0018\u0000 !2\u00020\u0001:\u0002 !Bq\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0002\u0010\u0012J\r\u0010\u000f\u001a\u00020\u0003H\u0007¢\u0006\u0002\b\u0015J\r\u0010\u0005\u001a\u00020\u0006H\u0007¢\u0006\u0002\b\u0016J\r\u0010\u000b\u001a\u00020\u0006H\u0007¢\u0006\u0002\b\u0017J\r\u0010\f\u001a\u00020\u0006H\u0007¢\u0006\u0002\b\u0018J\r\u0010\n\u001a\u00020\u0003H\u0007¢\u0006\u0002\b\u0019J\r\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\b\u001aJ\r\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0002\b\u001bJ\r\u0010\u000e\u001a\u00020\u0003H\u0007¢\u0006\u0002\b\u001cJ\r\u0010\r\u001a\u00020\u0003H\u0007¢\u0006\u0002\b\u001dJ\r\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0002\b\u001eJ\b\u0010\u001f\u001a\u00020\u0011H\u0016R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0013\u0010\u000f\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0013R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0013R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0013R\u0013\u0010\u0005\u001a\u00020\u00068\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0014R\u0013\u0010\u000b\u001a\u00020\u00068\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0014R\u0013\u0010\f\u001a\u00020\u00068\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0014R\u0013\u0010\n\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0013R\u0013\u0010\u0002\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0013R\u0013\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0013R\u0013\u0010\u000e\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0013R\u0013\u0010\r\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0013R\u0013\u0010\u0007\u001a\u00020\u00068\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0014¨\u0006\""}, m6176d2 = {"Lokhttp3/CacheControl;", HttpUrl.FRAGMENT_ENCODE_SET, "noCache", HttpUrl.FRAGMENT_ENCODE_SET, "noStore", "maxAgeSeconds", HttpUrl.FRAGMENT_ENCODE_SET, "sMaxAgeSeconds", "isPrivate", "isPublic", "mustRevalidate", "maxStaleSeconds", "minFreshSeconds", "onlyIfCached", "noTransform", "immutable", "headerValue", HttpUrl.FRAGMENT_ENCODE_SET, "(ZZIIZZZIIZZZLjava/lang/String;)V", "()Z", "()I", "-deprecated_immutable", "-deprecated_maxAgeSeconds", "-deprecated_maxStaleSeconds", "-deprecated_minFreshSeconds", "-deprecated_mustRevalidate", "-deprecated_noCache", "-deprecated_noStore", "-deprecated_noTransform", "-deprecated_onlyIfCached", "-deprecated_sMaxAgeSeconds", "toString", "Builder", "Companion", "okhttp"}, m6177k = 1, m6178mv = {1, 6, 0}, m6180xi = 48)
/* 2 */     public final class CacheControl {
                private String headerValue;
                private final boolean immutable;
                private final boolean isPrivate;
                private final boolean isPublic;
                private final int maxAgeSeconds;
                private final int maxStaleSeconds;
                private final int minFreshSeconds;
                private final boolean mustRevalidate;
                private final boolean noCache;
                private final boolean noStore;
                private final boolean noTransform;
                private final boolean onlyIfCached;
                private final int sMaxAgeSeconds;

                /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE = new Companion(null);
                public static final CacheControl FORCE_NETWORK = new Builder().noCache().build();
                public static final CacheControl FORCE_CACHE = new Builder().onlyIfCached().maxStale(AbstractC0208c9.API_PRIORITY_OTHER, TimeUnit.SECONDS).build();

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\r\u001a\u00020\u000eJ\u0006\u0010\u0003\u001a\u00020\u0000J\u0016\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0011J\u0016\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0011J\u0016\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0011J\u0006\u0010\t\u001a\u00020\u0000J\u0006\u0010\n\u001a\u00020\u0000J\u0006\u0010\u000b\u001a\u00020\u0000J\u0006\u0010\f\u001a\u00020\u0000J\f\u0010\u0014\u001a\u00020\u0006*\u00020\u0015H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m6176d2 = {"Lokhttp3/CacheControl$Builder;", HttpUrl.FRAGMENT_ENCODE_SET, "()V", "immutable", HttpUrl.FRAGMENT_ENCODE_SET, "maxAgeSeconds", HttpUrl.FRAGMENT_ENCODE_SET, "maxStaleSeconds", "minFreshSeconds", "noCache", "noStore", "noTransform", "onlyIfCached", "build", "Lokhttp3/CacheControl;", "maxAge", "timeUnit", "Ljava/util/concurrent/TimeUnit;", "maxStale", "minFresh", "clampToInt", HttpUrl.FRAGMENT_ENCODE_SET, "okhttp"}, m6177k = 1, m6178mv = {1, 6, 0}, m6180xi = 48)
                public static final class Builder {
                    private boolean immutable;
                    private int maxAgeSeconds = -1;
                    private int maxStaleSeconds = -1;
                    private int minFreshSeconds = -1;
                    private boolean noCache;
                    private boolean noStore;
                    private boolean noTransform;
                    private boolean onlyIfCached;

                    private final int clampToInt(long j) {
                        return j > 2147483647L ? AbstractC0208c9.API_PRIORITY_OTHER : (int) j;
                    }

                    public final CacheControl build() {
/* 25 */                return new CacheControl(this.noCache, this.noStore, this.maxAgeSeconds, -1, false, false, false, this.maxStaleSeconds, this.minFreshSeconds, this.onlyIfCached, this.noTransform, this.immutable, null, null);
                    }

                    public final Builder immutable() {
/* 2 */                 this.immutable = true;
/* 4 */                 return this;
                    }

                    public final Builder maxAge(int maxAge, TimeUnit timeUnit) {
/* 1 */                 timeUnit.getClass();
/* 4 */                 if (maxAge >= 0) {
/* 15 */                    this.maxAgeSeconds = clampToInt(timeUnit.toSeconds(maxAge));
/* 17 */                    return this;
                        }
/* 28 */                ds0.m3200q(Intrinsics.m6219d(Integer.valueOf(maxAge), "maxAge < 0: "));
/* 31 */                return null;
                    }

                    public final Builder maxStale(int maxStale, TimeUnit timeUnit) {
/* 1 */                 timeUnit.getClass();
/* 4 */                 if (maxStale >= 0) {
/* 15 */                    this.maxStaleSeconds = clampToInt(timeUnit.toSeconds(maxStale));
/* 17 */                    return this;
                        }
/* 28 */                ds0.m3200q(Intrinsics.m6219d(Integer.valueOf(maxStale), "maxStale < 0: "));
/* 31 */                return null;
                    }

                    public final Builder minFresh(int minFresh, TimeUnit timeUnit) {
/* 1 */                 timeUnit.getClass();
/* 4 */                 if (minFresh >= 0) {
/* 15 */                    this.minFreshSeconds = clampToInt(timeUnit.toSeconds(minFresh));
/* 17 */                    return this;
                        }
/* 28 */                ds0.m3200q(Intrinsics.m6219d(Integer.valueOf(minFresh), "minFresh < 0: "));
/* 31 */                return null;
                    }

                    public final Builder noCache() {
/* 2 */                 this.noCache = true;
/* 4 */                 return this;
                    }

                    public final Builder noStore() {
/* 2 */                 this.noStore = true;
/* 4 */                 return this;
                    }

                    public final Builder noTransform() {
/* 2 */                 this.noTransform = true;
/* 4 */                 return this;
                    }

                    public final Builder onlyIfCached() {
/* 2 */                 this.onlyIfCached = true;
/* 4 */                 return this;
                    }
                }

                private CacheControl(boolean z, boolean z2, int i, int i2, boolean z3, boolean z4, boolean z5, int i3, int i4, boolean z6, boolean z7, boolean z8, String str) {
/* 4 */             this.noCache = z;
/* 6 */             this.noStore = z2;
/* 8 */             this.maxAgeSeconds = i;
/* 10 */            this.sMaxAgeSeconds = i2;
/* 12 */            this.isPrivate = z3;
/* 14 */            this.isPublic = z4;
/* 16 */            this.mustRevalidate = z5;
/* 18 */            this.maxStaleSeconds = i3;
/* 20 */            this.minFreshSeconds = i4;
/* 22 */            this.onlyIfCached = z6;
/* 24 */            this.noTransform = z7;
/* 26 */            this.immutable = z8;
/* 28 */            this.headerValue = str;
                }

                public static final CacheControl parse(Headers headers) {
/* 3 */             return INSTANCE.parse(headers);
                }

                /* JADX INFO: renamed from: -deprecated_immutable, reason: not valid java name and from getter */
                public final boolean getImmutable() {
/* 1 */             return this.immutable;
                }

                /* JADX INFO: renamed from: -deprecated_maxAgeSeconds, reason: not valid java name and from getter */
                public final int getMaxAgeSeconds() {
/* 1 */             return this.maxAgeSeconds;
                }

                /* JADX INFO: renamed from: -deprecated_maxStaleSeconds, reason: not valid java name and from getter */
                public final int getMaxStaleSeconds() {
/* 1 */             return this.maxStaleSeconds;
                }

                /* JADX INFO: renamed from: -deprecated_minFreshSeconds, reason: not valid java name and from getter */
                public final int getMinFreshSeconds() {
/* 1 */             return this.minFreshSeconds;
                }

                /* JADX INFO: renamed from: -deprecated_mustRevalidate, reason: not valid java name and from getter */
                public final boolean getMustRevalidate() {
/* 1 */             return this.mustRevalidate;
                }

                /* JADX INFO: renamed from: -deprecated_noCache, reason: not valid java name and from getter */
                public final boolean getNoCache() {
/* 1 */             return this.noCache;
                }

                /* JADX INFO: renamed from: -deprecated_noStore, reason: not valid java name and from getter */
                public final boolean getNoStore() {
/* 1 */             return this.noStore;
                }

                /* JADX INFO: renamed from: -deprecated_noTransform, reason: not valid java name and from getter */
                public final boolean getNoTransform() {
/* 1 */             return this.noTransform;
                }

                /* JADX INFO: renamed from: -deprecated_onlyIfCached, reason: not valid java name and from getter */
                public final boolean getOnlyIfCached() {
/* 1 */             return this.onlyIfCached;
                }

                /* JADX INFO: renamed from: -deprecated_sMaxAgeSeconds, reason: not valid java name and from getter */
                public final int getSMaxAgeSeconds() {
/* 1 */             return this.sMaxAgeSeconds;
                }

                public final boolean immutable() {
/* 1 */             return this.immutable;
                }

                /* JADX INFO: renamed from: isPrivate, reason: from getter */
                public final boolean getIsPrivate() {
/* 1 */             return this.isPrivate;
                }

                /* JADX INFO: renamed from: isPublic, reason: from getter */
                public final boolean getIsPublic() {
/* 1 */             return this.isPublic;
                }

                public final int maxAgeSeconds() {
/* 1 */             return this.maxAgeSeconds;
                }

                public final int maxStaleSeconds() {
/* 1 */             return this.maxStaleSeconds;
                }

                public final int minFreshSeconds() {
/* 1 */             return this.minFreshSeconds;
                }

                public final boolean mustRevalidate() {
/* 1 */             return this.mustRevalidate;
                }

                public final boolean noCache() {
/* 1 */             return this.noCache;
                }

                public final boolean noStore() {
/* 1 */             return this.noStore;
                }

                public final boolean noTransform() {
/* 1 */             return this.noTransform;
                }

                public final boolean onlyIfCached() {
/* 1 */             return this.onlyIfCached;
                }

                public final int sMaxAgeSeconds() {
/* 1 */             return this.sMaxAgeSeconds;
                }

                public String toString() {
/* 1 */             String str = this.headerValue;
/* 3 */             if (str != null) {
/* 213 */               return str;
                    }
/* 7 */             StringBuilder sb = new StringBuilder();
/* 14 */            if (noCache()) {
/* 18 */                sb.append("no-cache, ");
                    }
/* 25 */            if (noStore()) {
/* 29 */                sb.append("no-store, ");
                    }
/* 39 */            if (maxAgeSeconds() != -1) {
/* 43 */                sb.append("max-age=");
/* 50 */                sb.append(maxAgeSeconds());
/* 53 */                sb.append(", ");
                    }
/* 60 */            if (sMaxAgeSeconds() != -1) {
/* 64 */                sb.append("s-maxage=");
/* 71 */                sb.append(sMaxAgeSeconds());
/* 74 */                sb.append(", ");
                    }
/* 81 */            if (getIsPrivate()) {
/* 85 */                sb.append("private, ");
                    }
/* 92 */            if (getIsPublic()) {
/* 96 */                sb.append("public, ");
                    }
/* 103 */           if (mustRevalidate()) {
/* 107 */               sb.append("must-revalidate, ");
                    }
/* 114 */           if (maxStaleSeconds() != -1) {
/* 118 */               sb.append("max-stale=");
/* 125 */               sb.append(maxStaleSeconds());
/* 128 */               sb.append(", ");
                    }
/* 135 */           if (minFreshSeconds() != -1) {
/* 139 */               sb.append("min-fresh=");
/* 146 */               sb.append(minFreshSeconds());
/* 149 */               sb.append(", ");
                    }
/* 156 */           if (onlyIfCached()) {
/* 160 */               sb.append("only-if-cached, ");
                    }
/* 167 */           if (noTransform()) {
/* 171 */               sb.append("no-transform, ");
                    }
/* 178 */           if (immutable()) {
/* 182 */               sb.append("immutable, ");
                    }
/* 189 */           if (sb.length() == 0) {
/* 191 */               return HttpUrl.FRAGMENT_ENCODE_SET;
                    }
/* 204 */           sb.delete(sb.length() - 2, sb.length());
/* 207 */           String string = sb.toString();
/* 211 */           this.headerValue = string;
/* 213 */           return string;
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u001e\u0010\t\u001a\u00020\n*\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\nH\u0002R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m6176d2 = {"Lokhttp3/CacheControl$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, "()V", "FORCE_CACHE", "Lokhttp3/CacheControl;", "FORCE_NETWORK", "parse", "headers", "Lokhttp3/Headers;", "indexOfElement", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "characters", SpellCheckPlugin.START_INDEX_KEY, "okhttp"}, m6177k = 1, m6178mv = {1, 6, 0}, m6180xi = 48)
/* 3 */         public static final class Companion {
                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
/* 1 */                 this();
                    }

                    private final int indexOfElement(String str, String str2, int i) {
/* 1 */                 int length = str.length();
/* 5 */                 while (i < length) {
/* 7 */                     int i2 = i + 1;
/* 17 */                    if (StringsKt.m6225A(str2, str.charAt(i))) {
/* 19 */                        return i;
                            }
/* 20 */                    i = i2;
                        }
/* 22 */                return str.length();
                    }

                    public static /* synthetic */ int indexOfElement$default(Companion companion, String str, String str2, int i, int i2, Object obj) {
/* 3 */                 if ((i2 & 2) != 0) {
/* 5 */                     i = 0;
                        }
/* 6 */                 return companion.indexOfElement(str, str2, i);
                    }

                    /* JADX WARN: Code duplicated, block: B:15:0x004c  */
                    /* JADX WARN: Code duplicated, block: B:28:0x00aa  */
                    /* JADX WARN: Code duplicated, block: B:39:0x00d5  */
                    /* JADX WARN: Code duplicated, block: B:42:0x00e3  */
                    /* JADX WARN: Code duplicated, block: B:54:0x011a  */
                    /* JADX WARN: Code duplicated, block: B:57:0x0128  */
                    /* JADX WARN: Code duplicated, block: B:75:0x00b9 A[SYNTHETIC] */
                    /* JADX WARN: Code duplicated, block: B:76:0x00c5 A[SYNTHETIC] */
                    /* JADX WARN: Code duplicated, block: B:77:0x00b5 A[SYNTHETIC] */
                    /* JADX WARN: Code duplicated, block: B:78:0x014b A[SYNTHETIC] */
                    /* JADX WARN: Code duplicated, block: B:79:0x00c1 A[SYNTHETIC] */
                    /* JADX WARN: Code duplicated, block: B:80:0x00eb A[SYNTHETIC] */
                    /* JADX WARN: Code duplicated, block: B:81:0x00f8 A[SYNTHETIC] */
                    /* JADX WARN: Code duplicated, block: B:82:0x0105 A[SYNTHETIC] */
                    /* JADX WARN: Code duplicated, block: B:83:0x0131 A[SYNTHETIC] */
                    /* JADX WARN: Code duplicated, block: B:84:0x013e A[SYNTHETIC] */
                    /* JADX WARN: Code duplicated, block: B:85:0x00d2 A[SYNTHETIC] */
                    /* JADX WARN: Code duplicated, block: B:86:0x00cd A[SYNTHETIC] */
                    /* JADX WARN: Code duplicated, block: B:87:0x00dd A[SYNTHETIC] */
                    /* JADX WARN: Code duplicated, block: B:88:0x0112 A[SYNTHETIC] */
                    /* JADX WARN: Code duplicated, block: B:89:0x0122 A[SYNTHETIC] */
                    /* JADX WARN: Code duplicated, block: B:90:0x0143 A[SYNTHETIC] */
                    /* JADX WARN: Code duplicated, block: B:91:0x0136 A[SYNTHETIC] */
                    /* JADX WARN: Code duplicated, block: B:92:0x010a A[SYNTHETIC] */
                    /* JADX WARN: Code duplicated, block: B:93:0x00fd A[SYNTHETIC] */
                    /* JADX WARN: Code duplicated, block: B:94:0x00f0 A[SYNTHETIC] */
                    public final CacheControl parse(Headers headers) {
                        int iIndexOfElement;
                        int iIndexOfElement2;
                        String string;
                        String string2;
/* 5 */                 headers.getClass();
/* 8 */                 int size = headers.size();
/* 12 */                int i = 0;
/* 13 */                boolean z = true;
/* 14 */                String str = null;
/* 15 */                boolean z2 = false;
/* 16 */                boolean z3 = false;
/* 17 */                int nonNegativeInt = -1;
/* 18 */                int nonNegativeInt2 = -1;
/* 19 */                boolean z4 = false;
/* 20 */                boolean z5 = false;
/* 21 */                boolean z6 = false;
/* 23 */                int nonNegativeInt3 = -1;
/* 25 */                int nonNegativeInt4 = -1;
/* 27 */                boolean z7 = false;
/* 29 */                boolean z8 = false;
/* 31 */                boolean z9 = false;
/* 33 */                while (i < size) {
/* 35 */                    int i2 = i + 1;
/* 37 */                    String strName = headers.name(i);
/* 41 */                    String strValue = headers.value(i);
/* 53 */                    if (C1852e.m6258h(strName, "Cache-Control")) {
/* 55 */                        if (str == null) {
/* 59 */                            str = strValue;
                                }
/* 70 */                        iIndexOfElement = 0;
/* 75 */                        while (iIndexOfElement < strValue.length()) {
/* 79 */                            iIndexOfElement2 = indexOfElement(strValue, "=,;", iIndexOfElement);
/* 91 */                            string = StringsKt.m6239O(strValue.substring(iIndexOfElement, iIndexOfElement2)).toString();
/* 99 */                            if (iIndexOfElement2 != strValue.length() || strValue.charAt(iIndexOfElement2) == ',' || strValue.charAt(iIndexOfElement2) == ';') {
/* 171 */                               iIndexOfElement = iIndexOfElement2 + 1;
/* 173 */                               string2 = null;
                                    } else {
/* 120 */                               int iIndexOfNonWhitespace = Util.indexOfNonWhitespace(strValue, iIndexOfElement2 + 1);
/* 128 */                               if (iIndexOfNonWhitespace >= strValue.length() || strValue.charAt(iIndexOfNonWhitespace) != '\"') {
/* 154 */                                   iIndexOfElement = indexOfElement(strValue, ",;", iIndexOfNonWhitespace);
/* 166 */                                   string2 = StringsKt.m6239O(strValue.substring(iIndexOfNonWhitespace, iIndexOfElement)).toString();
                                        } else {
/* 138 */                                   int i3 = iIndexOfNonWhitespace + 1;
/* 141 */                                   int iM6226B = StringsKt.m6226B(strValue, '\"', i3, 4);
/* 145 */                                   string2 = strValue.substring(i3, iM6226B);
/* 149 */                                   iIndexOfElement = iM6226B + 1;
                                        }
                                    }
/* 180 */                           if ("no-cache".equalsIgnoreCase(string)) {
/* 183 */                               z2 = true;
                                    } else if ("no-store".equalsIgnoreCase(string)) {
/* 195 */                               z3 = true;
                                    } else if ("max-age".equalsIgnoreCase(string)) {
/* 207 */                               nonNegativeInt = Util.toNonNegativeInt(string2, -1);
                                    } else if ("s-maxage".equalsIgnoreCase(string)) {
/* 223 */                               nonNegativeInt2 = Util.toNonNegativeInt(string2, -1);
                                    } else if ("private".equalsIgnoreCase(string)) {
/* 237 */                               z4 = true;
                                    } else if ("public".equalsIgnoreCase(string)) {
/* 250 */                               z5 = true;
                                    } else if ("must-revalidate".equalsIgnoreCase(string)) {
/* 263 */                               z6 = true;
                                    } else if ("max-stale".equalsIgnoreCase(string)) {
/* 278 */                               nonNegativeInt3 = Util.toNonNegativeInt(string2, AbstractC0208c9.API_PRIORITY_OTHER);
                                    } else if ("min-fresh".equalsIgnoreCase(string)) {
/* 292 */                               nonNegativeInt4 = Util.toNonNegativeInt(string2, -1);
                                    } else if ("only-if-cached".equalsIgnoreCase(string)) {
/* 307 */                               z7 = true;
                                    } else if ("no-transform".equalsIgnoreCase(string)) {
/* 320 */                               z8 = true;
                                    } else if ("immutable".equalsIgnoreCase(string)) {
/* 333 */                               z9 = true;
                                    }
                                }
/* 337 */                       i = i2;
                            } else {
/* 67 */                        if (C1852e.m6258h(strName, "Pragma")) {
                                }
/* 337 */                       i = i2;
                            }
/* 57 */                    z = false;
/* 70 */                    iIndexOfElement = 0;
/* 75 */                    while (iIndexOfElement < strValue.length()) {
/* 79 */                        iIndexOfElement2 = indexOfElement(strValue, "=,;", iIndexOfElement);
/* 91 */                        string = StringsKt.m6239O(strValue.substring(iIndexOfElement, iIndexOfElement2)).toString();
/* 99 */                        if (iIndexOfElement2 != strValue.length()) {
/* 171 */                           iIndexOfElement = iIndexOfElement2 + 1;
/* 173 */                           string2 = null;
                                } else {
/* 171 */                           iIndexOfElement = iIndexOfElement2 + 1;
/* 173 */                           string2 = null;
                                }
/* 180 */                       if ("no-cache".equalsIgnoreCase(string)) {
/* 183 */                           z2 = true;
                                } else if ("no-store".equalsIgnoreCase(string)) {
/* 195 */                           z3 = true;
                                } else if ("max-age".equalsIgnoreCase(string)) {
/* 207 */                           nonNegativeInt = Util.toNonNegativeInt(string2, -1);
                                } else if ("s-maxage".equalsIgnoreCase(string)) {
/* 223 */                           nonNegativeInt2 = Util.toNonNegativeInt(string2, -1);
                                } else if ("private".equalsIgnoreCase(string)) {
/* 237 */                           z4 = true;
                                } else if ("public".equalsIgnoreCase(string)) {
/* 250 */                           z5 = true;
                                } else if ("must-revalidate".equalsIgnoreCase(string)) {
/* 263 */                           z6 = true;
                                } else if ("max-stale".equalsIgnoreCase(string)) {
/* 278 */                           nonNegativeInt3 = Util.toNonNegativeInt(string2, AbstractC0208c9.API_PRIORITY_OTHER);
                                } else if ("min-fresh".equalsIgnoreCase(string)) {
/* 292 */                           nonNegativeInt4 = Util.toNonNegativeInt(string2, -1);
                                } else if ("only-if-cached".equalsIgnoreCase(string)) {
/* 307 */                           z7 = true;
                                } else if ("no-transform".equalsIgnoreCase(string)) {
/* 320 */                           z8 = true;
                                } else if ("immutable".equalsIgnoreCase(string)) {
/* 333 */                           z9 = true;
                                }
                            }
/* 337 */                   i = i2;
                        }
/* 352 */               return new CacheControl(z2, z3, nonNegativeInt, nonNegativeInt2, z4, z5, z6, nonNegativeInt3, nonNegativeInt4, z7, z8, z9, !z ? null : str, null);
                    }

/* 4 */             private Companion() {
                    }
                }

/* 30 */        public /* synthetic */ CacheControl(boolean z, boolean z2, int i, int i2, boolean z3, boolean z4, boolean z5, int i3, int i4, boolean z6, boolean z7, boolean z8, String str, DefaultConstructorMarker defaultConstructorMarker) {
/* 31 */            this(z, z2, i, i2, z3, z4, z5, i3, i4, z6, z7, z8, str);
                }
            }
