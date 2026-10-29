            package io.sentry.internal.debugmeta;

            import android.content.Context;
            import io.sentry.C1160a5;
            import io.sentry.C1522j7;
            import io.sentry.C1554m6;
            import io.sentry.C1583p5;
            import io.sentry.C1666s6;
            import io.sentry.C1673t5;
            import io.sentry.C1726v4;
            import io.sentry.EnumC1538l5;
            import io.sentry.EnumC1553m5;
            import io.sentry.EnumC1560n;
            import io.sentry.ILogger;
            import io.sentry.InterfaceC1518j3;
            import io.sentry.clientreport.C1412b;
            import io.sentry.clientreport.C1413c;
            import io.sentry.clientreport.C1415e;
            import io.sentry.clientreport.EnumC1414d;
            import io.sentry.clientreport.InterfaceC1416f;
            import io.sentry.protocol.C1600f0;
            import io.sentry.protocol.C1624u;
            import io.sentry.protocol.C1626w;
            import io.sentry.util.AbstractC1704c;
            import io.sentry.util.C1708g;
            import io.sentry.vendor.gson.stream.C1732c;
            import java.io.BufferedInputStream;
            import java.io.FileNotFoundException;
            import java.io.IOException;
            import java.io.InputStream;
            import java.io.Writer;
            import java.lang.reflect.Method;
            import java.net.MalformedURLException;
            import java.net.URI;
            import java.net.URL;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.Collections;
            import java.util.Date;
            import java.util.Enumeration;
            import java.util.HashMap;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Map;
            import java.util.Properties;
            import java.util.concurrent.Callable;
            import java.util.concurrent.atomic.AtomicLong;
            import p000.C1951n4;
            import p000.C1954n7;
            import p000.f42;
            import p000.s80;
            
            /* JADX INFO: renamed from: io.sentry.internal.debugmeta.c */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 32 */    public final class C1505c implements InterfaceC1503a, ILogger, InterfaceC1518j3, InterfaceC1416f {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f11041a;

                /* JADX INFO: renamed from: b */
                public Object f11042b;

                /* JADX INFO: renamed from: c */
                public final Object f11043c;

                public C1505c(String str, HashMap map) {
/* 2 */             this.f11041a = 3;
/* 9 */             AbstractC1704c.m5462q(str, "url is required");
                    try {
/* 20 */                this.f11042b = URI.create(str).toURL();
/* 22 */                this.f11043c = map;
                    } catch (MalformedURLException e) {
/* 33 */                throw new IllegalArgumentException("Failed to compose the Sentry's server URL.", e);
                    }
                }

                /* JADX INFO: renamed from: j */
                public static EnumC1560n m5286j(EnumC1538l5 enumC1538l5) {
/* 7 */             if (EnumC1538l5.Event.equals(enumC1538l5)) {
/* 9 */                 return EnumC1560n.Error;
                    }
/* 18 */            if (EnumC1538l5.Session.equals(enumC1538l5)) {
/* 20 */                return EnumC1560n.Session;
                    }
/* 29 */            if (EnumC1538l5.Transaction.equals(enumC1538l5)) {
/* 31 */                return EnumC1560n.Transaction;
                    }
/* 40 */            if (EnumC1538l5.UserFeedback.equals(enumC1538l5)) {
/* 42 */                return EnumC1560n.UserReport;
                    }
/* 51 */            if (EnumC1538l5.Feedback.equals(enumC1538l5)) {
/* 53 */                return EnumC1560n.Feedback;
                    }
/* 62 */            if (EnumC1538l5.Profile.equals(enumC1538l5)) {
/* 64 */                return EnumC1560n.Profile;
                    }
/* 73 */            if (EnumC1538l5.ProfileChunk.equals(enumC1538l5)) {
/* 75 */                return EnumC1560n.ProfileChunkUi;
                    }
/* 84 */            if (EnumC1538l5.Attachment.equals(enumC1538l5)) {
/* 86 */                return EnumC1560n.Attachment;
                    }
/* 95 */            if (EnumC1538l5.CheckIn.equals(enumC1538l5)) {
/* 97 */                return EnumC1560n.Monitor;
                    }
/* 106 */           if (EnumC1538l5.ReplayVideo.equals(enumC1538l5)) {
/* 108 */               return EnumC1560n.Replay;
                    }
/* 117 */           if (EnumC1538l5.Log.equals(enumC1538l5)) {
/* 119 */               return EnumC1560n.LogItem;
                    }
/* 128 */           if (EnumC1538l5.Span.equals(enumC1538l5)) {
/* 130 */               return EnumC1560n.Span;
                    }
                    return EnumC1538l5.TraceMetric.equals(enumC1538l5) ? EnumC1560n.TraceMetric : EnumC1560n.Default;
                }

                @Override // io.sentry.clientreport.InterfaceC1416f
                /* JADX INFO: renamed from: a */
                public void mo5158a(EnumC1414d enumC1414d, EnumC1560n enumC1560n) {
/* 3 */             mo5160e(enumC1414d, enumC1560n, 1L);
                }

                @Override // io.sentry.ILogger
                /* JADX INFO: renamed from: b */
                public void mo4670b(EnumC1553m5 enumC1553m5, Throwable th, String str, Object... objArr) {
/* 3 */             ILogger iLogger = (ILogger) this.f11042b;
/* 5 */             if (iLogger == null || !mo4673m(enumC1553m5)) {
/* 16 */                return;
                    }
/* 13 */            iLogger.mo4670b(enumC1553m5, th, str, objArr);
                }

                @Override // io.sentry.clientreport.InterfaceC1416f
                /* JADX INFO: renamed from: c */
                public void mo5159c(EnumC1414d enumC1414d, C1505c c1505c) {
/* 1 */             if (c1505c == null) {
/* 30 */                return;
                    }
                    try {
/* 8 */                 Iterator it = ((Iterable) c1505c.f11043c).iterator();
/* 16 */                while (it.hasNext()) {
/* 24 */                    mo5161g(enumC1414d, (C1160a5) it.next());
                        }
                    } catch (Throwable th) {
/* 46 */                ((C1554m6) this.f11043c).getLogger().mo4670b(EnumC1553m5.ERROR, th, "Unable to record lost envelope.", new Object[0]);
                    }
                }

                @Override // io.sentry.ILogger
                /* JADX INFO: renamed from: d */
                public void mo4671d(EnumC1553m5 enumC1553m5, String str, Throwable th) {
/* 3 */             ILogger iLogger = (ILogger) this.f11042b;
/* 5 */             if (iLogger == null || !mo4673m(enumC1553m5)) {
/* 16 */                return;
                    }
/* 13 */            iLogger.mo4671d(enumC1553m5, str, th);
                }

                @Override // io.sentry.clientreport.InterfaceC1416f
                /* JADX INFO: renamed from: e */
                public void mo5160e(EnumC1414d enumC1414d, EnumC1560n enumC1560n, long j) {
                    try {
/* 13 */                m5292q(enumC1414d.getReason(), enumC1560n.getCategory(), Long.valueOf(j));
/* 16 */                m5289n();
                    } catch (Throwable th) {
/* 36 */                ((C1554m6) this.f11043c).getLogger().mo4670b(EnumC1553m5.ERROR, th, "Unable to record lost event.", new Object[0]);
                    }
                }

                @Override // io.sentry.internal.debugmeta.InterfaceC1503a
                /* JADX INFO: renamed from: f */
                public List mo5285f() {
/* 1 */             int i = this.f11041a;
/* 6 */             Object obj = this.f11043c;
                    switch (i) {
                        case 0:
/* 95 */                    ILogger iLogger = (ILogger) this.f11042b;
/* 99 */                    ArrayList arrayList = new ArrayList();
                            try {
/* 104 */                       Enumeration<URL> resources = ((ClassLoader) obj).getResources("sentry-debug-meta.properties");
/* 112 */                       while (resources.hasMoreElements()) {
/* 114 */                           URL urlNextElement = resources.nextElement();
                                    try {
/* 120 */                               InputStream inputStreamOpenStream = urlNextElement.openStream();
                                        try {
/* 126 */                                   Properties properties = new Properties();
/* 129 */                                   properties.load(inputStreamOpenStream);
/* 132 */                                   arrayList.add(properties);
/* 143 */                                   iLogger.mo4672k(EnumC1553m5.INFO, "Debug Meta Data Properties loaded from %s", urlNextElement);
/* 146 */                                   if (inputStreamOpenStream != null) {
/* 148 */                                       inputStreamOpenStream.close();
                                            }
                                        } catch (Throwable th) {
/* 157 */                                   if (inputStreamOpenStream != null) {
                                                try {
/* 159 */                                           inputStreamOpenStream.close();
                                                } catch (Throwable th2) {
/* 164 */                                           th.addSuppressed(th2);
                                                }
                                                break;
                                            }
/* 167 */                                   throw th;
                                        }
                                    } catch (RuntimeException e) {
/* 174 */                               iLogger.mo4670b(EnumC1553m5.ERROR, e, "%s file is malformed.", urlNextElement);
                                    }
                                }
                            } catch (IOException e2) {
/* 186 */                       iLogger.mo4670b(EnumC1553m5.ERROR, e2, "Failed to load %s", "sentry-debug-meta.properties");
                            }
/* 193 */                   if (!arrayList.isEmpty()) {
/* 207 */                       return arrayList;
                            }
/* 203 */                   iLogger.mo4672k(EnumC1553m5.INFO, "No %s file was found.", "sentry-debug-meta.properties");
/* 3 */                     return null;
                        default:
/* 15 */                    ILogger iLogger2 = (ILogger) this.f11042b;
                            try {
/* 29 */                        BufferedInputStream bufferedInputStream = new BufferedInputStream(((Context) obj).getAssets().open("sentry-debug-meta.properties"));
                                try {
/* 34 */                            Properties properties2 = new Properties();
/* 37 */                            properties2.load(bufferedInputStream);
/* 40 */                            List listSingletonList = Collections.singletonList(properties2);
/* 44 */                            bufferedInputStream.close();
/* 47 */                            return listSingletonList;
                                } catch (Throwable th3) {
                                    try {
/* 54 */                                bufferedInputStream.close();
                                        break;
                                    } catch (Throwable th4) {
/* 59 */                                th3.addSuppressed(th4);
                                    }
/* 62 */                            throw th3;
                                }
                            } catch (FileNotFoundException unused) {
/* 89 */                        iLogger2.mo4672k(EnumC1553m5.INFO, "%s file was not found.", "sentry-debug-meta.properties");
/* 3 */                         return null;
                            } catch (IOException e3) {
/* 77 */                        iLogger2.mo4671d(EnumC1553m5.ERROR, "Error getting Proguard UUIDs.", e3);
/* 3 */                         return null;
                            } catch (RuntimeException e4) {
/* 69 */                        iLogger2.mo4670b(EnumC1553m5.ERROR, e4, "%s file is malformed.", "sentry-debug-meta.properties");
/* 3 */                         return null;
                            }
                    }
                }

                @Override // io.sentry.clientreport.InterfaceC1416f
                /* JADX INFO: renamed from: g */
                public void mo5161g(EnumC1414d enumC1414d, C1160a5 c1160a5) {
/* 9 */             C1554m6 c1554m6 = (C1554m6) this.f11043c;
/* 11 */            if (c1160a5 == null) {
/* 319 */               return;
                    }
                    try {
/* 18 */                EnumC1538l5 enumC1538l5 = c1160a5.f9799a.f10744e;
/* 26 */                if (EnumC1538l5.ClientReport.equals(enumC1538l5)) {
                            try {
/* 36 */                        m5293r(c1160a5.m4721e(c1554m6.getSerializer()));
/* 319 */                       return;
                            } catch (Exception unused) {
/* 54 */                        c1554m6.getLogger().mo4672k(EnumC1553m5.ERROR, "Unable to restore counts from previous client report.", new Object[0]);
/* 319 */                       return;
                            }
                        }
/* 59 */                EnumC1560n enumC1560nM5286j = m5286j(enumC1538l5);
/* 69 */                if (enumC1560nM5286j.equals(EnumC1560n.Transaction)) {
/* 75 */                    C1600f0 c1600f0M4725i = c1160a5.m4725i(c1554m6.getSerializer());
/* 79 */                    if (c1600f0M4725i != null) {
/* 81 */                        ArrayList arrayList = c1600f0M4725i.f11313d0;
/* 103 */                       m5292q(enumC1414d.getReason(), EnumC1560n.Span.getCategory(), Long.valueOf(((long) arrayList.size()) + 1));
/* 106 */                       arrayList.size();
/* 109 */                       m5289n();
                            }
/* 120 */                   m5292q(enumC1414d.getReason(), enumC1560nM5286j.getCategory(), 1L);
/* 123 */                   m5289n();
/* 319 */                   return;
                        }
/* 134 */               if (enumC1560nM5286j.equals(EnumC1560n.LogItem)) {
/* 140 */                   C1583p5 c1583p5M4723g = c1160a5.m4723g(c1554m6.getSerializer());
/* 144 */                   if (c1583p5M4723g == null) {
/* 206 */                       c1554m6.getLogger().mo4672k(EnumC1553m5.ERROR, "Unable to parse lost logs envelope item.", new Object[0]);
/* 319 */                       return;
                            }
/* 165 */                   m5292q(enumC1414d.getReason(), enumC1560nM5286j.getCategory(), Long.valueOf(c1583p5M4723g.f11228a.size()));
/* 188 */                   m5292q(enumC1414d.getReason(), EnumC1560n.LogByte.getCategory(), Long.valueOf(c1160a5.m4722f().length));
/* 191 */                   m5289n();
/* 319 */                   return;
                        }
/* 216 */               if (!enumC1560nM5286j.equals(EnumC1560n.TraceMetric)) {
/* 299 */                   m5292q(enumC1414d.getReason(), enumC1560nM5286j.getCategory(), 1L);
/* 302 */                   m5289n();
/* 319 */                   return;
                        }
/* 222 */               C1673t5 c1673t5M4724h = c1160a5.m4724h(c1554m6.getSerializer());
/* 226 */               if (c1673t5M4724h == null) {
/* 287 */                   c1554m6.getLogger().mo4672k(EnumC1553m5.ERROR, "Unable to parse lost metrics envelope item.", new Object[0]);
/* 319 */                   return;
                        }
/* 247 */               m5292q(enumC1414d.getReason(), enumC1560nM5286j.getCategory(), Long.valueOf(c1673t5M4724h.f11672a.size()));
/* 270 */               m5292q(enumC1414d.getReason(), EnumC1560n.TraceMetricByte.getCategory(), Long.valueOf(c1160a5.m4722f().length));
/* 273 */               m5289n();
                    } catch (Throwable th) {
/* 316 */               c1554m6.getLogger().mo4670b(EnumC1553m5.ERROR, th, "Unable to record lost envelope item.", new Object[0]);
                    }
                }

                @Override // io.sentry.clientreport.InterfaceC1416f
                /* JADX INFO: renamed from: h */
                public C1505c mo5162h(C1505c c1505c) {
/* 3 */             C1554m6 c1554m6 = (C1554m6) this.f11043c;
/* 7 */             Date date = new Date();
/* 12 */            C1666s6 c1666s6 = (C1666s6) this.f11042b;
/* 14 */            c1666s6.getClass();
/* 19 */            ArrayList arrayList = new ArrayList();
/* 44 */            for (Map.Entry entry : ((Map) ((C1708g) c1666s6.f11662b).m5471a()).entrySet()) {
/* 60 */                long andSet = ((AtomicLong) entry.getValue()).getAndSet(0L);
/* 64 */                Long lValueOf = Long.valueOf(andSet);
/* 70 */                if (andSet > 0) {
/* 93 */                    arrayList.add(new C1415e(((C1413c) entry.getKey()).f10838a, ((C1413c) entry.getKey()).f10839b, lValueOf));
                        }
                    }
/* 107 */           C1412b c1412b = arrayList.isEmpty() ? null : new C1412b(date, arrayList);
/* 110 */           if (c1412b == null) {
/* 112 */               return c1505c;
                    }
                    try {
/* 124 */               c1554m6.getLogger().mo4672k(EnumC1553m5.DEBUG, "Attaching client report to envelope.", new Object[0]);
/* 129 */               ArrayList arrayList2 = new ArrayList();
/* 136 */               Iterator it = ((Iterable) c1505c.f11043c).iterator();
/* 144 */               while (it.hasNext()) {
/* 152 */                   arrayList2.add((C1160a5) it.next());
                        }
/* 166 */               arrayList2.add(C1160a5.m4717b(c1554m6.getSerializer(), c1412b));
/* 175 */               return new C1505c((C1726v4) c1505c.f11042b, arrayList2);
                    } catch (Throwable th) {
/* 189 */               c1554m6.getLogger().mo4670b(EnumC1553m5.ERROR, th, "Unable to attach client report to envelope.", new Object[0]);
/* 192 */               return c1505c;
                    }
                }

                /* JADX INFO: renamed from: i */
                public C1505c m5287i() throws IOException {
/* 3 */             C1732c c1732c = (C1732c) this.f11042b;
/* 5 */             c1732c.m5517l();
/* 8 */             c1732c.m5511c();
/* 11 */            int i = c1732c.f11786c;
/* 13 */            int[] iArr = c1732c.f11785b;
/* 16 */            if (i == iArr.length) {
/* 24 */                c1732c.f11785b = Arrays.copyOf(iArr, i * 2);
                    }
/* 26 */            int[] iArr2 = c1732c.f11785b;
/* 28 */            int i2 = c1732c.f11786c;
/* 32 */            c1732c.f11786c = i2 + 1;
/* 35 */            iArr2[i2] = 3;
/* 41 */            c1732c.f11784a.write(123);
/* 44 */            return this;
                }

                @Override // io.sentry.ILogger
                /* JADX INFO: renamed from: k */
                public void mo4672k(EnumC1553m5 enumC1553m5, String str, Object... objArr) {
/* 3 */             ILogger iLogger = (ILogger) this.f11042b;
/* 5 */             if (iLogger == null || !mo4673m(enumC1553m5)) {
/* 16 */                return;
                    }
/* 13 */            iLogger.mo4672k(enumC1553m5, str, objArr);
                }

                /* JADX INFO: renamed from: l */
                public C1505c m5288l() {
/* 9 */             ((C1732c) this.f11042b).m5512f(3, 5, '}');
/* 12 */            return this;
                }

                @Override // io.sentry.ILogger
                /* JADX INFO: renamed from: m */
                public boolean mo4673m(EnumC1553m5 enumC1553m5) {
/* 3 */             C1554m6 c1554m6 = (C1554m6) this.f11043c;
                    return enumC1553m5 != null && c1554m6.isDebug() && enumC1553m5.ordinal() >= c1554m6.getDiagnosticLevel().ordinal();
                }

                /* JADX INFO: renamed from: n */
                public void m5289n() {
/* 5 */             ((C1554m6) this.f11043c).getOnDiscard();
                }

                /* JADX INFO: renamed from: o */
                public byte[] m5290o() {
/* 5 */             if (((byte[]) this.f11042b) == null) {
/* 17 */                this.f11042b = (byte[]) ((Callable) this.f11043c).call();
                    }
/* 21 */            byte[] bArr = (byte[]) this.f11042b;
                    return bArr != null ? bArr : new byte[0];
                }

                /* JADX INFO: renamed from: p */
                public C1505c m5291p(String str) {
/* 3 */             C1732c c1732c = (C1732c) this.f11042b;
/* 6 */             if (str == null) {
/* 29 */                c1732c.getClass();
/* 34 */                C1951n4.m6868s("name == null");
/* 5 */                 return null;
                    }
/* 10 */            if (c1732c.f11790i != null) {
/* 25 */                f42.m3664t();
/* 5 */                 return null;
                    }
/* 14 */            if (c1732c.f11786c != 0) {
/* 16 */                c1732c.f11790i = str;
/* 18 */                return this;
                    }
/* 21 */            f42.m3656l("JsonWriter is closed.");
/* 5 */             return null;
                }

                /* JADX INFO: renamed from: q */
                public void m5292q(String str, String str2, Long l) {
/* 24 */            AtomicLong atomicLong = (AtomicLong) ((Map) ((C1708g) ((C1666s6) this.f11042b).f11662b).m5471a()).get(new C1413c(str, str2));
/* 26 */            if (atomicLong != null) {
/* 32 */                atomicLong.addAndGet(l.longValue());
                    }
                }

                /* JADX INFO: renamed from: r */
                public void m5293r(C1412b c1412b) {
/* 1 */             if (c1412b == null) {
/* 32 */                return;
                    }
/* 14 */            for (C1415e c1415e : c1412b.f10836b) {
/* 28 */                m5292q(c1415e.f10840a, c1415e.f10841b, c1415e.f10842c);
                    }
                }

                /* JADX INFO: renamed from: s */
                public void m5294s(String str) {
/* 3 */             C1732c c1732c = (C1732c) this.f11042b;
/* 5 */             c1732c.getClass();
/* 8 */             if (str == null || str.length() == 0) {
/* 25 */                c1732c.f11787d = null;
/* 29 */                c1732c.f11788e = ":";
                    } else {
/* 17 */                c1732c.f11787d = str;
/* 21 */                c1732c.f11788e = ": ";
                    }
                }

                /* JADX INFO: renamed from: t */
                public C1505c m5295t(double d) throws IOException {
/* 3 */             C1732c c1732c = (C1732c) this.f11042b;
/* 5 */             c1732c.m5517l();
/* 10 */            if (!c1732c.f11789f && (Double.isNaN(d) || Double.isInfinite(d))) {
/* 27 */                f42.m3657m("Numeric values must be finite, but was ", d);
/* 30 */                return null;
                    }
/* 32 */            c1732c.m5511c();
/* 41 */            c1732c.f11784a.append((CharSequence) Double.toString(d));
/* 44 */            return this;
                }

                /* JADX INFO: renamed from: u */
                public C1505c m5296u(long j) {
/* 3 */             C1732c c1732c = (C1732c) this.f11042b;
/* 5 */             c1732c.m5517l();
/* 8 */             c1732c.m5511c();
/* 17 */            c1732c.f11784a.write(Long.toString(j));
/* 20 */            return this;
                }

                /* JADX INFO: renamed from: v */
                public C1505c m5297v(ILogger iLogger, Object obj) {
/* 5 */             ((C1954n7) this.f11043c).m6905k(this, iLogger, obj);
/* 8 */             return this;
                }

                /* JADX INFO: renamed from: w */
                public C1505c m5298w(Boolean bool) throws IOException {
/* 3 */             C1732c c1732c = (C1732c) this.f11042b;
/* 5 */             if (bool == null) {
/* 7 */                 c1732c.m5514h();
/* 10 */                return this;
                    }
/* 11 */            c1732c.m5517l();
/* 14 */            c1732c.m5511c();
/* 30 */            c1732c.f11784a.write(bool.booleanValue() ? "true" : "false");
/* 33 */            return this;
                }

                /* JADX INFO: renamed from: x */
                public C1505c m5299x(Number number) throws IOException {
/* 3 */             C1732c c1732c = (C1732c) this.f11042b;
/* 5 */             if (number == null) {
/* 7 */                 c1732c.m5514h();
/* 10 */                return this;
                    }
/* 11 */            c1732c.m5517l();
/* 14 */            String string = number.toString();
/* 20 */            if (!c1732c.f11789f && (string.equals("-Infinity") || string.equals("Infinity") || string.equals("NaN"))) {
/* 49 */                s80.m8430k(number, "Numeric values must be finite, but was ");
/* 52 */                return null;
                    }
/* 54 */            c1732c.m5511c();
/* 59 */            c1732c.f11784a.append((CharSequence) string);
/* 62 */            return this;
                }

                /* JADX INFO: renamed from: y */
                public C1505c m5300y(String str) {
/* 3 */             C1732c c1732c = (C1732c) this.f11042b;
/* 5 */             if (str == null) {
/* 7 */                 c1732c.m5514h();
/* 10 */                return this;
                    }
/* 11 */            c1732c.m5517l();
/* 14 */            c1732c.m5511c();
/* 17 */            c1732c.m5516k(str);
/* 20 */            return this;
                }

                /* JADX INFO: renamed from: z */
                public C1505c m5301z(boolean z) throws IOException {
/* 3 */             C1732c c1732c = (C1732c) this.f11042b;
/* 5 */             c1732c.m5517l();
/* 8 */             c1732c.m5511c();
/* 20 */            c1732c.f11784a.write(z ? "true" : "false");
/* 23 */            return this;
                }

/* 33 */        public C1505c(Writer writer, int i) {
                    this.f11041a = 2;
/* 35 */            this.f11042b = new C1732c(writer);
/* 36 */            this.f11043c = new C1954n7(i, 9);
                }

/* 36 */        public /* synthetic */ C1505c(int i, Object obj, Object obj2) {
/* 37 */            this.f11041a = i;
                    this.f11043c = obj;
                    this.f11042b = obj2;
                }

/* 37 */        public C1505c(ILogger iLogger) {
                    this.f11041a = 0;
/* 38 */            ClassLoader classLoader = C1505c.class.getClassLoader();
/* 40 */            this.f11042b = iLogger;
/* 41 */            this.f11043c = AbstractC1704c.m5449d(classLoader);
                }

/* 41 */        public C1505c(Context context, ILogger iLogger) {
                    this.f11041a = 8;
/* 43 */            Context applicationContext = context.getApplicationContext();
/* 44 */            this.f11043c = applicationContext != null ? applicationContext : context;
/* 45 */            this.f11042b = iLogger;
                }

/* 45 */        public C1505c(Method method, Method method2) {
                    this.f11041a = 9;
                    this.f11042b = method;
                    this.f11043c = method2;
                }

/* 46 */        public C1505c(C1554m6 c1554m6) {
                    this.f11041a = 10;
/* 48 */            this.f11043c = c1554m6;
/* 49 */            this.f11042b = new C1666s6(7);
                }

/* 49 */        public C1505c(C1726v4 c1726v4, List list) {
                    this.f11041a = 6;
/* 51 */            AbstractC1704c.m5462q(c1726v4, "SentryEnvelopeHeader is required.");
                    this.f11042b = c1726v4;
/* 52 */            AbstractC1704c.m5462q(list, "SentryEnvelope items are required.");
                    this.f11043c = list;
                }

/* 52 */        public C1505c(C1522j7 c1522j7, Double d) {
                    this.f11041a = 4;
/* 54 */            this.f11042b = c1522j7;
/* 55 */            this.f11043c = d;
/* 56 */            Map map = Collections.EMPTY_MAP;
                }

/* 56 */        public C1505c(C1626w c1626w, C1624u c1624u, C1160a5 c1160a5) {
                    this.f11041a = 6;
/* 60 */            this.f11042b = new C1726v4(c1626w, c1624u, null);
/* 61 */            ArrayList arrayList = new ArrayList(1);
/* 62 */            arrayList.add(c1160a5);
/* 63 */            this.f11043c = arrayList;
                }

/* 63 */        public C1505c(Callable callable) {
                    this.f11041a = 7;
/* 65 */            this.f11043c = callable;
                }
            }
