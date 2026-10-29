            package io.sentry.protocol;

            import com.appsflyer.internal.AbstractC0298j;
            import io.sentry.AbstractC1635q4;
            import io.sentry.C1162a7;
            import io.sentry.C1383b7;
            import io.sentry.C1671t3;
            import io.sentry.C1748x6;
            import io.sentry.ILogger;
            import io.sentry.InterfaceC1458g2;
            import io.sentry.InterfaceC1518j3;
            import io.sentry.config.AbstractC1417a;
            import io.sentry.internal.debugmeta.C1505c;
            import java.io.IOException;
            import java.util.ArrayList;
            import java.util.HashMap;
            import java.util.Iterator;
            import java.util.Map;
            import java.util.concurrent.ConcurrentHashMap;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: renamed from: io.sentry.protocol.f0 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
/* 247 */   public final class C1600f0 extends AbstractC1635q4 implements InterfaceC1458g2 {

                /* JADX INFO: renamed from: a0 */
                public String f11310a0;

                /* JADX INFO: renamed from: b0 */
                public Double f11311b0;

                /* JADX INFO: renamed from: c0 */
                public Double f11312c0;

                /* JADX INFO: renamed from: d0 */
                public final ArrayList f11313d0;

                /* JADX INFO: renamed from: e0 */
                public final HashMap f11314e0;

                /* JADX INFO: renamed from: f0 */
                public C1604h0 f11315f0;

                /* JADX INFO: renamed from: g0 */
                public ConcurrentHashMap f11316g0;

                public C1600f0(C1748x6 c1748x6) {
/* 3 */             super(c1748x6.f11818a);
/* 11 */            this.f11313d0 = new ArrayList();
/* 18 */            this.f11314e0 = new HashMap();
/* 20 */            C1162a7 c1162a7 = c1748x6.f11819b;
/* 39 */            this.f11311b0 = Double.valueOf(c1162a7.f9802a.mo5278d() / 1.0E9d);
/* 55 */            this.f11312c0 = Double.valueOf(c1162a7.f9802a.mo5413c(c1162a7.f9803b) / 1.0E9d);
/* 59 */            this.f11310a0 = c1748x6.f11822e;
/* 71 */            for (C1162a7 c1162a8 : c1748x6.f11820c) {
/* 79 */                Boolean bool = Boolean.TRUE;
/* 83 */                C1671t3 c1671t3 = c1162a8.f9804c.f10758d;
/* 97 */                if (bool.equals(c1671t3 == null ? null : (Boolean) c1671t3.f11667a)) {
/* 106 */                   this.f11313d0.add(new C1629z(c1162a8));
                        }
                    }
/* 110 */           C1597e c1597e = this.f11517b;
/* 114 */           c1597e.mo5316l(c1748x6.f11833p);
/* 117 */           C1383b7 c1383b7 = c1162a7.f9804c;
/* 119 */           ConcurrentHashMap concurrentHashMap = c1162a7.f9812k;
/* 139 */           C1383b7 c1383b8 = new C1383b7(c1383b7.f10755a, c1383b7.f10756b, c1383b7.f10757c, c1383b7.f10759e, c1383b7.f10760f, c1383b7.f10758d, c1383b7.f10761i, c1383b7.f10763w);
/* 156 */           for (Map.Entry entry : c1383b7.f10762v.entrySet()) {
/* 176 */               m5382b((String) entry.getKey(), (String) entry.getValue());
                    }
/* 180 */           if (concurrentHashMap != null) {
/* 194 */               for (Map.Entry entry2 : concurrentHashMap.entrySet()) {
/* 206 */                   String str = (String) entry2.getKey();
/* 208 */                   Object value = entry2.getValue();
/* 212 */                   if (str != null) {
/* 215 */                       Map map = c1383b8.f10749U;
/* 217 */                       if (value == null) {
/* 219 */                           map.remove(str);
                                } else {
/* 223 */                           map.put(str, value);
                                }
                            }
                        }
                    }
/* 229 */           c1383b7.f10753Y.mo5254h();
/* 232 */           c1597e.mo5326v(c1383b8);
/* 246 */           this.f11315f0 = new C1604h0(c1748x6.f11831n.apiName());
                }

                @Override // io.sentry.InterfaceC1458g2
                public final void serialize(InterfaceC1518j3 interfaceC1518j3, ILogger iLogger) throws IOException {
/* 1 */             C1505c c1505c = (C1505c) interfaceC1518j3;
/* 3 */             c1505c.m5287i();
/* 10 */            if (this.f11310a0 != null) {
/* 12 */                c1505c.m5291p("transaction");
/* 17 */                c1505c.m5300y(this.f11310a0);
                    }
/* 22 */            c1505c.m5291p("start_timestamp");
/* 35 */            c1505c.m5297v(iLogger, AbstractC1417a.m5169g(this.f11311b0.doubleValue()));
/* 40 */            if (this.f11312c0 != null) {
/* 44 */                c1505c.m5291p("timestamp");
/* 57 */                c1505c.m5297v(iLogger, AbstractC1417a.m5169g(this.f11312c0.doubleValue()));
                    }
/* 60 */            ArrayList arrayList = this.f11313d0;
/* 66 */            if (!arrayList.isEmpty()) {
/* 70 */                c1505c.m5291p("spans");
/* 73 */                c1505c.m5297v(iLogger, arrayList);
                    }
/* 78 */            c1505c.m5291p("type");
/* 81 */            c1505c.m5300y("transaction");
/* 84 */            HashMap map = this.f11314e0;
/* 90 */            if (!map.isEmpty()) {
/* 94 */                c1505c.m5291p("measurements");
/* 97 */                c1505c.m5297v(iLogger, map);
                    }
/* 102 */           c1505c.m5291p("transaction_info");
/* 107 */           c1505c.m5297v(iLogger, this.f11315f0);
/* 110 */           AbstractC1417a.m5181u(this, c1505c, iLogger);
/* 113 */           ConcurrentHashMap concurrentHashMap = this.f11316g0;
/* 115 */           if (concurrentHashMap != null) {
/* 129 */               for (String str : concurrentHashMap.keySet()) {
/* 139 */                   AbstractC0298j.m1863d(this.f11316g0, str, c1505c, str, iLogger);
                        }
                    }
/* 143 */           c1505c.m5288l();
                }

/* 248 */       public C1600f0(ArrayList arrayList, HashMap map, C1604h0 c1604h0) {
                    Double dValueOf = Double.valueOf(0.0d);
/* 250 */           ArrayList arrayList2 = new ArrayList();
                    this.f11313d0 = arrayList2;
/* 251 */           HashMap map2 = new HashMap();
                    this.f11314e0 = map2;
/* 252 */           this.f11310a0 = HttpUrl.FRAGMENT_ENCODE_SET;
/* 253 */           this.f11311b0 = dValueOf;
/* 254 */           this.f11312c0 = null;
/* 255 */           arrayList2.addAll(arrayList);
/* 256 */           map2.putAll(map);
/* 257 */           Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
/* 260 */               this.f11314e0.putAll(((C1629z) it.next()).f11489W);
                    }
/* 261 */           this.f11315f0 = c1604h0;
                }
            }
