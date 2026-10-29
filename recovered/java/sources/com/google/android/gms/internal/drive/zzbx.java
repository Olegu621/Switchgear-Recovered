            package com.google.android.gms.internal.drive;

            import com.google.android.gms.common.api.Status;
            import p000.ja0;
            import p000.p42;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzbx implements p42 {
                private final Status zzdy;
                private final ja0 zzfi;

                public zzbx(Status status, ja0 ja0Var) {
/* 4 */             this.zzdy = status;
/* 6 */             this.zzfi = ja0Var;
                }

                public final ja0 getDriveFile() {
/* 1 */             return this.zzfi;
                }

                @Override // p000.p42
                public final Status getStatus() {
/* 1 */             return this.zzdy;
                }
            }
