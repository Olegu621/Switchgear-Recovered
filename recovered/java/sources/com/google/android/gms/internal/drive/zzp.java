            package com.google.android.gms.internal.drive;

            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.drive.Contents;
            import p000.qj3;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzp implements Parcelable.Creator<zzo> {
                @Override // android.os.Parcelable.Creator
                public final zzo createFromParcel(Parcel parcel) {
/* 1 */             int iM7883P = qj3.m7883P(parcel);
/* 5 */             Contents contents = null;
/* 7 */             int iM7871D = 0;
/* 8 */             Boolean boolM7915z = null;
/* 13 */            while (parcel.dataPosition() < iM7883P) {
/* 15 */                int i = parcel.readInt();
/* 19 */                char c = (char) i;
/* 21 */                if (c == 2) {
/* 49 */                    contents = (Contents) qj3.m7898i(parcel, i, Contents.CREATOR);
                        } else if (c == 3) {
/* 38 */                    boolM7915z = qj3.m7915z(i, parcel);
                        } else if (c != 4) {
/* 29 */                    qj3.m7878K(i, parcel);
                        } else {
/* 33 */                    iM7871D = qj3.m7871D(i, parcel);
                        }
                    }
/* 52 */            qj3.m7908s(iM7883P, parcel);
/* 57 */            return new zzo(contents, boolM7915z, iM7871D);
                }

                @Override // android.os.Parcelable.Creator
                public final /* synthetic */ zzo[] newArray(int i) {
/* 1 */             return new zzo[i];
                }
            }
