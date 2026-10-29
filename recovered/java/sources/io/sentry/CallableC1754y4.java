            package io.sentry;

            import androidx.core.app.NotificationCompat;
            import io.sentry.exception.C1442c;
            import io.sentry.protocol.C1610k0;
            import io.sentry.util.AbstractC1704c;
            import io.sentry.util.AbstractC1706e;
            import io.sentry.vendor.AbstractC1729a;
            import java.io.BufferedWriter;
            import java.io.ByteArrayOutputStream;
            import java.io.File;
            import java.io.IOException;
            import java.io.OutputStreamWriter;
            import java.io.UnsupportedEncodingException;
            import java.nio.charset.Charset;
            import java.util.List;
            import java.util.concurrent.Callable;
            import p000.C1951n4;
            import p000.bh0;
            import p000.fm0;
            
            /* JADX INFO: renamed from: io.sentry.y4 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 14 */    public final /* synthetic */ class CallableC1754y4 implements Callable {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f11837a = 0;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ long f11838b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ InterfaceC1487i1 f11839c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ Object f11840d;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ Object f11841e;

                public /* synthetic */ CallableC1754y4(C1154a c1154a, long j, InterfaceC1487i1 interfaceC1487i1, ILogger iLogger) {
/* 7 */             this.f11840d = c1154a;
/* 9 */             this.f11838b = j;
/* 11 */            this.f11839c = interfaceC1487i1;
/* 13 */            this.f11841e = iLogger;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() throws C1442c {
                    byte[] bArr;
/* 1 */             int i = this.f11837a;
/* 3 */             byte[] bArr2 = null;
/* 4 */             InterfaceC1487i1 interfaceC1487i1 = this.f11839c;
/* 6 */             Object obj = this.f11841e;
/* 8 */             long j = this.f11838b;
/* 10 */            Object obj2 = this.f11840d;
                    switch (i) {
                        case 0:
/* 183 */                   C1154a c1154a = (C1154a) obj2;
/* 185 */                   ILogger iLogger = (ILogger) obj;
/* 187 */                   byte[] bArr3 = c1154a.f9787a;
/* 189 */                   String str = c1154a.f9791e;
/* 191 */                   if (bArr3 != null) {
/* 195 */                       C1160a5.m4716a(str, bArr3.length, j);
/* 304 */                       return bArr3;
                            }
/* 200 */                   C1610k0 c1610k0 = c1154a.f9788b;
/* 202 */                   if (c1610k0 != null) {
/* 204 */                       Charset charset = AbstractC1706e.f11729a;
                                try {
/* 208 */                           ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                    try {
/* 220 */                               BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, AbstractC1706e.f11729a));
                                        try {
/* 223 */                                   interfaceC1487i1.mo5063a(bufferedWriter, c1610k0);
/* 226 */                                   byte[] byteArray = byteArrayOutputStream.toByteArray();
/* 230 */                                   bufferedWriter.close();
/* 233 */                                   byteArrayOutputStream.close();
/* 236 */                                   bArr2 = byteArray;
                                        } catch (Throwable th) {
                                            try {
/* 243 */                                       bufferedWriter.close();
                                                break;
                                            } catch (Throwable th2) {
/* 248 */                                       th.addSuppressed(th2);
                                            }
/* 251 */                                   throw th;
                                        }
                                    } catch (Throwable th3) {
                                        try {
/* 252 */                                   byteArrayOutputStream.close();
                                            break;
                                        } catch (Throwable th4) {
/* 257 */                                   th3.addSuppressed(th4);
                                        }
/* 260 */                               throw th3;
                                    }
                                } catch (Throwable th5) {
/* 265 */                           iLogger.mo4671d(EnumC1553m5.ERROR, "Could not serialize serializable", th5);
                                }
/* 268 */                       if (bArr2 != null) {
/* 272 */                           C1160a5.m4716a(str, bArr2.length, j);
/* 275 */                           return bArr2;
                                }
                            } else {
/* 277 */                       String str2 = c1154a.f9790d;
/* 279 */                       if (str2 != null) {
/* 281 */                           return AbstractC1704c.m5460o(str2, j);
                                }
/* 286 */                       bh0 bh0Var = c1154a.f9789c;
/* 288 */                       if (bh0Var != null && (bArr = (byte[]) bh0Var.call()) != null) {
/* 301 */                           C1160a5.m4716a(str, bArr.length, j);
/* 304 */                           return bArr;
                                }
                            }
/* 318 */                   throw new C1442c(fm0.m3784j("Couldn't attach the attachment ", str, ".\nPlease check that either bytes, serializable, path or provider is set."));
                        default:
/* 15 */                    File file = (File) obj2;
/* 17 */                    C1642r3 c1642r3 = (C1642r3) obj;
/* 25 */                    if (!file.exists()) {
/* 182 */                       throw new C1442c(fm0.m3784j("Dropping profiling trace data, because the file '", file.getName(), "' doesn't exists"));
                            }
                            try {
/* 43 */                        String str3 = new String(AbstractC1729a.m5490b(AbstractC1704c.m5460o(file.getPath(), j)), "US-ASCII");
/* 50 */                        if (str3.isEmpty()) {
/* 159 */                           throw new C1442c("Profiling trace file is empty");
                                }
/* 52 */                        c1642r3.f11571m0 = str3;
                                try {
/* 62 */                            c1642r3.f11548W = (List) c1642r3.f11554b.call();
                                    break;
                                } catch (Throwable unused) {
                                }
                                try {
                                    try {
/* 66 */                                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                                        try {
/* 80 */                                    BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream2, C1160a5.f9798d), NotificationCompat.FLAG_GROUP_SUMMARY);
                                            try {
/* 83 */                                        interfaceC1487i1.mo5063a(bufferedWriter2, c1642r3);
/* 86 */                                        byte[] byteArray2 = byteArrayOutputStream2.toByteArray();
/* 90 */                                        bufferedWriter2.close();
/* 93 */                                        byteArrayOutputStream2.close();
/* 96 */                                        file.delete();
/* 99 */                                        return byteArray2;
                                            } catch (Throwable th6) {
                                                try {
/* 108 */                                           bufferedWriter2.close();
                                                    break;
                                                } catch (Throwable th7) {
/* 113 */                                           th6.addSuppressed(th7);
                                                }
/* 116 */                                       throw th6;
                                            }
                                        } catch (Throwable th8) {
                                            try {
/* 117 */                                       byteArrayOutputStream2.close();
                                                break;
                                            } catch (Throwable th9) {
/* 122 */                                       th8.addSuppressed(th9);
                                            }
/* 125 */                                   throw th8;
                                        }
                                    } catch (Throwable th10) {
/* 148 */                               file.delete();
/* 151 */                               throw th10;
                                    }
                                } catch (IOException e) {
/* 147 */                           throw new C1442c("Failed to serialize profiling trace data\n" + e.getMessage());
                                }
                            } catch (UnsupportedEncodingException e2) {
/* 161 */                       C1951n4.m6856g(e2);
/* 3 */                         return null;
                            }
                    }
                }

/* 15 */        public /* synthetic */ CallableC1754y4(File file, long j, C1642r3 c1642r3, InterfaceC1487i1 interfaceC1487i1) {
                    this.f11840d = file;
                    this.f11838b = j;
                    this.f11841e = c1642r3;
                    this.f11839c = interfaceC1487i1;
                }
            }
