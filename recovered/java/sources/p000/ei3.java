            package p000;

            import android.os.Looper;
            import com.google.android.gms.drive.events.DriveEventService;
            import java.util.concurrent.CountDownLatch;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class ei3 extends Thread {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ CountDownLatch f7702a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ DriveEventService f7703b;

                public ei3(DriveEventService driveEventService, CountDownLatch countDownLatch) {
/* 1 */             this.f7703b = driveEventService;
/* 3 */             this.f7702a = countDownLatch;
                }

                @Override // java.lang.Thread, java.lang.Runnable
                public final void run() {
/* 1 */             DriveEventService driveEventService = this.f7703b;
                    try {
/* 3 */                 Looper.prepare();
/* 11 */                driveEventService.f3663b = new ga0(driveEventService);
/* 14 */                driveEventService.f3664c = false;
/* 18 */                this.f7702a.countDown();
/* 21 */                Looper.loop();
                    } finally {
/* 33 */                CountDownLatch countDownLatch = driveEventService.f3662a;
/* 35 */                if (countDownLatch != null) {
/* 37 */                    countDownLatch.countDown();
                        }
                    }
                }
            }
