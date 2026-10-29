            package io.sentry;

            import androidx.core.app.NotificationCompat;
            import com.appsflyer.internal.AbstractC0298j;
            import io.sentry.internal.debugmeta.C1505c;
            import io.sentry.util.C1702a;
            import java.io.IOException;
            import java.util.Date;
            import java.util.Locale;
            import java.util.concurrent.ConcurrentHashMap;
            import java.util.concurrent.atomic.AtomicInteger;
            
            /* JADX INFO: renamed from: io.sentry.z6 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1764z6 implements InterfaceC1458g2 {

                /* JADX INFO: renamed from: U */
                public final String f11854U;

                /* JADX INFO: renamed from: V */
                public String f11855V;

                /* JADX INFO: renamed from: W */
                public final String f11856W;

                /* JADX INFO: renamed from: X */
                public final String f11857X;

                /* JADX INFO: renamed from: Y */
                public String f11858Y;

                /* JADX INFO: renamed from: Z */
                public final C1702a f11859Z = new C1702a();

                /* JADX INFO: renamed from: a */
                public final Date f11860a;

                /* JADX INFO: renamed from: a0 */
                public ConcurrentHashMap f11861a0;

                /* JADX INFO: renamed from: b */
                public Date f11862b;

                /* JADX INFO: renamed from: c */
                public final AtomicInteger f11863c;

                /* JADX INFO: renamed from: d */
                public final String f11864d;

                /* JADX INFO: renamed from: e */
                public final String f11865e;

                /* JADX INFO: renamed from: f */
                public Boolean f11866f;

                /* JADX INFO: renamed from: i */
                public EnumC1756y6 f11867i;

                /* JADX INFO: renamed from: v */
                public Long f11868v;

                /* JADX INFO: renamed from: w */
                public Double f11869w;

                public C1764z6(EnumC1756y6 enumC1756y6, Date date, Date date2, int i, String str, String str2, Boolean bool, Long l, Double d, String str3, String str4, String str5, String str6, String str7) {
/* 11 */            this.f11867i = enumC1756y6;
/* 13 */            this.f11860a = date;
/* 15 */            this.f11862b = date2;
/* 22 */            this.f11863c = new AtomicInteger(i);
/* 24 */            this.f11864d = str;
/* 26 */            this.f11865e = str2;
/* 28 */            this.f11866f = bool;
/* 30 */            this.f11868v = l;
/* 32 */            this.f11869w = d;
/* 34 */            this.f11854U = str3;
/* 36 */            this.f11855V = str4;
/* 38 */            this.f11856W = str5;
/* 40 */            this.f11857X = str6;
/* 42 */            this.f11858Y = str7;
                }

                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final C1764z6 clone() {
/* 35 */            return new C1764z6(this.f11867i, this.f11860a, this.f11862b, this.f11863c.get(), this.f11864d, this.f11865e, this.f11866f, this.f11868v, this.f11869w, this.f11854U, this.f11855V, this.f11856W, this.f11857X, this.f11858Y);
                }

                /* JADX INFO: renamed from: b */
                public final void m5527b(Date date) {
/* 1 */             C1702a c1702a = this.f11859Z;
/* 3 */             c1702a.m5443c();
                    try {
/* 7 */                 this.f11866f = null;
/* 13 */                if (this.f11867i == EnumC1756y6.Ok) {
/* 17 */                    this.f11867i = EnumC1756y6.Exited;
                        }
/* 22 */                if (date != null) {
/* 24 */                    this.f11862b = date;
                        } else {
/* 32 */                    this.f11862b = new Date();
                        }
/* 34 */                Date date2 = this.f11862b;
/* 36 */                if (date2 != null) {
/* 64 */                    this.f11869w = Double.valueOf(Math.abs(date2.getTime() - this.f11860a.getTime()) / 1000.0d);
/* 68 */                    long time = this.f11862b.getTime();
/* 76 */                    if (time < 0) {
/* 78 */                        time = Math.abs(time);
                            }
/* 86 */                    this.f11868v = Long.valueOf(time);
                        }
/* 88 */                c1702a.close();
                    } catch (Throwable th) {
                        try {
/* 92 */                    c1702a.close();
                        } catch (Throwable th2) {
/* 97 */                    th.addSuppressed(th2);
                        }
/* 100 */               throw th;
                    }
                }

                /* JADX INFO: renamed from: c */
                public final boolean m5528c(EnumC1756y6 enumC1756y6, String str, boolean z, String str2) {
                    boolean z2;
/* 1 */             C1702a c1702a = this.f11859Z;
/* 3 */             c1702a.m5443c();
/* 6 */             boolean z3 = true;
/* 7 */             if (enumC1756y6 != null) {
                        try {
/* 9 */                     this.f11867i = enumC1756y6;
/* 11 */                    z2 = true;
                        } catch (Throwable th) {
                            try {
/* 68 */                        c1702a.close();
                            } catch (Throwable th2) {
/* 73 */                        th.addSuppressed(th2);
                            }
/* 76 */                    throw th;
                        }
                    } else {
/* 15 */                z2 = false;
                    }
/* 16 */            if (str != null) {
/* 18 */                this.f11855V = str;
/* 20 */                z2 = true;
                    }
/* 21 */            if (z) {
/* 25 */                this.f11863c.addAndGet(1);
/* 28 */                z2 = true;
                    }
/* 29 */            if (str2 != null) {
/* 31 */                this.f11858Y = str2;
                    } else {
/* 34 */                z3 = z2;
                    }
/* 35 */            if (z3) {
/* 38 */                this.f11866f = null;
/* 42 */                Date date = new Date();
/* 45 */                this.f11862b = date;
/* 47 */                long time = date.getTime();
/* 55 */                if (time < 0) {
/* 57 */                    time = Math.abs(time);
                        }
/* 65 */                this.f11868v = Long.valueOf(time);
                    }
/* 77 */            c1702a.close();
/* 80 */            return z3;
                }

                @Override // io.sentry.InterfaceC1458g2
                public final void serialize(InterfaceC1518j3 interfaceC1518j3, ILogger iLogger) throws IOException {
/* 1 */             C1505c c1505c = (C1505c) interfaceC1518j3;
/* 3 */             c1505c.m5287i();
/* 6 */             String str = this.f11865e;
/* 8 */             if (str != null) {
/* 12 */                c1505c.m5291p("sid");
/* 15 */                c1505c.m5300y(str);
                    }
/* 18 */            String str2 = this.f11864d;
/* 20 */            if (str2 != null) {
/* 24 */                c1505c.m5291p("did");
/* 27 */                c1505c.m5300y(str2);
                    }
/* 32 */            if (this.f11866f != null) {
/* 36 */                c1505c.m5291p("init");
/* 41 */                c1505c.m5298w(this.f11866f);
                    }
/* 46 */            c1505c.m5291p("started");
/* 51 */            c1505c.m5297v(iLogger, this.f11860a);
/* 56 */            c1505c.m5291p(NotificationCompat.CATEGORY_STATUS);
/* 71 */            c1505c.m5297v(iLogger, this.f11867i.name().toLowerCase(Locale.ROOT));
/* 76 */            if (this.f11868v != null) {
/* 80 */                c1505c.m5291p("seq");
/* 85 */                c1505c.m5299x(this.f11868v);
                    }
/* 90 */            c1505c.m5291p("errors");
/* 100 */           c1505c.m5296u(this.f11863c.intValue());
/* 105 */           if (this.f11869w != null) {
/* 109 */               c1505c.m5291p("duration");
/* 114 */               c1505c.m5299x(this.f11869w);
                    }
/* 119 */           if (this.f11862b != null) {
/* 123 */               c1505c.m5291p("timestamp");
/* 128 */               c1505c.m5297v(iLogger, this.f11862b);
                    }
/* 133 */           if (this.f11858Y != null) {
/* 137 */               c1505c.m5291p("abnormal_mechanism");
/* 142 */               c1505c.m5297v(iLogger, this.f11858Y);
                    }
/* 147 */           c1505c.m5291p("attrs");
/* 150 */           c1505c.m5287i();
/* 155 */           c1505c.m5291p("release");
/* 160 */           c1505c.m5297v(iLogger, this.f11857X);
/* 163 */           String str3 = this.f11856W;
/* 165 */           if (str3 != null) {
/* 169 */               c1505c.m5291p("environment");
/* 172 */               c1505c.m5297v(iLogger, str3);
                    }
/* 175 */           String str4 = this.f11854U;
/* 177 */           if (str4 != null) {
/* 181 */               c1505c.m5291p("ip_address");
/* 184 */               c1505c.m5297v(iLogger, str4);
                    }
/* 189 */           if (this.f11855V != null) {
/* 193 */               c1505c.m5291p("user_agent");
/* 198 */               c1505c.m5297v(iLogger, this.f11855V);
                    }
/* 201 */           c1505c.m5288l();
/* 204 */           ConcurrentHashMap concurrentHashMap = this.f11861a0;
/* 206 */           if (concurrentHashMap != null) {
/* 220 */               for (String str5 : concurrentHashMap.keySet()) {
/* 230 */                   AbstractC0298j.m1863d(this.f11861a0, str5, c1505c, str5, iLogger);
                        }
                    }
/* 234 */           c1505c.m5288l();
                }
            }
