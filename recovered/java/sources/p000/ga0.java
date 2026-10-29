            package p000;

            import android.os.Message;
            import android.util.Log;
            import com.google.android.gms.drive.events.ChangeEvent;
            import com.google.android.gms.drive.events.CompletionEvent;
            import com.google.android.gms.drive.events.DriveEvent;
            import com.google.android.gms.drive.events.DriveEventService;
            import com.google.android.gms.drive.events.zzb;
            import com.google.android.gms.drive.events.zzv;
            import com.google.android.gms.internal.drive.zzfp;
            import com.google.android.gms.internal.drive.zzir;
            import io.sentry.android.core.AbstractC1245n0;
            import java.lang.ref.WeakReference;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class ga0 extends zzir {

                /* JADX INFO: renamed from: b */
                public static final /* synthetic */ int f8523b = 0;

                /* JADX INFO: renamed from: a */
                public final WeakReference f8524a;

                public ga0(DriveEventService driveEventService) {
/* 9 */             this.f8524a = new WeakReference(driveEventService);
                }

                @Override // android.os.Handler
                public final void handleMessage(Message message) {
/* 1 */             int i = message.what;
/* 5 */             if (i != 1) {
/* 7 */                 if (i != 2) {
/* 21 */                    DriveEventService.f3661e.m6795b("Unexpected message type: %s", Integer.valueOf(i));
/* 24 */                    return;
                        } else {
/* 29 */                    getLooper().quit();
/* 32 */                    return;
                        }
                    }
/* 39 */            DriveEventService driveEventService = (DriveEventService) this.f8524a.get();
/* 41 */            if (driveEventService == null) {
/* 147 */               getLooper().quit();
/* 150 */               return;
                    }
/* 45 */            zzfp zzfpVar = (zzfp) message.obj;
/* 47 */            mr0 mr0Var = DriveEventService.f3661e;
/* 49 */            DriveEvent driveEventZzat = zzfpVar.zzat();
                    try {
/* 53 */                int type = driveEventZzat.getType();
/* 57 */                if (type == 1) {
/* 118 */                   driveEventService.onChange((ChangeEvent) driveEventZzat);
/* 121 */                   return;
                        }
/* 60 */                if (type == 2) {
/* 112 */                   mr0Var.m6795b("Unhandled completion event in %s: %s", null, (CompletionEvent) driveEventZzat);
/* 115 */                   return;
                        }
/* 63 */                if (type == 4) {
/* 100 */                   mr0Var.m6795b("Unhandled changes available event in %s: %s", null, (zzb) driveEventZzat);
                        } else if (type != 7) {
/* 74 */                    mr0Var.m6795b("Unhandled event: %s", driveEventZzat);
                        } else {
/* 88 */                    mr0Var.m6795b("Unhandled transfer state event in %s: %s", null, (zzv) driveEventZzat);
                        }
                    } catch (Exception e) {
/* 129 */               if (Log.isLoggable(mr0Var.f13983a, 6)) {
/* 139 */                   AbstractC1245n0.m4877e("DriveEventService", mr0Var.m6796c("Error handling event in null"), e);
                        }
                    }
                }
            }
