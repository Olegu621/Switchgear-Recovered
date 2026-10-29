            package okhttp3.internal.p013ws;

            import java.io.IOException;
            import kotlin.Metadata;
            import kotlin.jvm.internal.DefaultConstructorMarker;
            import kotlin.jvm.internal.Intrinsics;
            import kotlin.text.C1852e;
            import kotlin.text.StringsKt;
            import okhttp3.Headers;
            import okhttp3.HttpUrl;
            import okhttp3.internal.Util;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            @Metadata(m6175d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cBE\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003¢\u0006\u0002\u0010\nJ\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000eJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000eJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003JN\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001¢\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001J\u000e\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u000bR\u0010\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u000bR\u0010\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, m6176d2 = {"Lokhttp3/internal/ws/WebSocketExtensions;", HttpUrl.FRAGMENT_ENCODE_SET, "perMessageDeflate", HttpUrl.FRAGMENT_ENCODE_SET, "clientMaxWindowBits", HttpUrl.FRAGMENT_ENCODE_SET, "clientNoContextTakeover", "serverMaxWindowBits", "serverNoContextTakeover", "unknownValues", "(ZLjava/lang/Integer;ZLjava/lang/Integer;ZZ)V", "Ljava/lang/Integer;", "component1", "component2", "()Ljava/lang/Integer;", "component3", "component4", "component5", "component6", "copy", "(ZLjava/lang/Integer;ZLjava/lang/Integer;ZZ)Lokhttp3/internal/ws/WebSocketExtensions;", "equals", "other", "hashCode", "noContextTakeover", "clientOriginated", "toString", HttpUrl.FRAGMENT_ENCODE_SET, "Companion", "okhttp"}, m6177k = 1, m6178mv = {1, 6, 0}, m6180xi = 48)
/* 2 */     public final /* data */ class WebSocketExtensions {

                /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE = new Companion(null);
                private static final String HEADER_WEB_SOCKET_EXTENSION = "Sec-WebSocket-Extensions";
                public final Integer clientMaxWindowBits;
                public final boolean clientNoContextTakeover;
                public final boolean perMessageDeflate;
                public final Integer serverMaxWindowBits;
                public final boolean serverNoContextTakeover;
                public final boolean unknownValues;

                public /* synthetic */ WebSocketExtensions(boolean z, Integer num, boolean z2, Integer num2, boolean z3, boolean z4, int i, DefaultConstructorMarker defaultConstructorMarker) {
/* 33 */            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : num, (i & 4) != 0 ? false : z2, (i & 8) != 0 ? null : num2, (i & 16) != 0 ? false : z3, (i & 32) != 0 ? false : z4);
                }

                public static /* synthetic */ WebSocketExtensions copy$default(WebSocketExtensions webSocketExtensions, boolean z, Integer num, boolean z2, Integer num2, boolean z3, boolean z4, int i, Object obj) {
/* 3 */             if ((i & 1) != 0) {
/* 5 */                 z = webSocketExtensions.perMessageDeflate;
                    }
/* 9 */             if ((i & 2) != 0) {
/* 11 */                num = webSocketExtensions.clientMaxWindowBits;
                    }
/* 15 */            if ((i & 4) != 0) {
/* 17 */                z2 = webSocketExtensions.clientNoContextTakeover;
                    }
/* 21 */            if ((i & 8) != 0) {
/* 23 */                num2 = webSocketExtensions.serverMaxWindowBits;
                    }
/* 27 */            if ((i & 16) != 0) {
/* 29 */                z3 = webSocketExtensions.serverNoContextTakeover;
                    }
/* 33 */            if ((i & 32) != 0) {
/* 35 */                z4 = webSocketExtensions.unknownValues;
                    }
/* 37 */            boolean z5 = z3;
/* 38 */            boolean z6 = z4;
/* 44 */            return webSocketExtensions.copy(z, num, z2, num2, z5, z6);
                }

                /* JADX INFO: renamed from: component1, reason: from getter */
                public final boolean getPerMessageDeflate() {
/* 1 */             return this.perMessageDeflate;
                }

                /* JADX INFO: renamed from: component2, reason: from getter */
                public final Integer getClientMaxWindowBits() {
/* 1 */             return this.clientMaxWindowBits;
                }

                /* JADX INFO: renamed from: component3, reason: from getter */
                public final boolean getClientNoContextTakeover() {
/* 1 */             return this.clientNoContextTakeover;
                }

                /* JADX INFO: renamed from: component4, reason: from getter */
                public final Integer getServerMaxWindowBits() {
/* 1 */             return this.serverMaxWindowBits;
                }

                /* JADX INFO: renamed from: component5, reason: from getter */
                public final boolean getServerNoContextTakeover() {
/* 1 */             return this.serverNoContextTakeover;
                }

                /* JADX INFO: renamed from: component6, reason: from getter */
                public final boolean getUnknownValues() {
/* 1 */             return this.unknownValues;
                }

                public final WebSocketExtensions copy(boolean perMessageDeflate, Integer clientMaxWindowBits, boolean clientNoContextTakeover, Integer serverMaxWindowBits, boolean serverNoContextTakeover, boolean unknownValues) {
/* 3 */             return new WebSocketExtensions(perMessageDeflate, clientMaxWindowBits, clientNoContextTakeover, serverMaxWindowBits, serverNoContextTakeover, unknownValues);
                }

                public boolean equals(Object other) {
/* 2 */             if (this == other) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(other instanceof WebSocketExtensions)) {
/* 7 */                 return false;
                    }
/* 11 */            WebSocketExtensions webSocketExtensions = (WebSocketExtensions) other;
                    return this.perMessageDeflate == webSocketExtensions.perMessageDeflate && Intrinsics.m6216a(this.clientMaxWindowBits, webSocketExtensions.clientMaxWindowBits) && this.clientNoContextTakeover == webSocketExtensions.clientNoContextTakeover && Intrinsics.m6216a(this.serverMaxWindowBits, webSocketExtensions.serverMaxWindowBits) && this.serverNoContextTakeover == webSocketExtensions.serverNoContextTakeover && this.unknownValues == webSocketExtensions.unknownValues;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r0v1, types: [int] */
                /* JADX WARN: Type inference failed for: r0v11, types: [int] */
                /* JADX WARN: Type inference failed for: r0v12 */
                /* JADX WARN: Type inference failed for: r0v13 */
                /* JADX WARN: Type inference failed for: r0v5, types: [int] */
                /* JADX WARN: Type inference failed for: r0v9, types: [int] */
                /* JADX WARN: Type inference failed for: r1v0 */
                /* JADX WARN: Type inference failed for: r1v1, types: [int] */
                /* JADX WARN: Type inference failed for: r1v2 */
                /* JADX WARN: Type inference failed for: r2v11 */
                /* JADX WARN: Type inference failed for: r2v12 */
                /* JADX WARN: Type inference failed for: r2v4, types: [int] */
                /* JADX WARN: Type inference failed for: r2v7, types: [int] */
                /* JADX WARN: Type inference failed for: r2v8 */
                /* JADX WARN: Type inference failed for: r2v9 */
                public int hashCode() {
/* 1 */             boolean z = this.perMessageDeflate;
                    ?? r0 = z;
/* 4 */             if (z) {
/* 6 */                 r0 = 1;
                    }
/* 7 */             int i = r0 * 31;
/* 9 */             Integer num = this.clientMaxWindowBits;
/* 21 */            int iHashCode = (i + (num == null ? 0 : num.hashCode())) * 31;
/* 23 */            boolean z2 = this.clientNoContextTakeover;
                    ?? r2 = z2;
/* 25 */            if (z2) {
/* 27 */                r2 = 1;
                    }
/* 29 */            int i2 = (iHashCode + r2) * 31;
/* 31 */            Integer num2 = this.serverMaxWindowBits;
/* 41 */            int iHashCode2 = (i2 + (num2 != null ? num2.hashCode() : 0)) * 31;
/* 43 */            boolean z3 = this.serverNoContextTakeover;
                    ?? r3 = z3;
/* 45 */            if (z3) {
/* 47 */                r3 = 1;
                    }
/* 49 */            int i3 = (iHashCode2 + r3) * 31;
/* 51 */            boolean z4 = this.unknownValues;
/* 57 */            return i3 + (z4 ? 1 : z4);
                }

                public final boolean noContextTakeover(boolean clientOriginated) {
                    return clientOriginated ? this.clientNoContextTakeover : this.serverNoContextTakeover;
                }

                public String toString() {
/* 68 */            return "WebSocketExtensions(perMessageDeflate=" + this.perMessageDeflate + ", clientMaxWindowBits=" + this.clientMaxWindowBits + ", clientNoContextTakeover=" + this.clientNoContextTakeover + ", serverMaxWindowBits=" + this.serverMaxWindowBits + ", serverNoContextTakeover=" + this.serverNoContextTakeover + ", unknownValues=" + this.unknownValues + ')';
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, m6176d2 = {"Lokhttp3/internal/ws/WebSocketExtensions$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, "()V", "HEADER_WEB_SOCKET_EXTENSION", HttpUrl.FRAGMENT_ENCODE_SET, "parse", "Lokhttp3/internal/ws/WebSocketExtensions;", "responseHeaders", "Lokhttp3/Headers;", "okhttp"}, m6177k = 1, m6178mv = {1, 6, 0}, m6180xi = 48)
/* 3 */         public static final class Companion {
                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
/* 1 */                 this();
                    }

                    public final WebSocketExtensions parse(Headers responseHeaders) throws IOException {
/* 3 */                 responseHeaders.getClass();
/* 6 */                 int size = responseHeaders.size();
/* 11 */                Integer intOrNull = null;
/* 12 */                Integer intOrNull2 = null;
/* 13 */                int i = 0;
/* 14 */                boolean z = false;
/* 15 */                boolean z2 = false;
/* 16 */                boolean z3 = false;
/* 17 */                boolean z4 = false;
/* 18 */                while (i < size) {
/* 20 */                    int i2 = i + 1;
/* 32 */                    if (C1852e.m6258h(responseHeaders.name(i), WebSocketExtensions.HEADER_WEB_SOCKET_EXTENSION)) {
/* 36 */                        String strValue = responseHeaders.value(i);
/* 40 */                        int i3 = 0;
/* 45 */                        while (i3 < strValue.length()) {
/* 55 */                            int iDelimiterOffset$default = Util.delimiterOffset$default(strValue, ',', i3, 0, 4, (Object) null);
/* 61 */                            int iDelimiterOffset = Util.delimiterOffset(strValue, ';', i3, iDelimiterOffset$default);
/* 65 */                            String strTrimSubstring = Util.trimSubstring(strValue, i3, iDelimiterOffset);
/* 71 */                            int i4 = iDelimiterOffset + 1;
/* 79 */                            if (C1852e.m6258h(strTrimSubstring, "permessage-deflate")) {
/* 81 */                                if (z) {
/* 83 */                                    z4 = true;
                                        }
/* 85 */                                i3 = i4;
/* 86 */                                while (i3 < iDelimiterOffset$default) {
/* 88 */                                    int iDelimiterOffset2 = Util.delimiterOffset(strValue, ';', i3, iDelimiterOffset$default);
/* 94 */                                    int iDelimiterOffset3 = Util.delimiterOffset(strValue, '=', i3, iDelimiterOffset2);
/* 98 */                                    String strTrimSubstring2 = Util.trimSubstring(strValue, i3, iDelimiterOffset3);
/* 115 */                                   String strM6234J = iDelimiterOffset3 < iDelimiterOffset2 ? StringsKt.m6234J(Util.trimSubstring(strValue, iDelimiterOffset3 + 1, iDelimiterOffset2)) : null;
/* 116 */                                   i3 = iDelimiterOffset2 + 1;
/* 124 */                                   if (C1852e.m6258h(strTrimSubstring2, "client_max_window_bits")) {
/* 126 */                                       if (intOrNull != null) {
/* 128 */                                           z4 = true;
                                                }
/* 134 */                                       intOrNull = strM6234J == null ? null : StringsKt.toIntOrNull(strM6234J);
/* 139 */                                       if (intOrNull == null) {
/* 141 */                                           z4 = true;
                                                }
                                            } else if (C1852e.m6258h(strTrimSubstring2, "client_no_context_takeover")) {
/* 152 */                                       if (z2) {
/* 154 */                                           z4 = true;
                                                }
/* 156 */                                       if (strM6234J != null) {
/* 158 */                                           z4 = true;
                                                }
/* 160 */                                       z2 = true;
                                            } else if (C1852e.m6258h(strTrimSubstring2, "server_max_window_bits")) {
/* 171 */                                       if (intOrNull2 != null) {
/* 173 */                                           z4 = true;
                                                }
/* 179 */                                       intOrNull2 = strM6234J == null ? null : StringsKt.toIntOrNull(strM6234J);
/* 184 */                                       if (intOrNull2 == null) {
/* 141 */                                           z4 = true;
                                                }
                                            } else if (C1852e.m6258h(strTrimSubstring2, "server_no_context_takeover")) {
/* 195 */                                       if (z3) {
/* 197 */                                           z4 = true;
                                                }
/* 199 */                                       if (strM6234J != null) {
/* 201 */                                           z4 = true;
                                                }
/* 203 */                                       z3 = true;
                                            } else {
/* 141 */                                       z4 = true;
                                            }
                                        }
/* 206 */                               z = true;
                                    } else {
/* 210 */                               i3 = i4;
/* 211 */                               z4 = true;
                                    }
                                }
                            }
/* 34 */                    i = i2;
                        }
/* 217 */               return new WebSocketExtensions(z, intOrNull, z2, intOrNull2, z3, z4);
                    }

/* 4 */             private Companion() {
                    }
                }

/* 36 */        public WebSocketExtensions(boolean z, Integer num, boolean z2, Integer num2, boolean z3, boolean z4) {
/* 38 */            this.perMessageDeflate = z;
/* 39 */            this.clientMaxWindowBits = num;
/* 40 */            this.clientNoContextTakeover = z2;
/* 41 */            this.serverMaxWindowBits = num2;
/* 42 */            this.serverNoContextTakeover = z3;
/* 43 */            this.unknownValues = z4;
                }

/* 43 */        public WebSocketExtensions() {
/* 44 */            this(false, null, false, null, false, false, 63, null);
                }
            }
