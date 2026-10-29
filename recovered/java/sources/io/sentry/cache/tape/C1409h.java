            package io.sentry.cache.tape;

            import java.io.IOException;
            import java.util.ConcurrentModificationException;
            import java.util.Iterator;
            import p000.C1951n4;
            import p000.f42;
            
            /* JADX INFO: renamed from: io.sentry.cache.tape.h */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1409h implements Iterator {

                /* JADX INFO: renamed from: a */
                public int f10819a = 0;

                /* JADX INFO: renamed from: b */
                public long f10820b;

                /* JADX INFO: renamed from: c */
                public int f10821c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ C1410i f10822d;

                public C1409h(C1410i c1410i) {
/* 4 */             this.f10822d = c1410i;
/* 13 */            this.f10820b = c1410i.f10829e.f10817a;
/* 17 */            this.f10821c = c1410i.f10832v;
                }

                @Override // java.util.Iterator
                public final boolean hasNext() {
/* 1 */             C1410i c1410i = this.f10822d;
/* 6 */             if (c1410i.f10824U) {
/* 31 */                f42.m3656l("closed");
/* 5 */                 return false;
                    }
/* 12 */            if (c1410i.f10832v == this.f10821c) {
                        return this.f10819a != c1410i.f10828d;
                    }
/* 28 */            throw new ConcurrentModificationException();
                }

                @Override // java.util.Iterator
                public final Object next() throws IOException {
/* 1 */             byte[] bArr = C1410i.f10823V;
/* 3 */             C1410i c1410i = this.f10822d;
/* 8 */             if (c1410i.f10824U) {
/* 97 */                f42.m3656l("closed");
/* 7 */                 return null;
                    }
/* 14 */            if (c1410i.f10832v != this.f10821c) {
/* 94 */                throw new ConcurrentModificationException();
                    }
/* 16 */            int i = c1410i.f10828d;
/* 18 */            if (i == 0) {
/* 85 */                C1951n4.m6864o();
/* 7 */                 return null;
                    }
/* 22 */            if (this.f10819a >= i) {
/* 81 */                C1951n4.m6864o();
/* 7 */                 return null;
                    }
                    try {
/* 26 */                C1408g c1408gM5140f = c1410i.m5140f(this.f10820b);
/* 30 */                int i2 = c1408gM5140f.f10818b;
/* 32 */                long j = c1408gM5140f.f10817a;
/* 34 */                byte[] bArr2 = new byte[i2];
/* 38 */                long j2 = j + 4;
/* 39 */                long jM5146o = c1410i.m5146o(j2);
/* 43 */                this.f10820b = jM5146o;
/* 49 */                if (!c1410i.m5144m(i2, jM5146o, bArr2)) {
/* 53 */                    this.f10819a = c1410i.f10828d;
/* 55 */                    return bArr;
                        }
/* 62 */                this.f10820b = c1410i.m5146o(j2 + ((long) i2));
/* 68 */                this.f10819a++;
/* 70 */                return bArr2;
                    } catch (IOException e) {
/* 80 */                throw e;
                    } catch (OutOfMemoryError unused) {
/* 71 */                c1410i.m5143l();
/* 76 */                this.f10819a = c1410i.f10828d;
/* 78 */                return bArr;
                    }
                }

                @Override // java.util.Iterator
                public final void remove() throws IOException {
/* 1 */             C1410i c1410i = this.f10822d;
/* 7 */             if (c1410i.f10832v != this.f10821c) {
/* 46 */                throw new ConcurrentModificationException();
                    }
/* 11 */            if (c1410i.f10828d == 0) {
/* 37 */                C1951n4.m6864o();
                    } else {
/* 16 */                if (this.f10819a != 1) {
/* 33 */                    C1951n4.m6866q("Removal is only permitted from the head.");
/* 36 */                    return;
                        }
/* 18 */                c1410i.m5142k(1);
/* 23 */                this.f10821c = c1410i.f10832v;
/* 28 */                this.f10819a--;
                    }
                }
            }
