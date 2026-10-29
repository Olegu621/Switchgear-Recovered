            package com.google.android.gms.fido.fido2.api.common;

            import android.os.Parcel;
            import android.os.Parcelable;
            import p000.C2494yd;
            import p000.fm0;
            import p000.tc3;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public enum Attachment implements Parcelable {
                /* JADX INFO: Fake field, exist only in values array */
                PLATFORM("platform"),
                /* JADX INFO: Fake field, exist only in values array */
                CROSS_PLATFORM("cross-platform");

                public static final Parcelable.Creator<Attachment> CREATOR = new tc3(2);

                /* JADX INFO: renamed from: a */
                public final String f3745a;

                Attachment(String str) {
/* 4 */             this.f3745a = str;
                }

                /* JADX INFO: renamed from: a */
                public static Attachment m2052a(String str) {
/* 7 */             for (Attachment attachment : values()) {
/* 17 */                if (str.equals(attachment.f3745a)) {
/* 19 */                    return attachment;
                        }
                    }
/* 36 */            throw new C2494yd(fm0.m3784j("Attachment ", str, " not supported"));
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
/* 1 */             return 0;
                }

                @Override // java.lang.Enum
                public final String toString() {
/* 1 */             return this.f3745a;
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             parcel.writeString(this.f3745a);
                }
            }
