            package okio;

            import com.google.firebase.analytics.FirebaseAnalytics;
            import com.supercell.p007id.scid_plugin.platform_interface.SharedDataContentProvider;
            import io.flutter.plugin.editing.SpellCheckPlugin;
            import java.io.IOException;
            import java.io.InputStream;
            import java.io.ObjectInputStream;
            import java.io.ObjectOutputStream;
            import java.io.OutputStream;
            import java.io.Serializable;
            import java.lang.reflect.Field;
            import java.nio.ByteBuffer;
            import java.nio.charset.Charset;
            import java.security.InvalidKeyException;
            import java.security.MessageDigest;
            import java.security.NoSuchAlgorithmException;
            import java.util.Arrays;
            import javax.crypto.Mac;
            import javax.crypto.spec.SecretKeySpec;
            import kotlin.Metadata;
            import kotlin.jvm.internal.DefaultConstructorMarker;
            import kotlin.text.C1852e;
            import kotlin.text.Charsets;
            import okhttp3.HttpUrl;
            import p000.AbstractC0886en;
            import p000.C1951n4;
            import p000.C1960nd;
            import p000.ds0;
            import p000.fm0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            @Metadata(m6175d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u0000 ]2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001]B\u000f\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0010H\u0016J\b\u0010\u0018\u001a\u00020\u0010H\u0016J\u0011\u0010\u0019\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u0000H\u0096\u0002J,\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u00042\b\b\u0002\u0010\u001f\u001a\u00020\t2\u0006\u0010 \u001a\u00020\tH\u0016J\u0015\u0010!\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020\u0010H\u0010¢\u0006\u0002\b#J\u000e\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u0004J\u000e\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u0000J\u0013\u0010'\u001a\u00020%2\b\u0010\u001a\u001a\u0004\u0018\u00010(H\u0096\u0002J\u0016\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\tH\u0087\u0002¢\u0006\u0002\b,J\u0015\u0010,\u001a\u00020*2\u0006\u0010+\u001a\u00020\tH\u0007¢\u0006\u0002\b-J\r\u0010.\u001a\u00020\tH\u0010¢\u0006\u0002\b/J\b\u0010\b\u001a\u00020\tH\u0016J\b\u00100\u001a\u00020\u0010H\u0016J\u001d\u00101\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020\u00102\u0006\u00102\u001a\u00020\u0000H\u0010¢\u0006\u0002\b3J\u0010\u00104\u001a\u00020\u00002\u0006\u00102\u001a\u00020\u0000H\u0016J\u0010\u00105\u001a\u00020\u00002\u0006\u00102\u001a\u00020\u0000H\u0016J\u0010\u00106\u001a\u00020\u00002\u0006\u00102\u001a\u00020\u0000H\u0016J\u001a\u00107\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u00042\b\b\u0002\u00108\u001a\u00020\tH\u0017J\u001a\u00107\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u00108\u001a\u00020\tH\u0007J\r\u00109\u001a\u00020\u0004H\u0010¢\u0006\u0002\b:J\u0015\u0010;\u001a\u00020*2\u0006\u0010<\u001a\u00020\tH\u0010¢\u0006\u0002\b=J\u001a\u0010>\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u00042\b\b\u0002\u00108\u001a\u00020\tH\u0017J\u001a\u0010>\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u00108\u001a\u00020\tH\u0007J\u0006\u0010?\u001a\u00020\u0000J(\u0010@\u001a\u00020%2\u0006\u0010\u001d\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u00042\u0006\u0010A\u001a\u00020\t2\u0006\u0010 \u001a\u00020\tH\u0016J(\u0010@\u001a\u00020%2\u0006\u0010\u001d\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010A\u001a\u00020\t2\u0006\u0010 \u001a\u00020\tH\u0016J\u0010\u0010B\u001a\u00020\u001c2\u0006\u0010C\u001a\u00020DH\u0002J\u0006\u0010E\u001a\u00020\u0000J\u0006\u0010F\u001a\u00020\u0000J\u0006\u0010G\u001a\u00020\u0000J\r\u0010\u000e\u001a\u00020\tH\u0007¢\u0006\u0002\bHJ\u000e\u0010I\u001a\u00020%2\u0006\u0010J\u001a\u00020\u0004J\u000e\u0010I\u001a\u00020%2\u0006\u0010J\u001a\u00020\u0000J\u0010\u0010K\u001a\u00020\u00102\u0006\u0010L\u001a\u00020MH\u0016J\u001c\u0010N\u001a\u00020\u00002\b\b\u0002\u0010O\u001a\u00020\t2\b\b\u0002\u0010P\u001a\u00020\tH\u0017J\b\u0010Q\u001a\u00020\u0000H\u0016J\b\u0010R\u001a\u00020\u0000H\u0016J\b\u0010S\u001a\u00020\u0004H\u0016J\b\u0010T\u001a\u00020\u0010H\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010U\u001a\u00020\u001c2\u0006\u0010V\u001a\u00020WH\u0016J%\u0010U\u001a\u00020\u001c2\u0006\u0010X\u001a\u00020Y2\u0006\u0010\u001d\u001a\u00020\t2\u0006\u0010 \u001a\u00020\tH\u0010¢\u0006\u0002\bZJ\u0010\u0010[\u001a\u00020\u001c2\u0006\u0010V\u001a\u00020\\H\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\tX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\t8G¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000bR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006^"}, m6176d2 = {"Lokio/ByteString;", "Ljava/io/Serializable;", HttpUrl.FRAGMENT_ENCODE_SET, SharedDataContentProvider.BASE_PATH, HttpUrl.FRAGMENT_ENCODE_SET, "([B)V", "getData$okio", "()[B", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "getHashCode$okio", "()I", "setHashCode$okio", "(I)V", "size", "utf8", HttpUrl.FRAGMENT_ENCODE_SET, "getUtf8$okio", "()Ljava/lang/String;", "setUtf8$okio", "(Ljava/lang/String;)V", "asByteBuffer", "Ljava/nio/ByteBuffer;", "base64", "base64Url", "compareTo", "other", "copyInto", HttpUrl.FRAGMENT_ENCODE_SET, "offset", "target", "targetOffset", "byteCount", "digest", "algorithm", "digest$okio", "endsWith", HttpUrl.FRAGMENT_ENCODE_SET, "suffix", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "get", HttpUrl.FRAGMENT_ENCODE_SET, FirebaseAnalytics.Param.INDEX, "getByte", "-deprecated_getByte", "getSize", "getSize$okio", "hex", "hmac", "key", "hmac$okio", "hmacSha1", "hmacSha256", "hmacSha512", "indexOf", "fromIndex", "internalArray", "internalArray$okio", "internalGet", "pos", "internalGet$okio", "lastIndexOf", "md5", "rangeEquals", "otherOffset", "readObject", "in", "Ljava/io/ObjectInputStream;", "sha1", "sha256", "sha512", "-deprecated_size", "startsWith", "prefix", "string", "charset", "Ljava/nio/charset/Charset;", "substring", "beginIndex", SpellCheckPlugin.END_INDEX_KEY, "toAsciiLowercase", "toAsciiUppercase", "toByteArray", "toString", "write", "out", "Ljava/io/OutputStream;", "buffer", "Lokio/Buffer;", "write$okio", "writeObject", "Ljava/io/ObjectOutputStream;", "Companion", "okio"}, m6177k = 1, m6178mv = {1, 8, 0}, m6180xi = 48)
/* 2 */     public class ByteString implements Serializable, Comparable<ByteString> {

                /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE = new Companion(null);
                public static final ByteString EMPTY = new ByteString(new byte[0]);
                private static final long serialVersionUID = 1;
                private final byte[] data;
                private transient int hashCode;
                private transient String utf8;

                public ByteString(byte[] bArr) {
/* 1 */             bArr.getClass();
/* 7 */             this.data = bArr;
                }

                public static /* synthetic */ void copyInto$default(ByteString byteString, int i, byte[] bArr, int i2, int i3, int i4, Object obj) {
/* 1 */             if (obj != null) {
/* 20 */                C1951n4.m6866q("Super calls with default arguments not supported in this target, function: copyInto");
/* 23 */                return;
                    }
/* 6 */             if ((i4 & 1) != 0) {
/* 8 */                 i = 0;
                    }
/* 11 */            if ((i4 & 4) != 0) {
/* 13 */                i2 = 0;
                    }
/* 14 */            byteString.copyInto(i, bArr, i2, i3);
                }

                public static final ByteString decodeBase64(String str) {
/* 3 */             return INSTANCE.decodeBase64(str);
                }

                public static final ByteString decodeHex(String str) {
/* 3 */             return INSTANCE.decodeHex(str);
                }

                public static final ByteString encodeString(String str, Charset charset) {
/* 3 */             return INSTANCE.encodeString(str, charset);
                }

                public static final ByteString encodeUtf8(String str) {
/* 3 */             return INSTANCE.encodeUtf8(str);
                }

                public static /* synthetic */ int indexOf$default(ByteString byteString, ByteString byteString2, int i, int i2, Object obj) {
/* 1 */             if (obj != null) {
/* 15 */                C1951n4.m6866q("Super calls with default arguments not supported in this target, function: indexOf");
/* 18 */                return 0;
                    }
/* 5 */             if ((i2 & 2) != 0) {
/* 7 */                 i = 0;
                    }
/* 8 */             return byteString.indexOf(byteString2, i);
                }

                public static /* synthetic */ int lastIndexOf$default(ByteString byteString, ByteString byteString2, int i, int i2, Object obj) {
/* 1 */             if (obj != null) {
/* 18 */                C1951n4.m6866q("Super calls with default arguments not supported in this target, function: lastIndexOf");
/* 21 */                return 0;
                    }
/* 5 */             if ((i2 & 2) != 0) {
/* 7 */                 i = SegmentedByteString.getDEFAULT__ByteString_size();
                    }
/* 11 */            return byteString.lastIndexOf(byteString2, i);
                }

                /* JADX INFO: renamed from: of */
                public static final ByteString m7198of(ByteBuffer byteBuffer) {
/* 3 */             return INSTANCE.m7201of(byteBuffer);
                }

                public static final ByteString read(InputStream inputStream, int i) throws IOException {
/* 3 */             return INSTANCE.read(inputStream, i);
                }

                private final void readObject(ObjectInputStream in) throws IllegalAccessException, NoSuchFieldException, IOException {
/* 7 */             ByteString byteString = INSTANCE.read(in, in.readInt());
/* 15 */            Field declaredField = ByteString.class.getDeclaredField(SharedDataContentProvider.BASE_PATH);
/* 20 */            declaredField.setAccessible(true);
/* 25 */            declaredField.set(this, byteString.data);
                }

                public static /* synthetic */ ByteString substring$default(ByteString byteString, int i, int i2, int i3, Object obj) {
/* 1 */             if (obj != null) {
/* 23 */                C1951n4.m6866q("Super calls with default arguments not supported in this target, function: substring");
/* 26 */                return null;
                    }
/* 5 */             if ((i3 & 1) != 0) {
/* 7 */                 i = 0;
                    }
/* 10 */            if ((i3 & 2) != 0) {
/* 12 */                i2 = SegmentedByteString.getDEFAULT__ByteString_size();
                    }
/* 16 */            return byteString.substring(i, i2);
                }

                private final void writeObject(ObjectOutputStream out) throws IOException {
/* 4 */             out.writeInt(this.data.length);
/* 9 */             out.write(this.data);
                }

                /* JADX INFO: renamed from: -deprecated_getByte, reason: not valid java name */
                public final byte m10640deprecated_getByte(int index) {
/* 1 */             return getByte(index);
                }

                /* JADX INFO: renamed from: -deprecated_size, reason: not valid java name */
                public final int m10641deprecated_size() {
/* 1 */             return size();
                }

                public ByteBuffer asByteBuffer() {
/* 7 */             ByteBuffer byteBufferAsReadOnlyBuffer = ByteBuffer.wrap(this.data).asReadOnlyBuffer();
/* 11 */            byteBufferAsReadOnlyBuffer.getClass();
/* 14 */            return byteBufferAsReadOnlyBuffer;
                }

                public String base64() {
/* 7 */             return Base64.encodeBase64$default(getData(), null, 1, null);
                }

                public String base64Url() {
/* 9 */             return Base64.encodeBase64(getData(), Base64.getBASE64_URL_SAFE());
                }

                @Override // java.lang.Comparable
                public int compareTo(ByteString other) {
/* 1 */             other.getClass();
/* 4 */             int size = size();
/* 8 */             int size2 = other.size();
/* 12 */            int iMin = Math.min(size, size2);
/* 20 */            for (int i = 0; i < iMin; i++) {
/* 26 */                int i2 = getByte(i) & 255;
/* 32 */                int i3 = other.getByte(i) & 255;
/* 34 */                if (i2 != i3) {
                            return i2 < i3 ? -1 : 1;
                        }
                    }
/* 43 */            if (size == size2) {
/* 16 */                return 0;
                    }
                    return size < size2 ? -1 : 1;
                }

                public void copyInto(int offset, byte[] target, int targetOffset, int byteCount) {
/* 1 */             target.getClass();
/* 9 */             C1960nd.m6964b(getData(), targetOffset, target, offset, byteCount + offset);
                }

                public ByteString digest$okio(String algorithm) throws NoSuchAlgorithmException {
/* 1 */             algorithm.getClass();
/* 4 */             MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
/* 15 */            messageDigest.update(this.data, 0, size());
/* 18 */            byte[] bArrDigest = messageDigest.digest();
/* 24 */            bArrDigest.getClass();
/* 27 */            return new ByteString(bArrDigest);
                }

                public final boolean endsWith(ByteString suffix) {
/* 1 */             suffix.getClass();
/* 18 */            return rangeEquals(size() - suffix.size(), suffix, 0, suffix.size());
                }

                public boolean equals(Object other) {
/* 2 */             if (other == this) {
/* 1 */                 return true;
                    }
/* 8 */             if (other instanceof ByteString) {
/* 10 */                ByteString byteString = (ByteString) other;
/* 21 */                if (byteString.size() == getData().length && byteString.rangeEquals(0, getData(), 0, getData().length)) {
/* 1 */                     return true;
                        }
                    }
/* 7 */             return false;
                }

                public final byte getByte(int index) {
/* 1 */             return internalGet$okio(index);
                }

                /* JADX INFO: renamed from: getData$okio, reason: from getter */
                public final byte[] getData() {
/* 1 */             return this.data;
                }

                /* JADX INFO: renamed from: getHashCode$okio, reason: from getter */
                public final int getHashCode() {
/* 1 */             return this.hashCode;
                }

                public int getSize$okio() {
/* 5 */             return getData().length;
                }

                /* JADX INFO: renamed from: getUtf8$okio, reason: from getter */
                public final String getUtf8() {
/* 1 */             return this.utf8;
                }

                public int hashCode() {
/* 1 */             int hashCode = getHashCode();
/* 5 */             if (hashCode != 0) {
/* 7 */                 return hashCode;
                    }
/* 12 */            int iHashCode = Arrays.hashCode(getData());
/* 16 */            setHashCode$okio(iHashCode);
/* 19 */            return iHashCode;
                }

                public String hex() {
/* 8 */             char[] cArr = new char[getData().length * 2];
/* 16 */            int i = 0;
/* 17 */            for (byte b : getData()) {
/* 21 */                int i2 = i + 1;
/* 33 */                cArr[i] = okio.internal.ByteString.getHEX_DIGIT_CHARS()[(b >> 4) & 15];
/* 35 */                i += 2;
/* 45 */                cArr[i2] = okio.internal.ByteString.getHEX_DIGIT_CHARS()[b & 15];
                    }
/* 52 */            return new String(cArr);
                }

                public ByteString hmac$okio(String algorithm, ByteString key) throws NoSuchAlgorithmException {
/* 1 */             algorithm.getClass();
/* 4 */             key.getClass();
                    try {
/* 7 */                 Mac mac = Mac.getInstance(algorithm);
/* 20 */                mac.init(new SecretKeySpec(key.toByteArray(), algorithm));
/* 27 */                byte[] bArrDoFinal = mac.doFinal(this.data);
/* 31 */                bArrDoFinal.getClass();
/* 34 */                return new ByteString(bArrDoFinal);
                    } catch (InvalidKeyException e) {
/* 39 */                C1951n4.m6863n(e);
/* 42 */                return null;
                    }
                }

                public ByteString hmacSha1(ByteString key) {
/* 1 */             key.getClass();
/* 6 */             return hmac$okio("HmacSHA1", key);
                }

                public ByteString hmacSha256(ByteString key) {
/* 1 */             key.getClass();
/* 6 */             return hmac$okio("HmacSHA256", key);
                }

                public ByteString hmacSha512(ByteString key) {
/* 1 */             key.getClass();
/* 6 */             return hmac$okio("HmacSHA512", key);
                }

                public int indexOf(byte[] other, int fromIndex) {
/* 1 */             other.getClass();
/* 10 */            int length = getData().length - other.length;
/* 12 */            int iMax = Math.max(fromIndex, 0);
/* 16 */            if (iMax > length) {
/* 35 */                return -1;
                    }
/* 27 */            while (!SegmentedByteString.arrayRangeEquals(getData(), iMax, other, 0, other.length)) {
/* 30 */                if (iMax == length) {
/* 35 */                    return -1;
                        }
/* 32 */                iMax++;
                    }
/* 29 */            return iMax;
                }

                public byte[] internalArray$okio() {
/* 1 */             return getData();
                }

                public byte internalGet$okio(int pos) {
/* 5 */             return getData()[pos];
                }

                public int lastIndexOf(byte[] other, int fromIndex) {
/* 1 */             other.getClass();
/* 20 */            for (int iMin = Math.min(SegmentedByteString.resolveDefaultParameter(this, fromIndex), getData().length - other.length); -1 < iMin; iMin--) {
/* 32 */                if (SegmentedByteString.arrayRangeEquals(getData(), iMin, other, 0, other.length)) {
/* 34 */                    return iMin;
                        }
                    }
/* 19 */            return -1;
                }

                public final ByteString md5() {
/* 3 */             return digest$okio("MD5");
                }

                public boolean rangeEquals(int offset, byte[] other, int otherOffset, int byteCount) {
/* 1 */             other.getClass();
                    return offset >= 0 && offset <= getData().length - byteCount && otherOffset >= 0 && otherOffset <= other.length - byteCount && SegmentedByteString.arrayRangeEquals(getData(), offset, other, otherOffset, byteCount);
                }

                public final void setHashCode$okio(int i) {
/* 1 */             this.hashCode = i;
                }

                public final void setUtf8$okio(String str) {
/* 1 */             this.utf8 = str;
                }

                public final ByteString sha1() {
/* 3 */             return digest$okio("SHA-1");
                }

                public final ByteString sha256() {
/* 3 */             return digest$okio("SHA-256");
                }

                public final ByteString sha512() {
/* 3 */             return digest$okio("SHA-512");
                }

                public final int size() {
/* 1 */             return getSize$okio();
                }

                public final boolean startsWith(ByteString prefix) {
/* 1 */             prefix.getClass();
/* 9 */             return rangeEquals(0, prefix, 0, prefix.size());
                }

                public String string(Charset charset) {
/* 1 */             charset.getClass();
/* 8 */             return new String(this.data, charset);
                }

                public ByteString substring(int beginIndex, int endIndex) {
/* 1 */             int iResolveDefaultParameter = SegmentedByteString.resolveDefaultParameter(this, endIndex);
/* 5 */             if (beginIndex < 0) {
/* 73 */                C1951n4.m6859j("beginIndex < 0");
/* 47 */                return null;
                    }
/* 12 */            if (iResolveDefaultParameter > getData().length) {
/* 67 */                ds0.m3200q(AbstractC0886en.m3510n(new StringBuilder("endIndex > length("), getData().length, ')'));
/* 47 */                return null;
                    }
/* 16 */            if (iResolveDefaultParameter - beginIndex >= 0) {
                        return (beginIndex == 0 && iResolveDefaultParameter == getData().length) ? this : new ByteString(C1960nd.m6966d(getData(), beginIndex, iResolveDefaultParameter));
                    }
/* 44 */            C1951n4.m6859j("endIndex < beginIndex");
/* 47 */            return null;
                }

                public ByteString toAsciiLowercase() {
/* 7 */             for (int i = 0; i < getData().length; i++) {
/* 13 */                byte b = getData()[i];
/* 17 */                if (b >= 65 && b <= 90) {
/* 24 */                    byte[] data = getData();
/* 29 */                    byte[] bArrCopyOf = Arrays.copyOf(data, data.length);
/* 38 */                    bArrCopyOf[i] = (byte) (b + 32);
/* 41 */                    for (int i2 = i + 1; i2 < bArrCopyOf.length; i2++) {
/* 43 */                        byte b2 = bArrCopyOf[i2];
/* 45 */                        if (b2 >= 65 && b2 <= 90) {
/* 53 */                            bArrCopyOf[i2] = (byte) (b2 + 32);
                                }
                            }
/* 60 */                    return new ByteString(bArrCopyOf);
                        }
                    }
/* 67 */            return this;
                }

                public ByteString toAsciiUppercase() {
/* 7 */             for (int i = 0; i < getData().length; i++) {
/* 13 */                byte b = getData()[i];
/* 17 */                if (b >= 97 && b <= 122) {
/* 24 */                    byte[] data = getData();
/* 29 */                    byte[] bArrCopyOf = Arrays.copyOf(data, data.length);
/* 38 */                    bArrCopyOf[i] = (byte) (b - 32);
/* 41 */                    for (int i2 = i + 1; i2 < bArrCopyOf.length; i2++) {
/* 43 */                        byte b2 = bArrCopyOf[i2];
/* 45 */                        if (b2 >= 97 && b2 <= 122) {
/* 53 */                            bArrCopyOf[i2] = (byte) (b2 - 32);
                                }
                            }
/* 60 */                    return new ByteString(bArrCopyOf);
                        }
                    }
/* 67 */            return this;
                }

                public byte[] toByteArray() {
/* 1 */             byte[] data = getData();
/* 6 */             return Arrays.copyOf(data, data.length);
                }

                public String toString() {
/* 6 */             if (getData().length == 0) {
/* 8 */                 return "[size=0]";
                    }
/* 1 */             int iCodePointIndexToCharIndex = okio.internal.ByteString.codePointIndexToCharIndex(getData(), 64);
/* 29 */            if (iCodePointIndexToCharIndex != -1) {
/* 157 */               String strUtf8 = utf8();
/* 185 */               String strM6261k = C1852e.m6261k(C1852e.m6261k(C1852e.m6261k(strUtf8.substring(0, iCodePointIndexToCharIndex), "\\", "\\\\"), "\n", "\\n"), "\r", "\\r");
/* 193 */               if (iCodePointIndexToCharIndex >= strUtf8.length()) {
/* 237 */                   return "[text=" + strM6261k + ']';
                        }
/* 219 */               return "[size=" + getData().length + " text=" + strM6261k + "…]";
                    }
/* 36 */            if (getData().length <= 64) {
/* 55 */                return "[hex=" + hex() + ']';
                    }
/* 62 */            StringBuilder sb = new StringBuilder("[size=");
/* 70 */            sb.append(getData().length);
/* 75 */            sb.append(" hex=");
/* 78 */            int iResolveDefaultParameter = SegmentedByteString.resolveDefaultParameter(this, 64);
/* 88 */            if (iResolveDefaultParameter > getData().length) {
/* 153 */               ds0.m3200q(AbstractC0886en.m3510n(new StringBuilder("endIndex > length("), getData().length, ')'));
/* 87 */                return null;
                    }
/* 90 */            if (iResolveDefaultParameter < 0) {
/* 131 */               C1951n4.m6859j("endIndex < beginIndex");
/* 87 */                return null;
                    }
/* 97 */            if (iResolveDefaultParameter != getData().length) {
/* 110 */               this = new ByteString(C1960nd.m6966d(getData(), 0, iResolveDefaultParameter));
                    }
/* 118 */           sb.append(this.hex());
/* 121 */           sb.append("…]");
/* 124 */           return sb.toString();
                }

                public String utf8() {
/* 1 */             String utf8 = getUtf8();
/* 5 */             if (utf8 != null) {
/* 18 */                return utf8;
                    }
/* 11 */            String utf8String = _JvmPlatformKt.toUtf8String(internalArray$okio());
/* 15 */            setUtf8$okio(utf8String);
/* 18 */            return utf8String;
                }

                public void write(OutputStream out) throws IOException {
/* 1 */             out.getClass();
/* 6 */             out.write(this.data);
                }

                public void write$okio(Buffer buffer, int offset, int byteCount) {
/* 1 */             buffer.getClass();
/* 4 */             okio.internal.ByteString.commonWrite(this, buffer, offset, byteCount);
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\b\nJ\u0015\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\b\fJ\u001d\u0010\r\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007¢\u0006\u0002\b\u0010J\u0015\u0010\u0011\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\b\u0012J\u0015\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0015H\u0007¢\u0006\u0002\b\u0016J\u0014\u0010\u0013\u001a\u00020\u00042\n\u0010\u0017\u001a\u00020\u0018\"\u00020\u0019H\u0007J%\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001cH\u0007¢\u0006\u0002\b\u0016J\u001d\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010\u001d\u001a\u00020\u001cH\u0007¢\u0006\u0002\b!J\u000e\u0010\u0007\u001a\u0004\u0018\u00010\u0004*\u00020\tH\u0007J\f\u0010\u000b\u001a\u00020\u0004*\u00020\tH\u0007J\u001b\u0010\"\u001a\u00020\u0004*\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0007¢\u0006\u0002\b\rJ\f\u0010\u0011\u001a\u00020\u0004*\u00020\tH\u0007J\u0019\u0010#\u001a\u00020\u0004*\u00020 2\u0006\u0010\u001d\u001a\u00020\u001cH\u0007¢\u0006\u0002\b\u001eJ\u0011\u0010$\u001a\u00020\u0004*\u00020\u0015H\u0007¢\u0006\u0002\b\u0013J%\u0010$\u001a\u00020\u0004*\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001cH\u0007¢\u0006\u0002\b\u0013R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006%"}, m6176d2 = {"Lokio/ByteString$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, "()V", "EMPTY", "Lokio/ByteString;", "serialVersionUID", HttpUrl.FRAGMENT_ENCODE_SET, "decodeBase64", "string", HttpUrl.FRAGMENT_ENCODE_SET, "-deprecated_decodeBase64", "decodeHex", "-deprecated_decodeHex", "encodeString", "charset", "Ljava/nio/charset/Charset;", "-deprecated_encodeString", "encodeUtf8", "-deprecated_encodeUtf8", "of", "buffer", "Ljava/nio/ByteBuffer;", "-deprecated_of", SharedDataContentProvider.BASE_PATH, HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "array", "offset", HttpUrl.FRAGMENT_ENCODE_SET, "byteCount", "read", "inputstream", "Ljava/io/InputStream;", "-deprecated_read", "encode", "readByteString", "toByteString", "okio"}, m6177k = 1, m6178mv = {1, 8, 0}, m6180xi = 48)
/* 3 */         public static final class Companion {
                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
/* 1 */                 this();
                    }

                    public static /* synthetic */ ByteString encodeString$default(Companion companion, String str, Charset charset, int i, Object obj) {
/* 3 */                 if ((i & 1) != 0) {
/* 5 */                     charset = Charsets.UTF_8;
                        }
/* 7 */                 return companion.encodeString(str, charset);
                    }

                    public static /* synthetic */ ByteString of$default(Companion companion, byte[] bArr, int i, int i2, int i3, Object obj) {
/* 3 */                 if ((i3 & 1) != 0) {
/* 5 */                     i = 0;
                        }
/* 8 */                 if ((i3 & 2) != 0) {
/* 10 */                    i2 = SegmentedByteString.getDEFAULT__ByteString_size();
                        }
/* 14 */                return companion.m7203of(bArr, i, i2);
                    }

                    /* JADX INFO: renamed from: -deprecated_decodeBase64, reason: not valid java name */
                    public final ByteString m10642deprecated_decodeBase64(String string) {
/* 1 */                 string.getClass();
/* 4 */                 return decodeBase64(string);
                    }

                    /* JADX INFO: renamed from: -deprecated_decodeHex, reason: not valid java name */
                    public final ByteString m10643deprecated_decodeHex(String string) {
/* 1 */                 string.getClass();
/* 4 */                 return decodeHex(string);
                    }

                    /* JADX INFO: renamed from: -deprecated_encodeString, reason: not valid java name */
                    public final ByteString m10644deprecated_encodeString(String string, Charset charset) {
/* 1 */                 string.getClass();
/* 4 */                 charset.getClass();
/* 7 */                 return encodeString(string, charset);
                    }

                    /* JADX INFO: renamed from: -deprecated_encodeUtf8, reason: not valid java name */
                    public final ByteString m10645deprecated_encodeUtf8(String string) {
/* 1 */                 string.getClass();
/* 4 */                 return encodeUtf8(string);
                    }

                    /* JADX INFO: renamed from: -deprecated_of, reason: not valid java name */
                    public final ByteString m10646deprecated_of(ByteBuffer buffer) {
/* 1 */                 buffer.getClass();
/* 4 */                 return m7201of(buffer);
                    }

                    /* JADX INFO: renamed from: -deprecated_read, reason: not valid java name */
                    public final ByteString m10648deprecated_read(InputStream inputstream, int byteCount) {
/* 1 */                 inputstream.getClass();
/* 4 */                 return read(inputstream, byteCount);
                    }

                    public final ByteString decodeBase64(String str) {
/* 1 */                 str.getClass();
/* 4 */                 byte[] bArrDecodeBase64ToArray = Base64.decodeBase64ToArray(str);
/* 8 */                 if (bArrDecodeBase64ToArray != null) {
/* 12 */                    return new ByteString(bArrDecodeBase64ToArray);
                        }
/* 16 */                return null;
                    }

                    public final ByteString decodeHex(String str) {
/* 1 */                 str.getClass();
/* 10 */                if (str.length() % 2 != 0) {
/* 64 */                    ds0.m3200q("Unexpected hex string: ".concat(str));
/* 67 */                    return null;
                        }
/* 16 */                int length = str.length() / 2;
/* 18 */                byte[] bArr = new byte[length];
/* 21 */                for (int i = 0; i < length; i++) {
/* 23 */                    int i2 = i * 2;
/* 47 */                    bArr[i] = (byte) (okio.internal.ByteString.decodeHexDigit(str.charAt(i2 + 1)) + (okio.internal.ByteString.decodeHexDigit(str.charAt(i2)) << 4));
                        }
/* 54 */                return new ByteString(bArr);
                    }

                    public final ByteString encodeString(String str, Charset charset) {
/* 1 */                 str.getClass();
/* 4 */                 charset.getClass();
/* 9 */                 byte[] bytes = str.getBytes(charset);
/* 13 */                bytes.getClass();
/* 16 */                return new ByteString(bytes);
                    }

                    public final ByteString encodeUtf8(String str) {
/* 1 */                 str.getClass();
/* 10 */                ByteString byteString = new ByteString(_JvmPlatformKt.asUtf8ToByteArray(str));
/* 13 */                byteString.setUtf8$okio(str);
/* 16 */                return byteString;
                    }

                    /* JADX INFO: renamed from: of */
                    public final ByteString m7203of(byte[] bArr, int i, int i2) {
/* 1 */                 bArr.getClass();
/* 4 */                 int iResolveDefaultParameter = SegmentedByteString.resolveDefaultParameter(bArr, i2);
/* 12 */                SegmentedByteString.checkOffsetAndCount(bArr.length, i, iResolveDefaultParameter);
/* 22 */                return new ByteString(C1960nd.m6966d(bArr, i, iResolveDefaultParameter + i));
                    }

                    public final ByteString read(InputStream inputStream, int i) throws IOException {
/* 1 */                 inputStream.getClass();
/* 4 */                 if (i < 0) {
/* 39 */                    ds0.m3200q(fm0.m3781g(i, "byteCount < 0: "));
/* 25 */                    return null;
                        }
/* 6 */                 byte[] bArr = new byte[i];
/* 8 */                 int i2 = 0;
/* 9 */                 while (i2 < i) {
/* 13 */                    int i3 = inputStream.read(bArr, i2, i - i2);
/* 18 */                    if (i3 == -1) {
/* 22 */                        C1951n4.m6854b();
/* 25 */                        return null;
                            }
/* 20 */                    i2 += i3;
                        }
/* 29 */                return new ByteString(bArr);
                    }

/* 4 */             private Companion() {
                    }

                    /* JADX INFO: renamed from: -deprecated_of, reason: not valid java name */
/* 8 */             public final ByteString m10647deprecated_of(byte[] array, int offset, int byteCount) {
                        array.getClass();
/* 9 */                 return m7203of(array, offset, byteCount);
                    }

                    /* JADX INFO: renamed from: of */
/* 25 */            public final ByteString m7202of(byte... data) {
                        data.getClass();
/* 26 */                return new ByteString(Arrays.copyOf(data, data.length));
                    }

                    /* JADX INFO: renamed from: of */
/* 26 */            public final ByteString m7201of(ByteBuffer byteBuffer) {
                        byteBuffer.getClass();
/* 27 */                byte[] bArr = new byte[byteBuffer.remaining()];
/* 28 */                byteBuffer.get(bArr);
/* 29 */                return new ByteString(bArr);
                    }
                }

                /* JADX INFO: renamed from: of */
/* 7 */         public static final ByteString m7199of(byte... bArr) {
/* 8 */             return INSTANCE.m7202of(bArr);
                }

                /* JADX INFO: renamed from: of */
/* 8 */         public static final ByteString m7200of(byte[] bArr, int i, int i2) {
/* 9 */             return INSTANCE.m7203of(bArr, i, i2);
                }

/* 13 */        public final boolean startsWith(byte[] prefix) {
                    prefix.getClass();
/* 14 */            return rangeEquals(0, prefix, 0, prefix.length);
                }

/* 19 */        public static /* synthetic */ int indexOf$default(ByteString byteString, byte[] bArr, int i, int i2, Object obj) {
                    if (obj != null) {
                        C1951n4.m6866q("Super calls with default arguments not supported in this target, function: indexOf");
                        return 0;
                    }
                    if ((i2 & 2) != 0) {
                        i = 0;
                    }
/* 20 */            return byteString.indexOf(bArr, i);
                }

/* 22 */        public static /* synthetic */ int lastIndexOf$default(ByteString byteString, byte[] bArr, int i, int i2, Object obj) {
                    if (obj != null) {
                        C1951n4.m6866q("Super calls with default arguments not supported in this target, function: lastIndexOf");
                        return 0;
                    }
                    if ((i2 & 2) != 0) {
/* 23 */                i = SegmentedByteString.getDEFAULT__ByteString_size();
                    }
                    return byteString.lastIndexOf(bArr, i);
                }

/* 22 */        public final boolean endsWith(byte[] suffix) {
                    suffix.getClass();
/* 23 */            return rangeEquals(size() - suffix.length, suffix, 0, suffix.length);
                }

/* 33 */        public boolean rangeEquals(int offset, ByteString other, int otherOffset, int byteCount) {
                    other.getClass();
/* 34 */            return other.rangeEquals(otherOffset, getData(), offset, byteCount);
                }

/* 36 */        public final int indexOf(byte[] bArr) {
/* 37 */            bArr.getClass();
                    return indexOf$default(this, bArr, 0, 2, (Object) null);
                }

/* 37 */        public final int indexOf(ByteString other, int fromIndex) {
                    other.getClass();
/* 38 */            return indexOf(other.internalArray$okio(), fromIndex);
                }

/* 38 */        public final int indexOf(ByteString byteString) {
/* 39 */            byteString.getClass();
                    return indexOf$default(this, byteString, 0, 2, (Object) null);
                }

/* 38 */        public final int lastIndexOf(byte[] bArr) {
/* 39 */            bArr.getClass();
                    return lastIndexOf$default(this, bArr, 0, 2, (Object) null);
                }

/* 39 */        public final int lastIndexOf(ByteString other, int fromIndex) {
                    other.getClass();
/* 40 */            return lastIndexOf(other.internalArray$okio(), fromIndex);
                }

/* 40 */        public final int lastIndexOf(ByteString byteString) {
/* 41 */            byteString.getClass();
                    return lastIndexOf$default(this, byteString, 0, 2, (Object) null);
                }

/* 76 */        public final ByteString substring(int i) {
/* 77 */            return substring$default(this, i, 0, 2, null);
                }

/* 77 */        public final ByteString substring() {
/* 78 */            return substring$default(this, 0, 0, 3, null);
                }
            }
