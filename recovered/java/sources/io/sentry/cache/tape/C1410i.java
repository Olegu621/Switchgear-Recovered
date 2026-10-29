            package io.sentry.cache.tape;

            import android.support.v4.media.session.PlaybackStateCompat;
            import java.io.Closeable;
            import java.io.EOFException;
            import java.io.File;
            import java.io.IOException;
            import java.io.RandomAccessFile;
            import java.util.Iterator;
            import p000.AbstractC0886en;
            import p000.C1951n4;
            import p000.ds0;
            import p000.f42;
            import p000.fm0;
            
            /* JADX INFO: renamed from: io.sentry.cache.tape.i */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1410i implements Closeable, Iterable {

                /* JADX INFO: renamed from: V */
                public static final byte[] f10823V = new byte[4096];

                /* JADX INFO: renamed from: U */
                public boolean f10824U;

                /* JADX INFO: renamed from: a */
                public RandomAccessFile f10825a;

                /* JADX INFO: renamed from: b */
                public final File f10826b;

                /* JADX INFO: renamed from: c */
                public long f10827c;

                /* JADX INFO: renamed from: d */
                public int f10828d;

                /* JADX INFO: renamed from: e */
                public C1408g f10829e;

                /* JADX INFO: renamed from: f */
                public C1408g f10830f;

                /* JADX INFO: renamed from: i */
                public final byte[] f10831i = new byte[32];

                /* JADX INFO: renamed from: v */
                public int f10832v = 0;

                /* JADX INFO: renamed from: w */
                public final int f10833w;

                public C1410i(File file, RandomAccessFile randomAccessFile, int i) throws IOException {
/* 13 */            this.f10826b = file;
/* 15 */            this.f10825a = randomAccessFile;
/* 17 */            this.f10833w = i;
/* 19 */            m5141g();
                }

                /* JADX INFO: renamed from: c */
                public static RandomAccessFile m5135c(File file) throws IOException {
/* 7 */             if (!file.exists()) {
/* 32 */                File file2 = new File(file.getPath() + ".tmp");
/* 37 */                RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "rwd");
                        try {
/* 42 */                    randomAccessFile.setLength(PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM);
/* 47 */                    randomAccessFile.seek(0L);
/* 53 */                    randomAccessFile.writeInt(-2147483647);
/* 56 */                    randomAccessFile.writeLong(PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM);
/* 59 */                    randomAccessFile.close();
/* 66 */                    if (!file2.renameTo(file)) {
/* 71 */                        ds0.m3195l("Rename failed!");
/* 74 */                        return null;
                            }
                        } catch (Throwable th) {
/* 77 */                    randomAccessFile.close();
/* 80 */                    throw th;
                        }
                    }
/* 83 */            return new RandomAccessFile(file, "rwd");
                }

                /* JADX INFO: renamed from: h */
                public static int m5136h(byte[] bArr, int i) {
/* 31 */            return ((bArr[i] & 255) << 24) + ((bArr[i + 1] & 255) << 16) + ((bArr[i + 2] & 255) << 8) + (bArr[i + 3] & 255);
                }

                /* JADX INFO: renamed from: i */
                public static long m5137i(byte[] bArr, int i) {
/* 76 */            return ((((long) bArr[i]) & 255) << 56) + ((((long) bArr[i + 1]) & 255) << 48) + ((((long) bArr[i + 2]) & 255) << 40) + ((((long) bArr[i + 3]) & 255) << 32) + ((((long) bArr[i + 4]) & 255) << 24) + ((((long) bArr[i + 5]) & 255) << 16) + ((((long) bArr[i + 6]) & 255) << 8) + (((long) bArr[i + 7]) & 255);
                }

                /* JADX INFO: renamed from: q */
                public static void m5138q(byte[] bArr, int i, int i2) {
/* 4 */             bArr[i] = (byte) (i2 >> 24);
/* 11 */            bArr[i + 1] = (byte) (i2 >> 16);
/* 18 */            bArr[i + 2] = (byte) (i2 >> 8);
/* 23 */            bArr[i + 3] = (byte) i2;
                }

                /* JADX INFO: renamed from: s */
                public static void m5139s(int i, long j, byte[] bArr) {
/* 7 */             bArr[i] = (byte) (j >> 56);
/* 17 */            bArr[i + 1] = (byte) (j >> 48);
/* 27 */            bArr[i + 2] = (byte) (j >> 40);
/* 37 */            bArr[i + 3] = (byte) (j >> 32);
/* 47 */            bArr[i + 4] = (byte) (j >> 24);
/* 57 */            bArr[i + 5] = (byte) (j >> 16);
/* 67 */            bArr[i + 6] = (byte) (j >> 8);
/* 73 */            bArr[i + 7] = (byte) j;
                }

                public final void clear() throws IOException {
/* 3 */             if (this.f10824U) {
/* 74 */                f42.m3656l("closed");
/* 77 */                return;
                    }
/* 13 */            m5147p(PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM, 0, 0L, 0L);
/* 20 */            this.f10825a.seek(32L);
/* 30 */            this.f10825a.write(f10823V, 0, 4064);
/* 33 */            this.f10828d = 0;
/* 35 */            C1408g c1408g = C1408g.f10816c;
/* 37 */            this.f10829e = c1408g;
/* 39 */            this.f10830f = c1408g;
/* 48 */            if (this.f10827c > PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM) {
/* 52 */                this.f10825a.setLength(PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM);
/* 61 */                this.f10825a.getChannel().force(true);
                    }
/* 64 */            this.f10827c = PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM;
/* 69 */            this.f10832v++;
                }

                @Override // java.io.Closeable, java.lang.AutoCloseable
                public final void close() throws IOException {
/* 2 */             this.f10824U = true;
/* 6 */             this.f10825a.close();
                }

                /* JADX INFO: renamed from: f */
                public final C1408g m5140f(long j) {
/* 5 */             if (j != 0) {
/* 9 */                 byte[] bArr = this.f10831i;
/* 15 */                if (m5144m(4, j, bArr)) {
/* 27 */                    return new C1408g(m5136h(bArr, 0), j);
                        }
                    }
/* 17 */            return C1408g.f10816c;
                }

                /* JADX INFO: renamed from: g */
                public final void m5141g() throws IOException {
/* 5 */             this.f10825a.seek(0L);
/* 8 */             RandomAccessFile randomAccessFile = this.f10825a;
/* 10 */            byte[] bArr = this.f10831i;
/* 12 */            randomAccessFile.readFully(bArr);
/* 20 */            this.f10827c = m5137i(bArr, 4);
/* 28 */            this.f10828d = m5136h(bArr, 12);
/* 32 */            long jM5137i = m5137i(bArr, 16);
/* 38 */            long jM5137i2 = m5137i(bArr, 24);
/* 42 */            long j = this.f10827c;
/* 46 */            long length = this.f10825a.length();
/* 52 */            long j2 = this.f10827c;
/* 54 */            if (j <= length) {
/* 60 */                if (j2 <= 32) {
/* 90 */                    ds0.m3195l(fm0.m3787m(new StringBuilder("File is corrupt; length stored in header ("), this.f10827c, ") is invalid."));
/* 93 */                    return;
                        } else {
/* 66 */                    this.f10829e = m5140f(jM5137i);
/* 72 */                    this.f10830f = m5140f(jM5137i2);
/* 74 */                    return;
                        }
                    }
/* 127 */           throw new IOException("File is truncated. Expected length: " + j2 + ", Actual length: " + this.f10825a.length());
                }

                @Override // java.lang.Iterable
                public final Iterator iterator() {
/* 3 */             return new C1409h(this);
                }

                /* JADX INFO: renamed from: k */
                public final void m5142k(int i) throws IOException {
/* 5 */             if (i < 0) {
/* 151 */               C1951n4.m6859j(AbstractC0886en.m3505i(i, "Cannot remove negative (", ") number of elements."));
/* 154 */               return;
                    }
/* 7 */             if (i == 0) {
/* 118 */               return;
                    }
/* 11 */            int i2 = this.f10828d;
/* 13 */            if (i == i2) {
/* 15 */                clear();
/* 18 */                return;
                    }
/* 19 */            if (i2 == 0) {
/* 139 */               C1951n4.m6864o();
/* 142 */               return;
                    }
/* 21 */            if (i > i2) {
/* 135 */               C1951n4.m6859j(fm0.m3786l(fm0.m3793s(i, "Cannot remove more elements (", ") than present in queue ("), this.f10828d, ")."));
/* 138 */               return;
                    }
/* 23 */            C1408g c1408g = this.f10829e;
/* 25 */            long j = c1408g.f10817a;
/* 27 */            int iM5136h = c1408g.f10818b;
/* 34 */            long jM5146o = j;
/* 35 */            long j2 = 0;
/* 36 */            for (int i3 = 0; i3 < i; i3++) {
/* 41 */                j2 += (long) (iM5136h + 4);
/* 47 */                jM5146o = m5146o(jM5146o + 4 + ((long) iM5136h));
/* 52 */                byte[] bArr = this.f10831i;
/* 58 */                if (!m5144m(4, jM5146o, bArr)) {
/* 118 */                   return;
                        }
/* 61 */                iM5136h = m5136h(bArr, 0);
                    }
/* 77 */            m5147p(this.f10827c, this.f10828d - i, jM5146o, this.f10830f.f10817a);
/* 83 */            this.f10828d -= i;
/* 89 */            this.f10832v++;
/* 96 */            this.f10829e = new C1408g(iM5136h, jM5146o);
/* 100 */           while (j2 > 0) {
/* 108 */               int iMin = (int) Math.min(j2, PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM);
/* 111 */               m5145n(iMin, j, f10823V);
                        long j3 = iMin;
/* 115 */               j2 -= j3;
/* 116 */               j += j3;
                    }
                }

                /* JADX INFO: renamed from: l */
                public final void m5143l() throws IOException {
/* 3 */             this.f10825a.close();
/* 6 */             File file = this.f10826b;
/* 8 */             file.delete();
/* 15 */            this.f10825a = m5135c(file);
/* 17 */            m5141g();
                }

                /* JADX INFO: renamed from: m */
                public final boolean m5144m(int i, long j, byte[] bArr) throws IOException {
                    try {
/* 2 */                 long jM5146o = m5146o(j);
/* 7 */                 long j2 = ((long) i) + jM5146o;
/* 8 */                 long j3 = this.f10827c;
/* 12 */                RandomAccessFile randomAccessFile = this.f10825a;
/* 14 */                if (j2 <= j3) {
/* 16 */                    randomAccessFile.seek(jM5146o);
/* 21 */                    this.f10825a.readFully(bArr, 0, i);
/* 48 */                    return true;
                        }
/* 26 */                int i2 = (int) (j3 - jM5146o);
/* 27 */                randomAccessFile.seek(jM5146o);
/* 32 */                this.f10825a.readFully(bArr, 0, i2);
/* 39 */                this.f10825a.seek(32L);
/* 45 */                this.f10825a.readFully(bArr, i2, i - i2);
/* 48 */                return true;
                    } catch (EOFException unused) {
/* 56 */                m5143l();
/* 1 */                 return false;
                    } catch (IOException e) {
/* 55 */                throw e;
                    } catch (Throwable unused2) {
/* 50 */                m5143l();
/* 1 */                 return false;
                    }
                }

                /* JADX INFO: renamed from: n */
                public final void m5145n(int i, long j, byte[] bArr) throws IOException {
/* 1 */             long jM5146o = m5146o(j);
/* 6 */             long j2 = ((long) i) + jM5146o;
/* 7 */             long j3 = this.f10827c;
/* 11 */            RandomAccessFile randomAccessFile = this.f10825a;
/* 14 */            if (j2 <= j3) {
/* 16 */                randomAccessFile.seek(jM5146o);
/* 21 */                this.f10825a.write(bArr, 0, i);
/* 24 */                return;
                    }
/* 26 */            int i2 = (int) (j3 - jM5146o);
/* 27 */            randomAccessFile.seek(jM5146o);
/* 32 */            this.f10825a.write(bArr, 0, i2);
/* 39 */            this.f10825a.seek(32L);
/* 45 */            this.f10825a.write(bArr, i2, i - i2);
                }

                /* JADX INFO: renamed from: o */
                public final long m5146o(long j) {
/* 1 */             long j2 = this.f10827c;
                    return j < j2 ? j : (j + 32) - j2;
                }

                /* JADX INFO: renamed from: p */
                public final void m5147p(long j, int i, long j2, long j3) throws IOException {
/* 5 */             this.f10825a.seek(0L);
/* 11 */            byte[] bArr = this.f10831i;
/* 14 */            m5138q(bArr, 0, -2147483647);
/* 18 */            m5139s(4, j, bArr);
/* 23 */            m5138q(bArr, 12, i);
/* 28 */            m5139s(16, j2, bArr);
/* 33 */            m5139s(24, j3, bArr);
/* 40 */            this.f10825a.write(bArr, 0, 32);
                }

                public final String toString() {
/* 58 */            return "QueueFile{file=" + this.f10826b + ", zero=true, length=" + this.f10827c + ", size=" + this.f10828d + ", first=" + this.f10829e + ", last=" + this.f10830f + '}';
                }
            }
