            package io.sentry.android.core;

            import android.app.ApplicationExitInfo;
            import io.sentry.C1154a;
            import io.sentry.C1393c5;
            import io.sentry.C1425d2;
            import io.sentry.C1486i0;
            import io.sentry.C1532l;
            import io.sentry.C1671t3;
            import io.sentry.EnumC1553m5;
            import io.sentry.android.core.cache.C1180b;
            import io.sentry.android.core.internal.threaddump.C1209a;
            import io.sentry.android.core.internal.threaddump.C1210b;
            import io.sentry.config.AbstractC1417a;
            import io.sentry.protocol.C1593c;
            import io.sentry.protocol.C1599f;
            import io.sentry.protocol.C1616p;
            import io.sentry.transport.InterfaceC1682h;
            import io.sentry.util.AbstractC1704c;
            import java.io.BufferedReader;
            import java.io.ByteArrayInputStream;
            import java.io.InputStream;
            import java.io.InputStreamReader;
            import java.util.ArrayList;
            import java.util.Date;
            import java.util.List;
            import p000.cd1;
            
            /* JADX INFO: renamed from: io.sentry.android.core.x */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1283x implements InterfaceC1682h, InterfaceC1233j0 {

                /* JADX INFO: renamed from: a */
                public final SentryAndroidOptions f10386a;

                @Override // io.sentry.android.core.InterfaceC1233j0
                /* JADX INFO: renamed from: a */
                public int mo4851a() {
/* 1 */             return 6;
                }

                @Override // io.sentry.android.core.InterfaceC1233j0
                /* JADX INFO: renamed from: b */
                public Long mo4852b() {
/* 7 */             return C1180b.m4774h(this.f10386a, "last_anr_report", "ANR");
                }

                @Override // io.sentry.android.core.InterfaceC1233j0
                /* JADX INFO: renamed from: d */
                public String mo4853d() {
/* 1 */             return "ANR";
                }

                @Override // io.sentry.android.core.InterfaceC1233j0
                /* JADX INFO: renamed from: e */
                public boolean mo4854e() {
/* 3 */             return this.f10386a.isReportHistoricalAnrs();
                }

                @Override // io.sentry.transport.InterfaceC1682h
                public boolean isConnected() {
/* 17 */            int i = AbstractC1280w.f10376a[this.f10386a.getConnectionStatusProvider().mo4835r0().ordinal()];
                    return i == 1 || i == 2 || i == 3;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // io.sentry.android.core.InterfaceC1233j0
                /* JADX INFO: renamed from: w */
                public C1532l mo4855w(ApplicationExitInfo applicationExitInfo, boolean z) {
                    C1671t3 c1671t3;
                    byte[] bArr;
/* 3 */             SentryAndroidOptions sentryAndroidOptions = this.f10386a;
/* 1 */             long timestamp = applicationExitInfo.getTimestamp();
/* 21 */            boolean z2 = applicationExitInfo.getImportance() != 100;
                    try {
/* 1 */                 InputStream traceInputStream = applicationExitInfo.getTraceInputStream();
                        try {
/* 26 */                    if (traceInputStream == 0) {
/* 32 */                        c1671t3 = new C1671t3(EnumC1164a0.NO_DUMP);
/* 35 */                        if (traceInputStream != 0) {
                                    traceInputStream = traceInputStream;
/* 37 */                            traceInputStream.close();
                                    traceInputStream = traceInputStream;
                                }
                            } else {
/* 49 */                        byte[] bArrM5180t = AbstractC1417a.m5180t(traceInputStream);
/* 53 */                        traceInputStream.close();
                                try {
/* 68 */                            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(bArrM5180t)));
                                    try {
/* 73 */                                ArrayList arrayList = new ArrayList();
                                        while (true) {
/* 76 */                                    String line = bufferedReader.readLine();
/* 80 */                                    if (line == null) {
                                                break;
                                            }
/* 84 */                                    C1209a c1209a = new C1209a();
/* 87 */                                    c1209a.f10105a = line;
/* 89 */                                    arrayList.add(c1209a);
                                        }
/* 95 */                                cd1 cd1Var = new cd1(arrayList);
/* 100 */                               C1210b c1210b = new C1210b(sentryAndroidOptions, z2);
/* 103 */                               c1210b.m4820d(cd1Var);
/* 106 */                               ArrayList arrayList2 = c1210b.f10125f;
/* 116 */                               ArrayList arrayList3 = new ArrayList(c1210b.f10124e.values());
/* 125 */                               C1593c c1593c = (C1593c) c1210b.f10126g.f11662b;
/* 131 */                               if (arrayList2.isEmpty()) {
/* 137 */                                   c1671t3 = new C1671t3(EnumC1164a0.NO_DUMP);
/* 140 */                                   bufferedReader.close();
                                            traceInputStream = bufferedReader;
                                        } else {
/* 153 */                                   C1671t3 c1671t4 = new C1671t3(EnumC1164a0.DUMP, bArrM5180t, arrayList2, arrayList3, c1593c);
/* 156 */                                   bufferedReader.close();
/* 159 */                                   c1671t3 = c1671t4;
                                            traceInputStream = bufferedReader;
                                        }
                                    } catch (Throwable th) {
                                        try {
/* 161 */                                   bufferedReader.close();
/* 169 */                                   throw th;
                                        } catch (Throwable th2) {
/* 166 */                                   th.addSuppressed(th2);
/* 169 */                                   throw th;
                                        }
                                    }
                                } catch (Throwable th3) {
/* 178 */                           sentryAndroidOptions.getLogger().mo4671d(EnumC1553m5.WARNING, "Failed to parse ANR thread dump", th3);
/* 183 */                           EnumC1164a0 enumC1164a0 = EnumC1164a0.ERROR;
/* 185 */                           c1671t3 = new C1671t3(enumC1164a0, bArrM5180t);
                                    traceInputStream = enumC1164a0;
                                }
                            }
                            traceInputStream = traceInputStream;
                        } catch (Throwable th4) {
/* 189 */                   if (traceInputStream == 0) {
/* 199 */                       throw th4;
                            }
                            try {
/* 191 */                       traceInputStream.close();
/* 199 */                       throw th4;
                            } catch (Throwable th5) {
/* 196 */                       th4.addSuppressed(th5);
/* 199 */                       throw th4;
                            }
                        }
                    } catch (Throwable th6) {
/* 208 */               sentryAndroidOptions.getLogger().mo4671d(EnumC1553m5.WARNING, "Failed to read ANR thread dump", th6);
/* 215 */               c1671t3 = new C1671t3(EnumC1164a0.NO_DUMP);
                    }
/* 221 */           EnumC1164a0 enumC1164a1 = (EnumC1164a0) c1671t3.f11668b;
/* 225 */           if (enumC1164a1 == EnumC1164a0.NO_DUMP) {
/* 243 */               sentryAndroidOptions.getLogger().mo4672k(EnumC1553m5.WARNING, "Not reporting ANR event as there was no thread dump for the ANR %s", applicationExitInfo.toString());
/* 246 */               return null;
                    }
/* 260 */           C1288z c1288z = new C1288z(sentryAndroidOptions.getFlushTimeoutMillis(), sentryAndroidOptions.getLogger(), timestamp, z, z2);
/* 263 */           C1486i0 c1486i0M5450e = AbstractC1704c.m5450e(c1288z);
/* 269 */           C1393c5 c1393c5 = new C1393c5();
/* 274 */           if (enumC1164a1 == EnumC1164a0.ERROR) {
/* 278 */               C1616p c1616p = new C1616p();
/* 283 */               c1616p.f11420a = "Sentry Android SDK failed to parse system thread dump for this ANR. We recommend enabling [SentryOptions.isAttachAnrThreadDump] option to attach the thread dump as plain text and report this issue on GitHub.";
/* 285 */               c1393c5.f10783b0 = c1616p;
                    } else if (enumC1164a1 == EnumC1164a0.DUMP) {
/* 301 */               c1393c5.f10785d0 = new C1425d2((List) c1671t3.f11670d);
/* 305 */               ArrayList arrayList4 = (ArrayList) c1671t3.f11667a;
/* 307 */               if (arrayList4 != null) {
/* 311 */                   C1599f c1599f = new C1599f();
/* 319 */                   c1599f.f11308b = new ArrayList(arrayList4);
/* 321 */                   c1393c5.f11514Y = c1599f;
                        }
/* 325 */               C1593c c1593c2 = (C1593c) c1671t3.f11671e;
/* 327 */               if (c1593c2 != null) {
/* 333 */                   c1393c5.f11517b.mo5315k(c1593c2, "art");
                        }
                    }
/* 338 */           c1393c5.f10787f0 = EnumC1553m5.FATAL;
/* 345 */           c1393c5.f10782a0 = new Date(timestamp);
/* 351 */           if (sentryAndroidOptions.isAttachAnrThreadDump() && (bArr = (byte[]) c1671t3.f11669c) != null) {
/* 368 */               c1486i0M5450e.f11006f = new C1154a(bArr, "thread-dump.txt", "text/plain");
                    }
/* 372 */           return new C1532l(1, c1393c5, c1486i0M5450e, c1288z);
                }
            }
