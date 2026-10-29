            package io.sentry.util;

            import java.io.Writer;
            
            /* JADX INFO: renamed from: io.sentry.util.d */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
/* 22 */    public final class C1705d extends Writer {

                /* JADX INFO: renamed from: a */
                public long f11728a = 0;

                /* JADX INFO: renamed from: c */
                public static int m5468c(char c) {
/* 3 */             if (c <= 127) {
/* 5 */                 return 1;
                    }
                    return (c > 2047 && !Character.isSurrogate(c)) ? 3 : 2;
                }

                @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
                public final void close() {
                }

                @Override // java.io.Writer, java.io.Flushable
                public final void flush() {
                }

                @Override // java.io.Writer
                public final void write(String str, int i, int i2) {
/* 4 */             for (int i3 = i; i3 < i + i2; i3++) {
/* 18 */                this.f11728a += (long) m5468c(str.charAt(i3));
                    }
                }

                @Override // java.io.Writer
/* 23 */        public final void write(int i) {
/* 24 */            this.f11728a += (long) m5468c((char) i);
                }

                @Override // java.io.Writer
/* 24 */        public final void write(char[] cArr, int i, int i2) {
                    for (int i3 = i; i3 < i + i2; i3++) {
/* 25 */                this.f11728a += (long) m5468c(cArr[i3]);
                    }
                }
            }
