            package com.google.android.gms.internal.drive;

            import android.content.Context;
            import android.os.Looper;
            import com.google.android.gms.drive.DriveId;
            import p000.kb1;
            import p000.up1;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzdi {
                private up1 zzgg;
                private zzee zzgh;
                private DriveId zzk;

                public zzdi(zzch zzchVar, up1 up1Var, DriveId driveId) {
/* 10 */            kb1.m6065r(driveId != null);
/* 13 */            this.zzk = driveId;
/* 17 */            Looper looper = zzchVar.getLooper();
/* 21 */            Context applicationContext = zzchVar.getApplicationContext();
/* 25 */            up1Var.getClass();
/* 32 */            zzee zzeeVar = new zzee(looper, applicationContext, 1, zzdj.zza(up1Var));
/* 35 */            this.zzgh = zzeeVar;
/* 37 */            zzeeVar.zzf(1);
                }
            }
