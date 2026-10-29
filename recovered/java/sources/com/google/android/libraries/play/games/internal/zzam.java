            package com.google.android.libraries.play.games.internal;

            import android.os.Bundle;
            import android.os.Parcel;
            import android.os.Parcelable;
            import p000.qc3;
            import p000.qd3;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 10 */    public final class zzam implements Parcelable {
                public static final Parcelable.Creator<zzam> CREATOR;

                /* JADX INFO: renamed from: a */
                public final Bundle f4279a;

                static {
/* 3 */             new zzam();
/* 8 */             qc3.m7764q("com/google/android/libraries/play/logging/ulex/LogId");
/* 17 */            CREATOR = new qd3(0);
                }

                public zzam() {
/* 9 */             this.f4279a = new Bundle();
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
/* 1 */             return 0;
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             parcel.writeBundle(this.f4279a);
                }

/* 11 */        public /* synthetic */ zzam(Bundle bundle) {
                    this.f4279a = bundle;
                }
            }
