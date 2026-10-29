            package com.google.android.gms.internal.drive;

            import com.google.android.gms.common.data.DataHolder;
            import com.google.android.gms.drive.DriveSpace;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.Collection;
            import java.util.Collections;
            import p000.ll3;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzhz extends ll3 {
                public zzhz(int i) {
/* 22 */            super("spaces", Arrays.asList("inDriveSpace", "isAppData", "inGooglePhotosSpace"), Collections.EMPTY_SET, 7000000);
                }

                @Override // p000.sc3
                /* JADX INFO: renamed from: zzd, reason: merged with bridge method [inline-methods] */
                public final Collection<DriveSpace> zzc(DataHolder dataHolder, int i, int i2) {
/* 3 */             ArrayList arrayList = new ArrayList();
/* 12 */            if (dataHolder.m2012D1(i, i2, "inDriveSpace")) {
/* 16 */                arrayList.add(DriveSpace.f3642b);
                    }
/* 25 */            if (dataHolder.m2012D1(i, i2, "isAppData")) {
/* 29 */                arrayList.add(DriveSpace.f3643c);
                    }
/* 38 */            if (dataHolder.m2012D1(i, i2, "inGooglePhotosSpace")) {
/* 42 */                arrayList.add(DriveSpace.f3644d);
                    }
/* 45 */            return arrayList;
                }
            }
