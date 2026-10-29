            package com.google.android.material.datepicker;

            import android.os.Parcel;
            import android.os.Parcelable;
            import java.util.ArrayList;
            
            /* JADX INFO: renamed from: com.google.android.material.datepicker.e */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C0348e implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
/* 7 */             ArrayList arrayList = parcel.readArrayList(CalendarConstraints.DateValidator.class.getClassLoader());
/* 11 */            int i = parcel.readInt();
/* 16 */            InterfaceC0349f interfaceC0349f = CompositeDateValidator.f4619d;
/* 18 */            if (i != 2 && i == 1) {
/* 24 */                interfaceC0349f = CompositeDateValidator.f4618c;
                    }
/* 28 */            arrayList.getClass();
/* 31 */            return new CompositeDateValidator(arrayList, interfaceC0349f);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
/* 1 */             return new CompositeDateValidator[i];
                }
            }
