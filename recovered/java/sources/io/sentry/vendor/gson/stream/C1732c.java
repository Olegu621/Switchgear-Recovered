            package io.sentry.vendor.gson.stream;

            import java.io.Closeable;
            import java.io.Flushable;
            import java.io.IOException;
            import java.io.Writer;
            import java.util.Arrays;
            import p000.ds0;
            import p000.f42;
            
            /* JADX INFO: renamed from: io.sentry.vendor.gson.stream.c */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class C1732c implements Closeable, Flushable {

                /* JADX INFO: renamed from: w */
                public static final String[] f11783w = new String[128];

                /* JADX INFO: renamed from: a */
                public final Writer f11784a;

                /* JADX INFO: renamed from: b */
                public int[] f11785b;

                /* JADX INFO: renamed from: c */
                public int f11786c;

                /* JADX INFO: renamed from: d */
                public String f11787d;

                /* JADX INFO: renamed from: e */
                public String f11788e;

                /* JADX INFO: renamed from: f */
                public boolean f11789f;

                /* JADX INFO: renamed from: i */
                public String f11790i;

                /* JADX INFO: renamed from: v */
                public final boolean f11791v;

                static {
/* 10 */            for (int i = 0; i <= 31; i++) {
/* 28 */                f11783w[i] = String.format("\\u%04x", Integer.valueOf(i));
                    }
/* 33 */            String[] strArr = f11783w;
/* 39 */            strArr[34] = "\\\"";
/* 45 */            strArr[92] = "\\\\";
/* 51 */            strArr[9] = "\\t";
/* 57 */            strArr[8] = "\\b";
/* 63 */            strArr[10] = "\\n";
/* 69 */            strArr[13] = "\\r";
/* 75 */            strArr[12] = "\\f";
/* 81 */            String[] strArr2 = (String[]) strArr.clone();
/* 87 */            strArr2[60] = "\\u003c";
/* 93 */            strArr2[62] = "\\u003e";
/* 99 */            strArr2[38] = "\\u0026";
/* 105 */           strArr2[61] = "\\u003d";
/* 111 */           strArr2[39] = "\\u0027";
                }

                public C1732c(Writer writer) {
/* 6 */             int[] iArr = new int[8];
/* 8 */             this.f11785b = iArr;
/* 11 */            this.f11786c = 0;
/* 14 */            if (iArr.length == 0) {
/* 20 */                this.f11785b = Arrays.copyOf(iArr, 0);
                    }
/* 22 */            int[] iArr2 = this.f11785b;
/* 24 */            int i = this.f11786c;
/* 28 */            this.f11786c = i + 1;
/* 31 */            iArr2[i] = 6;
/* 35 */            this.f11788e = ":";
/* 38 */            this.f11791v = true;
/* 40 */            this.f11784a = writer;
                }

                /* JADX INFO: renamed from: c */
                public final void m5511c() {
/* 1 */             int iM5515i = m5515i();
/* 7 */             if (iM5515i == 1) {
/* 75 */                this.f11785b[this.f11786c - 1] = 2;
/* 77 */                m5513g();
/* 80 */                return;
                    }
/* 9 */             Writer writer = this.f11784a;
/* 11 */            if (iM5515i == 2) {
/* 63 */                writer.append(',');
/* 66 */                m5513g();
/* 69 */                return;
                    }
/* 14 */            if (iM5515i == 4) {
/* 49 */                writer.append((CharSequence) this.f11788e);
/* 58 */                this.f11785b[this.f11786c - 1] = 5;
/* 60 */                return;
                    }
/* 18 */            if (iM5515i != 6) {
/* 20 */                if (iM5515i != 7) {
/* 35 */                    f42.m3656l("Nesting problem.");
/* 38 */                    return;
                        } else if (!this.f11789f) {
/* 29 */                    f42.m3656l("JSON must have only one top-level value.");
/* 32 */                    return;
                        }
                    }
/* 44 */            this.f11785b[this.f11786c - 1] = 7;
                }

                @Override // java.io.Closeable, java.lang.AutoCloseable
                public final void close() throws IOException {
/* 3 */             this.f11784a.close();
/* 6 */             int i = this.f11786c;
/* 9 */             if (i > 1 || (i == 1 && this.f11785b[i - 1] != 7)) {
/* 27 */                ds0.m3195l("Incomplete document");
                    } else {
/* 22 */                this.f11786c = 0;
                    }
                }

                /* JADX INFO: renamed from: f */
                public final void m5512f(int i, int i2, char c) {
/* 1 */             int iM5515i = m5515i();
/* 5 */             if (iM5515i != i2 && iM5515i != i) {
/* 12 */                f42.m3656l("Nesting problem.");
/* 15 */                return;
                    }
/* 18 */            if (this.f11790i != null) {
/* 41 */                ds0.m3206w(this.f11790i, "Dangling name: ");
/* 44 */                return;
                    }
/* 24 */            this.f11786c--;
/* 26 */            if (iM5515i == i2) {
/* 28 */                m5513g();
                    }
/* 33 */            this.f11784a.write(c);
                }

                @Override // java.io.Flushable
                public final void flush() throws IOException {
/* 3 */             if (this.f11786c != 0) {
/* 7 */                 this.f11784a.flush();
                    } else {
/* 13 */                f42.m3656l("JsonWriter is closed.");
                    }
                }

                /* JADX INFO: renamed from: g */
                public final void m5513g() throws IOException {
/* 3 */             if (this.f11787d == null) {
/* 26 */                return;
                    }
/* 8 */             Writer writer = this.f11784a;
/* 10 */            writer.write(10);
/* 13 */            int i = this.f11786c;
/* 16 */            for (int i2 = 1; i2 < i; i2++) {
/* 20 */                writer.write(this.f11787d);
                    }
                }

                /* JADX INFO: renamed from: h */
                public final void m5514h() {
/* 3 */             if (this.f11790i != null) {
/* 7 */                 if (!this.f11791v) {
/* 14 */                    this.f11790i = null;
/* 16 */                    return;
                        }
/* 9 */                 m5517l();
                    }
/* 17 */            m5511c();
/* 24 */            this.f11784a.write("null");
                }

                /* JADX INFO: renamed from: i */
                public final int m5515i() {
/* 1 */             int i = this.f11786c;
/* 3 */             if (i != 0) {
/* 9 */                 return this.f11785b[i - 1];
                    }
/* 14 */            f42.m3656l("JsonWriter is closed.");
/* 17 */            return 0;
                }

                /* JADX WARN: Code duplicated, block: B:16:0x002d  */
                /* JADX INFO: renamed from: k */
                public final void m5516k(String str) throws IOException {
                    String str2;
/* 1 */             Writer writer = this.f11784a;
/* 5 */             writer.write(34);
/* 8 */             int length = str.length();
/* 13 */            int i = 0;
/* 14 */            for (int i2 = 0; i2 < length; i2++) {
/* 16 */                char cCharAt = str.charAt(i2);
/* 22 */                if (cCharAt < 128) {
/* 26 */                    str2 = f11783w[cCharAt];
/* 28 */                    if (str2 != null) {
/* 44 */                        if (i < i2) {
/* 48 */                            writer.write(str, i, i2 - i);
                                }
/* 51 */                        writer.write(str2);
/* 54 */                        i = i2 + 1;
                            }
                        } else {
/* 33 */                    if (cCharAt == 8232) {
/* 35 */                        str2 = "\\u2028";
                            } else if (cCharAt == 8233) {
/* 42 */                        str2 = "\\u2029";
                            }
/* 44 */                    if (i < i2) {
/* 48 */                        writer.write(str, i, i2 - i);
                            }
/* 51 */                    writer.write(str2);
/* 54 */                    i = i2 + 1;
                        }
                    }
/* 59 */            if (i < length) {
/* 62 */                writer.write(str, i, length - i);
                    }
/* 65 */            writer.write(34);
                }

                /* JADX INFO: renamed from: l */
                public final void m5517l() {
/* 3 */             if (this.f11790i != null) {
/* 5 */                 int iM5515i = m5515i();
/* 10 */                if (iM5515i == 5) {
/* 16 */                    this.f11784a.write(44);
                        } else if (iM5515i != 3) {
/* 46 */                    f42.m3656l("Nesting problem.");
/* 49 */                    return;
                        }
/* 23 */                m5513g();
/* 33 */                this.f11785b[this.f11786c - 1] = 4;
/* 37 */                m5516k(this.f11790i);
/* 41 */                this.f11790i = null;
                    }
                }
            }
