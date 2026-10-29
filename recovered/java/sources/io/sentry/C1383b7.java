            package io.sentry;

            import androidx.core.app.NotificationCompat;
            import com.appsflyer.internal.AbstractC0298j;
            import com.google.firebase.analytics.FirebaseAnalytics;
            import com.supercell.p007id.scid_plugin.platform_interface.SharedDataContentProvider;
            import io.sentry.internal.debugmeta.C1505c;
            import io.sentry.protocol.C1626w;
            import io.sentry.util.AbstractC1704c;
            import io.sentry.util.AbstractC1716o;
            import io.sentry.util.thread.InterfaceC1718a;
            import java.io.IOException;
            import java.nio.charset.Charset;
            import java.util.Arrays;
            import java.util.Map;
            import java.util.concurrent.ConcurrentHashMap;
            
            /* JADX INFO: renamed from: io.sentry.b7 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 108 */   public class C1383b7 implements InterfaceC1458g2 {

                /* JADX INFO: renamed from: U */
                public Map f10749U;

                /* JADX INFO: renamed from: V */
                public ConcurrentHashMap f10750V;

                /* JADX INFO: renamed from: W */
                public EnumC1640r1 f10751W;

                /* JADX INFO: renamed from: X */
                public C1387c f10752X;

                /* JADX INFO: renamed from: Y */
                public final C1666s6 f10753Y;

                /* JADX INFO: renamed from: Z */
                public final C1626w f10754Z;

                /* JADX INFO: renamed from: a */
                public final C1626w f10755a;

                /* JADX INFO: renamed from: b */
                public final C1430d7 f10756b;

                /* JADX INFO: renamed from: c */
                public final C1430d7 f10757c;

                /* JADX INFO: renamed from: d */
                public transient C1671t3 f10758d;

                /* JADX INFO: renamed from: e */
                public String f10759e;

                /* JADX INFO: renamed from: f */
                public String f10760f;

                /* JADX INFO: renamed from: i */
                public EnumC1451f7 f10761i;

                /* JADX INFO: renamed from: v */
                public ConcurrentHashMap f10762v;

                /* JADX INFO: renamed from: w */
                public String f10763w;

                public C1383b7(C1626w c1626w, C1430d7 c1430d7, C1430d7 c1430d8, String str, String str2, C1671t3 c1671t3, EnumC1451f7 enumC1451f7, String str3) {
/* 9 */             this.f10762v = new ConcurrentHashMap();
/* 13 */            this.f10763w = "manual";
/* 20 */            this.f10749U = new ConcurrentHashMap();
/* 24 */            this.f10751W = EnumC1640r1.SENTRY;
/* 33 */            this.f10753Y = new C1666s6(8);
/* 37 */            this.f10754Z = C1626w.f11478b;
/* 41 */            AbstractC1704c.m5462q(c1626w, "traceId is required");
/* 44 */            this.f10755a = c1626w;
/* 48 */            AbstractC1704c.m5462q(c1430d7, "spanId is required");
/* 51 */            this.f10756b = c1430d7;
/* 55 */            AbstractC1704c.m5462q(str, "operation is required");
/* 58 */            this.f10759e = str;
/* 60 */            this.f10757c = c1430d8;
/* 62 */            this.f10760f = str2;
/* 64 */            this.f10761i = enumC1451f7;
/* 66 */            this.f10763w = str3;
/* 68 */            m5070a(c1671t3);
/* 79 */            InterfaceC1718a threadChecker = AbstractC1552m4.m5357b().mo5092l().getThreadChecker();
/* 95 */            this.f10749U.put("thread.id", String.valueOf(threadChecker.mo4841b()));
/* 106 */           this.f10749U.put("thread.name", threadChecker.mo4840a());
                }

                /* JADX INFO: renamed from: a */
                public final void m5070a(C1671t3 c1671t3) {
/* 1 */             this.f10758d = c1671t3;
/* 3 */             C1387c c1387c = this.f10752X;
/* 5 */             if (c1387c == null || c1671t3 == null) {
/* 49 */                return;
                    }
/* 12 */            Boolean bool = (Boolean) c1671t3.f11667a;
/* 14 */            Charset charset = AbstractC1716o.f11743a;
/* 26 */            c1387c.m5076d("sentry-sampled", bool == null ? null : bool.toString());
/* 31 */            Double d = (Double) c1671t3.f11669c;
/* 33 */            if (d != null && c1387c.f10776f) {
/* 39 */                c1387c.f10774d = d;
                    }
/* 43 */            Double d2 = (Double) c1671t3.f11668b;
/* 45 */            if (d2 != null) {
/* 47 */                c1387c.f10773c = d2;
                    }
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof C1383b7)) {
/* 7 */                 return false;
                    }
/* 11 */            C1383b7 c1383b7 = (C1383b7) obj;
                    return this.f10755a.equals(c1383b7.f10755a) && this.f10756b.equals(c1383b7.f10756b) && AbstractC1704c.m5453h(this.f10757c, c1383b7.f10757c) && this.f10759e.equals(c1383b7.f10759e) && AbstractC1704c.m5453h(this.f10760f, c1383b7.f10760f) && this.f10761i == c1383b7.f10761i;
                }

                public final int hashCode() {
/* 17 */            return Arrays.hashCode(new Object[]{this.f10755a, this.f10756b, this.f10757c, this.f10759e, this.f10760f, this.f10761i});
                }

                @Override // io.sentry.InterfaceC1458g2
                public final void serialize(InterfaceC1518j3 interfaceC1518j3, ILogger iLogger) throws IOException {
/* 1 */             C1505c c1505c = (C1505c) interfaceC1518j3;
/* 3 */             c1505c.m5287i();
/* 8 */             c1505c.m5291p("trace_id");
/* 13 */            this.f10755a.serialize(c1505c, iLogger);
/* 18 */            c1505c.m5291p("span_id");
/* 23 */            this.f10756b.serialize(c1505c, iLogger);
/* 26 */            C1430d7 c1430d7 = this.f10757c;
/* 28 */            if (c1430d7 != null) {
/* 32 */                c1505c.m5291p("parent_span_id");
/* 35 */                c1430d7.serialize(c1505c, iLogger);
                    }
/* 40 */            c1505c.m5291p("op");
/* 45 */            c1505c.m5300y(this.f10759e);
/* 50 */            if (this.f10760f != null) {
/* 54 */                c1505c.m5291p("description");
/* 59 */                c1505c.m5300y(this.f10760f);
                    }
/* 64 */            if (this.f10761i != null) {
/* 68 */                c1505c.m5291p(NotificationCompat.CATEGORY_STATUS);
/* 73 */                c1505c.m5297v(iLogger, this.f10761i);
                    }
/* 78 */            if (this.f10763w != null) {
/* 82 */                c1505c.m5291p(FirebaseAnalytics.Param.ORIGIN);
/* 87 */                c1505c.m5297v(iLogger, this.f10763w);
                    }
/* 96 */            if (!this.f10762v.isEmpty()) {
/* 100 */               c1505c.m5291p("tags");
/* 105 */               c1505c.m5297v(iLogger, this.f10762v);
                    }
/* 114 */           if (!this.f10749U.isEmpty()) {
/* 118 */               c1505c.m5291p(SharedDataContentProvider.BASE_PATH);
/* 123 */               c1505c.m5297v(iLogger, this.f10749U);
                    }
/* 126 */           ConcurrentHashMap concurrentHashMap = this.f10750V;
/* 128 */           if (concurrentHashMap != null) {
/* 142 */               for (String str : concurrentHashMap.keySet()) {
/* 152 */                   AbstractC0298j.m1863d(this.f10750V, str, c1505c, str, iLogger);
                        }
                    }
/* 156 */           c1505c.m5288l();
                }

/* 109 */       public C1383b7(C1626w c1626w, C1430d7 c1430d7, String str, C1430d7 c1430d8) {
/* 110 */           this(c1626w, c1430d7, c1430d8, str, null, null, null, "manual");
                }

/* 110 */       public C1383b7(C1383b7 c1383b7) {
/* 112 */           this.f10762v = new ConcurrentHashMap();
/* 113 */           this.f10763w = "manual";
/* 114 */           this.f10749U = new ConcurrentHashMap();
/* 115 */           this.f10751W = EnumC1640r1.SENTRY;
/* 117 */           this.f10753Y = new C1666s6(8);
/* 118 */           this.f10754Z = C1626w.f11478b;
/* 119 */           this.f10755a = c1383b7.f10755a;
/* 120 */           this.f10756b = c1383b7.f10756b;
/* 121 */           this.f10757c = c1383b7.f10757c;
/* 122 */           m5070a(c1383b7.f10758d);
/* 123 */           this.f10759e = c1383b7.f10759e;
/* 124 */           this.f10760f = c1383b7.f10760f;
/* 125 */           this.f10761i = c1383b7.f10761i;
/* 126 */           ConcurrentHashMap concurrentHashMapM5459n = AbstractC1704c.m5459n(c1383b7.f10762v);
                    if (concurrentHashMapM5459n != null) {
/* 127 */               this.f10762v = concurrentHashMapM5459n;
                    }
/* 129 */           ConcurrentHashMap concurrentHashMapM5459n2 = AbstractC1704c.m5459n(c1383b7.f10750V);
                    if (concurrentHashMapM5459n2 != null) {
/* 130 */               this.f10750V = concurrentHashMapM5459n2;
                    }
/* 131 */           this.f10752X = c1383b7.f10752X;
/* 132 */           ConcurrentHashMap concurrentHashMapM5459n3 = AbstractC1704c.m5459n(c1383b7.f10749U);
                    if (concurrentHashMapM5459n3 != null) {
/* 133 */               this.f10749U = concurrentHashMapM5459n3;
                    }
                }
            }
