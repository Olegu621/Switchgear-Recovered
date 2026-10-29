            package io.sentry;

            import com.appsflyer.internal.AbstractC0298j;
            import com.google.firebase.analytics.FirebaseAnalytics;
            import io.sentry.internal.debugmeta.C1505c;
            import io.sentry.util.AbstractC1704c;
            import java.io.IOException;
            import java.util.HashMap;
            import java.util.concurrent.Callable;
            
            /* JADX INFO: renamed from: io.sentry.b5 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 25 */    public final class C1381b5 implements InterfaceC1458g2 {

                /* JADX INFO: renamed from: a */
                public final String f10740a;

                /* JADX INFO: renamed from: b */
                public final Integer f10741b;

                /* JADX INFO: renamed from: c */
                public final String f10742c;

                /* JADX INFO: renamed from: d */
                public final String f10743d;

                /* JADX INFO: renamed from: e */
                public final EnumC1538l5 f10744e;

                /* JADX INFO: renamed from: f */
                public final int f10745f;

                /* JADX INFO: renamed from: i */
                public final Callable f10746i;

                /* JADX INFO: renamed from: v */
                public final String f10747v;

                /* JADX INFO: renamed from: w */
                public HashMap f10748w;

                public C1381b5(EnumC1538l5 enumC1538l5, Callable callable, String str, String str2, String str3, String str4, Integer num) {
/* 6 */             AbstractC1704c.m5462q(enumC1538l5, "type is required");
/* 9 */             this.f10744e = enumC1538l5;
/* 11 */            this.f10740a = str;
/* 14 */            this.f10745f = -1;
/* 16 */            this.f10742c = str2;
/* 18 */            this.f10746i = callable;
/* 20 */            this.f10747v = str3;
/* 22 */            this.f10743d = str4;
/* 24 */            this.f10741b = num;
                }

                /* JADX INFO: renamed from: a */
                public final int m5069a() {
/* 1 */             Callable callable = this.f10746i;
/* 3 */             if (callable == null) {
/* 18 */                return this.f10745f;
                    }
                    try {
/* 11 */                return ((Integer) callable.call()).intValue();
                    } catch (Throwable unused) {
/* 16 */                return -1;
                    }
                }

                @Override // io.sentry.InterfaceC1458g2
                public final void serialize(InterfaceC1518j3 interfaceC1518j3, ILogger iLogger) throws IOException {
/* 1 */             C1505c c1505c = (C1505c) interfaceC1518j3;
/* 3 */             c1505c.m5287i();
/* 6 */             String str = this.f10740a;
/* 8 */             if (str != null) {
/* 12 */                c1505c.m5291p(FirebaseAnalytics.Param.CONTENT_TYPE);
/* 15 */                c1505c.m5300y(str);
                    }
/* 18 */            String str2 = this.f10742c;
/* 20 */            if (str2 != null) {
/* 24 */                c1505c.m5291p("filename");
/* 27 */                c1505c.m5300y(str2);
                    }
/* 32 */            c1505c.m5291p("type");
/* 37 */            c1505c.m5297v(iLogger, this.f10744e);
/* 40 */            String str3 = this.f10747v;
/* 42 */            if (str3 != null) {
/* 46 */                c1505c.m5291p("attachment_type");
/* 49 */                c1505c.m5300y(str3);
                    }
/* 52 */            String str4 = this.f10743d;
/* 54 */            if (str4 != null) {
/* 58 */                c1505c.m5291p("platform");
/* 61 */                c1505c.m5300y(str4);
                    }
/* 64 */            Integer num = this.f10741b;
/* 66 */            if (num != null) {
/* 70 */                c1505c.m5291p("item_count");
/* 73 */                c1505c.m5299x(num);
                    }
/* 78 */            c1505c.m5291p("length");
/* 86 */            c1505c.m5296u(m5069a());
/* 89 */            HashMap map = this.f10748w;
/* 91 */            if (map != null) {
/* 105 */               for (String str5 : map.keySet()) {
/* 115 */                   AbstractC0298j.m1862c(this.f10748w, str5, c1505c, str5, iLogger);
                        }
                    }
/* 119 */           c1505c.m5288l();
                }

/* 26 */        public C1381b5(EnumC1538l5 enumC1538l5, Callable callable, String str, String str2, String str3) {
/* 27 */            this(enumC1538l5, callable, str, str2, str3, (String) null, (Integer) null);
                }

/* 27 */        public C1381b5(EnumC1538l5 enumC1538l5, int i, String str, String str2, String str3, String str4, Integer num) {
/* 29 */            this.f10744e = enumC1538l5;
/* 30 */            this.f10740a = str;
/* 31 */            this.f10745f = i;
/* 32 */            this.f10742c = str2;
/* 33 */            this.f10746i = null;
/* 34 */            this.f10747v = str3;
/* 35 */            this.f10743d = str4;
/* 36 */            this.f10741b = num;
                }
            }
