            package com.google.android.gms.internal.drive;

            import com.google.android.gms.common.api.Status;
            import p000.b32;
            import p000.fa0;
            import p000.p42;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzal implements b32, p42 {
                private final Status zzdy;
                private final fa0 zzo;

                public zzal(Status status, fa0 fa0Var) {
/* 4 */             this.zzdy = status;
/* 6 */             this.zzo = fa0Var;
                }

                public final fa0 getDriveContents() {
/* 1 */             return this.zzo;
                }

                @Override // p000.p42
                public final Status getStatus() {
/* 1 */             return this.zzdy;
                }

                @Override // p000.b32
                public final void release() {
/* 1 */             fa0 fa0Var = this.zzo;
/* 3 */             if (fa0Var != null) {
/* 5 */                 fa0Var.zzj();
                    }
                }
            }
