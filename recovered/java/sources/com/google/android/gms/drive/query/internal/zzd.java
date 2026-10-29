            package com.google.android.gms.drive.query.internal;

            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.drive.metadata.internal.MetadataBundle;
            import p000.fm0;
            import p000.ii1;
            import p000.lf3;
            import p000.tf3;
            import p000.w11;
            import p000.xe2;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzd extends zza {
                public static final Parcelable.Creator<zzd> CREATOR = new tf3(5);

                /* JADX INFO: renamed from: a */
                public final MetadataBundle f3712a;

                /* JADX INFO: renamed from: b */
                public final ii1 f3713b;

                public zzd(MetadataBundle metadataBundle) {
/* 4 */             this.f3712a = metadataBundle;
/* 10 */            this.f3713b = xe2.m9764H(metadataBundle);
                }

                @Override // com.google.android.gms.drive.query.Filter
                /* JADX INFO: renamed from: a0 */
                public final String mo2035a0(lf3 lf3Var) {
/* 11 */            return fm0.m3784j("fieldOnly(", this.f3713b.getName(), ")");
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 11 */            w11.m9409S(parcel, 1, this.f3712a, i, false);
/* 14 */            w11.m9428f0(iM9422c0, parcel);
                }
            }
