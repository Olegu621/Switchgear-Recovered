            package p000;

            import android.os.Binder;
            import com.google.android.gms.drive.events.DriveEventService;
            import com.google.android.gms.internal.drive.zzet;
            import com.google.android.gms.internal.drive.zzfp;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class ha0 extends zzet {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ DriveEventService f8982a;

                public ha0(DriveEventService driveEventService) {
/* 1 */             this.f8982a = driveEventService;
                }

                @Override // com.google.android.gms.internal.drive.zzes
                public final void zzc(zzfp zzfpVar) {
                    synchronized (this.f8982a) {
                        try {
/* 4 */                     DriveEventService driveEventService = this.f8982a;
/* 6 */                     mr0 mr0Var = DriveEventService.f3661e;
/* 8 */                     int callingUid = Binder.getCallingUid();
/* 14 */                    if (callingUid != driveEventService.f3665d) {
/* 21 */                        if (!yy1.m10228x(driveEventService, callingUid)) {
/* 66 */                            throw new SecurityException("Caller is not GooglePlayServices");
                                }
/* 23 */                        driveEventService.f3665d = callingUid;
                            }
/* 27 */                    ga0 ga0Var = this.f8982a.f3663b;
/* 29 */                    if (ga0Var != null) {
/* 31 */                        int i = ga0.f8523b;
/* 42 */                        this.f8982a.f3663b.sendMessage(ga0Var.obtainMessage(1, zzfpVar));
                            } else {
/* 54 */                        DriveEventService.f3661e.m6794a("DriveEventService", "Receiving event before initialize is completed.");
                            }
                        } catch (Throwable th) {
/* 68 */                    throw th;
                        }
                    }
                }
            }
