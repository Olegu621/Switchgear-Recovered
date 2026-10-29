            package okhttp3.internal.publicsuffix;

            import java.io.IOException;
            import java.io.InputStream;
            import java.io.InterruptedIOException;
            import java.net.IDN;
            import java.nio.charset.Charset;
            import java.nio.charset.StandardCharsets;
            import java.util.List;
            import java.util.concurrent.CountDownLatch;
            import java.util.concurrent.atomic.AtomicBoolean;
            import kotlin.Metadata;
            import kotlin.collections.C1839a;
            import kotlin.collections.CollectionsKt;
            import kotlin.jvm.internal.DefaultConstructorMarker;
            import kotlin.jvm.internal.Intrinsics;
            import kotlin.sequences.Sequence;
            import kotlin.text.StringsKt;
            import okhttp3.HttpUrl;
            import okhttp3.internal.Util;
            import okhttp3.internal.platform.Platform;
            import okio.BufferedSource;
            import okio.GzipSource;
            import okio.Okio;
            import p000.AbstractC0886en;
            import p000.C2066pd;
            import p000.ds0;
            import p000.f42;
            import p000.jb1;
            import p000.nd0;
            import p000.ta0;
            import p000.ua0;
            import p000.yh2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            @Metadata(m6175d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0005¢\u0006\u0002\u0010\u0002J\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\fJ\b\u0010\u0010\u001a\u00020\u0011H\u0002J\b\u0010\u0012\u001a\u00020\u0011H\u0002J\u0016\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u000f\u001a\u00020\fH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m6176d2 = {"Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;", HttpUrl.FRAGMENT_ENCODE_SET, "()V", "listRead", "Ljava/util/concurrent/atomic/AtomicBoolean;", "publicSuffixExceptionListBytes", HttpUrl.FRAGMENT_ENCODE_SET, "publicSuffixListBytes", "readCompleteLatch", "Ljava/util/concurrent/CountDownLatch;", "findMatchingRule", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "domainLabels", "getEffectiveTldPlusOne", "domain", "readTheList", HttpUrl.FRAGMENT_ENCODE_SET, "readTheListUninterruptibly", "setListBytes", "splitDomain", "Companion", "okhttp"}, m6177k = 1, m6178mv = {1, 6, 0}, m6180xi = 48)
/* 2 */     public final class PublicSuffixDatabase {
                private static final char EXCEPTION_MARKER = '!';
                public static final String PUBLIC_SUFFIX_RESOURCE = "publicsuffixes.gz";
                private byte[] publicSuffixExceptionListBytes;
                private byte[] publicSuffixListBytes;

                /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE = new Companion(null);
                private static final byte[] WILDCARD_LABEL = {42};
                private static final List<String> PREVAILING_RULE = C1839a.m6210b("*");
                private static final PublicSuffixDatabase instance = new PublicSuffixDatabase();
                private final AtomicBoolean listRead = new AtomicBoolean(false);
                private final CountDownLatch readCompleteLatch = new CountDownLatch(1);

                private final List<String> findMatchingRule(List<String> domainLabels) {
                    String strBinarySearch;
                    String strBinarySearch2;
                    String strBinarySearch3;
/* 9 */             if (this.listRead.get() || !this.listRead.compareAndSet(false, true)) {
                        try {
/* 25 */                    this.readCompleteLatch.await();
                        } catch (InterruptedException unused) {
/* 33 */                    Thread.currentThread().interrupt();
                        }
                    } else {
/* 19 */                readTheListUninterruptibly();
                    }
/* 39 */            if (this.publicSuffixListBytes == null) {
/* 241 */               f42.m3656l("Unable to load publicsuffixes.gz resource from the classpath.");
/* 38 */                return null;
                    }
/* 41 */            int size = domainLabels.size();
/* 45 */            byte[][] bArr = new byte[size][];
/* 48 */            for (int i = 0; i < size; i++) {
/* 50 */                String str = domainLabels.get(i);
/* 56 */                Charset charset = StandardCharsets.UTF_8;
/* 58 */                charset.getClass();
/* 61 */                byte[] bytes = str.getBytes(charset);
/* 65 */                bytes.getClass();
/* 68 */                bArr[i] = bytes;
                    }
/* 73 */            int i2 = 0;
                    while (true) {
/* 76 */                if (i2 >= size) {
/* 99 */                    strBinarySearch = null;
                            break;
                        }
/* 78 */                int i3 = i2 + 1;
/* 80 */                Companion companion = INSTANCE;
/* 82 */                byte[] bArr2 = this.publicSuffixListBytes;
/* 84 */                if (bArr2 == null) {
/* 95 */                    Intrinsics.m6220e("publicSuffixListBytes");
/* 98 */                    throw null;
                        }
/* 1 */                 strBinarySearch = companion.binarySearch(bArr2, bArr, i2);
/* 90 */                if (strBinarySearch != null) {
                            break;
                        }
/* 93 */                i2 = i3;
                    }
/* 100 */           if (size <= 1) {
/* 138 */               strBinarySearch2 = null;
                        break;
                    }
/* 106 */           byte[][] bArr3 = (byte[][]) bArr.clone();
/* 109 */           int length = bArr3.length - 1;
/* 110 */           int i4 = 0;
                    while (true) {
/* 111 */               if (i4 >= length) {
/* 138 */                   strBinarySearch2 = null;
                            break;
                        }
/* 113 */               int i5 = i4 + 1;
/* 117 */               bArr3[i4] = WILDCARD_LABEL;
/* 119 */               Companion companion2 = INSTANCE;
/* 121 */               byte[] bArr4 = this.publicSuffixListBytes;
/* 123 */               if (bArr4 == null) {
/* 134 */                   Intrinsics.m6220e("publicSuffixListBytes");
/* 137 */                   throw null;
                        }
/* 1 */                 strBinarySearch2 = companion2.binarySearch(bArr4, bArr3, i4);
/* 129 */               if (strBinarySearch2 != null) {
                            break;
                        }
/* 132 */               i4 = i5;
                    }
/* 139 */           if (strBinarySearch2 == null) {
/* 168 */               strBinarySearch3 = null;
                        break;
                    }
/* 141 */           int i6 = size - 1;
/* 142 */           int i7 = 0;
                    while (true) {
/* 143 */               if (i7 >= i6) {
/* 168 */                   strBinarySearch3 = null;
                            break;
                        }
/* 145 */               int i8 = i7 + 1;
/* 147 */               Companion companion3 = INSTANCE;
/* 149 */               byte[] bArr5 = this.publicSuffixExceptionListBytes;
/* 151 */               if (bArr5 == null) {
/* 164 */                   Intrinsics.m6220e("publicSuffixExceptionListBytes");
/* 167 */                   throw null;
                        }
/* 1 */                 strBinarySearch3 = companion3.binarySearch(bArr5, bArr, i7);
/* 157 */               if (strBinarySearch3 != null) {
                            break;
                        }
/* 160 */               i7 = i8;
                    }
/* 171 */           if (strBinarySearch3 != null) {
/* 183 */               return StringsKt.m6235K(Intrinsics.m6219d(strBinarySearch3, "!"), new char[]{'.'});
                    }
/* 188 */           if (strBinarySearch == null && strBinarySearch2 == null) {
/* 192 */               return PREVAILING_RULE;
                    }
/* 203 */           List<String> listM6235K = strBinarySearch == null ? null : StringsKt.m6235K(strBinarySearch, new char[]{'.'});
/* 207 */           if (listM6235K == null) {
/* 209 */               listM6235K = nd0.f14189a;
                    }
/* 218 */           List<String> listM6235K2 = strBinarySearch2 != null ? StringsKt.m6235K(strBinarySearch2, new char[]{'.'}) : null;
/* 222 */           if (listM6235K2 == null) {
/* 224 */               listM6235K2 = nd0.f14189a;
                    }
                    return listM6235K.size() > listM6235K2.size() ? listM6235K : listM6235K2;
                }

                private final void readTheList() throws IOException {
/* 5 */             InputStream resourceAsStream = PublicSuffixDatabase.class.getResourceAsStream(PUBLIC_SUFFIX_RESOURCE);
/* 9 */             if (resourceAsStream == null) {
/* 11 */                return;
                    }
/* 21 */            BufferedSource bufferedSourceBuffer = Okio.buffer(new GzipSource(Okio.source(resourceAsStream)));
                    try {
/* 30 */                byte[] byteArray = bufferedSourceBuffer.readByteArray(bufferedSourceBuffer.readInt());
/* 39 */                byte[] byteArray2 = bufferedSourceBuffer.readByteArray(bufferedSourceBuffer.readInt());
/* 44 */                jb1.m5754n(bufferedSourceBuffer, null);
                        synchronized (this) {
/* 48 */                    byteArray.getClass();
/* 51 */                    this.publicSuffixListBytes = byteArray;
/* 53 */                    byteArray2.getClass();
/* 56 */                    this.publicSuffixExceptionListBytes = byteArray2;
                        }
/* 61 */                this.readCompleteLatch.countDown();
                    } catch (Throwable th) {
                        try {
/* 69 */                    throw th;
                        } catch (Throwable th2) {
/* 71 */                    jb1.m5754n(bufferedSourceBuffer, th);
/* 74 */                    throw th2;
                        }
                    }
                }

                private final void readTheListUninterruptibly() {
/* 1 */             boolean z = false;
                    while (true) {
                        try {
                            try {
/* 2 */                         readTheList();
                                break;
                            } catch (InterruptedIOException unused) {
/* 34 */                        Thread.interrupted();
/* 37 */                        z = true;
                            } catch (IOException e) {
/* 27 */                        Platform.INSTANCE.get().log("Failed to read public suffix list", 5, e);
/* 30 */                        if (!z) {
/* 33 */                            return;
                                }
                            }
                        } catch (Throwable th) {
/* 39 */                    if (z) {
/* 45 */                        Thread.currentThread().interrupt();
                            }
/* 48 */                    throw th;
                        }
                    }
/* 5 */             if (!z) {
/* 33 */                return;
                    }
/* 11 */            Thread.currentThread().interrupt();
                }

                private final List<String> splitDomain(String domain) {
/* 9 */             List<String> listM6235K = StringsKt.m6235K(domain, new char[]{'.'});
/* 23 */            if (!Intrinsics.m6216a(CollectionsKt.m6204y(listM6235K), HttpUrl.FRAGMENT_ENCODE_SET)) {
/* 39 */                return listM6235K;
                    }
/* 29 */            int size = listM6235K.size() - 1;
/* 34 */            return CollectionsKt.m6187F(size >= 0 ? size : 0, listM6235K);
                }

                public final String getEffectiveTldPlusOne(String domain) {
                    int size;
                    int size2;
/* 1 */             domain.getClass();
/* 4 */             String unicode = IDN.toUnicode(domain);
/* 8 */             unicode.getClass();
/* 11 */            List<String> listSplitDomain = splitDomain(unicode);
/* 15 */            List<String> listFindMatchingRule = findMatchingRule(listSplitDomain);
/* 29 */            int i = 0;
/* 31 */            if (listSplitDomain.size() == listFindMatchingRule.size() && listFindMatchingRule.get(0).charAt(0) != '!') {
/* 30 */                return null;
                    }
/* 56 */            int i2 = 1;
/* 57 */            if (listFindMatchingRule.get(0).charAt(0) == '!') {
/* 59 */                size = listSplitDomain.size();
/* 63 */                size2 = listFindMatchingRule.size();
                    } else {
/* 69 */                size = listSplitDomain.size();
/* 77 */                size2 = listFindMatchingRule.size() + 1;
                    }
/* 67 */            int i3 = size - size2;
/* 79 */            List<String> listSplitDomain2 = splitDomain(domain);
/* 83 */            listSplitDomain2.getClass();
/* 88 */            Sequence c2066pd = new C2066pd(listSplitDomain2, i2);
/* 91 */            if (i3 < 0) {
/* 168 */               ds0.m3200q(AbstractC0886en.m3505i(i3, "Requested element count ", " is less than zero."));
/* 30 */                return null;
                    }
/* 93 */            if (i3 != 0) {
/* 109 */               c2066pd = c2066pd instanceof ua0 ? ((ua0) c2066pd).mo7389a(i3) : new ta0(c2066pd, i3);
                    }
/* 113 */           c2066pd.getClass();
/* 118 */           StringBuilder sb = new StringBuilder();
/* 123 */           sb.append((CharSequence) HttpUrl.FRAGMENT_ENCODE_SET);
/* 134 */           for (Object obj : c2066pd) {
/* 140 */               i++;
/* 141 */               if (i > 1) {
/* 145 */                   sb.append((CharSequence) ".");
                        }
/* 148 */               yh2.m10149a(sb, obj, null);
                    }
/* 152 */           sb.append((CharSequence) HttpUrl.FRAGMENT_ENCODE_SET);
/* 155 */           return sb.toString();
                }

                public final void setListBytes(byte[] publicSuffixListBytes, byte[] publicSuffixExceptionListBytes) {
/* 1 */             publicSuffixListBytes.getClass();
/* 4 */             publicSuffixExceptionListBytes.getClass();
/* 7 */             this.publicSuffixListBytes = publicSuffixListBytes;
/* 9 */             this.publicSuffixExceptionListBytes = publicSuffixExceptionListBytes;
/* 14 */            this.listRead.set(true);
/* 19 */            this.readCompleteLatch.countDown();
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\f\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\r\u001a\u00020\fJ)\u0010\u000e\u001a\u0004\u0018\u00010\u0007*\u00020\n2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002¢\u0006\u0002\u0010\u0013R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m6176d2 = {"Lokhttp3/internal/publicsuffix/PublicSuffixDatabase$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, "()V", "EXCEPTION_MARKER", HttpUrl.FRAGMENT_ENCODE_SET, "PREVAILING_RULE", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "PUBLIC_SUFFIX_RESOURCE", "WILDCARD_LABEL", HttpUrl.FRAGMENT_ENCODE_SET, "instance", "Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;", "get", "binarySearch", "labels", HttpUrl.FRAGMENT_ENCODE_SET, "labelIndex", HttpUrl.FRAGMENT_ENCODE_SET, "([B[[BI)Ljava/lang/String;", "okhttp"}, m6177k = 1, m6178mv = {1, 6, 0}, m6180xi = 48)
/* 3 */         public static final class Companion {
                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
/* 1 */                 this();
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public final String binarySearch(byte[] bArr, byte[][] bArr2, int i) {
                        int i2;
                        int iAnd;
                        boolean z;
                        int iAnd2;
/* 5 */                 int length = bArr.length;
/* 6 */                 int i3 = 0;
/* 7 */                 while (i3 < length) {
/* 11 */                    int i4 = (i3 + length) / 2;
/* 16 */                    while (i4 > -1 && bArr[i4] != 10) {
/* 22 */                        i4--;
                            }
/* 25 */                    int i5 = i4 + 1;
/* 28 */                    int i6 = 1;
                            while (true) {
/* 29 */                        i2 = i5 + i6;
/* 33 */                        if (bArr[i2] == 10) {
                                    break;
                                }
/* 35 */                        i6++;
                            }
/* 38 */                    int i7 = i2 - i5;
/* 40 */                    int i8 = i;
/* 42 */                    boolean z2 = false;
/* 43 */                    int i9 = 0;
/* 44 */                    int i10 = 0;
                            while (true) {
/* 47 */                        if (z2) {
/* 49 */                            iAnd = 46;
/* 51 */                            z = false;
                                } else {
/* 61 */                            boolean z3 = z2;
/* 57 */                            iAnd = Util.and(bArr2[i8][i9], 255);
/* 64 */                            z = z3;
                                }
/* 74 */                        iAnd2 = iAnd - Util.and(bArr[i5 + i10], 255);
/* 75 */                        if (iAnd2 != 0) {
                                    break;
                                }
/* 78 */                        i10++;
/* 80 */                        i9++;
/* 82 */                        if (i10 == i7) {
                                    break;
                                }
/* 88 */                        if (bArr2[i8].length != i9) {
/* 145 */                           z2 = z;
                                } else {
/* 92 */                            if (i8 == bArr2.length - 1) {
                                        break;
                                    }
/* 139 */                           i8++;
/* 141 */                           z2 = true;
/* 143 */                           i9 = -1;
                                }
                            }
/* 94 */                    if (iAnd2 >= 0) {
/* 98 */                        if (iAnd2 <= 0) {
/* 103 */                           int i11 = i7 - i10;
/* 108 */                           int length2 = bArr2[i8].length - i9;
/* 111 */                           int length3 = bArr2.length;
/* 112 */                           for (int i12 = i8 + 1; i12 < length3; i12++) {
/* 119 */                               length2 += bArr2[i12].length;
                                    }
/* 122 */                           if (length2 >= i11) {
/* 125 */                               if (length2 <= i11) {
/* 128 */                                   Charset charset = StandardCharsets.UTF_8;
/* 130 */                                   charset.getClass();
/* 135 */                                   return new String(bArr, i5, i7, charset);
                                        }
                                    }
                                }
/* 100 */                       i3 = i2 + 1;
                            }
/* 96 */                    length = i4;
                        }
/* 148 */               return null;
                    }

                    public final PublicSuffixDatabase get() {
/* 1 */                 return PublicSuffixDatabase.instance;
                    }

/* 4 */             private Companion() {
                    }
                }
            }
