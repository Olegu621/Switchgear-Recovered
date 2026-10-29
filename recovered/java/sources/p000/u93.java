            package p000;

            import android.content.Context;
            import android.content.IntentFilter;
            import android.hardware.camera2.CameraCharacteristics;
            import android.os.Build;
            import android.util.Range;
            import androidx.core.app.NotificationCompat;
            import com.google.android.gms.common.ConnectionResult;
            import com.supercell.titan.TitanApplication;
            import io.sentry.AbstractC1635q4;
            import io.sentry.C1154a;
            import io.sentry.C1160a5;
            import io.sentry.C1381b5;
            import io.sentry.C1383b7;
            import io.sentry.C1387c;
            import io.sentry.C1393c5;
            import io.sentry.C1456g0;
            import io.sentry.C1459g3;
            import io.sentry.C1472h7;
            import io.sentry.C1486i0;
            import io.sentry.C1522j7;
            import io.sentry.C1529k5;
            import io.sentry.C1535l2;
            import io.sentry.C1573o3;
            import io.sentry.C1575o5;
            import io.sentry.C1576o6;
            import io.sentry.C1583p5;
            import io.sentry.C1642r3;
            import io.sentry.C1643r4;
            import io.sentry.C1673t5;
            import io.sentry.C1697u2;
            import io.sentry.C1726v4;
            import io.sentry.C1745x3;
            import io.sentry.C1757z;
            import io.sentry.C1764z6;
            import io.sentry.CallableC1738w4;
            import io.sentry.CallableC1754y4;
            import io.sentry.EnumC1451f7;
            import io.sentry.EnumC1538l5;
            import io.sentry.EnumC1553m5;
            import io.sentry.EnumC1560n;
            import io.sentry.EnumC1756y6;
            import io.sentry.ILogger;
            import io.sentry.InterfaceC1156a1;
            import io.sentry.InterfaceC1388c0;
            import io.sentry.InterfaceC1445f1;
            import io.sentry.InterfaceC1487i1;
            import io.sentry.InterfaceC1525k1;
            import io.sentry.InterfaceC1549m1;
            import io.sentry.InterfaceC1571o1;
            import io.sentry.android.core.C1197i0;
            import io.sentry.android.core.C1278v0;
            import io.sentry.android.core.SentryAndroidOptions;
            import io.sentry.clientreport.EnumC1414d;
            import io.sentry.clientreport.InterfaceC1416f;
            import io.sentry.exception.C1442c;
            import io.sentry.hints.AbstractC1475c;
            import io.sentry.hints.InterfaceC1474b;
            import io.sentry.hints.InterfaceC1476d;
            import io.sentry.hints.InterfaceC1484l;
            import io.sentry.internal.debugmeta.C1505c;
            import io.sentry.logger.C1546f;
            import io.sentry.logger.InterfaceC1542b;
            import io.sentry.metrics.C1559d;
            import io.sentry.metrics.InterfaceC1556a;
            import io.sentry.protocol.C1597e;
            import io.sentry.protocol.C1599f;
            import io.sentry.protocol.C1600f0;
            import io.sentry.protocol.C1607j;
            import io.sentry.protocol.C1609k;
            import io.sentry.protocol.C1616p;
            import io.sentry.protocol.C1621r;
            import io.sentry.protocol.C1624u;
            import io.sentry.protocol.C1626w;
            import io.sentry.transport.C1690p;
            import io.sentry.transport.InterfaceC1681g;
            import io.sentry.util.AbstractC1704c;
            import io.sentry.util.AbstractC1706e;
            import io.sentry.util.AbstractC1714m;
            import io.sentry.util.C1713l;
            import java.io.BufferedWriter;
            import java.io.ByteArrayOutputStream;
            import java.io.Closeable;
            import java.io.File;
            import java.io.IOException;
            import java.io.OutputStreamWriter;
            import java.net.URI;
            import java.nio.charset.Charset;
            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.HashMap;
            import java.util.HashSet;
            import java.util.Iterator;
            import java.util.LinkedHashMap;
            import java.util.List;
            import java.util.Map;
            import java.util.Queue;
            import java.util.concurrent.Callable;
            import java.util.regex.Pattern;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 192 */   public final class u93 implements InterfaceC1445f1, InterfaceC0881ei {

                /* JADX INFO: renamed from: a */
                public boolean f17428a;

                /* JADX INFO: renamed from: b */
                public final Object f17429b;

                /* JADX INFO: renamed from: c */
                public final Object f17430c;

                /* JADX INFO: renamed from: d */
                public Object f17431d;

                /* JADX INFO: renamed from: e */
                public Object f17432e;

                /* JADX INFO: renamed from: f */
                public final Object f17433f;

                public u93(SentryAndroidOptions sentryAndroidOptions) {
/* 9 */             this.f17431d = new C1643r4();
/* 11 */            this.f17429b = sentryAndroidOptions;
/* 14 */            this.f17428a = true;
/* 16 */            InterfaceC1571o1 transportFactory = sentryAndroidOptions.getTransportFactory();
/* 22 */            if (transportFactory instanceof C1459g3) {
/* 26 */                transportFactory = new C1535l2();
/* 29 */                sentryAndroidOptions.setTransportFactory(transportFactory);
                    }
/* 32 */            C1757z c1757zRetrieveParsedDsn = sentryAndroidOptions.retrieveParsedDsn();
/* 36 */            String sentryClientName = sentryAndroidOptions.getSentryClientName();
/* 40 */            URI uri = c1757zRetrieveParsedDsn.f11846c;
/* 67 */            String string = uri.resolve(uri.getPath() + "/envelope/").toString();
/* 71 */            String str = c1757zRetrieveParsedDsn.f11845b;
/* 73 */            String str2 = c1757zRetrieveParsedDsn.f11844a;
/* 79 */            StringBuilder sb = new StringBuilder("Sentry sentry_version=7,sentry_client=");
/* 82 */            sb.append(sentryClientName);
/* 87 */            sb.append(",sentry_key=");
/* 90 */            sb.append(str);
/* 110 */           sb.append((str2 == null || str2.length() <= 0) ? HttpUrl.FRAGMENT_ENCODE_SET : ",sentry_secret=".concat(str2));
/* 113 */           String string2 = sb.toString();
/* 119 */           HashMap map = new HashMap();
/* 124 */           map.put("User-Agent", sentryClientName);
/* 129 */           map.put("X-Sentry-Auth", string2);
/* 141 */           this.f17430c = transportFactory.mo5255o(sentryAndroidOptions, new C1505c(string, map));
/* 149 */           if (sentryAndroidOptions.getLogs().f10914a) {
/* 161 */               this.f17432e = sentryAndroidOptions.getLogs().f10915b.mo4942c(sentryAndroidOptions, this);
                    } else {
/* 166 */               this.f17432e = C1546f.f11133b;
                    }
/* 174 */           if (sentryAndroidOptions.getMetrics().f10940a) {
/* 186 */               this.f17433f = sentryAndroidOptions.getMetrics().f10941b.mo4943c(sentryAndroidOptions, this);
                    } else {
/* 191 */               this.f17433f = C1559d.f11157a;
                    }
                }

                /* JADX INFO: renamed from: s */
                public static ArrayList m8982s(C1486i0 c1486i0) {
/* 5 */             ArrayList arrayList = new ArrayList(c1486i0.f11002b);
/* 8 */             C1154a c1154a = c1486i0.f11004d;
/* 10 */            if (c1154a != null) {
/* 12 */                arrayList.add(c1154a);
                    }
/* 15 */            C1154a c1154a2 = c1486i0.f11005e;
/* 17 */            if (c1154a2 != null) {
/* 19 */                arrayList.add(c1154a2);
                    }
/* 22 */            C1154a c1154a3 = c1486i0.f11006f;
/* 24 */            if (c1154a3 != null) {
/* 26 */                arrayList.add(c1154a3);
                    }
/* 29 */            C1154a c1154a4 = c1486i0.f11007g;
/* 31 */            if (c1154a4 != null) {
/* 33 */                arrayList.add(c1154a4);
                    }
/* 36 */            return arrayList;
                }

                /* JADX INFO: renamed from: A */
                public void m8983A(ConnectionResult connectionResult) {
/* 15 */            cb3 cb3Var = (cb3) ((ur0) this.f17433f).f17691j.get((C2323w9) this.f17430c);
/* 17 */            if (cb3Var != null) {
/* 19 */                cb3Var.m1626q(connectionResult);
                    }
                }

                /* JADX INFO: renamed from: B */
                public void m8984B(boolean z) {
/* 5 */             IntentFilter intentFilter = new IntentFilter("com.android.vending.billing.PURCHASES_UPDATED");
/* 12 */            IntentFilter intentFilter2 = new IntentFilter("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED");
/* 17 */            intentFilter2.addAction("com.android.vending.billing.ALTERNATIVE_BILLING");
/* 20 */            this.f17428a = z;
/* 30 */            ((gi3) this.f17433f).m3948a((Context) this.f17429b, intentFilter2);
/* 33 */            boolean z2 = this.f17428a;
/* 37 */            gi3 gi3Var = (gi3) this.f17432e;
/* 41 */            Context context = (Context) this.f17429b;
/* 43 */            if (!z2) {
/* 84 */                gi3Var.m3948a(context, intentFilter);
/* 87 */                return;
                    }
                    synchronized (gi3Var) {
                        try {
/* 48 */                    if (gi3Var.f8628b) {
/* 51 */                        return;
                            }
/* 59 */                    if (Build.VERSION.SDK_INT >= 33) {
/* 8 */                         context.registerReceiver(gi3Var, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null, true != gi3Var.f8629c ? 4 : 2);
                            } else {
/* 75 */                        context.registerReceiver(gi3Var, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null);
                            }
/* 78 */                    gi3Var.f8628b = true;
                        } catch (Throwable th) {
/* 83 */                    throw th;
                        }
                    }
                }

                @Override // io.sentry.InterfaceC1445f1
                /* JADX INFO: renamed from: a */
                public void mo5215a(boolean z) {
                    long shutdownTimeoutMillis;
/* 3 */             SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) this.f17429b;
/* 16 */            sentryAndroidOptions.getLogger().mo4672k(EnumC1553m5.INFO, "Closing SentryClient.", new Object[0]);
/* 19 */            if (z) {
/* 21 */                shutdownTimeoutMillis = 0;
                    } else {
                        try {
/* 24 */                    shutdownTimeoutMillis = sentryAndroidOptions.getShutdownTimeoutMillis();
                        } catch (IOException e) {
/* 62 */                    sentryAndroidOptions.getLogger().mo4671d(EnumC1553m5.WARNING, "Failed to close the connection to the Sentry Server.", e);
                        }
                    }
/* 28 */            mo5216b(shutdownTimeoutMillis);
/* 35 */            ((InterfaceC1542b) this.f17432e).mo4871a(z);
/* 42 */            ((InterfaceC1556a) this.f17433f).mo4894a(z);
/* 49 */            ((InterfaceC1681g) this.f17430c).mo5418a(z);
/* 77 */            for (InterfaceC1388c0 interfaceC1388c0 : sentryAndroidOptions.getEventProcessors()) {
/* 87 */                if (interfaceC1388c0 instanceof Closeable) {
                            try {
/* 92 */                        ((Closeable) interfaceC1388c0).close();
                            } catch (IOException e2) {
/* 109 */                       sentryAndroidOptions.getLogger().mo4672k(EnumC1553m5.WARNING, "Failed to close the event processor {}.", interfaceC1388c0, e2);
                            }
                        }
                    }
/* 113 */           this.f17428a = false;
                }

                @Override // io.sentry.InterfaceC1445f1
                /* JADX INFO: renamed from: b */
                public void mo5216b(long j) {
/* 5 */             ((InterfaceC1542b) this.f17432e).mo5345b(j);
/* 12 */            ((InterfaceC1556a) this.f17433f).mo5366b(j);
/* 19 */            ((InterfaceC1681g) this.f17430c).mo5419b(j);
                }

                @Override // io.sentry.InterfaceC1445f1
                /* JADX INFO: renamed from: c */
                public void mo5217c(C1764z6 c1764z6, C1486i0 c1486i0) {
/* 3 */             SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) this.f17429b;
/* 7 */             AbstractC1704c.m5462q(c1764z6, "Session is required.");
/* 10 */            String str = c1764z6.f11857X;
/* 12 */            if (str == null || str.isEmpty()) {
/* 72 */                sentryAndroidOptions.getLogger().mo4672k(EnumC1553m5.WARNING, "Sessions can't be captured without setting a release.", new Object[0]);
/* 75 */                return;
                    }
                    try {
/* 21 */                InterfaceC1487i1 serializer = sentryAndroidOptions.getSerializer();
/* 25 */                C1624u sdkVersion = sentryAndroidOptions.getSdkVersion();
/* 31 */                AbstractC1704c.m5462q(serializer, "Serializer is required.");
/* 44 */                mo5221h(new C1505c((C1626w) null, sdkVersion, C1160a5.m4719d(serializer, c1764z6)), c1486i0);
                    } catch (IOException e) {
/* 57 */                sentryAndroidOptions.getLogger().mo4671d(EnumC1553m5.ERROR, "Failed to capture session.", e);
                    }
                }

                @Override // io.sentry.InterfaceC1445f1
                /* JADX INFO: renamed from: d */
                public C1690p mo5218d() {
/* 5 */             return ((InterfaceC1681g) this.f17430c).mo5420d();
                }

                @Override // io.sentry.InterfaceC1445f1
                /* JADX INFO: renamed from: e */
                public boolean mo5219e() {
/* 5 */             return ((InterfaceC1681g) this.f17430c).mo5421e();
                }

                @Override // p000.InterfaceC0881ei
                /* JADX INFO: renamed from: f */
                public void mo3444f(ConnectionResult connectionResult) {
/* 15 */            ((ur0) this.f17433f).f17695n.post(new dp0(this, connectionResult, 21, false));
                }

                @Override // io.sentry.InterfaceC1445f1
                /* JADX INFO: renamed from: g */
                public C1626w mo5220g(C1576o6 c1576o6, InterfaceC1156a1 interfaceC1156a1, C1486i0 c1486i0) {
/* 3 */             SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) this.f17429b;
/* 9 */             if (m8996z(c1576o6, c1486i0)) {
/* 11 */                C1621r c1621r = c1576o6.f11519d;
/* 13 */                C1597e c1597e = c1576o6.f11517b;
/* 15 */                if (c1621r == null) {
/* 21 */                    c1576o6.f11519d = interfaceC1156a1.mo4688L();
                        }
/* 25 */                if (c1576o6.f11524w == null) {
/* 31 */                    c1576o6.f11524w = interfaceC1156a1.mo4687K();
                        }
/* 35 */                if (c1576o6.f11520e == null) {
/* 41 */                    c1576o6.m5383c(interfaceC1156a1.mo4712z());
                        } else {
/* 61 */                    for (Map.Entry entry : interfaceC1156a1.mo4712z().entrySet()) {
/* 79 */                        if (!c1576o6.f11520e.containsKey(entry.getKey())) {
/* 95 */                            c1576o6.f11520e.put((String) entry.getKey(), (String) entry.getValue());
                                }
                            }
                        }
/* 122 */               for (Map.Entry entry2 : new C1597e(interfaceC1156a1.mo4680D()).f11294a.entrySet()) {
/* 138 */                   if (!c1597e.mo5305a(entry2.getKey())) {
/* 150 */                       c1597e.mo5315k(entry2.getValue(), (String) entry2.getKey());
                            }
                        }
/* 154 */               InterfaceC1525k1 interfaceC1525k1Mo4694g = interfaceC1156a1.mo4694g();
/* 162 */               if (c1597e.mo5313i() == null) {
/* 164 */                   if (interfaceC1525k1Mo4694g == null) {
/* 174 */                       c1597e.mo5326v(C1522j7.m5331b(interfaceC1156a1.mo4708u()));
                            } else {
/* 182 */                       c1597e.mo5326v(interfaceC1525k1Mo4694g.mo4737s());
                            }
                        }
                    }
/* 199 */           sentryAndroidOptions.getLogger().mo4672k(EnumC1553m5.DEBUG, "Capturing session replay: %s", c1576o6.f11516a);
/* 202 */           C1626w c1626w = C1626w.f11478b;
/* 204 */           C1626w c1626w2 = c1576o6.f11516a;
/* 206 */           if (c1626w2 != null) {
/* 208 */               c1626w = c1626w2;
                    }
/* 221 */           for (InterfaceC1388c0 interfaceC1388c0 : sentryAndroidOptions.getEventProcessors()) {
                        try {
/* 229 */                   c1576o6 = interfaceC1388c0.mo4925c(c1576o6, c1486i0);
                        } catch (Throwable th) {
/* 255 */                   sentryAndroidOptions.getLogger().mo4670b(EnumC1553m5.ERROR, th, "An exception occurred while processing replay event by processor: %s", interfaceC1388c0.getClass().getName());
                        }
/* 258 */               if (c1576o6 == null) {
/* 280 */                   sentryAndroidOptions.getLogger().mo4672k(EnumC1553m5.DEBUG, "Replay event was dropped by a processor: %s", interfaceC1388c0.getClass().getName());
/* 291 */                   sentryAndroidOptions.getClientReportRecorder().mo5158a(EnumC1414d.EVENT_PROCESSOR, EnumC1560n.Replay);
                            break;
                        }
                    }
/* 294 */           if (c1576o6 != null) {
/* 296 */               sentryAndroidOptions.getBeforeSendReplay();
                    }
/* 299 */           if (c1576o6 == null) {
/* 301 */               return C1626w.f11478b;
                    }
                    try {
/* 323 */               C1505c c1505cM8989r = m8989r(c1576o6, c1486i0.f11008h, m8990t(interfaceC1156a1, c1486i0, c1576o6, null), InterfaceC1474b.class.isInstance(c1486i0.m5273b("sentry:typeCheckHint")));
/* 327 */               c1486i0.m5272a();
/* 334 */               ((InterfaceC1681g) this.f17430c).mo5417F0(c1505cM8989r, c1486i0);
/* 356 */               return c1626w;
                    } catch (IOException e) {
/* 351 */               sentryAndroidOptions.getLogger().mo4670b(EnumC1553m5.WARNING, e, "Capturing event %s failed.", c1626w);
/* 354 */               return C1626w.f11478b;
                    }
                }

                @Override // io.sentry.InterfaceC1445f1
                /* JADX INFO: renamed from: h */
                public C1626w mo5221h(C1505c c1505c, C1486i0 c1486i0) {
                    try {
/* 1 */                 c1486i0.m5272a();
/* 4 */                 return m8995y(c1505c, c1486i0);
                    } catch (IOException e) {
/* 22 */                ((SentryAndroidOptions) this.f17429b).getLogger().mo4671d(EnumC1553m5.ERROR, "Failed to capture envelope.", e);
/* 25 */                return C1626w.f11478b;
                    }
                }

                @Override // io.sentry.InterfaceC1445f1
                /* JADX INFO: renamed from: i */
                public void mo5222i(C1575o5 c1575o5, InterfaceC1156a1 interfaceC1156a1) {
                    C1575o5 c1575o5M8993w;
/* 3 */             SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) this.f17429b;
/* 9 */             C1575o5 c1575o5M8993w2 = m8993w(c1575o5, interfaceC1156a1.mo4689M());
/* 13 */            if (c1575o5M8993w2 == null || (c1575o5M8993w = m8993w(c1575o5M8993w2, sentryAndroidOptions.getEventProcessors())) == null) {
/* 26 */                return;
                    }
/* 31 */            sentryAndroidOptions.getLogs().getClass();
/* 38 */            ((InterfaceC1542b) this.f17432e).mo5346d(c1575o5M8993w);
                }

                @Override // io.sentry.InterfaceC1445f1
                public boolean isEnabled() {
/* 1 */             return this.f17428a;
                }

                @Override // io.sentry.InterfaceC1445f1
                /* JADX INFO: renamed from: j */
                public C1626w mo5223j(C1573o3 c1573o3) {
/* 3 */             AbstractC1704c.m5462q(c1573o3, "profileChunk is required.");
/* 8 */             SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) this.f17429b;
/* 24 */            sentryAndroidOptions.getLogger().mo4672k(EnumC1553m5.DEBUG, "Capturing profile chunk: %s", c1573o3.f11194c);
/* 27 */            C1626w c1626w = c1573o3.f11194c;
/* 31 */            C1599f c1599fM5377a = C1599f.m5377a(c1573o3.f11192a, sentryAndroidOptions);
/* 35 */            if (c1599fM5377a != null) {
/* 37 */                c1573o3.f11192a = c1599fM5377a;
                    }
                    try {
/* 70 */                return m8995y(new C1505c(new C1726v4(c1626w, sentryAndroidOptions.getSdkVersion(), null), Collections.singletonList(C1160a5.m4718c(c1573o3, sentryAndroidOptions.getSerializer(), sentryAndroidOptions.getProfilerConverter()))), null);
                    } catch (C1442c | IOException e) {
/* 90 */                sentryAndroidOptions.getLogger().mo4670b(EnumC1553m5.WARNING, e, "Capturing profile chunk %s failed.", c1626w);
/* 93 */                return C1626w.f11478b;
                    }
                }

                /* JADX WARN: Code duplicated, block: B:56:0x010f  */
                @Override // io.sentry.InterfaceC1445f1
                /* JADX INFO: renamed from: k */
                public C1626w mo5224k(C1600f0 c1600f0, C1472h7 c1472h7, InterfaceC1156a1 interfaceC1156a1, C1486i0 c1486i0, C1642r3 c1642r3) {
                    C1600f0 c1600f0M8994x;
                    C1600f0 c1600f1;
                    C1600f0 c1600f2;
                    C1383b7 c1383b7Mo5313i;
                    List listMo4678B;
/* 4 */             SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) this.f17429b;
/* 15 */            C1486i0 c1486i1 = c1486i0 == null ? new C1486i0() : c1486i0;
/* 21 */            if (m8996z(c1600f0, c1486i1) && (listMo4678B = interfaceC1156a1.mo4678B()) != null) {
/* 31 */                c1486i1.f11002b.addAll(listMo4678B);
                    }
/* 48 */            sentryAndroidOptions.getLogger().mo4672k(EnumC1553m5.DEBUG, "Capturing transaction: %s", c1600f0.f11516a);
/* 51 */            List<C1456g0> ignoredTransactions = sentryAndroidOptions.getIgnoredTransactions();
/* 55 */            String str = c1600f0.f11310a0;
/* 58 */            if (str != null && ignoredTransactions != null && !ignoredTransactions.isEmpty()) {
/* 71 */                Iterator<C1456g0> it = ignoredTransactions.iterator();
/* 79 */                while (it.hasNext()) {
/* 93 */                    if (it.next().f10950a.equalsIgnoreCase(str)) {
/* 142 */                       sentryAndroidOptions.getLogger().mo4672k(EnumC1553m5.DEBUG, "Transaction was dropped as transaction name %s is ignored", c1600f0.f11310a0);
/* 145 */                       InterfaceC1416f clientReportRecorder = sentryAndroidOptions.getClientReportRecorder();
/* 149 */                       EnumC1414d enumC1414d = EnumC1414d.EVENT_PROCESSOR;
/* 153 */                       clientReportRecorder.mo5158a(enumC1414d, EnumC1560n.Transaction);
/* 171 */                       sentryAndroidOptions.getClientReportRecorder().mo5160e(enumC1414d, EnumC1560n.Span, c1600f0.f11313d0.size() + 1);
/* 174 */                       return C1626w.f11478b;
                            }
                        }
/* 96 */                Iterator<C1456g0> it2 = ignoredTransactions.iterator();
/* 104 */               while (it2.hasNext()) {
/* 112 */                   Pattern pattern = it2.next().f10951b;
/* 126 */                   if (pattern == null ? false : pattern.matcher(str).matches()) {
/* 142 */                       sentryAndroidOptions.getLogger().mo4672k(EnumC1553m5.DEBUG, "Transaction was dropped as transaction name %s is ignored", c1600f0.f11310a0);
/* 145 */                       InterfaceC1416f clientReportRecorder2 = sentryAndroidOptions.getClientReportRecorder();
/* 149 */                       EnumC1414d enumC1414d2 = EnumC1414d.EVENT_PROCESSOR;
/* 153 */                       clientReportRecorder2.mo5158a(enumC1414d2, EnumC1560n.Transaction);
/* 171 */                       sentryAndroidOptions.getClientReportRecorder().mo5160e(enumC1414d2, EnumC1560n.Span, c1600f0.f11313d0.size() + 1);
/* 174 */                       return C1626w.f11478b;
                            }
                        }
                    }
/* 177 */           C1626w c1626w = C1626w.f11478b;
/* 179 */           C1626w c1626w2 = c1600f0.f11516a;
/* 185 */           C1626w c1626wM8995y = c1626w2 != null ? c1626w2 : c1626w;
/* 190 */           if (m8996z(c1600f0, c1486i1)) {
/* 192 */               m8985n(c1600f0, interfaceC1156a1);
/* 199 */               c1600f0M8994x = m8994x(c1600f0, c1486i1, interfaceC1156a1.mo4689M());
/* 203 */               if (c1600f0M8994x == null) {
/* 215 */                   sentryAndroidOptions.getLogger().mo4672k(EnumC1553m5.DEBUG, "Transaction was dropped by applyScope", new Object[0]);
                        }
                    } else {
/* 219 */               c1600f0M8994x = c1600f0;
                    }
/* 220 */           if (c1600f0M8994x != null) {
/* 226 */               c1600f0M8994x = m8994x(c1600f0M8994x, c1486i1, sentryAndroidOptions.getEventProcessors());
                    }
/* 230 */           if (c1600f0M8994x == null) {
/* 242 */               sentryAndroidOptions.getLogger().mo4672k(EnumC1553m5.DEBUG, "Transaction was dropped by Event processors.", new Object[0]);
/* 245 */               return c1626w;
                    }
/* 248 */           int size = c1600f0M8994x.f11313d0.size();
/* 256 */           if (sentryAndroidOptions.getBeforeSendTransaction() != null) {
/* 258 */               c1600f1 = null;
                        try {
/* 259 */                   TitanApplication titanApplication = TitanApplication.f5937b;
/* 269 */                   if (!c1600f0M8994x.f11520e.containsKey("supercell-drop-transaction")) {
/* 272 */                       c1600f1 = c1600f0M8994x;
                            }
                        } catch (Throwable th) {
/* 283 */                   sentryAndroidOptions.getLogger().mo4671d(EnumC1553m5.ERROR, "The BeforeSendTransaction callback threw an exception. It will be added as breadcrumb and continue.", th);
                        }
                    } else {
/* 272 */               c1600f1 = c1600f0M8994x;
                    }
/* 292 */           int size2 = c1600f1 == null ? 0 : c1600f1.f11313d0.size();
/* 296 */           if (c1600f1 == null) {
/* 308 */               sentryAndroidOptions.getLogger().mo4672k(EnumC1553m5.DEBUG, "Transaction was dropped by beforeSendTransaction.", new Object[0]);
/* 311 */               InterfaceC1416f clientReportRecorder3 = sentryAndroidOptions.getClientReportRecorder();
/* 315 */               EnumC1414d enumC1414d3 = EnumC1414d.BEFORE_SEND;
/* 319 */               clientReportRecorder3.mo5158a(enumC1414d3, EnumC1560n.Transaction);
/* 331 */               sentryAndroidOptions.getClientReportRecorder().mo5160e(enumC1414d3, EnumC1560n.Span, size + 1);
/* 334 */               return C1626w.f11478b;
                    }
/* 337 */           if (size2 < size) {
/* 339 */               int i = size - size2;
/* 356 */               sentryAndroidOptions.getLogger().mo4672k(EnumC1553m5.DEBUG, "%d spans were dropped by beforeSendTransaction.", Integer.valueOf(i));
/* 368 */               sentryAndroidOptions.getClientReportRecorder().mo5160e(EnumC1414d.BEFORE_SEND, EnumC1560n.Span, i);
                    }
                    try {
/* 371 */               ArrayList arrayListM8982s = m8982s(c1486i1);
/* 375 */               c1600f2 = c1600f1;
                        try {
/* 378 */                   ArrayList arrayList = new ArrayList();
/* 381 */                   Iterator it3 = arrayListM8982s.iterator();
/* 389 */                   while (it3.hasNext()) {
/* 397 */                       ((C1154a) it3.next()).getClass();
                            }
/* 406 */                   C1505c c1505cM8986o = m8986o(c1600f2, arrayList, null, c1472h7, c1642r3);
/* 410 */                   c1486i1.m5272a();
/* 413 */                   if (c1505cM8986o != null) {
/* 415 */                       c1626wM8995y = m8995y(c1505cM8986o, c1486i1);
                            }
                        } catch (C1442c e) {
/* 420 */                   e = e;
/* 441 */                   sentryAndroidOptions.getLogger().mo4670b(EnumC1553m5.WARNING, e, "Capturing transaction %s failed.", c1626wM8995y);
/* 444 */                   c1626wM8995y = C1626w.f11478b;
                        } catch (IOException e2) {
/* 422 */                   e = e2;
/* 441 */                   sentryAndroidOptions.getLogger().mo4670b(EnumC1553m5.WARNING, e, "Capturing transaction %s failed.", c1626wM8995y);
/* 444 */                   c1626wM8995y = C1626w.f11478b;
                        }
                    } catch (C1442c | IOException e3) {
/* 427 */               e = e3;
/* 425 */               c1600f2 = c1600f1;
                    }
/* 452 */           if (!c1626wM8995y.equals(C1626w.f11478b) && (c1383b7Mo5313i = c1600f2.f11517b.mo5313i()) != null) {
/* 468 */               sentryAndroidOptions.getReplayController().mo4972g(c1383b7Mo5313i.f10755a);
                    }
/* 471 */           return c1626wM8995y;
                }

                @Override // io.sentry.InterfaceC1445f1
                /* JADX INFO: renamed from: l */
                public C1626w mo5225l(C1609k c1609k, InterfaceC1156a1 interfaceC1156a1) {
/* 4 */             SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) this.f17429b;
/* 8 */             C1393c5 c1393c5 = new C1393c5();
/* 13 */            C1597e c1597e = c1393c5.f11517b;
/* 15 */            c1597e.mo5315k(c1609k, "feedback");
/* 20 */            C1486i0 c1486i0 = new C1486i0();
/* 25 */            if (c1609k.f11374f == null) {
/* 31 */                c1609k.f11374f = interfaceC1156a1.mo4682F();
                    }
/* 47 */            sentryAndroidOptions.getLogger().mo4672k(EnumC1553m5.DEBUG, "Capturing feedback: %s", c1393c5.f11516a);
/* 54 */            if (m8996z(c1393c5, c1486i0)) {
/* 58 */                if (c1393c5.f11524w == null) {
/* 64 */                    c1393c5.f11524w = interfaceC1156a1.mo4687K();
                        }
/* 68 */                if (c1393c5.f11520e == null) {
/* 74 */                    c1393c5.m5383c(interfaceC1156a1.mo4712z());
                        } else {
/* 94 */                    for (Map.Entry entry : interfaceC1156a1.mo4712z().entrySet()) {
/* 112 */                       if (!c1393c5.f11520e.containsKey(entry.getKey())) {
/* 128 */                           c1393c5.f11520e.put((String) entry.getKey(), (String) entry.getValue());
                                }
                            }
                        }
/* 155 */               for (Map.Entry entry2 : new C1597e(interfaceC1156a1.mo4680D()).f11294a.entrySet()) {
/* 171 */                   if (!c1597e.mo5305a(entry2.getKey())) {
/* 183 */                       c1597e.mo5315k(entry2.getValue(), (String) entry2.getKey());
                            }
                        }
/* 187 */               InterfaceC1525k1 interfaceC1525k1Mo4694g = interfaceC1156a1.mo4694g();
/* 195 */               if (c1597e.mo5313i() == null) {
/* 197 */                   if (interfaceC1525k1Mo4694g == null) {
/* 207 */                       c1597e.mo5326v(C1522j7.m5331b(interfaceC1156a1.mo4708u()));
                            } else {
/* 215 */                       c1597e.mo5326v(interfaceC1525k1Mo4694g.mo4737s());
                            }
                        }
/* 222 */               c1393c5 = m8992v(c1393c5, c1486i0, interfaceC1156a1.mo4689M());
/* 226 */               if (c1393c5 == null) {
/* 239 */                   sentryAndroidOptions.getLogger().mo4672k(EnumC1553m5.DEBUG, "Feedback was dropped by applyScope", new Object[0]);
/* 242 */                   return C1626w.f11478b;
                        }
                    }
/* 249 */           C1393c5 c1393c5M8992v = m8992v(c1393c5, c1486i0, sentryAndroidOptions.getEventProcessors());
/* 253 */           if (c1393c5M8992v != null) {
/* 255 */               sentryAndroidOptions.getBeforeSendFeedback();
                    }
/* 258 */           if (c1393c5M8992v == null) {
/* 260 */               return C1626w.f11478b;
                    }
/* 263 */           C1626w c1626w = C1626w.f11478b;
/* 265 */           C1626w c1626w2 = c1393c5M8992v.f11516a;
/* 267 */           if (c1626w2 == null) {
/* 270 */               c1626w2 = c1626w;
                    }
/* 273 */           if (c1609k.f11373e == null) {
/* 281 */               sentryAndroidOptions.getReplayController().mo4971c(Boolean.FALSE);
/* 284 */               C1626w c1626wMo4696i = interfaceC1156a1.mo4696i();
/* 292 */               if (!c1626wMo4696i.equals(c1626w)) {
/* 294 */                   c1609k.f11373e = c1626wMo4696i;
                        }
                    }
                    try {
/* 309 */               C1505c c1505cM8986o = m8986o(c1393c5M8992v, m8982s(c1486i0), null, m8990t(interfaceC1156a1, c1486i0, c1393c5M8992v, c1393c5M8992v.f10788g0), null);
/* 313 */               c1486i0.m5272a();
                        return c1505cM8986o != null ? m8995y(c1505cM8986o, c1486i0) : c1626w2;
                    } catch (C1442c | IOException e) {
/* 341 */               sentryAndroidOptions.getLogger().mo4670b(EnumC1553m5.WARNING, e, "Capturing feedback %s failed.", c1626w2);
/* 344 */               return C1626w.f11478b;
                    }
                }

                /* JADX WARN: Code duplicated, block: B:130:0x0288  */
                @Override // io.sentry.InterfaceC1445f1
                /* JADX INFO: renamed from: m */
                public C1626w mo5226m(C1393c5 c1393c5, InterfaceC1156a1 interfaceC1156a1, C1486i0 c1486i0) {
                    C1764z6 c1764z6Mo4709v;
                    boolean z;
                    String str;
                    InterfaceC1549m1 interfaceC1549m1Mo4700m;
                    C1626w c1626w;
                    C1607j c1607jMo4695h;
                    List listMo4678B;
/* 1 */             C1393c5 c1393c5M8991u = c1393c5;
/* 10 */            SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) this.f17429b;
/* 20 */            if (m8996z(c1393c5M8991u, c1486i0) && !InterfaceC1476d.class.isInstance(c1486i0.m5273b("sentry:typeCheckHint")) && interfaceC1156a1 != null && (listMo4678B = interfaceC1156a1.mo4678B()) != null) {
/* 42 */                c1486i0.f11002b.addAll(listMo4678B);
                    }
/* 45 */            ILogger logger = sentryAndroidOptions.getLogger();
/* 49 */            EnumC1553m5 enumC1553m5 = EnumC1553m5.DEBUG;
/* 59 */            logger.mo4672k(enumC1553m5, "Capturing event: %s", c1393c5M8991u.f11516a);
/* 62 */            Throwable thM5381a = c1393c5M8991u.m5381a();
/* 66 */            if (thM5381a != null && sentryAndroidOptions.getIgnoredExceptionsForType().contains(thM5381a.getClass())) {
/* 96 */                sentryAndroidOptions.getLogger().mo4672k(enumC1553m5, "Event was dropped as the exception %s is ignored", thM5381a.getClass());
/* 107 */               sentryAndroidOptions.getClientReportRecorder().mo5158a(EnumC1414d.EVENT_PROCESSOR, EnumC1560n.Error);
/* 110 */               return C1626w.f11478b;
                    }
/* 113 */           List<C1456g0> ignoredErrors = sentryAndroidOptions.getIgnoredErrors();
/* 118 */           if (ignoredErrors != null && !ignoredErrors.isEmpty()) {
/* 130 */               HashSet<String> hashSet = new HashSet();
/* 133 */               C1616p c1616p = c1393c5M8991u.f10783b0;
/* 135 */               if (c1616p != null) {
/* 137 */                   String str2 = c1616p.f11421b;
/* 139 */                   if (str2 != null) {
/* 141 */                       hashSet.add(str2);
                            }
/* 144 */                   String str3 = c1616p.f11420a;
/* 146 */                   if (str3 != null) {
/* 148 */                       hashSet.add(str3);
                            }
                        }
/* 151 */               Throwable thM5381a2 = c1393c5M8991u.m5381a();
/* 155 */               if (thM5381a2 != null) {
/* 161 */                   hashSet.add(thM5381a2.toString());
                        }
/* 164 */               Iterator<C1456g0> it = ignoredErrors.iterator();
/* 172 */               while (it.hasNext()) {
/* 186 */                   if (hashSet.contains(it.next().f10950a)) {
/* 251 */                       sentryAndroidOptions.getLogger().mo4672k(EnumC1553m5.DEBUG, "Event was dropped as it matched a string/pattern in ignoredErrors", c1393c5M8991u.f10783b0);
/* 262 */                       sentryAndroidOptions.getClientReportRecorder().mo5158a(EnumC1414d.EVENT_PROCESSOR, EnumC1560n.Error);
/* 265 */                       return C1626w.f11478b;
                            }
                        }
/* 197 */               for (C1456g0 c1456g0 : ignoredErrors) {
/* 213 */                   for (String str4 : hashSet) {
/* 221 */                       Pattern pattern = c1456g0.f10951b;
/* 235 */                       if (pattern == null ? false : pattern.matcher(str4).matches()) {
/* 251 */                           sentryAndroidOptions.getLogger().mo4672k(EnumC1553m5.DEBUG, "Event was dropped as it matched a string/pattern in ignoredErrors", c1393c5M8991u.f10783b0);
/* 262 */                           sentryAndroidOptions.getClientReportRecorder().mo5158a(EnumC1414d.EVENT_PROCESSOR, EnumC1560n.Error);
/* 265 */                           return C1626w.f11478b;
                                }
                            }
                        }
                    }
/* 272 */           if (m8996z(c1393c5M8991u, c1486i0)) {
/* 274 */               if (interfaceC1156a1 != null) {
/* 276 */                   m8985n(c1393c5, interfaceC1156a1);
/* 279 */                   String str5 = c1393c5M8991u.f10788g0;
/* 281 */                   C1597e c1597e = c1393c5M8991u.f11517b;
/* 283 */                   if (str5 == null) {
/* 289 */                       c1393c5M8991u.f10788g0 = interfaceC1156a1.mo4690N();
                            }
/* 293 */                   if (c1393c5M8991u.f10789h0 == null) {
/* 299 */                       c1393c5M8991u.m5111h(interfaceC1156a1.mo4686J());
                            }
/* 306 */                   if (interfaceC1156a1.mo4707t() != null) {
/* 312 */                       c1393c5M8991u.f10787f0 = interfaceC1156a1.mo4707t();
                            }
/* 314 */                   InterfaceC1525k1 interfaceC1525k1Mo4694g = interfaceC1156a1.mo4694g();
/* 322 */                   if (c1597e.mo5313i() == null) {
/* 324 */                       if (interfaceC1525k1Mo4694g == null) {
/* 334 */                           c1597e.mo5326v(C1522j7.m5331b(interfaceC1156a1.mo4708u()));
                                } else {
/* 342 */                           c1597e.mo5326v(interfaceC1525k1Mo4694g.mo4737s());
                                }
                            }
/* 349 */                   if (c1597e.mo5310f() == null && (c1607jMo4695h = interfaceC1156a1.mo4695h()) != null) {
/* 357 */                       c1597e.mo5320p(c1607jMo4695h);
                            }
/* 364 */                   c1393c5M8991u = m8991u(c1393c5M8991u, c1486i0, interfaceC1156a1.mo4689M());
                        }
/* 368 */               if (c1393c5M8991u == null) {
/* 380 */                   sentryAndroidOptions.getLogger().mo4672k(EnumC1553m5.DEBUG, "Event was dropped by applyScope", new Object[0]);
/* 383 */                   return C1626w.f11478b;
                        }
                    }
/* 390 */           C1393c5 c1393c5M8991u2 = m8991u(c1393c5M8991u, c1486i0, sentryAndroidOptions.getEventProcessors());
/* 394 */           if (c1393c5M8991u2 != null) {
/* 396 */               sentryAndroidOptions.getBeforeSend();
                    }
/* 400 */           if (c1393c5M8991u2 != null) {
                        try {
/* 406 */                   if (sentryAndroidOptions.isEnableEventSizeLimiting() && !AbstractC1704c.m5456k(c1393c5M8991u2, sentryAndroidOptions)) {
/* 437 */                       sentryAndroidOptions.getLogger().mo4672k(EnumC1553m5.INFO, "Event %s exceeds %d bytes limit. Reducing size by dropping fields.", c1393c5M8991u2.f11516a, 1048576L);
/* 440 */                       sentryAndroidOptions.getOnOversizedEvent();
/* 443 */                       List list = c1393c5M8991u2.f11513X;
/* 445 */                       if (list != null && !list.isEmpty()) {
/* 453 */                           c1393c5M8991u2.f11513X = null;
/* 469 */                           sentryAndroidOptions.getLogger().mo4672k(EnumC1553m5.DEBUG, "Removed breadcrumbs to reduce size of event %s", c1393c5M8991u2.f11516a);
                                }
/* 476 */                       if (!AbstractC1704c.m5456k(c1393c5M8991u2, sentryAndroidOptions)) {
/* 479 */                           AbstractC1704c.m5465t(c1393c5M8991u2, sentryAndroidOptions);
/* 486 */                           if (!AbstractC1704c.m5456k(c1393c5M8991u2, sentryAndroidOptions)) {
/* 502 */                               sentryAndroidOptions.getLogger().mo4672k(EnumC1553m5.WARNING, "Event %s still exceeds size limit after reducing all fields. Event may be rejected by server.", c1393c5M8991u2.f11516a);
                                    }
                                }
                            }
                        } catch (Throwable th) {
/* 515 */                   sentryAndroidOptions.getLogger().mo4671d(EnumC1553m5.ERROR, "An error occurred while limiting event size. Event will be sent as-is.", th);
                        }
                    }
/* 518 */           if (c1393c5M8991u2 == null) {
/* 520 */               return C1626w.f11478b;
                    }
/* 536 */           C1764z6 c1764z6Mo4709v2 = interfaceC1156a1 != null ? interfaceC1156a1.mo4709v(new C1697u2(3)) : null;
/* 537 */           if ((c1764z6Mo4709v2 != null && c1764z6Mo4709v2.f11867i != EnumC1756y6.Ok) || !AbstractC1704c.m5463r(c1486i0)) {
/* 545 */               c1764z6Mo4709v = null;
                    } else if (interfaceC1156a1 != null) {
/* 561 */               c1764z6Mo4709v = interfaceC1156a1.mo4709v(new C2080pr(7, this, c1393c5M8991u2, c1486i0));
                    } else {
/* 576 */               sentryAndroidOptions.getLogger().mo4672k(EnumC1553m5.INFO, "Scope is null on client.captureEvent", new Object[0]);
/* 545 */               c1764z6Mo4709v = null;
                    }
/* 588 */           C1713l c1713lM5481a = sentryAndroidOptions.getSampleRate() == null ? null : AbstractC1714m.m5481a();
/* 596 */           if (sentryAndroidOptions.getSampleRate() != null && c1713lM5481a != null && sentryAndroidOptions.getSampleRate().doubleValue() < c1713lM5481a.m5480c()) {
/* 631 */               sentryAndroidOptions.getLogger().mo4672k(EnumC1553m5.DEBUG, "Event %s was dropped due to sampling decision.", c1393c5M8991u2.f11516a);
/* 642 */               sentryAndroidOptions.getClientReportRecorder().mo5158a(EnumC1414d.SAMPLE_RATE, EnumC1560n.Error);
/* 645 */               c1393c5M8991u2 = null;
                    }
/* 647 */           if (c1764z6Mo4709v != null) {
/* 651 */               if (c1764z6Mo4709v2 != null) {
/* 655 */                   EnumC1756y6 enumC1756y6 = c1764z6Mo4709v.f11867i;
/* 657 */                   EnumC1756y6 enumC1756y7 = EnumC1756y6.Crashed;
/* 659 */                   z = (enumC1756y6 == enumC1756y7 && c1764z6Mo4709v2.f11867i != enumC1756y7) || (c1764z6Mo4709v.f11863c.get() > 0 && c1764z6Mo4709v2.f11863c.get() <= 0);
                        }
                    }
/* 683 */           if (c1393c5M8991u2 == null && !z) {
/* 697 */               sentryAndroidOptions.getLogger().mo4672k(EnumC1553m5.DEBUG, "Not sending session update for dropped event as it did not cause the session health to change.", new Object[0]);
/* 700 */               return C1626w.f11478b;
                    }
/* 713 */           C1626w c1626wM8995y = (c1393c5M8991u2 == null || (c1626w = c1393c5M8991u2.f11516a) == null) ? C1626w.f11478b : c1626w;
/* 720 */           boolean zIsInstance = InterfaceC1474b.class.isInstance(c1486i0.m5273b("sentry:typeCheckHint"));
/* 748 */           boolean z2 = InterfaceC1476d.class.isInstance(c1486i0.m5273b("sentry:typeCheckHint")) && !C1278v0.class.isInstance(c1486i0.m5273b("sentry:typeCheckHint"));
/* 749 */           if (c1393c5M8991u2 != null && !zIsInstance && !z2 && (c1393c5M8991u2.m5110g() || c1393c5M8991u2.m5109f() != null)) {
/* 771 */               sentryAndroidOptions.getSessionReplay().getClass();
/* 790 */               sentryAndroidOptions.getReplayController().mo4971c(Boolean.valueOf(c1393c5M8991u2.m5109f() != null));
                    }
/* 793 */           if (c1393c5M8991u2 != null) {
                        try {
/* 795 */                   str = c1393c5M8991u2.f10788g0;
                        } catch (C1442c e) {
/* 811 */                   e = e;
/* 844 */                   sentryAndroidOptions.getLogger().mo4670b(EnumC1553m5.WARNING, e, "Capturing event %s failed.", c1626wM8995y);
/* 847 */                   c1626wM8995y = C1626w.f11478b;
                        } catch (IOException e2) {
/* 813 */                   e = e2;
/* 844 */                   sentryAndroidOptions.getLogger().mo4670b(EnumC1553m5.WARNING, e, "Capturing event %s failed.", c1626wM8995y);
/* 847 */                   c1626wM8995y = C1626w.f11478b;
                        }
                    } else {
/* 798 */               str = null;
                    }
/* 818 */           C1505c c1505cM8986o = m8986o(c1393c5M8991u2, c1393c5M8991u2 != null ? m8982s(c1486i0) : null, c1764z6Mo4709v, m8990t(interfaceC1156a1, c1486i0, c1393c5M8991u2, str), null);
/* 822 */           c1486i0.m5272a();
/* 825 */           if (c1505cM8986o != null) {
/* 827 */               c1626wM8995y = m8995y(c1505cM8986o, c1486i0);
                    }
/* 849 */           if (interfaceC1156a1 != null && (interfaceC1549m1Mo4700m = interfaceC1156a1.mo4700m()) != null && InterfaceC1484l.class.isInstance(c1486i0.m5273b("sentry:typeCheckHint"))) {
/* 869 */               Object objM5273b = c1486i0.m5273b("sentry:typeCheckHint");
/* 875 */               if (objM5273b instanceof AbstractC1475c) {
/* 883 */                   ((AbstractC1475c) objM5273b).mo4959g(interfaceC1549m1Mo4700m.mo5247g());
/* 888 */                   interfaceC1549m1Mo4700m.mo5246e(EnumC1451f7.ABORTED, false, c1486i0);
                        } else {
/* 894 */                   interfaceC1549m1Mo4700m.mo5246e(EnumC1451f7.ABORTED, false, null);
                        }
                    }
/* 897 */           return c1626wM8995y;
                }

                /* JADX INFO: renamed from: n */
                public void m8985n(AbstractC1635q4 abstractC1635q4, InterfaceC1156a1 interfaceC1156a1) {
/* 1 */             if (interfaceC1156a1 != null) {
/* 5 */                 if (abstractC1635q4.f11519d == null) {
/* 11 */                    abstractC1635q4.f11519d = interfaceC1156a1.mo4688L();
                        }
/* 15 */                if (abstractC1635q4.f11524w == null) {
/* 21 */                    abstractC1635q4.f11524w = interfaceC1156a1.mo4687K();
                        }
/* 25 */                if (abstractC1635q4.f11520e == null) {
/* 31 */                    abstractC1635q4.m5383c(interfaceC1156a1.mo4712z());
                        } else {
/* 51 */                    for (Map.Entry entry : interfaceC1156a1.mo4712z().entrySet()) {
/* 69 */                        if (!abstractC1635q4.f11520e.containsKey(entry.getKey())) {
/* 85 */                            abstractC1635q4.f11520e.put((String) entry.getKey(), (String) entry.getValue());
                                }
                            }
                        }
/* 91 */                if (abstractC1635q4.f11513X == null) {
/* 107 */                   abstractC1635q4.f11513X = new ArrayList(new ArrayList(interfaceC1156a1.mo4706s()));
                        } else {
/* 110 */                   Queue queueMo4706s = interfaceC1156a1.mo4706s();
/* 114 */                   List list = abstractC1635q4.f11513X;
/* 116 */                   if (list != null && !queueMo4706s.isEmpty()) {
/* 124 */                       list.addAll(queueMo4706s);
/* 131 */                       Collections.sort(list, (C1643r4) this.f17431d);
                            }
                        }
/* 136 */               if (abstractC1635q4.f11515Z == null) {
/* 138 */                   Map extras = interfaceC1156a1.getExtras();
/* 151 */                   abstractC1635q4.f11515Z = extras != null ? new HashMap(extras) : null;
                        } else {
/* 170 */                   for (Map.Entry entry2 : interfaceC1156a1.getExtras().entrySet()) {
/* 188 */                       if (!abstractC1635q4.f11515Z.containsKey(entry2.getKey())) {
/* 202 */                           abstractC1635q4.f11515Z.put((String) entry2.getKey(), entry2.getValue());
                                }
                            }
                        }
/* 206 */               C1597e c1597e = abstractC1635q4.f11517b;
/* 231 */               for (Map.Entry entry3 : new C1597e(interfaceC1156a1.mo4680D()).f11294a.entrySet()) {
/* 247 */                   if (!c1597e.mo5305a(entry3.getKey())) {
/* 259 */                       c1597e.mo5315k(entry3.getValue(), (String) entry3.getKey());
                            }
                        }
                    }
                }

                /* JADX INFO: renamed from: o */
                public C1505c m8986o(AbstractC1635q4 abstractC1635q4, ArrayList arrayList, C1764z6 c1764z6, C1472h7 c1472h7, C1642r3 c1642r3) {
                    C1626w c1626w;
/* 12 */            SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) this.f17429b;
/* 16 */            ArrayList arrayList2 = new ArrayList();
/* 20 */            if (abstractC1635q4 != null) {
/* 22 */                InterfaceC1487i1 serializer = sentryAndroidOptions.getSerializer();
/* 26 */                Charset charset = C1160a5.f9798d;
/* 30 */                AbstractC1704c.m5462q(serializer, "ISerializer is required.");
/* 37 */                int i = 5;
/* 41 */                C1505c c1505c = new C1505c(new bh0(i, serializer, abstractC1635q4));
/* 73 */                arrayList2.add(new C1160a5(new C1381b5(EnumC1538l5.resolve(abstractC1635q4), new CallableC1738w4(c1505c, 4), "application/json", null, null), new CallableC1738w4(c1505c, i)));
/* 76 */                c1626w = abstractC1635q4.f11516a;
                    } else {
/* 80 */                c1626w = null;
                    }
/* 81 */            if (c1764z6 != null) {
/* 91 */                arrayList2.add(C1160a5.m4719d(sentryAndroidOptions.getSerializer(), c1764z6));
                    }
/* 94 */            if (c1642r3 != null) {
/* 96 */                long maxTraceFileSize = sentryAndroidOptions.getMaxTraceFileSize();
/* 100 */               InterfaceC1487i1 serializer2 = sentryAndroidOptions.getSerializer();
/* 104 */               Charset charset2 = C1160a5.f9798d;
/* 106 */               File file = c1642r3.f11552a;
/* 115 */               C1505c c1505c2 = new C1505c(new CallableC1754y4(file, maxTraceFileSize, c1642r3, serializer2));
/* 150 */               arrayList2.add(new C1160a5(new C1381b5(EnumC1538l5.Profile, new CallableC1738w4(c1505c2, 0), "application-json", file.getName(), null), new CallableC1738w4(c1505c2, 1)));
/* 153 */               if (c1626w == null) {
/* 159 */                   c1626w = new C1626w(c1642r3.f11565h0);
                        }
                    }
/* 162 */           if (arrayList != null) {
/* 164 */               Iterator it = arrayList.iterator();
/* 172 */               while (it.hasNext()) {
/* 179 */                   C1154a c1154a = (C1154a) it.next();
/* 181 */                   InterfaceC1487i1 serializer3 = sentryAndroidOptions.getSerializer();
/* 185 */                   ILogger logger = sentryAndroidOptions.getLogger();
/* 189 */                   long maxAttachmentSize = sentryAndroidOptions.getMaxAttachmentSize();
/* 193 */                   Charset charset3 = C1160a5.f9798d;
/* 202 */                   C1505c c1505c3 = new C1505c(new CallableC1754y4(c1154a, maxAttachmentSize, serializer3, logger));
/* 241 */                   arrayList2.add(new C1160a5(new C1381b5(EnumC1538l5.Attachment, new CallableC1738w4(c1505c3, 14), c1154a.f9792f, c1154a.f9791e, c1154a.f9793g), new CallableC1738w4(c1505c3, 15)));
                        }
                    }
/* 249 */           if (arrayList2.isEmpty()) {
/* 19 */                return null;
                    }
/* 264 */           return new C1505c(new C1726v4(c1626w, sentryAndroidOptions.getSdkVersion(), c1472h7), arrayList2);
                }

                /* JADX INFO: renamed from: p */
                public C1505c m8987p(C1583p5 c1583p5) {
/* 3 */             ArrayList arrayList = new ArrayList();
/* 8 */             SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) this.f17429b;
/* 10 */            InterfaceC1487i1 serializer = sentryAndroidOptions.getSerializer();
/* 14 */            Charset charset = C1160a5.f9798d;
/* 18 */            AbstractC1704c.m5462q(serializer, "ISerializer is required.");
/* 25 */            int i = 6;
/* 29 */            C1505c c1505c = new C1505c(new bh0(i, serializer, c1583p5));
/* 71 */            arrayList.add(new C1160a5(new C1381b5(EnumC1538l5.Log, new CallableC1738w4(c1505c, i), "application/vnd.sentry.items.log+json", (String) null, (String) null, (String) null, Integer.valueOf(c1583p5.f11228a.size())), new CallableC1738w4(c1505c, 8)));
/* 86 */            return new C1505c(new C1726v4(null, sentryAndroidOptions.getSdkVersion(), null), arrayList);
                }

                /* JADX INFO: renamed from: q */
                public C1505c m8988q(C1673t5 c1673t5) {
/* 3 */             ArrayList arrayList = new ArrayList();
/* 8 */             SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) this.f17429b;
/* 10 */            InterfaceC1487i1 serializer = sentryAndroidOptions.getSerializer();
/* 14 */            Charset charset = C1160a5.f9798d;
/* 18 */            AbstractC1704c.m5462q(serializer, "ISerializer is required.");
/* 29 */            C1505c c1505c = new C1505c(new bh0(3, serializer, c1673t5));
/* 72 */            arrayList.add(new C1160a5(new C1381b5(EnumC1538l5.TraceMetric, new CallableC1738w4(c1505c, 7), "application/vnd.sentry.items.trace-metric+json", (String) null, (String) null, (String) null, Integer.valueOf(c1673t5.f11672a.size())), new CallableC1738w4(c1505c, 13)));
/* 87 */            return new C1505c(new C1726v4(null, sentryAndroidOptions.getSdkVersion(), null), arrayList);
                }

                /* JADX INFO: renamed from: r */
                public C1505c m8989r(final C1576o6 c1576o6, final C1745x3 c1745x3, C1472h7 c1472h7, final boolean z) {
/* 5 */             ArrayList arrayList = new ArrayList();
/* 13 */            SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) this.f17429b;
/* 15 */            final InterfaceC1487i1 serializer = sentryAndroidOptions.getSerializer();
/* 19 */            final ILogger logger = sentryAndroidOptions.getLogger();
/* 23 */            Charset charset = C1160a5.f9798d;
/* 25 */            final File file = c1576o6.f11209a0;
/* 38 */            C1505c c1505c = new C1505c(new Callable() { // from class: io.sentry.x4
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
/* 1 */                     InterfaceC1487i1 interfaceC1487i1 = serializer;
/* 3 */                     C1576o6 c1576o7 = c1576o6;
/* 5 */                     File file2 = file;
/* 7 */                     ILogger iLogger = logger;
/* 9 */                     boolean z2 = z;
                            try {
/* 13 */                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                try {
/* 27 */                            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, C1160a5.f9798d), NotificationCompat.FLAG_GROUP_SUMMARY);
                                    try {
/* 32 */                                LinkedHashMap linkedHashMap = new LinkedHashMap();
/* 35 */                                interfaceC1487i1.mo5063a(bufferedWriter, c1576o7);
/* 48 */                                linkedHashMap.put(EnumC1538l5.ReplayEvent.getItemType(), byteArrayOutputStream.toByteArray());
/* 51 */                                byteArrayOutputStream.reset();
/* 54 */                                C1745x3 c1745x4 = c1745x3;
/* 56 */                                if (c1745x4 != null) {
/* 58 */                                    interfaceC1487i1.mo5063a(bufferedWriter, c1745x4);
/* 71 */                                    linkedHashMap.put(EnumC1538l5.ReplayRecording.getItemType(), byteArrayOutputStream.toByteArray());
/* 74 */                                    byteArrayOutputStream.reset();
                                        }
/* 80 */                                if (file2 != null && file2.exists()) {
/* 95 */                                    byte[] bArrM5460o = AbstractC1704c.m5460o(file2.getPath(), 10485760L);
/* 100 */                                   if (bArrM5460o.length > 0) {
/* 108 */                                       linkedHashMap.put(EnumC1538l5.ReplayVideo.getItemType(), bArrM5460o);
                                            }
                                        }
/* 111 */                               byte[] bArrM4720j = C1160a5.m4720j(linkedHashMap);
/* 115 */                               bufferedWriter.close();
/* 118 */                               byteArrayOutputStream.close();
/* 121 */                               if (file2 != null) {
/* 123 */                                   if (z2) {
/* 129 */                                       AbstractC1704c.m5451f(file2.getParentFile());
/* 132 */                                       return bArrM4720j;
                                            }
/* 133 */                                   file2.delete();
                                        }
/* 136 */                               return bArrM4720j;
                                    } catch (Throwable th) {
                                        try {
/* 141 */                                   bufferedWriter.close();
                                        } catch (Throwable th2) {
/* 146 */                                   th.addSuppressed(th2);
                                        }
/* 149 */                               throw th;
                                    }
                                } catch (Throwable th3) {
                                    try {
/* 150 */                               byteArrayOutputStream.close();
                                    } catch (Throwable th4) {
/* 155 */                               th3.addSuppressed(th4);
                                    }
/* 158 */                           throw th3;
                                }
                            } catch (Throwable th5) {
                                try {
/* 163 */                           iLogger.mo4671d(EnumC1553m5.ERROR, "Could not serialize replay recording", th5);
/* 181 */                           return null;
                                } finally {
/* 184 */                           if (file2 != null) {
/* 186 */                               if (z2) {
/* 192 */                                   AbstractC1704c.m5451f(file2.getParentFile());
                                        } else {
/* 196 */                                   file2.delete();
                                        }
                                    }
                                }
                            }
                        }
                    });
/* 70 */            arrayList.add(new C1160a5(new C1381b5(EnumC1538l5.ReplayVideo, new CallableC1738w4(c1505c, 11), null, null, null), new CallableC1738w4(c1505c, 12)));
/* 90 */            return new C1505c(new C1726v4(c1576o6.f11516a, sentryAndroidOptions.getSessionReplay().f11535l, c1472h7), arrayList);
                }

                /* JADX INFO: renamed from: t */
                public C1472h7 m8990t(InterfaceC1156a1 interfaceC1156a1, C1486i0 c1486i0, AbstractC1635q4 abstractC1635q4, String str) {
/* 3 */             SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) this.f17429b;
/* 18 */            if (InterfaceC1474b.class.isInstance(c1486i0.m5273b("sentry:typeCheckHint"))) {
/* 20 */                if (abstractC1635q4 != null) {
/* 28 */                    C1387c c1387c = new C1387c(sentryAndroidOptions.getLogger());
/* 31 */                    C1597e c1597e = abstractC1635q4.f11517b;
/* 33 */                    C1383b7 c1383b7Mo5313i = c1597e.mo5313i();
/* 49 */                    c1387c.m5076d("sentry-trace_id", c1383b7Mo5313i != null ? c1383b7Mo5313i.f10755a.m5380a() : null);
/* 60 */                    c1387c.m5076d("sentry-public_key", sentryAndroidOptions.retrieveParsedDsn().f11845b);
/* 67 */                    c1387c.m5076d("sentry-release", abstractC1635q4.f11521f);
/* 74 */                    c1387c.m5076d("sentry-environment", abstractC1635q4.f11522i);
/* 83 */                    c1387c.m5076d("sentry-org_id", sentryAndroidOptions.getEffectiveOrgId());
/* 88 */                    c1387c.m5076d("sentry-transaction", str);
/* 93 */                    if (c1387c.f10776f) {
/* 95 */                        c1387c.f10773c = null;
                            }
/* 99 */                    c1387c.m5076d("sentry-sampled", null);
/* 104 */                   if (c1387c.f10776f) {
/* 106 */                       c1387c.f10774d = null;
                            }
/* 110 */                   Object objMo5307c = c1597e.mo5307c("replay_id");
/* 114 */                   if (objMo5307c != null && !objMo5307c.toString().equals(C1626w.f11478b.m5380a())) {
/* 138 */                       c1387c.m5076d("sentry-replay_id", objMo5307c.toString());
/* 143 */                       c1597e.f11294a.remove("replay_id");
                            }
/* 147 */                   c1387c.f10776f = false;
/* 149 */                   return c1387c.m5078f();
                        }
                    } else if (interfaceC1156a1 != null) {
/* 156 */               InterfaceC1549m1 interfaceC1549m1Mo4700m = interfaceC1156a1.mo4700m();
                        return interfaceC1549m1Mo4700m != null ? interfaceC1549m1Mo4700m.mo5245a() : ((C1387c) interfaceC1156a1.mo4681E(new C2076pn(29, interfaceC1156a1, sentryAndroidOptions)).f11671e).m5078f();
                    }
/* 17 */            return null;
                }

                /* JADX INFO: renamed from: u */
                public C1393c5 m8991u(C1393c5 c1393c5, C1486i0 c1486i0, List list) {
/* 3 */             SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) this.f17429b;
/* 5 */             Iterator it = list.iterator();
/* 13 */            while (it.hasNext()) {
/* 19 */                InterfaceC1388c0 interfaceC1388c0 = (InterfaceC1388c0) it.next();
                        try {
/* 21 */                    boolean z = interfaceC1388c0 instanceof C1197i0;
/* 31 */                    boolean zIsInstance = InterfaceC1474b.class.isInstance(c1486i0.m5273b("sentry:typeCheckHint"));
/* 35 */                    if (zIsInstance && z) {
/* 42 */                        ((C1197i0) interfaceC1388c0).mo4754f(c1393c5, c1486i0);
                            } else if (!zIsInstance && !z) {
/* 50 */                        c1393c5 = interfaceC1388c0.mo4754f(c1393c5, c1486i0);
                            }
                        } catch (Throwable th) {
/* 76 */                    sentryAndroidOptions.getLogger().mo4670b(EnumC1553m5.ERROR, th, "An exception occurred while processing event by processor: %s", interfaceC1388c0.getClass().getName());
                        }
/* 79 */                if (c1393c5 == null) {
/* 101 */                   sentryAndroidOptions.getLogger().mo4672k(EnumC1553m5.DEBUG, "Event was dropped by a processor: %s", interfaceC1388c0.getClass().getName());
/* 112 */                   sentryAndroidOptions.getClientReportRecorder().mo5158a(EnumC1414d.EVENT_PROCESSOR, EnumC1560n.Error);
                            break;
                        }
                    }
/* 115 */           return c1393c5;
                }

                /* JADX INFO: renamed from: v */
                public C1393c5 m8992v(C1393c5 c1393c5, C1486i0 c1486i0, List list) {
/* 3 */             SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) this.f17429b;
/* 5 */             Iterator it = list.iterator();
/* 13 */            while (it.hasNext()) {
/* 19 */                InterfaceC1388c0 interfaceC1388c0 = (InterfaceC1388c0) it.next();
                        try {
/* 21 */                    c1393c5 = interfaceC1388c0.mo4754f(c1393c5, c1486i0);
                        } catch (Throwable th) {
/* 47 */                    sentryAndroidOptions.getLogger().mo4670b(EnumC1553m5.ERROR, th, "An exception occurred while processing feedback event by processor: %s", interfaceC1388c0.getClass().getName());
                        }
/* 50 */                if (c1393c5 == null) {
/* 72 */                    sentryAndroidOptions.getLogger().mo4672k(EnumC1553m5.DEBUG, "Feedback event was dropped by a processor: %s", interfaceC1388c0.getClass().getName());
/* 83 */                    sentryAndroidOptions.getClientReportRecorder().mo5158a(EnumC1414d.EVENT_PROCESSOR, EnumC1560n.Feedback);
                            break;
                        }
                    }
/* 86 */            return c1393c5;
                }

                /* JADX INFO: renamed from: w */
                public C1575o5 m8993w(C1575o5 c1575o5, List list) {
                    C1575o5 c1575o5Mo4927h;
/* 3 */             SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) this.f17429b;
/* 5 */             Iterator it = list.iterator();
/* 13 */            while (it.hasNext()) {
/* 19 */                InterfaceC1388c0 interfaceC1388c0 = (InterfaceC1388c0) it.next();
                        try {
/* 21 */                    c1575o5Mo4927h = interfaceC1388c0.mo4927h(c1575o5);
                        } catch (Throwable th) {
/* 47 */                    sentryAndroidOptions.getLogger().mo4670b(EnumC1553m5.ERROR, th, "An exception occurred while processing log event by processor: %s", interfaceC1388c0.getClass().getName());
/* 50 */                    c1575o5Mo4927h = c1575o5;
                        }
/* 51 */                if (c1575o5Mo4927h == null) {
/* 73 */                    sentryAndroidOptions.getLogger().mo4672k(EnumC1553m5.DEBUG, "Log event was dropped by a processor: %s", interfaceC1388c0.getClass().getName());
/* 76 */                    InterfaceC1416f clientReportRecorder = sentryAndroidOptions.getClientReportRecorder();
/* 80 */                    EnumC1414d enumC1414d = EnumC1414d.EVENT_PROCESSOR;
/* 84 */                    clientReportRecorder.mo5158a(enumC1414d, EnumC1560n.LogItem);
/* 105 */                   sentryAndroidOptions.getClientReportRecorder().mo5160e(enumC1414d, EnumC1560n.LogByte, AbstractC1706e.m5469a(sentryAndroidOptions.getSerializer(), sentryAndroidOptions.getLogger(), c1575o5));
/* 108 */                   return c1575o5Mo4927h;
                        }
/* 110 */               c1575o5 = c1575o5Mo4927h;
                    }
/* 112 */           return c1575o5;
                }

                /* JADX INFO: renamed from: x */
                public C1600f0 m8994x(C1600f0 c1600f0, C1486i0 c1486i0, List list) {
/* 3 */             SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) this.f17429b;
/* 5 */             Iterator it = list.iterator();
/* 13 */            while (it.hasNext()) {
/* 19 */                InterfaceC1388c0 interfaceC1388c0 = (InterfaceC1388c0) it.next();
/* 23 */                int size = c1600f0.f11313d0.size();
                        try {
/* 27 */                    c1600f0 = interfaceC1388c0.mo4755g(c1600f0, c1486i0);
                        } catch (Throwable th) {
/* 53 */                    sentryAndroidOptions.getLogger().mo4670b(EnumC1553m5.ERROR, th, "An exception occurred while processing transaction by processor: %s", interfaceC1388c0.getClass().getName());
                        }
/* 62 */                int size2 = c1600f0 == null ? 0 : c1600f0.f11313d0.size();
/* 66 */                if (c1600f0 == null) {
/* 88 */                    sentryAndroidOptions.getLogger().mo4672k(EnumC1553m5.DEBUG, "Transaction was dropped by a processor: %s", interfaceC1388c0.getClass().getName());
/* 91 */                    InterfaceC1416f clientReportRecorder = sentryAndroidOptions.getClientReportRecorder();
/* 95 */                    EnumC1414d enumC1414d = EnumC1414d.EVENT_PROCESSOR;
/* 99 */                    clientReportRecorder.mo5158a(enumC1414d, EnumC1560n.Transaction);
/* 111 */                   sentryAndroidOptions.getClientReportRecorder().mo5160e(enumC1414d, EnumC1560n.Span, size + 1);
                            break;
                        }
/* 115 */               if (size2 < size) {
/* 117 */                   int i = size - size2;
/* 142 */                   sentryAndroidOptions.getLogger().mo4672k(EnumC1553m5.DEBUG, "%d spans were dropped by a processor: %s", Integer.valueOf(i), interfaceC1388c0.getClass().getName());
/* 154 */                   sentryAndroidOptions.getClientReportRecorder().mo5160e(EnumC1414d.EVENT_PROCESSOR, EnumC1560n.Span, i);
                        }
                    }
/* 159 */           return c1600f0;
                }

                /* JADX INFO: renamed from: y */
                public C1626w m8995y(C1505c c1505c, C1486i0 c1486i0) {
/* 3 */             SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) this.f17429b;
/* 5 */             sentryAndroidOptions.getBeforeEnvelopeCallback();
/* 16 */            C1529k5.m5336d().m5339c(sentryAndroidOptions.getLogger());
/* 21 */            InterfaceC1681g interfaceC1681g = (InterfaceC1681g) this.f17430c;
/* 23 */            if (c1486i0 == null) {
/* 25 */                interfaceC1681g.getClass();
/* 33 */                interfaceC1681g.mo5417F0(c1505c, new C1486i0());
                    } else {
/* 37 */                interfaceC1681g.mo5417F0(c1505c, c1486i0);
                    }
/* 44 */            C1626w c1626w = ((C1726v4) c1505c.f11042b).f11760a;
                    return c1626w != null ? c1626w : C1626w.f11478b;
                }

                /* JADX INFO: renamed from: z */
                public boolean m8996z(AbstractC1635q4 abstractC1635q4, C1486i0 c1486i0) {
/* 5 */             if (AbstractC1704c.m5463r(c1486i0)) {
/* 7 */                 return true;
                    }
/* 27 */            ((SentryAndroidOptions) this.f17429b).getLogger().mo4672k(EnumC1553m5.DEBUG, "Event was cached so not applying scope: %s", abstractC1635q4.f11516a);
/* 30 */            return false;
                }

/* 193 */       public u93(Context context, tz1 tz1Var, we2 we2Var) {
                    this.f17429b = context;
                    this.f17430c = tz1Var;
                    this.f17431d = we2Var;
                    this.f17432e = new gi3(this, true);
/* 195 */           this.f17433f = new gi3(this, false);
                }

/* 195 */       public u93(ur0 ur0Var, InterfaceC0836d9 interfaceC0836d9, C2323w9 c2323w9) {
                    this.f17433f = ur0Var;
                    this.f17431d = null;
                    this.f17432e = null;
                    this.f17428a = false;
                    this.f17429b = interfaceC0836d9;
                    this.f17430c = c2323w9;
                }

                /* JADX WARN: Code duplicated, block: B:10:0x0031  */
/* 196 */       public u93(C1799jn c1799jn, C0962gp c0962gp, y92 y92Var) {
                    Range range;
                    t93 zr3Var;
/* 198 */           this.f17428a = false;
/* 199 */           this.f17433f = new s93(this);
/* 200 */           this.f17429b = c1799jn;
/* 201 */           if (Build.VERSION.SDK_INT >= 30) {
                        try {
/* 1 */                     range = (Range) c0962gp.m3981a(CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE);
                        } catch (AssertionError e) {
/* 203 */                   hu0.m4317I0("ZoomControl", "AssertionError, fail to get camera characteristic.", e);
                            range = null;
                        }
                        if (range != null) {
/* 204 */                   zr3Var = new zr3(c0962gp);
                        } else {
/* 205 */                   zr3Var = new gr0(c0962gp);
                        }
                    } else {
/* 205 */               zr3Var = new gr0(c0962gp);
                    }
/* 206 */           this.f17432e = zr3Var;
/* 207 */           v93 v93Var = new v93(zr3Var.mo3993e(), zr3Var.mo3995h());
                    this.f17430c = v93Var;
/* 208 */           v93Var.m9242e();
/* 214 */           this.f17431d = new rk1(new C2496yf(v93Var.m9241d(), v93Var.m9239b(), v93Var.m9240c(), v93Var.m9238a()));
/* 215 */           c1799jn.m5855h((s93) this.f17433f);
                }
            }
