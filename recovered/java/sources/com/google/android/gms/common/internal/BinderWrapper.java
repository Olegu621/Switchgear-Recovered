            package com.google.android.gms.common.internal;

            import android.os.IBinder;
            import android.os.Parcel;
            import android.os.Parcelable;
            import p000.tf3;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 9 */     public final class BinderWrapper implements Parcelable {
                public static final Parcelable.Creator<BinderWrapper> CREATOR = new tf3(18);

                /* JADX INFO: renamed from: a */
                public final IBinder f3477a;

                public /* synthetic */ BinderWrapper(Parcel parcel) {
/* 8 */             this.f3477a = parcel.readStrongBinder();
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
/* 1 */             return 0;
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             parcel.writeStrongBinder(this.f3477a);
                }

/* 10 */        public BinderWrapper(IBinder iBinder) {
                    this.f3477a = iBinder;
                }
            }
