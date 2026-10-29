            package com.google.android.gms.location;

            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.common.api.Status;
            import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
            import p000.p42;
            import p000.re3;
            import p000.w11;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class LocationSettingsResult extends AbstractSafeParcelable implements p42 {
                public static final Parcelable.Creator<LocationSettingsResult> CREATOR = new re3(4);

                /* JADX INFO: renamed from: a */
                public final Status f4138a;

                /* JADX INFO: renamed from: b */
                public final LocationSettingsStates f4139b;

                public LocationSettingsResult(Status status, LocationSettingsStates locationSettingsStates) {
/* 4 */             this.f4138a = status;
/* 6 */             this.f4139b = locationSettingsStates;
                }

                @Override // p000.p42
                public final Status getStatus() {
/* 1 */             return this.f4138a;
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 11 */            w11.m9409S(parcel, 1, this.f4138a, i, false);
/* 17 */            w11.m9409S(parcel, 2, this.f4139b, i, false);
/* 20 */            w11.m9428f0(iM9422c0, parcel);
                }
            }
