            package okio;

            import io.flutter.plugin.editing.SpellCheckPlugin;
            import java.io.IOException;
            import java.io.OutputStream;
            import java.nio.ByteBuffer;
            import java.nio.charset.Charset;
            import java.security.InvalidKeyException;
            import java.security.MessageDigest;
            import java.security.NoSuchAlgorithmException;
            import javax.crypto.Mac;
            import javax.crypto.spec.SecretKeySpec;
            import kotlin.Metadata;
            import okhttp3.HttpUrl;
            import p000.AbstractC0886en;
            import p000.C1951n4;
            import p000.C1960nd;
            import p000.ds0;
            import p000.fm0;
            
            /* JADX INFO: renamed from: okio.SegmentedByteString, reason: case insensitive filesystem */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            @Metadata(m6175d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0010\u0005\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u001d\b\u0000\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016J(\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0015H\u0016J\u0015\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u0010H\u0010¢\u0006\u0002\b\u001bJ\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0096\u0002J\r\u0010 \u001a\u00020\u0015H\u0010¢\u0006\u0002\b!J\b\u0010\"\u001a\u00020\u0015H\u0016J\b\u0010#\u001a\u00020\u0010H\u0016J\u001d\u0010$\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u00102\u0006\u0010%\u001a\u00020\u0001H\u0010¢\u0006\u0002\b&J\u0018\u0010'\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u00042\u0006\u0010(\u001a\u00020\u0015H\u0016J\r\u0010)\u001a\u00020\u0004H\u0010¢\u0006\u0002\b*J\u0015\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\u0015H\u0010¢\u0006\u0002\b.J\u0018\u0010/\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u00042\u0006\u0010(\u001a\u00020\u0015H\u0016J(\u00100\u001a\u00020\u001d2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u00042\u0006\u00101\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0015H\u0016J(\u00100\u001a\u00020\u001d2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u00012\u0006\u00101\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0015H\u0016J\u0010\u00102\u001a\u00020\u00102\u0006\u00103\u001a\u000204H\u0016J\u0018\u00105\u001a\u00020\u00012\u0006\u00106\u001a\u00020\u00152\u0006\u00107\u001a\u00020\u0015H\u0016J\b\u00108\u001a\u00020\u0001H\u0016J\b\u00109\u001a\u00020\u0001H\u0016J\b\u0010:\u001a\u00020\u0004H\u0016J\b\u0010;\u001a\u00020\u0001H\u0002J\b\u0010<\u001a\u00020\u0010H\u0016J\u0010\u0010=\u001a\u00020\u00132\u0006\u0010>\u001a\u00020?H\u0016J%\u0010=\u001a\u00020\u00132\u0006\u0010@\u001a\u00020A2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0015H\u0010¢\u0006\u0002\bBJ\b\u0010C\u001a\u00020DH\u0002R\u0014\u0010\u0005\u001a\u00020\u0006X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0080\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b¨\u0006E"}, m6176d2 = {"Lokio/SegmentedByteString;", "Lokio/ByteString;", "segments", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "directory", HttpUrl.FRAGMENT_ENCODE_SET, "([[B[I)V", "getDirectory$okio", "()[I", "getSegments$okio", "()[[B", "[[B", "asByteBuffer", "Ljava/nio/ByteBuffer;", "base64", HttpUrl.FRAGMENT_ENCODE_SET, "base64Url", "copyInto", HttpUrl.FRAGMENT_ENCODE_SET, "offset", HttpUrl.FRAGMENT_ENCODE_SET, "target", "targetOffset", "byteCount", "digest", "algorithm", "digest$okio", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", HttpUrl.FRAGMENT_ENCODE_SET, "getSize", "getSize$okio", "hashCode", "hex", "hmac", "key", "hmac$okio", "indexOf", "fromIndex", "internalArray", "internalArray$okio", "internalGet", HttpUrl.FRAGMENT_ENCODE_SET, "pos", "internalGet$okio", "lastIndexOf", "rangeEquals", "otherOffset", "string", "charset", "Ljava/nio/charset/Charset;", "substring", "beginIndex", SpellCheckPlugin.END_INDEX_KEY, "toAsciiLowercase", "toAsciiUppercase", "toByteArray", "toByteString", "toString", "write", "out", "Ljava/io/OutputStream;", "buffer", "Lokio/Buffer;", "write$okio", "writeReplace", "Ljava/lang/Object;", "okio"}, m6177k = 1, m6178mv = {1, 8, 0}, m6180xi = 48)
/* 87 */    public final class C2570SegmentedByteString extends ByteString {
                private final transient int[] directory;
                private final transient byte[][] segments;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C2570SegmentedByteString(byte[][] bArr, int[] iArr) {
/* 13 */            super(ByteString.EMPTY.getData());
/* 1 */             bArr.getClass();
/* 4 */             iArr.getClass();
/* 16 */            this.segments = bArr;
/* 18 */            this.directory = iArr;
                }

                private final ByteString toByteString() {
/* 7 */             return new ByteString(toByteArray());
                }

                private final Object writeReplace() {
/* 1 */             ByteString byteString = toByteString();
/* 5 */             byteString.getClass();
/* 8 */             return byteString;
                }

                @Override // okio.ByteString
                public ByteBuffer asByteBuffer() {
/* 9 */             ByteBuffer byteBufferAsReadOnlyBuffer = ByteBuffer.wrap(toByteArray()).asReadOnlyBuffer();
/* 13 */            byteBufferAsReadOnlyBuffer.getClass();
/* 16 */            return byteBufferAsReadOnlyBuffer;
                }

                @Override // okio.ByteString
                public String base64() {
/* 5 */             return toByteString().base64();
                }

                @Override // okio.ByteString
                public String base64Url() {
/* 5 */             return toByteString().base64Url();
                }

                @Override // okio.ByteString
                public void copyInto(int offset, byte[] target, int targetOffset, int byteCount) {
/* 1 */             target.getClass();
                    long j = byteCount;
/* 11 */            SegmentedByteString.checkOffsetAndCount(size(), offset, j);
/* 19 */            SegmentedByteString.checkOffsetAndCount(target.length, targetOffset, j);
/* 22 */            int i = byteCount + offset;
/* 23 */            int iSegment = okio.internal.SegmentedByteString.segment(this, offset);
/* 27 */            while (offset < i) {
/* 39 */                int i2 = iSegment == 0 ? 0 : getDirectory()[iSegment - 1];
/* 47 */                int i3 = getDirectory()[iSegment] - i2;
/* 58 */                int i4 = getDirectory()[getSegments().length + iSegment];
/* 65 */                int iMin = Math.min(i, i3 + i2) - offset;
/* 68 */                int i5 = (offset - i2) + i4;
/* 77 */                C1960nd.m6964b(getSegments()[iSegment], targetOffset, target, i5, i5 + iMin);
/* 80 */                targetOffset += iMin;
/* 81 */                offset += iMin;
/* 82 */                iSegment++;
                    }
                }

                @Override // okio.ByteString
                public ByteString digest$okio(String algorithm) throws NoSuchAlgorithmException {
/* 1 */             algorithm.getClass();
/* 4 */             MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
/* 12 */            int length = getSegments().length;
/* 13 */            int i = 0;
/* 14 */            int i2 = 0;
/* 15 */            while (i < length) {
/* 23 */                int i3 = getDirectory()[length + i];
/* 29 */                int i4 = getDirectory()[i];
/* 39 */                messageDigest.update(getSegments()[i], i3, i4 - i2);
/* 42 */                i++;
/* 44 */                i2 = i4;
                    }
/* 46 */            byte[] bArrDigest = messageDigest.digest();
/* 52 */            bArrDigest.getClass();
/* 55 */            return new ByteString(bArrDigest);
                }

                @Override // okio.ByteString
                public boolean equals(Object other) {
/* 2 */             if (other == this) {
/* 1 */                 return true;
                    }
/* 8 */             if (other instanceof ByteString) {
/* 10 */                ByteString byteString = (ByteString) other;
/* 20 */                if (byteString.size() == size() && rangeEquals(0, byteString, 0, size())) {
/* 1 */                     return true;
                        }
                    }
/* 7 */             return false;
                }

                /* JADX INFO: renamed from: getDirectory$okio, reason: from getter */
                public final int[] getDirectory() {
/* 1 */             return this.directory;
                }

                /* JADX INFO: renamed from: getSegments$okio, reason: from getter */
                public final byte[][] getSegments() {
/* 1 */             return this.segments;
                }

                @Override // okio.ByteString
                public int getSize$okio() {
/* 12 */            return getDirectory()[getSegments().length - 1];
                }

                @Override // okio.ByteString
                public int hashCode() {
/* 1 */             int hashCode = getHashCode();
/* 5 */             if (hashCode != 0) {
/* 7 */                 return hashCode;
                    }
/* 12 */            int length = getSegments().length;
/* 13 */            int i = 0;
/* 15 */            int i2 = 1;
/* 16 */            int i3 = 0;
/* 17 */            while (i < length) {
/* 25 */                int i4 = getDirectory()[length + i];
/* 31 */                int i5 = getDirectory()[i];
/* 37 */                byte[] bArr = getSegments()[i];
/* 41 */                int i6 = (i5 - i3) + i4;
/* 42 */                while (i4 < i6) {
/* 48 */                    i2 = (i2 * 31) + bArr[i4];
/* 49 */                    i4++;
                        }
/* 52 */                i++;
/* 54 */                i3 = i5;
                    }
/* 56 */            setHashCode$okio(i2);
/* 59 */            return i2;
                }

                @Override // okio.ByteString
                public String hex() {
/* 5 */             return toByteString().hex();
                }

                @Override // okio.ByteString
                public ByteString hmac$okio(String algorithm, ByteString key) throws NoSuchAlgorithmException {
/* 1 */             algorithm.getClass();
/* 4 */             key.getClass();
                    try {
/* 7 */                 Mac mac = Mac.getInstance(algorithm);
/* 20 */                mac.init(new SecretKeySpec(key.toByteArray(), algorithm));
/* 27 */                int length = getSegments().length;
/* 28 */                int i = 0;
/* 29 */                int i2 = 0;
/* 30 */                while (i < length) {
/* 38 */                    int i3 = getDirectory()[length + i];
/* 44 */                    int i4 = getDirectory()[i];
/* 54 */                    mac.update(getSegments()[i], i3, i4 - i2);
/* 57 */                    i++;
/* 59 */                    i2 = i4;
                        }
/* 63 */                byte[] bArrDoFinal = mac.doFinal();
/* 67 */                bArrDoFinal.getClass();
/* 70 */                return new ByteString(bArrDoFinal);
                    } catch (InvalidKeyException e) {
/* 75 */                C1951n4.m6863n(e);
/* 78 */                return null;
                    }
                }

                @Override // okio.ByteString
                public int indexOf(byte[] other, int fromIndex) {
/* 1 */             other.getClass();
/* 8 */             return toByteString().indexOf(other, fromIndex);
                }

                @Override // okio.ByteString
                public byte[] internalArray$okio() {
/* 1 */             return toByteArray();
                }

                @Override // okio.ByteString
                public byte internalGet$okio(int pos) {
/* 18 */            SegmentedByteString.checkOffsetAndCount(getDirectory()[getSegments().length - 1], pos, 1L);
/* 21 */            int iSegment = okio.internal.SegmentedByteString.segment(this, pos);
/* 57 */            return getSegments()[iSegment][(pos - (iSegment == 0 ? 0 : getDirectory()[iSegment - 1])) + getDirectory()[getSegments().length + iSegment]];
                }

                @Override // okio.ByteString
                public int lastIndexOf(byte[] other, int fromIndex) {
/* 1 */             other.getClass();
/* 8 */             return toByteString().lastIndexOf(other, fromIndex);
                }

                @Override // okio.ByteString
                public boolean rangeEquals(int offset, byte[] other, int otherOffset, int byteCount) {
/* 1 */             other.getClass();
/* 5 */             if (offset < 0 || offset > size() - byteCount || otherOffset < 0 || otherOffset > other.length - byteCount) {
/* 4 */                 return false;
                    }
/* 21 */            int i = byteCount + offset;
/* 22 */            int iSegment = okio.internal.SegmentedByteString.segment(this, offset);
/* 26 */            while (offset < i) {
/* 38 */                int i2 = iSegment == 0 ? 0 : getDirectory()[iSegment - 1];
/* 46 */                int i3 = getDirectory()[iSegment] - i2;
/* 57 */                int i4 = getDirectory()[getSegments().length + iSegment];
/* 64 */                int iMin = Math.min(i, i3 + i2) - offset;
/* 78 */                if (!SegmentedByteString.arrayRangeEquals(getSegments()[iSegment], (offset - i2) + i4, other, otherOffset, iMin)) {
/* 4 */                     return false;
                        }
/* 81 */                otherOffset += iMin;
/* 82 */                offset += iMin;
/* 83 */                iSegment++;
                    }
/* 86 */            return true;
                }

                @Override // okio.ByteString
                public String string(Charset charset) {
/* 1 */             charset.getClass();
/* 8 */             return toByteString().string(charset);
                }

                @Override // okio.ByteString
                public ByteString substring(int beginIndex, int endIndex) {
/* 1 */             int iResolveDefaultParameter = SegmentedByteString.resolveDefaultParameter(this, endIndex);
/* 6 */             if (beginIndex < 0) {
/* 177 */               ds0.m3200q(AbstractC0886en.m3505i(beginIndex, "beginIndex=", " < 0"));
/* 5 */                 return null;
                    }
/* 14 */            if (iResolveDefaultParameter > size()) {
/* 139 */               StringBuilder sbM3793s = fm0.m3793s(iResolveDefaultParameter, "endIndex=", " > length(");
/* 147 */               sbM3793s.append(size());
/* 152 */               sbM3793s.append(')');
/* 168 */               throw new IllegalArgumentException(sbM3793s.toString().toString());
                    }
/* 16 */            int i = iResolveDefaultParameter - beginIndex;
/* 18 */            if (i < 0) {
/* 133 */               ds0.m3200q(AbstractC0886en.m3506j("endIndex=", iResolveDefaultParameter, beginIndex, " < beginIndex="));
/* 5 */                 return null;
                    }
/* 20 */            if (beginIndex == 0 && iResolveDefaultParameter == size()) {
/* 28 */                return this;
                    }
/* 29 */            if (beginIndex == iResolveDefaultParameter) {
/* 31 */                return ByteString.EMPTY;
                    }
/* 34 */            int iSegment = okio.internal.SegmentedByteString.segment(this, beginIndex);
/* 40 */            int iSegment2 = okio.internal.SegmentedByteString.segment(this, iResolveDefaultParameter - 1);
/* 54 */            byte[][] bArr = (byte[][]) C1960nd.m6967e(getSegments(), iSegment, iSegment2 + 1);
/* 59 */            int[] iArr = new int[bArr.length * 2];
/* 62 */            if (iSegment <= iSegment2) {
/* 64 */                int i2 = iSegment;
/* 65 */                int i3 = 0;
                        while (true) {
/* 77 */                    iArr[i3] = Math.min(getDirectory()[i2] - beginIndex, i);
/* 79 */                    int i4 = i3 + 1;
/* 95 */                    iArr[i3 + bArr.length] = getDirectory()[getSegments().length + i2];
/* 97 */                    if (i2 == iSegment2) {
                                break;
                            }
/* 99 */                    i2++;
/* 101 */                   i3 = i4;
                        }
                    }
/* 112 */           int i5 = iSegment != 0 ? getDirectory()[iSegment - 1] : 0;
/* 114 */           int length = bArr.length;
/* 119 */           iArr[length] = (beginIndex - i5) + iArr[length];
/* 123 */           return new C2570SegmentedByteString(bArr, iArr);
                }

                @Override // okio.ByteString
                public ByteString toAsciiLowercase() {
/* 5 */             return toByteString().toAsciiLowercase();
                }

                @Override // okio.ByteString
                public ByteString toAsciiUppercase() {
/* 5 */             return toByteString().toAsciiUppercase();
                }

                @Override // okio.ByteString
                public byte[] toByteArray() {
/* 5 */             byte[] bArr = new byte[size()];
/* 11 */            int length = getSegments().length;
/* 12 */            int i = 0;
/* 13 */            int i2 = 0;
/* 14 */            int i3 = 0;
/* 15 */            while (i < length) {
/* 23 */                int i4 = getDirectory()[length + i];
/* 29 */                int i5 = getDirectory()[i];
/* 37 */                int i6 = i5 - i2;
/* 41 */                C1960nd.m6964b(getSegments()[i], i3, bArr, i4, i4 + i6);
/* 44 */                i3 += i6;
/* 45 */                i++;
/* 47 */                i2 = i5;
                    }
/* 49 */            return bArr;
                }

                @Override // okio.ByteString
                public String toString() {
/* 5 */             return toByteString().toString();
                }

                @Override // okio.ByteString
                public void write(OutputStream out) throws IOException {
/* 1 */             out.getClass();
/* 8 */             int length = getSegments().length;
/* 9 */             int i = 0;
/* 10 */            int i2 = 0;
/* 11 */            while (i < length) {
/* 19 */                int i3 = getDirectory()[length + i];
/* 25 */                int i4 = getDirectory()[i];
/* 35 */                out.write(getSegments()[i], i3, i4 - i2);
/* 38 */                i++;
/* 40 */                i2 = i4;
                    }
                }

                @Override // okio.ByteString
                public void write$okio(Buffer buffer, int offset, int byteCount) {
/* 1 */             buffer.getClass();
/* 4 */             int i = offset + byteCount;
/* 6 */             int iSegment = okio.internal.SegmentedByteString.segment(this, offset);
/* 10 */            while (offset < i) {
/* 22 */                int i2 = iSegment == 0 ? 0 : getDirectory()[iSegment - 1];
/* 30 */                int i3 = getDirectory()[iSegment] - i2;
/* 41 */                int i4 = getDirectory()[getSegments().length + iSegment];
/* 48 */                int iMin = Math.min(i, i3 + i2) - offset;
/* 51 */                int i5 = (offset - i2) + i4;
/* 65 */                Segment segment = new Segment(getSegments()[iSegment], i5, i5 + iMin, true, false);
/* 68 */                Segment segment2 = buffer.head;
/* 70 */                if (segment2 == null) {
/* 72 */                    segment.prev = segment;
/* 74 */                    segment.next = segment;
/* 76 */                    buffer.head = segment;
                        } else {
/* 79 */                    segment2.getClass();
/* 82 */                    Segment segment3 = segment2.prev;
/* 84 */                    segment3.getClass();
/* 87 */                    segment3.push(segment);
                        }
/* 90 */                offset += iMin;
/* 91 */                iSegment++;
                    }
/* 100 */           buffer.setSize$okio(buffer.size() + ((long) byteCount));
                }

                @Override // okio.ByteString
/* 88 */        public boolean rangeEquals(int offset, ByteString other, int otherOffset, int byteCount) {
                    other.getClass();
/* 89 */            if (offset < 0 || offset > size() - byteCount) {
                        return false;
                    }
                    int i = byteCount + offset;
/* 90 */            int iSegment = okio.internal.SegmentedByteString.segment(this, offset);
                    while (offset < i) {
/* 91 */                int i2 = iSegment == 0 ? 0 : getDirectory()[iSegment - 1];
/* 92 */                int i3 = getDirectory()[iSegment] - i2;
/* 93 */                int i4 = getDirectory()[getSegments().length + iSegment];
/* 94 */                int iMin = Math.min(i, i3 + i2) - offset;
/* 96 */                if (!other.rangeEquals(otherOffset, getSegments()[iSegment], (offset - i2) + i4, iMin)) {
                            return false;
                        }
                        otherOffset += iMin;
                        offset += iMin;
                        iSegment++;
                    }
                    return true;
                }
            }
