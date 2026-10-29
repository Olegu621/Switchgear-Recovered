            package com.google.android.gms.internal.drive;

            import com.google.android.gms.common.api.Status;
            import p000.ka0;
            import p000.p42;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzbz implements p42 {
                private final Status zzdy;
                private final ka0 zzfj;

                public zzbz(Status status, ka0 ka0Var) {
/* 4 */             this.zzdy = status;
/* 6 */             this.zzfj = ka0Var;
                }

                public final ka0 getDriveFolder() {
/* 1 */             return this.zzfj;
                }

                @Override // p000.p42
                public final Status getStatus() {
/* 1 */             return this.zzdy;
                }
            }
