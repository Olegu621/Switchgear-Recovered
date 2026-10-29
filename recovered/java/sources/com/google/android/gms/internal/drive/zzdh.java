            package com.google.android.gms.internal.drive;

            import android.os.RemoteException;
            import com.google.android.gms.tasks.TaskCompletionSource;
            import p000.C1951n4;
            import p000.InterfaceC2359x8;
            import p000.bl3;
            import p000.fa0;
            import p000.hi1;
            import p000.ka0;
            import p000.kb1;
            import p000.kf0;
            import p000.um2;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzdh extends um2 {
                private final ka0 zzfj;
                private final hi1 zzgc;
                private kf0 zzgd;
                private String zzge = null;
                private bl3 zzgf;
                private final fa0 zzo;

                public zzdh(ka0 ka0Var, hi1 hi1Var, fa0 fa0Var, kf0 kf0Var, String str) {
/* 4 */             this.zzfj = ka0Var;
/* 6 */             this.zzgc = hi1Var;
/* 8 */             this.zzo = fa0Var;
/* 10 */            this.zzgd = kf0Var;
/* 17 */            kb1.m6062o(ka0Var, "DriveFolder must not be null");
/* 26 */            kb1.m6062o(ka0Var.getDriveId(), "Folder's DriveId must not be null");
/* 31 */            kb1.m6062o(hi1Var, "MetadataChangeSet must not be null");
/* 36 */            kb1.m6062o(kf0Var, "ExecutionOptions must not be null");
/* 43 */            bl3 bl3VarM1393a = bl3.m1393a(hi1Var.m4229a());
/* 47 */            this.zzgf = bl3VarM1393a;
/* 49 */            if (bl3VarM1393a != null && bl3VarM1393a.f2531a.equals("application/vnd.google-apps.folder")) {
/* 64 */                C1951n4.m6859j("May not create folders using this method. Use DriveFolderManagerClient#createFolder() instead of mime type application/vnd.google-apps.folder");
/* 67 */                throw null;
                    }
/* 68 */            if (fa0Var != null) {
/* 72 */                if (!(fa0Var instanceof zzbi)) {
/* 101 */                   C1951n4.m6859j("Only DriveContents obtained from the Drive API are accepted.");
/* 104 */                   throw null;
                        }
/* 78 */                if (fa0Var.getDriveId() != null) {
/* 95 */                    C1951n4.m6859j("Only DriveContents obtained through DriveApi.newDriveContents are accepted for file creation.");
/* 98 */                    throw null;
                        }
/* 84 */                if (fa0Var.zzk()) {
/* 89 */                    C1951n4.m6859j("DriveContents are already closed.");
/* 92 */                    throw null;
                        }
                    }
                }

                @Override // p000.um2
                public final void doExecute(InterfaceC2359x8 interfaceC2359x8, TaskCompletionSource taskCompletionSource) throws RemoteException {
/* 1 */             zzaw zzawVar = (zzaw) interfaceC2359x8;
/* 5 */             this.zzgd.getClass();
/* 8 */             hi1 hi1Var = this.zzgc;
/* 16 */            hi1Var.f9087a.m2033D1(zzawVar.getContext());
/* 23 */            int iZza = zzbs.zza(this.zzo, this.zzgf);
/* 27 */            bl3 bl3Var = this.zzgf;
/* 72 */            ((zzeo) zzawVar.getService()).zza(new zzw(this.zzfj.getDriveId(), hi1Var.f9087a, iZza, (bl3Var == null || !bl3Var.f2531a.startsWith("application/vnd.google-apps")) ? 0 : 1, this.zzgd), new zzhj(taskCompletionSource));
                }
            }
