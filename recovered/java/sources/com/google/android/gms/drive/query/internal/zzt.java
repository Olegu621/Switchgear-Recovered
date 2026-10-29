            package com.google.android.gms.drive.query.internal;

            import android.os.Parcel;
            import android.os.Parcelable;
            import p000.dr3;
            import p000.lf3;
            import p000.w11;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzt extends zza {
                public static final Parcelable.Creator<zzt> CREATOR = new dr3(13);

                @Override // com.google.android.gms.drive.query.Filter
                /* JADX INFO: renamed from: a0 */
                public final String mo2035a0(lf3 lf3Var) {
/* 1 */             return "all()";
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 7 */             w11.m9428f0(w11.m9422c0(20293, parcel), parcel);
                }
            }
