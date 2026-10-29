            package io.sentry.protocol;

            import androidx.core.app.NotificationCompat;
            import com.appsflyer.internal.AbstractC0298j;
            import com.google.firebase.analytics.FirebaseAnalytics;
            import com.supercell.p007id.scid_plugin.platform_interface.SharedDataContentProvider;
            import io.sentry.AbstractC1672t4;
            import io.sentry.C1162a7;
            import io.sentry.C1383b7;
            import io.sentry.C1430d7;
            import io.sentry.EnumC1451f7;
            import io.sentry.ILogger;
            import io.sentry.InterfaceC1458g2;
            import io.sentry.InterfaceC1518j3;
            import io.sentry.config.AbstractC1417a;
            import io.sentry.internal.debugmeta.C1505c;
            import io.sentry.util.AbstractC1704c;
            import java.io.IOException;
            import java.util.Map;
            import java.util.concurrent.ConcurrentHashMap;
            
            /* JADX INFO: renamed from: io.sentry.protocol.z */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
/* 113 */   public final class C1629z implements InterfaceC1458g2 {

                /* JADX INFO: renamed from: U */
                public final Map f11487U;

                /* JADX INFO: renamed from: V */
                public Map f11488V;

                /* JADX INFO: renamed from: W */
                public final Map f11489W;

                /* JADX INFO: renamed from: X */
                public ConcurrentHashMap f11490X;

                /* JADX INFO: renamed from: a */
                public final Double f11491a;

                /* JADX INFO: renamed from: b */
                public final Double f11492b;

                /* JADX INFO: renamed from: c */
                public final C1626w f11493c;

                /* JADX INFO: renamed from: d */
                public final C1430d7 f11494d;

                /* JADX INFO: renamed from: e */
                public final C1430d7 f11495e;

                /* JADX INFO: renamed from: f */
                public final String f11496f;

                /* JADX INFO: renamed from: i */
                public final String f11497i;

                /* JADX INFO: renamed from: v */
                public final EnumC1451f7 f11498v;

                /* JADX INFO: renamed from: w */
                public final String f11499w;

                public C1629z(C1162a7 c1162a7) {
/* 1 */             ConcurrentHashMap concurrentHashMap = c1162a7.f9812k;
/* 6 */             C1383b7 c1383b7 = c1162a7.f9804c;
/* 10 */            this.f11497i = c1383b7.f10760f;
/* 14 */            this.f11496f = c1383b7.f10759e;
/* 18 */            this.f11494d = c1383b7.f10756b;
/* 22 */            this.f11495e = c1383b7.f10757c;
/* 26 */            this.f11493c = c1383b7.f10755a;
/* 30 */            this.f11498v = c1383b7.f10761i;
/* 34 */            this.f11499w = c1383b7.f10763w;
/* 38 */            ConcurrentHashMap concurrentHashMapM5459n = AbstractC1704c.m5459n(c1383b7.f10762v);
/* 50 */            this.f11487U = concurrentHashMapM5459n == null ? new ConcurrentHashMap() : concurrentHashMapM5459n;
/* 54 */            ConcurrentHashMap concurrentHashMapM5459n2 = AbstractC1704c.m5459n(c1162a7.f9813l);
/* 66 */            this.f11489W = concurrentHashMapM5459n2 == null ? new ConcurrentHashMap() : concurrentHashMapM5459n2;
/* 68 */            AbstractC1672t4 abstractC1672t4 = c1162a7.f9803b;
/* 91 */            this.f11492b = abstractC1672t4 == null ? null : Double.valueOf(c1162a7.f9802a.mo5413c(abstractC1672t4) / 1.0E9d);
/* 105 */           this.f11491a = Double.valueOf(c1162a7.f9802a.mo5278d() / 1.0E9d);
/* 107 */           this.f11488V = concurrentHashMap;
/* 111 */           c1383b7.f10753Y.mo5254h();
                }

                @Override // io.sentry.InterfaceC1458g2
                public final void serialize(InterfaceC1518j3 interfaceC1518j3, ILogger iLogger) throws IOException {
/* 1 */             C1505c c1505c = (C1505c) interfaceC1518j3;
/* 3 */             c1505c.m5287i();
/* 8 */             c1505c.m5291p("start_timestamp");
/* 21 */            c1505c.m5297v(iLogger, AbstractC1417a.m5169g(this.f11491a.doubleValue()));
/* 24 */            Double d = this.f11492b;
/* 26 */            if (d != null) {
/* 30 */                c1505c.m5291p("timestamp");
/* 41 */                c1505c.m5297v(iLogger, AbstractC1417a.m5169g(d.doubleValue()));
                    }
/* 46 */            c1505c.m5291p("trace_id");
/* 51 */            c1505c.m5297v(iLogger, this.f11493c);
/* 56 */            c1505c.m5291p("span_id");
/* 61 */            c1505c.m5297v(iLogger, this.f11494d);
/* 64 */            C1430d7 c1430d7 = this.f11495e;
/* 66 */            if (c1430d7 != null) {
/* 70 */                c1505c.m5291p("parent_span_id");
/* 73 */                c1505c.m5297v(iLogger, c1430d7);
                    }
/* 78 */            c1505c.m5291p("op");
/* 83 */            c1505c.m5300y(this.f11496f);
/* 86 */            String str = this.f11497i;
/* 88 */            if (str != null) {
/* 92 */                c1505c.m5291p("description");
/* 95 */                c1505c.m5300y(str);
                    }
/* 98 */            EnumC1451f7 enumC1451f7 = this.f11498v;
/* 100 */           if (enumC1451f7 != null) {
/* 104 */               c1505c.m5291p(NotificationCompat.CATEGORY_STATUS);
/* 107 */               c1505c.m5297v(iLogger, enumC1451f7);
                    }
/* 110 */           String str2 = this.f11499w;
/* 112 */           if (str2 != null) {
/* 116 */               c1505c.m5291p(FirebaseAnalytics.Param.ORIGIN);
/* 119 */               c1505c.m5297v(iLogger, str2);
                    }
/* 122 */           Map map = this.f11487U;
/* 128 */           if (!map.isEmpty()) {
/* 132 */               c1505c.m5291p("tags");
/* 135 */               c1505c.m5297v(iLogger, map);
                    }
/* 140 */           if (this.f11488V != null) {
/* 144 */               c1505c.m5291p(SharedDataContentProvider.BASE_PATH);
/* 149 */               c1505c.m5297v(iLogger, this.f11488V);
                    }
/* 152 */           Map map2 = this.f11489W;
/* 158 */           if (!map2.isEmpty()) {
/* 162 */               c1505c.m5291p("measurements");
/* 165 */               c1505c.m5297v(iLogger, map2);
                    }
/* 168 */           ConcurrentHashMap concurrentHashMap = this.f11490X;
/* 170 */           if (concurrentHashMap != null) {
/* 184 */               for (String str3 : concurrentHashMap.keySet()) {
/* 194 */                   AbstractC0298j.m1863d(this.f11490X, str3, c1505c, str3, iLogger);
                        }
                    }
/* 198 */           c1505c.m5288l();
                }

/* 114 */       public C1629z(Double d, Double d2, C1626w c1626w, C1430d7 c1430d7, C1430d7 c1430d8, String str, String str2, EnumC1451f7 enumC1451f7, String str3, Map map, Map map2, Map map3) {
/* 116 */           this.f11491a = d;
/* 117 */           this.f11492b = d2;
/* 118 */           this.f11493c = c1626w;
/* 119 */           this.f11494d = c1430d7;
/* 120 */           this.f11495e = c1430d8;
/* 121 */           this.f11496f = str;
/* 122 */           this.f11497i = str2;
/* 123 */           this.f11498v = enumC1451f7;
/* 124 */           this.f11499w = str3;
/* 125 */           this.f11487U = map;
/* 126 */           this.f11489W = map2;
/* 127 */           this.f11488V = map3;
                }
            }
