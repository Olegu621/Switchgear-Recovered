            package com.google.android.gms.drive.query.internal;

            import android.os.Parcel;
            import android.os.Parcelable;
            import p000.cl3;
            import p000.fm0;
            import p000.lf3;
            import p000.w11;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzl extends zza {
                public static final Parcelable.Creator<zzl> CREATOR = new cl3(11);

                /* JADX INFO: renamed from: a */
                public final String f3716a;

                public zzl(String str) {
/* 4 */             this.f3716a = str;
                }

                @Override // com.google.android.gms.drive.query.Filter
                /* JADX INFO: renamed from: a0 */
                public final String mo2035a0(lf3 lf3Var) {
/* 7 */             return fm0.m3784j("fullTextSearch(", this.f3716a, ")");
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 11 */            w11.m9410T(parcel, 1, this.f3716a, false);
/* 14 */            w11.m9428f0(iM9422c0, parcel);
                }
            }
