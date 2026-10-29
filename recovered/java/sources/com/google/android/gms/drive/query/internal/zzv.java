            package com.google.android.gms.drive.query.internal;

            import android.os.Parcel;
            import android.os.Parcelable;
            import p000.dr3;
            import p000.fm0;
            import p000.lf3;
            import p000.w11;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzv extends zza {
                public static final Parcelable.Creator<zzv> CREATOR = new dr3(19);

                /* JADX INFO: renamed from: a */
                public final FilterHolder f3724a;

                public zzv(FilterHolder filterHolder) {
/* 4 */             this.f3724a = filterHolder;
                }

                @Override // com.google.android.gms.drive.query.Filter
                /* JADX INFO: renamed from: a0 */
                public final String mo2035a0(lf3 lf3Var) {
/* 13 */            return fm0.m3784j("not(", this.f3724a.f3699U.mo2035a0(lf3Var), ")");
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 11 */            w11.m9409S(parcel, 1, this.f3724a, i, false);
/* 14 */            w11.m9428f0(iM9422c0, parcel);
                }
            }
