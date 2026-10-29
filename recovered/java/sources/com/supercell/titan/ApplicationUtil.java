            package com.supercell.titan;

            import android.os.Looper;
            import com.google.android.gms.ads.identifier.AdvertisingIdClient;
            import io.sentry.android.core.AbstractC1245n0;
            import java.io.IOException;
            import java.util.concurrent.atomic.AtomicBoolean;
            import okhttp3.HttpUrl;
            import p000.C2102qc;
            import p000.vr0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class ApplicationUtil extends ApplicationUtilBase {

                /* JADX INFO: renamed from: d */
                public static String f5709d = HttpUrl.FRAGMENT_ENCODE_SET;

                /* JADX INFO: renamed from: e */
                public static boolean f5710e = false;

                /* JADX INFO: renamed from: f */
                public static AdvertisingIdClient.Info f5711f = null;
                public static final AtomicBoolean m_adInfoRetrieved = new AtomicBoolean(false);

                public static String getAdvertiserID() {
/* 1 */             String str = f5709d;
/* 3 */             str.isEmpty();
/* 6 */             return str;
                }

                public static String getAdvertiserIDBlocking() {
/* 3 */             Looper.myLooper();
/* 6 */             Looper.getMainLooper();
/* 15 */            if (f5709d.isEmpty()) {
/* 19 */                f5709d = HttpUrl.FRAGMENT_ENCODE_SET;
/* 22 */                f5710e = false;
                        try {
/* 32 */                    f5711f = AdvertisingIdClient.getAdvertisingIdInfo(GameApp.getInstance());
                        } catch (IOException e) {
/* 69 */                    AbstractC1245n0.m4889q("ApplicationUtil", e.getMessage() != null ? e.getMessage() : "IOException with no message");
                        } catch (vr0 e2) {
/* 52 */                    AbstractC1245n0.m4889q("ApplicationUtil", e2.getMessage() != null ? e2.getMessage() : "GooglePlayServicesNotAvailableException with no message");
                        }
/* 72 */                AdvertisingIdClient.Info info = f5711f;
/* 74 */                if (info != null) {
/* 76 */                    String id = info.getId();
/* 80 */                    if (id != null) {
/* 82 */                        f5709d = id;
                            }
/* 92 */                    f5710e = !f5711f.isLimitAdTrackingEnabled();
                        }
                    }
/* 94 */            return f5709d;
                }

                public static boolean getAdvertiserTrackingEnabled() {
/* 1 */             return f5710e;
                }

                public static void requestAdvertiserInfoOnNewThread() {
/* 6 */             new C2102qc().start();
                }
            }
