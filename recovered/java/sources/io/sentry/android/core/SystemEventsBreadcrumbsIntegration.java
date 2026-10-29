            package io.sentry.android.core;

            import android.content.Context;
            import android.content.IntentFilter;
            import android.os.HandlerThread;
            import io.sentry.C1469h4;
            import io.sentry.EnumC1553m5;
            import io.sentry.InterfaceC1661s1;
            import io.sentry.util.C1702a;
            import java.io.Closeable;
            import java.util.concurrent.RejectedExecutionException;
            import java.util.concurrent.atomic.AtomicBoolean;
            import p000.f72;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class SystemEventsBreadcrumbsIntegration implements InterfaceC1661s1, Closeable, InterfaceC1182d0 {

                /* JADX INFO: renamed from: W */
                public C1279v1 f9896W;

                /* JADX INFO: renamed from: a */
                public final Context f9897a;

                /* JADX INFO: renamed from: b */
                public volatile C1282w1 f9898b;

                /* JADX INFO: renamed from: c */
                public SentryAndroidOptions f9899c;

                /* JADX INFO: renamed from: d */
                public C1469h4 f9900d;

                /* JADX INFO: renamed from: e */
                public final String[] f9901e;

                /* JADX INFO: renamed from: f */
                public volatile boolean f9902f = false;

                /* JADX INFO: renamed from: i */
                public volatile boolean f9903i = false;

                /* JADX INFO: renamed from: v */
                public volatile IntentFilter f9904v = null;

                /* JADX INFO: renamed from: w */
                public volatile HandlerThread f9905w = null;

                /* JADX INFO: renamed from: U */
                public final AtomicBoolean f9894U = new AtomicBoolean(false);

                /* JADX INFO: renamed from: V */
                public final C1702a f9895V = new C1702a();

                public SystemEventsBreadcrumbsIntegration(Context context) {
/* 41 */            String[] strArr = {"android.intent.action.ACTION_SHUTDOWN", "android.intent.action.AIRPLANE_MODE", "android.intent.action.BATTERY_CHANGED", "android.intent.action.CAMERA_BUTTON", "android.intent.action.CONFIGURATION_CHANGED", "android.intent.action.DATE_CHANGED", "android.intent.action.DEVICE_STORAGE_LOW", "android.intent.action.DEVICE_STORAGE_OK", "android.intent.action.DOCK_EVENT", "android.intent.action.DREAMING_STARTED", "android.intent.action.DREAMING_STOPPED", "android.intent.action.INPUT_METHOD_CHANGED", "android.intent.action.LOCALE_CHANGED", "android.intent.action.SCREEN_OFF", "android.intent.action.SCREEN_ON", "android.intent.action.TIMEZONE_CHANGED", "android.intent.action.TIME_SET", "android.os.action.DEVICE_IDLE_MODE_CHANGED", "android.os.action.POWER_SAVE_MODE_CHANGED"};
/* 72 */            Context applicationContext = context.getApplicationContext();
/* 81 */            this.f9897a = applicationContext == null ? context : applicationContext;
/* 83 */            this.f9901e = strArr;
                }

                @Override // io.sentry.android.core.InterfaceC1182d0
                /* JADX INFO: renamed from: c */
                public final void mo4761c() {
/* 3 */             if (this.f9900d == null || this.f9899c == null) {
/* 20 */                return;
                    }
/* 11 */            this.f9903i = false;
/* 17 */            m4763g(this.f9900d, this.f9899c);
                }

                @Override // java.io.Closeable, java.lang.AutoCloseable
                public final void close() {
/* 1 */             C1702a c1702a = this.f9895V;
/* 3 */             c1702a.m5443c();
                    try {
/* 7 */                 this.f9902f = true;
/* 10 */                this.f9904v = null;
/* 14 */                if (this.f9905w != null) {
/* 18 */                    this.f9905w.quit();
                        }
/* 24 */                this.f9905w = null;
/* 26 */                c1702a.close();
/* 31 */                C1191g0.f10017e.m4791h(this);
/* 34 */                SentryAndroidOptions sentryAndroidOptions = this.f9899c;
/* 36 */                if (sentryAndroidOptions != null) {
                            try {
/* 50 */                        sentryAndroidOptions.getExecutorService().submit(new f72(this, 22));
                            } catch (RejectedExecutionException unused) {
/* 56 */                        m4764h(this.f9899c);
                            }
                        }
/* 59 */                SentryAndroidOptions sentryAndroidOptions2 = this.f9899c;
/* 61 */                if (sentryAndroidOptions2 != null) {
/* 74 */                    sentryAndroidOptions2.getLogger().mo4672k(EnumC1553m5.DEBUG, "SystemEventsBreadcrumbsIntegration removed.", new Object[0]);
                        }
                    } catch (Throwable th) {
                        try {
/* 78 */                    c1702a.close();
                        } catch (Throwable th2) {
/* 83 */                    th.addSuppressed(th2);
                        }
/* 86 */                throw th;
                    }
                }

                @Override // io.sentry.android.core.InterfaceC1182d0
                /* JADX INFO: renamed from: f */
                public final void mo4762f() {
/* 1 */             SentryAndroidOptions sentryAndroidOptions = this.f9899c;
/* 3 */             if (sentryAndroidOptions == null) {
/* 5 */                 return;
                    }
                    try {
/* 17 */                sentryAndroidOptions.getExecutorService().submit(new f72(this, 22));
                    } catch (RejectedExecutionException unused) {
/* 23 */                m4764h(this.f9899c);
                    }
                }

                /* JADX INFO: renamed from: g */
                public final void m4763g(C1469h4 c1469h4, SentryAndroidOptions sentryAndroidOptions) {
/* 5 */             if (sentryAndroidOptions.isEnableSystemEventBreadcrumbs() && !this.f9902f && !this.f9903i && this.f9898b == null) {
                        try {
/* 30 */                    sentryAndroidOptions.getExecutorService().submit(new RunnableC1192g1(this, c1469h4, sentryAndroidOptions));
                        } catch (Throwable unused) {
/* 45 */                    sentryAndroidOptions.getLogger().mo4672k(EnumC1553m5.WARNING, "Failed to start SystemEventsBreadcrumbsIntegration on executor thread.", new Object[0]);
                        }
                    }
                }

                /* JADX INFO: renamed from: h */
                public final void m4764h(SentryAndroidOptions sentryAndroidOptions) {
/* 1 */             C1702a c1702a = this.f9895V;
/* 3 */             c1702a.m5443c();
                    try {
/* 7 */                 this.f9903i = true;
/* 9 */                 C1282w1 c1282w1 = this.f9898b;
/* 12 */                this.f9898b = null;
/* 14 */                c1702a.close();
/* 17 */                if (c1282w1 != null) {
                            try {
/* 21 */                        this.f9897a.unregisterReceiver(c1282w1);
                            } catch (Throwable th) {
/* 37 */                        sentryAndroidOptions.getLogger().mo4670b(EnumC1553m5.ERROR, th, "Failed to unregister SystemEventsBroadcastReceiver", new Object[0]);
                            }
                        }
                    } catch (Throwable th2) {
                        try {
/* 42 */                    c1702a.close();
                        } catch (Throwable th3) {
/* 47 */                    th2.addSuppressed(th3);
                        }
/* 50 */                throw th2;
                    }
                }

                @Override // io.sentry.InterfaceC1661s1
                /* JADX INFO: renamed from: l */
                public final void mo4674l(SentryAndroidOptions sentryAndroidOptions) {
/* 1 */             this.f9899c = sentryAndroidOptions;
/* 5 */             this.f9900d = C1469h4.f10976a;
/* 29 */            sentryAndroidOptions.getLogger().mo4672k(EnumC1553m5.DEBUG, "SystemEventsBreadcrumbsIntegration enabled: %s", Boolean.valueOf(this.f9899c.isEnableSystemEventBreadcrumbs()));
/* 38 */            if (this.f9899c.isEnableSystemEventBreadcrumbs()) {
/* 42 */                C1191g0.f10017e.m4788c(this);
/* 49 */                if (AbstractC1245n0.m4882j()) {
/* 55 */                    m4763g(this.f9900d, this.f9899c);
                        }
                    }
                }
            }
