            package com.google.android.gms.internal.drive;

            import android.content.IntentSender;
            import com.google.android.gms.drive.DriveId;
            import p000.eb3;
            import p000.hi1;
            import p000.kb1;
            import p000.tr0;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            @Deprecated
/* 5 */     public final class zzt {
                private String zzba;
                private DriveId zzbd;
                private Integer zzdk;
                private final int zzdl = 0;
                private hi1 zzdm;

                public zzt(int i) {
                }

                public final IntentSender build(tr0 tr0Var) {
/* 5 */             ((eb3) tr0Var).getClass();
/* 13 */            throw new UnsupportedOperationException("Method is not supported by connectionless client. APIs supporting connectionless client must not call this method.");
                }

                public final int getRequestId() {
/* 3 */             return this.zzdk.intValue();
                }

                public final void zza(hi1 hi1Var) {
/* 1 */             kb1.m6061n(hi1Var);
/* 4 */             this.zzdm = hi1Var;
                }

                public final void zzc(String str) {
/* 1 */             kb1.m6061n(str);
/* 4 */             this.zzba = str;
                }

                public final void zzd(int i) {
/* 5 */             this.zzdk = Integer.valueOf(i);
                }

                public final String zze() {
/* 1 */             return this.zzba;
                }

                public final void zzg() {
/* 5 */             kb1.m6062o(this.zzdm, "Must provide initial metadata via setInitialMetadata.");
/* 8 */             Integer num = this.zzdk;
/* 22 */            this.zzdk = Integer.valueOf(num == null ? 0 : num.intValue());
                }

/* 6 */         public final void zza(DriveId driveId) {
/* 7 */             kb1.m6061n(driveId);
                    this.zzbd = driveId;
                }

/* 6 */         public final hi1 zzc() {
/* 7 */             return this.zzdm;
                }

/* 7 */         public final DriveId zzd() {
/* 8 */             return this.zzbd;
                }
            }
