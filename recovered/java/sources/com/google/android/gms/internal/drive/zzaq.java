            package com.google.android.gms.internal.drive;

            import com.google.android.gms.common.api.Status;
            import p000.b32;
            import p000.gi1;
            import p000.p42;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzaq implements b32, p42 {
                private final Status zzdy;
                private final gi1 zzdz;
                private final boolean zzea;

                public zzaq(Status status, gi1 gi1Var, boolean z) {
/* 4 */             this.zzdy = status;
/* 6 */             this.zzdz = gi1Var;
/* 8 */             this.zzea = z;
                }

                public final gi1 getMetadataBuffer() {
/* 1 */             return this.zzdz;
                }

                @Override // p000.p42
                public final Status getStatus() {
/* 1 */             return this.zzdy;
                }

                @Override // p000.b32
                public final void release() {
/* 1 */             gi1 gi1Var = this.zzdz;
/* 3 */             if (gi1Var != null) {
/* 5 */                 gi1Var.release();
                    }
                }
            }
