            package io.sentry.cache.tape;

            import android.support.v4.media.session.PlaybackStateCompat;
            import java.io.IOException;
            import java.nio.channels.FileChannel;
            import java.util.Iterator;
            import p000.C1951n4;
            import p000.f42;
            import p000.tf0;
            
            /* JADX INFO: renamed from: io.sentry.cache.tape.d */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1405d extends AbstractC1407f {

                /* JADX INFO: renamed from: a */
                public final C1410i f10813a;

                /* JADX INFO: renamed from: b */
                public final tf0 f10814b = new tf0();

                /* JADX INFO: renamed from: c */
                public final InterfaceC1406e f10815c;

                public C1405d(C1410i c1410i, InterfaceC1406e interfaceC1406e) {
/* 11 */            this.f10813a = c1410i;
/* 13 */            this.f10815c = interfaceC1406e;
                }

                @Override // io.sentry.cache.tape.AbstractC1407f
                /* JADX INFO: renamed from: c */
                public final void mo5130c(Object obj) throws IOException {
                    long j;
                    long j2;
                    long j3;
                    long jM5146o;
                    long j4;
                    long j5;
/* 3 */             tf0 tf0Var = this.f10814b;
/* 5 */             tf0Var.reset();
/* 12 */            this.f10815c.mo5132c(obj, tf0Var);
/* 15 */            byte[] bArrM8784c = tf0Var.m8784c();
/* 19 */            int size = tf0Var.size();
/* 23 */            C1410i c1410i = this.f10813a;
/* 25 */            c1410i.getClass();
/* 28 */            byte[] bArr = c1410i.f10831i;
/* 30 */            if (bArrM8784c == null) {
/* 365 */               C1951n4.m6868s("data == null");
/* 368 */               return;
                    }
/* 32 */            if (size < 0 || size > bArrM8784c.length) {
/* 362 */               throw new IndexOutOfBoundsException();
                    }
/* 39 */            if (c1410i.f10824U) {
/* 353 */               f42.m3656l("closed");
/* 356 */               return;
                    }
/* 41 */            int i = c1410i.f10833w;
/* 45 */            if (i != -1 && c1410i.f10828d == i) {
/* 52 */                c1410i.m5142k(1);
                    }
/* 58 */            long j6 = ((long) size) + 4;
/* 59 */            long j7 = c1410i.f10827c;
/* 65 */            if (c1410i.f10828d == 0) {
/* 67 */                j = 4;
/* 69 */                j3 = 32;
/* 70 */                j2 = 32;
                    } else {
/* 73 */                C1408g c1408g = c1410i.f10830f;
/* 75 */                long j8 = c1408g.f10817a;
/* 77 */                j = 4;
/* 81 */                long j9 = c1410i.f10829e.f10817a;
/* 85 */                int i2 = c1408g.f10818b;
/* 87 */                if (j8 >= j9) {
/* 94 */                    j3 = (j8 - j9) + 4 + ((long) i2) + 32;
/* 95 */                    j2 = 32;
                        } else {
/* 100 */                   j2 = 32;
/* 105 */                   j3 = (((j8 + 4) + ((long) i2)) + j7) - j9;
                        }
                    }
/* 106 */           long j10 = j7 - j3;
/* 110 */           if (j10 < j6) {
/* 118 */               do {
/* 114 */                   j10 += j7;
/* 115 */                   j7 <<= 1;
/* 118 */               } while (j10 < j6);
/* 122 */               c1410i.f10825a.setLength(j7);
/* 131 */               c1410i.f10825a.getChannel().force(true);
/* 134 */               C1408g c1408g2 = c1410i.f10830f;
/* 144 */               long jM5146o2 = c1410i.m5146o(c1408g2.f10817a + j + ((long) c1408g2.f10818b));
/* 156 */               if (jM5146o2 <= c1410i.f10829e.f10817a) {
/* 160 */                   FileChannel channel = c1410i.f10825a.getChannel();
/* 166 */                   channel.position(c1410i.f10827c);
/* 169 */                   j4 = jM5146o2 - j2;
/* 183 */                   if (channel.transferTo(32L, j4, channel) != j4) {
/* 188 */                       C1951n4.m6856g("Copied insufficient number of bytes!");
/* 191 */                       return;
                            }
                        } else {
/* 192 */                   j4 = 0;
                        }
/* 196 */               long j11 = c1410i.f10830f.f10817a;
/* 200 */               long j12 = c1410i.f10829e.f10817a;
/* 204 */               if (j11 < j12) {
/* 209 */                   long j13 = (c1410i.f10827c + j11) - j2;
/* 214 */                   j5 = j7;
/* 218 */                   c1410i.m5147p(j5, c1410i.f10828d, j12, j13);
/* 230 */                   c1410i.f10830f = new C1408g(c1410i.f10830f.f10818b, j13);
                        } else {
/* 237 */                   j5 = j7;
/* 241 */                   c1410i.m5147p(j5, c1410i.f10828d, j12, j11);
                        }
/* 245 */               c1410i.f10827c = j5;
/* 247 */               long j14 = j2;
/* 249 */               long j15 = j4;
/* 253 */               while (j15 > 0) {
/* 261 */                   int iMin = (int) Math.min(j15, PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM);
/* 264 */                   c1410i.m5145n(iMin, j14, C1410i.f10823V);
                            long j16 = iMin;
/* 268 */                   j15 -= j16;
/* 269 */                   j14 += j16;
                        }
                    }
/* 278 */           boolean z = c1410i.f10828d == 0;
/* 279 */           if (z) {
/* 281 */               jM5146o = j2;
                    } else {
/* 284 */               C1408g c1408g3 = c1410i.f10830f;
/* 294 */               jM5146o = c1410i.m5146o(c1408g3.f10817a + j + ((long) c1408g3.f10818b));
                    }
/* 301 */           C1408g c1408g4 = new C1408g(size, jM5146o);
/* 304 */           C1410i.m5138q(bArr, 0, size);
/* 308 */           c1410i.m5145n(4, jM5146o, bArr);
/* 313 */           c1410i.m5145n(size, jM5146o + j, bArrM8784c);
/* 331 */           c1410i.m5147p(c1410i.f10827c, c1410i.f10828d + 1, z ? jM5146o : c1410i.f10829e.f10817a, jM5146o);
/* 334 */           c1410i.f10830f = c1408g4;
/* 339 */           c1410i.f10828d++;
/* 344 */           c1410i.f10832v++;
/* 346 */           if (z) {
/* 348 */               c1410i.f10829e = c1408g4;
                    }
                }

                @Override // io.sentry.cache.tape.AbstractC1407f
                public final void clear() throws IOException {
/* 3 */             this.f10813a.clear();
                }

                @Override // java.io.Closeable, java.lang.AutoCloseable
                public final void close() throws IOException {
/* 3 */             this.f10813a.close();
                }

                @Override // io.sentry.cache.tape.AbstractC1407f
                /* JADX INFO: renamed from: g */
                public final void mo5131g(int i) throws IOException {
/* 3 */             this.f10813a.m5142k(i);
                }

                @Override // java.lang.Iterable
                public final Iterator iterator() {
/* 3 */             C1410i c1410i = this.f10813a;
/* 5 */             c1410i.getClass();
/* 13 */            return new C1404c(this, new C1409h(c1410i));
                }

                @Override // io.sentry.cache.tape.AbstractC1407f
                public final int size() {
/* 3 */             return this.f10813a.f10828d;
                }

                public final String toString() {
/* 18 */            return "FileObjectQueue{queueFile=" + this.f10813a + '}';
                }
            }
