            package io.sentry.android.core;

            import android.app.Application;
            import android.content.Context;
            import android.content.pm.PackageInfo;
            import android.os.Process;
            import io.sentry.EnumC1448f4;
            import io.sentry.EnumC1553m5;
            import io.sentry.EnumC1727v5;
            import io.sentry.InterfaceC1156a1;
            import io.sentry.InterfaceC1159a4;
            import io.sentry.InterfaceC1537l4;
            import io.sentry.InterfaceC1549m1;
            import io.sentry.android.core.anr.AbstractC1171e;
            import io.sentry.android.core.internal.util.C1231r;
            import io.sentry.android.core.performance.C1259g;
            import io.sentry.android.core.performance.C1260h;
            import io.sentry.util.C1702a;
            import io.sentry.util.C1709h;
            import java.io.File;
            
            /* JADX INFO: renamed from: io.sentry.android.core.e */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final /* synthetic */ class C1184e implements InterfaceC1159a4, InterfaceC1537l4 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ Object f9997a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ Object f9998b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ Object f9999c;

                public /* synthetic */ C1184e(Object obj, Object obj2, Object obj3) {
/* 1 */             this.f9997a = obj;
/* 3 */             this.f9998b = obj2;
/* 5 */             this.f9999c = obj3;
                }

                @Override // io.sentry.InterfaceC1159a4
                /* JADX INFO: renamed from: c */
                public void mo4715c(InterfaceC1549m1 interfaceC1549m1) {
/* 3 */             ActivityLifecycleIntegration activityLifecycleIntegration = (ActivityLifecycleIntegration) this.f9997a;
/* 7 */             InterfaceC1156a1 interfaceC1156a1 = (InterfaceC1156a1) this.f9998b;
/* 11 */            InterfaceC1549m1 interfaceC1549m2 = (InterfaceC1549m1) this.f9999c;
/* 13 */            if (interfaceC1549m1 == null) {
/* 15 */                interfaceC1156a1.mo4685I(interfaceC1549m2);
/* 18 */                return;
                    }
/* 19 */            SentryAndroidOptions sentryAndroidOptions = activityLifecycleIntegration.f9830d;
/* 21 */            if (sentryAndroidOptions != null) {
/* 39 */                sentryAndroidOptions.getLogger().mo4672k(EnumC1553m5.DEBUG, "Transaction '%s' won't be bound to the Scope since there's one already in there.", interfaceC1549m2.getName());
                    }
                }

                @Override // io.sentry.InterfaceC1537l4
                /* JADX INFO: renamed from: d */
                public void mo3668d(SentryAndroidOptions sentryAndroidOptions) {
/* 3 */             C1274u c1274u = (C1274u) this.f9997a;
/* 8 */             Context context = (Context) this.f9998b;
/* 12 */            InterfaceC1537l4 interfaceC1537l4 = (InterfaceC1537l4) this.f9999c;
/* 16 */            boolean zM5473b = C1709h.m5473b(sentryAndroidOptions, "timber.log.Timber");
/* 40 */            boolean z = C1709h.m5473b(sentryAndroidOptions, "androidx.fragment.app.FragmentManager$FragmentLifecycleCallbacks") && C1709h.m5473b(sentryAndroidOptions, "io.sentry.android.fragment.FragmentLifecycleIntegration");
/* 53 */            boolean z2 = zM5473b && C1709h.m5473b(sentryAndroidOptions, "io.sentry.android.timber.SentryTimberIntegration");
/* 56 */            boolean zM5473b2 = C1709h.m5473b(sentryAndroidOptions, "io.sentry.android.replay.ReplayIntegration");
/* 62 */            boolean zM5473b3 = C1709h.m5473b(sentryAndroidOptions, "io.sentry.android.distribution.DistributionIntegration");
/* 68 */            C1248o0 c1248o0 = new C1248o0(c1274u);
/* 74 */            C1709h c1709h = new C1709h();
/* 79 */            C1181d c1181d = new C1181d(c1709h, sentryAndroidOptions);
/* 82 */            Context applicationContext = context.getApplicationContext();
/* 86 */            if (applicationContext == null) {
/* 89 */                applicationContext = context;
                    }
/* 90 */            sentryAndroidOptions.setLogger(c1274u);
/* 99 */            sentryAndroidOptions.setFatalLogger(new C1274u(2));
/* 104 */           sentryAndroidOptions.setDefaultScopeType(EnumC1448f4.CURRENT);
/* 109 */           sentryAndroidOptions.setOpenTelemetryMode(EnumC1727v5.OFF);
/* 117 */           sentryAndroidOptions.setDateProvider(new C1234j1());
/* 130 */           sentryAndroidOptions.getLogs().f10915b = new C1274u(4);
/* 142 */           sentryAndroidOptions.getMetrics().f10941b = new C1274u(5);
/* 146 */           sentryAndroidOptions.setFlushTimeoutMillis(4000L);
/* 154 */           sentryAndroidOptions.setFrameMetricsCollector(new C1231r(applicationContext, c1274u, c1248o0));
/* 157 */           AbstractC1245n0.m4875c(applicationContext, c1248o0, sentryAndroidOptions);
/* 175 */           sentryAndroidOptions.setCacheDirPath(new File(applicationContext.getCacheDir(), "sentry").getAbsolutePath());
/* 180 */           AbstractC1171e.f9959a.set(true);
/* 183 */           PackageInfo packageInfoM4880h = AbstractC1245n0.m4880h(applicationContext, c1248o0);
/* 187 */           if (packageInfoM4880h != null) {
/* 193 */               if (sentryAndroidOptions.getRelease() == null) {
/* 231 */                   sentryAndroidOptions.setRelease(packageInfoM4880h.packageName + "@" + packageInfoM4880h.versionName + "+" + AbstractC1245n0.m4881i(packageInfoM4880h, c1248o0));
                        }
/* 234 */               String str = packageInfoM4880h.packageName;
/* 236 */               if (str != null && !str.startsWith("android.")) {
/* 246 */                   sentryAndroidOptions.addInAppInclude(str);
                        }
                    }
/* 253 */           if (sentryAndroidOptions.getDistinctId() == null) {
                        try {
/* 259 */                   sentryAndroidOptions.setDistinctId(AbstractC1287y0.m4963a(applicationContext));
                        } catch (RuntimeException e) {
/* 272 */                   sentryAndroidOptions.getLogger().mo4671d(EnumC1553m5.ERROR, "Could not generate distinct Id.", e);
                        }
                    }
/* 275 */           C1191g0 c1191g0 = C1191g0.f10017e;
/* 279 */           if (c1191g0.f10019b == null) {
/* 282 */               C1702a c1702a = c1191g0.f10018a;
/* 284 */               c1702a.m5443c();
                        try {
/* 291 */                   c1191g0.m4790g(sentryAndroidOptions.getLogger());
/* 294 */                   c1702a.close();
                        } catch (Throwable th) {
                            try {
/* 391 */                       c1702a.close();
/* 400 */                       throw th;
                            } catch (Throwable th2) {
/* 397 */                       th.addSuppressed(th2);
/* 400 */                       throw th;
                            }
                        }
                    }
/* 297 */           sentryAndroidOptions.activate();
/* 301 */           AbstractC1262q.m4922b(context, sentryAndroidOptions, c1248o0, c1709h, c1181d, z, z2, zM5473b2, zM5473b3);
/* 306 */           boolean z3 = z;
                    try {
/* 308 */               interfaceC1537l4.mo3668d(sentryAndroidOptions);
                    } catch (Throwable th3) {
/* 322 */               sentryAndroidOptions.getLogger().mo4671d(EnumC1553m5.ERROR, "Error in the 'OptionsConfiguration.configure' callback.", th3);
                    }
/* 325 */           C1259g c1259gM4907c = C1259g.m4907c();
/* 335 */           if (sentryAndroidOptions.isEnablePerformanceV2()) {
/* 337 */               C1260h c1260h = c1259gM4907c.f10269d;
/* 343 */               if (c1260h.f10283c == 0) {
/* 349 */                   c1260h.m4920f(Process.getStartUptimeMillis());
                        }
                    }
/* 358 */           if (context.getApplicationContext() instanceof Application) {
/* 366 */               c1259gM4907c.m4913g((Application) context.getApplicationContext());
                    }
/* 369 */           C1260h c1260h2 = c1259gM4907c.f10271e;
/* 375 */           if (c1260h2.f10283c == 0) {
/* 379 */               c1260h2.m4920f(AbstractC1198i1.f10067a);
                    }
/* 382 */           AbstractC1262q.m4921a(sentryAndroidOptions, context, c1248o0, c1709h, c1181d, zM5473b2);
/* 385 */           AbstractC1198i1.m4809a(sentryAndroidOptions, z3, z2);
                }
            }
