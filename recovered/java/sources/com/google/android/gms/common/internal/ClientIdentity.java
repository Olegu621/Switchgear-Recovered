            package com.google.android.gms.common.internal;

            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
            import p000.de3;
            import p000.qd3;
            import p000.w11;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class ClientIdentity extends AbstractSafeParcelable {
                public static final Parcelable.Creator<ClientIdentity> CREATOR = new qd3(16);

                /* JADX INFO: renamed from: a */
                public final int f3478a;

                /* JADX INFO: renamed from: b */
                public final String f3479b;

                public ClientIdentity(int i, String str) {
/* 4 */             this.f3478a = i;
/* 6 */             this.f3479b = str;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (obj == this) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof ClientIdentity)) {
/* 7 */                 return false;
                    }
/* 11 */            ClientIdentity clientIdentity = (ClientIdentity) obj;
                    return clientIdentity.f3478a == this.f3478a && de3.m3029k(clientIdentity.f3479b, this.f3479b);
                }

                public final int hashCode() {
/* 1 */             return this.f3478a;
                }

                public final String toString() {
/* 21 */            return this.f3478a + ":" + this.f3479b;
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 9 */             w11.m9420b0(parcel, 1, 4);
/* 14 */            parcel.writeInt(this.f3478a);
/* 21 */            w11.m9410T(parcel, 2, this.f3479b, false);
/* 24 */            w11.m9428f0(iM9422c0, parcel);
                }
            }
