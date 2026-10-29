            package io.sentry;

            import androidx.core.app.NotificationCompat;
            import io.sentry.clientreport.C1412b;
            import io.sentry.exception.C1442c;
            import io.sentry.internal.debugmeta.C1505c;
            import io.sentry.protocol.C1600f0;
            import io.sentry.protocol.profiling.C1617a;
            import io.sentry.util.AbstractC1704c;
            import io.sentry.vendor.AbstractC1729a;
            import java.io.BufferedReader;
            import java.io.BufferedWriter;
            import java.io.ByteArrayInputStream;
            import java.io.ByteArrayOutputStream;
            import java.io.File;
            import java.io.IOException;
            import java.io.InputStreamReader;
            import java.io.OutputStreamWriter;
            import java.io.UnsupportedEncodingException;
            import java.nio.ByteBuffer;
            import java.nio.ByteOrder;
            import java.nio.charset.Charset;
            import java.util.LinkedHashMap;
            import java.util.Map;
            import java.util.concurrent.Callable;
            import p000.C1951n4;
            import p000.bh0;
            import p000.fm0;
            
            /* JADX INFO: renamed from: io.sentry.a5 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 10 */    public final class C1160a5 {

                /* JADX INFO: renamed from: d */
                public static final Charset f9798d = Charset.forName("UTF-8");

                /* JADX INFO: renamed from: a */
                public final C1381b5 f9799a;

                /* JADX INFO: renamed from: b */
                public final Callable f9800b;

                /* JADX INFO: renamed from: c */
                public byte[] f9801c;

                public C1160a5(C1381b5 c1381b5, byte[] bArr) {
/* 4 */             this.f9799a = c1381b5;
/* 6 */             this.f9801c = bArr;
/* 9 */             this.f9800b = null;
                }

                /* JADX INFO: renamed from: a */
                public static void m4716a(String str, long j, long j2) throws C1442c {
/* 3 */             if (j > j2) {
/* 29 */                throw new C1442c(String.format("Dropping attachment with filename '%s', because the size of the passed bytes with %d bytes is bigger than the maximum allowed attachment size of %d bytes.", str, Long.valueOf(j), Long.valueOf(j2)));
                    }
                }

                /* JADX INFO: renamed from: b */
                public static C1160a5 m4717b(InterfaceC1487i1 interfaceC1487i1, C1412b c1412b) {
/* 3 */             AbstractC1704c.m5462q(interfaceC1487i1, "ISerializer is required.");
/* 14 */            C1505c c1505c = new C1505c(new bh0(7, interfaceC1487i1, c1412b));
/* 46 */            return new C1160a5(new C1381b5(EnumC1538l5.resolve(c1412b), new CallableC1738w4(c1505c, 9), "application/json", null, null), new CallableC1738w4(c1505c, 10));
                }

                /* JADX INFO: renamed from: c */
                public static C1160a5 m4718c(final C1573o3 c1573o3, final InterfaceC1487i1 interfaceC1487i1, final InterfaceC1758z0 interfaceC1758z0) {
/* 1 */             final File file = c1573o3.f11188V;
/* 10 */            C1505c c1505c = new C1505c(new Callable() { // from class: io.sentry.z4
                        @Override // java.util.concurrent.Callable
                        public final Object call() throws C1442c {
/* 1 */                     InterfaceC1487i1 interfaceC1487i2 = interfaceC1487i1;
/* 5 */                     File file2 = file;
/* 7 */                     C1573o3 c1573o4 = c1573o3;
/* 9 */                     if (file2 != null) {
/* 15 */                        if (!file2.exists()) {
/* 128 */                           throw new C1442c(fm0.m3784j("Dropping profile chunk, because the file '", file2.getName(), "' doesn't exists"));
                                }
/* 25 */                        if ("java".equals(c1573o4.f11197f)) {
/* 27 */                            C1662s2 c1662s2 = C1662s2.f11640a;
/* 29 */                            InterfaceC1758z0 interfaceC1758z1 = interfaceC1758z0;
/* 31 */                            if (c1662s2 == interfaceC1758z1) {
/* 65 */                                throw new C1442c("No ProfileConverter available, dropping chunk.");
                                    }
                                    try {
/* 33 */                                file2.getAbsolutePath();
/* 38 */                                ((C1662s2) interfaceC1758z1).getClass();
/* 46 */                                c1573o4.f11190X = new C1617a();
                                    } catch (Exception e) {
/* 57 */                                throw new C1442c("Profile conversion failed", e);
                                    }
                                } else {
                                    try {
/* 85 */                                String str = new String(AbstractC1729a.m5490b(AbstractC1704c.m5460o(file2.getPath(), 52428800L)), "US-ASCII");
/* 92 */                                if (str.isEmpty()) {
/* 104 */                                   throw new C1442c("Profiling trace file is empty");
                                        }
/* 94 */                                c1573o4.f11189W = str;
                                    } catch (UnsupportedEncodingException e2) {
/* 106 */                               C1951n4.m6856g(e2);
/* 109 */                               return null;
                                    }
                                }
                            }
                            try {
                                try {
/* 131 */                           ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                    try {
/* 145 */                               BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, C1160a5.f9798d), NotificationCompat.FLAG_GROUP_SUMMARY);
                                        try {
/* 148 */                                   interfaceC1487i2.mo5063a(bufferedWriter, c1573o4);
/* 151 */                                   byte[] byteArray = byteArrayOutputStream.toByteArray();
/* 155 */                                   bufferedWriter.close();
/* 158 */                                   byteArrayOutputStream.close();
/* 161 */                                   if (file2 != null) {
/* 163 */                                       file2.delete();
                                            }
/* 166 */                                   return byteArray;
                                        } catch (Throwable th) {
                                            try {
/* 174 */                                       bufferedWriter.close();
                                            } catch (Throwable th2) {
/* 179 */                                       th.addSuppressed(th2);
                                            }
/* 182 */                                   throw th;
                                        }
                                    } catch (Throwable th3) {
                                        try {
/* 183 */                                   byteArrayOutputStream.close();
                                        } catch (Throwable th4) {
/* 188 */                                   th3.addSuppressed(th4);
                                        }
/* 191 */                               throw th3;
                                    }
                                } catch (IOException e3) {
/* 213 */                           throw new C1442c("Failed to serialize profile chunk\n" + e3.getMessage());
                                }
                            } catch (Throwable th5) {
/* 214 */                       if (file2 != null) {
/* 216 */                           file2.delete();
                                }
/* 219 */                       throw th5;
                            }
                        }
                    });
/* 52 */            return new C1160a5(new C1381b5(EnumC1538l5.ProfileChunk, new CallableC1738w4(c1505c, 16), "application-json", file != null ? file.getName() : null, (String) null, c1573o3.f11197f, (Integer) null), new CallableC1738w4(c1505c, 17));
                }

                /* JADX INFO: renamed from: d */
                public static C1160a5 m4719d(InterfaceC1487i1 interfaceC1487i1, C1764z6 c1764z6) {
/* 3 */             AbstractC1704c.m5462q(interfaceC1487i1, "ISerializer is required.");
/* 8 */             AbstractC1704c.m5462q(c1764z6, "Session is required.");
/* 19 */            C1505c c1505c = new C1505c(new bh0(4, interfaceC1487i1, c1764z6));
/* 47 */            return new C1160a5(new C1381b5(EnumC1538l5.Session, new CallableC1738w4(c1505c, 2), "application/json", null, null), new CallableC1738w4(c1505c, 3));
                }

                /* JADX INFO: renamed from: j */
                public static byte[] m4720j(LinkedHashMap linkedHashMap) throws IOException {
/* 3 */             ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
/* 13 */                byteArrayOutputStream.write((byte) (linkedHashMap.size() | 128));
/* 28 */                for (Map.Entry entry : linkedHashMap.entrySet()) {
/* 44 */                    byte[] bytes = ((String) entry.getKey()).getBytes(f9798d);
/* 48 */                    int length = bytes.length;
/* 51 */                    byteArrayOutputStream.write(-39);
/* 55 */                    byteArrayOutputStream.write((byte) length);
/* 58 */                    byteArrayOutputStream.write(bytes);
/* 65 */                    byte[] bArr = (byte[]) entry.getValue();
/* 67 */                    int length2 = bArr.length;
/* 70 */                    byteArrayOutputStream.write(-58);
/* 92 */                    byteArrayOutputStream.write(ByteBuffer.allocate(4).order(ByteOrder.BIG_ENDIAN).putInt(length2).array());
/* 95 */                    byteArrayOutputStream.write(bArr);
                        }
/* 101 */               byte[] byteArray = byteArrayOutputStream.toByteArray();
/* 105 */               byteArrayOutputStream.close();
/* 108 */               return byteArray;
                    } catch (Throwable th) {
                        try {
/* 109 */                   byteArrayOutputStream.close();
                        } catch (Throwable th2) {
/* 114 */                   th.addSuppressed(th2);
                        }
/* 117 */               throw th;
                    }
                }

                /* JADX INFO: renamed from: e */
                public final C1412b m4721e(InterfaceC1487i1 interfaceC1487i1) throws IOException {
/* 1 */             C1381b5 c1381b5 = this.f9799a;
/* 3 */             if (c1381b5 == null || c1381b5.f10744e != EnumC1538l5.ClientReport) {
/* 55 */                return null;
                    }
/* 30 */            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(m4722f()), f9798d));
                    try {
/* 39 */                C1412b c1412b = (C1412b) interfaceC1487i1.mo5064b(bufferedReader, C1412b.class);
/* 41 */                bufferedReader.close();
/* 44 */                return c1412b;
                    } catch (Throwable th) {
                        try {
/* 46 */                    bufferedReader.close();
                        } catch (Throwable th2) {
/* 51 */                    th.addSuppressed(th2);
                        }
/* 54 */                throw th;
                    }
                }

                /* JADX INFO: renamed from: f */
                public final byte[] m4722f() {
                    Callable callable;
/* 3 */             if (this.f9801c == null && (callable = this.f9800b) != null) {
/* 15 */                this.f9801c = (byte[]) callable.call();
                    }
/* 17 */            return this.f9801c;
                }

                /* JADX INFO: renamed from: g */
                public final C1583p5 m4723g(InterfaceC1487i1 interfaceC1487i1) throws IOException {
/* 1 */             C1381b5 c1381b5 = this.f9799a;
/* 3 */             if (c1381b5 == null || c1381b5.f10744e != EnumC1538l5.Log) {
/* 55 */                return null;
                    }
/* 30 */            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(m4722f()), f9798d));
                    try {
/* 39 */                C1583p5 c1583p5 = (C1583p5) interfaceC1487i1.mo5064b(bufferedReader, C1583p5.class);
/* 41 */                bufferedReader.close();
/* 44 */                return c1583p5;
                    } catch (Throwable th) {
                        try {
/* 46 */                    bufferedReader.close();
                        } catch (Throwable th2) {
/* 51 */                    th.addSuppressed(th2);
                        }
/* 54 */                throw th;
                    }
                }

                /* JADX INFO: renamed from: h */
                public final C1673t5 m4724h(InterfaceC1487i1 interfaceC1487i1) throws IOException {
/* 1 */             C1381b5 c1381b5 = this.f9799a;
/* 3 */             if (c1381b5 == null || c1381b5.f10744e != EnumC1538l5.TraceMetric) {
/* 55 */                return null;
                    }
/* 30 */            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(m4722f()), f9798d));
                    try {
/* 39 */                C1673t5 c1673t5 = (C1673t5) interfaceC1487i1.mo5064b(bufferedReader, C1673t5.class);
/* 41 */                bufferedReader.close();
/* 44 */                return c1673t5;
                    } catch (Throwable th) {
                        try {
/* 46 */                    bufferedReader.close();
                        } catch (Throwable th2) {
/* 51 */                    th.addSuppressed(th2);
                        }
/* 54 */                throw th;
                    }
                }

                /* JADX INFO: renamed from: i */
                public final C1600f0 m4725i(InterfaceC1487i1 interfaceC1487i1) throws IOException {
/* 1 */             C1381b5 c1381b5 = this.f9799a;
/* 3 */             if (c1381b5 == null || c1381b5.f10744e != EnumC1538l5.Transaction) {
/* 55 */                return null;
                    }
/* 30 */            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(m4722f()), f9798d));
                    try {
/* 39 */                C1600f0 c1600f0 = (C1600f0) interfaceC1487i1.mo5064b(bufferedReader, C1600f0.class);
/* 41 */                bufferedReader.close();
/* 44 */                return c1600f0;
                    } catch (Throwable th) {
                        try {
/* 46 */                    bufferedReader.close();
                        } catch (Throwable th2) {
/* 51 */                    th.addSuppressed(th2);
                        }
/* 54 */                throw th;
                    }
                }

/* 11 */        public C1160a5(C1381b5 c1381b5, Callable callable) {
/* 13 */            this.f9799a = c1381b5;
/* 14 */            this.f9800b = callable;
/* 15 */            this.f9801c = null;
                }
            }
