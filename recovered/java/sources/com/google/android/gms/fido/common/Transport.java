            package com.google.android.gms.fido.common;

            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.common.internal.ReflectedParcelable;
            import p000.tc3;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public enum Transport implements ReflectedParcelable {
                /* JADX INFO: Fake field, exist only in values array */
                BLUETOOTH_CLASSIC("bt"),
                /* JADX INFO: Fake field, exist only in values array */
                BLUETOOTH_LOW_ENERGY("ble"),
                /* JADX INFO: Fake field, exist only in values array */
                NFC("nfc"),
                /* JADX INFO: Fake field, exist only in values array */
                USB("usb"),
                /* JADX INFO: Fake field, exist only in values array */
                INTERNAL("internal"),
                /* JADX INFO: Fake field, exist only in values array */
                CABLE("cable");

                public static final Parcelable.Creator<Transport> CREATOR = new tc3(1);

                /* JADX INFO: renamed from: a */
                public final String f3743a;

                Transport(String str) {
/* 4 */             this.f3743a = str;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
/* 1 */             return 0;
                }

                @Override // java.lang.Enum
                public final String toString() {
/* 1 */             return this.f3743a;
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             parcel.writeString(this.f3743a);
                }
            }
