            package p000;

            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.drive.metadata.internal.MetadataBundle;
            import com.google.android.gms.drive.query.internal.zzb;
            import com.google.android.gms.drive.query.internal.zzx;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class ye3 implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
/* 1 */             int iM7883P = qj3.m7883P(parcel);
/* 5 */             zzx zzxVar = null;
/* 6 */             MetadataBundle metadataBundle = null;
/* 11 */            while (parcel.dataPosition() < iM7883P) {
/* 13 */                int i = parcel.readInt();
/* 17 */                char c = (char) i;
/* 19 */                if (c == 1) {
/* 43 */                    zzxVar = (zzx) qj3.m7898i(parcel, i, zzx.CREATOR);
                        } else if (c != 2) {
/* 24 */                    qj3.m7878K(i, parcel);
                        } else {
/* 34 */                    metadataBundle = (MetadataBundle) qj3.m7898i(parcel, i, MetadataBundle.CREATOR);
                        }
                    }
/* 46 */            qj3.m7908s(iM7883P, parcel);
/* 51 */            return new zzb(zzxVar, metadataBundle);
                }

                @Override // android.os.Parcelable.Creator
                public final /* synthetic */ Object[] newArray(int i) {
/* 1 */             return new zzb[i];
                }
            }
