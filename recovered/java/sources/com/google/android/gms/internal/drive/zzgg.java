            package com.google.android.gms.internal.drive;

            import android.os.IBinder;
            import android.os.Parcel;
            import android.os.ParcelFileDescriptor;
            import android.os.Parcelable;
            import p000.qj3;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzgg implements Parcelable.Creator<zzgf> {
                @Override // android.os.Parcelable.Creator
                public final zzgf createFromParcel(Parcel parcel) {
/* 1 */             int iM7883P = qj3.m7883P(parcel);
/* 5 */             ParcelFileDescriptor parcelFileDescriptor = null;
/* 6 */             IBinder iBinderM7870C = null;
/* 7 */             String strM7899j = null;
/* 12 */            while (parcel.dataPosition() < iM7883P) {
/* 14 */                int i = parcel.readInt();
/* 18 */                char c = (char) i;
/* 20 */                if (c == 2) {
/* 48 */                    parcelFileDescriptor = (ParcelFileDescriptor) qj3.m7898i(parcel, i, ParcelFileDescriptor.CREATOR);
                        } else if (c == 3) {
/* 37 */                    iBinderM7870C = qj3.m7870C(i, parcel);
                        } else if (c != 4) {
/* 28 */                    qj3.m7878K(i, parcel);
                        } else {
/* 32 */                    strM7899j = qj3.m7899j(i, parcel);
                        }
                    }
/* 51 */            qj3.m7908s(iM7883P, parcel);
/* 56 */            return new zzgf(parcelFileDescriptor, iBinderM7870C, strM7899j);
                }

                @Override // android.os.Parcelable.Creator
                public final /* synthetic */ zzgf[] newArray(int i) {
/* 1 */             return new zzgf[i];
                }
            }
