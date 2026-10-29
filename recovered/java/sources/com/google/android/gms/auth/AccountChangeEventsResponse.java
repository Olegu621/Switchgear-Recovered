            package com.google.android.gms.auth;

            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
            import java.util.ArrayList;
            import java.util.List;
            import p000.kb1;
            import p000.re3;
            import p000.w11;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class AccountChangeEventsResponse extends AbstractSafeParcelable {
                public static final Parcelable.Creator<AccountChangeEventsResponse> CREATOR = new re3(21);

                /* JADX INFO: renamed from: a */
                public final int f3233a;

                /* JADX INFO: renamed from: b */
                public final List f3234b;

                public AccountChangeEventsResponse(int i, ArrayList arrayList) {
/* 4 */             this.f3233a = i;
/* 6 */             kb1.m6061n(arrayList);
/* 9 */             this.f3234b = arrayList;
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 9 */             w11.m9420b0(parcel, 1, 4);
/* 14 */            parcel.writeInt(this.f3233a);
/* 21 */            w11.m9414X(parcel, 2, this.f3234b, false);
/* 24 */            w11.m9428f0(iM9422c0, parcel);
                }
            }
