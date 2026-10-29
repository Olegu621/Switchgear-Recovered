            package io.sentry;

            import io.sentry.protocol.C1597e;
            import io.sentry.protocol.C1600f0;
            import io.sentry.protocol.C1626w;
            import io.sentry.protocol.EnumC1606i0;
            import io.sentry.util.AbstractC1704c;
            import io.sentry.util.AbstractC1715n;
            import io.sentry.util.AbstractC1716o;
            import io.sentry.util.C1702a;
            import io.sentry.util.thread.InterfaceC1718a;
            import java.io.IOException;
            import java.net.URLEncoder;
            import java.nio.charset.Charset;
            import java.util.Collections;
            import java.util.Iterator;
            import java.util.List;
            import java.util.ListIterator;
            import java.util.Timer;
            import java.util.TreeSet;
            import java.util.concurrent.ConcurrentHashMap;
            import java.util.concurrent.CopyOnWriteArrayList;
            import java.util.concurrent.atomic.AtomicBoolean;
            import java.util.concurrent.atomic.AtomicReference;
            import okhttp3.HttpUrl;
            import okio.Segment;
            import p000.C2080pr;
            import p000.C2357x6;
            
            /* JADX INFO: renamed from: io.sentry.x6 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1748x6 implements InterfaceC1549m1 {

                /* JADX INFO: renamed from: b */
                public final C1162a7 f11819b;

                /* JADX INFO: renamed from: d */
                public final C1460g4 f11821d;

                /* JADX INFO: renamed from: e */
                public final String f11822e;

                /* JADX INFO: renamed from: g */
                public volatile C1728v6 f11824g;

                /* JADX INFO: renamed from: h */
                public volatile C1728v6 f11825h;

                /* JADX INFO: renamed from: i */
                public volatile Timer f11826i;

                /* JADX INFO: renamed from: j */
                public final C1702a f11827j;

                /* JADX INFO: renamed from: k */
                public final C1702a f11828k;

                /* JADX INFO: renamed from: l */
                public final AtomicBoolean f11829l;

                /* JADX INFO: renamed from: m */
                public final AtomicBoolean f11830m;

                /* JADX INFO: renamed from: n */
                public final EnumC1606i0 f11831n;

                /* JADX INFO: renamed from: o */
                public final EnumC1640r1 f11832o;

                /* JADX INFO: renamed from: p */
                public final C1597e f11833p;

                /* JADX INFO: renamed from: q */
                public final InterfaceC1547m f11834q;

                /* JADX INFO: renamed from: r */
                public final C1531k7 f11835r;

                /* JADX INFO: renamed from: a */
                public final C1626w f11818a = new C1626w();

                /* JADX INFO: renamed from: c */
                public final CopyOnWriteArrayList f11820c = new CopyOnWriteArrayList();

                /* JADX INFO: renamed from: f */
                public C1740w6 f11823f = C1740w6.f11805c;

                public C1748x6(C1522j7 c1522j7, C1460g4 c1460g4, C1531k7 c1531k7, InterfaceC1547m interfaceC1547m) {
/* 23 */            this.f11826i = null;
/* 27 */            C1702a c1702a = new C1702a();
/* 30 */            this.f11827j = c1702a;
/* 37 */            this.f11828k = new C1702a();
/* 45 */            this.f11829l = new AtomicBoolean(false);
/* 49 */            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
/* 52 */            this.f11830m = atomicBoolean;
/* 56 */            C1597e c1597e = new C1597e();
/* 59 */            this.f11833p = c1597e;
/* 63 */            C1162a7 c1162a7 = new C1162a7(c1522j7, this, c1460g4, c1531k7);
/* 66 */            this.f11819b = c1162a7;
/* 70 */            this.f11822e = c1522j7.f11073a0;
/* 74 */            this.f11832o = c1522j7.f10751W;
/* 76 */            this.f11821d = c1460g4;
/* 78 */            Boolean bool = Boolean.TRUE;
/* 88 */            interfaceC1547m = bool.equals(m5520C()) ? interfaceC1547m : null;
/* 92 */            this.f11834q = interfaceC1547m;
/* 96 */            this.f11831n = c1522j7.f11074b0;
/* 98 */            this.f11835r = c1531k7;
/* 100 */           m5521D(c1162a7);
/* 103 */           C1626w c1626wM5519B = m5519B();
/* 113 */           if (!c1626wM5519B.equals(C1626w.f11478b) && bool.equals(m5520C())) {
/* 132 */               c1597e.mo5315k(new C1581p3(c1626wM5519B), "profile");
                    }
/* 135 */           if (interfaceC1547m != null) {
/* 137 */               interfaceC1547m.mo5353e(this);
                    }
/* 142 */           if (c1531k7.f11096g == null && c1531k7.f11097h == null) {
/* 149 */               return;
                    }
/* 152 */           boolean z = true;
/* 156 */           this.f11826i = new Timer(true);
/* 158 */           Long l = c1531k7.f11097h;
/* 160 */           if (l != null) {
/* 162 */               c1702a.m5443c();
                        try {
/* 167 */                   if (this.f11826i != null) {
/* 169 */                       m5523x();
/* 172 */                       atomicBoolean.set(true);
/* 180 */                       this.f11825h = new C1728v6(this, 1);
                                try {
/* 190 */                           this.f11826i.schedule(this.f11825h, l.longValue());
                                } catch (Throwable th) {
/* 209 */                           this.f11821d.mo5092l().getLogger().mo4671d(EnumC1553m5.WARNING, "Failed to schedule finish timer", th);
/* 212 */                           EnumC1451f7 status = getStatus();
/* 216 */                           if (status == null) {
/* 219 */                               status = EnumC1451f7.DEADLINE_EXCEEDED;
                                    }
/* 225 */                           if (this.f11835r.f11096g == null) {
/* 228 */                               z = false;
                                    }
/* 229 */                           mo5246e(status, z, null);
/* 234 */                           this.f11830m.set(false);
                                }
                            }
/* 240 */                   c1702a.close();
                        } catch (Throwable th2) {
                            try {
/* 244 */                       c1702a.close();
                            } catch (Throwable th3) {
/* 249 */                       th2.addSuppressed(th3);
                            }
/* 252 */                   throw th2;
                        }
                    }
/* 253 */           mo5251q();
                }

                /* JADX WARN: Code duplicated, block: B:33:0x00b4  */
                /* JADX INFO: renamed from: A */
                public final void m5518A(EnumC1451f7 enumC1451f7, AbstractC1672t4 abstractC1672t4, boolean z, C1486i0 c1486i0) {
                    C1642r3 c1642r3Mo4951f;
/* 3 */             AbstractC1672t4 abstractC1672t5 = this.f11819b.f9803b;
/* 5 */             if (abstractC1672t4 == null) {
/* 8 */                 abstractC1672t4 = abstractC1672t5;
                    }
/* 9 */             if (abstractC1672t4 == null) {
/* 21 */                abstractC1672t4 = this.f11821d.mo5092l().getDateProvider().mo4856a();
                    }
/* 27 */            Iterator it = this.f11820c.iterator();
/* 35 */            while (it.hasNext()) {
/* 45 */                ((C1162a7) it.next()).f9810i.getClass();
                    }
/* 55 */            this.f11823f = new C1740w6(true, enumC1451f7);
/* 61 */            if (this.f11819b.f9808g) {
/* 365 */               return;
                    }
/* 67 */            if (this.f11835r.f11095f) {
/* 71 */                ListIterator listIterator = this.f11820c.listIterator();
/* 79 */                while (listIterator.hasNext()) {
/* 85 */                    C1162a7 c1162a7 = (C1162a7) listIterator.next();
/* 89 */                    if (!c1162a7.f9808g && c1162a7.f9803b == null) {
/* 95 */                        return;
                            }
                        }
                    }
/* 98 */            AtomicReference atomicReference = new AtomicReference();
/* 101 */           C1162a7 c1162a8 = this.f11819b;
/* 112 */           c1162a8.f9811j = new C2080pr(8, this, c1162a8.f9811j, atomicReference);
/* 118 */           c1162a8.mo4740v(this.f11823f.f11807b, abstractC1672t4);
/* 121 */           Boolean bool = Boolean.TRUE;
/* 132 */           if (bool.equals(m5520C())) {
/* 138 */               C1671t3 c1671t3 = this.f11819b.f9804c.f10758d;
/* 152 */               if (bool.equals(c1671t3 == null ? null : (Boolean) c1671t3.f11670d)) {
/* 176 */                   c1642r3Mo4951f = this.f11821d.mo5092l().getTransactionProfiler().mo4951f(this, (List) atomicReference.get(), this.f11821d.mo5092l());
                        } else {
/* 181 */                   c1642r3Mo4951f = null;
                        }
                    } else {
/* 181 */               c1642r3Mo4951f = null;
                    }
/* 192 */           if (this.f11821d.mo5092l().isContinuousProfilingEnabled()) {
/* 200 */               EnumC1634q3 profileLifecycle = this.f11821d.mo5092l().getProfileLifecycle();
/* 204 */               EnumC1634q3 enumC1634q3 = EnumC1634q3.TRACE;
/* 206 */               if (profileLifecycle == enumC1634q3 && this.f11819b.f9804c.f10754Z.equals(C1626w.f11478b)) {
/* 232 */                   this.f11821d.mo5092l().getContinuousProfiler().mo4794b(enumC1634q3);
                        }
                    }
/* 239 */           if (atomicReference.get() != null) {
/* 247 */               ((List) atomicReference.get()).clear();
                    }
/* 257 */           this.f11821d.mo5098r(new C1701u6(this));
/* 262 */           C1600f0 c1600f0 = new C1600f0(this);
/* 267 */           if (this.f11826i != null) {
/* 269 */               C1702a c1702a = this.f11827j;
/* 271 */               c1702a.m5443c();
                        try {
/* 276 */                   if (this.f11826i != null) {
/* 278 */                       m5524y();
/* 281 */                       m5523x();
/* 286 */                       this.f11826i.cancel();
/* 289 */                       this.f11826i = null;
                            }
/* 294 */                   c1702a.close();
                        } catch (Throwable th) {
                            try {
/* 298 */                       c1702a.close();
                            } catch (Throwable th2) {
/* 303 */                       th.addSuppressed(th2);
                            }
/* 306 */                   throw th;
                        }
                    }
/* 307 */           if (z && this.f11820c.isEmpty() && this.f11835r.f11096g != null) {
/* 343 */               this.f11821d.mo5092l().getLogger().mo4672k(EnumC1553m5.DEBUG, "Dropping idle transaction %s because it has no child spans", this.f11822e);
                    } else {
/* 353 */               c1600f0.f11314e0.putAll(this.f11819b.f9813l);
/* 362 */               this.f11821d.mo5105y(c1600f0, mo5245a(), c1486i0, c1642r3Mo4951f);
                    }
                }

                /* JADX INFO: renamed from: B */
                public final C1626w m5519B() {
/* 1 */             C1162a7 c1162a7 = this.f11819b;
                    return !c1162a7.f9804c.f10754Z.equals(C1626w.f11478b) ? c1162a7.f9804c.f10754Z : this.f11821d.mo5092l().getContinuousProfiler().mo4797e();
                }

                /* JADX INFO: renamed from: C */
                public final Boolean m5520C() {
/* 5 */             C1671t3 c1671t3 = this.f11819b.f9804c.f10758d;
/* 7 */             if (c1671t3 == null) {
/* 9 */                 return null;
                    }
/* 13 */            return (Boolean) c1671t3.f11667a;
                }

                /* JADX INFO: renamed from: D */
                public final void m5521D(C1162a7 c1162a7) {
/* 7 */             InterfaceC1718a threadChecker = this.f11821d.mo5092l().getThreadChecker();
/* 11 */            C1626w c1626wM5519B = m5519B();
/* 21 */            if (!c1626wM5519B.equals(C1626w.f11478b)) {
/* 23 */                Boolean bool = Boolean.TRUE;
/* 27 */                C1671t3 c1671t3 = c1162a7.f9804c.f10758d;
/* 41 */                if (bool.equals(c1671t3 == null ? null : (Boolean) c1671t3.f11667a)) {
/* 49 */                    c1162a7.mo4732j(c1626wM5519B.m5380a(), "profiler_id");
                        }
                    }
/* 62 */            c1162a7.mo4732j(String.valueOf(threadChecker.mo4841b()), "thread.id");
/* 71 */            c1162a7.mo4732j(threadChecker.mo4840a(), "thread.name");
                }

                /* JADX INFO: renamed from: E */
                public final void m5522E(C1387c c1387c) {
/* 1 */             C1162a7 c1162a7 = this.f11819b;
/* 3 */             C1460g4 c1460g4 = this.f11821d;
/* 5 */             C1702a c1702a = this.f11828k;
/* 7 */             c1702a.m5443c();
                    try {
/* 12 */                if (c1387c.f10776f) {
/* 16 */                    AtomicReference atomicReference = new AtomicReference();
/* 26 */                    c1460g4.mo5098r(new C2357x6(atomicReference, 24));
/* 53 */                    c1387c.m5077e(c1162a7.f9804c.f10755a, (C1626w) atomicReference.get(), c1460g4.mo5092l(), c1162a7.f9804c.f10758d, this.f11822e, this.f11831n);
/* 57 */                    c1387c.f10776f = false;
                        }
/* 63 */                c1702a.close();
                    } catch (Throwable th) {
                        try {
/* 67 */                    c1702a.close();
/* 76 */                    throw th;
                        } catch (Throwable th2) {
/* 73 */                    th.addSuppressed(th2);
/* 76 */                    throw th;
                        }
                    }
                }

                @Override // io.sentry.InterfaceC1525k1
                /* JADX INFO: renamed from: a */
                public final C1472h7 mo5245a() {
                    C1387c c1387c;
/* 11 */            if (!this.f11821d.mo5092l().isTraceSampling() || (c1387c = this.f11819b.f9804c.f10752X) == null) {
/* 29 */                return null;
                    }
/* 21 */            m5522E(c1387c);
/* 24 */            return c1387c.m5078f();
                }

                @Override // io.sentry.InterfaceC1525k1
                /* JADX INFO: renamed from: b */
                public final C1674t6 mo4726b() {
/* 3 */             return this.f11819b.mo4726b();
                }

                @Override // io.sentry.InterfaceC1525k1
                /* JADX INFO: renamed from: c */
                public final InterfaceC1525k1 mo4727c(String str, AbstractC1672t4 abstractC1672t4, EnumC1640r1 enumC1640r1) {
/* 12 */            return mo4733n("activity.load", str, abstractC1672t4, enumC1640r1, new C1439e7());
                }

                @Override // io.sentry.InterfaceC1525k1
                /* JADX INFO: renamed from: d */
                public final boolean mo4728d() {
/* 3 */             return this.f11819b.f9808g;
                }

                @Override // io.sentry.InterfaceC1549m1
                /* JADX INFO: renamed from: e */
                public final void mo5246e(EnumC1451f7 enumC1451f7, boolean z, C1486i0 c1486i0) {
/* 5 */             if (this.f11819b.f9808g) {
/* 7 */                 return;
                    }
/* 18 */            AbstractC1672t4 abstractC1672t4Mo4856a = this.f11821d.mo5092l().getDateProvider().mo4856a();
/* 26 */            CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList(this.f11820c);
/* 33 */            ListIterator listIterator = copyOnWriteArrayList.listIterator(copyOnWriteArrayList.size());
/* 41 */            while (listIterator.hasPrevious()) {
/* 47 */                C1162a7 c1162a7 = (C1162a7) listIterator.previous();
/* 50 */                c1162a7.f9811j = null;
/* 52 */                c1162a7.mo4740v(enumC1451f7, abstractC1672t4Mo4856a);
                    }
/* 56 */            m5518A(enumC1451f7, abstractC1672t4Mo4856a, z, c1486i0);
                }

                @Override // io.sentry.InterfaceC1525k1
                /* JADX INFO: renamed from: f */
                public final void mo4729f(EnumC1451f7 enumC1451f7) {
/* 2 */             mo4740v(enumC1451f7, null);
                }

                @Override // io.sentry.InterfaceC1549m1
                /* JADX INFO: renamed from: g */
                public final C1626w mo5247g() {
/* 1 */             return this.f11818a;
                }

                @Override // io.sentry.InterfaceC1525k1
                public final String getDescription() {
/* 5 */             return this.f11819b.f9804c.f10760f;
                }

                @Override // io.sentry.InterfaceC1549m1
                public final String getName() {
/* 1 */             return this.f11822e;
                }

                @Override // io.sentry.InterfaceC1525k1
                public final EnumC1451f7 getStatus() {
/* 5 */             return this.f11819b.f9804c.f10761i;
                }

                @Override // io.sentry.InterfaceC1525k1
                /* JADX INFO: renamed from: h */
                public final void mo4730h(IOException iOException) {
/* 1 */             C1162a7 c1162a7 = this.f11819b;
/* 5 */             if (c1162a7.f9808g) {
/* 24 */                this.f11821d.mo5092l().getLogger().mo4672k(EnumC1553m5.DEBUG, "The transaction is already finished. Throwable cannot be set", new Object[0]);
                    } else {
/* 28 */                c1162a7.f9806e = iOException;
                    }
                }

                @Override // io.sentry.InterfaceC1525k1
                /* JADX INFO: renamed from: i */
                public final void mo4731i() {
/* 6 */             mo4740v(getStatus(), null);
                }

                @Override // io.sentry.InterfaceC1525k1
                /* JADX INFO: renamed from: j */
                public final void mo4732j(Object obj, String str) {
/* 1 */             C1162a7 c1162a7 = this.f11819b;
/* 5 */             if (c1162a7.f9808g) {
/* 25 */                this.f11821d.mo5092l().getLogger().mo4672k(EnumC1553m5.DEBUG, "The transaction is already finished. Data %s cannot be set", str);
                    } else {
/* 29 */                c1162a7.mo4732j(obj, str);
                    }
                }

                @Override // io.sentry.InterfaceC1525k1
                /* JADX INFO: renamed from: k */
                public final C1422d mo5248k() {
                    C1387c c1387c;
                    String str;
                    String str2;
                    C1387c c1387c2;
/* 3 */             String str3 = "%20";
/* 19 */            C1422d c1422d = null;
/* 20 */            if (!this.f11821d.mo5092l().isTraceSampling() || (c1387c = this.f11819b.f9804c.f10752X) == null) {
/* 19 */                return null;
                    }
/* 30 */            ILogger iLogger = c1387c.f10778h;
/* 32 */            m5522E(c1387c);
/* 40 */            String str4 = C1387c.m5073a(iLogger, null, true).f10775e;
/* 42 */            ConcurrentHashMap concurrentHashMap = c1387c.f10771a;
/* 46 */            StringBuilder sb = new StringBuilder();
/* 51 */            int i = 0;
/* 52 */            if (str4 == null || str4.isEmpty()) {
/* 89 */                str = HttpUrl.FRAGMENT_ENCODE_SET;
                    } else {
/* 60 */                sb.append(str4);
/* 63 */                Charset charset = AbstractC1716o.f11743a;
/* 65 */                int i2 = 0;
/* 70 */                while (i < str4.length()) {
/* 78 */                    if (str4.charAt(i) == ',') {
/* 80 */                        i2++;
                            }
/* 82 */                    i++;
                        }
/* 85 */                i = i2 + 1;
/* 49 */                str = ",";
                    }
/* 91 */            C1702a c1702a = c1387c.f10772b;
/* 93 */            c1702a.m5443c();
                    try {
/* 106 */               TreeSet<String> treeSet = new TreeSet(Collections.list(concurrentHashMap.keys()));
/* 109 */               c1702a.close();
/* 114 */               treeSet.add("sentry-sample_rate");
/* 119 */               treeSet.add("sentry-sample_rand");
/* 126 */               int i3 = i;
/* 127 */               String str5 = str;
/* 132 */               for (String str6 : treeSet) {
/* 153 */                   C1422d c1422d2 = c1422d;
/* 174 */                   String strM5074c = "sentry-sample_rate".equals(str6) ? C1387c.m5074c(c1387c.f10773c) : "sentry-sample_rand".equals(str6) ? C1387c.m5074c(c1387c.f10774d) : (String) concurrentHashMap.get(str6);
/* 177 */                   if (strM5074c == null) {
/* 198 */                       str2 = str3;
/* 200 */                       c1387c2 = c1387c;
                            } else if (i3 >= 64) {
/* 195 */                       iLogger.mo4672k(EnumC1553m5.ERROR, "Not adding baggage value %s as the total number of list members would exceed the maximum of %s.", str6, 64);
/* 198 */                       str2 = str3;
/* 200 */                       c1387c2 = c1387c;
                            } else {
                                try {
/* 211 */                           c1387c2 = c1387c;
                                    try {
/* 221 */                               str2 = str3;
                                        try {
/* 242 */                                   String str7 = str5 + URLEncoder.encode(str6, "UTF-8").replaceAll("\\+", str3) + "=" + URLEncoder.encode(strM5074c, "UTF-8").replaceAll("\\+", str3);
/* 257 */                                   if (sb.length() + str7.length() > 8192) {
/* 271 */                                       iLogger.mo4672k(EnumC1553m5.ERROR, "Not adding baggage value %s as the total header value length would exceed the maximum of %s.", str6, Integer.valueOf(Segment.SIZE));
                                            } else {
/* 277 */                                       i3++;
/* 279 */                                       sb.append(str7);
/* 49 */                                        str5 = ",";
                                            }
                                        } catch (Throwable th) {
/* 275 */                                   th = th;
/* 301 */                                   iLogger.mo4670b(EnumC1553m5.ERROR, th, "Unable to encode baggage key value pair (key=%s,value=%s).", str6, strM5074c);
                                        }
                                    } catch (Throwable th2) {
/* 284 */                               th = th2;
/* 285 */                               str2 = str3;
                                    }
                                } catch (Throwable th3) {
/* 288 */                           th = th3;
/* 289 */                           str2 = str3;
/* 291 */                           c1387c2 = c1387c;
                                }
                            }
/* 304 */                   c1422d = c1422d2;
/* 306 */                   c1387c = c1387c2;
/* 308 */                   str3 = str2;
                        }
/* 312 */               C1422d c1422d3 = c1422d;
/* 314 */               String string = sb.toString();
/* 322 */               if (string.isEmpty()) {
/* 324 */                   return c1422d3;
                        }
/* 329 */               C1422d c1422d4 = new C1422d();
/* 332 */               c1422d4.f10847a = string;
/* 334 */               return c1422d4;
                    } catch (Throwable th4) {
                        try {
/* 337 */                   c1702a.close();
/* 345 */                   throw th4;
                        } catch (Throwable th5) {
/* 342 */                   th4.addSuppressed(th5);
/* 345 */                   throw th4;
                        }
                    }
                }

                @Override // io.sentry.InterfaceC1525k1
                /* JADX INFO: renamed from: l */
                public final void mo5249l() {
/* 1 */             C1460g4 c1460g4 = this.f11821d;
/* 7 */             if (!c1460g4.isEnabled()) {
/* 24 */                c1460g4.mo5092l().getLogger().mo4672k(EnumC1553m5.WARNING, "Instance is disabled and this 'configureScope' call is a no-op.", new Object[0]);
/* 55 */                return;
                    }
                    try {
/* 35 */                c1460g4.f10957e.m5341Q(null).mo4685I(this);
                    } catch (Throwable th) {
/* 52 */                c1460g4.mo5092l().getLogger().mo4671d(EnumC1553m5.ERROR, "Error in the 'configureScope' callback.", th);
                    }
                }

                @Override // io.sentry.InterfaceC1549m1
                /* JADX INFO: renamed from: m */
                public final InterfaceC1525k1 mo5250m() {
/* 5 */             CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList(this.f11820c);
/* 12 */            ListIterator listIterator = copyOnWriteArrayList.listIterator(copyOnWriteArrayList.size());
/* 20 */            while (listIterator.hasPrevious()) {
/* 26 */                C1162a7 c1162a7 = (C1162a7) listIterator.previous();
/* 30 */                if (!c1162a7.f9808g) {
/* 32 */                    return c1162a7;
                        }
                    }
/* 33 */            return null;
                }

                @Override // io.sentry.InterfaceC1525k1
                /* JADX INFO: renamed from: n */
                public final InterfaceC1525k1 mo4733n(String str, String str2, AbstractC1672t4 abstractC1672t4, EnumC1640r1 enumC1640r1, C1439e7 c1439e7) {
/* 3 */             boolean z = this.f11819b.f9808g;
/* 5 */             C1426d3 c1426d3 = C1426d3.f10849a;
/* 7 */             if (z || !this.f11832o.equals(enumC1640r1)) {
/* 18 */                return c1426d3;
                    }
/* 21 */            int size = this.f11820c.size();
/* 25 */            C1460g4 c1460g4 = this.f11821d;
/* 35 */            if (size < c1460g4.mo5092l().getMaxSpans()) {
/* 39 */                return this.f11819b.mo4733n(str, str2, abstractC1672t4, enumC1640r1, c1439e7);
                    }
/* 60 */            c1460g4.mo5092l().getLogger().mo4672k(EnumC1553m5.WARNING, "Span operation: %s, description: %s dropped due to limit reached. Returning NoOpSpan.", str, str2);
/* 63 */            return c1426d3;
                }

                @Override // io.sentry.InterfaceC1525k1
                /* JADX INFO: renamed from: o */
                public final void mo4734o(String str) {
/* 1 */             C1162a7 c1162a7 = this.f11819b;
/* 5 */             if (c1162a7.f9808g) {
/* 25 */                this.f11821d.mo5092l().getLogger().mo4672k(EnumC1553m5.DEBUG, "The transaction is already finished. Description %s cannot be set", str);
                    } else {
/* 31 */                c1162a7.f9804c.f10760f = str;
                    }
                }

                @Override // io.sentry.InterfaceC1525k1
                /* JADX INFO: renamed from: p */
                public final InterfaceC1525k1 mo4735p(String str) {
/* 12 */            return mo4733n(str, null, null, EnumC1640r1.SENTRY, new C1439e7());
                }

                @Override // io.sentry.InterfaceC1549m1
                /* JADX INFO: renamed from: q */
                public final void mo5251q() {
                    Long l;
/* 1 */             C1702a c1702a = this.f11827j;
/* 3 */             c1702a.m5443c();
                    try {
/* 8 */                 if (this.f11826i != null && (l = this.f11835r.f11096g) != null) {
/* 16 */                    m5524y();
/* 22 */                    this.f11829l.set(true);
/* 31 */                    this.f11824g = new C1728v6(this, 0);
                            try {
/* 41 */                        this.f11826i.schedule(this.f11824g, l.longValue());
                            } catch (Throwable th) {
/* 60 */                        this.f11821d.mo5092l().getLogger().mo4671d(EnumC1553m5.WARNING, "Failed to schedule finish timer", th);
/* 63 */                        EnumC1451f7 status = getStatus();
/* 67 */                        if (status == null) {
/* 70 */                            status = EnumC1451f7.OK;
                                }
/* 73 */                        mo4740v(status, null);
/* 78 */                        this.f11829l.set(false);
                            }
                        }
/* 84 */                c1702a.close();
                    } catch (Throwable th2) {
                        try {
/* 88 */                    c1702a.close();
                        } catch (Throwable th3) {
/* 93 */                    th2.addSuppressed(th3);
                        }
/* 96 */                throw th2;
                    }
                }

                @Override // io.sentry.InterfaceC1525k1
                /* JADX INFO: renamed from: r */
                public final void mo4736r(String str, Long l, EnumC1517j2 enumC1517j2) {
/* 3 */             this.f11819b.mo4736r(str, l, enumC1517j2);
                }

                @Override // io.sentry.InterfaceC1525k1
                /* JADX INFO: renamed from: s */
                public final C1383b7 mo4737s() {
/* 3 */             return this.f11819b.f9804c;
                }

                @Override // io.sentry.InterfaceC1525k1
                /* JADX INFO: renamed from: t */
                public final AbstractC1672t4 mo4738t() {
/* 3 */             return this.f11819b.f9803b;
                }

                @Override // io.sentry.InterfaceC1525k1
                /* JADX INFO: renamed from: u */
                public final void mo4739u(String str, Number number) {
/* 3 */             this.f11819b.mo4739u(str, number);
                }

                @Override // io.sentry.InterfaceC1525k1
                /* JADX INFO: renamed from: v */
                public final void mo4740v(EnumC1451f7 enumC1451f7, AbstractC1672t4 abstractC1672t4) {
/* 3 */             m5518A(enumC1451f7, abstractC1672t4, true, null);
                }

                @Override // io.sentry.InterfaceC1525k1
                /* JADX INFO: renamed from: w */
                public final AbstractC1672t4 mo4741w() {
/* 3 */             return this.f11819b.f9802a;
                }

                /* JADX INFO: renamed from: x */
                public final void m5523x() {
/* 1 */             C1702a c1702a = this.f11827j;
/* 3 */             c1702a.m5443c();
                    try {
/* 8 */                 if (this.f11825h != null) {
/* 12 */                    this.f11825h.cancel();
/* 18 */                    this.f11830m.set(false);
/* 22 */                    this.f11825h = null;
                        }
/* 27 */                c1702a.close();
                    } catch (Throwable th) {
                        try {
/* 31 */                    c1702a.close();
                        } catch (Throwable th2) {
/* 36 */                    th.addSuppressed(th2);
                        }
/* 39 */                throw th;
                    }
                }

                /* JADX INFO: renamed from: y */
                public final void m5524y() {
/* 1 */             C1702a c1702a = this.f11827j;
/* 3 */             c1702a.m5443c();
                    try {
/* 8 */                 if (this.f11824g != null) {
/* 12 */                    this.f11824g.cancel();
/* 18 */                    this.f11829l.set(false);
/* 22 */                    this.f11824g = null;
                        }
/* 27 */                c1702a.close();
                    } catch (Throwable th) {
                        try {
/* 31 */                    c1702a.close();
                        } catch (Throwable th2) {
/* 36 */                    th.addSuppressed(th2);
                        }
/* 39 */                throw th;
                    }
                }

                /* JADX INFO: renamed from: z */
                public final InterfaceC1525k1 m5525z(C1383b7 c1383b7, C1439e7 c1439e7) {
/* 3 */             boolean z = this.f11819b.f9808g;
/* 5 */             C1426d3 c1426d3 = C1426d3.f10849a;
/* 7 */             if (!z && this.f11832o.equals(c1383b7.f10751W)) {
/* 21 */                C1460g4 c1460g4 = this.f11821d;
/* 37 */                if (!AbstractC1715n.m5482a(c1439e7.f10919d, c1460g4.mo5092l().getIgnoredSpanOrigins())) {
/* 40 */                    C1430d7 c1430d7 = c1383b7.f10757c;
/* 42 */                    String str = c1383b7.f10759e;
/* 44 */                    String str2 = c1383b7.f10760f;
/* 46 */                    CopyOnWriteArrayList copyOnWriteArrayList = this.f11820c;
/* 60 */                    if (copyOnWriteArrayList.size() >= c1460g4.mo5092l().getMaxSpans()) {
/* 120 */                       c1460g4.mo5092l().getLogger().mo4672k(EnumC1553m5.WARNING, "Span operation: %s, description: %s dropped due to limit reached. Returning NoOpSpan.", str, str2);
/* 123 */                       return c1426d3;
                            }
/* 64 */                    AbstractC1704c.m5462q(c1430d7, "parentSpanId is required");
/* 69 */                    AbstractC1704c.m5462q(str, "operation is required");
/* 72 */                    m5524y();
/* 87 */                    C1162a7 c1162a7 = new C1162a7(this, this.f11821d, c1383b7, c1439e7, new C1701u6(this));
/* 90 */                    m5521D(c1162a7);
/* 93 */                    copyOnWriteArrayList.add(c1162a7);
/* 96 */                    InterfaceC1547m interfaceC1547m = this.f11834q;
/* 98 */                    if (interfaceC1547m != null) {
/* 100 */                       interfaceC1547m.mo5352d(c1162a7);
                            }
/* 103 */                   return c1162a7;
                        }
                    }
/* 39 */            return c1426d3;
                }
            }
