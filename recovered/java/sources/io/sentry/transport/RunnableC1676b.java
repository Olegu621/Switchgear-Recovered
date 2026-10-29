            package io.sentry.transport;

            import io.sentry.C1486i0;
            import io.sentry.C1726v4;
            import io.sentry.EnumC1553m5;
            import io.sentry.android.core.SentryAndroidOptions;
            import io.sentry.cache.InterfaceC1399d;
            import io.sentry.clientreport.EnumC1414d;
            import io.sentry.config.AbstractC1417a;
            import io.sentry.hints.AbstractC1475c;
            import io.sentry.hints.InterfaceC1480h;
            import io.sentry.hints.InterfaceC1483k;
            import io.sentry.internal.debugmeta.C1505c;
            import io.sentry.util.AbstractC1704c;
            import java.io.IOException;
            import java.util.Date;
            
            /* JADX INFO: renamed from: io.sentry.transport.b */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class RunnableC1676b implements Runnable {

                /* JADX INFO: renamed from: a */
                public final C1505c f11680a;

                /* JADX INFO: renamed from: b */
                public final C1486i0 f11681b;

                /* JADX INFO: renamed from: c */
                public final InterfaceC1399d f11682c;

                /* JADX INFO: renamed from: d */
                public final C1692r f11683d = new C1692r(-1);

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ C1677c f11684e;

                public RunnableC1676b(C1677c c1677c, C1505c c1505c, C1486i0 c1486i0, InterfaceC1399d interfaceC1399d) {
/* 4 */             this.f11684e = c1677c;
/* 16 */            AbstractC1704c.m5462q(c1505c, "Envelope is required.");
/* 19 */            this.f11680a = c1505c;
/* 21 */            this.f11681b = c1486i0;
/* 25 */            AbstractC1704c.m5462q(interfaceC1399d, "EnvelopeCache is required.");
/* 28 */            this.f11682c = interfaceC1399d;
                }

                /* JADX INFO: renamed from: a */
                public static /* synthetic */ void m5415a(RunnableC1676b runnableC1676b, AbstractC1417a abstractC1417a, InterfaceC1483k interfaceC1483k) {
/* 25 */            runnableC1676b.f11684e.f11687c.getLogger().mo4672k(EnumC1553m5.DEBUG, "Marking envelope submission result: %s", Boolean.valueOf(abstractC1417a.mo5184s()));
/* 32 */            interfaceC1483k.mo4953b(abstractC1417a.mo5184s());
                }

                /* JADX INFO: renamed from: b */
                public final AbstractC1417a m5416b() {
/* 5 */             C1505c c1505c = this.f11680a;
/* 12 */            ((C1726v4) c1505c.f11042b).f11763d = null;
/* 14 */            InterfaceC1399d interfaceC1399d = this.f11682c;
/* 16 */            C1486i0 c1486i0 = this.f11681b;
/* 18 */            boolean zMo4775K = interfaceC1399d.mo4775K(c1505c, c1486i0);
/* 24 */            Object objM5273b = c1486i0.m5273b("sentry:typeCheckHint");
/* 34 */            boolean zIsInstance = AbstractC1475c.class.isInstance(c1486i0.m5273b("sentry:typeCheckHint"));
/* 38 */            C1677c c1677c = this.f11684e;
/* 41 */            if (zIsInstance && objM5273b != null) {
/* 45 */                AbstractC1475c abstractC1475c = (AbstractC1475c) objM5273b;
/* 47 */                SentryAndroidOptions sentryAndroidOptions = c1677c.f11687c;
/* 59 */                if (abstractC1475c.mo4958f(((C1726v4) c1505c.f11042b).f11760a)) {
/* 63 */                    abstractC1475c.f10996a.countDown();
/* 76 */                    sentryAndroidOptions.getLogger().mo4672k(EnumC1553m5.DEBUG, "Disk flush envelope fired", new Object[0]);
                        } else {
/* 90 */                    sentryAndroidOptions.getLogger().mo4672k(EnumC1553m5.DEBUG, "Not firing envelope flush as there's an ongoing transaction", new Object[0]);
                        }
                    }
/* 93 */            SentryAndroidOptions sentryAndroidOptions2 = c1677c.f11687c;
/* 104 */           if (!c1677c.f11689e.isConnected()) {
/* 274 */               Object objM5273b2 = c1486i0.m5273b("sentry:typeCheckHint");
/* 282 */               boolean zIsInstance2 = InterfaceC1480h.class.isInstance(c1486i0.m5273b("sentry:typeCheckHint"));
/* 286 */               C1692r c1692r = this.f11683d;
/* 288 */               if (zIsInstance2 && objM5273b2 != null) {
/* 294 */                   ((InterfaceC1480h) objM5273b2).mo4954c(true);
/* 297 */                   return c1692r;
                        }
/* 298 */               if (!zMo4775K) {
/* 304 */                   AbstractC1704c.m5458m(InterfaceC1480h.class, objM5273b2, sentryAndroidOptions2.getLogger());
/* 313 */                   sentryAndroidOptions2.getClientReportRecorder().mo5159c(EnumC1414d.NETWORK_ERROR, c1505c);
                        }
/* 316 */               return c1692r;
                    }
/* 110 */           C1505c c1505cMo5162h = sentryAndroidOptions2.getClientReportRecorder().mo5162h(c1505c);
                    try {
/* 144 */               ((C1726v4) c1505cMo5162h.f11042b).f11763d = new Date((long) (sentryAndroidOptions2.getDateProvider().mo4856a().mo5278d() / 1000000.0d));
/* 148 */               AbstractC1417a abstractC1417aM5425d = c1677c.f11690f.m5425d(c1505cMo5162h);
/* 156 */               if (abstractC1417aM5425d.mo5184s()) {
/* 158 */                   interfaceC1399d.mo5124w1(c1505c);
/* 161 */                   return abstractC1417aM5425d;
                        }
/* 176 */               String str = "The transport failed to send the envelope with response code " + abstractC1417aM5425d.mo5183p();
/* 188 */               sentryAndroidOptions2.getLogger().mo4672k(EnumC1553m5.ERROR, str, new Object[0]);
/* 197 */               if (abstractC1417aM5425d.mo5183p() >= 400) {
/* 199 */                   interfaceC1399d.mo5124w1(c1505c);
/* 208 */                   if (abstractC1417aM5425d.mo5183p() != 429) {
/* 216 */                       sentryAndroidOptions2.getClientReportRecorder().mo5159c(EnumC1414d.SEND_ERROR, c1505cMo5162h);
                            }
                        }
/* 224 */               throw new IllegalStateException(str);
                    } catch (IOException e) {
/* 225 */               Object objM5273b3 = c1486i0.m5273b("sentry:typeCheckHint");
/* 237 */               if (InterfaceC1480h.class.isInstance(c1486i0.m5273b("sentry:typeCheckHint")) && objM5273b3 != null) {
/* 244 */                   ((InterfaceC1480h) objM5273b3).mo4954c(true);
                        } else if (!zMo4775K) {
/* 254 */                   AbstractC1704c.m5458m(InterfaceC1480h.class, objM5273b3, sentryAndroidOptions2.getLogger());
/* 263 */                   sentryAndroidOptions2.getClientReportRecorder().mo5159c(EnumC1414d.NETWORK_ERROR, c1505cMo5162h);
                        }
/* 273 */               throw new IllegalStateException("Sending the event failed.", e);
                    }
                }

                @Override // java.lang.Runnable
                public final void run() {
/* 7 */             this.f11684e.f11691i = this;
/* 9 */             AbstractC1417a abstractC1417aM5416b = this.f11683d;
                    try {
/* 13 */                abstractC1417aM5416b = m5416b();
/* 31 */                this.f11684e.f11687c.getLogger().mo4672k(EnumC1553m5.DEBUG, "Envelope flushed", new Object[0]);
/* 34 */                C1486i0 c1486i0 = this.f11681b;
/* 36 */                Object objM5273b = c1486i0.m5273b("sentry:typeCheckHint");
/* 48 */                if (InterfaceC1483k.class.isInstance(c1486i0.m5273b("sentry:typeCheckHint")) && objM5273b != null) {
/* 54 */                    m5415a(this, abstractC1417aM5416b, (InterfaceC1483k) objM5273b);
                        }
/* 59 */                this.f11684e.f11691i = null;
                    } catch (Throwable th) {
                        try {
/* 77 */                    this.f11684e.f11687c.getLogger().mo4670b(EnumC1553m5.ERROR, th, "Envelope submission failed", new Object[0]);
/* 80 */                    throw th;
                        } catch (Throwable th2) {
/* 82 */                    C1486i0 c1486i1 = this.f11681b;
/* 84 */                    Object objM5273b2 = c1486i1.m5273b("sentry:typeCheckHint");
/* 96 */                    if (InterfaceC1483k.class.isInstance(c1486i1.m5273b("sentry:typeCheckHint")) && objM5273b2 != null) {
/* 102 */                       m5415a(this, abstractC1417aM5416b, (InterfaceC1483k) objM5273b2);
                            }
/* 107 */                   this.f11684e.f11691i = null;
/* 109 */                   throw th2;
                        }
                    }
                }
            }
