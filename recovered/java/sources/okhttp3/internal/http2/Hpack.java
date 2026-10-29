            package okhttp3.internal.http2;

            import com.google.firebase.analytics.FirebaseAnalytics;
            import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLProtectionSpaceContract;
            import com.supercell.p007id.scid_plugin.platform_interface.SharedDataContentProvider;
            import java.io.IOException;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.Collections;
            import java.util.LinkedHashMap;
            import java.util.List;
            import java.util.Map;
            import kotlin.Metadata;
            import kotlin.collections.CollectionsKt;
            import kotlin.jvm.internal.DefaultConstructorMarker;
            import kotlin.jvm.internal.Intrinsics;
            import okhttp3.HttpUrl;
            import okhttp3.internal.Util;
            import okio.Buffer;
            import okio.BufferedSource;
            import okio.ByteString;
            import okio.Okio;
            import okio.Source;
            import p000.AbstractC0208c9;
            import p000.C1960nd;
            import p000.ds0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            @Metadata(m6175d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u0018\u0019B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0005J\u0014\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0002R\u001d\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u0019\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001a"}, m6176d2 = {"Lokhttp3/internal/http2/Hpack;", HttpUrl.FRAGMENT_ENCODE_SET, "()V", "NAME_TO_FIRST_INDEX", HttpUrl.FRAGMENT_ENCODE_SET, "Lokio/ByteString;", HttpUrl.FRAGMENT_ENCODE_SET, "getNAME_TO_FIRST_INDEX", "()Ljava/util/Map;", "PREFIX_4_BITS", "PREFIX_5_BITS", "PREFIX_6_BITS", "PREFIX_7_BITS", "SETTINGS_HEADER_TABLE_SIZE", "SETTINGS_HEADER_TABLE_SIZE_LIMIT", "STATIC_HEADER_TABLE", HttpUrl.FRAGMENT_ENCODE_SET, "Lokhttp3/internal/http2/Header;", "getSTATIC_HEADER_TABLE", "()[Lokhttp3/internal/http2/Header;", "[Lokhttp3/internal/http2/Header;", "checkLowercase", "name", "nameToFirstIndex", "Reader", "Writer", "okhttp"}, m6177k = 1, m6178mv = {1, 6, 0}, m6180xi = 48)
/* 29 */    public final class Hpack {
                public static final Hpack INSTANCE;
                private static final Map<ByteString, Integer> NAME_TO_FIRST_INDEX;
                private static final int PREFIX_4_BITS = 15;
                private static final int PREFIX_5_BITS = 31;
                private static final int PREFIX_6_BITS = 63;
                private static final int PREFIX_7_BITS = 127;
                private static final int SETTINGS_HEADER_TABLE_SIZE = 4096;
                private static final int SETTINGS_HEADER_TABLE_SIZE_LIMIT = 16384;
                private static final Header[] STATIC_HEADER_TABLE;

                static {
/* 3 */             Hpack hpack = new Hpack();
/* 6 */             INSTANCE = hpack;
/* 14 */            Header header = new Header(Header.TARGET_AUTHORITY, HttpUrl.FRAGMENT_ENCODE_SET);
/* 19 */            ByteString byteString = Header.TARGET_METHOD;
/* 23 */            Header header2 = new Header(byteString, "GET");
/* 30 */            Header header3 = new Header(byteString, "POST");
/* 35 */            ByteString byteString2 = Header.TARGET_PATH;
/* 39 */            Header header4 = new Header(byteString2, "/");
/* 47 */            Header header5 = new Header(byteString2, "/index.html");
/* 52 */            ByteString byteString3 = Header.TARGET_SCHEME;
/* 56 */            Header header6 = new Header(byteString3, "http");
/* 64 */            Header header7 = new Header(byteString3, "https");
/* 69 */            ByteString byteString4 = Header.RESPONSE_STATUS;
/* 654 */           STATIC_HEADER_TABLE = new Header[]{header, header2, header3, header4, header5, header6, header7, new Header(byteString4, "200"), new Header(byteString4, "204"), new Header(byteString4, "206"), new Header(byteString4, "304"), new Header(byteString4, "400"), new Header(byteString4, "404"), new Header(byteString4, "500"), new Header("accept-charset", HttpUrl.FRAGMENT_ENCODE_SET), new Header("accept-encoding", "gzip, deflate"), new Header("accept-language", HttpUrl.FRAGMENT_ENCODE_SET), new Header("accept-ranges", HttpUrl.FRAGMENT_ENCODE_SET), new Header("accept", HttpUrl.FRAGMENT_ENCODE_SET), new Header("access-control-allow-origin", HttpUrl.FRAGMENT_ENCODE_SET), new Header("age", HttpUrl.FRAGMENT_ENCODE_SET), new Header("allow", HttpUrl.FRAGMENT_ENCODE_SET), new Header("authorization", HttpUrl.FRAGMENT_ENCODE_SET), new Header("cache-control", HttpUrl.FRAGMENT_ENCODE_SET), new Header("content-disposition", HttpUrl.FRAGMENT_ENCODE_SET), new Header("content-encoding", HttpUrl.FRAGMENT_ENCODE_SET), new Header("content-language", HttpUrl.FRAGMENT_ENCODE_SET), new Header("content-length", HttpUrl.FRAGMENT_ENCODE_SET), new Header("content-location", HttpUrl.FRAGMENT_ENCODE_SET), new Header("content-range", HttpUrl.FRAGMENT_ENCODE_SET), new Header("content-type", HttpUrl.FRAGMENT_ENCODE_SET), new Header("cookie", HttpUrl.FRAGMENT_ENCODE_SET), new Header("date", HttpUrl.FRAGMENT_ENCODE_SET), new Header("etag", HttpUrl.FRAGMENT_ENCODE_SET), new Header("expect", HttpUrl.FRAGMENT_ENCODE_SET), new Header("expires", HttpUrl.FRAGMENT_ENCODE_SET), new Header("from", HttpUrl.FRAGMENT_ENCODE_SET), new Header(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_HOST, HttpUrl.FRAGMENT_ENCODE_SET), new Header("if-match", HttpUrl.FRAGMENT_ENCODE_SET), new Header("if-modified-since", HttpUrl.FRAGMENT_ENCODE_SET), new Header("if-none-match", HttpUrl.FRAGMENT_ENCODE_SET), new Header("if-range", HttpUrl.FRAGMENT_ENCODE_SET), new Header("if-unmodified-since", HttpUrl.FRAGMENT_ENCODE_SET), new Header("last-modified", HttpUrl.FRAGMENT_ENCODE_SET), new Header("link", HttpUrl.FRAGMENT_ENCODE_SET), new Header(FirebaseAnalytics.Param.LOCATION, HttpUrl.FRAGMENT_ENCODE_SET), new Header("max-forwards", HttpUrl.FRAGMENT_ENCODE_SET), new Header("proxy-authenticate", HttpUrl.FRAGMENT_ENCODE_SET), new Header("proxy-authorization", HttpUrl.FRAGMENT_ENCODE_SET), new Header("range", HttpUrl.FRAGMENT_ENCODE_SET), new Header("referer", HttpUrl.FRAGMENT_ENCODE_SET), new Header("refresh", HttpUrl.FRAGMENT_ENCODE_SET), new Header("retry-after", HttpUrl.FRAGMENT_ENCODE_SET), new Header("server", HttpUrl.FRAGMENT_ENCODE_SET), new Header("set-cookie", HttpUrl.FRAGMENT_ENCODE_SET), new Header("strict-transport-security", HttpUrl.FRAGMENT_ENCODE_SET), new Header("transfer-encoding", HttpUrl.FRAGMENT_ENCODE_SET), new Header("user-agent", HttpUrl.FRAGMENT_ENCODE_SET), new Header("vary", HttpUrl.FRAGMENT_ENCODE_SET), new Header("via", HttpUrl.FRAGMENT_ENCODE_SET), new Header("www-authenticate", HttpUrl.FRAGMENT_ENCODE_SET)};
/* 660 */           NAME_TO_FIRST_INDEX = hpack.nameToFirstIndex();
                }

                private Hpack() {
                }

                private final Map<ByteString, Integer> nameToFirstIndex() {
/* 3 */             Header[] headerArr = STATIC_HEADER_TABLE;
/* 6 */             LinkedHashMap linkedHashMap = new LinkedHashMap(headerArr.length);
/* 9 */             int length = headerArr.length;
/* 10 */            int i = 0;
/* 11 */            while (i < length) {
/* 13 */                int i2 = i + 1;
/* 15 */                Header[] headerArr2 = STATIC_HEADER_TABLE;
/* 25 */                if (!linkedHashMap.containsKey(headerArr2[i].name)) {
/* 35 */                    linkedHashMap.put(headerArr2[i].name, Integer.valueOf(i));
                        }
/* 38 */                i = i2;
                    }
/* 40 */            Map<ByteString, Integer> mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
/* 44 */            mapUnmodifiableMap.getClass();
/* 47 */            return mapUnmodifiableMap;
                }

                public final ByteString checkLowercase(ByteString name) throws IOException {
/* 1 */             name.getClass();
/* 4 */             int size = name.size();
/* 8 */             int i = 0;
/* 9 */             while (i < size) {
/* 11 */                int i2 = i + 1;
/* 13 */                byte b = name.getByte(i);
/* 19 */                if (65 <= b && b <= 90) {
/* 36 */                    ds0.m3195l(Intrinsics.m6219d(name.utf8(), "PROTOCOL_ERROR response malformed: mixed case name: "));
/* 39 */                    return null;
                        }
/* 41 */                i = i2;
                    }
/* 43 */            return name;
                }

                public final Map<ByteString, Integer> getNAME_TO_FIRST_INDEX() {
/* 1 */             return NAME_TO_FIRST_INDEX;
                }

                public final Header[] getSTATIC_HEADER_TABLE() {
/* 1 */             return STATIC_HEADER_TABLE;
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\u0018\u00002\u00020\u0001B#\b\u0007\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u0013\u001a\u00020\u0014H\u0002J\b\u0010\u0015\u001a\u00020\u0014H\u0002J\u0010\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0003H\u0002J\u0010\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u000bH\u0002J\u000e\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0002\u001a\u00020\u0003J\u000e\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u001dJ\u0014\u0010\u001e\u001a\u00020\u00142\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000b0 J\u001e\u0010!\u001a\u00020\u00142\u0006\u0010\"\u001a\u00020\u00032\u0006\u0010#\u001a\u00020\u00032\u0006\u0010$\u001a\u00020\u0003R\u001c\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\fR\u0012\u0010\r\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u000f\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0010\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006%"}, m6176d2 = {"Lokhttp3/internal/http2/Hpack$Writer;", HttpUrl.FRAGMENT_ENCODE_SET, "headerTableSizeSetting", HttpUrl.FRAGMENT_ENCODE_SET, "useCompression", HttpUrl.FRAGMENT_ENCODE_SET, "out", "Lokio/Buffer;", "(IZLokio/Buffer;)V", "dynamicTable", HttpUrl.FRAGMENT_ENCODE_SET, "Lokhttp3/internal/http2/Header;", "[Lokhttp3/internal/http2/Header;", "dynamicTableByteCount", "emitDynamicTableSizeUpdate", "headerCount", "maxDynamicTableByteCount", "nextHeaderIndex", "smallestHeaderTableSizeSetting", "adjustDynamicTableByteCount", HttpUrl.FRAGMENT_ENCODE_SET, "clearDynamicTable", "evictToRecoverBytes", "bytesToRecover", "insertIntoDynamicTable", "entry", "resizeHeaderTable", "writeByteString", SharedDataContentProvider.BASE_PATH, "Lokio/ByteString;", "writeHeaders", "headerBlock", HttpUrl.FRAGMENT_ENCODE_SET, "writeInt", FirebaseAnalytics.Param.VALUE, "prefixMask", "bits", "okhttp"}, m6177k = 1, m6178mv = {1, 6, 0}, m6180xi = 48)
/* 30 */        public static final class Writer {
                    public Header[] dynamicTable;
                    public int dynamicTableByteCount;
                    private boolean emitDynamicTableSizeUpdate;
                    public int headerCount;
                    public int headerTableSizeSetting;
                    public int maxDynamicTableByteCount;
                    private int nextHeaderIndex;
                    private final Buffer out;
                    private int smallestHeaderTableSizeSetting;
                    private final boolean useCompression;

                    public Writer(int i, boolean z, Buffer buffer) {
/* 1 */                 buffer.getClass();
/* 7 */                 this.headerTableSizeSetting = i;
/* 9 */                 this.useCompression = z;
/* 11 */                this.out = buffer;
/* 16 */                this.smallestHeaderTableSizeSetting = AbstractC0208c9.API_PRIORITY_OTHER;
/* 18 */                this.maxDynamicTableByteCount = i;
/* 22 */                Header[] headerArr = new Header[8];
/* 24 */                this.dynamicTable = headerArr;
/* 29 */                this.nextHeaderIndex = headerArr.length - 1;
                    }

                    private final void adjustDynamicTableByteCount() {
/* 1 */                 int i = this.maxDynamicTableByteCount;
/* 3 */                 int i2 = this.dynamicTableByteCount;
/* 5 */                 if (i < i2) {
/* 7 */                     if (i == 0) {
/* 9 */                         clearDynamicTable();
                            } else {
/* 14 */                        evictToRecoverBytes(i2 - i);
                            }
                        }
                    }

                    private final void clearDynamicTable() {
/* 1 */                 Header[] headerArr = this.dynamicTable;
/* 5 */                 C1960nd.m6968f(headerArr, 0, headerArr.length);
/* 13 */                this.nextHeaderIndex = this.dynamicTable.length - 1;
/* 15 */                this.headerCount = 0;
/* 17 */                this.dynamicTableByteCount = 0;
                    }

                    private final int evictToRecoverBytes(int bytesToRecover) {
                        int i;
/* 1 */                 int i2 = 0;
/* 2 */                 if (bytesToRecover > 0) {
/* 6 */                     int length = this.dynamicTable.length;
                            while (true) {
/* 7 */                         length--;
/* 9 */                         i = this.nextHeaderIndex;
/* 11 */                        if (length < i || bytesToRecover <= 0) {
                                    break;
                                }
/* 17 */                        Header header = this.dynamicTable[length];
/* 19 */                        header.getClass();
/* 24 */                        bytesToRecover -= header.hpackSize;
/* 25 */                        int i3 = this.dynamicTableByteCount;
/* 29 */                        Header header2 = this.dynamicTable[length];
/* 31 */                        header2.getClass();
/* 37 */                        this.dynamicTableByteCount = i3 - header2.hpackSize;
/* 43 */                        this.headerCount--;
/* 45 */                        i2++;
                            }
/* 50 */                    Header[] headerArr = this.dynamicTable;
/* 59 */                    System.arraycopy(headerArr, i + 1, headerArr, i + 1 + i2, this.headerCount);
/* 62 */                    Header[] headerArr2 = this.dynamicTable;
/* 64 */                    int i4 = this.nextHeaderIndex;
/* 72 */                    Arrays.fill(headerArr2, i4 + 1, i4 + 1 + i2, (Object) null);
/* 78 */                    this.nextHeaderIndex += i2;
                        }
/* 80 */                return i2;
                    }

                    private final void insertIntoDynamicTable(Header entry) {
/* 1 */                 int i = entry.hpackSize;
/* 3 */                 int i2 = this.maxDynamicTableByteCount;
/* 5 */                 if (i > i2) {
/* 7 */                     clearDynamicTable();
/* 10 */                    return;
                        }
/* 15 */                evictToRecoverBytes((this.dynamicTableByteCount + i) - i2);
/* 20 */                int i3 = this.headerCount + 1;
/* 22 */                Header[] headerArr = this.dynamicTable;
/* 25 */                if (i3 > headerArr.length) {
/* 30 */                    Header[] headerArr2 = new Header[headerArr.length * 2];
/* 35 */                    System.arraycopy(headerArr, 0, headerArr2, headerArr.length, headerArr.length);
/* 43 */                    this.nextHeaderIndex = this.dynamicTable.length - 1;
/* 45 */                    this.dynamicTable = headerArr2;
                        }
/* 47 */                int i4 = this.nextHeaderIndex;
/* 51 */                this.nextHeaderIndex = i4 - 1;
/* 55 */                this.dynamicTable[i4] = entry;
/* 61 */                this.headerCount++;
/* 66 */                this.dynamicTableByteCount += i;
                    }

                    public final void resizeHeaderTable(int headerTableSizeSetting) {
/* 1 */                 this.headerTableSizeSetting = headerTableSizeSetting;
/* 5 */                 int iMin = Math.min(headerTableSizeSetting, 16384);
/* 9 */                 int i = this.maxDynamicTableByteCount;
/* 11 */                if (i == iMin) {
/* 13 */                    return;
                        }
/* 14 */                if (iMin < i) {
/* 22 */                    this.smallestHeaderTableSizeSetting = Math.min(this.smallestHeaderTableSizeSetting, iMin);
                        }
/* 25 */                this.emitDynamicTableSizeUpdate = true;
/* 27 */                this.maxDynamicTableByteCount = iMin;
/* 29 */                adjustDynamicTableByteCount();
                    }

                    public final void writeByteString(ByteString data) throws IOException {
/* 1 */                 data.getClass();
/* 8 */                 if (this.useCompression) {
/* 10 */                    Huffman huffman = Huffman.INSTANCE;
/* 20 */                    if (huffman.encodedLength(data) < data.size()) {
/* 24 */                        Buffer buffer = new Buffer();
/* 27 */                        huffman.encode(data, buffer);
/* 30 */                        ByteString byteString = buffer.readByteString();
/* 40 */                        writeInt(byteString.size(), 127, 128);
/* 45 */                        this.out.write(byteString);
/* 48 */                        return;
                            }
                        }
/* 54 */                writeInt(data.size(), 127, 0);
/* 59 */                this.out.write(data);
                    }

                    /* JADX WARN: Code duplicated, block: B:22:0x0077  */
                    public final void writeHeaders(List<Header> headerBlock) throws IOException {
                        int length;
                        int length2;
/* 1 */                 headerBlock.getClass();
/* 7 */                 if (this.emitDynamicTableSizeUpdate) {
/* 9 */                     int i = this.smallestHeaderTableSizeSetting;
/* 17 */                    if (i < this.maxDynamicTableByteCount) {
/* 19 */                        writeInt(i, 31, 32);
                            }
/* 22 */                    this.emitDynamicTableSizeUpdate = false;
/* 27 */                    this.smallestHeaderTableSizeSetting = AbstractC0208c9.API_PRIORITY_OTHER;
/* 31 */                    writeInt(this.maxDynamicTableByteCount, 31, 32);
                        }
/* 34 */                int size = headerBlock.size();
/* 38 */                int i2 = 0;
/* 39 */                while (i2 < size) {
/* 41 */                    int i3 = i2 + 1;
/* 43 */                    Header header = headerBlock.get(i2);
/* 51 */                    ByteString asciiLowercase = header.name.toAsciiLowercase();
/* 55 */                    ByteString byteString = header.value;
/* 57 */                    Hpack hpack = Hpack.INSTANCE;
/* 63 */                    Integer num = hpack.getNAME_TO_FIRST_INDEX().get(asciiLowercase);
/* 70 */                    if (num != null) {
/* 72 */                        int iIntValue = num.intValue();
/* 76 */                        length2 = iIntValue + 1;
/* 79 */                        if (2 > length2 || length2 >= 8) {
/* 120 */                           length = length2;
/* 121 */                           length2 = -1;
                                } else if (Intrinsics.m6216a(hpack.getSTATIC_HEADER_TABLE()[iIntValue].value, byteString)) {
/* 99 */                            length = length2;
                                } else if (Intrinsics.m6216a(hpack.getSTATIC_HEADER_TABLE()[length2].value, byteString)) {
/* 117 */                           length = length2;
/* 115 */                           length2 = iIntValue + 2;
                                } else {
/* 120 */                           length = length2;
/* 121 */                           length2 = -1;
                                }
                            } else {
/* 123 */                       length = -1;
/* 124 */                       length2 = -1;
                            }
/* 125 */                   if (length2 == -1) {
/* 129 */                       int i4 = this.nextHeaderIndex + 1;
/* 133 */                       int length3 = this.dynamicTable.length;
/* 134 */                       while (i4 < length3) {
/* 136 */                           int i5 = i4 + 1;
/* 140 */                           Header header2 = this.dynamicTable[i4];
/* 142 */                           header2.getClass();
/* 151 */                           if (Intrinsics.m6216a(header2.name, asciiLowercase)) {
/* 155 */                               Header header3 = this.dynamicTable[i4];
/* 157 */                               header3.getClass();
/* 166 */                               if (Intrinsics.m6216a(header3.value, byteString)) {
/* 178 */                                   length2 = Hpack.INSTANCE.getSTATIC_HEADER_TABLE().length + (i4 - this.nextHeaderIndex);
                                            break;
                                        } else if (length == -1) {
/* 192 */                                   length = Hpack.INSTANCE.getSTATIC_HEADER_TABLE().length + (i4 - this.nextHeaderIndex);
                                        }
                                    }
/* 193 */                           i4 = i5;
                                }
                            }
/* 195 */                   if (length2 != -1) {
/* 201 */                       writeInt(length2, 127, 128);
                            } else if (length == -1) {
/* 211 */                       this.out.writeByte(64);
/* 214 */                       writeByteString(asciiLowercase);
/* 217 */                       writeByteString(byteString);
/* 220 */                       insertIntoDynamicTable(header);
                            } else if (!asciiLowercase.startsWith(Header.PSEUDO_PREFIX) || Intrinsics.m6216a(Header.TARGET_AUTHORITY, asciiLowercase)) {
/* 251 */                       writeInt(length, Hpack.PREFIX_6_BITS, 64);
/* 254 */                       writeByteString(byteString);
/* 257 */                       insertIntoDynamicTable(header);
                            } else {
/* 242 */                       writeInt(length, 15, 0);
/* 245 */                       writeByteString(byteString);
                            }
/* 260 */                   i2 = i3;
                        }
                    }

                    public final void writeInt(int value, int prefixMask, int bits) {
/* 1 */                 Buffer buffer = this.out;
/* 3 */                 if (value < prefixMask) {
/* 7 */                     buffer.writeByte(bits | value);
/* 10 */                    return;
                        }
/* 12 */                buffer.writeByte(bits | prefixMask);
/* 15 */                int i = value - prefixMask;
                        while (true) {
/* 16 */                    Buffer buffer2 = this.out;
/* 20 */                    if (i < 128) {
/* 31 */                        buffer2.writeByte(i);
/* 34 */                        return;
                            } else {
/* 25 */                        buffer2.writeByte(128 | (i & 127));
/* 28 */                        i >>>= 7;
                            }
                        }
                    }

                    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
/* 31 */            public Writer(Buffer buffer) {
                        this(0, false, buffer, 3, null);
/* 32 */                buffer.getClass();
                    }

                    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
/* 32 */            public Writer(int i, Buffer buffer) {
                        this(i, false, buffer, 2, null);
/* 33 */                buffer.getClass();
                    }

/* 33 */            public /* synthetic */ Writer(int i, boolean z, Buffer buffer, int i2, DefaultConstructorMarker defaultConstructorMarker) {
/* 34 */                this((i2 & 1) != 0 ? 4096 : i, (i2 & 2) != 0 ? true : z, buffer);
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\b\u0010\u0012\u001a\u00020\u0013H\u0002J\b\u0010\u0014\u001a\u00020\u0013H\u0002J\u0010\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0005H\u0002J\u0010\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0005H\u0002J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\n0\u001aJ\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0016\u001a\u00020\u0005H\u0002J\u0018\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\nH\u0002J\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010\u0016\u001a\u00020\u0005H\u0002J\u0006\u0010\u0006\u001a\u00020\u0005J\b\u0010!\u001a\u00020\u0005H\u0002J\u0006\u0010\"\u001a\u00020\u001cJ\u0006\u0010#\u001a\u00020\u0013J\u0010\u0010$\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0005H\u0002J\u0016\u0010%\u001a\u00020\u00052\u0006\u0010&\u001a\u00020\u00052\u0006\u0010'\u001a\u00020\u0005J\u0010\u0010(\u001a\u00020\u00132\u0006\u0010)\u001a\u00020\u0005H\u0002J\b\u0010*\u001a\u00020\u0013H\u0002J\u0010\u0010+\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0005H\u0002J\b\u0010,\u001a\u00020\u0013H\u0002R\u001c\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0012\u0010\f\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\r\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006-"}, m6176d2 = {"Lokhttp3/internal/http2/Hpack$Reader;", HttpUrl.FRAGMENT_ENCODE_SET, FirebaseAnalytics.Param.SOURCE, "Lokio/Source;", "headerTableSizeSetting", HttpUrl.FRAGMENT_ENCODE_SET, "maxDynamicTableByteCount", "(Lokio/Source;II)V", "dynamicTable", HttpUrl.FRAGMENT_ENCODE_SET, "Lokhttp3/internal/http2/Header;", "[Lokhttp3/internal/http2/Header;", "dynamicTableByteCount", "headerCount", "headerList", HttpUrl.FRAGMENT_ENCODE_SET, "nextHeaderIndex", "Lokio/BufferedSource;", "adjustDynamicTableByteCount", HttpUrl.FRAGMENT_ENCODE_SET, "clearDynamicTable", "dynamicTableIndex", FirebaseAnalytics.Param.INDEX, "evictToRecoverBytes", "bytesToRecover", "getAndResetHeaderList", HttpUrl.FRAGMENT_ENCODE_SET, "getName", "Lokio/ByteString;", "insertIntoDynamicTable", "entry", "isStaticHeader", HttpUrl.FRAGMENT_ENCODE_SET, "readByte", "readByteString", "readHeaders", "readIndexedHeader", "readInt", "firstByte", "prefixMask", "readLiteralHeaderWithIncrementalIndexingIndexedName", "nameIndex", "readLiteralHeaderWithIncrementalIndexingNewName", "readLiteralHeaderWithoutIndexingIndexedName", "readLiteralHeaderWithoutIndexingNewName", "okhttp"}, m6177k = 1, m6178mv = {1, 6, 0}, m6180xi = 48)
/* 34 */        public static final class Reader {
                    public Header[] dynamicTable;
                    public int dynamicTableByteCount;
                    public int headerCount;
                    private final List<Header> headerList;
                    private final int headerTableSizeSetting;
                    private int maxDynamicTableByteCount;
                    private int nextHeaderIndex;
                    private final BufferedSource source;

                    public Reader(Source source, int i, int i2) {
/* 1 */                 source.getClass();
/* 7 */                 this.headerTableSizeSetting = i;
/* 9 */                 this.maxDynamicTableByteCount = i2;
/* 16 */                this.headerList = new ArrayList();
/* 22 */                this.source = Okio.buffer(source);
/* 26 */                Header[] headerArr = new Header[8];
/* 28 */                this.dynamicTable = headerArr;
/* 33 */                this.nextHeaderIndex = headerArr.length - 1;
                    }

                    private final void adjustDynamicTableByteCount() {
/* 1 */                 int i = this.maxDynamicTableByteCount;
/* 3 */                 int i2 = this.dynamicTableByteCount;
/* 5 */                 if (i < i2) {
/* 7 */                     if (i == 0) {
/* 9 */                         clearDynamicTable();
                            } else {
/* 14 */                        evictToRecoverBytes(i2 - i);
                            }
                        }
                    }

                    private final void clearDynamicTable() {
/* 1 */                 Header[] headerArr = this.dynamicTable;
/* 5 */                 C1960nd.m6968f(headerArr, 0, headerArr.length);
/* 13 */                this.nextHeaderIndex = this.dynamicTable.length - 1;
/* 15 */                this.headerCount = 0;
/* 17 */                this.dynamicTableByteCount = 0;
                    }

                    private final int dynamicTableIndex(int index) {
/* 5 */                 return this.nextHeaderIndex + 1 + index;
                    }

                    private final int evictToRecoverBytes(int bytesToRecover) {
                        int i;
/* 1 */                 int i2 = 0;
/* 2 */                 if (bytesToRecover > 0) {
/* 6 */                     int length = this.dynamicTable.length;
                            while (true) {
/* 7 */                         length--;
/* 9 */                         i = this.nextHeaderIndex;
/* 11 */                        if (length < i || bytesToRecover <= 0) {
                                    break;
                                }
/* 17 */                        Header header = this.dynamicTable[length];
/* 19 */                        header.getClass();
/* 22 */                        int i3 = header.hpackSize;
/* 24 */                        bytesToRecover -= i3;
/* 28 */                        this.dynamicTableByteCount -= i3;
/* 34 */                        this.headerCount--;
/* 36 */                        i2++;
                            }
/* 41 */                    Header[] headerArr = this.dynamicTable;
/* 50 */                    System.arraycopy(headerArr, i + 1, headerArr, i + 1 + i2, this.headerCount);
/* 56 */                    this.nextHeaderIndex += i2;
                        }
/* 58 */                return i2;
                    }

                    private final ByteString getName(int index) throws IOException {
/* 5 */                 if (isStaticHeader(index)) {
/* 15 */                    return Hpack.INSTANCE.getSTATIC_HEADER_TABLE()[index].name;
                        }
/* 27 */                int iDynamicTableIndex = dynamicTableIndex(index - Hpack.INSTANCE.getSTATIC_HEADER_TABLE().length);
/* 31 */                if (iDynamicTableIndex >= 0) {
/* 33 */                    Header[] headerArr = this.dynamicTable;
/* 36 */                    if (iDynamicTableIndex < headerArr.length) {
/* 38 */                        Header header = headerArr[iDynamicTableIndex];
/* 40 */                        header.getClass();
/* 43 */                        return header.name;
                            }
                        }
/* 58 */                ds0.m3195l(Intrinsics.m6219d(Integer.valueOf(index + 1), "Header index too large "));
/* 61 */                return null;
                    }

                    private final void insertIntoDynamicTable(int index, Header entry) {
/* 3 */                 this.headerList.add(entry);
/* 6 */                 int i = entry.hpackSize;
/* 9 */                 if (index != -1) {
/* 17 */                    Header header = this.dynamicTable[dynamicTableIndex(index)];
/* 19 */                    header.getClass();
/* 24 */                    i -= header.hpackSize;
                        }
/* 25 */                int i2 = this.maxDynamicTableByteCount;
/* 27 */                if (i > i2) {
/* 29 */                    clearDynamicTable();
/* 32 */                    return;
                        }
/* 37 */                int iEvictToRecoverBytes = evictToRecoverBytes((this.dynamicTableByteCount + i) - i2);
/* 41 */                if (index == -1) {
/* 45 */                    int i3 = this.headerCount + 1;
/* 47 */                    Header[] headerArr = this.dynamicTable;
/* 50 */                    if (i3 > headerArr.length) {
/* 55 */                        Header[] headerArr2 = new Header[headerArr.length * 2];
/* 60 */                        System.arraycopy(headerArr, 0, headerArr2, headerArr.length, headerArr.length);
/* 68 */                        this.nextHeaderIndex = this.dynamicTable.length - 1;
/* 70 */                        this.dynamicTable = headerArr2;
                            }
/* 72 */                    int i4 = this.nextHeaderIndex;
/* 76 */                    this.nextHeaderIndex = i4 - 1;
/* 80 */                    this.dynamicTable[i4] = entry;
/* 86 */                    this.headerCount++;
                        } else {
/* 97 */                    this.dynamicTable[dynamicTableIndex(index) + iEvictToRecoverBytes + index] = entry;
                        }
/* 102 */               this.dynamicTableByteCount += i;
                    }

                    private final boolean isStaticHeader(int index) {
                        return index >= 0 && index <= Hpack.INSTANCE.getSTATIC_HEADER_TABLE().length - 1;
                    }

                    private final int readByte() throws IOException {
/* 9 */                 return Util.and(this.source.readByte(), 255);
                    }

                    private final void readIndexedHeader(int index) throws IOException {
/* 5 */                 if (isStaticHeader(index)) {
/* 17 */                    this.headerList.add(Hpack.INSTANCE.getSTATIC_HEADER_TABLE()[index]);
/* 20 */                    return;
                        }
/* 30 */                int iDynamicTableIndex = dynamicTableIndex(index - Hpack.INSTANCE.getSTATIC_HEADER_TABLE().length);
/* 34 */                if (iDynamicTableIndex >= 0) {
/* 36 */                    Header[] headerArr = this.dynamicTable;
/* 39 */                    if (iDynamicTableIndex < headerArr.length) {
/* 41 */                        List<Header> list = this.headerList;
/* 43 */                        Header header = headerArr[iDynamicTableIndex];
/* 45 */                        header.getClass();
/* 48 */                        list.add(header);
/* 51 */                        return;
                            }
                        }
/* 64 */                ds0.m3195l(Intrinsics.m6219d(Integer.valueOf(index + 1), "Header index too large "));
                    }

                    private final void readLiteralHeaderWithIncrementalIndexingIndexedName(int nameIndex) throws IOException {
/* 15 */                insertIntoDynamicTable(-1, new Header(getName(nameIndex), readByteString()));
                    }

                    private final void readLiteralHeaderWithIncrementalIndexingNewName() throws IOException {
/* 21 */                insertIntoDynamicTable(-1, new Header(Hpack.INSTANCE.checkLowercase(readByteString()), readByteString()));
                    }

                    private final void readLiteralHeaderWithoutIndexingIndexedName(int index) throws IOException {
/* 16 */                this.headerList.add(new Header(getName(index), readByteString()));
                    }

                    private final void readLiteralHeaderWithoutIndexingNewName() throws IOException {
/* 22 */                this.headerList.add(new Header(Hpack.INSTANCE.checkLowercase(readByteString()), readByteString()));
                    }

                    public final List<Header> getAndResetHeaderList() {
/* 3 */                 List<Header> listM6192K = CollectionsKt.m6192K(this.headerList);
/* 9 */                 this.headerList.clear();
/* 12 */                return listM6192K;
                    }

                    /* JADX INFO: renamed from: maxDynamicTableByteCount, reason: from getter */
                    public final int getMaxDynamicTableByteCount() {
/* 1 */                 return this.maxDynamicTableByteCount;
                    }

                    public final ByteString readByteString() throws IOException {
/* 1 */                 int i = readByte();
/* 13 */                boolean z = (i & 128) == 128;
/* 16 */                long j = readInt(i, 127);
/* 21 */                if (!z) {
/* 42 */                    return this.source.readByteString(j);
                        }
/* 25 */                Buffer buffer = new Buffer();
/* 32 */                Huffman.INSTANCE.decode(this.source, j, buffer);
/* 35 */                return buffer.readByteString();
                    }

                    public final void readHeaders() throws IOException {
/* 7 */                 while (!this.source.exhausted()) {
/* 17 */                    int iAnd = Util.and(this.source.readByte(), 255);
/* 23 */                    if (iAnd == 128) {
/* 128 */                       ds0.m3195l("index == 0");
/* 131 */                       return;
                            }
/* 27 */                    if ((iAnd & 128) == 128) {
/* 37 */                        readIndexedHeader(readInt(iAnd, 127) - 1);
                            } else if (iAnd == 64) {
/* 45 */                        readLiteralHeaderWithIncrementalIndexingNewName();
                            } else if ((iAnd & 64) == 64) {
/* 61 */                        readLiteralHeaderWithIncrementalIndexingIndexedName(readInt(iAnd, Hpack.PREFIX_6_BITS) - 1);
                            } else if ((iAnd & 32) == 32) {
/* 73 */                        int i = readInt(iAnd, 31);
/* 77 */                        this.maxDynamicTableByteCount = i;
/* 79 */                        if (i < 0 || i > this.headerTableSizeSetting) {
/* 99 */                            ds0.m3195l(Intrinsics.m6219d(Integer.valueOf(i), "Invalid dynamic table size update "));
/* 102 */                           return;
                                }
/* 85 */                        adjustDynamicTableByteCount();
                            } else if (iAnd == 16 || iAnd == 0) {
/* 122 */                       readLiteralHeaderWithoutIndexingNewName();
                            } else {
/* 118 */                       readLiteralHeaderWithoutIndexingIndexedName(readInt(iAnd, 15) - 1);
                            }
                        }
                    }

                    public final int readInt(int firstByte, int prefixMask) throws IOException {
/* 1 */                 int i = firstByte & prefixMask;
/* 2 */                 if (i < prefixMask) {
/* 4 */                     return i;
                        }
/* 5 */                 int i2 = 0;
                        while (true) {
/* 6 */                     int i3 = readByte();
/* 12 */                    if ((i3 & 128) == 0) {
/* 23 */                        return prefixMask + (i3 << i2);
                            }
/* 17 */                    prefixMask += (i3 & 127) << i2;
/* 18 */                    i2 += 7;
                        }
                    }

                    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
/* 35 */            public Reader(Source source, int i) {
                        this(source, i, 0, 4, null);
/* 36 */                source.getClass();
                    }

/* 36 */            public /* synthetic */ Reader(Source source, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
/* 37 */                this(source, i, (i3 & 4) != 0 ? i : i2);
                    }
                }
            }
