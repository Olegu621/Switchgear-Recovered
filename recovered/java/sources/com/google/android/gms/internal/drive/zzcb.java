            package com.google.android.gms.internal.drive;

            import p000.C1951n4;
            import p000.ci0;
            import p000.eb3;
            import p000.sr1;
            import p000.tr0;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            @Deprecated
            public final class zzcb {
                public final sr1 getFileUploadPreferences(tr0 tr0Var) {
/* 10 */            return ((eb3) tr0Var).f7609b.doRead(new zzcc(this, tr0Var));
                }

                public final sr1 setFileUploadPreferences(tr0 tr0Var, ci0 ci0Var) {
/* 3 */             if (ci0Var instanceof zzei) {
/* 16 */                return ((eb3) tr0Var).f7609b.doWrite(new zzcd(this, tr0Var, (zzei) ci0Var));
                    }
/* 23 */            C1951n4.m6859j("Invalid preference value");
/* 26 */            return null;
                }
            }
