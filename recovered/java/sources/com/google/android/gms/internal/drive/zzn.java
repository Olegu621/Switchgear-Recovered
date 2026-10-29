            package com.google.android.gms.internal.drive;

            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.drive.Contents;
            import com.google.android.gms.drive.DriveId;
            import com.google.android.gms.drive.metadata.internal.MetadataBundle;
            import p000.qj3;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzn implements Parcelable.Creator<zzm> {
                @Override // android.os.Parcelable.Creator
                public final zzm createFromParcel(Parcel parcel) {
/* 1 */             int iM7883P = qj3.m7883P(parcel);
/* 8 */             DriveId driveId = null;
/* 9 */             MetadataBundle metadataBundle = null;
/* 10 */            Contents contents = null;
/* 11 */            String strM7899j = null;
/* 12 */            boolean zM7914y = false;
/* 13 */            int iM7871D = 0;
/* 14 */            int iM7871D2 = 0;
/* 15 */            boolean zM7914y2 = false;
/* 16 */            boolean zM7914y3 = true;
/* 21 */            while (parcel.dataPosition() < iM7883P) {
/* 23 */                int i = parcel.readInt();
                        switch ((char) i) {
                            case 2:
/* 92 */                        driveId = (DriveId) qj3.m7898i(parcel, i, DriveId.CREATOR);
                                break;
                            case 3:
/* 82 */                        metadataBundle = (MetadataBundle) qj3.m7898i(parcel, i, MetadataBundle.CREATOR);
                                break;
                            case 4:
/* 72 */                        contents = (Contents) qj3.m7898i(parcel, i, Contents.CREATOR);
                                break;
                            case 5:
/* 60 */                        zM7914y = qj3.m7914y(i, parcel);
                                break;
                            case 6:
/* 55 */                        strM7899j = qj3.m7899j(i, parcel);
                                break;
                            case 7:
/* 50 */                        iM7871D = qj3.m7871D(i, parcel);
                                break;
                            case '\b':
/* 45 */                        iM7871D2 = qj3.m7871D(i, parcel);
                                break;
                            case '\t':
/* 40 */                        zM7914y2 = qj3.m7914y(i, parcel);
                                break;
                            case '\n':
/* 35 */                        zM7914y3 = qj3.m7914y(i, parcel);
                                break;
                            default:
/* 31 */                        qj3.m7878K(i, parcel);
                                break;
                        }
                    }
/* 95 */            qj3.m7908s(iM7883P, parcel);
/* 100 */           return new zzm(driveId, metadataBundle, contents, zM7914y, strM7899j, iM7871D, iM7871D2, zM7914y2, zM7914y3);
                }

                @Override // android.os.Parcelable.Creator
                public final /* synthetic */ zzm[] newArray(int i) {
/* 1 */             return new zzm[i];
                }
            }
