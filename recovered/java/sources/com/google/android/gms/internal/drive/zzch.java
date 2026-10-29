            package com.google.android.gms.internal.drive;

            import android.app.Activity;
            import android.content.Context;
            import com.google.android.gms.drive.DriveId;
            import com.google.android.gms.drive.query.Query;
            import com.google.android.gms.tasks.Continuation;
            import com.google.android.gms.tasks.Task;
            import java.util.ArrayList;
            import java.util.Set;
            import java.util.concurrent.atomic.AtomicInteger;
            import p000.C1951n4;
            import p000.da0;
            import p000.di1;
            import p000.ea0;
            import p000.f42;
            import p000.fa0;
            import p000.gi1;
            import p000.gn3;
            import p000.hi1;
            import p000.iq1;
            import p000.ja0;
            import p000.ka0;
            import p000.kb1;
            import p000.kf0;
            import p000.la0;
            import p000.nr0;
            import p000.or0;
            import p000.t81;
            import p000.up1;
            import p000.v81;
            import p000.w81;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 11 */    public final class zzch extends or0 {
                private static final AtomicInteger zzfn = new AtomicInteger();

                public zzch(Context context, da0 da0Var) {
/* 9 */             super(context, null, ea0.f7593b, da0Var, nr0.f14414c);
                }

                public static final w81 zza(v81 v81Var, Task task) throws Exception {
/* 5 */             if (task.isSuccessful()) {
/* 11 */                return new zzg(v81Var.f17916c);
                    }
/* 19 */            throw task.getException();
                }

                private static void zze(int i) {
/* 3 */             if (i == 268435456 || i == 536870912 || i == 805306368) {
/* 19 */                return;
                    }
/* 16 */            C1951n4.m6859j("Invalid openMode provided");
                }

                public final Task<w81> addChangeListener(la0 la0Var, up1 up1Var) {
/* 5 */             kb1.m6061n(la0Var.getDriveId());
/* 10 */            kb1.m6062o(up1Var, "listener");
/* 19 */            zzdi zzdiVar = new zzdi(this, up1Var, la0Var.getDriveId());
/* 24 */            int iIncrementAndGet = zzfn.incrementAndGet();
/* 32 */            StringBuilder sb = new StringBuilder(27);
/* 37 */            sb.append("OnChangeListener");
/* 40 */            sb.append(iIncrementAndGet);
/* 47 */            final v81 v81VarRegisterListener = registerListener(zzdiVar, sb.toString());
/* 72 */            return doRegisterEventListener(new zzcp(this, v81VarRegisterListener, la0Var, zzdiVar), new zzcq(this, v81VarRegisterListener.f17916c, la0Var, zzdiVar)).continueWith(new Continuation(v81VarRegisterListener) { // from class: com.google.android.gms.internal.drive.zzci
                        private final v81 zzfo;

                        {
/* 4 */                     this.zzfo = v81VarRegisterListener;
                        }

                        @Override // com.google.android.gms.tasks.Continuation
                        public final Object then(Task task) {
/* 3 */                     return zzch.zza(this.zzfo, task);
                        }
                    });
                }

                public final Task<Void> addChangeSubscription(la0 la0Var) {
/* 5 */             kb1.m6061n(la0Var.getDriveId());
/* 17 */            kb1.m6054g(la0Var.getDriveId() != null);
/* 25 */            return doWrite(new zzcr(this, la0Var));
                }

                public final Task<Boolean> cancelOpenFileCallback(w81 w81Var) {
/* 3 */             if (w81Var instanceof zzg) {
/* 11 */                return doUnregisterEventListener(((zzg) w81Var).zzad());
                    }
/* 18 */            C1951n4.m6859j("Unrecognized ListenerToken");
/* 21 */            return null;
                }

                public final Task<Void> commitContents(fa0 fa0Var, hi1 hi1Var, kf0 kf0Var) {
/* 3 */             kb1.m6062o(kf0Var, "Execution options cannot be null.");
/* 14 */            kb1.m6053f("DriveContents is already closed", !fa0Var.zzk());
/* 29 */            kb1.m6053f("Cannot commit contents opened in MODE_READ_ONLY.", fa0Var.getMode() != 268435456);
/* 38 */            kb1.m6062o(fa0Var.getDriveId(), "Only DriveContents obtained through DriveFile.open can be committed.");
/* 41 */            gn3 gn3VarM3979a = gn3.m3979a(kf0Var);
/* 45 */            if (hi1Var == null) {
/* 47 */                hi1Var = hi1.f9086b;
                    }
/* 54 */            return doWrite(new zzcy(this, gn3VarM3979a, fa0Var, hi1Var));
                }

                public final Task<fa0> createContents() {
/* 8 */             return doWrite(new zzcw(this, 536870912));
                }

                public final Task<ja0> createFile(ka0 ka0Var, hi1 hi1Var, fa0 fa0Var, kf0 kf0Var) {
/* 1 */             zzbs.zzb(hi1Var);
/* 14 */            return doWrite(new zzdh(ka0Var, hi1Var, fa0Var, kf0Var, null));
                }

                public final Task<ka0> createFolder(ka0 ka0Var, hi1 hi1Var) {
/* 3 */             kb1.m6062o(hi1Var, "MetadataChangeSet must be provided.");
/* 10 */            if (hi1Var.m4229a() == null || hi1Var.m4229a().equals("application/vnd.google-apps.folder")) {
/* 37 */                return doWrite(new zzdb(this, hi1Var, ka0Var));
                    }
/* 27 */            C1951n4.m6859j("The mimetype must be of type application/vnd.google-apps.folder");
/* 30 */            return null;
                }

                public final Task<Void> delete(la0 la0Var) {
/* 5 */             kb1.m6061n(la0Var.getDriveId());
/* 13 */            return doWrite(new zzcl(this, la0Var));
                }

                public final Task<Void> discardContents(fa0 fa0Var) {
/* 9 */             kb1.m6053f("DriveContents is already closed", !fa0Var.zzk());
/* 12 */            fa0Var.zzj();
/* 20 */            return doWrite(new zzda(this, fa0Var));
                }

                public final Task<ka0> getAppFolder() {
/* 6 */             return doRead(new zzco(this));
                }

                public final Task<di1> getMetadata(la0 la0Var) {
/* 3 */             kb1.m6062o(la0Var, "DriveResource must not be null");
/* 12 */            kb1.m6062o(la0Var.getDriveId(), "Resource's DriveId must not be null");
/* 21 */            return doRead(new zzdc(this, la0Var, false));
                }

                public final Task<ka0> getRootFolder() {
/* 6 */             return doRead(new zzck(this));
                }

                public final Task<gi1> listChildren(ka0 ka0Var) {
/* 3 */             kb1.m6062o(ka0Var, "folder cannot be null.");
/* 15 */            return query(zzbs.zza((Query) null, ka0Var.getDriveId()));
                }

                public final Task<gi1> listParents(la0 la0Var) {
/* 5 */             kb1.m6061n(la0Var.getDriveId());
/* 13 */            return doRead(new zzde(this, la0Var));
                }

                public final Task<w81> openFile(ja0 ja0Var, int i, iq1 iq1Var) {
/* 1 */             zze(i);
/* 6 */             int iIncrementAndGet = zzfn.incrementAndGet();
/* 14 */            StringBuilder sb = new StringBuilder(27);
/* 19 */            sb.append("OpenFileCallback");
/* 22 */            sb.append(iIncrementAndGet);
/* 29 */            v81 v81VarRegisterListener = registerListener(iq1Var, sb.toString());
/* 33 */            t81 t81Var = v81VarRegisterListener.f17916c;
/* 37 */            final zzg zzgVar = new zzg(t81Var);
/* 63 */            return doRegisterEventListener(new zzcu(this, v81VarRegisterListener, ja0Var, i, zzgVar, v81VarRegisterListener), new zzcv(this, t81Var, zzgVar)).continueWith(new Continuation(zzgVar) { // from class: com.google.android.gms.internal.drive.zzcj
                        private final zzg zzfp;

                        {
/* 4 */                     this.zzfp = zzgVar;
                        }

                        @Override // com.google.android.gms.tasks.Continuation
                        public final Object then(Task task) {
/* 3 */                     return zzch.zza(this.zzfp, task);
                        }
                    });
                }

                public final Task<gi1> query(Query query) {
/* 3 */             kb1.m6062o(query, "query cannot be null.");
/* 11 */            return doRead(new zzcz(this, query));
                }

                public final Task<gi1> queryChildren(ka0 ka0Var, Query query) {
/* 3 */             kb1.m6062o(ka0Var, "folder cannot be null.");
/* 8 */             kb1.m6062o(query, "query cannot be null.");
/* 19 */            return query(zzbs.zza(query, ka0Var.getDriveId()));
                }

                public final Task<Boolean> removeChangeListener(w81 w81Var) {
/* 3 */             kb1.m6062o(w81Var, "Token is required to unregister listener.");
/* 8 */             if (w81Var instanceof zzg) {
/* 16 */                return doUnregisterEventListener(((zzg) w81Var).zzad());
                    }
/* 23 */            f42.m3656l("Could not recover key from ListenerToken");
/* 26 */            return null;
                }

                public final Task<Void> removeChangeSubscription(la0 la0Var) {
/* 5 */             kb1.m6061n(la0Var.getDriveId());
/* 17 */            kb1.m6054g(la0Var.getDriveId() != null);
/* 25 */            return doWrite(new zzcs(this, la0Var));
                }

                public final Task<fa0> reopenContentsForWrite(fa0 fa0Var) {
/* 9 */             kb1.m6053f("DriveContents is already closed", !fa0Var.zzk());
/* 24 */            kb1.m6053f("This method can only be called on contents that are currently opened in MODE_READ_ONLY.", fa0Var.getMode() == 268435456);
/* 27 */            fa0Var.zzj();
/* 35 */            return doRead(new zzcx(this, fa0Var));
                }

                public final Task<Void> setParents(la0 la0Var, Set<DriveId> set) {
/* 5 */             kb1.m6061n(la0Var.getDriveId());
/* 8 */             kb1.m6061n(set);
/* 21 */            return doWrite(new zzdf(this, la0Var, new ArrayList(set)));
                }

                public final Task<Void> trash(la0 la0Var) {
/* 5 */             kb1.m6061n(la0Var.getDriveId());
/* 13 */            return doWrite(new zzcm(this, la0Var));
                }

                public final Task<Void> untrash(la0 la0Var) {
/* 5 */             kb1.m6061n(la0Var.getDriveId());
/* 13 */            return doWrite(new zzcn(this, la0Var));
                }

                public final Task<di1> updateMetadata(la0 la0Var, hi1 hi1Var) {
/* 5 */             kb1.m6061n(la0Var.getDriveId());
/* 8 */             kb1.m6061n(hi1Var);
/* 16 */            return doWrite(new zzdd(this, hi1Var, la0Var));
                }

/* 12 */        public zzch(Activity activity, da0 da0Var) {
/* 14 */            super(activity, activity, ea0.f7593b, da0Var, nr0.f14414c);
                }

/* 18 */        public final Task<ja0> createFile(ka0 ka0Var, hi1 hi1Var, fa0 fa0Var) {
/* 21 */            return createFile(ka0Var, hi1Var, fa0Var, new kf0());
                }

/* 19 */        public static final /* synthetic */ w81 zza(zzg zzgVar, Task task) throws Exception {
/* 20 */            if (task.isSuccessful()) {
                        return zzgVar;
                    }
/* 21 */            throw task.getException();
                }

/* 58 */        public final Task<Void> commitContents(fa0 fa0Var, hi1 hi1Var) {
/* 60 */            gn3 gn3Var = new gn3();
/* 61 */            gn3Var.f8753a = true;
/* 62 */            return commitContents(fa0Var, hi1Var, gn3Var);
                }

/* 67 */        public final Task<fa0> openFile(ja0 ja0Var, int i) {
/* 68 */            zze(i);
/* 69 */            return doRead(new zzct(this, ja0Var, i));
                }
            }
