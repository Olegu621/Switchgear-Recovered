            package com.google.android.gms.fido.fido2.api.common;

            import android.os.Parcel;
            import android.os.Parcelable;
            import java.util.Locale;
            import p000.AbstractC0886en;
            import p000.dr3;
            import p000.pe0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public enum ErrorCode implements Parcelable {
                /* JADX INFO: Fake field, exist only in values array */
                NOT_SUPPORTED_ERR(9),
                /* JADX INFO: Fake field, exist only in values array */
                INVALID_STATE_ERR(11),
                /* JADX INFO: Fake field, exist only in values array */
                SECURITY_ERR(18),
                /* JADX INFO: Fake field, exist only in values array */
                NETWORK_ERR(19),
                /* JADX INFO: Fake field, exist only in values array */
                ABORT_ERR(20),
                /* JADX INFO: Fake field, exist only in values array */
                TIMEOUT_ERR(23),
                /* JADX INFO: Fake field, exist only in values array */
                ENCODING_ERR(27),
                /* JADX INFO: Fake field, exist only in values array */
                UNKNOWN_ERR(28),
                /* JADX INFO: Fake field, exist only in values array */
                CONSTRAINT_ERR(29),
                /* JADX INFO: Fake field, exist only in values array */
                DATA_ERR(30),
                /* JADX INFO: Fake field, exist only in values array */
                NOT_ALLOWED_ERR(35),
                /* JADX INFO: Fake field, exist only in values array */
                ATTESTATION_NOT_PRIVATE_ERR(36);

                public static final Parcelable.Creator<ErrorCode> CREATOR = new dr3(8);

                /* JADX INFO: renamed from: a */
                public final int f3782a;

                ErrorCode(int i) {
/* 4 */             this.f3782a = i;
                }

                /* JADX INFO: renamed from: a */
                public static ErrorCode m2055a(int i) throws pe0 {
/* 7 */             for (ErrorCode errorCode : values()) {
/* 13 */                if (i == errorCode.f3782a) {
/* 15 */                    return errorCode;
                        }
                    }
/* 21 */            Locale locale = Locale.US;
/* 34 */            throw new pe0(AbstractC0886en.m3505i(i, "Error code ", " is not supported"));
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
/* 1 */             return 0;
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             parcel.writeInt(this.f3782a);
                }
            }
