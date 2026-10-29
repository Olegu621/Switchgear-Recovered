            package okhttp3.internal.http2;

            import androidx.core.app.NotificationCompat;
            import com.google.firebase.analytics.FirebaseAnalytics;
            import com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs.ChromeCustomTabsActivity;
            import java.io.IOException;
            import java.util.Arrays;
            import kotlin.Metadata;
            import okhttp3.HttpUrl;
            import okhttp3.internal.Util;
            import okio.BufferedSink;
            import okio.BufferedSource;
            import okio.ByteString;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            @Metadata(m6175d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u001aB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0002J\u001e\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015J\u0016\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u0017R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, m6176d2 = {"Lokhttp3/internal/http2/Huffman;", HttpUrl.FRAGMENT_ENCODE_SET, "()V", "CODES", HttpUrl.FRAGMENT_ENCODE_SET, "CODE_BIT_COUNTS", HttpUrl.FRAGMENT_ENCODE_SET, "root", "Lokhttp3/internal/http2/Huffman$Node;", "addCode", HttpUrl.FRAGMENT_ENCODE_SET, "symbol", HttpUrl.FRAGMENT_ENCODE_SET, "code", "codeBitCount", "decode", FirebaseAnalytics.Param.SOURCE, "Lokio/BufferedSource;", "byteCount", HttpUrl.FRAGMENT_ENCODE_SET, "sink", "Lokio/BufferedSink;", "encode", "Lokio/ByteString;", "encodedLength", "bytes", "Node", "okhttp"}, m6177k = 1, m6178mv = {1, 6, 0}, m6180xi = 48)
/* 15 */    public final class Huffman {
                public static final Huffman INSTANCE = new Huffman();
                private static final int[] CODES = {8184, 8388568, 268435426, 268435427, 268435428, 268435429, 268435430, 268435431, 268435432, 16777194, 1073741820, 268435433, 268435434, 1073741821, 268435435, 268435436, 268435437, 268435438, 268435439, 268435440, 268435441, 268435442, 1073741822, 268435443, 268435444, 268435445, 268435446, 268435447, 268435448, 268435449, 268435450, 268435451, 20, 1016, 1017, 4090, 8185, 21, 248, 2042, 1018, 1019, 249, 2043, 250, 22, 23, 24, 0, 1, 2, 25, 26, 27, 28, 29, 30, 31, 92, 251, 32764, 32, 4091, 1020, 8186, 33, 93, 94, 95, 96, 97, 98, 99, 100, ChromeCustomTabsActivity.NO_HISTORY_CHROME_CUSTOM_TAB_REQUEST_CODE, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 252, 115, 253, 8187, 524272, 8188, 16380, 34, 32765, 3, 35, 4, 36, 5, 37, 38, 39, 6, 116, 117, 40, 41, 42, 7, 43, 118, 44, 8, 9, 45, 119, 120, 121, 122, 123, 32766, 2044, 16381, 8189, 268435452, 1048550, 4194258, 1048551, 1048552, 4194259, 4194260, 4194261, 8388569, 4194262, 8388570, 8388571, 8388572, 8388573, 8388574, 16777195, 8388575, 16777196, 16777197, 4194263, 8388576, 16777198, 8388577, 8388578, 8388579, 8388580, 2097116, 4194264, 8388581, 4194265, 8388582, 8388583, 16777199, 4194266, 2097117, 1048553, 4194267, 4194268, 8388584, 8388585, 2097118, 8388586, 4194269, 4194270, 16777200, 2097119, 4194271, 8388587, 8388588, 2097120, 2097121, 4194272, 2097122, 8388589, 4194273, 8388590, 8388591, 1048554, 4194274, 4194275, 4194276, 8388592, 4194277, 4194278, 8388593, 67108832, 67108833, 1048555, 524273, 4194279, 8388594, 4194280, 33554412, 67108834, 67108835, 67108836, 134217694, 134217695, 67108837, 16777201, 33554413, 524274, 2097123, 67108838, 134217696, 134217697, 67108839, 134217698, 16777202, 2097124, 2097125, 67108840, 67108841, 268435453, 134217699, 134217700, 134217701, 1048556, 16777203, 1048557, 2097126, 4194281, 2097127, 2097128, 8388595, 4194282, 4194283, 33554414, 33554415, 16777204, 16777205, 67108842, 8388596, 67108843, 134217702, 67108844, 67108845, 134217703, 134217704, 134217705, 134217706, 134217707, 268435454, 134217708, 134217709, 134217710, 134217711, 134217712, 67108846};
                private static final byte[] CODE_BIT_COUNTS = {13, 23, 28, 28, 28, 28, 28, 28, 28, 24, 30, 28, 28, 30, 28, 28, 28, 28, 28, 28, 28, 28, 30, 28, 28, 28, 28, 28, 28, 28, 28, 28, 6, 10, 10, 12, 13, 6, 8, 11, 10, 10, 8, 11, 8, 6, 6, 6, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 7, 8, 15, 6, 12, 10, 13, 6, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 8, 7, 8, 13, 19, 13, 14, 6, 15, 5, 6, 5, 6, 5, 6, 6, 6, 5, 7, 7, 6, 6, 6, 5, 6, 7, 6, 5, 5, 6, 7, 7, 7, 7, 7, 15, 11, 14, 13, 28, 20, 22, 20, 20, 22, 22, 22, 23, 22, 23, 23, 23, 23, 23, 24, 23, 24, 24, 22, 23, 24, 23, 23, 23, 23, 21, 22, 23, 22, 23, 23, 24, 22, 21, 20, 22, 22, 23, 23, 21, 23, 22, 22, 24, 21, 22, 23, 23, 21, 21, 22, 21, 23, 22, 23, 23, 20, 22, 22, 22, 23, 22, 22, 23, 26, 26, 20, 19, 22, 23, 22, 25, 26, 26, 26, 27, 27, 26, 24, 25, 19, 21, 26, 27, 27, 26, 27, 24, 21, 21, 26, 26, 28, 27, 27, 27, 20, 24, 20, 21, 22, 21, 21, 23, 22, 22, 25, 25, 24, 24, 26, 23, 26, 27, 26, 26, 27, 27, 27, 27, 27, 28, 27, 27, 27, 27, 27, 26};
                private static final Node root = new Node();

                static {
/* 32 */            for (int i = 0; i < 256; i++) {
/* 46 */                INSTANCE.addCode(i, CODES[i], CODE_BIT_COUNTS[i]);
                    }
                }

                private Huffman() {
                }

                private final void addCode(int symbol, int code, int codeBitCount) {
/* 3 */             Node node = new Node(symbol, codeBitCount);
/* 6 */             Node node2 = root;
/* 10 */            while (codeBitCount > 8) {
/* 12 */                codeBitCount -= 8;
/* 16 */                int i = (code >>> codeBitCount) & 255;
/* 18 */                Node[] children = node2.getChildren();
/* 22 */                children.getClass();
/* 25 */                Node node3 = children[i];
/* 27 */                if (node3 == null) {
/* 31 */                    node3 = new Node();
/* 34 */                    children[i] = node3;
                        }
/* 36 */                node2 = node3;
                    }
/* 38 */            int i2 = 8 - codeBitCount;
/* 40 */            int i3 = (code << i2) & 255;
/* 44 */            Node[] children2 = node2.getChildren();
/* 48 */            children2.getClass();
/* 52 */            Arrays.fill(children2, i3, (1 << i2) + i3, node);
                }

                public final void decode(BufferedSource source, long byteCount, BufferedSink sink) throws IOException {
/* 1 */             source.getClass();
/* 4 */             sink.getClass();
/* 7 */             Node node = root;
/* 9 */             int iAnd = 0;
/* 12 */            long j = 0;
/* 13 */            int terminalBitCount = 0;
/* 18 */            while (j < byteCount) {
/* 22 */                j++;
/* 33 */                iAnd = (iAnd << 8) | Util.and(source.readByte(), 255);
/* 34 */                terminalBitCount += 8;
/* 38 */                while (terminalBitCount >= 8) {
/* 45 */                    Node[] children = node.getChildren();
/* 49 */                    children.getClass();
/* 52 */                    node = children[(iAnd >>> (terminalBitCount - 8)) & 255];
/* 54 */                    node.getClass();
/* 61 */                    if (node.getChildren() == null) {
/* 67 */                        sink.writeByte(node.getSymbol());
/* 74 */                        terminalBitCount -= node.getTerminalBitCount();
/* 75 */                        node = root;
                            } else {
/* 78 */                        terminalBitCount -= 8;
                            }
                        }
                    }
/* 81 */            while (terminalBitCount > 0) {
/* 88 */                Node[] children2 = node.getChildren();
/* 92 */                children2.getClass();
/* 95 */                Node node2 = children2[(iAnd << (8 - terminalBitCount)) & 255];
/* 97 */                node2.getClass();
/* 104 */               if (node2.getChildren() != null || node2.getTerminalBitCount() > terminalBitCount) {
/* 128 */                   return;
                        }
/* 117 */               sink.writeByte(node2.getSymbol());
/* 124 */               terminalBitCount -= node2.getTerminalBitCount();
/* 125 */               node = root;
                    }
                }

                public final void encode(ByteString source, BufferedSink sink) throws IOException {
/* 1 */             source.getClass();
/* 4 */             sink.getClass();
/* 7 */             int size = source.size();
/* 11 */            long j = 0;
/* 13 */            int i = 0;
/* 14 */            int i2 = 0;
/* 15 */            while (i < size) {
/* 17 */                int i3 = i + 1;
/* 25 */                int iAnd = Util.and(source.getByte(i), 255);
/* 31 */                int i4 = CODES[iAnd];
/* 35 */                byte b = CODE_BIT_COUNTS[iAnd];
/* 39 */                j = (j << b) | ((long) i4);
/* 40 */                i2 += b;
/* 43 */                while (i2 >= 8) {
/* 45 */                    i2 -= 8;
/* 50 */                    sink.writeByte((int) (j >> i2));
                        }
/* 54 */                i = i3;
                    }
/* 56 */            if (i2 > 0) {
/* 67 */                sink.writeByte((int) ((j << (8 - i2)) | (255 >>> i2)));
                    }
                }

                public final int encodedLength(ByteString bytes) {
/* 1 */             bytes.getClass();
/* 4 */             int size = bytes.size();
/* 8 */             long j = 0;
/* 10 */            int i = 0;
/* 11 */            while (i < size) {
/* 13 */                int i2 = i + 1;
/* 30 */                j += (long) CODE_BIT_COUNTS[Util.and(bytes.getByte(i), 255)];
/* 31 */                i = i2;
                    }
/* 39 */            return (int) ((j + 7) >> 3);
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u0017\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0002\u0010\u0006R\u001d\u0010\u0007\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0000\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006\u0010"}, m6176d2 = {"Lokhttp3/internal/http2/Huffman$Node;", HttpUrl.FRAGMENT_ENCODE_SET, "()V", "symbol", HttpUrl.FRAGMENT_ENCODE_SET, "bits", "(II)V", "children", HttpUrl.FRAGMENT_ENCODE_SET, "getChildren", "()[Lokhttp3/internal/http2/Huffman$Node;", "[Lokhttp3/internal/http2/Huffman$Node;", "getSymbol", "()I", "terminalBitCount", "getTerminalBitCount", "okhttp"}, m6177k = 1, m6178mv = {1, 6, 0}, m6180xi = 48)
/* 16 */        public static final class Node {
                    private final Node[] children;
                    private final int symbol;
                    private final int terminalBitCount;

                    public Node(int i, int i2) {
/* 5 */                 this.children = null;
/* 7 */                 this.symbol = i;
/* 9 */                 int i3 = i2 & 7;
/* 15 */                this.terminalBitCount = i3 == 0 ? 8 : i3;
                    }

                    public final Node[] getChildren() {
/* 1 */                 return this.children;
                    }

                    public final int getSymbol() {
/* 1 */                 return this.symbol;
                    }

                    public final int getTerminalBitCount() {
/* 1 */                 return this.terminalBitCount;
                    }

/* 17 */            public Node() {
/* 19 */                this.children = new Node[NotificationCompat.FLAG_LOCAL_ONLY];
/* 20 */                this.symbol = 0;
/* 21 */                this.terminalBitCount = 0;
                    }
                }
            }
