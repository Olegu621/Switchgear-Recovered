            package com.google.android.gms.drive.query.internal;

            import android.os.Bundle;
            import android.os.Parcel;
            import com.google.android.gms.drive.metadata.internal.MetadataBundle;
            import p000.ho3;
            import p000.ii1;
            import p000.lf3;
            import p000.w11;
            import p000.xe2;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzn<T> extends zza {
                public static final ho3 CREATOR = new ho3();

                /* JADX INFO: renamed from: a */
                public final MetadataBundle f3717a;

                /* JADX INFO: renamed from: b */
                public final ii1 f3718b;

                public zzn(MetadataBundle metadataBundle) {
/* 4 */             this.f3717a = metadataBundle;
/* 10 */            this.f3718b = xe2.m9764H(metadataBundle);
                }

                @Override // com.google.android.gms.drive.query.Filter
                /* JADX INFO: renamed from: a0 */
                public final String mo2035a0(lf3 lf3Var) {
/* 3 */             Bundle bundle = this.f3717a.f3683a;
/* 5 */             ii1 ii1Var = this.f3718b;
/* 21 */            return String.format("has(%s,%s)", ii1Var.getName(), ii1Var.zza(bundle));
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 11 */            w11.m9409S(parcel, 1, this.f3717a, i, false);
/* 14 */            w11.m9428f0(iM9422c0, parcel);
                }
            }
