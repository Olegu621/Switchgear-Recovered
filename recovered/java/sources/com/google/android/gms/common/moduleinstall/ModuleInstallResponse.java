            package com.google.android.gms.common.moduleinstall;

            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
            import p000.qd3;
            import p000.w11;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class ModuleInstallResponse extends AbstractSafeParcelable {
                public static final Parcelable.Creator<ModuleInstallResponse> CREATOR = new qd3(25);

                /* JADX INFO: renamed from: a */
                public final int f3551a;

                /* JADX INFO: renamed from: b */
                public final boolean f3552b;

                public ModuleInstallResponse(int i, boolean z) {
/* 4 */             this.f3551a = i;
/* 6 */             this.f3552b = z;
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 9 */             w11.m9420b0(parcel, 1, 4);
/* 14 */            parcel.writeInt(this.f3551a);
/* 18 */            w11.m9420b0(parcel, 2, 4);
/* 23 */            parcel.writeInt(this.f3552b ? 1 : 0);
/* 26 */            w11.m9428f0(iM9422c0, parcel);
                }
            }
