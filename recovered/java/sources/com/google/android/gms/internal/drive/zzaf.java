            package com.google.android.gms.internal.drive;

            import com.google.android.gms.drive.query.Query;
            import p000.C0872e9;
            import p000.C1951n4;
            import p000.ea0;
            import p000.eb3;
            import p000.f20;
            import p000.gq1;
            import p000.ka0;
            import p000.sr1;
            import p000.tr0;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            @Deprecated
            public final class zzaf {
                public final sr1 fetchDriveId(tr0 tr0Var, String str) {
/* 10 */            return ((eb3) tr0Var).f7609b.doRead(new zzai(this, tr0Var, str));
                }

                public final ka0 getAppFolder(tr0 tr0Var) {
/* 1 */             C0872e9 c0872e9 = ea0.f7592a;
/* 3 */             tr0Var.getClass();
/* 11 */            throw new UnsupportedOperationException();
                }

                public final ka0 getRootFolder(tr0 tr0Var) {
/* 1 */             C0872e9 c0872e9 = ea0.f7592a;
/* 3 */             tr0Var.getClass();
/* 11 */            throw new UnsupportedOperationException();
                }

                public final f20 newCreateFileActivityBuilder() {
/* 3 */             f20 f20Var = new f20();
/* 9 */             new zzt(0);
/* 12 */            return f20Var;
                }

                public final sr1 newDriveContents(tr0 tr0Var) {
/* 12 */            return ((eb3) tr0Var).f7609b.doRead(new zzah(this, tr0Var, 536870912));
                }

                public final gq1 newOpenFileActivityBuilder() {
/* 3 */             return new gq1();
                }

                public final sr1 query(tr0 tr0Var, Query query) {
/* 1 */             if (query != null) {
/* 12 */                return ((eb3) tr0Var).f7609b.doRead(new zzag(this, tr0Var, query));
                    }
/* 19 */            C1951n4.m6859j("Query must be provided.");
/* 22 */            return null;
                }

                public final sr1 requestSync(tr0 tr0Var) {
/* 10 */            return ((eb3) tr0Var).f7609b.doWrite(new zzaj(this, tr0Var));
                }
            }
