            package p000;

            import java.io.Writer;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class ga1 extends Writer {

                /* JADX INFO: renamed from: a */
                public final StringBuilder f8525a = new StringBuilder(128);

                /* JADX INFO: renamed from: c */
                public final void m3901c() {
/* 1 */             StringBuilder sb = this.f8525a;
/* 7 */             if (sb.length() > 0) {
/* 9 */                 sb.toString();
/* 17 */                sb.delete(0, sb.length());
                    }
                }

                @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
                public final void close() {
/* 1 */             m3901c();
                }

                @Override // java.io.Writer, java.io.Flushable
                public final void flush() {
/* 1 */             m3901c();
                }

                @Override // java.io.Writer
                public final void write(char[] cArr, int i, int i2) {
/* 2 */             for (int i3 = 0; i3 < i2; i3++) {
/* 6 */                 char c = cArr[i + i3];
/* 10 */                if (c == '\n') {
/* 12 */                    m3901c();
                        } else {
/* 18 */                    this.f8525a.append(c);
                        }
                    }
                }
            }
