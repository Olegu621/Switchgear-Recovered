            package okhttp3.internal.http;

            import java.io.EOFException;
            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.LinkedHashMap;
            import java.util.List;
            import java.util.Map;
            import kotlin.Metadata;
            import kotlin.jvm.internal.Intrinsics;
            import kotlin.text.C1852e;
            import okhttp3.Challenge;
            import okhttp3.Cookie;
            import okhttp3.CookieJar;
            import okhttp3.Headers;
            import okhttp3.HttpUrl;
            import okhttp3.Response;
            import okhttp3.internal.Util;
            import okhttp3.internal.platform.Platform;
            import okio.Buffer;
            import okio.ByteString;
            import p000.C1951n4;
            import p000.od0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            @Metadata(m6175d1 = {"\u0000R\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0005\n\u0000\u001a\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u001a\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b*\u00020\n2\u0006\u0010\u000b\u001a\u00020\f\u001a\n\u0010\r\u001a\u00020\u0004*\u00020\u0006\u001a\u001a\u0010\u000e\u001a\u00020\u000f*\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\u0012H\u0002\u001a\u000e\u0010\u0013\u001a\u0004\u0018\u00010\f*\u00020\u0010H\u0002\u001a\u000e\u0010\u0014\u001a\u0004\u0018\u00010\f*\u00020\u0010H\u0002\u001a\u001a\u0010\u0015\u001a\u00020\u000f*\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\n\u001a\f\u0010\u001a\u001a\u00020\u0004*\u00020\u0010H\u0002\u001a\u0014\u0010\u001b\u001a\u00020\u0004*\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u001dH\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, m6176d2 = {"QUOTED_STRING_DELIMITERS", "Lokio/ByteString;", "TOKEN_DELIMITERS", "hasBody", HttpUrl.FRAGMENT_ENCODE_SET, "response", "Lokhttp3/Response;", "parseChallenges", HttpUrl.FRAGMENT_ENCODE_SET, "Lokhttp3/Challenge;", "Lokhttp3/Headers;", "headerName", HttpUrl.FRAGMENT_ENCODE_SET, "promisesBody", "readChallengeHeader", HttpUrl.FRAGMENT_ENCODE_SET, "Lokio/Buffer;", "result", HttpUrl.FRAGMENT_ENCODE_SET, "readQuotedString", "readToken", "receiveHeaders", "Lokhttp3/CookieJar;", "url", "Lokhttp3/HttpUrl;", "headers", "skipCommasAndWhitespace", "startsWith", "prefix", HttpUrl.FRAGMENT_ENCODE_SET, "okhttp"}, m6177k = 2, m6178mv = {1, 6, 0}, m6180xi = 48)
            public final class HttpHeaders {
                private static final ByteString QUOTED_STRING_DELIMITERS;
                private static final ByteString TOKEN_DELIMITERS;

                static {
/* 1 */             ByteString.Companion companion = ByteString.INSTANCE;
/* 9 */             QUOTED_STRING_DELIMITERS = companion.encodeUtf8("\"\\");
/* 17 */            TOKEN_DELIMITERS = companion.encodeUtf8("\t ,=");
                }

                public static final boolean hasBody(Response response) {
/* 1 */             response.getClass();
/* 4 */             return promisesBody(response);
                }

                public static final List<Challenge> parseChallenges(Headers headers, String str) {
/* 1 */             headers.getClass();
/* 4 */             str.getClass();
/* 9 */             ArrayList arrayList = new ArrayList();
/* 12 */            int size = headers.size();
/* 16 */            int i = 0;
/* 17 */            while (i < size) {
/* 19 */                int i2 = i + 1;
/* 29 */                if (str.equalsIgnoreCase(headers.name(i))) {
                            try {
/* 44 */                        readChallengeHeader(new Buffer().writeUtf8(headers.value(i)), arrayList);
                            } catch (EOFException e) {
/* 58 */                        Platform.INSTANCE.get().log("Unable to parse challenge", 5, e);
                            }
                        }
/* 61 */                i = i2;
                    }
/* 63 */            return arrayList;
                }

                public static final boolean promisesBody(Response response) {
/* 1 */             response.getClass();
/* 19 */            if (Intrinsics.m6216a(response.request().method(), "HEAD")) {
/* 18 */                return false;
                    }
/* 22 */            int iCode = response.code();
                    return (((iCode >= 100 && iCode < 200) || iCode == 204 || iCode == 304) && Util.headersContentLength(response) == -1 && !"chunked".equalsIgnoreCase(Response.header$default(response, "Transfer-Encoding", null, 2, null))) ? false : true;
                }

                /* JADX WARN: Code duplicated, block: B:29:0x0086  */
                /* JADX WARN: Code duplicated, block: B:37:0x0099  */
                /* JADX WARN: Code duplicated, block: B:38:0x009e  */
                /* JADX WARN: Code duplicated, block: B:59:0x007b A[EDGE_INSN: B:59:0x007b->B:28:0x007b BREAK  A[LOOP:2: B:22:0x0067->B:49:0x00bb], SYNTHETIC] */
                private static final void readChallengeHeader(Buffer buffer, List<Challenge> list) throws EOFException {
                    String token;
                    while (true) {
/* 2 */                 String token2 = null;
                        while (true) {
/* 3 */                     if (token2 == null) {
/* 5 */                         skipCommasAndWhitespace(buffer);
/* 8 */                         token2 = readToken(buffer);
/* 12 */                        if (token2 == null) {
/* 187 */                           return;
                                }
                            }
/* 16 */                    boolean zSkipCommasAndWhitespace = skipCommasAndWhitespace(buffer);
/* 20 */                    String token3 = readToken(buffer);
/* 24 */                    if (token3 == null) {
/* 30 */                        if (buffer.exhausted()) {
/* 36 */                            od0 od0Var = od0.f14715a;
/* 38 */                            od0Var.getClass();
/* 44 */                            list.add(new Challenge(token2, od0Var));
/* 47 */                            return;
                                }
/* 187 */                       return;
                            }
/* 50 */                    int iSkipAll = Util.skipAll(buffer, (byte) 61);
/* 54 */                    boolean zSkipCommasAndWhitespace2 = skipCommasAndWhitespace(buffer);
/* 58 */                    if (zSkipCommasAndWhitespace || !(zSkipCommasAndWhitespace2 || buffer.exhausted())) {
/* 96 */                        LinkedHashMap linkedHashMap = new LinkedHashMap();
/* 103 */                       int iSkipAll2 = Util.skipAll(buffer, (byte) 61) + iSkipAll;
                                while (true) {
/* 104 */                           if (token3 == null) {
/* 106 */                               token3 = readToken(buffer);
/* 114 */                               if (skipCommasAndWhitespace(buffer)) {
                                            break;
                                        }
/* 117 */                               iSkipAll2 = Util.skipAll(buffer, (byte) 61);
/* 122 */                               if (iSkipAll2 == 0) {
                                            break;
                                        }
/* 136 */                               if (iSkipAll2 <= 1 || skipCommasAndWhitespace(buffer)) {
/* 187 */                                   return;
                                        }
/* 152 */                               if (startsWith(buffer, (byte) 34)) {
/* 154 */                                   token = readQuotedString(buffer);
                                        } else {
/* 159 */                                   token = readToken(buffer);
                                        }
/* 163 */                               if (token != null || ((String) linkedHashMap.put(token3, token)) != null) {
/* 187 */                                   return;
                                        }
/* 179 */                               if (skipCommasAndWhitespace(buffer) && !buffer.exhausted()) {
/* 187 */                                   return;
                                        } else {
/* 188 */                                   token3 = null;
                                        }
                                    } else {
/* 122 */                               if (iSkipAll2 == 0) {
                                            break;
                                            break;
                                        }
/* 136 */                               if (iSkipAll2 <= 1) {
/* 187 */                                   return;
                                        }
/* 152 */                               if (startsWith(buffer, (byte) 34)) {
/* 154 */                                   token = readQuotedString(buffer);
                                        } else {
/* 159 */                                   token = readToken(buffer);
                                        }
/* 163 */                               if (token != null) {
/* 187 */                                   return;
                                        }
/* 179 */                               if (skipCommasAndWhitespace(buffer)) {
                                        }
/* 188 */                               token3 = null;
                                    }
                                }
/* 129 */                       list.add(new Challenge(token2, linkedHashMap));
/* 132 */                       token2 = token3;
                            } else {
/* 80 */                        Map mapSingletonMap = Collections.singletonMap(null, Intrinsics.m6219d(C1852e.m6260j(iSkipAll, "="), token3));
/* 84 */                        mapSingletonMap.getClass();
/* 90 */                        list.add(new Challenge(token2, (Map<String, String>) mapSingletonMap));
                            }
                        }
                    }
                }

                private static final String readQuotedString(Buffer buffer) throws EOFException {
/* 8 */             if (buffer.readByte() != 34) {
/* 70 */                C1951n4.m6859j("Failed requirement.");
/* 5 */                 return null;
                    }
/* 12 */            Buffer buffer2 = new Buffer();
                    while (true) {
/* 17 */                long jIndexOfElement = buffer.indexOfElement(QUOTED_STRING_DELIMITERS);
/* 25 */                if (jIndexOfElement == -1) {
/* 5 */                     return null;
                        }
/* 32 */                if (buffer.getByte(jIndexOfElement) == 34) {
/* 34 */                    buffer2.write(buffer, jIndexOfElement);
/* 37 */                    buffer.readByte();
/* 40 */                    return buffer2.readUtf8();
                        }
/* 55 */                if (buffer.size() == jIndexOfElement + 1) {
/* 5 */                     return null;
                        }
/* 58 */                buffer2.write(buffer, jIndexOfElement);
/* 61 */                buffer.readByte();
/* 64 */                buffer2.write(buffer, 1L);
                    }
                }

                private static final String readToken(Buffer buffer) {
/* 3 */             long jIndexOfElement = buffer.indexOfElement(TOKEN_DELIMITERS);
/* 11 */            if (jIndexOfElement == -1) {
/* 13 */                jIndexOfElement = buffer.size();
                    }
/* 21 */            if (jIndexOfElement != 0) {
/* 23 */                return buffer.readUtf8(jIndexOfElement);
                    }
/* 28 */            return null;
                }

                public static final void receiveHeaders(CookieJar cookieJar, HttpUrl httpUrl, Headers headers) {
/* 1 */             cookieJar.getClass();
/* 4 */             httpUrl.getClass();
/* 7 */             headers.getClass();
/* 12 */            if (cookieJar == CookieJar.NO_COOKIES) {
/* 27 */                return;
                    }
/* 17 */            List<Cookie> all = Cookie.INSTANCE.parseAll(httpUrl, headers);
/* 25 */            if (all.isEmpty()) {
/* 27 */                return;
                    }
/* 28 */            cookieJar.saveFromResponse(httpUrl, all);
                }

                private static final boolean skipCommasAndWhitespace(Buffer buffer) throws EOFException {
/* 1 */             boolean z = false;
/* 6 */             while (!buffer.exhausted()) {
/* 10 */                byte b = buffer.getByte(0L);
/* 16 */                if (b == 44) {
/* 18 */                    buffer.readByte();
/* 21 */                    z = true;
                        } else {
/* 25 */                    if (b != 32 && b != 9) {
                                break;
                            }
/* 32 */                    buffer.readByte();
                        }
                    }
/* 36 */            return z;
                }

                private static final boolean startsWith(Buffer buffer, byte b) {
                    return !buffer.exhausted() && buffer.getByte(0L) == b;
                }
            }
