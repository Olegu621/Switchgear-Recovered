            package com.google.android.gms.internal.drive;

            import com.google.android.gms.drive.DriveId;
            import p000.C1951n4;
            import p000.eb3;
            import p000.f42;
            import p000.ia0;
            import p000.ja0;
            import p000.sr1;
            import p000.tr0;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzbn extends zzdp implements ja0 {
                public zzbn(DriveId driveId) {
/* 1 */             super(driveId);
                }

                public final sr1 open(tr0 tr0Var, int i, ia0 ia0Var) {
/* 4 */             if (i != 268435456 && i != 536870912 && i != 805306368) {
/* 17 */                C1951n4.m6859j("Invalid mode provided.");
/* 3 */                 return null;
                    }
/* 21 */            if (ia0Var == null) {
/* 32 */                return ((eb3) tr0Var).f7609b.doRead(new zzbo(this, tr0Var, i, null));
                    }
/* 37 */            tr0Var.getClass();
/* 40 */            f42.m3660p();
/* 3 */             return null;
                }
            }
