            package androidx.activity.result;

            import android.content.Intent;
            import android.content.IntentSender;
            import android.os.Parcel;
            import android.os.Parcelable;
            import kotlin.Metadata;
            import p000.qd3;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            @Metadata(m6175d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m6176d2 = {"Landroidx/activity/result/IntentSenderRequest;", "Landroid/os/Parcelable;", "activity_release"}, m6177k = 1, m6178mv = {1, 8, 0}, m6180xi = 48)
            public final class IntentSenderRequest implements Parcelable {
                public static final Parcelable.Creator<IntentSenderRequest> CREATOR = new qd3(6);

                /* JADX INFO: renamed from: a */
                public final IntentSender f353a;

                /* JADX INFO: renamed from: b */
                public final Intent f354b;

                /* JADX INFO: renamed from: c */
                public final int f355c;

                /* JADX INFO: renamed from: d */
                public final int f356d;

                public IntentSenderRequest(IntentSender intentSender, Intent intent, int i, int i2) {
/* 1 */             intentSender.getClass();
/* 7 */             this.f353a = intentSender;
/* 9 */             this.f354b = intent;
/* 11 */            this.f355c = i;
/* 13 */            this.f356d = i2;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
/* 1 */             return 0;
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 1 */             parcel.getClass();
/* 6 */             parcel.writeParcelable(this.f353a, i);
/* 11 */            parcel.writeParcelable(this.f354b, i);
/* 16 */            parcel.writeInt(this.f355c);
/* 21 */            parcel.writeInt(this.f356d);
                }
            }
