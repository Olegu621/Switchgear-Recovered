            package com.google.android.gms.internal.drive;

            import com.google.android.gms.drive.DriveId;
            import java.util.ArrayList;
            import java.util.Set;
            import p000.C0872e9;
            import p000.C1951n4;
            import p000.InterfaceC2192ss;
            import p000.ea0;
            import p000.eb3;
            import p000.hi1;
            import p000.la0;
            import p000.sr1;
            import p000.tr0;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class zzdp implements la0 {
                protected final DriveId zzk;

                public zzdp(DriveId driveId) {
/* 4 */             this.zzk = driveId;
                }

                public sr1 addChangeListener(tr0 tr0Var, InterfaceC2192ss interfaceC2192ss) {
/* 1 */             C0872e9 c0872e9 = ea0.f7592a;
/* 3 */             tr0Var.getClass();
/* 11 */            throw new UnsupportedOperationException();
                }

                public sr1 addChangeSubscription(tr0 tr0Var) {
/* 1 */             C0872e9 c0872e9 = ea0.f7592a;
/* 3 */             tr0Var.getClass();
/* 11 */            throw new UnsupportedOperationException();
                }

                public sr1 delete(tr0 tr0Var) {
/* 10 */            return ((eb3) tr0Var).f7609b.doWrite(new zzdu(this, tr0Var));
                }

                @Override // p000.la0
                public DriveId getDriveId() {
/* 1 */             return this.zzk;
                }

                public sr1 getMetadata(tr0 tr0Var) {
/* 11 */            return ((eb3) tr0Var).f7609b.doRead(new zzdq(this, tr0Var, false));
                }

                public sr1 listParents(tr0 tr0Var) {
/* 10 */            return ((eb3) tr0Var).f7609b.doRead(new zzdr(this, tr0Var));
                }

                public sr1 removeChangeListener(tr0 tr0Var, InterfaceC2192ss interfaceC2192ss) {
/* 1 */             C0872e9 c0872e9 = ea0.f7592a;
/* 3 */             tr0Var.getClass();
/* 11 */            throw new UnsupportedOperationException();
                }

                public sr1 removeChangeSubscription(tr0 tr0Var) {
/* 1 */             C0872e9 c0872e9 = ea0.f7592a;
/* 3 */             tr0Var.getClass();
/* 11 */            throw new UnsupportedOperationException();
                }

                public sr1 setParents(tr0 tr0Var, Set<DriveId> set) {
/* 1 */             if (set != null) {
/* 17 */                return ((eb3) tr0Var).f7609b.doWrite(new zzds(this, tr0Var, new ArrayList(set)));
                    }
/* 24 */            C1951n4.m6859j("ParentIds must be provided.");
/* 27 */            return null;
                }

                public sr1 trash(tr0 tr0Var) {
/* 10 */            return ((eb3) tr0Var).f7609b.doWrite(new zzdv(this, tr0Var));
                }

                public sr1 untrash(tr0 tr0Var) {
/* 10 */            return ((eb3) tr0Var).f7609b.doWrite(new zzdw(this, tr0Var));
                }

                public sr1 updateMetadata(tr0 tr0Var, hi1 hi1Var) {
/* 1 */             if (hi1Var != null) {
/* 12 */                return ((eb3) tr0Var).f7609b.doWrite(new zzdt(this, tr0Var, hi1Var));
                    }
/* 19 */            C1951n4.m6859j("ChangeSet must be provided.");
/* 22 */            return null;
                }
            }
