            package com.google.android.gms.common.moduleinstall;

            import android.app.PendingIntent;
            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
            import p000.qd3;
            import p000.w11;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class ModuleInstallIntentResponse extends AbstractSafeParcelable {
                public static final Parcelable.Creator<ModuleInstallIntentResponse> CREATOR = new qd3(20);

                /* JADX INFO: renamed from: a */
                public final PendingIntent f3550a;

                public ModuleInstallIntentResponse(PendingIntent pendingIntent) {
/* 4 */             this.f3550a = pendingIntent;
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 11 */            w11.m9409S(parcel, 1, this.f3550a, i, false);
/* 14 */            w11.m9428f0(iM9422c0, parcel);
                }
            }
