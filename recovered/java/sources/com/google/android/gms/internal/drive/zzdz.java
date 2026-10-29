            package com.google.android.gms.internal.drive;

            import com.google.android.gms.common.api.Status;
            import p000.di1;
            import p000.p42;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzdz implements p42 {
                private final Status zzdy;
                private final di1 zzgr;

                public zzdz(Status status, di1 di1Var) {
/* 4 */             this.zzdy = status;
/* 6 */             this.zzgr = di1Var;
                }

                public final di1 getMetadata() {
/* 1 */             return this.zzgr;
                }

                @Override // p000.p42
                public final Status getStatus() {
/* 1 */             return this.zzdy;
                }
            }
