            package io.sentry;

            import com.appsflyer.internal.AbstractC0298j;
            import com.google.firebase.analytics.FirebaseAnalytics;
            import io.sentry.config.AbstractC1417a;
            import io.sentry.internal.debugmeta.C1505c;
            import io.sentry.vendor.gson.stream.C1732c;
            import java.io.File;
            import java.io.IOException;
            import java.util.ArrayList;
            import java.util.Date;
            import java.util.List;
            import java.util.Locale;
            import java.util.Map;
            import java.util.concurrent.Callable;
            import java.util.concurrent.ConcurrentHashMap;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: renamed from: io.sentry.r3 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1642r3 implements InterfaceC1458g2 {

                /* JADX INFO: renamed from: U */
                public boolean f11546U;

                /* JADX INFO: renamed from: V */
                public String f11547V;

                /* JADX INFO: renamed from: X */
                public String f11549X;

                /* JADX INFO: renamed from: Y */
                public String f11550Y;

                /* JADX INFO: renamed from: Z */
                public String f11551Z;

                /* JADX INFO: renamed from: a */
                public final File f11552a;

                /* JADX INFO: renamed from: a0 */
                public final ArrayList f11553a0;

                /* JADX INFO: renamed from: b */
                public final Callable f11554b;

                /* JADX INFO: renamed from: b0 */
                public String f11555b0;

                /* JADX INFO: renamed from: c */
                public int f11556c;

                /* JADX INFO: renamed from: c0 */
                public String f11557c0;

                /* JADX INFO: renamed from: d0 */
                public String f11559d0;

                /* JADX INFO: renamed from: e */
                public String f11560e;

                /* JADX INFO: renamed from: e0 */
                public String f11561e0;

                /* JADX INFO: renamed from: f */
                public String f11562f;

                /* JADX INFO: renamed from: f0 */
                public String f11563f0;

                /* JADX INFO: renamed from: g0 */
                public String f11564g0;

                /* JADX INFO: renamed from: h0 */
                public String f11565h0;

                /* JADX INFO: renamed from: i */
                public String f11566i;

                /* JADX INFO: renamed from: i0 */
                public String f11567i0;

                /* JADX INFO: renamed from: j0 */
                public String f11568j0;

                /* JADX INFO: renamed from: k0 */
                public Date f11569k0;

                /* JADX INFO: renamed from: l0 */
                public final Map f11570l0;

                /* JADX INFO: renamed from: n0 */
                public ConcurrentHashMap f11572n0;

                /* JADX INFO: renamed from: v */
                public String f11573v;

                /* JADX INFO: renamed from: w */
                public String f11574w;

                /* JADX INFO: renamed from: W */
                public List f11548W = new ArrayList();

                /* JADX INFO: renamed from: m0 */
                public String f11571m0 = null;

                /* JADX INFO: renamed from: d */
                public String f11558d = Locale.getDefault().toString();

                public C1642r3(File file, Date date, ArrayList arrayList, String str, String str2, String str3, String str4, int i, String str5, Callable callable, String str6, String str7, String str8, Boolean bool, String str9, String str10, String str11, String str12, String str13, Map map) {
/* 4 */             this.f11552a = file;
/* 5 */             this.f11569k0 = date;
/* 6 */             this.f11547V = str5;
/* 7 */             this.f11554b = callable;
/* 8 */             this.f11556c = i;
/* 10 */            String str14 = HttpUrl.FRAGMENT_ENCODE_SET;
/* 10 */            this.f11560e = str6 == null ? HttpUrl.FRAGMENT_ENCODE_SET : str6;
/* 11 */            this.f11562f = str7 == null ? HttpUrl.FRAGMENT_ENCODE_SET : str7;
/* 12 */            this.f11574w = str8 != null ? str8 : HttpUrl.FRAGMENT_ENCODE_SET;
/* 13 */            this.f11546U = bool != null ? bool.booleanValue() : false;
/* 14 */            this.f11549X = str9 != null ? str9 : "0";
/* 15 */            this.f11566i = HttpUrl.FRAGMENT_ENCODE_SET;
/* 16 */            this.f11573v = "android";
/* 17 */            this.f11550Y = "android";
/* 18 */            this.f11551Z = str10 != null ? str10 : HttpUrl.FRAGMENT_ENCODE_SET;
/* 19 */            this.f11553a0 = arrayList;
/* 20 */            this.f11555b0 = str.isEmpty() ? "unknown" : str;
/* 21 */            this.f11557c0 = str4;
/* 22 */            this.f11559d0 = HttpUrl.FRAGMENT_ENCODE_SET;
/* 23 */            this.f11561e0 = str11 != null ? str11 : str14;
/* 24 */            this.f11563f0 = str2;
/* 25 */            this.f11564g0 = str3;
/* 26 */            this.f11565h0 = AbstractC1417a.m5172j();
/* 27 */            this.f11567i0 = str12 != null ? str12 : "production";
/* 28 */            this.f11568j0 = str13;
/* 29 */            if (!str13.equals("normal") && !this.f11568j0.equals("timeout") && !this.f11568j0.equals("backgrounded")) {
/* 32 */                this.f11568j0 = "normal";
                    }
/* 33 */            this.f11570l0 = map;
                }

                @Override // io.sentry.InterfaceC1458g2
                public final void serialize(InterfaceC1518j3 interfaceC1518j3, ILogger iLogger) throws IOException {
/* 1 */             C1505c c1505c = (C1505c) interfaceC1518j3;
/* 3 */             c1505c.m5287i();
/* 8 */             c1505c.m5291p("android_api_level");
/* 17 */            c1505c.m5297v(iLogger, Integer.valueOf(this.f11556c));
/* 22 */            c1505c.m5291p("device_locale");
/* 27 */            c1505c.m5297v(iLogger, this.f11558d);
/* 32 */            c1505c.m5291p("device_manufacturer");
/* 37 */            c1505c.m5300y(this.f11560e);
/* 42 */            c1505c.m5291p("device_model");
/* 47 */            c1505c.m5300y(this.f11562f);
/* 52 */            c1505c.m5291p("device_os_build_number");
/* 57 */            c1505c.m5300y(this.f11566i);
/* 62 */            c1505c.m5291p("device_os_name");
/* 67 */            c1505c.m5300y(this.f11573v);
/* 72 */            c1505c.m5291p("device_os_version");
/* 77 */            c1505c.m5300y(this.f11574w);
/* 82 */            c1505c.m5291p("device_is_emulator");
/* 87 */            c1505c.m5301z(this.f11546U);
/* 92 */            c1505c.m5291p("architecture");
/* 97 */            c1505c.m5297v(iLogger, this.f11547V);
/* 102 */           c1505c.m5291p("device_cpu_frequencies");
/* 107 */           c1505c.m5297v(iLogger, this.f11548W);
/* 112 */           c1505c.m5291p("device_physical_memory_bytes");
/* 117 */           c1505c.m5300y(this.f11549X);
/* 122 */           c1505c.m5291p("platform");
/* 127 */           c1505c.m5300y(this.f11550Y);
/* 132 */           c1505c.m5291p("build_id");
/* 137 */           c1505c.m5300y(this.f11551Z);
/* 142 */           c1505c.m5291p("transaction_name");
/* 147 */           c1505c.m5300y(this.f11555b0);
/* 152 */           c1505c.m5291p("duration_ns");
/* 157 */           c1505c.m5300y(this.f11557c0);
/* 162 */           c1505c.m5291p("version_name");
/* 167 */           c1505c.m5300y(this.f11561e0);
/* 172 */           c1505c.m5291p("version_code");
/* 177 */           c1505c.m5300y(this.f11559d0);
/* 180 */           ArrayList arrayList = this.f11553a0;
/* 186 */           if (!arrayList.isEmpty()) {
/* 190 */               c1505c.m5291p("transactions");
/* 193 */               c1505c.m5297v(iLogger, arrayList);
                    }
/* 198 */           c1505c.m5291p(FirebaseAnalytics.Param.TRANSACTION_ID);
/* 203 */           c1505c.m5300y(this.f11563f0);
/* 208 */           c1505c.m5291p("trace_id");
/* 213 */           c1505c.m5300y(this.f11564g0);
/* 218 */           c1505c.m5291p("profile_id");
/* 223 */           c1505c.m5300y(this.f11565h0);
/* 228 */           c1505c.m5291p("environment");
/* 233 */           c1505c.m5300y(this.f11567i0);
/* 238 */           c1505c.m5291p("truncation_reason");
/* 243 */           c1505c.m5300y(this.f11568j0);
/* 248 */           if (this.f11571m0 != null) {
/* 252 */               c1505c.m5291p("sampled_profile");
/* 257 */               c1505c.m5300y(this.f11571m0);
                    }
/* 264 */           String str = ((C1732c) c1505c.f11042b).f11787d;
/* 268 */           c1505c.m5294s(HttpUrl.FRAGMENT_ENCODE_SET);
/* 273 */           c1505c.m5291p("measurements");
/* 278 */           c1505c.m5297v(iLogger, this.f11570l0);
/* 281 */           c1505c.m5294s(str);
/* 286 */           c1505c.m5291p("timestamp");
/* 291 */           c1505c.m5297v(iLogger, this.f11569k0);
/* 294 */           ConcurrentHashMap concurrentHashMap = this.f11572n0;
/* 296 */           if (concurrentHashMap != null) {
/* 310 */               for (String str2 : concurrentHashMap.keySet()) {
/* 320 */                   AbstractC0298j.m1863d(this.f11572n0, str2, c1505c, str2, iLogger);
                        }
                    }
/* 324 */           c1505c.m5288l();
                }
            }
