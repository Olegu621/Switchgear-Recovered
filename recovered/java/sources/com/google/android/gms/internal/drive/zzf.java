            package com.google.android.gms.internal.drive;

            import com.google.android.gms.drive.DriveId;
            import java.util.Arrays;
            import p000.de3;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzf {
                private final int status;
                private final int zzct;
                private final DriveId zzk;

                public zzf(zzh zzhVar) {
/* 6 */             this.zzk = zzhVar.zzk;
/* 10 */            this.zzct = zzhVar.zzct;
/* 14 */            this.status = zzhVar.status;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (obj != null && obj.getClass() == zzf.class) {
/* 14 */                if (obj == this) {
/* 13 */                    return true;
                        }
/* 17 */                zzf zzfVar = (zzf) obj;
/* 27 */                if (de3.m3029k(this.zzk, zzfVar.zzk) && this.zzct == zzfVar.zzct && this.status == zzfVar.status) {
/* 13 */                    return true;
                        }
                    }
/* 1 */             return false;
                }

                public final int hashCode() {
/* 19 */            return Arrays.hashCode(new Object[]{this.zzk, Integer.valueOf(this.zzct), Integer.valueOf(this.status)});
                }

                public final String toString() {
/* 21 */            return String.format("FileTransferState[TransferType: %d, DriveId: %s, status: %d]", Integer.valueOf(this.zzct), this.zzk, Integer.valueOf(this.status));
                }
            }
