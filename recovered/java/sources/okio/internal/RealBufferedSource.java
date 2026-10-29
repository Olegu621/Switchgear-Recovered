            package okio.internal;

            import android.support.v4.media.session.PlaybackStateCompat;
            import java.io.EOFException;
            import java.io.IOException;
            import kotlin.Metadata;
            import kotlin.text.CharsKt;
            import okhttp3.HttpUrl;
            import okio.Buffer;
            import okio.BufferedSource;
            import okio.ByteString;
            import okio.Okio;
            import okio.Options;
            import okio.PeekSource;
            import okio.SegmentedByteString;
            import okio.Sink;
            import okio.Timeout;
            import p000.C1951n4;
            import p000.ds0;
            import p000.f42;
            import p000.pm2;
            
            /* JADX INFO: renamed from: okio.internal.-RealBufferedSource, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            @Metadata(m6175d1 = {"\u0000j\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\r\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0080\b\u001a\r\u0010\u0003\u001a\u00020\u0004*\u00020\u0002H\u0080\b\u001a%\u0010\u0005\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006H\u0080\b\u001a\u001d\u0010\u0005\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u0006H\u0080\b\u001a\u001d\u0010\r\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u0006H\u0080\b\u001a\r\u0010\u000f\u001a\u00020\u0010*\u00020\u0002H\u0080\b\u001a-\u0010\u0011\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014H\u0080\b\u001a%\u0010\u0016\u001a\u00020\u0014*\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0012\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014H\u0080\b\u001a\u001d\u0010\u0016\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00192\u0006\u0010\u0015\u001a\u00020\u0006H\u0080\b\u001a\u0015\u0010\u001a\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u001bH\u0080\b\u001a\r\u0010\u001c\u001a\u00020\b*\u00020\u0002H\u0080\b\u001a\r\u0010\u001d\u001a\u00020\u0018*\u00020\u0002H\u0080\b\u001a\u0015\u0010\u001d\u001a\u00020\u0018*\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0006H\u0080\b\u001a\r\u0010\u001e\u001a\u00020\f*\u00020\u0002H\u0080\b\u001a\u0015\u0010\u001e\u001a\u00020\f*\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0006H\u0080\b\u001a\r\u0010\u001f\u001a\u00020\u0006*\u00020\u0002H\u0080\b\u001a\u0015\u0010 \u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0018H\u0080\b\u001a\u001d\u0010 \u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00192\u0006\u0010\u0015\u001a\u00020\u0006H\u0080\b\u001a\r\u0010!\u001a\u00020\u0006*\u00020\u0002H\u0080\b\u001a\r\u0010\"\u001a\u00020\u0014*\u00020\u0002H\u0080\b\u001a\r\u0010#\u001a\u00020\u0014*\u00020\u0002H\u0080\b\u001a\r\u0010$\u001a\u00020\u0006*\u00020\u0002H\u0080\b\u001a\r\u0010%\u001a\u00020\u0006*\u00020\u0002H\u0080\b\u001a\r\u0010&\u001a\u00020'*\u00020\u0002H\u0080\b\u001a\r\u0010(\u001a\u00020'*\u00020\u0002H\u0080\b\u001a\r\u0010)\u001a\u00020**\u00020\u0002H\u0080\b\u001a\u0015\u0010)\u001a\u00020**\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0006H\u0080\b\u001a\r\u0010+\u001a\u00020\u0014*\u00020\u0002H\u0080\b\u001a\u000f\u0010,\u001a\u0004\u0018\u00010**\u00020\u0002H\u0080\b\u001a\u0015\u0010-\u001a\u00020**\u00020\u00022\u0006\u0010.\u001a\u00020\u0006H\u0080\b\u001a\u0015\u0010/\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0006H\u0080\b\u001a\u0015\u00100\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0006H\u0080\b\u001a\u0015\u00101\u001a\u00020\u0014*\u00020\u00022\u0006\u00102\u001a\u000203H\u0080\b\u001a\u0015\u00104\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0006H\u0080\b\u001a\r\u00105\u001a\u000206*\u00020\u0002H\u0080\b\u001a\r\u00107\u001a\u00020**\u00020\u0002H\u0080\b¨\u00068"}, m6176d2 = {"commonClose", HttpUrl.FRAGMENT_ENCODE_SET, "Lokio/RealBufferedSource;", "commonExhausted", HttpUrl.FRAGMENT_ENCODE_SET, "commonIndexOf", HttpUrl.FRAGMENT_ENCODE_SET, "b", HttpUrl.FRAGMENT_ENCODE_SET, "fromIndex", "toIndex", "bytes", "Lokio/ByteString;", "commonIndexOfElement", "targetBytes", "commonPeek", "Lokio/BufferedSource;", "commonRangeEquals", "offset", "bytesOffset", HttpUrl.FRAGMENT_ENCODE_SET, "byteCount", "commonRead", "sink", HttpUrl.FRAGMENT_ENCODE_SET, "Lokio/Buffer;", "commonReadAll", "Lokio/Sink;", "commonReadByte", "commonReadByteArray", "commonReadByteString", "commonReadDecimalLong", "commonReadFully", "commonReadHexadecimalUnsignedLong", "commonReadInt", "commonReadIntLe", "commonReadLong", "commonReadLongLe", "commonReadShort", HttpUrl.FRAGMENT_ENCODE_SET, "commonReadShortLe", "commonReadUtf8", HttpUrl.FRAGMENT_ENCODE_SET, "commonReadUtf8CodePoint", "commonReadUtf8Line", "commonReadUtf8LineStrict", "limit", "commonRequest", "commonRequire", "commonSelect", "options", "Lokio/Options;", "commonSkip", "commonTimeout", "Lokio/Timeout;", "commonToString", "okio"}, m6177k = 2, m6178mv = {1, 8, 0}, m6180xi = 48)
/* 16 */    public final class RealBufferedSource {
                public static final void commonClose(okio.RealBufferedSource realBufferedSource) throws IOException {
/* 1 */             realBufferedSource.getClass();
/* 6 */             if (realBufferedSource.closed) {
/* 8 */                 return;
                    }
/* 10 */            realBufferedSource.closed = true;
/* 14 */            realBufferedSource.source.close();
/* 19 */            realBufferedSource.bufferField.clear();
                }

                public static final boolean commonExhausted(okio.RealBufferedSource realBufferedSource) {
/* 1 */             realBufferedSource.getClass();
/* 7 */             if (!realBufferedSource.closed) {
                        return realBufferedSource.bufferField.exhausted() && realBufferedSource.source.read(realBufferedSource.bufferField, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1;
                    }
/* 38 */            f42.m3656l("closed");
/* 6 */             return false;
                }

                public static final long commonIndexOf(okio.RealBufferedSource realBufferedSource, byte b, long j, long j2) {
/* 1 */             realBufferedSource.getClass();
/* 8 */             if (realBufferedSource.closed) {
/* 106 */               f42.m3656l("closed");
/* 6 */                 return 0L;
                    }
/* 12 */            if (0 > j || j > j2) {
/* 103 */               throw new IllegalArgumentException(("fromIndex=" + j + " toIndex=" + j2).toString());
                    }
/* 18 */            long jMax = j;
/* 23 */            while (jMax < j2) {
/* 27 */                byte b2 = b;
/* 28 */                long j3 = j2;
/* 29 */                long jIndexOf = realBufferedSource.bufferField.indexOf(b2, jMax, j3);
/* 35 */                if (jIndexOf != -1) {
/* 37 */                    return jIndexOf;
                        }
/* 40 */                long size = realBufferedSource.bufferField.size();
/* 46 */                if (size >= j3 || realBufferedSource.source.read(realBufferedSource.bufferField, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                            break;
                        }
/* 63 */                jMax = Math.max(jMax, size);
/* 67 */                b = b2;
/* 68 */                j2 = j3;
                    }
/* 21 */            return -1L;
                }

                public static final long commonIndexOfElement(okio.RealBufferedSource realBufferedSource, ByteString byteString, long j) {
/* 1 */             realBufferedSource.getClass();
/* 4 */             byteString.getClass();
/* 9 */             if (realBufferedSource.closed) {
/* 52 */                f42.m3656l("closed");
/* 55 */                return 0L;
                    }
                    while (true) {
/* 13 */                long jIndexOfElement = realBufferedSource.bufferField.indexOfElement(byteString, j);
/* 21 */                if (jIndexOfElement != -1) {
/* 23 */                    return jIndexOfElement;
                        }
/* 26 */                long size = realBufferedSource.bufferField.size();
/* 42 */                if (realBufferedSource.source.read(realBufferedSource.bufferField, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
/* 17 */                    return -1L;
                        }
/* 45 */                j = Math.max(j, size);
                    }
                }

                public static final BufferedSource commonPeek(okio.RealBufferedSource realBufferedSource) {
/* 1 */             realBufferedSource.getClass();
/* 9 */             return Okio.buffer(new PeekSource(realBufferedSource));
                }

                public static final boolean commonRangeEquals(okio.RealBufferedSource realBufferedSource, long j, ByteString byteString, int i, int i2) {
/* 1 */             realBufferedSource.getClass();
/* 4 */             byteString.getClass();
/* 10 */            if (realBufferedSource.closed) {
/* 68 */                f42.m3656l("closed");
/* 9 */                 return false;
                    }
/* 16 */            if (j < 0 || i < 0 || i2 < 0 || byteString.size() - i < i2) {
/* 9 */                 return false;
                    }
/* 31 */            for (int i3 = 0; i3 < i2; i3++) {
/* 34 */                long j2 = ((long) i3) + j;
/* 42 */                if (!realBufferedSource.request(1 + j2) || realBufferedSource.bufferField.getByte(j2) != byteString.getByte(i + i3)) {
/* 9 */                     return false;
                        }
                    }
/* 63 */            return true;
                }

                public static final long commonRead(okio.RealBufferedSource realBufferedSource, Buffer buffer, long j) {
/* 1 */             realBufferedSource.getClass();
/* 4 */             buffer.getClass();
/* 11 */            if (j < 0) {
/* 73 */                ds0.m3200q(pm2.m7488k("byteCount < 0: ", j));
/* 7 */                 return 0L;
                    }
/* 15 */            if (realBufferedSource.closed) {
/* 63 */                f42.m3656l("closed");
/* 7 */                 return 0L;
                    }
/* 25 */            if (realBufferedSource.bufferField.size() == 0 && realBufferedSource.source.read(realBufferedSource.bufferField, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
/* 37 */                return -1L;
                    }
/* 56 */            return realBufferedSource.bufferField.read(buffer, Math.min(j, realBufferedSource.bufferField.size()));
                }

                public static final long commonReadAll(okio.RealBufferedSource realBufferedSource, Sink sink) throws IOException {
                    Buffer buffer;
/* 1 */             realBufferedSource.getClass();
/* 4 */             sink.getClass();
/* 9 */             long j = 0;
                    while (true) {
/* 16 */                long j2 = realBufferedSource.source.read(realBufferedSource.bufferField, PlaybackStateCompat.ACTION_PLAY_FROM_URI);
/* 24 */                buffer = realBufferedSource.bufferField;
/* 26 */                if (j2 == -1) {
                            break;
                        }
/* 28 */                long jCompleteSegmentByteCount = buffer.completeSegmentByteCount();
/* 34 */                if (jCompleteSegmentByteCount > 0) {
/* 36 */                    j += jCompleteSegmentByteCount;
/* 39 */                    sink.write(realBufferedSource.bufferField, jCompleteSegmentByteCount);
                        }
                    }
/* 49 */            if (buffer.size() <= 0) {
/* 68 */                return j;
                    }
/* 57 */            long size = realBufferedSource.bufferField.size() + j;
/* 58 */            Buffer buffer2 = realBufferedSource.bufferField;
/* 64 */            sink.write(buffer2, buffer2.size());
/* 67 */            return size;
                }

                public static final byte commonReadByte(okio.RealBufferedSource realBufferedSource) throws EOFException {
/* 1 */             realBufferedSource.getClass();
/* 6 */             realBufferedSource.require(1L);
/* 11 */            return realBufferedSource.bufferField.readByte();
                }

                public static final byte[] commonReadByteArray(okio.RealBufferedSource realBufferedSource) throws IOException {
/* 1 */             realBufferedSource.getClass();
/* 8 */             realBufferedSource.bufferField.writeAll(realBufferedSource.source);
/* 13 */            return realBufferedSource.bufferField.readByteArray();
                }

                public static final ByteString commonReadByteString(okio.RealBufferedSource realBufferedSource) throws IOException {
/* 1 */             realBufferedSource.getClass();
/* 8 */             realBufferedSource.bufferField.writeAll(realBufferedSource.source);
/* 13 */            return realBufferedSource.bufferField.readByteString();
                }

                public static final long commonReadDecimalLong(okio.RealBufferedSource realBufferedSource) throws EOFException {
/* 1 */             realBufferedSource.getClass();
/* 6 */             realBufferedSource.require(1L);
/* 11 */            long j = 0;
                    while (true) {
/* 12 */                long j2 = j + 1;
/* 18 */                if (!realBufferedSource.request(j2)) {
                            break;
                        }
/* 22 */                byte b = realBufferedSource.bufferField.getByte(j);
/* 28 */                if ((b < 48 || b > 57) && !(j == 0 && b == 45)) {
/* 45 */                    if (j != 0) {
                                break;
                            }
/* 58 */                    String string = Integer.toString(b, CharsKt.checkRadix(CharsKt.checkRadix(16)));
/* 62 */                    string.getClass();
/* 67 */                    C1951n4.m6858i(string, "Expected a digit or '-' but was 0x");
/* 9 */                     return 0L;
                        }
/* 43 */                j = j2;
                    }
/* 73 */            return realBufferedSource.bufferField.readDecimalLong();
                }

                public static final void commonReadFully(okio.RealBufferedSource realBufferedSource, byte[] bArr) throws EOFException {
/* 1 */             realBufferedSource.getClass();
/* 4 */             bArr.getClass();
                    try {
/* 9 */                 realBufferedSource.require(bArr.length);
/* 14 */                realBufferedSource.bufferField.readFully(bArr);
                    } catch (EOFException e) {
/* 19 */                int i = 0;
/* 30 */                while (realBufferedSource.bufferField.size() > 0) {
/* 32 */                    Buffer buffer = realBufferedSource.bufferField;
/* 39 */                    int i2 = buffer.read(bArr, i, (int) buffer.size());
/* 44 */                    if (i2 == -1) {
/* 53 */                        throw new AssertionError();
                            }
/* 46 */                    i += i2;
                        }
/* 54 */                throw e;
                    }
                }

                public static final long commonReadHexadecimalUnsignedLong(okio.RealBufferedSource realBufferedSource) throws EOFException {
/* 1 */             realBufferedSource.getClass();
/* 6 */             realBufferedSource.require(1L);
/* 9 */             int i = 0;
                    while (true) {
/* 10 */                int i2 = i + 1;
/* 17 */                if (!realBufferedSource.request(i2)) {
                            break;
                        }
/* 22 */                byte b = realBufferedSource.bufferField.getByte(i);
/* 28 */                if ((b < 48 || b > 57) && ((b < 97 || b > 102) && (b < 65 || b > 70))) {
/* 53 */                    if (i != 0) {
                                break;
                            }
/* 66 */                    String string = Integer.toString(b, CharsKt.checkRadix(CharsKt.checkRadix(16)));
/* 70 */                    string.getClass();
/* 75 */                    C1951n4.m6858i(string, "Expected leading [0-9a-fA-F] character but was 0x");
/* 78 */                    return 0L;
                        }
/* 51 */                i = i2;
                    }
/* 83 */            return realBufferedSource.bufferField.readHexadecimalUnsignedLong();
                }

                public static final int commonReadInt(okio.RealBufferedSource realBufferedSource) throws EOFException {
/* 1 */             realBufferedSource.getClass();
/* 6 */             realBufferedSource.require(4L);
/* 11 */            return realBufferedSource.bufferField.readInt();
                }

                public static final int commonReadIntLe(okio.RealBufferedSource realBufferedSource) throws EOFException {
/* 1 */             realBufferedSource.getClass();
/* 6 */             realBufferedSource.require(4L);
/* 11 */            return realBufferedSource.bufferField.readIntLe();
                }

                public static final long commonReadLong(okio.RealBufferedSource realBufferedSource) throws EOFException {
/* 1 */             realBufferedSource.getClass();
/* 6 */             realBufferedSource.require(8L);
/* 11 */            return realBufferedSource.bufferField.readLong();
                }

                public static final long commonReadLongLe(okio.RealBufferedSource realBufferedSource) throws EOFException {
/* 1 */             realBufferedSource.getClass();
/* 6 */             realBufferedSource.require(8L);
/* 11 */            return realBufferedSource.bufferField.readLongLe();
                }

                public static final short commonReadShort(okio.RealBufferedSource realBufferedSource) throws EOFException {
/* 1 */             realBufferedSource.getClass();
/* 6 */             realBufferedSource.require(2L);
/* 11 */            return realBufferedSource.bufferField.readShort();
                }

                public static final short commonReadShortLe(okio.RealBufferedSource realBufferedSource) throws EOFException {
/* 1 */             realBufferedSource.getClass();
/* 6 */             realBufferedSource.require(2L);
/* 11 */            return realBufferedSource.bufferField.readShortLe();
                }

                public static final String commonReadUtf8(okio.RealBufferedSource realBufferedSource) throws IOException {
/* 1 */             realBufferedSource.getClass();
/* 8 */             realBufferedSource.bufferField.writeAll(realBufferedSource.source);
/* 13 */            return realBufferedSource.bufferField.readUtf8();
                }

                public static final int commonReadUtf8CodePoint(okio.RealBufferedSource realBufferedSource) throws EOFException {
/* 1 */             realBufferedSource.getClass();
/* 6 */             realBufferedSource.require(1L);
/* 13 */            byte b = realBufferedSource.bufferField.getByte(0L);
/* 21 */            if ((b & 224) == 192) {
/* 25 */                realBufferedSource.require(2L);
                    } else if ((b & 240) == 224) {
/* 37 */                realBufferedSource.require(3L);
                    } else if ((b & 248) == 240) {
/* 49 */                realBufferedSource.require(4L);
                    }
/* 54 */            return realBufferedSource.bufferField.readUtf8CodePoint();
                }

                public static final String commonReadUtf8Line(okio.RealBufferedSource realBufferedSource) {
/* 1 */             realBufferedSource.getClass();
/* 6 */             long jIndexOf = realBufferedSource.indexOf((byte) 10);
/* 14 */            Buffer buffer = realBufferedSource.bufferField;
/* 16 */            if (jIndexOf != -1) {
/* 41 */                return Buffer.readUtf8Line(buffer, jIndexOf);
                    }
/* 26 */            if (buffer.size() != 0) {
/* 34 */                return realBufferedSource.readUtf8(realBufferedSource.bufferField.size());
                    }
/* 39 */            return null;
                }

                public static final String commonReadUtf8LineStrict(okio.RealBufferedSource realBufferedSource, long j) throws EOFException {
/* 3 */             realBufferedSource.getClass();
/* 11 */            if (j < 0) {
/* 148 */               ds0.m3200q(pm2.m7488k("limit < 0: ", j));
/* 10 */                return null;
                    }
/* 26 */            long j2 = j == Long.MAX_VALUE ? Long.MAX_VALUE : j + 1;
/* 34 */            long jIndexOf = realBufferedSource.indexOf((byte) 10, 0L, j2);
/* 42 */            if (jIndexOf != -1) {
/* 46 */                return Buffer.readUtf8Line(realBufferedSource.bufferField, jIndexOf);
                    }
/* 53 */            if (j2 < Long.MAX_VALUE && realBufferedSource.request(j2) && realBufferedSource.bufferField.getByte(j2 - 1) == 13 && realBufferedSource.request(j2 + 1) && realBufferedSource.bufferField.getByte(j2) == 10) {
/* 93 */                return Buffer.readUtf8Line(realBufferedSource.bufferField, j2);
                    }
/* 100 */           Buffer buffer = new Buffer();
/* 103 */           Buffer buffer2 = realBufferedSource.bufferField;
/* 117 */           buffer2.copyTo(buffer, 0L, Math.min(32L, buffer2.size()));
/* 138 */           C1951n4.m6857h(buffer.readByteString().hex(), Math.min(realBufferedSource.bufferField.size(), j));
/* 10 */            return null;
                }

                public static final boolean commonRequest(okio.RealBufferedSource realBufferedSource, long j) {
/* 1 */             realBufferedSource.getClass();
/* 9 */             if (j < 0) {
/* 56 */                ds0.m3200q(pm2.m7488k("byteCount < 0: ", j));
/* 8 */                 return false;
                    }
/* 13 */            if (realBufferedSource.closed) {
/* 46 */                f42.m3656l("closed");
/* 8 */                 return false;
                    }
/* 23 */            while (realBufferedSource.bufferField.size() < j) {
/* 39 */                if (realBufferedSource.source.read(realBufferedSource.bufferField, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
/* 8 */                     return false;
                        }
                    }
/* 42 */            return true;
                }

                public static final void commonRequire(okio.RealBufferedSource realBufferedSource, long j) throws EOFException {
/* 1 */             realBufferedSource.getClass();
/* 8 */             if (realBufferedSource.request(j)) {
/* 10 */                return;
                    }
/* 11 */            C1951n4.m6854b();
                }

                public static final int commonSelect(okio.RealBufferedSource realBufferedSource, Options options) throws EOFException {
/* 1 */             realBufferedSource.getClass();
/* 4 */             options.getClass();
/* 9 */             if (realBufferedSource.closed) {
/* 61 */                f42.m3656l("closed");
/* 64 */                return 0;
                    }
/* 56 */            do {
/* 14 */                int iSelectPrefix = Buffer.selectPrefix(realBufferedSource.bufferField, options, true);
/* 20 */                if (iSelectPrefix != -2) {
/* 22 */                    if (iSelectPrefix == -1) {
/* 19 */                        return -1;
                            }
/* 37 */                    realBufferedSource.bufferField.skip(options.getByteStrings()[iSelectPrefix].size());
/* 40 */                    return iSelectPrefix;
                        }
/* 56 */            } while (realBufferedSource.source.read(realBufferedSource.bufferField, PlaybackStateCompat.ACTION_PLAY_FROM_URI) != -1);
/* 19 */            return -1;
                }

                public static final void commonSkip(okio.RealBufferedSource realBufferedSource, long j) throws EOFException {
/* 1 */             realBufferedSource.getClass();
/* 6 */             if (realBufferedSource.closed) {
/* 65 */                f42.m3656l("closed");
/* 68 */                return;
                    }
/* 12 */            while (j > 0) {
/* 22 */                if (realBufferedSource.bufferField.size() == 0 && realBufferedSource.source.read(realBufferedSource.bufferField, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
/* 41 */                    C1951n4.m6854b();
/* 44 */                    return;
                        } else {
/* 51 */                    long jMin = Math.min(j, realBufferedSource.bufferField.size());
/* 57 */                    realBufferedSource.bufferField.skip(jMin);
/* 60 */                    j -= jMin;
                        }
                    }
                }

                public static final Timeout commonTimeout(okio.RealBufferedSource realBufferedSource) {
/* 1 */             realBufferedSource.getClass();
/* 6 */             return realBufferedSource.source.getTimeout();
                }

                public static final String commonToString(okio.RealBufferedSource realBufferedSource) {
/* 1 */             realBufferedSource.getClass();
/* 21 */            return "buffer(" + realBufferedSource.source + ')';
                }

/* 17 */        public static final byte[] commonReadByteArray(okio.RealBufferedSource realBufferedSource, long j) throws EOFException {
                    realBufferedSource.getClass();
/* 18 */            realBufferedSource.require(j);
/* 20 */            return realBufferedSource.bufferField.readByteArray(j);
                }

/* 17 */        public static final ByteString commonReadByteString(okio.RealBufferedSource realBufferedSource, long j) throws EOFException {
                    realBufferedSource.getClass();
/* 18 */            realBufferedSource.require(j);
/* 20 */            return realBufferedSource.bufferField.readByteString(j);
                }

/* 17 */        public static final String commonReadUtf8(okio.RealBufferedSource realBufferedSource, long j) throws EOFException {
                    realBufferedSource.getClass();
/* 18 */            realBufferedSource.require(j);
/* 20 */            return realBufferedSource.bufferField.readUtf8(j);
                }

/* 54 */        public static final void commonReadFully(okio.RealBufferedSource realBufferedSource, Buffer buffer, long j) throws IOException {
                    realBufferedSource.getClass();
                    buffer.getClass();
                    try {
/* 55 */                realBufferedSource.require(j);
/* 57 */                realBufferedSource.bufferField.readFully(buffer, j);
                    } catch (EOFException e) {
/* 59 */                buffer.writeAll(realBufferedSource.bufferField);
/* 60 */                throw e;
                    }
                }

/* 76 */        public static final int commonRead(okio.RealBufferedSource realBufferedSource, byte[] bArr, int i, int i2) {
                    realBufferedSource.getClass();
                    bArr.getClass();
                    long j = i2;
/* 77 */            SegmentedByteString.checkOffsetAndCount(bArr.length, i, j);
                    if (realBufferedSource.bufferField.size() == 0 && realBufferedSource.source.read(realBufferedSource.bufferField, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                        return -1;
                    }
/* 87 */            return realBufferedSource.bufferField.read(bArr, i, (int) Math.min(j, realBufferedSource.bufferField.size()));
                }

/* 109 */       public static final long commonIndexOf(okio.RealBufferedSource realBufferedSource, ByteString byteString, long j) throws IOException {
                    realBufferedSource.getClass();
                    byteString.getClass();
/* 110 */           if (realBufferedSource.closed) {
/* 119 */               f42.m3656l("closed");
                        return 0L;
                    }
                    while (true) {
/* 112 */               long jIndexOf = realBufferedSource.bufferField.indexOf(byteString, j);
                        if (jIndexOf != -1) {
                            return jIndexOf;
                        }
/* 114 */               long size = realBufferedSource.bufferField.size();
                        if (realBufferedSource.source.read(realBufferedSource.bufferField, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                            return -1L;
                        }
/* 118 */               j = Math.max(j, (size - ((long) byteString.size())) + 1);
                    }
                }
            }
