            package com.google.android.gms.internal.drive;

            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.drive.query.Query;
            import p000.qj3;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzgr implements Parcelable.Creator<zzgq> {
                @Override // android.os.Parcelable.Creator
                public final zzgq createFromParcel(Parcel parcel) {
/* 1 */             int iM7883P = qj3.m7883P(parcel);
/* 5 */             Query query = null;
/* 10 */            while (parcel.dataPosition() < iM7883P) {
/* 12 */                int i = parcel.readInt();
/* 18 */                if (((char) i) != 2) {
/* 20 */                    qj3.m7878K(i, parcel);
                        } else {
/* 30 */                    query = (Query) qj3.m7898i(parcel, i, Query.CREATOR);
                        }
                    }
/* 33 */            qj3.m7908s(iM7883P, parcel);
/* 38 */            return new zzgq(query);
                }

                @Override // android.os.Parcelable.Creator
                public final /* synthetic */ zzgq[] newArray(int i) {
/* 1 */             return new zzgq[i];
                }
            }
