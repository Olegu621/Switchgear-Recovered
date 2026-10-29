            package io.sentry;

            import com.appsflyer.internal.AbstractC0298j;
            import io.sentry.internal.debugmeta.C1505c;
            import io.sentry.protocol.C1626w;
            import java.io.IOException;
            import java.util.concurrent.ConcurrentHashMap;
            
            /* JADX INFO: renamed from: io.sentry.h7 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1472h7 implements InterfaceC1458g2 {

                /* JADX INFO: renamed from: U */
                public final C1626w f10985U;

                /* JADX INFO: renamed from: V */
                public ConcurrentHashMap f10986V;

                /* JADX INFO: renamed from: a */
                public final C1626w f10987a;

                /* JADX INFO: renamed from: b */
                public final String f10988b;

                /* JADX INFO: renamed from: c */
                public final String f10989c;

                /* JADX INFO: renamed from: d */
                public final String f10990d;

                /* JADX INFO: renamed from: e */
                public final String f10991e;

                /* JADX INFO: renamed from: f */
                public final String f10992f;

                /* JADX INFO: renamed from: i */
                public final String f10993i;

                /* JADX INFO: renamed from: v */
                public final String f10994v;

                /* JADX INFO: renamed from: w */
                public final String f10995w;

                public C1472h7(C1626w c1626w, String str, String str2, String str3, String str4, String str5, String str6, String str7, C1626w c1626w2, String str8) {
/* 4 */             this.f10987a = c1626w;
/* 6 */             this.f10988b = str;
/* 8 */             this.f10989c = str2;
/* 10 */            this.f10990d = str3;
/* 12 */            this.f10991e = str4;
/* 14 */            this.f10992f = str5;
/* 16 */            this.f10993i = str6;
/* 18 */            this.f10995w = str7;
/* 20 */            this.f10985U = c1626w2;
/* 22 */            this.f10994v = str8;
                }

                @Override // io.sentry.InterfaceC1458g2
                public final void serialize(InterfaceC1518j3 interfaceC1518j3, ILogger iLogger) throws IOException {
/* 1 */             C1505c c1505c = (C1505c) interfaceC1518j3;
/* 3 */             c1505c.m5287i();
/* 8 */             c1505c.m5291p("trace_id");
/* 13 */            c1505c.m5297v(iLogger, this.f10987a);
/* 18 */            c1505c.m5291p("public_key");
/* 23 */            c1505c.m5300y(this.f10988b);
/* 26 */            String str = this.f10989c;
/* 28 */            if (str != null) {
/* 32 */                c1505c.m5291p("release");
/* 35 */                c1505c.m5300y(str);
                    }
/* 38 */            String str2 = this.f10990d;
/* 40 */            if (str2 != null) {
/* 44 */                c1505c.m5291p("environment");
/* 47 */                c1505c.m5300y(str2);
                    }
/* 50 */            String str3 = this.f10991e;
/* 52 */            if (str3 != null) {
/* 56 */                c1505c.m5291p("user_id");
/* 59 */                c1505c.m5300y(str3);
                    }
/* 62 */            String str4 = this.f10992f;
/* 64 */            if (str4 != null) {
/* 68 */                c1505c.m5291p("transaction");
/* 71 */                c1505c.m5300y(str4);
                    }
/* 74 */            String str5 = this.f10993i;
/* 76 */            if (str5 != null) {
/* 80 */                c1505c.m5291p("sample_rate");
/* 83 */                c1505c.m5300y(str5);
                    }
/* 86 */            String str6 = this.f10994v;
/* 88 */            if (str6 != null) {
/* 92 */                c1505c.m5291p("sample_rand");
/* 95 */                c1505c.m5300y(str6);
                    }
/* 98 */            String str7 = this.f10995w;
/* 100 */           if (str7 != null) {
/* 104 */               c1505c.m5291p("sampled");
/* 107 */               c1505c.m5300y(str7);
                    }
/* 110 */           C1626w c1626w = this.f10985U;
/* 112 */           if (c1626w != null) {
/* 116 */               c1505c.m5291p("replay_id");
/* 119 */               c1505c.m5297v(iLogger, c1626w);
                    }
/* 122 */           ConcurrentHashMap concurrentHashMap = this.f10986V;
/* 124 */           if (concurrentHashMap != null) {
/* 138 */               for (String str8 : concurrentHashMap.keySet()) {
/* 148 */                   AbstractC0298j.m1863d(this.f10986V, str8, c1505c, str8, iLogger);
                        }
                    }
/* 152 */           c1505c.m5288l();
                }
            }
