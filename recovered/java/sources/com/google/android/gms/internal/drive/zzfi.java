            package com.google.android.gms.internal.drive;

            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.drive.Contents;
            import p000.qj3;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzfi implements Parcelable.Creator<zzfh> {
                @Override // android.os.Parcelable.Creator
                public final zzfh createFromParcel(Parcel parcel) {
/* 1 */             int iM7883P = qj3.m7883P(parcel);
/* 5 */             Contents contents = null;
/* 6 */             boolean zM7914y = false;
/* 11 */            while (parcel.dataPosition() < iM7883P) {
/* 13 */                int i = parcel.readInt();
/* 17 */                char c = (char) i;
/* 19 */                if (c == 2) {
/* 39 */                    contents = (Contents) qj3.m7898i(parcel, i, Contents.CREATOR);
                        } else if (c != 3) {
/* 24 */                    qj3.m7878K(i, parcel);
                        } else {
/* 28 */                    zM7914y = qj3.m7914y(i, parcel);
                        }
                    }
/* 42 */            qj3.m7908s(iM7883P, parcel);
/* 47 */            return new zzfh(contents, zM7914y);
                }

                @Override // android.os.Parcelable.Creator
                public final /* synthetic */ zzfh[] newArray(int i) {
/* 1 */             return new zzfh[i];
                }
            }
