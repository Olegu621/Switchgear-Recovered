            package com.google.android.gms.internal.drive;

            import android.os.Bundle;
            import com.google.android.gms.drive.DriveId;
            import com.google.android.gms.drive.metadata.internal.MetadataBundle;
            import com.google.android.gms.drive.query.Query;
            import com.google.android.gms.drive.query.SortOrder;
            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.List;
            import java.util.Set;
            import p000.C0872e9;
            import p000.C1951n4;
            import p000.bl3;
            import p000.ea0;
            import p000.eb3;
            import p000.fa0;
            import p000.go3;
            import p000.hi1;
            import p000.k82;
            import p000.ka0;
            import p000.kb1;
            import p000.kf0;
            import p000.sr1;
            import p000.tr0;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 49 */    public final class zzbs extends zzdp implements ka0 {
                public zzbs(DriveId driveId) {
/* 1 */             super(driveId);
                }

                public static Query zza(Query query, DriveId driveId) {
                    String str;
                    SortOrder sortOrder;
/* 3 */             ArrayList arrayList = new ArrayList();
/* 6 */             List list = Collections.EMPTY_LIST;
/* 8 */             Set set = Collections.EMPTY_SET;
/* 10 */            go3 go3Var = k82.f12654a;
/* 14 */            kb1.m6062o(go3Var, "Field may not be null.");
/* 19 */            kb1.m6062o(driveId, "Value may not be null.");
/* 24 */            Set setSingleton = Collections.singleton(driveId);
/* 35 */            MetadataBundle metadataBundle = new MetadataBundle(new Bundle());
/* 38 */            metadataBundle.m2034E1(go3Var, setSingleton);
/* 44 */            arrayList.add(new com.google.android.gms.drive.query.internal.zzp(metadataBundle));
/* 47 */            if (query != null) {
/* 49 */                com.google.android.gms.drive.query.internal.zzr zzrVar = query.f3690a;
/* 51 */                if (zzrVar != null) {
/* 53 */                    arrayList.add(zzrVar);
                        }
/* 56 */                String str2 = query.f3691b;
/* 58 */                sortOrder = query.f3692c;
/* 61 */                str = str2;
                    } else {
/* 65 */                str = null;
/* 66 */                sortOrder = null;
                    }
/* 82 */            return new Query(new com.google.android.gms.drive.query.internal.zzr(arrayList), str, sortOrder, list, false, new ArrayList(set), false);
                }

                public static void zzb(hi1 hi1Var) {
/* 1 */             if (hi1Var == null) {
/* 40 */                C1951n4.m6859j("MetadataChangeSet must be provided.");
/* 43 */                return;
                    }
/* 7 */             bl3 bl3VarM1393a = bl3.m1393a(hi1Var.m4229a());
/* 11 */            if (bl3VarM1393a != null) {
/* 13 */                String str = bl3VarM1393a.f2531a;
/* 21 */                if (str.startsWith("application/vnd.google-apps") || str.equals("application/vnd.google-apps.folder")) {
/* 34 */                    C1951n4.m6859j("May not create shortcut files using this method. Use DriveFolder.createShortcutFile() instead.");
                        }
                    }
                }

                public final sr1 createFile(tr0 tr0Var, hi1 hi1Var, fa0 fa0Var, kf0 kf0Var) {
/* 1 */             if (hi1Var == null) {
/* 50 */                throw new IllegalArgumentException("MetadataChangeSet must be provided.");
                    }
/* 7 */             bl3 bl3VarM1393a = bl3.m1393a(hi1Var.m4229a());
/* 11 */            if (bl3VarM1393a != null && bl3VarM1393a.f2531a.equals("application/vnd.google-apps.folder")) {
/* 31 */                throw new IllegalArgumentException("May not create folders using this method. Use DriveFolder.createFolder() instead of mime type application/vnd.google-apps.folder");
                    }
/* 32 */            C0872e9 c0872e9 = ea0.f7592a;
/* 34 */            tr0Var.getClass();
/* 42 */            throw new UnsupportedOperationException();
                }

                public final sr1 createFolder(tr0 tr0Var, hi1 hi1Var) {
/* 2 */             if (hi1Var == null) {
/* 45 */                C1951n4.m6859j("MetadataChangeSet must be provided.");
/* 1 */                 return null;
                    }
/* 8 */             if (hi1Var.m4229a() == null || hi1Var.m4229a().equals("application/vnd.google-apps.folder")) {
/* 38 */                return ((eb3) tr0Var).f7609b.doWrite(new zzbu(this, tr0Var, hi1Var));
                    }
/* 25 */            C1951n4.m6859j("The mimetype must be of type application/vnd.google-apps.folder");
/* 1 */             return null;
                }

                public final sr1 listChildren(tr0 tr0Var) {
/* 2 */             return queryChildren(tr0Var, null);
                }

                public final sr1 queryChildren(tr0 tr0Var, Query query) {
/* 14 */            return new zzaf().query(tr0Var, zza(query, getDriveId()));
                }

/* 50 */        public final sr1 createFile(tr0 tr0Var, hi1 hi1Var, fa0 fa0Var) {
/* 51 */            return createFile(tr0Var, hi1Var, fa0Var, null);
                }

/* 85 */        public static int zza(fa0 fa0Var, bl3 bl3Var) {
                    if (fa0Var == null) {
                        return (bl3Var == null || !bl3Var.f2531a.startsWith("application/vnd.google-apps")) ? 1 : 0;
                    }
/* 88 */            int i = fa0Var.zzi().f3632b;
/* 89 */            fa0Var.zzj();
                    return i;
                }
            }
