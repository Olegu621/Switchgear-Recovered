            package com.google.android.libraries.play.games.internal;

            import android.os.Parcel;
            import android.os.Parcelable;
            import p000.re3;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzcn implements Parcelable {
                public static final Parcelable.Creator<zzcn> CREATOR = new re3(23);

                /* JADX INFO: renamed from: a */
                public final long f4283a;

                public zzcn(long j) {
/* 4 */             this.f4283a = j;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
/* 1 */             return 0;
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             parcel.writeLong(this.f4283a);
                }
            }
