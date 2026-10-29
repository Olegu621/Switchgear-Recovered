            package io.sentry.android.core;

            import android.app.Activity;
            import android.os.Build;
            import android.os.Handler;
            import android.os.Looper;
            import io.sentry.EnumC1553m5;
            import io.sentry.ILogger;
            import io.sentry.InterfaceC1561n0;
            import io.sentry.util.AbstractC1704c;
            import io.sentry.util.C1702a;
            import java.lang.ref.WeakReference;
            
            /* JADX INFO: renamed from: io.sentry.android.core.o0 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 29 */    public final class C1248o0 implements InterfaceC1561n0 {

                /* JADX INFO: renamed from: b */
                public static final C1248o0 f10225b = new C1248o0();

                /* JADX INFO: renamed from: a */
                public Object f10226a;

                public C1248o0(int i) {
                    switch (i) {
                        case 3:
/* 27 */                    this.f10226a = new Handler(Looper.getMainLooper());
                            break;
                        default:
/* 12 */                    this.f10226a = new C1702a();
                            break;
                    }
                }

                /* JADX WARN: Code duplicated, block: B:42:0x0097  */
                /* JADX INFO: renamed from: a */
                public Boolean m4895a() {
                    boolean z;
                    try {
/* 11 */                if (Build.BRAND.startsWith("generic") && Build.DEVICE.startsWith("generic")) {
/* 152 */                   z = true;
                        } else {
/* 25 */                    String str = Build.FINGERPRINT;
/* 31 */                    if (str.startsWith("generic") || str.startsWith("unknown")) {
/* 152 */                       z = true;
                            } else {
/* 41 */                        String str2 = Build.HARDWARE;
/* 49 */                        if (str2.contains("goldfish") || str2.contains("ranchu")) {
/* 152 */                           z = true;
                                } else {
/* 59 */                            String str3 = Build.MODEL;
/* 65 */                            if (str3.contains("google_sdk") || str3.contains("Emulator") || str3.contains("Android SDK built for x86") || Build.MANUFACTURER.contains("Genymotion")) {
/* 152 */                               z = true;
                                    } else {
/* 93 */                                String str4 = Build.PRODUCT;
/* 101 */                               if (str4.contains("sdk_google") || str4.contains("google_sdk") || str4.contains("sdk") || str4.contains("sdk_x86") || str4.contains("vbox86p") || str4.contains("emulator") || str4.contains("simulator")) {
/* 152 */                                   z = true;
                                        } else {
/* 150 */                                   z = false;
                                        }
                                    }
                                }
                            }
                        }
/* 153 */               return Boolean.valueOf(z);
                    } catch (Throwable th) {
/* 166 */               ((ILogger) this.f10226a).mo4671d(EnumC1553m5.ERROR, "Error checking whether application is running in an emulator.", th);
/* 169 */               return null;
                    }
                }

                /* JADX INFO: renamed from: b */
                public void m4896b(Activity activity) {
/* 3 */             WeakReference weakReference = (WeakReference) this.f10226a;
/* 5 */             if (weakReference == null || weakReference.get() != activity) {
/* 19 */                this.f10226a = new WeakReference(activity);
                    }
                }

/* 30 */        public C1248o0(ILogger iLogger) {
/* 32 */            AbstractC1704c.m5462q(iLogger, "The ILogger object is required.");
                    this.f10226a = iLogger;
                }
            }
