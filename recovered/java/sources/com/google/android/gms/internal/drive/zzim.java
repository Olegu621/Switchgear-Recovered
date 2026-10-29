            package com.google.android.gms.internal.drive;

            import com.google.android.gms.common.data.DataHolder;
            import com.google.android.gms.drive.DriveId;
            import java.util.Arrays;
            import java.util.Iterator;
            import p000.jm3;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzim extends jm3 {
                public static final zzim zzlj = new zzim();

                private zzim() {
/* 30 */            super("driveId", Arrays.asList("sqlId", "resourceId", "mimeType"), Arrays.asList("dbInstanceId"), 4100000);
                }

                @Override // p000.sc3
                public final boolean zzb(DataHolder dataHolder, int i, int i2) {
/* 5 */             Iterator<String> it = zzaz().iterator();
/* 13 */            while (it.hasNext()) {
/* 27 */                if (!dataHolder.f3465c.containsKey(it.next())) {
/* 29 */                    return false;
                        }
                    }
/* 31 */            return true;
                }

                @Override // p000.sc3
                public final Object zzc(DataHolder dataHolder, int i, int i2) {
/* 5 */             long j = dataHolder.f3468f.getLong("dbInstanceId");
/* 21 */            boolean zEquals = "application/vnd.google-apps.folder".equals(dataHolder.m2015G1(i, i2, zzhs.zzki.getName()));
/* 27 */            String strM2015G1 = dataHolder.m2015G1(i, i2, "resourceId");
/* 33 */            long jM2014F1 = dataHolder.m2014F1(i, i2, "sqlId");
/* 45 */            if ("generated-android-null".equals(strM2015G1)) {
/* 47 */                strM2015G1 = null;
                    }
/* 49 */            return new DriveId(strM2015G1, jM2014F1, j, zEquals ? 1 : 0);
                }
            }
