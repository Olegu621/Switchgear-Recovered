            package com.google.android.gms.internal.drive;

            import com.google.android.gms.common.api.Status;
            import com.google.android.gms.drive.DriveId;
            import p000.p42;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            final class zzao implements p42 {
                private final Status zzdy;
                private final DriveId zzk;

                public zzao(Status status, DriveId driveId) {
/* 4 */             this.zzdy = status;
/* 6 */             this.zzk = driveId;
                }

                public final DriveId getDriveId() {
/* 1 */             return this.zzk;
                }

                @Override // p000.p42
                public final Status getStatus() {
/* 1 */             return this.zzdy;
                }
            }
