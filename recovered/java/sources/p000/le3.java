            package p000;

            import com.google.android.gms.ads.identifier.AdvertisingIdClient;
            import java.lang.ref.WeakReference;
            import java.util.concurrent.CountDownLatch;
            import java.util.concurrent.TimeUnit;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class le3 extends Thread {

                /* JADX INFO: renamed from: a */
                public final WeakReference f13214a;

                /* JADX INFO: renamed from: b */
                public final long f13215b;

                /* JADX INFO: renamed from: c */
                public final CountDownLatch f13216c = new CountDownLatch(1);

                /* JADX INFO: renamed from: d */
                public boolean f13217d = false;

                public le3(AdvertisingIdClient advertisingIdClient, long j) {
/* 9 */             this.f13214a = new WeakReference(advertisingIdClient);
/* 11 */            this.f13215b = j;
/* 24 */            start();
                }

                @Override // java.lang.Thread, java.lang.Runnable
                public final void run() {
                    AdvertisingIdClient advertisingIdClient;
/* 1 */             WeakReference weakReference = this.f13214a;
                    try {
/* 14 */                if (this.f13216c.await(this.f13215b, TimeUnit.MILLISECONDS) || (advertisingIdClient = (AdvertisingIdClient) weakReference.get()) == null) {
/* 43 */                    return;
                        }
/* 24 */                advertisingIdClient.zza();
/* 27 */                this.f13217d = true;
                    } catch (InterruptedException unused) {
/* 34 */                AdvertisingIdClient advertisingIdClient2 = (AdvertisingIdClient) weakReference.get();
/* 36 */                if (advertisingIdClient2 != null) {
/* 38 */                    advertisingIdClient2.zza();
/* 41 */                    this.f13217d = true;
                        }
                    }
                }
            }
