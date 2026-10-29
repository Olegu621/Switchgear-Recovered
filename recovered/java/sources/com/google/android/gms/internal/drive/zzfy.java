            package com.google.android.gms.internal.drive;

            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
            import com.google.android.gms.drive.metadata.internal.MetadataBundle;
            import p000.w11;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzfy extends AbstractSafeParcelable {
                public static final Parcelable.Creator<zzfy> CREATOR = new zzfz();
                final MetadataBundle zzdn;

                public zzfy(MetadataBundle metadataBundle) {
/* 4 */             this.zzdn = metadataBundle;
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 11 */            w11.m9409S(parcel, 2, this.zzdn, i, false);
/* 14 */            w11.m9428f0(iM9422c0, parcel);
                }

                public final MetadataBundle zzaw() {
/* 1 */             return this.zzdn;
                }
            }
