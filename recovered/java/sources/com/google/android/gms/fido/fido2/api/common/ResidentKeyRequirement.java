            package com.google.android.gms.fido.fido2.api.common;

            import android.os.Parcel;
            import android.os.Parcelable;
            import p000.fm0;
            import p000.md3;
            import p000.o32;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public enum ResidentKeyRequirement implements Parcelable {
                /* JADX INFO: Fake field, exist only in values array */
                RESIDENT_KEY_DISCOURAGED("discouraged"),
                /* JADX INFO: Fake field, exist only in values array */
                RESIDENT_KEY_PREFERRED("preferred"),
                /* JADX INFO: Fake field, exist only in values array */
                RESIDENT_KEY_REQUIRED("required");

                public static final Parcelable.Creator<ResidentKeyRequirement> CREATOR = new md3(4);

                /* JADX INFO: renamed from: a */
                public final String f3833a;

                ResidentKeyRequirement(String str) {
/* 4 */             this.f3833a = str;
                }

                /* JADX INFO: renamed from: a */
                public static ResidentKeyRequirement m2057a(String str) throws o32 {
/* 7 */             for (ResidentKeyRequirement residentKeyRequirement : values()) {
/* 17 */                if (str.equals(residentKeyRequirement.f3833a)) {
/* 19 */                    return residentKeyRequirement;
                        }
                    }
/* 36 */            throw new o32(fm0.m3784j("Resident key requirement ", str, " not supported"));
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
/* 1 */             return 0;
                }

                @Override // java.lang.Enum
                public final String toString() {
/* 1 */             return this.f3833a;
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             parcel.writeString(this.f3833a);
                }
            }
