            package com.google.android.gms.fido.u2f.api.common;

            import android.os.Parcel;
            import android.os.Parcelable;
            import p000.fm0;
            import p000.hz1;
            import p000.tf3;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            @Deprecated
            public enum ProtocolVersion implements Parcelable {
                UNKNOWN("UNKNOWN"),
                /* JADX INFO: Fake field, exist only in values array */
                V1("U2F_V1"),
                /* JADX INFO: Fake field, exist only in values array */
                V2("U2F_V2");

                public static final Parcelable.Creator<ProtocolVersion> CREATOR = new tf3(12);

                /* JADX INFO: renamed from: a */
                public final String f3881a;

                ProtocolVersion(String str) {
/* 4 */             this.f3881a = str;
                }

                /* JADX INFO: renamed from: a */
                public static ProtocolVersion m2061a(String str) throws hz1 {
/* 1 */             if (str == null) {
/* 3 */                 return UNKNOWN;
                    }
/* 12 */            for (ProtocolVersion protocolVersion : values()) {
/* 22 */                if (str.equals(protocolVersion.f3881a)) {
/* 24 */                    return protocolVersion;
                        }
                    }
/* 41 */            throw new hz1(fm0.m3784j("Protocol version ", str, " not supported"));
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
/* 1 */             return 0;
                }

                @Override // java.lang.Enum
                public final String toString() {
/* 1 */             return this.f3881a;
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             parcel.writeString(this.f3881a);
                }
            }
