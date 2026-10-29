            package com.google.android.gms.fido.sourcedevice;

            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.common.api.Status;
            import com.google.android.gms.common.internal.ReflectedParcelable;
            import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
            import p000.tc3;
            import p000.w11;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class SourceDirectTransferResult extends AbstractSafeParcelable implements ReflectedParcelable {
                public static final Parcelable.Creator<SourceDirectTransferResult> CREATOR = new tc3(3);

                /* JADX INFO: renamed from: a */
                public final Status f3857a;

                /* JADX INFO: renamed from: b */
                public final int f3858b;

                public SourceDirectTransferResult(Status status, int i) {
/* 4 */             this.f3857a = status;
/* 6 */             this.f3858b = i;
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 11 */            w11.m9409S(parcel, 1, this.f3857a, i, false);
/* 16 */            w11.m9420b0(parcel, 2, 4);
/* 21 */            parcel.writeInt(this.f3858b);
/* 24 */            w11.m9428f0(iM9422c0, parcel);
                }
            }
