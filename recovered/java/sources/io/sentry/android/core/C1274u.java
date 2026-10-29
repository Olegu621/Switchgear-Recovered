            package io.sentry.android.core;

            import android.net.TrafficStats;
            import android.util.Log;
            import io.sentry.EnumC1553m5;
            import io.sentry.ILogger;
            import io.sentry.InterfaceC1516j1;
            import io.sentry.logger.InterfaceC1542b;
            import io.sentry.logger.InterfaceC1543c;
            import io.sentry.metrics.InterfaceC1556a;
            import io.sentry.metrics.InterfaceC1557b;
            import p000.u93;
            
            /* JADX INFO: renamed from: io.sentry.android.core.u */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 10 */    public final class C1274u implements InterfaceC1516j1, InterfaceC1284x0, ILogger, InterfaceC1543c, InterfaceC1557b {

                /* JADX INFO: renamed from: b */
                public static final C1274u f10341b = new C1274u(0);

                /* JADX INFO: renamed from: c */
                public static final C1274u f10342c = new C1274u(1);

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f10343a;

                public /* synthetic */ C1274u(int i) {
/* 1 */             this.f10343a = i;
                }

                @Override // io.sentry.InterfaceC1516j1
                /* JADX INFO: renamed from: a */
                public void mo4941a() {
/* 1 */             TrafficStats.clearThreadStatsTag();
                }

                @Override // io.sentry.ILogger
                /* JADX INFO: renamed from: b */
                public void mo4670b(EnumC1553m5 enumC1553m5, Throwable th, String str, Object... objArr) {
                    switch (this.f10343a) {
                        case 2:
/* 22 */                    if (objArr.length != 0) {
/* 32 */                        mo4671d(enumC1553m5, String.format(str, objArr), th);
                            } else {
/* 24 */                        mo4671d(enumC1553m5, str, th);
                            }
                            break;
                        default:
/* 7 */                     if (objArr.length != 0) {
/* 17 */                        mo4671d(enumC1553m5, String.format(str, objArr), th);
                            } else {
/* 9 */                         mo4671d(enumC1553m5, str, th);
                            }
                            break;
                    }
                }

                @Override // io.sentry.logger.InterfaceC1543c
                /* JADX INFO: renamed from: c */
                public InterfaceC1542b mo4942c(SentryAndroidOptions sentryAndroidOptions, u93 u93Var) {
/* 3 */             C1241m c1241m = new C1241m(sentryAndroidOptions, u93Var);
/* 8 */             C1191g0.f10017e.m4788c(c1241m);
/* 11 */            return c1241m;
                }

                @Override // io.sentry.ILogger
                /* JADX INFO: renamed from: d */
                public void mo4671d(EnumC1553m5 enumC1553m5, String str, Throwable th) {
                    switch (this.f10343a) {
                        case 2:
/* 24 */                    Log.wtf("Sentry", str, th);
                            break;
                        default:
/* 17 */                    if (AbstractC1235k.f10207a[enumC1553m5.ordinal()] == 4) {
/* 20 */                        Log.wtf("Sentry", str, th);
                                break;
                            }
                            break;
                    }
                }

                @Override // io.sentry.InterfaceC1516j1
                /* JADX INFO: renamed from: e */
                public void mo4944e() {
/* 4 */             TrafficStats.setThreadStatsTag(61441);
                }

                @Override // io.sentry.ILogger
                /* JADX INFO: renamed from: k */
                public void mo4672k(EnumC1553m5 enumC1553m5, String str, Object... objArr) {
/* 5 */             int i = 7;
                    switch (this.f10343a) {
                        case 2:
/* 68 */                    if (objArr.length != 0) {
/* 78 */                        Log.println(7, "Sentry", String.format(str, objArr));
                            } else {
/* 70 */                        Log.println(7, "Sentry", str);
                            }
                            break;
                        default:
/* 15 */                    if (objArr.length != 0) {
/* 46 */                        int i2 = AbstractC1235k.f10207a[enumC1553m5.ordinal()];
/* 48 */                        if (i2 == 1) {
/* 58 */                            i = 4;
                                } else if (i2 == 2) {
/* 56 */                            i = 5;
                                } else if (i2 != 4) {
/* 54 */                            i = 3;
                                }
/* 63 */                        Log.println(i, "Sentry", String.format(str, objArr));
                            } else {
/* 23 */                        int i3 = AbstractC1235k.f10207a[enumC1553m5.ordinal()];
/* 25 */                        if (i3 == 1) {
/* 35 */                            i = 4;
                                } else if (i3 == 2) {
/* 33 */                            i = 5;
                                } else if (i3 != 4) {
/* 31 */                            i = 3;
                                }
/* 36 */                        Log.println(i, "Sentry", str);
                            }
                            break;
                    }
                }

                @Override // io.sentry.ILogger
                /* JADX INFO: renamed from: m */
                public boolean mo4673m(EnumC1553m5 enumC1553m5) {
                    switch (this.f10343a) {
                    }
/* 6 */             return true;
                }

                @Override // io.sentry.metrics.InterfaceC1557b
                /* JADX INFO: renamed from: c */
/* 11 */        public InterfaceC1556a mo4943c(SentryAndroidOptions sentryAndroidOptions, u93 u93Var) {
/* 13 */            C1247o c1247o = new C1247o(sentryAndroidOptions, u93Var);
/* 15 */            C1191g0.f10017e.m4788c(c1247o);
                    return c1247o;
                }
            }
