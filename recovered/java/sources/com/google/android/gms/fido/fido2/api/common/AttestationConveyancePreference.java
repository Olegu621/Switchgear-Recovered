            package com.google.android.gms.fido.fido2.api.common;

            import android.os.Parcel;
            import android.os.Parcelable;
            import p000.C2547zd;
            import p000.fm0;
            import p000.md3;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public enum AttestationConveyancePreference implements Parcelable {
                /* JADX INFO: Fake field, exist only in values array */
                NONE("none"),
                /* JADX INFO: Fake field, exist only in values array */
                INDIRECT("indirect"),
                /* JADX INFO: Fake field, exist only in values array */
                DIRECT("direct");

                public static final Parcelable.Creator<AttestationConveyancePreference> CREATOR = new md3(13);

                /* JADX INFO: renamed from: a */
                public final String f3747a;

                AttestationConveyancePreference(String str) {
/* 4 */             this.f3747a = str;
                }

                /* JADX INFO: renamed from: a */
                public static AttestationConveyancePreference m2053a(String str) throws C2547zd {
/* 7 */             for (AttestationConveyancePreference attestationConveyancePreference : values()) {
/* 17 */                if (str.equals(attestationConveyancePreference.f3747a)) {
/* 19 */                    return attestationConveyancePreference;
                        }
                    }
/* 36 */            throw new C2547zd(fm0.m3784j("Attestation conveyance preference ", str, " not supported"));
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
/* 1 */             return 0;
                }

                @Override // java.lang.Enum
                public final String toString() {
/* 1 */             return this.f3747a;
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             parcel.writeString(this.f3747a);
                }
            }
