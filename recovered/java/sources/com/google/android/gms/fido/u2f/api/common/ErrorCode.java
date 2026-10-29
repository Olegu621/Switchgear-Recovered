            package com.google.android.gms.fido.u2f.api.common;

            import android.os.Parcel;
            import android.os.Parcelable;
            import p000.re3;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            @Deprecated
            public enum ErrorCode implements Parcelable {
                /* JADX INFO: Fake field, exist only in values array */
                OK(0),
                OTHER_ERROR(1),
                /* JADX INFO: Fake field, exist only in values array */
                BAD_REQUEST(2),
                /* JADX INFO: Fake field, exist only in values array */
                CONFIGURATION_UNSUPPORTED(3),
                /* JADX INFO: Fake field, exist only in values array */
                DEVICE_INELIGIBLE(4),
                /* JADX INFO: Fake field, exist only in values array */
                TIMEOUT(5);

                public static final Parcelable.Creator<ErrorCode> CREATOR = new re3(13);

                /* JADX INFO: renamed from: a */
                public final int f3872a;

                ErrorCode(int i) {
/* 4 */             this.f3872a = i;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
/* 1 */             return 0;
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             parcel.writeInt(this.f3872a);
                }
            }
