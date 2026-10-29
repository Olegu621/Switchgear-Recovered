            package com.google.android.gms.fido.fido2.api.common;

            import android.os.Parcel;
            import android.os.Parcelable;
            import p000.fm0;
            import p000.md3;
            import p000.wd3;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public enum zzat implements Parcelable {
                /* JADX INFO: Fake field, exist only in values array */
                USER_VERIFICATION_REQUIRED("required"),
                /* JADX INFO: Fake field, exist only in values array */
                USER_VERIFICATION_PREFERRED("preferred"),
                /* JADX INFO: Fake field, exist only in values array */
                USER_VERIFICATION_DISCOURAGED("discouraged");

                public static final Parcelable.Creator<zzat> CREATOR = new md3(8);

                /* JADX INFO: renamed from: a */
                public final String f3846a;

                zzat(String str) {
/* 4 */             this.f3846a = str;
                }

                /* JADX INFO: renamed from: a */
                public static zzat m2059a(String str) throws wd3 {
/* 7 */             for (zzat zzatVar : values()) {
/* 17 */                if (str.equals(zzatVar.f3846a)) {
/* 19 */                    return zzatVar;
                        }
                    }
/* 36 */            throw new wd3(fm0.m3784j("User verification requirement ", str, " not supported"));
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
/* 1 */             return 0;
                }

                @Override // java.lang.Enum
                public final String toString() {
/* 1 */             return this.f3846a;
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             parcel.writeString(this.f3846a);
                }
            }
