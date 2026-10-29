            package io.sentry;

            import com.appsflyer.internal.AbstractC0298j;
            import io.sentry.android.core.SentryAndroidOptions;
            import io.sentry.internal.debugmeta.C1505c;
            import io.sentry.util.AbstractC1714m;
            import java.io.IOException;
            import java.util.concurrent.ConcurrentHashMap;
            
            /* JADX INFO: renamed from: io.sentry.n4 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1565n4 implements InterfaceC1458g2 {

                /* JADX INFO: renamed from: U */
                public boolean f11164U;

                /* JADX INFO: renamed from: V */
                public boolean f11165V;

                /* JADX INFO: renamed from: W */
                public EnumC1634q3 f11166W;

                /* JADX INFO: renamed from: X */
                public ConcurrentHashMap f11167X;

                /* JADX INFO: renamed from: a */
                public boolean f11168a;

                /* JADX INFO: renamed from: b */
                public Double f11169b;

                /* JADX INFO: renamed from: c */
                public boolean f11170c;

                /* JADX INFO: renamed from: d */
                public Double f11171d;

                /* JADX INFO: renamed from: e */
                public String f11172e;

                /* JADX INFO: renamed from: f */
                public boolean f11173f;

                /* JADX INFO: renamed from: i */
                public boolean f11174i;

                /* JADX INFO: renamed from: v */
                public int f11175v;

                /* JADX INFO: renamed from: w */
                public boolean f11176w;

                public C1565n4(SentryAndroidOptions sentryAndroidOptions, C1671t3 c1671t3) {
/* 12 */            this.f11170c = ((Boolean) c1671t3.f11667a).booleanValue();
/* 18 */            this.f11171d = (Double) c1671t3.f11668b;
/* 28 */            this.f11168a = ((Boolean) c1671t3.f11670d).booleanValue();
/* 34 */            this.f11169b = (Double) c1671t3.f11671e;
/* 36 */            C1493i7 internalTracesSampler = sentryAndroidOptions.getInternalTracesSampler();
/* 44 */            double dM5480c = AbstractC1714m.m5481a().m5480c();
/* 50 */            Double profileSessionSampleRate = internalTracesSampler.f11014a.getProfileSessionSampleRate();
/* 67 */            this.f11176w = profileSessionSampleRate != null && profileSessionSampleRate.doubleValue() >= dM5480c;
/* 73 */            this.f11172e = sentryAndroidOptions.getProfilingTracesDirPath();
/* 79 */            this.f11173f = sentryAndroidOptions.isProfilingEnabled();
/* 85 */            this.f11174i = sentryAndroidOptions.isContinuousProfilingEnabled();
/* 91 */            this.f11166W = sentryAndroidOptions.getProfileLifecycle();
/* 97 */            this.f11175v = sentryAndroidOptions.getProfilingTracesHz();
/* 103 */           this.f11164U = sentryAndroidOptions.isEnableAppStartProfiling();
/* 109 */           this.f11165V = sentryAndroidOptions.isStartProfilerOnAppStart();
                }

                @Override // io.sentry.InterfaceC1458g2
                public final void serialize(InterfaceC1518j3 interfaceC1518j3, ILogger iLogger) throws IOException {
/* 1 */             C1505c c1505c = (C1505c) interfaceC1518j3;
/* 3 */             c1505c.m5287i();
/* 8 */             c1505c.m5291p("profile_sampled");
/* 17 */            c1505c.m5297v(iLogger, Boolean.valueOf(this.f11168a));
/* 22 */            c1505c.m5291p("profile_sample_rate");
/* 27 */            c1505c.m5297v(iLogger, this.f11169b);
/* 32 */            c1505c.m5291p("continuous_profile_sampled");
/* 41 */            c1505c.m5297v(iLogger, Boolean.valueOf(this.f11176w));
/* 46 */            c1505c.m5291p("trace_sampled");
/* 55 */            c1505c.m5297v(iLogger, Boolean.valueOf(this.f11170c));
/* 60 */            c1505c.m5291p("trace_sample_rate");
/* 65 */            c1505c.m5297v(iLogger, this.f11171d);
/* 70 */            c1505c.m5291p("profiling_traces_dir_path");
/* 75 */            c1505c.m5297v(iLogger, this.f11172e);
/* 80 */            c1505c.m5291p("is_profiling_enabled");
/* 89 */            c1505c.m5297v(iLogger, Boolean.valueOf(this.f11173f));
/* 94 */            c1505c.m5291p("is_continuous_profiling_enabled");
/* 103 */           c1505c.m5297v(iLogger, Boolean.valueOf(this.f11174i));
/* 108 */           c1505c.m5291p("profile_lifecycle");
/* 117 */           c1505c.m5297v(iLogger, this.f11166W.name());
/* 122 */           c1505c.m5291p("profiling_traces_hz");
/* 131 */           c1505c.m5297v(iLogger, Integer.valueOf(this.f11175v));
/* 136 */           c1505c.m5291p("is_enable_app_start_profiling");
/* 145 */           c1505c.m5297v(iLogger, Boolean.valueOf(this.f11164U));
/* 150 */           c1505c.m5291p("is_start_profiler_on_app_start");
/* 159 */           c1505c.m5297v(iLogger, Boolean.valueOf(this.f11165V));
/* 162 */           ConcurrentHashMap concurrentHashMap = this.f11167X;
/* 164 */           if (concurrentHashMap != null) {
/* 178 */               for (String str : concurrentHashMap.keySet()) {
/* 188 */                   AbstractC0298j.m1863d(this.f11167X, str, c1505c, str, iLogger);
                        }
                    }
/* 192 */           c1505c.m5288l();
                }
            }
