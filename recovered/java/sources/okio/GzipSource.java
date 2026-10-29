            package okio;

            import com.google.firebase.analytics.FirebaseAnalytics;
            import java.io.IOException;
            import java.util.Arrays;
            import java.util.zip.CRC32;
            import java.util.zip.Inflater;
            import kotlin.Metadata;
            import okhttp3.HttpUrl;
            import p000.C1951n4;
            import p000.ds0;
            import p000.pm2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            @Metadata(m6175d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0002\u0010\u0003J \u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0002J\b\u0010\u0014\u001a\u00020\u000eH\u0016J\b\u0010\u0015\u001a\u00020\u000eH\u0002J\b\u0010\u0016\u001a\u00020\u000eH\u0002J\u0018\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0018H\u0016J\b\u0010\u001c\u001a\u00020\u001dH\u0016J \u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u0018H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, m6176d2 = {"Lokio/GzipSource;", "Lokio/Source;", FirebaseAnalytics.Param.SOURCE, "(Lokio/Source;)V", "crc", "Ljava/util/zip/CRC32;", "inflater", "Ljava/util/zip/Inflater;", "inflaterSource", "Lokio/InflaterSource;", "section", HttpUrl.FRAGMENT_ENCODE_SET, "Lokio/RealBufferedSource;", "checkEqual", HttpUrl.FRAGMENT_ENCODE_SET, "name", HttpUrl.FRAGMENT_ENCODE_SET, "expected", HttpUrl.FRAGMENT_ENCODE_SET, "actual", "close", "consumeHeader", "consumeTrailer", "read", HttpUrl.FRAGMENT_ENCODE_SET, "sink", "Lokio/Buffer;", "byteCount", "timeout", "Lokio/Timeout;", "updateCrc", "buffer", "offset", "okio"}, m6177k = 1, m6178mv = {1, 8, 0}, m6180xi = 48)
            public final class GzipSource implements Source {
                private final CRC32 crc;
                private final Inflater inflater;
                private final InflaterSource inflaterSource;
                private byte section;
                private final RealBufferedSource source;

                public GzipSource(Source source) {
/* 1 */             source.getClass();
/* 9 */             RealBufferedSource realBufferedSource = new RealBufferedSource(source);
/* 12 */            this.source = realBufferedSource;
/* 17 */            Inflater inflater = new Inflater(true);
/* 20 */            this.inflater = inflater;
/* 27 */            this.inflaterSource = new InflaterSource((BufferedSource) realBufferedSource, inflater);
/* 34 */            this.crc = new CRC32();
                }

                private final void checkEqual(String name, int expected, int actual) throws IOException {
/* 1 */             if (actual != expected) {
/* 32 */                throw new IOException(String.format("%s: actual 0x%08x != expected 0x%08x", Arrays.copyOf(new Object[]{name, Integer.valueOf(actual), Integer.valueOf(expected)}, 3)));
                    }
                }

                private final void consumeHeader() throws IOException {
/* 7 */             this.source.require(10L);
/* 16 */            byte b = this.source.bufferField.getByte(3L);
/* 29 */            boolean z = ((b >> 1) & 1) == 1;
/* 30 */            if (z) {
/* 40 */                updateCrc(this.source.bufferField, 0L, 10L);
                    }
/* 53 */            checkEqual("ID1ID2", 8075, this.source.readShort());
/* 60 */            this.source.skip(8L);
/* 66 */            if (((b >> 2) & 1) == 1) {
/* 72 */                this.source.require(2L);
/* 75 */                if (z) {
/* 85 */                    updateCrc(this.source.bufferField, 0L, 2L);
                        }
/* 99 */                long shortLe = this.source.bufferField.readShortLe() & 65535;
/* 103 */               this.source.require(shortLe);
/* 106 */               if (z) {
/* 114 */                   updateCrc(this.source.bufferField, 0L, shortLe);
                        }
/* 119 */               this.source.skip(shortLe);
                    }
/* 129 */           if (((b >> 3) & 1) == 1) {
/* 133 */               long jIndexOf = this.source.indexOf((byte) 0);
/* 139 */               if (jIndexOf == -1) {
/* 161 */                   C1951n4.m6854b();
/* 164 */                   return;
                        } else {
/* 141 */                   if (z) {
/* 151 */                       updateCrc(this.source.bufferField, 0L, jIndexOf + 1);
                            }
/* 157 */                   this.source.skip(jIndexOf + 1);
                        }
                    }
/* 168 */           if (((b >> 4) & 1) == 1) {
/* 172 */               long jIndexOf2 = this.source.indexOf((byte) 0);
/* 178 */               if (jIndexOf2 == -1) {
/* 200 */                   C1951n4.m6854b();
/* 203 */                   return;
                        } else {
/* 180 */                   if (z) {
/* 190 */                       updateCrc(this.source.bufferField, 0L, jIndexOf2 + 1);
                            }
/* 196 */                   this.source.skip(jIndexOf2 + 1);
                        }
                    }
/* 204 */           if (z) {
/* 222 */               checkEqual("FHCRC", this.source.readShortLe(), (short) this.crc.getValue());
/* 227 */               this.crc.reset();
                    }
                }

                private final void consumeTrailer() throws IOException {
/* 16 */            checkEqual("CRC", this.source.readIntLe(), (int) this.crc.getValue());
/* 34 */            checkEqual("ISIZE", this.source.readIntLe(), (int) this.inflater.getBytesWritten());
                }

                private final void updateCrc(Buffer buffer, long offset, long byteCount) {
/* 1 */             Segment segment = buffer.head;
/* 3 */             segment.getClass();
                    while (true) {
/* 6 */                 int i = segment.limit;
/* 8 */                 int i2 = segment.pos;
/* 15 */                if (offset < i - i2) {
                            break;
                        }
/* 19 */                offset -= (long) (i - i2);
/* 20 */                segment = segment.next;
/* 22 */                segment.getClass();
                    }
/* 30 */            while (byteCount > 0) {
/* 36 */                int i3 = (int) (((long) segment.pos) + offset);
/* 45 */                int iMin = (int) Math.min(segment.limit - i3, byteCount);
/* 50 */                this.crc.update(segment.data, i3, iMin);
/* 54 */                byteCount -= (long) iMin;
/* 55 */                segment = segment.next;
/* 57 */                segment.getClass();
/* 60 */                offset = 0;
                    }
                }

                @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
                public void close() throws IOException {
/* 3 */             this.inflaterSource.close();
                }

                @Override // okio.Source
                public long read(Buffer sink, long byteCount) throws IOException {
/* 2 */             sink.getClass();
/* 9 */             if (byteCount < 0) {
/* 88 */                ds0.m3200q(pm2.m7488k("byteCount < 0: ", byteCount));
/* 5 */                 return 0L;
                    }
/* 11 */            if (byteCount == 0) {
/* 5 */                 return 0L;
                    }
/* 17 */            if (this.section == 0) {
/* 19 */                consumeHeader();
/* 22 */                this.section = (byte) 1;
                    }
/* 29 */            if (this.section == 1) {
/* 31 */                long size = sink.size();
/* 37 */                long j = this.inflaterSource.read(sink, byteCount);
/* 43 */                if (j != -1) {
/* 50 */                    updateCrc(sink, size, j);
/* 46 */                    return j;
                        }
/* 54 */                this.section = (byte) 2;
                    }
/* 58 */            if (this.section == 2) {
/* 60 */                consumeTrailer();
/* 64 */                this.section = (byte) 3;
/* 72 */                if (!this.source.exhausted()) {
/* 77 */                    ds0.m3195l("gzip finished without exhausting source");
/* 5 */                     return 0L;
                        }
                    }
/* 27 */            return -1L;
                }

                @Override // okio.Source
                public Timeout timeout() {
/* 3 */             return this.source.timeout();
                }
            }
