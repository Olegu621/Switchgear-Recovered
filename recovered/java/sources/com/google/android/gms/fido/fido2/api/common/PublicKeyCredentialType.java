            package com.google.android.gms.fido.fido2.api.common;

            import android.os.Parcel;
            import android.os.Parcelable;
            import p000.fm0;
            import p000.md3;
            import p000.nz1;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class PublicKeyCredentialType implements Parcelable {

                /* JADX INFO: Fake field, exist only in values array */
                PublicKeyCredentialType EF5;

                /* JADX INFO: renamed from: a */
                public static final /* synthetic */ PublicKeyCredentialType[] f3827a = {new PublicKeyCredentialType("PUBLIC_KEY", 0)};
                public static final Parcelable.Creator<PublicKeyCredentialType> CREATOR = new md3(2);

                /* JADX INFO: renamed from: a */
                public static PublicKeyCredentialType m2056a(String str) throws nz1 {
/* 7 */             for (PublicKeyCredentialType publicKeyCredentialType : values()) {
/* 11 */                publicKeyCredentialType.getClass();
/* 20 */                if (str.equals("public-key")) {
/* 22 */                    return publicKeyCredentialType;
                        }
                    }
/* 39 */            throw new nz1(fm0.m3784j("PublicKeyCredentialType ", str, " not supported"));
                }

                public static PublicKeyCredentialType valueOf(String str) {
/* 7 */             return (PublicKeyCredentialType) Enum.valueOf(PublicKeyCredentialType.class, str);
                }

                public static PublicKeyCredentialType[] values() {
/* 7 */             return (PublicKeyCredentialType[]) f3827a.clone();
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
/* 1 */             return 0;
                }

                @Override // java.lang.Enum
                public final String toString() {
/* 1 */             return "public-key";
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             parcel.writeString("public-key");
                }
            }
