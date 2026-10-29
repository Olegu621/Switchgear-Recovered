            package io.sentry;

            import com.appsflyer.internal.AbstractC0298j;
            import com.google.firebase.analytics.FirebaseAnalytics;
            import com.supercell.p007id.scid_plugin.platform_interface.SharedDataContentProvider;
            import io.sentry.config.AbstractC1417a;
            import io.sentry.internal.debugmeta.C1505c;
            import io.sentry.util.AbstractC1704c;
            import java.io.IOException;
            import java.util.Arrays;
            import java.util.Collections;
            import java.util.Date;
            import java.util.Map;
            import java.util.concurrent.ConcurrentHashMap;
            import p000.f42;
            
            /* JADX INFO: renamed from: io.sentry.f */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 71 */    public final class C1443f implements InterfaceC1458g2, Comparable {

                /* JADX INFO: renamed from: V */
                public static final Map f10924V = Collections.EMPTY_MAP;

                /* JADX INFO: renamed from: U */
                public ConcurrentHashMap f10925U;

                /* JADX INFO: renamed from: a */
                public final Long f10926a;

                /* JADX INFO: renamed from: b */
                public Date f10927b;

                /* JADX INFO: renamed from: c */
                public final Long f10928c;

                /* JADX INFO: renamed from: d */
                public String f10929d;

                /* JADX INFO: renamed from: e */
                public String f10930e;

                /* JADX INFO: renamed from: f */
                public volatile Map f10931f;

                /* JADX INFO: renamed from: i */
                public String f10932i;

                /* JADX INFO: renamed from: v */
                public String f10933v;

                /* JADX INFO: renamed from: w */
                public EnumC1553m5 f10934w;

                public C1443f(C1443f c1443f) {
                    ConcurrentHashMap concurrentHashMapM5459n;
/* 6 */             this.f10931f = f10924V;
/* 16 */            this.f10928c = Long.valueOf(System.nanoTime());
/* 20 */            this.f10927b = c1443f.f10927b;
/* 24 */            this.f10926a = c1443f.f10926a;
/* 28 */            this.f10929d = c1443f.f10929d;
/* 32 */            this.f10930e = c1443f.f10930e;
/* 36 */            this.f10932i = c1443f.f10932i;
/* 40 */            this.f10933v = c1443f.f10933v;
/* 48 */            if (!c1443f.f10931f.isEmpty() && (concurrentHashMapM5459n = AbstractC1704c.m5459n(c1443f.f10931f)) != null) {
/* 58 */                this.f10931f = concurrentHashMapM5459n;
                    }
/* 66 */            this.f10925U = AbstractC1704c.m5459n(c1443f.f10925U);
/* 70 */            this.f10934w = c1443f.f10934w;
                }

                /* JADX INFO: renamed from: a */
                public static boolean m5206a(C1443f c1443f, C1443f c1443f2) {
                    return c1443f.m5208c().getTime() == c1443f2.m5208c().getTime() && AbstractC1704c.m5453h(c1443f.f10929d, c1443f2.f10929d) && AbstractC1704c.m5453h(c1443f.f10930e, c1443f2.f10930e) && AbstractC1704c.m5453h(c1443f.f10932i, c1443f2.f10932i) && AbstractC1704c.m5453h(c1443f.f10933v, c1443f2.f10933v) && c1443f.f10934w == c1443f2.f10934w;
                }

                /* JADX INFO: renamed from: b */
                public final Map m5207b() {
                    Map concurrentHashMap;
/* 1 */             Map map = this.f10931f;
/* 3 */             Map map2 = f10924V;
/* 5 */             if (map != map2) {
/* 26 */                return map;
                    }
                    synchronized (this) {
                        try {
/* 8 */                     concurrentHashMap = this.f10931f;
/* 10 */                    if (concurrentHashMap == map2) {
/* 14 */                        concurrentHashMap = new ConcurrentHashMap();
/* 17 */                        this.f10931f = concurrentHashMap;
                            }
                        } catch (Throwable th) {
/* 25 */                    throw th;
                        }
                    }
/* 23 */            return concurrentHashMap;
                }

                /* JADX INFO: renamed from: c */
                public final Date m5208c() {
/* 1 */             Date date = this.f10927b;
/* 3 */             if (date != null) {
/* 5 */                 return date;
                    }
/* 6 */             Long l = this.f10926a;
/* 8 */             if (l == null) {
/* 24 */                f42.m3656l("No timestamp set for breadcrumb");
/* 27 */                return null;
                    }
/* 16 */            Date date2 = new Date(l.longValue());
/* 19 */            this.f10927b = date2;
/* 21 */            return date2;
                }

                @Override // java.lang.Comparable
                public final int compareTo(Object obj) {
/* 7 */             return this.f10928c.compareTo(((C1443f) obj).f10928c);
                }

                /* JADX INFO: renamed from: d */
                public final void m5209d(Object obj, String str) {
/* 1 */             if (str == null) {
/* 15 */                return;
                    }
/* 4 */             if (obj != null) {
/* 20 */                m5207b().put(str, obj);
/* 23 */                return;
                    }
/* 6 */             Map map = this.f10931f;
/* 10 */            if (map != f10924V) {
/* 12 */                map.remove(str);
                    }
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 135 */               return true;
                    }
/* 5 */             if (obj == null || C1443f.class != obj.getClass()) {
/* 142 */               return false;
                    }
/* 17 */            C1443f c1443f = (C1443f) obj;
/* 27 */            if ("http".equals(this.f10930e)) {
                        return m5206a(this, c1443f) && AbstractC1704c.m5453h(this.f10931f.get("status_code"), c1443f.f10931f.get("status_code")) && AbstractC1704c.m5453h(this.f10931f.get("url"), c1443f.f10931f.get("url")) && AbstractC1704c.m5453h(this.f10931f.get(FirebaseAnalytics.Param.METHOD), c1443f.f10931f.get(FirebaseAnalytics.Param.METHOD)) && AbstractC1704c.m5453h(this.f10931f.get("http.fragment"), c1443f.f10931f.get("http.fragment")) && AbstractC1704c.m5453h(this.f10931f.get("http.query"), c1443f.f10931f.get("http.query"));
                    }
/* 137 */           return m5206a(this, c1443f);
                }

                public final int hashCode() {
                    return "http".equals(this.f10930e) ? Arrays.hashCode(new Object[]{Long.valueOf(m5208c().getTime()), this.f10929d, this.f10930e, this.f10932i, this.f10933v, this.f10934w, this.f10931f.get("status_code"), this.f10931f.get("url"), this.f10931f.get(FirebaseAnalytics.Param.METHOD), this.f10931f.get("http.fragment"), this.f10931f.get("http.query")}) : Arrays.hashCode(new Object[]{Long.valueOf(m5208c().getTime()), this.f10929d, this.f10930e, this.f10932i, this.f10933v, this.f10934w});
                }

                @Override // io.sentry.InterfaceC1458g2
                public final void serialize(InterfaceC1518j3 interfaceC1518j3, ILogger iLogger) throws IOException {
/* 1 */             C1505c c1505c = (C1505c) interfaceC1518j3;
/* 3 */             c1505c.m5287i();
/* 8 */             c1505c.m5291p("timestamp");
/* 11 */            Long l = this.f10926a;
/* 36 */            c1505c.m5300y(l != null ? AbstractC1417a.m5178q(l.longValue()) : AbstractC1417a.m5178q(m5208c().getTime()));
/* 41 */            if (this.f10929d != null) {
/* 45 */                c1505c.m5291p("message");
/* 50 */                c1505c.m5300y(this.f10929d);
                    }
/* 55 */            if (this.f10930e != null) {
/* 59 */                c1505c.m5291p("type");
/* 64 */                c1505c.m5300y(this.f10930e);
                    }
/* 69 */            c1505c.m5291p(SharedDataContentProvider.BASE_PATH);
/* 74 */            c1505c.m5297v(iLogger, this.f10931f);
/* 79 */            if (this.f10932i != null) {
/* 83 */                c1505c.m5291p("category");
/* 88 */                c1505c.m5300y(this.f10932i);
                    }
/* 93 */            if (this.f10933v != null) {
/* 97 */                c1505c.m5291p(FirebaseAnalytics.Param.ORIGIN);
/* 102 */               c1505c.m5300y(this.f10933v);
                    }
/* 107 */           if (this.f10934w != null) {
/* 111 */               c1505c.m5291p(FirebaseAnalytics.Param.LEVEL);
/* 116 */               c1505c.m5297v(iLogger, this.f10934w);
                    }
/* 119 */           ConcurrentHashMap concurrentHashMap = this.f10925U;
/* 121 */           if (concurrentHashMap != null) {
/* 135 */               for (String str : concurrentHashMap.keySet()) {
/* 145 */                   AbstractC0298j.m1863d(this.f10925U, str, c1505c, str, iLogger);
                        }
                    }
/* 149 */           c1505c.m5288l();
                }

/* 72 */        public C1443f(long j) {
/* 74 */            this.f10931f = f10924V;
/* 75 */            this.f10928c = Long.valueOf(System.nanoTime());
/* 76 */            this.f10926a = Long.valueOf(j);
/* 77 */            this.f10927b = null;
                }

/* 77 */        public C1443f(Date date) {
/* 79 */            this.f10931f = f10924V;
/* 80 */            this.f10928c = Long.valueOf(System.nanoTime());
/* 81 */            this.f10927b = date;
/* 82 */            this.f10926a = null;
                }

/* 82 */        public C1443f() {
/* 83 */            this(System.currentTimeMillis());
                }
            }
