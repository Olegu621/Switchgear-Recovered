            package com.google.android.material.datepicker;

            import android.os.Parcel;
            import android.os.Parcelable;
            import java.util.ArrayList;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class CompositeDateValidator implements CalendarConstraints.DateValidator {

                /* JADX INFO: renamed from: a */
                public final InterfaceC0349f f4620a;

                /* JADX INFO: renamed from: b */
                public final ArrayList f4621b;

                /* JADX INFO: renamed from: c */
                public static final C0346c f4618c = new C0346c();

                /* JADX INFO: renamed from: d */
                public static final C0347d f4619d = new C0347d();
                public static final Parcelable.Creator<CompositeDateValidator> CREATOR = new C0348e();

                public CompositeDateValidator(ArrayList arrayList, InterfaceC0349f interfaceC0349f) {
/* 4 */             this.f4621b = arrayList;
/* 6 */             this.f4620a = interfaceC0349f;
                }

                @Override // com.google.android.material.datepicker.CalendarConstraints.DateValidator
                /* JADX INFO: renamed from: E0 */
                public final boolean mo2287E0(long j) {
/* 5 */             return this.f4620a.mo2306a(j, this.f4621b);
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
/* 1 */             return 0;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 35 */                return true;
                    }
/* 6 */             if (!(obj instanceof CompositeDateValidator)) {
/* 37 */                return false;
                    }
/* 9 */             CompositeDateValidator compositeDateValidator = (CompositeDateValidator) obj;
                    return this.f4621b.equals(compositeDateValidator.f4621b) && this.f4620a.getId() == compositeDateValidator.f4620a.getId();
                }

                public final int hashCode() {
/* 3 */             return this.f4621b.hashCode();
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             parcel.writeList(this.f4621b);
/* 12 */            parcel.writeInt(this.f4620a.getId());
                }
            }
