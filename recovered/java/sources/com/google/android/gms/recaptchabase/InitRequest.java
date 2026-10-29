            package com.google.android.gms.recaptchabase;

            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
            import p000.tf3;
            import p000.w11;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class InitRequest extends AbstractSafeParcelable {
                public static final Parcelable.Creator<InitRequest> CREATOR = new tf3(9);

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof InitRequest);
                }

                public final int hashCode() {
/* 1 */             return 0;
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 7 */             w11.m9428f0(w11.m9422c0(20293, parcel), parcel);
                }
            }
