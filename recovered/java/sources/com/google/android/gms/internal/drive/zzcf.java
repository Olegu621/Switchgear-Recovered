            package com.google.android.gms.internal.drive;

            import com.google.android.gms.common.api.Status;
            import p000.ci0;
            import p000.p42;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 7 */     final class zzcf implements p42 {
                private final Status zzdy;
                private final ci0 zzfm;

                private zzcf(zzcb zzcbVar, Status status, ci0 ci0Var) {
/* 4 */             this.zzdy = status;
/* 6 */             this.zzfm = ci0Var;
                }

                public final ci0 getFileUploadPreferences() {
/* 1 */             return this.zzfm;
                }

                @Override // p000.p42
                public final Status getStatus() {
/* 1 */             return this.zzdy;
                }

/* 8 */         public /* synthetic */ zzcf(zzcb zzcbVar, Status status, ci0 ci0Var, zzcc zzccVar) {
/* 9 */             this(zzcbVar, status, ci0Var);
                }
            }
