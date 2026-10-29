            package com.google.android.gms.internal.location;

            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.common.api.Status;
            import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
            import p000.p42;
            import p000.w11;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzaa extends AbstractSafeParcelable implements p42 {
                private final Status zzb;
                public static final zzaa zza = new zzaa(Status.f3440e);
                public static final Parcelable.Creator<zzaa> CREATOR = new zzab();

                public zzaa(Status status) {
/* 4 */             this.zzb = status;
                }

                @Override // p000.p42
                public final Status getStatus() {
/* 1 */             return this.zzb;
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 11 */            w11.m9409S(parcel, 1, this.zzb, i, false);
/* 14 */            w11.m9428f0(iM9422c0, parcel);
                }
            }
