            package androidx.customview.view;

            import android.os.Parcel;
            import android.os.Parcelable;
            import p000.C0198c;
            import p000.C1951n4;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 20 */    public abstract class AbsSavedState implements Parcelable {

                /* JADX INFO: renamed from: a */
                public final Parcelable f1292a;

                /* JADX INFO: renamed from: b */
                public static final AbsSavedState f1291b = new C00831();
                public static final Parcelable.Creator<AbsSavedState> CREATOR = new C0198c(0);

                /* JADX INFO: renamed from: androidx.customview.view.AbsSavedState$1 */
                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public class C00831 extends AbsSavedState {
                }

                public AbsSavedState(Parcelable parcelable) {
/* 5 */             if (parcelable != null) {
/* 13 */                this.f1292a = parcelable == f1291b ? null : parcelable;
                    } else {
/* 18 */                C1951n4.m6859j("superState must not be null");
/* 21 */                throw null;
                    }
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
/* 1 */             return 0;
                }

                @Override // android.os.Parcelable
                public void writeToParcel(Parcel parcel, int i) {
/* 3 */             parcel.writeParcelable(this.f1292a, i);
                }

/* 21 */        public AbsSavedState() {
/* 23 */            this.f1292a = null;
                }

/* 23 */        public AbsSavedState(Parcel parcel, ClassLoader classLoader) {
/* 25 */            Parcelable parcelable = parcel.readParcelable(classLoader);
/* 26 */            this.f1292a = parcelable == null ? f1291b : parcelable;
                }
            }
