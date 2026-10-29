            package com.google.android.material.stateful;

            import android.os.Bundle;
            import android.os.Parcel;
            import android.os.Parcelable;
            import androidx.customview.view.AbsSavedState;
            import p000.C0198c;
            import p000.le2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 41 */    public class ExtendableSavedState extends AbsSavedState {
                public static final Parcelable.Creator<ExtendableSavedState> CREATOR = new C0198c(1);

                /* JADX INFO: renamed from: c */
                public final le2 f4941c;

                public ExtendableSavedState(Parcel parcel, ClassLoader classLoader) {
/* 1 */             super(parcel, classLoader);
/* 4 */             int i = parcel.readInt();
/* 8 */             String[] strArr = new String[i];
/* 10 */            parcel.readStringArray(strArr);
/* 13 */            Bundle[] bundleArr = new Bundle[i];
/* 17 */            parcel.readTypedArray(bundleArr, Bundle.CREATOR);
/* 25 */            this.f4941c = new le2(i);
/* 28 */            for (int i2 = 0; i2 < i; i2++) {
/* 36 */                this.f4941c.put(strArr[i2], bundleArr[i2]);
                    }
                }

                public final String toString() {
/* 34 */            return "ExtendableSavedState{" + Integer.toHexString(System.identityHashCode(this)) + " states=" + this.f4941c + "}";
                }

                @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 1 */             super.writeToParcel(parcel, i);
/* 4 */             le2 le2Var = this.f4941c;
/* 6 */             int i2 = le2Var.f13213c;
/* 8 */             parcel.writeInt(i2);
/* 11 */            String[] strArr = new String[i2];
/* 13 */            Bundle[] bundleArr = new Bundle[i2];
/* 17 */            for (int i3 = 0; i3 < i2; i3++) {
/* 25 */                strArr[i3] = (String) le2Var.m6428h(i3);
/* 33 */                bundleArr[i3] = (Bundle) le2Var.m6430j(i3);
                    }
/* 38 */            parcel.writeStringArray(strArr);
/* 41 */            parcel.writeTypedArray(bundleArr, 0);
                }

/* 42 */        public ExtendableSavedState(Parcelable parcelable) {
/* 43 */            super(parcelable);
/* 44 */            this.f4941c = new le2();
                }
            }
