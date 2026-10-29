            package io.sentry;

            import androidx.core.app.NotificationCompat;
            import io.sentry.clientreport.C1411a;
            import io.sentry.clientreport.C1412b;
            import io.sentry.internal.debugmeta.C1505c;
            import io.sentry.profilemeasurements.C1585a;
            import io.sentry.profilemeasurements.C1586b;
            import io.sentry.protocol.C1589a;
            import io.sentry.protocol.C1590a0;
            import io.sentry.protocol.C1594c0;
            import io.sentry.protocol.C1595d;
            import io.sentry.protocol.C1596d0;
            import io.sentry.protocol.C1597e;
            import io.sentry.protocol.C1598e0;
            import io.sentry.protocol.C1599f;
            import io.sentry.protocol.C1600f0;
            import io.sentry.protocol.C1603h;
            import io.sentry.protocol.C1608j0;
            import io.sentry.protocol.C1609k;
            import io.sentry.protocol.C1610k0;
            import io.sentry.protocol.C1611l;
            import io.sentry.protocol.C1612l0;
            import io.sentry.protocol.C1613m;
            import io.sentry.protocol.C1614n;
            import io.sentry.protocol.C1615o;
            import io.sentry.protocol.C1616p;
            import io.sentry.protocol.C1620q;
            import io.sentry.protocol.C1621r;
            import io.sentry.protocol.C1623t;
            import io.sentry.protocol.C1624u;
            import io.sentry.protocol.C1625v;
            import io.sentry.protocol.C1627x;
            import io.sentry.protocol.C1628y;
            import io.sentry.protocol.C1629z;
            import io.sentry.protocol.DebugImage;
            import io.sentry.protocol.EnumC1592b0;
            import io.sentry.protocol.EnumC1601g;
            import io.sentry.rrweb.C1646a;
            import io.sentry.rrweb.C1652g;
            import io.sentry.rrweb.C1654i;
            import io.sentry.rrweb.C1655j;
            import io.sentry.rrweb.C1657l;
            import io.sentry.rrweb.C1658m;
            import io.sentry.rrweb.EnumC1648c;
            import io.sentry.util.AbstractC1704c;
            import java.io.BufferedInputStream;
            import java.io.BufferedOutputStream;
            import java.io.BufferedWriter;
            import java.io.IOException;
            import java.io.OutputStream;
            import java.io.OutputStreamWriter;
            import java.io.Reader;
            import java.io.StringWriter;
            import java.io.Writer;
            import java.nio.charset.Charset;
            import java.util.Collection;
            import java.util.HashMap;
            import java.util.Map;
            import p000.C1954n7;
            
            /* JADX INFO: renamed from: io.sentry.h2 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1467h2 implements InterfaceC1487i1 {

                /* JADX INFO: renamed from: c */
                public static final Charset f10972c = Charset.forName("UTF-8");

                /* JADX INFO: renamed from: a */
                public final C1554m6 f10973a;

                /* JADX INFO: renamed from: b */
                public final HashMap f10974b;

                public C1467h2(C1554m6 c1554m6) {
/* 4 */             this.f10973a = c1554m6;
/* 8 */             HashMap map = new HashMap();
/* 11 */            this.f10974b = map;
/* 21 */            map.put(C1589a.class, new C1411a(4));
/* 32 */            map.put(C1443f.class, new C1431e(0));
/* 43 */            map.put(C1595d.class, new C1411a(5));
/* 54 */            map.put(C1597e.class, new C1411a(6));
/* 65 */            map.put(DebugImage.class, new C1411a(7));
/* 77 */            map.put(C1599f.class, new C1411a(8));
/* 89 */            map.put(C1603h.class, new C1411a(9));
/* 101 */           map.put(EnumC1601g.class, new C1411a(10));
/* 113 */           map.put(C1609k.class, new C1411a(12));
/* 125 */           map.put(C1613m.class, new C1411a(14));
/* 137 */           map.put(EnumC1592b0.class, new C1411a(29));
/* 149 */           map.put(C1614n.class, new C1411a(15));
/* 161 */           map.put(C1615o.class, new C1411a(16));
/* 173 */           map.put(C1616p.class, new C1411a(17));
/* 185 */           map.put(C1620q.class, new C1411a(18));
/* 196 */           map.put(C1573o3.class, new C1431e(1));
/* 207 */           map.put(C1581p3.class, new C1431e(2));
/* 218 */           map.put(C1642r3.class, new C1431e(3));
/* 229 */           map.put(C1663s3.class, new C1431e(4));
/* 240 */           map.put(C1585a.class, new C1411a(2));
/* 251 */           map.put(C1586b.class, new C1411a(3));
/* 263 */           map.put(C1621r.class, new C1411a(19));
/* 274 */           map.put(C1745x3.class, new C1431e(5));
/* 286 */           map.put(C1646a.class, new C1596d0(9));
/* 298 */           map.put(EnumC1648c.class, new C1596d0(10));
/* 310 */           map.put(C1652g.class, new C1596d0(12));
/* 322 */           map.put(C1654i.class, new C1596d0(14));
/* 334 */           map.put(C1655j.class, new C1596d0(16));
/* 346 */           map.put(C1657l.class, new C1596d0(17));
/* 358 */           map.put(C1658m.class, new C1596d0(18));
/* 370 */           map.put(C1623t.class, new C1411a(20));
/* 382 */           map.put(C1624u.class, new C1411a(21));
/* 393 */           map.put(C1726v4.class, new C1431e(7));
/* 405 */           map.put(C1381b5.class, new C1431e(8));
/* 417 */           map.put(C1393c5.class, new C1431e(9));
/* 429 */           map.put(C1625v.class, new C1411a(22));
/* 441 */           map.put(EnumC1538l5.class, new C1431e(10));
/* 453 */           map.put(EnumC1553m5.class, new C1431e(11));
/* 465 */           map.put(C1566n5.class, new C1431e(12));
/* 477 */           map.put(C1583p5.class, new C1431e(15));
/* 489 */           map.put(C1673t5.class, new C1431e(18));
/* 501 */           map.put(C1627x.class, new C1411a(24));
/* 513 */           map.put(C1628y.class, new C1411a(25));
/* 525 */           map.put(C1576o6.class, new C1431e(19));
/* 537 */           map.put(C1629z.class, new C1411a(26));
/* 549 */           map.put(C1590a0.class, new C1411a(27));
/* 561 */           map.put(C1594c0.class, new C1411a(28));
/* 572 */           map.put(C1565n4.class, new C1431e(6));
/* 583 */           map.put(C1598e0.class, new C1596d0(0));
/* 594 */           map.put(C1600f0.class, new C1596d0(1));
/* 606 */           map.put(C1764z6.class, new C1431e(21));
/* 618 */           map.put(C1383b7.class, new C1431e(22));
/* 630 */           map.put(C1430d7.class, new C1431e(23));
/* 642 */           map.put(EnumC1451f7.class, new C1431e(24));
/* 653 */           map.put(C1608j0.class, new C1596d0(2));
/* 665 */           map.put(C1611l.class, new C1411a(13));
/* 677 */           map.put(C1555m7.class, new C1431e(26));
/* 688 */           map.put(C1412b.class, new C1411a(0));
/* 699 */           map.put(C1612l0.class, new C1596d0(4));
/* 710 */           map.put(C1610k0.class, new C1596d0(3));
                }

                @Override // io.sentry.InterfaceC1487i1
                /* JADX INFO: renamed from: a */
                public final void mo5063a(Writer writer, Object obj) throws IOException {
/* 3 */             AbstractC1704c.m5462q(obj, "The entity is required.");
/* 6 */             C1554m6 c1554m6 = this.f10973a;
/* 8 */             ILogger logger = c1554m6.getLogger();
/* 12 */            EnumC1553m5 enumC1553m5 = EnumC1553m5.DEBUG;
/* 18 */            if (logger.mo4673m(enumC1553m5)) {
/* 38 */                c1554m6.getLogger().mo4672k(enumC1553m5, "Serializing object: %s", m5256f(obj, c1554m6.isEnablePrettySerializationOutput()));
                    }
/* 47 */            C1505c c1505c = new C1505c(writer, c1554m6.getMaxDepth());
/* 58 */            ((C1954n7) c1505c.f11043c).m6905k(c1505c, c1554m6.getLogger(), obj);
/* 61 */            writer.flush();
                }

                @Override // io.sentry.InterfaceC1487i1
                /* JADX INFO: renamed from: b */
                public final Object mo5064b(Reader reader, Class cls) {
                    Object objMo5232R0;
/* 1 */             C1554m6 c1554m6 = this.f10973a;
                    try {
/* 6 */                 C1446f2 c1446f2 = new C1446f2(reader);
                        try {
/* 15 */                    InterfaceC1696u1 interfaceC1696u1 = (InterfaceC1696u1) this.f10974b.get(cls);
/* 17 */                    if (interfaceC1696u1 != null) {
/* 27 */                        objMo5232R0 = cls.cast(interfaceC1696u1.mo5157a(c1446f2, c1554m6.getLogger()));
                            } else {
/* 43 */                        if (!cls.isArray() && !Collection.class.isAssignableFrom(cls) && !String.class.isAssignableFrom(cls) && !Map.class.isAssignableFrom(cls)) {
/* 70 */                            c1446f2.close();
/* 3 */                             return null;
                                }
/* 74 */                        objMo5232R0 = c1446f2.mo5232R0();
                            }
/* 31 */                    c1446f2.close();
/* 34 */                    return objMo5232R0;
                        } catch (Throwable th) {
                            try {
/* 79 */                        c1446f2.close();
                            } catch (Throwable th2) {
/* 84 */                        th.addSuppressed(th2);
                            }
/* 87 */                    throw th;
                        }
                    } catch (Exception e) {
/* 96 */                c1554m6.getLogger().mo4671d(EnumC1553m5.ERROR, "Error when deserializing", e);
/* 3 */                 return null;
                    }
                }

                @Override // io.sentry.InterfaceC1487i1
                /* JADX INFO: renamed from: c */
                public final C1505c mo5065c(BufferedInputStream bufferedInputStream) {
/* 1 */             C1554m6 c1554m6 = this.f10973a;
                    try {
/* 7 */                 return c1554m6.getEnvelopeReader().mo4676a(bufferedInputStream);
                    } catch (IOException e) {
/* 21 */                c1554m6.getLogger().mo4671d(EnumC1553m5.ERROR, "Error deserializing envelope.", e);
/* 24 */                return null;
                    }
                }

                @Override // io.sentry.InterfaceC1487i1
                /* JADX INFO: renamed from: d */
                public final String mo5066d(Map map) {
/* 2 */             return m5256f(map, false);
                }

                @Override // io.sentry.InterfaceC1487i1
                /* JADX INFO: renamed from: e */
                public final void mo5067e(C1505c c1505c, OutputStream outputStream) throws IOException {
/* 3 */             C1554m6 c1554m6 = this.f10973a;
/* 7 */             AbstractC1704c.m5462q(c1505c, "The SentryEnvelope object is required.");
/* 26 */            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new BufferedOutputStream(outputStream), f10972c), NotificationCompat.FLAG_GROUP_SUMMARY);
                    try {
/* 46 */                ((C1726v4) c1505c.f11042b).serialize(new C1505c(bufferedWriter, c1554m6.getMaxDepth()), c1554m6.getLogger());
/* 49 */                bufferedWriter.write("\n");
/* 64 */                for (C1160a5 c1160a5 : (Iterable) c1505c.f11043c) {
                            try {
/* 72 */                        byte[] bArrM4722f = c1160a5.m4722f();
/* 91 */                        c1160a5.f9799a.serialize(new C1505c(bufferedWriter, c1554m6.getMaxDepth()), c1554m6.getLogger());
/* 94 */                        bufferedWriter.write("\n");
/* 97 */                        bufferedWriter.flush();
/* 100 */                       outputStream.write(bArrM4722f);
/* 103 */                       bufferedWriter.write("\n");
                            } catch (Exception e) {
/* 118 */                       c1554m6.getLogger().mo4671d(EnumC1553m5.ERROR, "Failed to create envelope item. Dropping it.", e);
                            }
                        }
/* 122 */               bufferedWriter.flush();
                    } catch (Throwable th) {
/* 126 */               bufferedWriter.flush();
/* 129 */               throw th;
                    }
                }

                /* JADX INFO: renamed from: f */
                public final String m5256f(Object obj, boolean z) throws IOException {
/* 3 */             StringWriter stringWriter = new StringWriter();
/* 8 */             C1554m6 c1554m6 = this.f10973a;
/* 14 */            C1505c c1505c = new C1505c(stringWriter, c1554m6.getMaxDepth());
/* 17 */            if (z) {
/* 21 */                c1505c.m5294s("\t");
                    }
/* 32 */            ((C1954n7) c1505c.f11043c).m6905k(c1505c, c1554m6.getLogger(), obj);
/* 35 */            return stringWriter.toString();
                }
            }
