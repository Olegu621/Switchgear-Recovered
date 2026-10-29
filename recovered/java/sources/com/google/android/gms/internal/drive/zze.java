            package com.google.android.gms.internal.drive;

            import java.util.Arrays;
            import java.util.Locale;
            import p000.de3;
            import p000.im3;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zze {
                private final im3 zzcv;
                private final long zzcw;
                private final long zzcx;

                /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.drive.zzf, im3] */
                public zze(zzh zzhVar) {
/* 9 */             this.zzcv = new zzf(zzhVar);
/* 13 */            this.zzcw = zzhVar.zzcw;
/* 17 */            this.zzcx = zzhVar.zzcx;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (obj != null && obj.getClass() == zze.class) {
/* 14 */                if (obj == this) {
/* 13 */                    return true;
                        }
/* 17 */                zze zzeVar = (zze) obj;
/* 27 */                if (de3.m3029k(this.zzcv, zzeVar.zzcv) && this.zzcw == zzeVar.zzcw && this.zzcx == zzeVar.zzcx) {
/* 13 */                    return true;
                        }
                    }
/* 1 */             return false;
                }

                public final int hashCode() {
/* 23 */            return Arrays.hashCode(new Object[]{Long.valueOf(this.zzcx), Long.valueOf(this.zzcw), Long.valueOf(this.zzcx)});
                }

                public final String toString() {
/* 1 */             Locale locale = Locale.US;
/* 44 */            return "FileTransferProgress[FileTransferState: " + this.zzcv.toString() + ", BytesTransferred: " + this.zzcw + ", TotalBytes: " + this.zzcx + "]";
                }
            }
