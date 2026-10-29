            package com.google.android.gms.drive.events;

            import android.app.Service;
            import android.content.Intent;
            import android.os.IBinder;
            import android.util.Log;
            import io.sentry.android.core.AbstractC1245n0;
            import java.util.concurrent.CountDownLatch;
            import java.util.concurrent.TimeUnit;
            import okhttp3.HttpUrl;
            import p000.InterfaceC2192ss;
            import p000.ei3;
            import p000.ej3;
            import p000.ga0;
            import p000.ha0;
            import p000.mr0;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class DriveEventService extends Service implements InterfaceC2192ss, ej3 {

                /* JADX INFO: renamed from: e */
                public static final mr0 f3661e = new mr0("DriveEventService", HttpUrl.FRAGMENT_ENCODE_SET);

                /* JADX INFO: renamed from: a */
                public CountDownLatch f3662a;

                /* JADX INFO: renamed from: b */
                public ga0 f3663b;

                /* JADX INFO: renamed from: c */
                public boolean f3664c;

                /* JADX INFO: renamed from: d */
                public int f3665d;

                @Override // android.app.Service
                public final synchronized IBinder onBind(Intent intent) {
/* 12 */            if (!"com.google.android.gms.drive.events.HANDLE_EVENT".equals(intent.getAction())) {
/* 88 */                return null;
                    }
/* 16 */            if (this.f3663b == null && !this.f3664c) {
/* 23 */                this.f3664c = true;
/* 27 */                CountDownLatch countDownLatch = new CountDownLatch(1);
/* 35 */                this.f3662a = new CountDownLatch(1);
/* 42 */                new ei3(this, countDownLatch).start();
                        try {
/* 53 */                    if (!countDownLatch.await(5000L, TimeUnit.MILLISECONDS)) {
/* 61 */                        f3661e.m6794a("DriveEventService", "Failed to synchronously initialize event handler.");
                            }
                        } catch (InterruptedException e) {
/* 75 */                    throw new RuntimeException("Unable to start event handler", e);
                        }
                    }
/* 81 */            return new ha0(this).asBinder();
                }

                @Override // p000.InterfaceC2192ss
                public final void onChange(ChangeEvent changeEvent) {
/* 10 */            f3661e.m6795b("Unhandled change event in %s: %s", null, changeEvent);
                }

                @Override // android.app.Service
                public final synchronized void onDestroy() {
/* 2 */             ga0 ga0Var = this.f3663b;
/* 4 */             if (ga0Var != null) {
/* 6 */                 int i = ga0.f8523b;
/* 15 */                this.f3663b.sendMessage(ga0Var.obtainMessage(2));
/* 19 */                this.f3663b = null;
                        try {
/* 31 */                    if (!this.f3662a.await(5000L, TimeUnit.MILLISECONDS)) {
/* 33 */                        mr0 mr0Var = f3661e;
/* 46 */                        if (Log.isLoggable(mr0Var.f13983a, 5)) {
/* 52 */                            AbstractC1245n0.m4889q("DriveEventService", mr0Var.m6796c("Failed to synchronously quit event handler. Will quit itself"));
                                }
                            }
                        } catch (InterruptedException unused) {
                        }
/* 58 */                this.f3662a = null;
                    }
/* 60 */            super.onDestroy();
                }

                @Override // android.app.Service
                public final boolean onUnbind(Intent intent) {
/* 1 */             return true;
                }
            }
