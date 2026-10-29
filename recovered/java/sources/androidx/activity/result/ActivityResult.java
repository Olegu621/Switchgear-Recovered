            package androidx.activity.result;

            import android.content.Intent;
            import android.os.Parcel;
            import android.os.Parcelable;
            import p000.qd3;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 27 */    public final class ActivityResult implements Parcelable {
                public static final Parcelable.Creator<ActivityResult> CREATOR = new qd3(2);

                /* JADX INFO: renamed from: a */
                public final int f351a;

                /* JADX INFO: renamed from: b */
                public final Intent f352b;

                public ActivityResult(Parcel parcel) {
/* 8 */             this.f351a = parcel.readInt();
/* 26 */            this.f352b = parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel);
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
/* 1 */             return 0;
                }

                public final String toString() {
                    String strValueOf;
/* 5 */             StringBuilder sb = new StringBuilder("ActivityResult{resultCode=");
/* 9 */             int i = this.f351a;
/* 11 */            if (i != -1) {
/* 20 */                strValueOf = i != 0 ? String.valueOf(i) : "RESULT_CANCELED";
                    } else {
/* 23 */                strValueOf = "RESULT_OK";
                    }
/* 25 */            sb.append(strValueOf);
/* 30 */            sb.append(", data=");
/* 35 */            sb.append(this.f352b);
/* 40 */            sb.append('}');
/* 43 */            return sb.toString();
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             parcel.writeInt(this.f351a);
/* 6 */             Intent intent = this.f352b;
/* 13 */            parcel.writeInt(intent == null ? 0 : 1);
/* 16 */            if (intent != null) {
/* 18 */                intent.writeToParcel(parcel, i);
                    }
                }

/* 28 */        public ActivityResult(int i, Intent intent) {
/* 30 */            this.f351a = i;
/* 31 */            this.f352b = intent;
                }
            }
