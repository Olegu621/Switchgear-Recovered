            package com.google.android.gms.internal.drive;

            import android.app.Activity;
            import android.content.Context;
            import android.content.IntentSender;
            import com.google.android.gms.drive.DriveId;
            import com.google.android.gms.tasks.Task;
            import p000.ar2;
            import p000.da0;
            import p000.ea0;
            import p000.g20;
            import p000.hq1;
            import p000.kb1;
            import p000.nr0;
            import p000.or0;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 11 */    public final class zzbb extends or0 {
                public zzbb(Context context, da0 da0Var) {
/* 9 */             super(context, null, ea0.f7593b, da0Var, nr0.f14414c);
                }

                public final Task<DriveId> getDriveId(String str) {
/* 3 */             kb1.m6062o(str, "resourceId must not be null");
/* 11 */            return doRead(new zzbc(this, str));
                }

                public final Task<ar2> getUploadPreferences() {
/* 6 */             return doRead(new zzbd(this));
                }

                public final Task<IntentSender> newCreateFileActivityIntentSender(g20 g20Var) {
/* 6 */             return doRead(new zzbg(this, g20Var));
                }

                public final Task<IntentSender> newOpenFileActivityIntentSender(hq1 hq1Var) {
/* 6 */             return doRead(new zzbf(this, hq1Var));
                }

                public final Task<Void> requestSync() {
/* 6 */             return doWrite(new zzbh(this));
                }

                public final Task<Void> setUploadPreferences(ar2 ar2Var) {
/* 3 */             kb1.m6062o(ar2Var, "transferPreferences cannot be null.");
/* 11 */            return doWrite(new zzbe(this, ar2Var));
                }

/* 12 */        public zzbb(Activity activity, da0 da0Var) {
/* 14 */            super(activity, activity, ea0.f7593b, da0Var, nr0.f14414c);
                }
            }
