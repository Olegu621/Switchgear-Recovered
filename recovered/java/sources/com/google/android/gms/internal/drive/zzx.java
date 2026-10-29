            package com.google.android.gms.internal.drive;

            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.drive.Contents;
            import com.google.android.gms.drive.DriveId;
            import com.google.android.gms.drive.metadata.internal.MetadataBundle;
            import p000.qj3;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzx implements Parcelable.Creator<zzw> {
                @Override // android.os.Parcelable.Creator
                public final zzw createFromParcel(Parcel parcel) {
/* 1 */             int iM7883P = qj3.m7883P(parcel);
/* 5 */             Integer numM7872E = null;
/* 7 */             DriveId driveId = null;
/* 8 */             MetadataBundle metadataBundle = null;
/* 9 */             Contents contents = null;
/* 10 */            String strM7899j = null;
/* 11 */            boolean zM7914y = false;
/* 12 */            int iM7871D = 0;
/* 13 */            int iM7871D2 = 0;
/* 18 */            while (parcel.dataPosition() < iM7883P) {
/* 20 */                int i = parcel.readInt();
                        switch ((char) i) {
                            case 2:
/* 84 */                        driveId = (DriveId) qj3.m7898i(parcel, i, DriveId.CREATOR);
                                break;
                            case 3:
/* 74 */                        metadataBundle = (MetadataBundle) qj3.m7898i(parcel, i, MetadataBundle.CREATOR);
                                break;
                            case 4:
/* 64 */                        contents = (Contents) qj3.m7898i(parcel, i, Contents.CREATOR);
                                break;
                            case 5:
/* 52 */                        numM7872E = qj3.m7872E(i, parcel);
                                break;
                            case 6:
/* 47 */                        zM7914y = qj3.m7914y(i, parcel);
                                break;
                            case 7:
/* 42 */                        strM7899j = qj3.m7899j(i, parcel);
                                break;
                            case '\b':
/* 37 */                        iM7871D = qj3.m7871D(i, parcel);
                                break;
                            case '\t':
/* 32 */                        iM7871D2 = qj3.m7871D(i, parcel);
                                break;
                            default:
/* 28 */                        qj3.m7878K(i, parcel);
                                break;
                        }
                    }
/* 87 */            qj3.m7908s(iM7883P, parcel);
/* 96 */            return new zzw(driveId, metadataBundle, contents, numM7872E.intValue(), zM7914y, strM7899j, iM7871D, iM7871D2);
                }

                @Override // android.os.Parcelable.Creator
                public final /* synthetic */ zzw[] newArray(int i) {
/* 1 */             return new zzw[i];
                }
            }
